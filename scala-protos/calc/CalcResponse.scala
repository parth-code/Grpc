// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package calc

/** The response message containing the greetings
  */
@SerialVersionUID(0L)
final case class CalcResponse(
    number1: _root_.scala.Double = 0.0,
    number2: _root_.scala.Double = 0.0,
    result: _root_.scala.Double = 0.0,
    errormessage: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[CalcResponse] with scalapb.lenses.Updatable[CalcResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = number1
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(1, __value)
        }
      };
      
      {
        val __value = number2
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(2, __value)
        }
      };
      
      {
        val __value = result
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(3, __value)
        }
      };
      
      {
        val __value = errormessage
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = number1
        if (__v != 0.0) {
          _output__.writeDouble(1, __v)
        }
      };
      {
        val __v = number2
        if (__v != 0.0) {
          _output__.writeDouble(2, __v)
        }
      };
      {
        val __v = result
        if (__v != 0.0) {
          _output__.writeDouble(3, __v)
        }
      };
      {
        val __v = errormessage
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): calc.CalcResponse = {
      var __number1 = this.number1
      var __number2 = this.number2
      var __result = this.result
      var __errormessage = this.errormessage
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 9 =>
            __number1 = _input__.readDouble()
          case 17 =>
            __number2 = _input__.readDouble()
          case 25 =>
            __result = _input__.readDouble()
          case 34 =>
            __errormessage = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      calc.CalcResponse(
          number1 = __number1,
          number2 = __number2,
          result = __result,
          errormessage = __errormessage
      )
    }
    def withNumber1(__v: _root_.scala.Double): CalcResponse = copy(number1 = __v)
    def withNumber2(__v: _root_.scala.Double): CalcResponse = copy(number2 = __v)
    def withResult(__v: _root_.scala.Double): CalcResponse = copy(result = __v)
    def withErrormessage(__v: _root_.scala.Predef.String): CalcResponse = copy(errormessage = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = number1
          if (__t != 0.0) __t else null
        }
        case 2 => {
          val __t = number2
          if (__t != 0.0) __t else null
        }
        case 3 => {
          val __t = result
          if (__t != 0.0) __t else null
        }
        case 4 => {
          val __t = errormessage
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PDouble(number1)
        case 2 => _root_.scalapb.descriptors.PDouble(number2)
        case 3 => _root_.scalapb.descriptors.PDouble(result)
        case 4 => _root_.scalapb.descriptors.PString(errormessage)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = calc.CalcResponse
}

object CalcResponse extends scalapb.GeneratedMessageCompanion[calc.CalcResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[calc.CalcResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): calc.CalcResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    calc.CalcResponse(
      __fieldsMap.getOrElse(__fields.get(0), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(1), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(2), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[calc.CalcResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      calc.CalcResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CalcProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CalcProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = calc.CalcResponse(
  )
  implicit class CalcResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, calc.CalcResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, calc.CalcResponse](_l) {
    def number1: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.number1)((c_, f_) => c_.copy(number1 = f_))
    def number2: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.number2)((c_, f_) => c_.copy(number2 = f_))
    def result: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.result)((c_, f_) => c_.copy(result = f_))
    def errormessage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.errormessage)((c_, f_) => c_.copy(errormessage = f_))
  }
  final val NUMBER1_FIELD_NUMBER = 1
  final val NUMBER2_FIELD_NUMBER = 2
  final val RESULT_FIELD_NUMBER = 3
  final val ERRORMESSAGE_FIELD_NUMBER = 4
}