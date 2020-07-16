/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V2beta1Autoscaling {
  private V2beta1Autoscaling() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface CrossVersionObjectReferenceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    java.lang.String getKind();
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    com.google.protobuf.ByteString getKindBytes();

    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    boolean hasApiVersion();
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    java.lang.String getApiVersion();
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    com.google.protobuf.ByteString getApiVersionBytes();
  }
  /**
   *
   *
   * <pre>
   * CrossVersionObjectReference contains enough information to let you identify the referred resource.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference}
   */
  public static final class CrossVersionObjectReference
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference)
      CrossVersionObjectReferenceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CrossVersionObjectReference.newBuilder() to construct.
    private CrossVersionObjectReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CrossVersionObjectReference() {
      kind_ = "";
      name_ = "";
      apiVersion_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CrossVersionObjectReference(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                kind_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                name_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                apiVersion_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
                  .class);
    }

    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    private volatile java.lang.Object kind_;
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APIVERSION_FIELD_NUMBER = 3;
    private volatile java.lang.Object apiVersion_;
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public boolean hasApiVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public java.lang.String getApiVersion() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          apiVersion_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public com.google.protobuf.ByteString getApiVersionBytes() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, apiVersion_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, apiVersion_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference) obj;

      boolean result = true;
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasApiVersion() == other.hasApiVersion());
      if (hasApiVersion()) {
        result = result && getApiVersion().equals(other.getApiVersion());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasApiVersion()) {
        hash = (37 * hash) + APIVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getApiVersion().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CrossVersionObjectReference contains enough information to let you identify the referred resource.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference)
        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        apiVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
          buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.apiVersion_ = apiVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                .getDefaultInstance()) return this;
        if (other.hasKind()) {
          bitField0_ |= 0x00000001;
          kind_ = other.kind_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasApiVersion()) {
          bitField0_ |= 0x00000004;
          apiVersion_ = other.apiVersion_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object kind_ = "";
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public com.google.protobuf.ByteString getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKind(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKindBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object apiVersion_ = "";
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public boolean hasApiVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public java.lang.String getApiVersion() {
        java.lang.Object ref = apiVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            apiVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public com.google.protobuf.ByteString getApiVersionBytes() {
        java.lang.Object ref = apiVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          apiVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder setApiVersion(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        apiVersion_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder clearApiVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        apiVersion_ = getDefaultInstance().getApiVersion();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder setApiVersionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        apiVersion_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CrossVersionObjectReference> PARSER =
        new com.google.protobuf.AbstractParser<CrossVersionObjectReference>() {
          @java.lang.Override
          public CrossVersionObjectReference parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CrossVersionObjectReference(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CrossVersionObjectReference> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrossVersionObjectReference> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ExternalMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    boolean hasMetricSelector();
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector();
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    boolean hasTargetValue();
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getTargetValue();
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder();

    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    boolean hasTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ExternalMetricSource indicates how to scale on a metric not associated with
   * any Kubernetes object (for example length of queue in cloud
   * messaging service, or QPS from loadbalancer running outside of cluster).
   * Exactly one "target" type should be set.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ExternalMetricSource}
   */
  public static final class ExternalMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ExternalMetricSource)
      ExternalMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalMetricSource.newBuilder() to construct.
    private ExternalMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalMetricSource() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                metricName_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = metricSelector_.toBuilder();
                }
                metricSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metricSelector_);
                  metricSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = targetValue_.toBuilder();
                }
                targetValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(targetValue_);
                  targetValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = targetAverageValue_.toBuilder();
                }
                targetAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(targetAverageValue_);
                  targetAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int METRICNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METRICSELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector metricSelector_;
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public boolean hasMetricSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector() {
      return metricSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : metricSelector_;
    }
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder() {
      return metricSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : metricSelector_;
    }

    public static final int TARGETVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity targetValue_;
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public boolean hasTargetValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getTargetValue() {
      return targetValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetValue_;
    }
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * Mutually exclusive with TargetAverageValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder() {
      return targetValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetValue_;
    }

    public static final int TARGETAVERAGEVALUE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_;
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    public boolean hasTargetAverageValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * Mutually exclusive with TargetValue.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getMetricSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getTargetValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getTargetAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetricSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(4, getTargetAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource) obj;

      boolean result = true;
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasMetricSelector() == other.hasMetricSelector());
      if (hasMetricSelector()) {
        result = result && getMetricSelector().equals(other.getMetricSelector());
      }
      result = result && (hasTargetValue() == other.hasTargetValue());
      if (hasTargetValue()) {
        result = result && getTargetValue().equals(other.getTargetValue());
      }
      result = result && (hasTargetAverageValue() == other.hasTargetAverageValue());
      if (hasTargetAverageValue()) {
        result = result && getTargetAverageValue().equals(other.getTargetAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasMetricSelector()) {
        hash = (37 * hash) + METRICSELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getMetricSelector().hashCode();
      }
      if (hasTargetValue()) {
        hash = (37 * hash) + TARGETVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTargetValue().hashCode();
      }
      if (hasTargetAverageValue()) {
        hash = (37 * hash) + TARGETAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTargetAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExternalMetricSource indicates how to scale on a metric not associated with
     * any Kubernetes object (for example length of queue in cloud
     * messaging service, or QPS from loadbalancer running outside of cluster).
     * Exactly one "target" type should be set.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ExternalMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ExternalMetricSource)
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricSelectorFieldBuilder();
          getTargetValueFieldBuilder();
          getTargetAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = null;
        } else {
          metricSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (targetValueBuilder_ == null) {
          targetValue_ = null;
        } else {
          targetValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (metricSelectorBuilder_ == null) {
          result.metricSelector_ = metricSelector_;
        } else {
          result.metricSelector_ = metricSelectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (targetValueBuilder_ == null) {
          result.targetValue_ = targetValue_;
        } else {
          result.targetValue_ = targetValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (targetAverageValueBuilder_ == null) {
          result.targetAverageValue_ = targetAverageValue_;
        } else {
          result.targetAverageValue_ = targetAverageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
                .getDefaultInstance()) return this;
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000001;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasMetricSelector()) {
          mergeMetricSelector(other.getMetricSelector());
        }
        if (other.hasTargetValue()) {
          mergeTargetValue(other.getTargetValue());
        }
        if (other.hasTargetAverageValue()) {
          mergeTargetAverageValue(other.getTargetAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector metricSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          metricSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public boolean hasMetricSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector() {
        if (metricSelectorBuilder_ == null) {
          return metricSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : metricSelector_;
        } else {
          return metricSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder setMetricSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (metricSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metricSelector_ = value;
          onChanged();
        } else {
          metricSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder setMetricSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = builderForValue.build();
          onChanged();
        } else {
          metricSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder mergeMetricSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (metricSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && metricSelector_ != null
              && metricSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            metricSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(metricSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metricSelector_ = value;
          }
          onChanged();
        } else {
          metricSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder clearMetricSelector() {
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = null;
          onChanged();
        } else {
          metricSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getMetricSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getMetricSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder() {
        if (metricSelectorBuilder_ != null) {
          return metricSelectorBuilder_.getMessageOrBuilder();
        } else {
          return metricSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : metricSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getMetricSelectorFieldBuilder() {
        if (metricSelectorBuilder_ == null) {
          metricSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getMetricSelector(), getParentForChildren(), isClean());
          metricSelector_ = null;
        }
        return metricSelectorBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity targetValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          targetValueBuilder_;
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public boolean hasTargetValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getTargetValue() {
        if (targetValueBuilder_ == null) {
          return targetValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetValue_;
        } else {
          return targetValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder setTargetValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetValue_ = value;
          onChanged();
        } else {
          targetValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder setTargetValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (targetValueBuilder_ == null) {
          targetValue_ = builderForValue.build();
          onChanged();
        } else {
          targetValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder mergeTargetValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && targetValue_ != null
              && targetValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            targetValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(targetValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            targetValue_ = value;
          }
          onChanged();
        } else {
          targetValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder clearTargetValue() {
        if (targetValueBuilder_ == null) {
          targetValue_ = null;
          onChanged();
        } else {
          targetValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getTargetValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTargetValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder() {
        if (targetValueBuilder_ != null) {
          return targetValueBuilder_.getMessageOrBuilder();
        } else {
          return targetValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * Mutually exclusive with TargetAverageValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getTargetValueFieldBuilder() {
        if (targetValueBuilder_ == null) {
          targetValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getTargetValue(), getParentForChildren(), isClean());
          targetValue_ = null;
        }
        return targetValueBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          targetAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public boolean hasTargetAverageValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        } else {
          return targetAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public Builder setTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetAverageValue_ = value;
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public Builder setTargetAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public Builder mergeTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && targetAverageValue_ != null
              && targetAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            targetAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(targetAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            targetAverageValue_ = value;
          }
          onChanged();
        } else {
          targetAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public Builder clearTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
          onChanged();
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getTargetAverageValueBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTargetAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getTargetAverageValueOrBuilder() {
        if (targetAverageValueBuilder_ != null) {
          return targetAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target per-pod value of global metric (as a quantity).
       * Mutually exclusive with TargetValue.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getTargetAverageValueFieldBuilder() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getTargetAverageValue(), getParentForChildren(), isClean());
          targetAverageValue_ = null;
        }
        return targetAverageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ExternalMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ExternalMetricSource)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ExternalMetricSource>() {
          @java.lang.Override
          public ExternalMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    boolean hasMetricSelector();
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector();
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    boolean hasCurrentValue();
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getCurrentValue();
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder();

    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    boolean hasCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ExternalMetricStatus indicates the current value of a global metric
   * not associated with any Kubernetes object.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus}
   */
  public static final class ExternalMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus)
      ExternalMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalMetricStatus.newBuilder() to construct.
    private ExternalMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalMetricStatus() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                metricName_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = metricSelector_.toBuilder();
                }
                metricSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metricSelector_);
                  metricSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = currentValue_.toBuilder();
                }
                currentValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(currentValue_);
                  currentValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = currentAverageValue_.toBuilder();
                }
                currentAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(currentAverageValue_);
                  currentAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int METRICNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of a metric used for autoscaling in
     * metric system.
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METRICSELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector metricSelector_;
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public boolean hasMetricSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector() {
      return metricSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : metricSelector_;
    }
    /**
     *
     *
     * <pre>
     * metricSelector is used to identify a specific time series
     * within a given metric.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder() {
      return metricSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : metricSelector_;
    }

    public static final int CURRENTVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity currentValue_;
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public boolean hasCurrentValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getCurrentValue() {
      return currentValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentValue_;
    }
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder() {
      return currentValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentValue_;
    }

    public static final int CURRENTAVERAGEVALUE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_;
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    public boolean hasCurrentAverageValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getMetricSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getCurrentValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getCurrentAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetricSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCurrentValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(4, getCurrentAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus) obj;

      boolean result = true;
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasMetricSelector() == other.hasMetricSelector());
      if (hasMetricSelector()) {
        result = result && getMetricSelector().equals(other.getMetricSelector());
      }
      result = result && (hasCurrentValue() == other.hasCurrentValue());
      if (hasCurrentValue()) {
        result = result && getCurrentValue().equals(other.getCurrentValue());
      }
      result = result && (hasCurrentAverageValue() == other.hasCurrentAverageValue());
      if (hasCurrentAverageValue()) {
        result = result && getCurrentAverageValue().equals(other.getCurrentAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasMetricSelector()) {
        hash = (37 * hash) + METRICSELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getMetricSelector().hashCode();
      }
      if (hasCurrentValue()) {
        hash = (37 * hash) + CURRENTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentValue().hashCode();
      }
      if (hasCurrentAverageValue()) {
        hash = (37 * hash) + CURRENTAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExternalMetricStatus indicates the current value of a global metric
     * not associated with any Kubernetes object.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricSelectorFieldBuilder();
          getCurrentValueFieldBuilder();
          getCurrentAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = null;
        } else {
          metricSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (currentValueBuilder_ == null) {
          currentValue_ = null;
        } else {
          currentValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (metricSelectorBuilder_ == null) {
          result.metricSelector_ = metricSelector_;
        } else {
          result.metricSelector_ = metricSelectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (currentValueBuilder_ == null) {
          result.currentValue_ = currentValue_;
        } else {
          result.currentValue_ = currentValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (currentAverageValueBuilder_ == null) {
          result.currentAverageValue_ = currentAverageValue_;
        } else {
          result.currentAverageValue_ = currentAverageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000001;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasMetricSelector()) {
          mergeMetricSelector(other.getMetricSelector());
        }
        if (other.hasCurrentValue()) {
          mergeCurrentValue(other.getCurrentValue());
        }
        if (other.hasCurrentAverageValue()) {
          mergeCurrentAverageValue(other.getCurrentAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of a metric used for autoscaling in
       * metric system.
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector metricSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          metricSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public boolean hasMetricSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getMetricSelector() {
        if (metricSelectorBuilder_ == null) {
          return metricSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : metricSelector_;
        } else {
          return metricSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder setMetricSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (metricSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metricSelector_ = value;
          onChanged();
        } else {
          metricSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder setMetricSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = builderForValue.build();
          onChanged();
        } else {
          metricSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder mergeMetricSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (metricSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && metricSelector_ != null
              && metricSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            metricSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(metricSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metricSelector_ = value;
          }
          onChanged();
        } else {
          metricSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public Builder clearMetricSelector() {
        if (metricSelectorBuilder_ == null) {
          metricSelector_ = null;
          onChanged();
        } else {
          metricSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getMetricSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getMetricSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getMetricSelectorOrBuilder() {
        if (metricSelectorBuilder_ != null) {
          return metricSelectorBuilder_.getMessageOrBuilder();
        } else {
          return metricSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : metricSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * metricSelector is used to identify a specific time series
       * within a given metric.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector metricSelector = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getMetricSelectorFieldBuilder() {
        if (metricSelectorBuilder_ == null) {
          metricSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getMetricSelector(), getParentForChildren(), isClean());
          metricSelector_ = null;
        }
        return metricSelectorBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity currentValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          currentValueBuilder_;
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public boolean hasCurrentValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getCurrentValue() {
        if (currentValueBuilder_ == null) {
          return currentValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentValue_;
        } else {
          return currentValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder setCurrentValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentValue_ = value;
          onChanged();
        } else {
          currentValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder setCurrentValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (currentValueBuilder_ == null) {
          currentValue_ = builderForValue.build();
          onChanged();
        } else {
          currentValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder mergeCurrentValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && currentValue_ != null
              && currentValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            currentValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(currentValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            currentValue_ = value;
          }
          onChanged();
        } else {
          currentValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder clearCurrentValue() {
        if (currentValueBuilder_ == null) {
          currentValue_ = null;
          onChanged();
        } else {
          currentValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getCurrentValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCurrentValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder() {
        if (currentValueBuilder_ != null) {
          return currentValueBuilder_.getMessageOrBuilder();
        } else {
          return currentValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getCurrentValueFieldBuilder() {
        if (currentValueBuilder_ == null) {
          currentValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getCurrentValue(), getParentForChildren(), isClean());
          currentValue_ = null;
        }
        return currentValueBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          currentAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public boolean hasCurrentAverageValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        } else {
          return currentAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public Builder setCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentAverageValue_ = value;
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public Builder setCurrentAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public Builder mergeCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && currentAverageValue_ != null
              && currentAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            currentAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(currentAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            currentAverageValue_ = value;
          }
          onChanged();
        } else {
          currentAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public Builder clearCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
          onChanged();
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getCurrentAverageValueBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getCurrentAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getCurrentAverageValueOrBuilder() {
        if (currentAverageValueBuilder_ != null) {
          return currentAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of metric averaged over autoscaled pods.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getCurrentAverageValueFieldBuilder() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getCurrentAverageValue(), getParentForChildren(), isClean());
          currentAverageValue_ = null;
        }
        return currentAverageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ExternalMetricStatus>() {
          @java.lang.Override
          public ExternalMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec getSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus getStatus();
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscaler is the configuration for a horizontal pod
   * autoscaler, which automatically manages the replica count of any resource
   * implementing the scale subresource based on the metrics specified.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler}
   */
  public static final class HorizontalPodAutoscaler extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler)
      HorizontalPodAutoscalerOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscaler.newBuilder() to construct.
    private HorizontalPodAutoscaler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscaler() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscaler(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec spec_;
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus status_;
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
              .getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscaler is the configuration for a horizontal pod
     * autoscaler, which automatically manages the replica count of any resource
     * implementing the scale subresource based on the metrics specified.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler)
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec spec_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                    .newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec,
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .HorizontalPodAutoscalerSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
          getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                      .Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .HorizontalPodAutoscalerStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscaler> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscaler>() {
          @java.lang.Override
          public HorizontalPodAutoscaler parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscaler(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscaler> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscaler> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerConditionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    com.google.protobuf.ByteString getStatusBytes();

    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    boolean hasLastTransitionTime();
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastTransitionTime();
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerCondition describes the state of
   * a HorizontalPodAutoscaler at a certain point.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition}
   */
  public static final class HorizontalPodAutoscalerCondition
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition)
      HorizontalPodAutoscalerConditionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerCondition.newBuilder() to construct.
    private HorizontalPodAutoscalerCondition(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerCondition() {
      type_ = "";
      status_ = "";
      reason_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerCondition(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                status_ = bs;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = lastTransitionTime_.toBuilder();
                }
                lastTransitionTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastTransitionTime_);
                  lastTransitionTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                reason_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                message_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
                  .class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public com.google.protobuf.ByteString getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTTRANSITIONTIME_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.Time lastTransitionTime_;
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public boolean hasLastTransitionTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }

    public static final int REASON_FIELD_NUMBER = 4;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 5;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reason_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reason_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && (hasLastTransitionTime() == other.hasLastTransitionTime());
      if (hasLastTransitionTime()) {
        result = result && getLastTransitionTime().equals(other.getLastTransitionTime());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasLastTransitionTime()) {
        hash = (37 * hash) + LASTTRANSITIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastTransitionTime().hashCode();
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerCondition describes the state of
     * a HorizontalPodAutoscaler at a certain point.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition)
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerConditionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                    .class,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastTransitionTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
          build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
          buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (lastTransitionTimeBuilder_ == null) {
          result.lastTransitionTime_ = lastTransitionTime_;
        } else {
          result.lastTransitionTime_ = lastTransitionTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.reason_ = reason_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                .getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasStatus()) {
          bitField0_ |= 0x00000002;
          status_ = other.status_;
          onChanged();
        }
        if (other.hasLastTransitionTime()) {
          mergeLastTransitionTime(other.getLastTransitionTime());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000008;
          reason_ = other.reason_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000010;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            status_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public com.google.protobuf.ByteString getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatus(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatusBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastTransitionTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastTransitionTimeBuilder_;
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public boolean hasLastTransitionTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        } else {
          return lastTransitionTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder setLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastTransitionTime_ = value;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder setLastTransitionTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = builderForValue.build();
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder mergeLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && lastTransitionTime_ != null
              && lastTransitionTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastTransitionTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastTransitionTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastTransitionTime_ = value;
          }
          onChanged();
        } else {
          lastTransitionTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder clearLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastTransitionTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLastTransitionTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
        if (lastTransitionTimeBuilder_ != null) {
          return lastTransitionTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastTransitionTimeFieldBuilder() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastTransitionTime(), getParentForChildren(), isClean());
          lastTransitionTime_ = null;
        }
        return lastTransitionTimeBuilder_;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        message_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling
            .HorizontalPodAutoscalerCondition
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerCondition>() {
          @java.lang.Override
          public HorizontalPodAutoscalerCondition parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerCondition(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
        getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList}
   */
  public static final class HorizontalPodAutoscalerList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList)
      HorizontalPodAutoscalerListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerList.newBuilder() to construct.
    private HorizontalPodAutoscalerList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
                            .PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
        items_;
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler getItems(
        int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder
        getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList)
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
          buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
          getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler getItems(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder
          getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler,
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscaler.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerList)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerList> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerList>() {
          @java.lang.Override
          public HorizontalPodAutoscalerList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    boolean hasScaleTargetRef();
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getScaleTargetRef();
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getScaleTargetRefOrBuilder();

    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    boolean hasMinReplicas();
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    int getMinReplicas();

    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    boolean hasMaxReplicas();
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    int getMaxReplicas();

    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec> getMetricsList();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getMetrics(int index);
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    int getMetricsCount();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>
        getMetricsOrBuilderList();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec}
   */
  public static final class HorizontalPodAutoscalerSpec
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec)
      HorizontalPodAutoscalerSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerSpec.newBuilder() to construct.
    private HorizontalPodAutoscalerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerSpec() {
      minReplicas_ = 0;
      maxReplicas_ = 0;
      metrics_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = scaleTargetRef_.toBuilder();
                }
                scaleTargetRef_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(scaleTargetRef_);
                  scaleTargetRef_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                minReplicas_ = input.readInt32();
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                maxReplicas_ = input.readInt32();
                break;
              }
            case 34:
              {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  metrics_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec>();
                  mutable_bitField0_ |= 0x00000008;
                }
                metrics_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int SCALETARGETREF_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        scaleTargetRef_;
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public boolean hasScaleTargetRef() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
        getScaleTargetRef() {
      return scaleTargetRef_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : scaleTargetRef_;
    }
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getScaleTargetRefOrBuilder() {
      return scaleTargetRef_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : scaleTargetRef_;
    }

    public static final int MINREPLICAS_FIELD_NUMBER = 2;
    private int minReplicas_;
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    public boolean hasMinReplicas() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    public int getMinReplicas() {
      return minReplicas_;
    }

    public static final int MAXREPLICAS_FIELD_NUMBER = 3;
    private int maxReplicas_;
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    public boolean hasMaxReplicas() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    public int getMaxReplicas() {
      return maxReplicas_;
    }

    public static final int METRICS_FIELD_NUMBER = 4;
    private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec> metrics_;
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec>
        getMetricsList() {
      return metrics_;
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>
        getMetricsOrBuilderList() {
      return metrics_;
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    public int getMetricsCount() {
      return metrics_.size();
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getMetrics(int index) {
      return metrics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
        int index) {
      return metrics_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getScaleTargetRef());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, minReplicas_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, maxReplicas_);
      }
      for (int i = 0; i < metrics_.size(); i++) {
        output.writeMessage(4, metrics_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getScaleTargetRef());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minReplicas_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxReplicas_);
      }
      for (int i = 0; i < metrics_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, metrics_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec) obj;

      boolean result = true;
      result = result && (hasScaleTargetRef() == other.hasScaleTargetRef());
      if (hasScaleTargetRef()) {
        result = result && getScaleTargetRef().equals(other.getScaleTargetRef());
      }
      result = result && (hasMinReplicas() == other.hasMinReplicas());
      if (hasMinReplicas()) {
        result = result && (getMinReplicas() == other.getMinReplicas());
      }
      result = result && (hasMaxReplicas() == other.hasMaxReplicas());
      if (hasMaxReplicas()) {
        result = result && (getMaxReplicas() == other.getMaxReplicas());
      }
      result = result && getMetricsList().equals(other.getMetricsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasScaleTargetRef()) {
        hash = (37 * hash) + SCALETARGETREF_FIELD_NUMBER;
        hash = (53 * hash) + getScaleTargetRef().hashCode();
      }
      if (hasMinReplicas()) {
        hash = (37 * hash) + MINREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getMinReplicas();
      }
      if (hasMaxReplicas()) {
        hash = (37 * hash) + MAXREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getMaxReplicas();
      }
      if (getMetricsCount() > 0) {
        hash = (37 * hash) + METRICS_FIELD_NUMBER;
        hash = (53 * hash) + getMetricsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec)
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getScaleTargetRefFieldBuilder();
          getMetricsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = null;
        } else {
          scaleTargetRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        minReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        maxReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (metricsBuilder_ == null) {
          metrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          metricsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
          buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (scaleTargetRefBuilder_ == null) {
          result.scaleTargetRef_ = scaleTargetRef_;
        } else {
          result.scaleTargetRef_ = scaleTargetRefBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.minReplicas_ = minReplicas_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.maxReplicas_ = maxReplicas_;
        if (metricsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            metrics_ = java.util.Collections.unmodifiableList(metrics_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.metrics_ = metrics_;
        } else {
          result.metrics_ = metricsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
                .getDefaultInstance()) return this;
        if (other.hasScaleTargetRef()) {
          mergeScaleTargetRef(other.getScaleTargetRef());
        }
        if (other.hasMinReplicas()) {
          setMinReplicas(other.getMinReplicas());
        }
        if (other.hasMaxReplicas()) {
          setMaxReplicas(other.getMaxReplicas());
        }
        if (metricsBuilder_ == null) {
          if (!other.metrics_.isEmpty()) {
            if (metrics_.isEmpty()) {
              metrics_ = other.metrics_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureMetricsIsMutable();
              metrics_.addAll(other.metrics_);
            }
            onChanged();
          }
        } else {
          if (!other.metrics_.isEmpty()) {
            if (metricsBuilder_.isEmpty()) {
              metricsBuilder_.dispose();
              metricsBuilder_ = null;
              metrics_ = other.metrics_;
              bitField0_ = (bitField0_ & ~0x00000008);
              metricsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getMetricsFieldBuilder()
                      : null;
            } else {
              metricsBuilder_.addAllMessages(other.metrics_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
          scaleTargetRef_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          scaleTargetRefBuilder_;
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public boolean hasScaleTargetRef() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
          getScaleTargetRef() {
        if (scaleTargetRefBuilder_ == null) {
          return scaleTargetRef_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : scaleTargetRef_;
        } else {
          return scaleTargetRefBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder setScaleTargetRef(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (scaleTargetRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scaleTargetRef_ = value;
          onChanged();
        } else {
          scaleTargetRefBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder setScaleTargetRef(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = builderForValue.build();
          onChanged();
        } else {
          scaleTargetRefBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder mergeScaleTargetRef(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (scaleTargetRefBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && scaleTargetRef_ != null
              && scaleTargetRef_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            scaleTargetRef_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                    .newBuilder(scaleTargetRef_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            scaleTargetRef_ = value;
          }
          onChanged();
        } else {
          scaleTargetRefBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder clearScaleTargetRef() {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = null;
          onChanged();
        } else {
          scaleTargetRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
          getScaleTargetRefBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getScaleTargetRefFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
          getScaleTargetRefOrBuilder() {
        if (scaleTargetRefBuilder_ != null) {
          return scaleTargetRefBuilder_.getMessageOrBuilder();
        } else {
          return scaleTargetRef_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : scaleTargetRef_;
        }
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getScaleTargetRefFieldBuilder() {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRefBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getScaleTargetRef(), getParentForChildren(), isClean());
          scaleTargetRef_ = null;
        }
        return scaleTargetRefBuilder_;
      }

      private int minReplicas_;
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public boolean hasMinReplicas() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public int getMinReplicas() {
        return minReplicas_;
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public Builder setMinReplicas(int value) {
        bitField0_ |= 0x00000002;
        minReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public Builder clearMinReplicas() {
        bitField0_ = (bitField0_ & ~0x00000002);
        minReplicas_ = 0;
        onChanged();
        return this;
      }

      private int maxReplicas_;
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public boolean hasMaxReplicas() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public int getMaxReplicas() {
        return maxReplicas_;
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public Builder setMaxReplicas(int value) {
        bitField0_ |= 0x00000004;
        maxReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public Builder clearMaxReplicas() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxReplicas_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec> metrics_ =
          java.util.Collections.emptyList();

      private void ensureMetricsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          metrics_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec>(
                  metrics_);
          bitField0_ |= 0x00000008;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>
          metricsBuilder_;

      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec>
          getMetricsList() {
        if (metricsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(metrics_);
        } else {
          return metricsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public int getMetricsCount() {
        if (metricsBuilder_ == null) {
          return metrics_.size();
        } else {
          return metricsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getMetrics(int index) {
        if (metricsBuilder_ == null) {
          return metrics_.get(index);
        } else {
          return metricsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder setMetrics(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.set(index, value);
          onChanged();
        } else {
          metricsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder setMetrics(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.set(index, builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.add(value);
          onChanged();
        } else {
          metricsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.add(index, value);
          onChanged();
        } else {
          metricsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.add(builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.add(index, builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder addAllMetrics(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec>
              values) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
          onChanged();
        } else {
          metricsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder clearMetrics() {
        if (metricsBuilder_ == null) {
          metrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          metricsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public Builder removeMetrics(int index) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.remove(index);
          onChanged();
        } else {
          metricsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder getMetricsBuilder(
          int index) {
        return getMetricsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
          int index) {
        if (metricsBuilder_ == null) {
          return metrics_.get(index);
        } else {
          return metricsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>
          getMetricsOrBuilderList() {
        if (metricsBuilder_ != null) {
          return metricsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(metrics_);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder addMetricsBuilder() {
        return getMetricsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder addMetricsBuilder(
          int index) {
        return getMetricsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricSpec metrics = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder>
          getMetricsBuilderList() {
        return getMetricsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>
          getMetricsFieldBuilder() {
        if (metricsBuilder_ == null) {
          metricsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec,
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder>(
                  metrics_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          metrics_ = null;
        }
        return metricsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerSpec)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerSpec>() {
          @java.lang.Override
          public HorizontalPodAutoscalerSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    boolean hasObservedGeneration();
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    long getObservedGeneration();

    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    boolean hasLastScaleTime();
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastScaleTime();
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    boolean hasCurrentReplicas();
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    int getCurrentReplicas();

    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    boolean hasDesiredReplicas();
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    int getDesiredReplicas();

    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
        getCurrentMetricsList();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus getCurrentMetrics(int index);
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    int getCurrentMetricsCount();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>
        getCurrentMetricsOrBuilderList();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder getCurrentMetricsOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>
        getConditionsList();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition getConditions(
        int index);
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    int getConditionsCount();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta1Autoscaling
                    .HorizontalPodAutoscalerConditionOrBuilder>
        getConditionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
        getConditionsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus}
   */
  public static final class HorizontalPodAutoscalerStatus
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus)
      HorizontalPodAutoscalerStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerStatus.newBuilder() to construct.
    private HorizontalPodAutoscalerStatus(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerStatus() {
      observedGeneration_ = 0L;
      currentReplicas_ = 0;
      desiredReplicas_ = 0;
      currentMetrics_ = java.util.Collections.emptyList();
      conditions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                observedGeneration_ = input.readInt64();
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = lastScaleTime_.toBuilder();
                }
                lastScaleTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastScaleTime_);
                  lastScaleTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                currentReplicas_ = input.readInt32();
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000008;
                desiredReplicas_ = input.readInt32();
                break;
              }
            case 42:
              {
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  currentMetrics_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>();
                  mutable_bitField0_ |= 0x00000010;
                }
                currentMetrics_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.PARSER,
                        extensionRegistry));
                break;
              }
            case 50:
              {
                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                  conditions_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta1Autoscaling
                              .HorizontalPodAutoscalerCondition>();
                  mutable_bitField0_ |= 0x00000020;
                }
                conditions_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling
                            .HorizontalPodAutoscalerCondition.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          currentMetrics_ = java.util.Collections.unmodifiableList(currentMetrics_);
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder
                  .class);
    }

    private int bitField0_;
    public static final int OBSERVEDGENERATION_FIELD_NUMBER = 1;
    private long observedGeneration_;
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public boolean hasObservedGeneration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public long getObservedGeneration() {
      return observedGeneration_;
    }

    public static final int LASTSCALETIME_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.Time lastScaleTime_;
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public boolean hasLastScaleTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastScaleTime() {
      return lastScaleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScaleTime_;
    }
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder() {
      return lastScaleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScaleTime_;
    }

    public static final int CURRENTREPLICAS_FIELD_NUMBER = 3;
    private int currentReplicas_;
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    public boolean hasCurrentReplicas() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    public int getCurrentReplicas() {
      return currentReplicas_;
    }

    public static final int DESIREDREPLICAS_FIELD_NUMBER = 4;
    private int desiredReplicas_;
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    public boolean hasDesiredReplicas() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    public int getDesiredReplicas() {
      return desiredReplicas_;
    }

    public static final int CURRENTMETRICS_FIELD_NUMBER = 5;
    private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
        currentMetrics_;
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
        getCurrentMetricsList() {
      return currentMetrics_;
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>
        getCurrentMetricsOrBuilderList() {
      return currentMetrics_;
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    public int getCurrentMetricsCount() {
      return currentMetrics_.size();
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus getCurrentMetrics(int index) {
      return currentMetrics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder
        getCurrentMetricsOrBuilder(int index) {
      return currentMetrics_.get(index);
    }

    public static final int CONDITIONS_FIELD_NUMBER = 6;
    private java.util.List<
            io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>
        conditions_;
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>
        getConditionsList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta1Autoscaling
                    .HorizontalPodAutoscalerConditionOrBuilder>
        getConditionsOrBuilderList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public int getConditionsCount() {
      return conditions_.size();
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
        getConditions(int index) {
      return conditions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
        getConditionsOrBuilder(int index) {
      return conditions_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, observedGeneration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getLastScaleTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, currentReplicas_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, desiredReplicas_);
      }
      for (int i = 0; i < currentMetrics_.size(); i++) {
        output.writeMessage(5, currentMetrics_.get(i));
      }
      for (int i = 0; i < conditions_.size(); i++) {
        output.writeMessage(6, conditions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, observedGeneration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLastScaleTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, currentReplicas_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, desiredReplicas_);
      }
      for (int i = 0; i < currentMetrics_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, currentMetrics_.get(i));
      }
      for (int i = 0; i < conditions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, conditions_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus) obj;

      boolean result = true;
      result = result && (hasObservedGeneration() == other.hasObservedGeneration());
      if (hasObservedGeneration()) {
        result = result && (getObservedGeneration() == other.getObservedGeneration());
      }
      result = result && (hasLastScaleTime() == other.hasLastScaleTime());
      if (hasLastScaleTime()) {
        result = result && getLastScaleTime().equals(other.getLastScaleTime());
      }
      result = result && (hasCurrentReplicas() == other.hasCurrentReplicas());
      if (hasCurrentReplicas()) {
        result = result && (getCurrentReplicas() == other.getCurrentReplicas());
      }
      result = result && (hasDesiredReplicas() == other.hasDesiredReplicas());
      if (hasDesiredReplicas()) {
        result = result && (getDesiredReplicas() == other.getDesiredReplicas());
      }
      result = result && getCurrentMetricsList().equals(other.getCurrentMetricsList());
      result = result && getConditionsList().equals(other.getConditionsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasObservedGeneration()) {
        hash = (37 * hash) + OBSERVEDGENERATION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getObservedGeneration());
      }
      if (hasLastScaleTime()) {
        hash = (37 * hash) + LASTSCALETIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastScaleTime().hashCode();
      }
      if (hasCurrentReplicas()) {
        hash = (37 * hash) + CURRENTREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentReplicas();
      }
      if (hasDesiredReplicas()) {
        hash = (37 * hash) + DESIREDREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getDesiredReplicas();
      }
      if (getCurrentMetricsCount() > 0) {
        hash = (37 * hash) + CURRENTMETRICS_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentMetricsList().hashCode();
      }
      if (getConditionsCount() > 0) {
        hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getConditionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastScaleTimeFieldBuilder();
          getCurrentMetricsFieldBuilder();
          getConditionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        observedGeneration_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = null;
        } else {
          lastScaleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        currentReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        desiredReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (currentMetricsBuilder_ == null) {
          currentMetrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          currentMetricsBuilder_.clear();
        }
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
          buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.observedGeneration_ = observedGeneration_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (lastScaleTimeBuilder_ == null) {
          result.lastScaleTime_ = lastScaleTime_;
        } else {
          result.lastScaleTime_ = lastScaleTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.currentReplicas_ = currentReplicas_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.desiredReplicas_ = desiredReplicas_;
        if (currentMetricsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            currentMetrics_ = java.util.Collections.unmodifiableList(currentMetrics_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.currentMetrics_ = currentMetrics_;
        } else {
          result.currentMetrics_ = currentMetricsBuilder_.build();
        }
        if (conditionsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            conditions_ = java.util.Collections.unmodifiableList(conditions_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.conditions_ = conditions_;
        } else {
          result.conditions_ = conditionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
                .getDefaultInstance()) return this;
        if (other.hasObservedGeneration()) {
          setObservedGeneration(other.getObservedGeneration());
        }
        if (other.hasLastScaleTime()) {
          mergeLastScaleTime(other.getLastScaleTime());
        }
        if (other.hasCurrentReplicas()) {
          setCurrentReplicas(other.getCurrentReplicas());
        }
        if (other.hasDesiredReplicas()) {
          setDesiredReplicas(other.getDesiredReplicas());
        }
        if (currentMetricsBuilder_ == null) {
          if (!other.currentMetrics_.isEmpty()) {
            if (currentMetrics_.isEmpty()) {
              currentMetrics_ = other.currentMetrics_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureCurrentMetricsIsMutable();
              currentMetrics_.addAll(other.currentMetrics_);
            }
            onChanged();
          }
        } else {
          if (!other.currentMetrics_.isEmpty()) {
            if (currentMetricsBuilder_.isEmpty()) {
              currentMetricsBuilder_.dispose();
              currentMetricsBuilder_ = null;
              currentMetrics_ = other.currentMetrics_;
              bitField0_ = (bitField0_ & ~0x00000010);
              currentMetricsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getCurrentMetricsFieldBuilder()
                      : null;
            } else {
              currentMetricsBuilder_.addAllMessages(other.currentMetrics_);
            }
          }
        }
        if (conditionsBuilder_ == null) {
          if (!other.conditions_.isEmpty()) {
            if (conditions_.isEmpty()) {
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureConditionsIsMutable();
              conditions_.addAll(other.conditions_);
            }
            onChanged();
          }
        } else {
          if (!other.conditions_.isEmpty()) {
            if (conditionsBuilder_.isEmpty()) {
              conditionsBuilder_.dispose();
              conditionsBuilder_ = null;
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000020);
              conditionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getConditionsFieldBuilder()
                      : null;
            } else {
              conditionsBuilder_.addAllMessages(other.conditions_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long observedGeneration_;
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public boolean hasObservedGeneration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public long getObservedGeneration() {
        return observedGeneration_;
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder setObservedGeneration(long value) {
        bitField0_ |= 0x00000001;
        observedGeneration_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder clearObservedGeneration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        observedGeneration_ = 0L;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastScaleTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastScaleTimeBuilder_;
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public boolean hasLastScaleTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastScaleTime() {
        if (lastScaleTimeBuilder_ == null) {
          return lastScaleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScaleTime_;
        } else {
          return lastScaleTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder setLastScaleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScaleTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastScaleTime_ = value;
          onChanged();
        } else {
          lastScaleTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder setLastScaleTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = builderForValue.build();
          onChanged();
        } else {
          lastScaleTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder mergeLastScaleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScaleTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && lastScaleTime_ != null
              && lastScaleTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastScaleTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastScaleTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastScaleTime_ = value;
          }
          onChanged();
        } else {
          lastScaleTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder clearLastScaleTime() {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = null;
          onChanged();
        } else {
          lastScaleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastScaleTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLastScaleTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder() {
        if (lastScaleTimeBuilder_ != null) {
          return lastScaleTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastScaleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScaleTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastScaleTimeFieldBuilder() {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastScaleTime(), getParentForChildren(), isClean());
          lastScaleTime_ = null;
        }
        return lastScaleTimeBuilder_;
      }

      private int currentReplicas_;
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public boolean hasCurrentReplicas() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public int getCurrentReplicas() {
        return currentReplicas_;
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public Builder setCurrentReplicas(int value) {
        bitField0_ |= 0x00000004;
        currentReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public Builder clearCurrentReplicas() {
        bitField0_ = (bitField0_ & ~0x00000004);
        currentReplicas_ = 0;
        onChanged();
        return this;
      }

      private int desiredReplicas_;
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public boolean hasDesiredReplicas() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public int getDesiredReplicas() {
        return desiredReplicas_;
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public Builder setDesiredReplicas(int value) {
        bitField0_ |= 0x00000008;
        desiredReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public Builder clearDesiredReplicas() {
        bitField0_ = (bitField0_ & ~0x00000008);
        desiredReplicas_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
          currentMetrics_ = java.util.Collections.emptyList();

      private void ensureCurrentMetricsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          currentMetrics_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>(
                  currentMetrics_);
          bitField0_ |= 0x00000010;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>
          currentMetricsBuilder_;

      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
          getCurrentMetricsList() {
        if (currentMetricsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(currentMetrics_);
        } else {
          return currentMetricsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public int getCurrentMetricsCount() {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.size();
        } else {
          return currentMetricsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus getCurrentMetrics(
          int index) {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.get(index);
        } else {
          return currentMetricsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder setCurrentMetrics(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.set(index, value);
          onChanged();
        } else {
          currentMetricsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder setCurrentMetrics(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.set(index, builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(value);
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          int index, io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(index, value);
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(index, builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addAllCurrentMetrics(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus>
              values) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, currentMetrics_);
          onChanged();
        } else {
          currentMetricsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder clearCurrentMetrics() {
        if (currentMetricsBuilder_ == null) {
          currentMetrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          currentMetricsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder removeCurrentMetrics(int index) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.remove(index);
          onChanged();
        } else {
          currentMetricsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder
          getCurrentMetricsBuilder(int index) {
        return getCurrentMetricsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder
          getCurrentMetricsOrBuilder(int index) {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.get(index);
        } else {
          return currentMetricsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>
          getCurrentMetricsOrBuilderList() {
        if (currentMetricsBuilder_ != null) {
          return currentMetricsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(currentMetrics_);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder
          addCurrentMetricsBuilder() {
        return getCurrentMetricsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder
          addCurrentMetricsBuilder(int index) {
        return getCurrentMetricsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta1.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder>
          getCurrentMetricsBuilderList() {
        return getCurrentMetricsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>
          getCurrentMetricsFieldBuilder() {
        if (currentMetricsBuilder_ == null) {
          currentMetricsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder>(
                  currentMetrics_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          currentMetrics_ = null;
        }
        return currentMetricsBuilder_;
      }

      private java.util.List<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>
          conditions_ = java.util.Collections.emptyList();

      private void ensureConditionsIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          conditions_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>(
                  conditions_);
          bitField0_ |= 0x00000020;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling
                  .HorizontalPodAutoscalerConditionOrBuilder>
          conditionsBuilder_;

      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition>
          getConditionsList() {
        if (conditionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(conditions_);
        } else {
          return conditionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public int getConditionsCount() {
        if (conditionsBuilder_ == null) {
          return conditions_.size();
        } else {
          return conditionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
          getConditions(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.set(index, value);
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.set(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(index, value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addAllConditions(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V2beta1Autoscaling
                          .HorizontalPodAutoscalerCondition>
              values) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conditions_);
          onChanged();
        } else {
          conditionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder clearConditions() {
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder removeConditions(int index) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.remove(index);
          onChanged();
        } else {
          conditionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
          getConditionsBuilder(int index) {
        return getConditionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
          getConditionsOrBuilder(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .HorizontalPodAutoscalerConditionOrBuilder>
          getConditionsOrBuilderList() {
        if (conditionsBuilder_ != null) {
          return conditionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(conditions_);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
          addConditionsBuilder() {
        return getConditionsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition.Builder
          addConditionsBuilder(int index) {
        return getConditionsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder>
          getConditionsBuilderList() {
        return getConditionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition,
              io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling
                  .HorizontalPodAutoscalerConditionOrBuilder>
          getConditionsFieldBuilder() {
        if (conditionsBuilder_ == null) {
          conditionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition,
                  io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerCondition
                      .Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .HorizontalPodAutoscalerConditionOrBuilder>(
                  conditions_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          conditions_ = null;
        }
        return conditionsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.HorizontalPodAutoscalerStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerStatus>() {
          @java.lang.Override
          public HorizontalPodAutoscalerStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.HorizontalPodAutoscalerStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.MetricSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource getObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    boolean hasPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource getPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder getPodsOrBuilder();

    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource getResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder
        getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    boolean hasExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource getExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder
        getExternalOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * MetricSpec specifies how to scale based on a single metric
   * (only `type` and one other matching field should be set at once).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.MetricSpec}
   */
  public static final class MetricSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.MetricSpec)
      MetricSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricSpec.newBuilder() to construct.
    private MetricSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricSpec() {
      type_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = pods_.toBuilder();
                }
                pods_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(pods_);
                  pods_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = external_.toBuilder();
                }
                external_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(external_);
                  external_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource object_;
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder
        getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.getDefaultInstance()
          : object_;
    }

    public static final int PODS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource pods_;
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    public boolean hasPods() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource getPods() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance()
          : pods_;
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder
        getPodsOrBuilder() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance()
          : pods_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource resource_;
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder
        getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.getDefaultInstance()
          : resource_;
    }

    public static final int EXTERNAL_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource external_;
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    public boolean hasExternal() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource getExternal() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.getDefaultInstance()
          : external_;
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder
        getExternalOrBuilder() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.getDefaultInstance()
          : external_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getExternal());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getExternal());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasPods() == other.hasPods());
      if (hasPods()) {
        result = result && getPods().equals(other.getPods());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasExternal() == other.hasExternal());
      if (hasExternal()) {
        result = result && getExternal().equals(other.getExternal());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasPods()) {
        hash = (37 * hash) + PODS_FIELD_NUMBER;
        hash = (53 * hash) + getPods().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasExternal()) {
        hash = (37 * hash) + EXTERNAL_FIELD_NUMBER;
        hash = (53 * hash) + getExternal().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricSpec specifies how to scale based on a single metric
     * (only `type` and one other matching field should be set at once).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.MetricSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.MetricSpec)
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getObjectFieldBuilder();
          getPodsFieldBuilder();
          getResourceFieldBuilder();
          getExternalFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (podsBuilder_ == null) {
          pods_ = null;
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (externalBuilder_ == null) {
          external_ = null;
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (podsBuilder_ == null) {
          result.pods_ = pods_;
        } else {
          result.pods_ = podsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (externalBuilder_ == null) {
          result.external_ = external_;
        } else {
          result.external_ = externalBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec) {
          return mergeFrom((io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec other) {
        if (other == io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasPods()) {
          mergePods(other.getPods());
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasExternal()) {
          mergeExternal(other.getExternal());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
                  .getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder
              builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public Builder mergeObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && object_ != null
              && object_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
                      .getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.newBuilder(object_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = null;
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder
          getObjectBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder
          getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
                  .getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricSource object = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource pods_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder>
          podsBuilder_;
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public boolean hasPods() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource getPods() {
        if (podsBuilder_ == null) {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance()
              : pods_;
        } else {
          return podsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public Builder setPods(io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource value) {
        if (podsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pods_ = value;
          onChanged();
        } else {
          podsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public Builder setPods(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder builderForValue) {
        if (podsBuilder_ == null) {
          pods_ = builderForValue.build();
          onChanged();
        } else {
          podsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public Builder mergePods(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource value) {
        if (podsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && pods_ != null
              && pods_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource
                      .getDefaultInstance()) {
            pods_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.newBuilder(pods_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            pods_ = value;
          }
          onChanged();
        } else {
          podsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public Builder clearPods() {
        if (podsBuilder_ == null) {
          pods_ = null;
          onChanged();
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder
          getPodsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPodsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder
          getPodsOrBuilder() {
        if (podsBuilder_ != null) {
          return podsBuilder_.getMessageOrBuilder();
        } else {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance()
              : pods_;
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricSource pods = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder>
          getPodsFieldBuilder() {
        if (podsBuilder_ == null) {
          podsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource,
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder>(
                  getPods(), getParentForChildren(), isClean());
          pods_ = null;
        }
        return podsBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
                  .getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder
              builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder mergeResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
                      .getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.newBuilder(
                        resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder
          getResourceBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder
          getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
                  .getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricSource resource = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource external_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder>
          externalBuilder_;
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public boolean hasExternal() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource getExternal() {
        if (externalBuilder_ == null) {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
                  .getDefaultInstance()
              : external_;
        } else {
          return externalBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource value) {
        if (externalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          external_ = value;
          onChanged();
        } else {
          externalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder
              builderForValue) {
        if (externalBuilder_ == null) {
          external_ = builderForValue.build();
          onChanged();
        } else {
          externalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder mergeExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource value) {
        if (externalBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && external_ != null
              && external_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
                      .getDefaultInstance()) {
            external_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.newBuilder(
                        external_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            external_ = value;
          }
          onChanged();
        } else {
          externalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder clearExternal() {
        if (externalBuilder_ == null) {
          external_ = null;
          onChanged();
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder
          getExternalBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getExternalFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder
          getExternalOrBuilder() {
        if (externalBuilder_ != null) {
          return externalBuilder_.getMessageOrBuilder();
        } else {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource
                  .getDefaultInstance()
              : external_;
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricSource external = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder>
          getExternalFieldBuilder() {
        if (externalBuilder_ == null) {
          externalBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricSourceOrBuilder>(
                  getExternal(), getParentForChildren(), isClean());
          external_ = null;
        }
        return externalBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.MetricSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.MetricSpec)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricSpec> PARSER =
        new com.google.protobuf.AbstractParser<MetricSpec>() {
          @java.lang.Override
          public MetricSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.MetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus getObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    boolean hasPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus getPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder getPodsOrBuilder();

    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus getResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder
        getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    boolean hasExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus getExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder
        getExternalOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * MetricStatus describes the last-read state of a single metric.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.MetricStatus}
   */
  public static final class MetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.MetricStatus)
      MetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricStatus.newBuilder() to construct.
    private MetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricStatus() {
      type_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = pods_.toBuilder();
                }
                pods_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(pods_);
                  pods_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = external_.toBuilder();
                }
                external_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(external_);
                  external_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus object_;
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder
        getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.getDefaultInstance()
          : object_;
    }

    public static final int PODS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus pods_;
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    public boolean hasPods() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus getPods() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance()
          : pods_;
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder
        getPodsOrBuilder() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance()
          : pods_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus resource_;
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder
        getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.getDefaultInstance()
          : resource_;
    }

    public static final int EXTERNAL_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus external_;
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    public boolean hasExternal() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus getExternal() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.getDefaultInstance()
          : external_;
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder
        getExternalOrBuilder() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.getDefaultInstance()
          : external_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getExternal());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getExternal());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasPods() == other.hasPods());
      if (hasPods()) {
        result = result && getPods().equals(other.getPods());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasExternal() == other.hasExternal());
      if (hasExternal()) {
        result = result && getExternal().equals(other.getExternal());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasPods()) {
        hash = (37 * hash) + PODS_FIELD_NUMBER;
        hash = (53 * hash) + getPods().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasExternal()) {
        hash = (37 * hash) + EXTERNAL_FIELD_NUMBER;
        hash = (53 * hash) + getExternal().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricStatus describes the last-read state of a single metric.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.MetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.MetricStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getObjectFieldBuilder();
          getPodsFieldBuilder();
          getResourceFieldBuilder();
          getExternalFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (podsBuilder_ == null) {
          pods_ = null;
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (externalBuilder_ == null) {
          external_ = null;
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (podsBuilder_ == null) {
          result.pods_ = pods_;
        } else {
          result.pods_ = podsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (externalBuilder_ == null) {
          result.external_ = external_;
        } else {
          result.external_ = externalBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus) {
          return mergeFrom((io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasPods()) {
          mergePods(other.getPods());
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasExternal()) {
          mergeExternal(other.getExternal());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
                  .getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder
              builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public Builder mergeObject(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && object_ != null
              && object_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
                      .getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.newBuilder(object_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = null;
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder
          getObjectBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder
          getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
                  .getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus object = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus pods_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder>
          podsBuilder_;
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public boolean hasPods() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus getPods() {
        if (podsBuilder_ == null) {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance()
              : pods_;
        } else {
          return podsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public Builder setPods(io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus value) {
        if (podsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pods_ = value;
          onChanged();
        } else {
          podsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public Builder setPods(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder builderForValue) {
        if (podsBuilder_ == null) {
          pods_ = builderForValue.build();
          onChanged();
        } else {
          podsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public Builder mergePods(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus value) {
        if (podsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && pods_ != null
              && pods_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus
                      .getDefaultInstance()) {
            pods_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.newBuilder(pods_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            pods_ = value;
          }
          onChanged();
        } else {
          podsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public Builder clearPods() {
        if (podsBuilder_ == null) {
          pods_ = null;
          onChanged();
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder
          getPodsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPodsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder
          getPodsOrBuilder() {
        if (podsBuilder_ != null) {
          return podsBuilder_.getMessageOrBuilder();
        } else {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance()
              : pods_;
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.PodsMetricStatus pods = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder>
          getPodsFieldBuilder() {
        if (podsBuilder_ == null) {
          podsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder>(
                  getPods(), getParentForChildren(), isClean());
          pods_ = null;
        }
        return podsBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
                  .getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder
              builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder mergeResource(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
                      .getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.newBuilder(
                        resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder
          getResourceBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder
          getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
                  .getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus resource = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus external_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder>
          externalBuilder_;
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public boolean hasExternal() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus getExternal() {
        if (externalBuilder_ == null) {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
                  .getDefaultInstance()
              : external_;
        } else {
          return externalBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus value) {
        if (externalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          external_ = value;
          onChanged();
        } else {
          externalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder
              builderForValue) {
        if (externalBuilder_ == null) {
          external_ = builderForValue.build();
          onChanged();
        } else {
          externalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder mergeExternal(
          io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus value) {
        if (externalBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && external_ != null
              && external_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
                      .getDefaultInstance()) {
            external_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.newBuilder(
                        external_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            external_ = value;
          }
          onChanged();
        } else {
          externalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder clearExternal() {
        if (externalBuilder_ == null) {
          external_ = null;
          onChanged();
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder
          getExternalBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getExternalFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder
          getExternalOrBuilder() {
        if (externalBuilder_ != null) {
          return externalBuilder_.getMessageOrBuilder();
        } else {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus
                  .getDefaultInstance()
              : external_;
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta1.ExternalMetricStatus external = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder>
          getExternalFieldBuilder() {
        if (externalBuilder_ == null) {
          externalBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling.ExternalMetricStatusOrBuilder>(
                  getExternal(), getParentForChildren(), isClean());
          external_ = null;
        }
        return externalBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.MetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.MetricStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<MetricStatus>() {
          @java.lang.Override
          public MetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.MetricStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ObjectMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ObjectMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget();
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getTargetOrBuilder();

    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    boolean hasTargetValue();
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getTargetValue();
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder();

    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    boolean hasAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ObjectMetricSource indicates how to scale on a metric describing a
   * kubernetes object (for example, hits-per-second on an Ingress object).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ObjectMetricSource}
   */
  public static final class ObjectMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ObjectMetricSource)
      ObjectMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ObjectMetricSource.newBuilder() to construct.
    private ObjectMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ObjectMetricSource() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ObjectMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                metricName_ = bs;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = targetValue_.toBuilder();
                }
                targetValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(targetValue_);
                  targetValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = averageValue_.toBuilder();
                }
                averageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(averageValue_);
                  averageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int TARGET_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference target_;
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : target_;
    }

    public static final int METRICNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGETVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity targetValue_;
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public boolean hasTargetValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getTargetValue() {
      return targetValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetValue_;
    }
    /**
     *
     *
     * <pre>
     * targetValue is the target value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder() {
      return targetValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetValue_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int AVERAGEVALUE_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.Resource.Quantity averageValue_;
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public boolean hasAverageValue() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getTarget());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metricName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getTargetValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTarget());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, metricName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource) obj;

      boolean result = true;
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasTargetValue() == other.hasTargetValue());
      if (hasTargetValue()) {
        result = result && getTargetValue().equals(other.getTargetValue());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && (hasAverageValue() == other.hasAverageValue());
      if (hasAverageValue()) {
        result = result && getAverageValue().equals(other.getAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasTargetValue()) {
        hash = (37 * hash) + TARGETVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTargetValue().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (hasAverageValue()) {
        hash = (37 * hash) + AVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ObjectMetricSource indicates how to scale on a metric describing a
     * kubernetes object (for example, hits-per-second on an Ingress object).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ObjectMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ObjectMetricSource)
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTargetFieldBuilder();
          getTargetValueFieldBuilder();
          getSelectorFieldBuilder();
          getAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (targetValueBuilder_ == null) {
          targetValue_ = null;
        } else {
          targetValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (targetValueBuilder_ == null) {
          result.targetValue_ = targetValue_;
        } else {
          result.targetValue_ = targetValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (averageValueBuilder_ == null) {
          result.averageValue_ = averageValue_;
        } else {
          result.averageValue_ = averageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
                .getDefaultInstance()) return this;
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
        }
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000002;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasTargetValue()) {
          mergeTargetValue(other.getTargetValue());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (other.hasAverageValue()) {
          mergeAverageValue(other.getAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference target_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder mergeTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                    .newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
          getTargetBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
      }

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity targetValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          targetValueBuilder_;
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public boolean hasTargetValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getTargetValue() {
        if (targetValueBuilder_ == null) {
          return targetValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetValue_;
        } else {
          return targetValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder setTargetValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetValue_ = value;
          onChanged();
        } else {
          targetValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder setTargetValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (targetValueBuilder_ == null) {
          targetValue_ = builderForValue.build();
          onChanged();
        } else {
          targetValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder mergeTargetValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && targetValue_ != null
              && targetValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            targetValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(targetValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            targetValue_ = value;
          }
          onChanged();
        } else {
          targetValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public Builder clearTargetValue() {
        if (targetValueBuilder_ == null) {
          targetValue_ = null;
          onChanged();
        } else {
          targetValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getTargetValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTargetValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetValueOrBuilder() {
        if (targetValueBuilder_ != null) {
          return targetValueBuilder_.getMessageOrBuilder();
        } else {
          return targetValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * targetValue is the target value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetValue = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getTargetValueFieldBuilder() {
        if (targetValueBuilder_ == null) {
          targetValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getTargetValue(), getParentForChildren(), isClean());
          targetValue_ = null;
        }
        return targetValueBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity averageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          averageValueBuilder_;
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public boolean hasAverageValue() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
        if (averageValueBuilder_ == null) {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        } else {
          return averageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder setAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          averageValue_ = value;
          onChanged();
        } else {
          averageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder setAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (averageValueBuilder_ == null) {
          averageValue_ = builderForValue.build();
          onChanged();
        } else {
          averageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder mergeAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && averageValue_ != null
              && averageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            averageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(averageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            averageValue_ = value;
          }
          onChanged();
        } else {
          averageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder clearAverageValue() {
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
          onChanged();
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getAverageValueBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
        if (averageValueBuilder_ != null) {
          return averageValueBuilder_.getMessageOrBuilder();
        } else {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getAverageValueFieldBuilder() {
        if (averageValueBuilder_ == null) {
          averageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getAverageValue(), getParentForChildren(), isClean());
          averageValue_ = null;
        }
        return averageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ObjectMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ObjectMetricSource)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ObjectMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ObjectMetricSource>() {
          @java.lang.Override
          public ObjectMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ObjectMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ObjectMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ObjectMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ObjectMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget();
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getTargetOrBuilder();

    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    boolean hasCurrentValue();
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getCurrentValue();
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder();

    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    boolean hasAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ObjectMetricStatus indicates the current value of a metric describing a
   * kubernetes object (for example, hits-per-second on an Ingress object).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus}
   */
  public static final class ObjectMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus)
      ObjectMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ObjectMetricStatus.newBuilder() to construct.
    private ObjectMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ObjectMetricStatus() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ObjectMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                metricName_ = bs;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = currentValue_.toBuilder();
                }
                currentValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(currentValue_);
                  currentValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = averageValue_.toBuilder();
                }
                averageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(averageValue_);
                  averageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int TARGET_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference target_;
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target is the described Kubernetes object.
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : target_;
    }

    public static final int METRICNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question.
     * </pre>
     *
     * <code>optional string metricName = 2;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURRENTVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity currentValue_;
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public boolean hasCurrentValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getCurrentValue() {
      return currentValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentValue_;
    }
    /**
     *
     *
     * <pre>
     * currentValue is the current value of the metric (as a quantity).
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder() {
      return currentValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentValue_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int AVERAGEVALUE_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.Resource.Quantity averageValue_;
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public boolean hasAverageValue() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getTarget());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metricName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getCurrentValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTarget());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, metricName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCurrentValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus) obj;

      boolean result = true;
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasCurrentValue() == other.hasCurrentValue());
      if (hasCurrentValue()) {
        result = result && getCurrentValue().equals(other.getCurrentValue());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && (hasAverageValue() == other.hasAverageValue());
      if (hasAverageValue()) {
        result = result && getAverageValue().equals(other.getAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasCurrentValue()) {
        hash = (37 * hash) + CURRENTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentValue().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (hasAverageValue()) {
        hash = (37 * hash) + AVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ObjectMetricStatus indicates the current value of a metric describing a
     * kubernetes object (for example, hits-per-second on an Ingress object).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTargetFieldBuilder();
          getCurrentValueFieldBuilder();
          getSelectorFieldBuilder();
          getAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (currentValueBuilder_ == null) {
          currentValue_ = null;
        } else {
          currentValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (currentValueBuilder_ == null) {
          result.currentValue_ = currentValue_;
        } else {
          result.currentValue_ = currentValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (averageValueBuilder_ == null) {
          result.averageValue_ = averageValue_;
        } else {
          result.averageValue_ = averageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
        }
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000002;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasCurrentValue()) {
          mergeCurrentValue(other.getCurrentValue());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (other.hasAverageValue()) {
          mergeAverageValue(other.getAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference target_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder mergeTarget(
          io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                    .newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder
          getTargetBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target is the described Kubernetes object.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta1.CrossVersionObjectReference target = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta1Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta1Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
      }

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question.
       * </pre>
       *
       * <code>optional string metricName = 2;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity currentValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          currentValueBuilder_;
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public boolean hasCurrentValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getCurrentValue() {
        if (currentValueBuilder_ == null) {
          return currentValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentValue_;
        } else {
          return currentValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder setCurrentValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentValue_ = value;
          onChanged();
        } else {
          currentValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder setCurrentValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (currentValueBuilder_ == null) {
          currentValue_ = builderForValue.build();
          onChanged();
        } else {
          currentValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder mergeCurrentValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && currentValue_ != null
              && currentValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            currentValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(currentValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            currentValue_ = value;
          }
          onChanged();
        } else {
          currentValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public Builder clearCurrentValue() {
        if (currentValueBuilder_ == null) {
          currentValue_ = null;
          onChanged();
        } else {
          currentValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getCurrentValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCurrentValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentValueOrBuilder() {
        if (currentValueBuilder_ != null) {
          return currentValueBuilder_.getMessageOrBuilder();
        } else {
          return currentValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * currentValue is the current value of the metric (as a quantity).
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentValue = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getCurrentValueFieldBuilder() {
        if (currentValueBuilder_ == null) {
          currentValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getCurrentValue(), getParentForChildren(), isClean());
          currentValue_ = null;
        }
        return currentValueBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity averageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          averageValueBuilder_;
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public boolean hasAverageValue() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
        if (averageValueBuilder_ == null) {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        } else {
          return averageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder setAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          averageValue_ = value;
          onChanged();
        } else {
          averageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder setAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (averageValueBuilder_ == null) {
          averageValue_ = builderForValue.build();
          onChanged();
        } else {
          averageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder mergeAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && averageValue_ != null
              && averageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            averageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(averageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            averageValue_ = value;
          }
          onChanged();
        } else {
          averageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public Builder clearAverageValue() {
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
          onChanged();
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getAverageValueBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
        if (averageValueBuilder_ != null) {
          return averageValueBuilder_.getMessageOrBuilder();
        } else {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getAverageValueFieldBuilder() {
        if (averageValueBuilder_ == null) {
          averageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getAverageValue(), getParentForChildren(), isClean());
          averageValue_ = null;
        }
        return averageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ObjectMetricStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ObjectMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ObjectMetricStatus>() {
          @java.lang.Override
          public ObjectMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ObjectMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ObjectMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ObjectMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ObjectMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodsMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.PodsMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    boolean hasTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder();

    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodsMetricSource indicates how to scale on a metric describing each pod in
   * the current scale target (for example, transactions-processed-per-second).
   * The values will be averaged together before being compared to the target
   * value.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.PodsMetricSource}
   */
  public static final class PodsMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.PodsMetricSource)
      PodsMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodsMetricSource.newBuilder() to construct.
    private PodsMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodsMetricSource() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodsMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                metricName_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = targetAverageValue_.toBuilder();
                }
                targetAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(targetAverageValue_);
                  targetAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int METRICNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGETAVERAGEVALUE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_;
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    public boolean hasTargetAverageValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getTargetAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getSelector());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTargetAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSelector());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource) obj;

      boolean result = true;
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasTargetAverageValue() == other.hasTargetAverageValue());
      if (hasTargetAverageValue()) {
        result = result && getTargetAverageValue().equals(other.getTargetAverageValue());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasTargetAverageValue()) {
        hash = (37 * hash) + TARGETAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTargetAverageValue().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodsMetricSource indicates how to scale on a metric describing each pod in
     * the current scale target (for example, transactions-processed-per-second).
     * The values will be averaged together before being compared to the target
     * value.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.PodsMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.PodsMetricSource)
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTargetAverageValueFieldBuilder();
          getSelectorFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (targetAverageValueBuilder_ == null) {
          result.targetAverageValue_ = targetAverageValue_;
        } else {
          result.targetAverageValue_ = targetAverageValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource) {
          return mergeFrom((io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource.getDefaultInstance())
          return this;
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000001;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasTargetAverageValue()) {
          mergeTargetAverageValue(other.getTargetAverageValue());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          targetAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public boolean hasTargetAverageValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        } else {
          return targetAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public Builder setTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetAverageValue_ = value;
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public Builder setTargetAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public Builder mergeTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && targetAverageValue_ != null
              && targetAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            targetAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(targetAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            targetAverageValue_ = value;
          }
          onChanged();
        } else {
          targetAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public Builder clearTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
          onChanged();
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getTargetAverageValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getTargetAverageValueOrBuilder() {
        if (targetAverageValueBuilder_ != null) {
          return targetAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getTargetAverageValueFieldBuilder() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getTargetAverageValue(), getParentForChildren(), isClean());
          targetAverageValue_ = null;
        }
        return targetAverageValueBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.PodsMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.PodsMetricSource)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodsMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<PodsMetricSource>() {
          @java.lang.Override
          public PodsMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodsMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodsMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodsMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodsMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.PodsMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    boolean hasMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    boolean hasCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder();

    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodsMetricStatus indicates the current value of a metric describing each pod in
   * the current scale target (for example, transactions-processed-per-second).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.PodsMetricStatus}
   */
  public static final class PodsMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.PodsMetricStatus)
      PodsMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodsMetricStatus.newBuilder() to construct.
    private PodsMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodsMetricStatus() {
      metricName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodsMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                metricName_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = currentAverageValue_.toBuilder();
                }
                currentAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(currentAverageValue_);
                  currentAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int METRICNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public boolean hasMetricName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          metricName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * metricName is the name of the metric in question
     * </pre>
     *
     * <code>optional string metricName = 1;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURRENTAVERAGEVALUE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_;
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    public boolean hasCurrentAverageValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getCurrentAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getSelector());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCurrentAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSelector());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus) obj;

      boolean result = true;
      result = result && (hasMetricName() == other.hasMetricName());
      if (hasMetricName()) {
        result = result && getMetricName().equals(other.getMetricName());
      }
      result = result && (hasCurrentAverageValue() == other.hasCurrentAverageValue());
      if (hasCurrentAverageValue()) {
        result = result && getCurrentAverageValue().equals(other.getCurrentAverageValue());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetricName()) {
        hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMetricName().hashCode();
      }
      if (hasCurrentAverageValue()) {
        hash = (37 * hash) + CURRENTAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentAverageValue().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodsMetricStatus indicates the current value of a metric describing each pod in
     * the current scale target (for example, transactions-processed-per-second).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.PodsMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.PodsMetricStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getCurrentAverageValueFieldBuilder();
          getSelectorFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        metricName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.metricName_ = metricName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (currentAverageValueBuilder_ == null) {
          result.currentAverageValue_ = currentAverageValue_;
        } else {
          result.currentAverageValue_ = currentAverageValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus) {
          return mergeFrom((io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus.getDefaultInstance())
          return this;
        if (other.hasMetricName()) {
          bitField0_ |= 0x00000001;
          metricName_ = other.metricName_;
          onChanged();
        }
        if (other.hasCurrentAverageValue()) {
          mergeCurrentAverageValue(other.getCurrentAverageValue());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public boolean hasMetricName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            metricName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder clearMetricName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * metricName is the name of the metric in question
       * </pre>
       *
       * <code>optional string metricName = 1;</code>
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        metricName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          currentAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public boolean hasCurrentAverageValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        } else {
          return currentAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public Builder setCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentAverageValue_ = value;
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public Builder setCurrentAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public Builder mergeCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && currentAverageValue_ != null
              && currentAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            currentAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(currentAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            currentAverageValue_ = value;
          }
          onChanged();
        } else {
          currentAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public Builder clearCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
          onChanged();
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getCurrentAverageValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurrentAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getCurrentAverageValueOrBuilder() {
        if (currentAverageValueBuilder_ != null) {
          return currentAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getCurrentAverageValueFieldBuilder() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getCurrentAverageValue(), getParentForChildren(), isClean());
          currentAverageValue_ = null;
        }
        return currentAverageValueBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.PodsMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.PodsMetricStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodsMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<PodsMetricStatus>() {
          @java.lang.Override
          public PodsMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodsMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodsMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodsMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.PodsMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ResourceMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * targetAverageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 targetAverageUtilization = 2;</code>
     */
    boolean hasTargetAverageUtilization();
    /**
     *
     *
     * <pre>
     * targetAverageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 targetAverageUtilization = 2;</code>
     */
    int getTargetAverageUtilization();

    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    boolean hasTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue();
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ResourceMetricSource indicates how to scale on a resource metric known to
   * Kubernetes, as specified in requests and limits, describing each pod in the
   * current scale target (e.g. CPU or memory).  The values will be averaged
   * together before being compared to the target.  Such metrics are built in to
   * Kubernetes, and have special scaling options on top of those available to
   * normal per-pod metrics using the "pods" source.  Only one "target" type
   * should be set.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ResourceMetricSource}
   */
  public static final class ResourceMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ResourceMetricSource)
      ResourceMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceMetricSource.newBuilder() to construct.
    private ResourceMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceMetricSource() {
      name_ = "";
      targetAverageUtilization_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                targetAverageUtilization_ = input.readInt32();
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = targetAverageValue_.toBuilder();
                }
                targetAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(targetAverageValue_);
                  targetAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGETAVERAGEUTILIZATION_FIELD_NUMBER = 2;
    private int targetAverageUtilization_;
    /**
     *
     *
     * <pre>
     * targetAverageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 targetAverageUtilization = 2;</code>
     */
    public boolean hasTargetAverageUtilization() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * targetAverageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 targetAverageUtilization = 2;</code>
     */
    public int getTargetAverageUtilization() {
      return targetAverageUtilization_;
    }

    public static final int TARGETAVERAGEVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_;
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    public boolean hasTargetAverageValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * targetAverageValue is the target value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getTargetAverageValueOrBuilder() {
      return targetAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : targetAverageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, targetAverageUtilization_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getTargetAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeInt32Size(2, targetAverageUtilization_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasTargetAverageUtilization() == other.hasTargetAverageUtilization());
      if (hasTargetAverageUtilization()) {
        result = result && (getTargetAverageUtilization() == other.getTargetAverageUtilization());
      }
      result = result && (hasTargetAverageValue() == other.hasTargetAverageValue());
      if (hasTargetAverageValue()) {
        result = result && getTargetAverageValue().equals(other.getTargetAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasTargetAverageUtilization()) {
        hash = (37 * hash) + TARGETAVERAGEUTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getTargetAverageUtilization();
      }
      if (hasTargetAverageValue()) {
        hash = (37 * hash) + TARGETAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTargetAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceMetricSource indicates how to scale on a resource metric known to
     * Kubernetes, as specified in requests and limits, describing each pod in the
     * current scale target (e.g. CPU or memory).  The values will be averaged
     * together before being compared to the target.  Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available to
     * normal per-pod metrics using the "pods" source.  Only one "target" type
     * should be set.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ResourceMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ResourceMetricSource)
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTargetAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        targetAverageUtilization_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.targetAverageUtilization_ = targetAverageUtilization_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (targetAverageValueBuilder_ == null) {
          result.targetAverageValue_ = targetAverageValue_;
        } else {
          result.targetAverageValue_ = targetAverageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasTargetAverageUtilization()) {
          setTargetAverageUtilization(other.getTargetAverageUtilization());
        }
        if (other.hasTargetAverageValue()) {
          mergeTargetAverageValue(other.getTargetAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int targetAverageUtilization_;
      /**
       *
       *
       * <pre>
       * targetAverageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 targetAverageUtilization = 2;</code>
       */
      public boolean hasTargetAverageUtilization() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * targetAverageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 targetAverageUtilization = 2;</code>
       */
      public int getTargetAverageUtilization() {
        return targetAverageUtilization_;
      }
      /**
       *
       *
       * <pre>
       * targetAverageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 targetAverageUtilization = 2;</code>
       */
      public Builder setTargetAverageUtilization(int value) {
        bitField0_ |= 0x00000002;
        targetAverageUtilization_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 targetAverageUtilization = 2;</code>
       */
      public Builder clearTargetAverageUtilization() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetAverageUtilization_ = 0;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity targetAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          targetAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public boolean hasTargetAverageValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        } else {
          return targetAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public Builder setTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetAverageValue_ = value;
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public Builder setTargetAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          targetAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public Builder mergeTargetAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (targetAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && targetAverageValue_ != null
              && targetAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            targetAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(targetAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            targetAverageValue_ = value;
          }
          onChanged();
        } else {
          targetAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public Builder clearTargetAverageValue() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValue_ = null;
          onChanged();
        } else {
          targetAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getTargetAverageValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTargetAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getTargetAverageValueOrBuilder() {
        if (targetAverageValueBuilder_ != null) {
          return targetAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return targetAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : targetAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * targetAverageValue is the target value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity targetAverageValue = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getTargetAverageValueFieldBuilder() {
        if (targetAverageValueBuilder_ == null) {
          targetAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getTargetAverageValue(), getParentForChildren(), isClean());
          targetAverageValue_ = null;
        }
        return targetAverageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ResourceMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ResourceMetricSource)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ResourceMetricSource>() {
          @java.lang.Override
          public ResourceMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.  It will only be
     * present if `targetAverageValue` was set in the corresponding metric
     * specification.
     * +optional
     * </pre>
     *
     * <code>optional int32 currentAverageUtilization = 2;</code>
     */
    boolean hasCurrentAverageUtilization();
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.  It will only be
     * present if `targetAverageValue` was set in the corresponding metric
     * specification.
     * +optional
     * </pre>
     *
     * <code>optional int32 currentAverageUtilization = 2;</code>
     */
    int getCurrentAverageUtilization();

    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    boolean hasCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue();
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ResourceMetricStatus indicates the current value of a resource metric known to
   * Kubernetes, as specified in requests and limits, describing each pod in the
   * current scale target (e.g. CPU or memory).  Such metrics are built in to
   * Kubernetes, and have special scaling options on top of those available to
   * normal per-pod metrics using the "pods" source.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus}
   */
  public static final class ResourceMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus)
      ResourceMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceMetricStatus.newBuilder() to construct.
    private ResourceMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceMetricStatus() {
      name_ = "";
      currentAverageUtilization_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                currentAverageUtilization_ = input.readInt32();
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = currentAverageValue_.toBuilder();
                }
                currentAverageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(currentAverageValue_);
                  currentAverageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta1Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.class,
              io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURRENTAVERAGEUTILIZATION_FIELD_NUMBER = 2;
    private int currentAverageUtilization_;
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.  It will only be
     * present if `targetAverageValue` was set in the corresponding metric
     * specification.
     * +optional
     * </pre>
     *
     * <code>optional int32 currentAverageUtilization = 2;</code>
     */
    public boolean hasCurrentAverageUtilization() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.  It will only be
     * present if `targetAverageValue` was set in the corresponding metric
     * specification.
     * +optional
     * </pre>
     *
     * <code>optional int32 currentAverageUtilization = 2;</code>
     */
    public int getCurrentAverageUtilization() {
      return currentAverageUtilization_;
    }

    public static final int CURRENTAVERAGEVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_;
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    public boolean hasCurrentAverageValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }
    /**
     *
     *
     * <pre>
     * currentAverageValue is the current value of the average of the
     * resource metric across all relevant pods, as a raw value (instead of as
     * a percentage of the request), similar to the "pods" metric source type.
     * It will always be set, regardless of the corresponding metric specification.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getCurrentAverageValueOrBuilder() {
      return currentAverageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : currentAverageValue_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, currentAverageUtilization_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getCurrentAverageValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeInt32Size(2, currentAverageUtilization_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCurrentAverageValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus other =
          (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasCurrentAverageUtilization() == other.hasCurrentAverageUtilization());
      if (hasCurrentAverageUtilization()) {
        result = result && (getCurrentAverageUtilization() == other.getCurrentAverageUtilization());
      }
      result = result && (hasCurrentAverageValue() == other.hasCurrentAverageValue());
      if (hasCurrentAverageValue()) {
        result = result && getCurrentAverageValue().equals(other.getCurrentAverageValue());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasCurrentAverageUtilization()) {
        hash = (37 * hash) + CURRENTAVERAGEUTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentAverageUtilization();
      }
      if (hasCurrentAverageValue()) {
        hash = (37 * hash) + CURRENTAVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentAverageValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceMetricStatus indicates the current value of a resource metric known to
     * Kubernetes, as specified in requests and limits, describing each pod in the
     * current scale target (e.g. CPU or memory).  Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available to
     * normal per-pod metrics using the "pods" source.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus)
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.class,
                io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getCurrentAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        currentAverageUtilization_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus build() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus result =
            new io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.currentAverageUtilization_ = currentAverageUtilization_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (currentAverageValueBuilder_ == null) {
          result.currentAverageValue_ = currentAverageValue_;
        } else {
          result.currentAverageValue_ = currentAverageValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasCurrentAverageUtilization()) {
          setCurrentAverageUtilization(other.getCurrentAverageUtilization());
        }
        if (other.hasCurrentAverageValue()) {
          mergeCurrentAverageValue(other.getCurrentAverageValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int currentAverageUtilization_;
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.  It will only be
       * present if `targetAverageValue` was set in the corresponding metric
       * specification.
       * +optional
       * </pre>
       *
       * <code>optional int32 currentAverageUtilization = 2;</code>
       */
      public boolean hasCurrentAverageUtilization() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.  It will only be
       * present if `targetAverageValue` was set in the corresponding metric
       * specification.
       * +optional
       * </pre>
       *
       * <code>optional int32 currentAverageUtilization = 2;</code>
       */
      public int getCurrentAverageUtilization() {
        return currentAverageUtilization_;
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.  It will only be
       * present if `targetAverageValue` was set in the corresponding metric
       * specification.
       * +optional
       * </pre>
       *
       * <code>optional int32 currentAverageUtilization = 2;</code>
       */
      public Builder setCurrentAverageUtilization(int value) {
        bitField0_ |= 0x00000002;
        currentAverageUtilization_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.  It will only be
       * present if `targetAverageValue` was set in the corresponding metric
       * specification.
       * +optional
       * </pre>
       *
       * <code>optional int32 currentAverageUtilization = 2;</code>
       */
      public Builder clearCurrentAverageUtilization() {
        bitField0_ = (bitField0_ & ~0x00000002);
        currentAverageUtilization_ = 0;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity currentAverageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          currentAverageValueBuilder_;
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public boolean hasCurrentAverageValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        } else {
          return currentAverageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public Builder setCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentAverageValue_ = value;
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public Builder setCurrentAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = builderForValue.build();
          onChanged();
        } else {
          currentAverageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public Builder mergeCurrentAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (currentAverageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && currentAverageValue_ != null
              && currentAverageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            currentAverageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(currentAverageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            currentAverageValue_ = value;
          }
          onChanged();
        } else {
          currentAverageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public Builder clearCurrentAverageValue() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValue_ = null;
          onChanged();
        } else {
          currentAverageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getCurrentAverageValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCurrentAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder
          getCurrentAverageValueOrBuilder() {
        if (currentAverageValueBuilder_ != null) {
          return currentAverageValueBuilder_.getMessageOrBuilder();
        } else {
          return currentAverageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : currentAverageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * currentAverageValue is the current value of the average of the
       * resource metric across all relevant pods, as a raw value (instead of as
       * a percentage of the request), similar to the "pods" metric source type.
       * It will always be set, regardless of the corresponding metric specification.
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.api.resource.Quantity currentAverageValue = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getCurrentAverageValueFieldBuilder() {
        if (currentAverageValueBuilder_ == null) {
          currentAverageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getCurrentAverageValue(), getParentForChildren(), isClean());
          currentAverageValue_ = null;
        }
        return currentAverageValueBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta1.ResourceMetricStatus)
    private static final io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ResourceMetricStatus>() {
          @java.lang.Override
          public ResourceMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta1Autoscaling.ResourceMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.k8s.io/api/autoscaling/v2beta1/generat"
          + "ed.proto\022\036k8s.io.api.autoscaling.v2beta1"
          + "\032\"k8s.io/api/core/v1/generated.proto\0324k8"
          + "s.io/apimachinery/pkg/api/resource/gener"
          + "ated.proto\0324k8s.io/apimachinery/pkg/apis"
          + "/meta/v1/generated.proto\032/k8s.io/apimach"
          + "inery/pkg/runtime/generated.proto\0326k8s.i"
          + "o/apimachinery/pkg/runtime/schema/genera"
          + "ted.proto\"M\n\033CrossVersionObjectReference"
          + "\022\014\n\004kind\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\022\n\napiVersi"
          + "on\030\003 \001(\t\"\210\002\n\024ExternalMetricSource\022\022\n\nmet"
          + "ricName\030\001 \001(\t\022K\n\016metricSelector\030\002 \001(\01323."
          + "k8s.io.apimachinery.pkg.apis.meta.v1.Lab"
          + "elSelector\022C\n\013targetValue\030\003 \001(\0132..k8s.io"
          + ".apimachinery.pkg.api.resource.Quantity\022"
          + "J\n\022targetAverageValue\030\004 \001(\0132..k8s.io.api"
          + "machinery.pkg.api.resource.Quantity\"\212\002\n\024"
          + "ExternalMetricStatus\022\022\n\nmetricName\030\001 \001(\t"
          + "\022K\n\016metricSelector\030\002 \001(\01323.k8s.io.apimac"
          + "hinery.pkg.apis.meta.v1.LabelSelector\022D\n"
          + "\014currentValue\030\003 \001(\0132..k8s.io.apimachiner"
          + "y.pkg.api.resource.Quantity\022K\n\023currentAv"
          + "erageValue\030\004 \001(\0132..k8s.io.apimachinery.p"
          + "kg.api.resource.Quantity\"\367\001\n\027HorizontalP"
          + "odAutoscaler\022B\n\010metadata\030\001 \001(\01320.k8s.io."
          + "apimachinery.pkg.apis.meta.v1.ObjectMeta"
          + "\022I\n\004spec\030\002 \001(\0132;.k8s.io.api.autoscaling."
          + "v2beta1.HorizontalPodAutoscalerSpec\022M\n\006s"
          + "tatus\030\003 \001(\0132=.k8s.io.api.autoscaling.v2b"
          + "eta1.HorizontalPodAutoscalerStatus\"\251\001\n H"
          + "orizontalPodAutoscalerCondition\022\014\n\004type\030"
          + "\001 \001(\t\022\016\n\006status\030\002 \001(\t\022F\n\022lastTransitionT"
          + "ime\030\003 \001(\0132*.k8s.io.apimachinery.pkg.apis"
          + ".meta.v1.Time\022\016\n\006reason\030\004 \001(\t\022\017\n\007message"
          + "\030\005 \001(\t\"\247\001\n\033HorizontalPodAutoscalerList\022@"
          + "\n\010metadata\030\001 \001(\0132..k8s.io.apimachinery.p"
          + "kg.apis.meta.v1.ListMeta\022F\n\005items\030\002 \003(\0132"
          + "7.k8s.io.api.autoscaling.v2beta1.Horizon"
          + "talPodAutoscaler\"\331\001\n\033HorizontalPodAutosc"
          + "alerSpec\022S\n\016scaleTargetRef\030\001 \001(\0132;.k8s.i"
          + "o.api.autoscaling.v2beta1.CrossVersionOb"
          + "jectReference\022\023\n\013minReplicas\030\002 \001(\005\022\023\n\013ma"
          + "xReplicas\030\003 \001(\005\022;\n\007metrics\030\004 \003(\0132*.k8s.i"
          + "o.api.autoscaling.v2beta1.MetricSpec\"\314\002\n"
          + "\035HorizontalPodAutoscalerStatus\022\032\n\022observ"
          + "edGeneration\030\001 \001(\003\022A\n\rlastScaleTime\030\002 \001("
          + "\0132*.k8s.io.apimachinery.pkg.apis.meta.v1"
          + ".Time\022\027\n\017currentReplicas\030\003 \001(\005\022\027\n\017desire"
          + "dReplicas\030\004 \001(\005\022D\n\016currentMetrics\030\005 \003(\0132"
          + ",.k8s.io.api.autoscaling.v2beta1.MetricS"
          + "tatus\022T\n\nconditions\030\006 \003(\0132@.k8s.io.api.a"
          + "utoscaling.v2beta1.HorizontalPodAutoscal"
          + "erCondition\"\256\002\n\nMetricSpec\022\014\n\004type\030\001 \001(\t"
          + "\022B\n\006object\030\002 \001(\01322.k8s.io.api.autoscalin"
          + "g.v2beta1.ObjectMetricSource\022>\n\004pods\030\003 \001"
          + "(\01320.k8s.io.api.autoscaling.v2beta1.Pods"
          + "MetricSource\022F\n\010resource\030\004 \001(\01324.k8s.io."
          + "api.autoscaling.v2beta1.ResourceMetricSo"
          + "urce\022F\n\010external\030\005 \001(\01324.k8s.io.api.auto"
          + "scaling.v2beta1.ExternalMetricSource\"\260\002\n"
          + "\014MetricStatus\022\014\n\004type\030\001 \001(\t\022B\n\006object\030\002 "
          + "\001(\01322.k8s.io.api.autoscaling.v2beta1.Obj"
          + "ectMetricStatus\022>\n\004pods\030\003 \001(\01320.k8s.io.a"
          + "pi.autoscaling.v2beta1.PodsMetricStatus\022"
          + "F\n\010resource\030\004 \001(\01324.k8s.io.api.autoscali"
          + "ng.v2beta1.ResourceMetricStatus\022F\n\010exter"
          + "nal\030\005 \001(\01324.k8s.io.api.autoscaling.v2bet"
          + "a1.ExternalMetricStatus\"\307\002\n\022ObjectMetric"
          + "Source\022K\n\006target\030\001 \001(\0132;.k8s.io.api.auto"
          + "scaling.v2beta1.CrossVersionObjectRefere"
          + "nce\022\022\n\nmetricName\030\002 \001(\t\022C\n\013targetValue\030\003"
          + " \001(\0132..k8s.io.apimachinery.pkg.api.resou"
          + "rce.Quantity\022E\n\010selector\030\004 \001(\01323.k8s.io."
          + "apimachinery.pkg.apis.meta.v1.LabelSelec"
          + "tor\022D\n\014averageValue\030\005 \001(\0132..k8s.io.apima"
          + "chinery.pkg.api.resource.Quantity\"\310\002\n\022Ob"
          + "jectMetricStatus\022K\n\006target\030\001 \001(\0132;.k8s.i"
          + "o.api.autoscaling.v2beta1.CrossVersionOb"
          + "jectReference\022\022\n\nmetricName\030\002 \001(\t\022D\n\014cur"
          + "rentValue\030\003 \001(\0132..k8s.io.apimachinery.pk"
          + "g.api.resource.Quantity\022E\n\010selector\030\004 \001("
          + "\01323.k8s.io.apimachinery.pkg.apis.meta.v1"
          + ".LabelSelector\022D\n\014averageValue\030\005 \001(\0132..k"
          + "8s.io.apimachinery.pkg.api.resource.Quan"
          + "tity\"\271\001\n\020PodsMetricSource\022\022\n\nmetricName\030"
          + "\001 \001(\t\022J\n\022targetAverageValue\030\002 \001(\0132..k8s."
          + "io.apimachinery.pkg.api.resource.Quantit"
          + "y\022E\n\010selector\030\003 \001(\01323.k8s.io.apimachiner"
          + "y.pkg.apis.meta.v1.LabelSelector\"\272\001\n\020Pod"
          + "sMetricStatus\022\022\n\nmetricName\030\001 \001(\t\022K\n\023cur"
          + "rentAverageValue\030\002 \001(\0132..k8s.io.apimachi"
          + "nery.pkg.api.resource.Quantity\022E\n\010select"
          + "or\030\003 \001(\01323.k8s.io.apimachinery.pkg.apis."
          + "meta.v1.LabelSelector\"\222\001\n\024ResourceMetric"
          + "Source\022\014\n\004name\030\001 \001(\t\022 \n\030targetAverageUti"
          + "lization\030\002 \001(\005\022J\n\022targetAverageValue\030\003 \001"
          + "(\0132..k8s.io.apimachinery.pkg.api.resourc"
          + "e.Quantity\"\224\001\n\024ResourceMetricStatus\022\014\n\004n"
          + "ame\030\001 \001(\t\022!\n\031currentAverageUtilization\030\002"
          + " \001(\005\022K\n\023currentAverageValue\030\003 \001(\0132..k8s."
          + "io.apimachinery.pkg.api.resource.Quantit"
          + "yB9\n\032io.kubernetes.client.protoB\022V2beta1"
          + "AutoscalingZ\007v2beta1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Resource.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_CrossVersionObjectReference_descriptor,
            new java.lang.String[] {
              "Kind", "Name", "ApiVersion",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricSource_descriptor,
            new java.lang.String[] {
              "MetricName", "MetricSelector", "TargetValue", "TargetAverageValue",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ExternalMetricStatus_descriptor,
            new java.lang.String[] {
              "MetricName", "MetricSelector", "CurrentValue", "CurrentAverageValue",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscaler_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerCondition_descriptor,
            new java.lang.String[] {
              "Type", "Status", "LastTransitionTime", "Reason", "Message",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerSpec_descriptor,
            new java.lang.String[] {
              "ScaleTargetRef", "MinReplicas", "MaxReplicas", "Metrics",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_HorizontalPodAutoscalerStatus_descriptor,
            new java.lang.String[] {
              "ObservedGeneration",
              "LastScaleTime",
              "CurrentReplicas",
              "DesiredReplicas",
              "CurrentMetrics",
              "Conditions",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_MetricSpec_descriptor,
            new java.lang.String[] {
              "Type", "Object", "Pods", "Resource", "External",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_MetricStatus_descriptor,
            new java.lang.String[] {
              "Type", "Object", "Pods", "Resource", "External",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricSource_descriptor,
            new java.lang.String[] {
              "Target", "MetricName", "TargetValue", "Selector", "AverageValue",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ObjectMetricStatus_descriptor,
            new java.lang.String[] {
              "Target", "MetricName", "CurrentValue", "Selector", "AverageValue",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricSource_descriptor,
            new java.lang.String[] {
              "MetricName", "TargetAverageValue", "Selector",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_PodsMetricStatus_descriptor,
            new java.lang.String[] {
              "MetricName", "CurrentAverageValue", "Selector",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricSource_descriptor,
            new java.lang.String[] {
              "Name", "TargetAverageUtilization", "TargetAverageValue",
            });
    internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta1_ResourceMetricStatus_descriptor,
            new java.lang.String[] {
              "Name", "CurrentAverageUtilization", "CurrentAverageValue",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Resource.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
