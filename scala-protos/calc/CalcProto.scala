// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package calc

object CalcProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    calc.CalcQuery,
    calc.CalcResponse
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CgpjYWxjLnByb3RvIj8KCUNhbGNRdWVyeRIYCgdudW1iZXIxGAEgASgBUgdudW1iZXIxEhgKB251bWJlcjIYAiABKAFSB251b
  WJlcjIifgoMQ2FsY1Jlc3BvbnNlEhgKB251bWJlcjEYASABKAFSB251bWJlcjESGAoHbnVtYmVyMhgCIAEoAVIHbnVtYmVyMhIWC
  gZyZXN1bHQYAyABKAFSBnJlc3VsdBIiCgxlcnJvcm1lc3NhZ2UYBCABKAlSDGVycm9ybWVzc2FnZTKpAQoKQ2FsY3VsYXRvchIiC
  gNBZGQSCi5DYWxjUXVlcnkaDS5DYWxjUmVzcG9uc2UiABInCghTdWJ0cmFjdBIKLkNhbGNRdWVyeRoNLkNhbGNSZXNwb25zZSIAE
  icKCE11bHRpcGx5EgouQ2FsY1F1ZXJ5Gg0uQ2FsY1Jlc3BvbnNlIgASJQoGRGl2aWRlEgouQ2FsY1F1ZXJ5Gg0uQ2FsY1Jlc3Bvb
  nNlIgBiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}