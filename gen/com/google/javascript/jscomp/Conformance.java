// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conformance.proto

package com.google.javascript.jscomp;

public final class Conformance {
  private Conformance() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_ConformanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_ConformanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_Requirement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_Requirement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021conformance.proto\022\006jscomp\"=\n\021Conforman" +
      "ceConfig\022(\n\013requirement\030\001 \003(\0132\023.jscomp.R" +
      "equirement\"\371\006\n\013Requirement\022\025\n\rerror_mess" +
      "age\030\001 \001(\t\022\021\n\twhitelist\030\002 \003(\t\022\030\n\020whitelis" +
      "t_regexp\030\003 \003(\t\022\025\n\ronly_apply_to\030\004 \003(\t\022\034\n" +
      "\024only_apply_to_regexp\030\005 \003(\t\022&\n\004type\030\006 \001(" +
      "\0162\030.jscomp.Requirement.Type\022\r\n\005value\030\007 \003" +
      "(\t\022O\n\026type_matching_strategy\030\r \001(\0162(.jsc" +
      "omp.Requirement.TypeMatchingStrategy:\005LO" +
      "OSE\022\022\n\njava_class\030\010 \001(\t\022\017\n\007rule_id\030\t \001(\t",
      "\022\017\n\007extends\030\n \001(\t\022*\n\034report_loose_type_v" +
      "iolations\030\013 \001(\010:\004true\0227\n\010severity\030\014 \001(\0162" +
      "\034.jscomp.Requirement.Severity:\007WARNING\"\253" +
      "\002\n\004Type\022\n\n\006CUSTOM\020\001\022\025\n\021BANNED_DEPENDENCY" +
      "\020\002\022\017\n\013BANNED_NAME\020\003\022\023\n\017BANNED_PROPERTY\020\004" +
      "\022\030\n\024BANNED_PROPERTY_READ\020\005\022\031\n\025BANNED_PRO" +
      "PERTY_WRITE\020\006\022\030\n\024RESTRICTED_NAME_CALL\020\007\022" +
      "\032\n\026RESTRICTED_METHOD_CALL\020\010\022\027\n\023BANNED_CO" +
      "DE_PATTERN\020\t\022\030\n\024BANNED_PROPERTY_CALL\020\n\022&" +
      "\n\"BANNED_PROPERTY_NON_CONSTANT_WRITE\020\013\022\024",
      "\n\020BANNED_NAME_CALL\020\014\"_\n\024TypeMatchingStra" +
      "tegy\022\013\n\007UNKNOWN\020\000\022\t\n\005LOOSE\020\001\022\026\n\022STRICT_N" +
      "ULLABILITY\020\002\022\014\n\010SUBTYPES\020\003\022\t\n\005EXACT\020\004\"3\n" +
      "\010Severity\022\017\n\013UNSPECIFIED\020\000\022\013\n\007WARNING\020\001\022" +
      "\t\n\005ERROR\020\002*\n\010\300\204=\020\200\200\200\200\002B \n\034com.google.jav" +
      "ascript.jscompP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_jscomp_ConformanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_jscomp_ConformanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_ConformanceConfig_descriptor,
        new java.lang.String[] { "Requirement", });
    internal_static_jscomp_Requirement_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_jscomp_Requirement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_Requirement_descriptor,
        new java.lang.String[] { "ErrorMessage", "Whitelist", "WhitelistRegexp", "OnlyApplyTo", "OnlyApplyToRegexp", "Type", "Value", "TypeMatchingStrategy", "JavaClass", "RuleId", "Extends", "ReportLooseTypeViolations", "Severity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
