package calc

object CalculatorGrpc {
  val METHOD_ADD: _root_.io.grpc.MethodDescriptor[calc.CalcQuery, calc.CalcResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("Calculator", "Add"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcQuery])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcResponse])
      .build()
  
  val METHOD_SUBTRACT: _root_.io.grpc.MethodDescriptor[calc.CalcQuery, calc.CalcResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("Calculator", "Subtract"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcQuery])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcResponse])
      .build()
  
  val METHOD_MULTIPLY: _root_.io.grpc.MethodDescriptor[calc.CalcQuery, calc.CalcResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("Calculator", "Multiply"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcQuery])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcResponse])
      .build()
  
  val METHOD_DIVIDE: _root_.io.grpc.MethodDescriptor[calc.CalcQuery, calc.CalcResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("Calculator", "Divide"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcQuery])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[calc.CalcResponse])
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("Calculator")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(calc.CalcProto.javaDescriptor))
      .addMethod(METHOD_ADD)
      .addMethod(METHOD_SUBTRACT)
      .addMethod(METHOD_MULTIPLY)
      .addMethod(METHOD_DIVIDE)
      .build()
  
  trait Calculator extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = Calculator
    def add(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse]
    def subtract(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse]
    def multiply(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse]
    def divide(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse]
  }
  
  object Calculator extends _root_.scalapb.grpc.ServiceCompanion[Calculator] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[Calculator] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = calc.CalcProto.javaDescriptor.getServices().get(0)
  }
  
  trait CalculatorBlockingClient {
    def serviceCompanion = Calculator
    def add(request: calc.CalcQuery): calc.CalcResponse
    def subtract(request: calc.CalcQuery): calc.CalcResponse
    def multiply(request: calc.CalcQuery): calc.CalcResponse
    def divide(request: calc.CalcQuery): calc.CalcResponse
  }
  
  class CalculatorBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[CalculatorBlockingStub](channel, options) with CalculatorBlockingClient {
    override def add(request: calc.CalcQuery): calc.CalcResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_ADD, options, request)
    }
    
    override def subtract(request: calc.CalcQuery): calc.CalcResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SUBTRACT, options, request)
    }
    
    override def multiply(request: calc.CalcQuery): calc.CalcResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_MULTIPLY, options, request)
    }
    
    override def divide(request: calc.CalcQuery): calc.CalcResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DIVIDE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): CalculatorBlockingStub = new CalculatorBlockingStub(channel, options)
  }
  
  class CalculatorStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[CalculatorStub](channel, options) with Calculator {
    override def add(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_ADD, options, request)
    }
    
    override def subtract(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SUBTRACT, options, request)
    }
    
    override def multiply(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_MULTIPLY, options, request)
    }
    
    override def divide(request: calc.CalcQuery): scala.concurrent.Future[calc.CalcResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DIVIDE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): CalculatorStub = new CalculatorStub(channel, options)
  }
  
  def bindService(serviceImpl: Calculator, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_ADD,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[calc.CalcQuery, calc.CalcResponse] {
        override def invoke(request: calc.CalcQuery, observer: _root_.io.grpc.stub.StreamObserver[calc.CalcResponse]): Unit =
          serviceImpl.add(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_SUBTRACT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[calc.CalcQuery, calc.CalcResponse] {
        override def invoke(request: calc.CalcQuery, observer: _root_.io.grpc.stub.StreamObserver[calc.CalcResponse]): Unit =
          serviceImpl.subtract(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_MULTIPLY,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[calc.CalcQuery, calc.CalcResponse] {
        override def invoke(request: calc.CalcQuery, observer: _root_.io.grpc.stub.StreamObserver[calc.CalcResponse]): Unit =
          serviceImpl.multiply(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_DIVIDE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[calc.CalcQuery, calc.CalcResponse] {
        override def invoke(request: calc.CalcQuery, observer: _root_.io.grpc.stub.StreamObserver[calc.CalcResponse]): Unit =
          serviceImpl.divide(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): CalculatorBlockingStub = new CalculatorBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): CalculatorStub = new CalculatorStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = calc.CalcProto.javaDescriptor.getServices().get(0)
  
}