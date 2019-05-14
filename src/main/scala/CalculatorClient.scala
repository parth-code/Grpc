import java.util.concurrent.TimeUnit
import java.util.logging.{Level, Logger}

import calc.CalcQuery
import com.typesafe.config.ConfigFactory
import io.grpc.{ManagedChannel, ManagedChannelBuilder, StatusRuntimeException}
import scalaj.http.{Http, HttpOptions}

/**
  * Client side of Grpc. Handles providing requests and taking replies and
  * showing them via logging
  * @param channel for controlling client state
  * @param blockingStub synchronous communication function
  */
class CalculatorClient(channel:ManagedChannel, blockingStub: CalculatorBlockingStub)  {
  val logger:Logger = Logger.getLogger(classOf[CalculatorClient].getName)
// for synchronous communication.
  def shutdown(): Unit = channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
//  Used to store M values. In this implementation, M is always client side.
  var last_result = 0.0
//  Calls lambda function to add the 2 numbers
  def addition(a:Double, b:Double) = {
    val request = CalcQuery(a, b, "+")
    val result = blockingStub.add(request)
    logger.info(result.number1+" - "+result.number2+" = "+result.result)
    set_lastresult(result.result)
  }
//  Calls lambda function to subtract the 2 numbers
  def subtract(a:Double, b:Double) = {
    val request = CalcQuery(a, b, "-")
    val result = blockingStub.subtract(request)
    logger.info(result.number1+" - "+result.number2+" =  "+result.result)
    set_lastresult(result.result)
  }
//  Calls lambda function to multiply the 2 numbers
  def multiply(a:Double, b:Double) = {
    val request = CalcQuery(a, b, "*")
    val result = blockingStub.multiply(request)
    logger.info(result.number1+" * "+result.number2+" =  "+result.result)
    set_lastresult(result.result)
  }
//  Calls lambda function to divide the 2 numbers
  def divide(a:Double, b:Double) = {
    val request = CalcQuery(a, b, "/")
    val result = blockingStub.divide(request) //this is the stub for code to send
    if (b != 0){
      logger.info(result.number1+" / "+result.number2+" =  "+result.result)
      set_lastresult(result.result)
    } else {
      logger.info(result.errormessage)
      set_lastresult(0)
    }
  }
//  Calls lambda function to add the 2 numbers
//  one of which is the stored number
  def m_plus(a:Double) = {
    addition(get_lastresult(), a)
  }
  //  Calls lambda function to subtract the 2 numbers,
  //  one of which is the stored number
  def m_minus(a:Double): Unit ={
    subtract(get_lastresult(), a)
  }
//  Clears stored number
  def m_clear() = {
    set_lastresult(0)
  }
// Getters and setters for local variable M
  def get_lastresult(): Double ={
    last_result
  }

  def set_lastresult(a:Double) = {
    last_result = a
  }
//Doesn't work. Http Requests
//  def send_request(data: CalcQuery) = {
//    val result:Array[Byte] = Http("http://example.com/url").postData(CalcQuery.toByteArray(data))
//      .header("Content-Type", "application/octet-stream")
//      .header("Charset", "UTF-8")
//      .asBytes.body
//  }
}
object CalculatorClient extends App {
  val config = ConfigFactory.load()
  val logger = Logger.getLogger(getClass.getName)

  def apply(host: String, port: Int): CalculatorClient = {
    val channel = ManagedChannelBuilder
      .forAddress(config.getString("host"), config.getInt("port"))
      .usePlaintext()
      .build
    val blockingStub = CalculatorGrpc.blockingStub(channel)
    new CalculatorClient(channel, blockingStub)
  }

  override def main(args: Array[String]): Unit = {
    val client = CalculatorClient("localhost", 50051)
    try {
      val a = args(0).toDouble
      val b = args(1).toDouble
      client.addition(a, b)
      client.subtract(a,b)
      client.multiply(a, b)
      client.divide(a, b)
      client.m_plus(a)
      client.m_clear()
      client.m_minus(b)
    } catch {
      case e: StatusRuntimeException =>
        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus)
    } finally {
      client.shutdown()
    }
  }
}
