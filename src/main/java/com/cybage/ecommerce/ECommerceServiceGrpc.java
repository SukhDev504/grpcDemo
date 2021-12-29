package com.cybage.ecommerce;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ecommerce.proto")
public final class ECommerceServiceGrpc {

  private ECommerceServiceGrpc() {}

  public static final String SERVICE_NAME = "ecommerce.ECommerceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cybage.ecommerce.OrderRequest,
      com.cybage.ecommerce.OrderResponse> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "placeOrder",
      requestType = com.cybage.ecommerce.OrderRequest.class,
      responseType = com.cybage.ecommerce.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.cybage.ecommerce.OrderRequest,
      com.cybage.ecommerce.OrderResponse> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.cybage.ecommerce.OrderRequest, com.cybage.ecommerce.OrderResponse> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = ECommerceServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (ECommerceServiceGrpc.class) {
        if ((getPlaceOrderMethod = ECommerceServiceGrpc.getPlaceOrderMethod) == null) {
          ECommerceServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod = 
              io.grpc.MethodDescriptor.<com.cybage.ecommerce.OrderRequest, com.cybage.ecommerce.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ecommerce.ECommerceService", "placeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cybage.ecommerce.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cybage.ecommerce.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ECommerceServiceMethodDescriptorSupplier("placeOrder"))
                  .build();
          }
        }
     }
     return getPlaceOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ECommerceServiceStub newStub(io.grpc.Channel channel) {
    return new ECommerceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ECommerceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ECommerceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ECommerceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ECommerceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ECommerceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public void placeOrder(com.cybage.ecommerce.OrderRequest request,
        io.grpc.stub.StreamObserver<com.cybage.ecommerce.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrderMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.cybage.ecommerce.OrderRequest,
                com.cybage.ecommerce.OrderResponse>(
                  this, METHODID_PLACE_ORDER)))
          .build();
    }

  }

  /**
   */
  public static final class ECommerceServiceStub extends io.grpc.stub.AbstractStub<ECommerceServiceStub> {
    private ECommerceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ECommerceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ECommerceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ECommerceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public void placeOrder(com.cybage.ecommerce.OrderRequest request,
        io.grpc.stub.StreamObserver<com.cybage.ecommerce.OrderResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ECommerceServiceBlockingStub extends io.grpc.stub.AbstractStub<ECommerceServiceBlockingStub> {
    private ECommerceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ECommerceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ECommerceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ECommerceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public java.util.Iterator<com.cybage.ecommerce.OrderResponse> placeOrder(
        com.cybage.ecommerce.OrderRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ECommerceServiceFutureStub extends io.grpc.stub.AbstractStub<ECommerceServiceFutureStub> {
    private ECommerceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ECommerceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ECommerceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ECommerceServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ECommerceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ECommerceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((com.cybage.ecommerce.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.cybage.ecommerce.OrderResponse>) responseObserver);
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

  private static abstract class ECommerceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ECommerceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cybage.ecommerce.Ecommerce.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ECommerceService");
    }
  }

  private static final class ECommerceServiceFileDescriptorSupplier
      extends ECommerceServiceBaseDescriptorSupplier {
    ECommerceServiceFileDescriptorSupplier() {}
  }

  private static final class ECommerceServiceMethodDescriptorSupplier
      extends ECommerceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ECommerceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ECommerceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ECommerceServiceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
