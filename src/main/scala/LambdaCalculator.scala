import java.io.InputStream

import calc.{CalcQuery, CalcResponse}


class LambdaCalculator {
//  def intake(b:InputStream): Unit ={
//    val request: CalcQuery = CalcQuery.parseFrom(b)
//    choose(request)
//  }
//  def choose(request: CalcQuery): Unit ={
//    if(request.operator == "+"){
//      add(request)
//    }
//    if(request.operator == "-"){
//      subtract(request)
//    }
//    if(request.operator == "*"){
//      multiply(request)
//    }
//    else{
//      divide(request)
//    }
//  }
  def add(request: CalcQuery) = {
    val reply =
      CalcResponse(request.number1, request.number2, request.number1 + request.number2)
        .toByteString
    reply
  }
  def subtract(request: CalcQuery) ={
    val reply =
      CalcResponse(request.number1, request.number2, request.number1 - request.number2)
        .toByteString
    reply
  }
  def multiply(request: CalcQuery) ={
    val reply =
      CalcResponse(request.number1, request.number2, request.number1 * request.number2)
      .toByteString
    reply
  }
  def divide(request: CalcQuery) = {
    val reply = if (request.number2 == 0) {
        CalcResponse(request.number1, request.number2, 0.0, "Arithmetic Exception")
      }
    else{
        CalcResponse(request.number1, request.number2, request.number1 / request.number2)
    }
    reply.toByteString
  }
}
