// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package com.cybage.calculator;

public final class Calculator {
  private Calculator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_Input_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_Input_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_Output_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_Output_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020calculator.proto\022\ncalculator\"\027\n\005Input\022" +
      "\016\n\006number\030\001 \001(\005\"\030\n\006Output\022\016\n\006result\030\001 \001(" +
      "\0032\370\001\n\021CalculatorService\0228\n\rfindFactorial" +
      "\022\021.calculator.Input\032\022.calculator.Output\"" +
      "\000\022:\n\rgetAllFactors\022\021.calculator.Input\032\022." +
      "calculator.Output\"\0000\001\0223\n\006sumAll\022\021.calcul" +
      "ator.Input\032\022.calculator.Output\"\000(\001\0228\n\tfi" +
      "ndPrime\022\021.calculator.Input\032\022.calculator." +
      "Output\"\000(\0010\001B\031\n\025com.cybage.calculatorP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_Input_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_Input_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_Input_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_Output_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_Output_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_Output_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}