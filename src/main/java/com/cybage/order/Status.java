// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.cybage.order;

/**
 * Protobuf enum {@code order.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PENDING = 0;</code>
   */
  PENDING(0),
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  IN_PROGRESS(1),
  /**
   * <code>SUCCESS = 2;</code>
   */
  SUCCESS(2),
  /**
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PENDING = 0;</code>
   */
  public static final int PENDING_VALUE = 0;
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  public static final int IN_PROGRESS_VALUE = 1;
  /**
   * <code>SUCCESS = 2;</code>
   */
  public static final int SUCCESS_VALUE = 2;
  /**
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return PENDING;
      case 1: return IN_PROGRESS;
      case 2: return SUCCESS;
      case 3: return FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.cybage.order.Order.getDescriptor().getEnumTypes().get(0);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:order.Status)
}

