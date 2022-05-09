package example1.grpc.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 服务定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: IdentityInfo.proto")
public final class IdentityInfoServiceGrpc {

  private IdentityInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "example1.IdentityInfoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddIdentityInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> METHOD_ADD_IDENTITY_INFO = getAddIdentityInfoMethod();

  private static volatile io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> getAddIdentityInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> getAddIdentityInfoMethod() {
    io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo, example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> getAddIdentityInfoMethod;
    if ((getAddIdentityInfoMethod = IdentityInfoServiceGrpc.getAddIdentityInfoMethod) == null) {
      synchronized (IdentityInfoServiceGrpc.class) {
        if ((getAddIdentityInfoMethod = IdentityInfoServiceGrpc.getAddIdentityInfoMethod) == null) {
          IdentityInfoServiceGrpc.getAddIdentityInfoMethod = getAddIdentityInfoMethod = 
              io.grpc.MethodDescriptor.<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo, example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example1.IdentityInfoService", "addIdentityInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId.getDefaultInstance()))
                  .setSchemaDescriptor(new IdentityInfoServiceMethodDescriptorSupplier("addIdentityInfo"))
                  .build();
          }
        }
     }
     return getAddIdentityInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> METHOD_GET_INFO = getGetInfoMethod();

  private static volatile io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> getGetInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId,
      example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> getGetInfoMethod() {
    io.grpc.MethodDescriptor<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId, example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> getGetInfoMethod;
    if ((getGetInfoMethod = IdentityInfoServiceGrpc.getGetInfoMethod) == null) {
      synchronized (IdentityInfoServiceGrpc.class) {
        if ((getGetInfoMethod = IdentityInfoServiceGrpc.getGetInfoMethod) == null) {
          IdentityInfoServiceGrpc.getGetInfoMethod = getGetInfoMethod = 
              io.grpc.MethodDescriptor.<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId, example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example1.IdentityInfoService", "getInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new IdentityInfoServiceMethodDescriptorSupplier("getInfo"))
                  .build();
          }
        }
     }
     return getGetInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityInfoServiceStub newStub(io.grpc.Channel channel) {
    return new IdentityInfoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IdentityInfoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IdentityInfoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 服务定义
   * </pre>
   */
  public static abstract class IdentityInfoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 远程方法
     * </pre>
     */
    public void addIdentityInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo request,
        io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> responseObserver) {
      asyncUnimplementedUnaryCall(getAddIdentityInfoMethod(), responseObserver);
    }

    /**
     */
    public void getInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId request,
        io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddIdentityInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo,
                example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId>(
                  this, METHODID_ADD_IDENTITY_INFO)))
          .addMethod(
            getGetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId,
                example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo>(
                  this, METHODID_GET_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * 服务定义
   * </pre>
   */
  public static final class IdentityInfoServiceStub extends io.grpc.stub.AbstractStub<IdentityInfoServiceStub> {
    private IdentityInfoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityInfoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityInfoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程方法
     * </pre>
     */
    public void addIdentityInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo request,
        io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddIdentityInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId request,
        io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 服务定义
   * </pre>
   */
  public static final class IdentityInfoServiceBlockingStub extends io.grpc.stub.AbstractStub<IdentityInfoServiceBlockingStub> {
    private IdentityInfoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityInfoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityInfoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程方法
     * </pre>
     */
    public example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId addIdentityInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo request) {
      return blockingUnaryCall(
          getChannel(), getAddIdentityInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo getInfo(example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 服务定义
   * </pre>
   */
  public static final class IdentityInfoServiceFutureStub extends io.grpc.stub.AbstractStub<IdentityInfoServiceFutureStub> {
    private IdentityInfoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityInfoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityInfoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityInfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId> addIdentityInfo(
        example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getAddIdentityInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo> getInfo(
        example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_IDENTITY_INFO = 0;
  private static final int METHODID_GET_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IdentityInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentityInfoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_IDENTITY_INFO:
          serviceImpl.addIdentityInfo((example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo) request,
              (io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId>) responseObserver);
          break;
        case METHODID_GET_INFO:
          serviceImpl.getInfo((example1.grpc.pb.IdentityInfoOuterClass.IdentityInfoId) request,
              (io.grpc.stub.StreamObserver<example1.grpc.pb.IdentityInfoOuterClass.IdentityInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IdentityInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example1.grpc.pb.IdentityInfoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityInfoService");
    }
  }

  private static final class IdentityInfoServiceFileDescriptorSupplier
      extends IdentityInfoServiceBaseDescriptorSupplier {
    IdentityInfoServiceFileDescriptorSupplier() {}
  }

  private static final class IdentityInfoServiceMethodDescriptorSupplier
      extends IdentityInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentityInfoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IdentityInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityInfoServiceFileDescriptorSupplier())
              .addMethod(getAddIdentityInfoMethod())
              .addMethod(getGetInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
