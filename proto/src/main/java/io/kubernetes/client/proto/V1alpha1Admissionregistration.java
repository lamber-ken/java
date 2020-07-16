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

public final class V1alpha1Admissionregistration {
  private V1alpha1Admissionregistration() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface AdmissionHookClientConfigOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    boolean hasService();
    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference getService();
    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder
        getServiceOrBuilder();

    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    boolean hasUrlPath();
    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    java.lang.String getUrlPath();
    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    com.google.protobuf.ByteString getUrlPathBytes();

    /**
     *
     *
     * <pre>
     * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
     * Required
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    boolean hasCaBundle();
    /**
     *
     *
     * <pre>
     * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
     * Required
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    com.google.protobuf.ByteString getCaBundle();
  }
  /**
   *
   *
   * <pre>
   * AdmissionHookClientConfig contains the information to make a TLS
   * connection with the webhook
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig}
   */
  public static final class AdmissionHookClientConfig extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig)
      AdmissionHookClientConfigOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionHookClientConfig.newBuilder() to construct.
    private AdmissionHookClientConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionHookClientConfig() {
      urlPath_ = "";
      caBundle_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionHookClientConfig(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = service_.toBuilder();
                }
                service_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(service_);
                  service_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                bitField0_ |= 0x00000004;
                caBundle_ = input.readBytes();
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                urlPath_ = bs;
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
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .Builder.class);
    }

    private int bitField0_;
    public static final int SERVICE_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference service_;
    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference getService() {
      return service_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
              .getDefaultInstance()
          : service_;
    }
    /**
     *
     *
     * <pre>
     * Service is a reference to the service for this webhook. If there is only
     * one port open for the service, that port will be used. If there are multiple
     * ports open, port 443 will be used if it is open, otherwise it is an error.
     * Required
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder
        getServiceOrBuilder() {
      return service_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
              .getDefaultInstance()
          : service_;
    }

    public static final int URLPATH_FIELD_NUMBER = 3;
    private volatile java.lang.Object urlPath_;
    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    public boolean hasUrlPath() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    public java.lang.String getUrlPath() {
      java.lang.Object ref = urlPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          urlPath_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
     * </pre>
     *
     * <code>optional string urlPath = 3;</code>
     */
    public com.google.protobuf.ByteString getUrlPathBytes() {
      java.lang.Object ref = urlPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        urlPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CABUNDLE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString caBundle_;
    /**
     *
     *
     * <pre>
     * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
     * Required
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    public boolean hasCaBundle() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
     * Required
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    public com.google.protobuf.ByteString getCaBundle() {
      return caBundle_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getService());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(2, caBundle_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, urlPath_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getService());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, caBundle_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, urlPath_);
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
          io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig) obj;

      boolean result = true;
      result = result && (hasService() == other.hasService());
      if (hasService()) {
        result = result && getService().equals(other.getService());
      }
      result = result && (hasUrlPath() == other.hasUrlPath());
      if (hasUrlPath()) {
        result = result && getUrlPath().equals(other.getUrlPath());
      }
      result = result && (hasCaBundle() == other.hasCaBundle());
      if (hasCaBundle()) {
        result = result && getCaBundle().equals(other.getCaBundle());
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
      if (hasService()) {
        hash = (37 * hash) + SERVICE_FIELD_NUMBER;
        hash = (53 * hash) + getService().hashCode();
      }
      if (hasUrlPath()) {
        hash = (37 * hash) + URLPATH_FIELD_NUMBER;
        hash = (53 * hash) + getUrlPath().hashCode();
      }
      if (hasCaBundle()) {
        hash = (37 * hash) + CABUNDLE_FIELD_NUMBER;
        hash = (53 * hash) + getCaBundle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * AdmissionHookClientConfig contains the information to make a TLS
     * connection with the webhook
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig)
        io.kubernetes.client.proto.V1alpha1Admissionregistration
            .AdmissionHookClientConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                    .class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getServiceFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (serviceBuilder_ == null) {
          service_ = null;
        } else {
          serviceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        urlPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        caBundle_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (serviceBuilder_ == null) {
          result.service_ = service_;
        } else {
          result.service_ = serviceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.urlPath_ = urlPath_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.caBundle_ = caBundle_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                .getDefaultInstance()) return this;
        if (other.hasService()) {
          mergeService(other.getService());
        }
        if (other.hasUrlPath()) {
          bitField0_ |= 0x00000002;
          urlPath_ = other.urlPath_;
          onChanged();
        }
        if (other.hasCaBundle()) {
          setCaBundle(other.getCaBundle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig)
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

      private io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference service_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder>
          serviceBuilder_;
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public boolean hasService() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
          getService() {
        if (serviceBuilder_ == null) {
          return service_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                  .getDefaultInstance()
              : service_;
        } else {
          return serviceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public Builder setService(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference value) {
        if (serviceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          service_ = value;
          onChanged();
        } else {
          serviceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public Builder setService(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder
              builderForValue) {
        if (serviceBuilder_ == null) {
          service_ = builderForValue.build();
          onChanged();
        } else {
          serviceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public Builder mergeService(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference value) {
        if (serviceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && service_ != null
              && service_
                  != io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                      .getDefaultInstance()) {
            service_ =
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                    .newBuilder(service_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            service_ = value;
          }
          onChanged();
        } else {
          serviceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public Builder clearService() {
        if (serviceBuilder_ == null) {
          service_ = null;
          onChanged();
        } else {
          serviceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder
          getServiceBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getServiceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder
          getServiceOrBuilder() {
        if (serviceBuilder_ != null) {
          return serviceBuilder_.getMessageOrBuilder();
        } else {
          return service_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                  .getDefaultInstance()
              : service_;
        }
      }
      /**
       *
       *
       * <pre>
       * Service is a reference to the service for this webhook. If there is only
       * one port open for the service, that port will be used. If there are multiple
       * ports open, port 443 will be used if it is open, otherwise it is an error.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.ServiceReference service = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder>
          getServiceFieldBuilder() {
        if (serviceBuilder_ == null) {
          serviceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ServiceReferenceOrBuilder>(getService(), getParentForChildren(), isClean());
          service_ = null;
        }
        return serviceBuilder_;
      }

      private java.lang.Object urlPath_ = "";
      /**
       *
       *
       * <pre>
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public boolean hasUrlPath() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public java.lang.String getUrlPath() {
        java.lang.Object ref = urlPath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            urlPath_ = s;
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
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public com.google.protobuf.ByteString getUrlPathBytes() {
        java.lang.Object ref = urlPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          urlPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public Builder setUrlPath(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        urlPath_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public Builder clearUrlPath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        urlPath_ = getDefaultInstance().getUrlPath();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * URLPath is an optional field that specifies the URL path to use when posting the AdmissionReview object.
       * </pre>
       *
       * <code>optional string urlPath = 3;</code>
       */
      public Builder setUrlPathBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        urlPath_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString caBundle_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
       * Required
       * </pre>
       *
       * <code>optional bytes caBundle = 2;</code>
       */
      public boolean hasCaBundle() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
       * Required
       * </pre>
       *
       * <code>optional bytes caBundle = 2;</code>
       */
      public com.google.protobuf.ByteString getCaBundle() {
        return caBundle_;
      }
      /**
       *
       *
       * <pre>
       * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
       * Required
       * </pre>
       *
       * <code>optional bytes caBundle = 2;</code>
       */
      public Builder setCaBundle(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        caBundle_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * CABundle is a PEM encoded CA bundle which will be used to validate webhook's server certificate.
       * Required
       * </pre>
       *
       * <code>optional bytes caBundle = 2;</code>
       */
      public Builder clearCaBundle() {
        bitField0_ = (bitField0_ & ~0x00000004);
        caBundle_ = getDefaultInstance().getCaBundle();
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .AdmissionHookClientConfig
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionHookClientConfig> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionHookClientConfig>() {
          public AdmissionHookClientConfig parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionHookClientConfig(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionHookClientConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionHookClientConfig> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalAdmissionHookOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    boolean hasClientConfig();
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        getClientConfig();
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfigOrBuilder
        getClientConfigOrBuilder();

    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
        getRulesList();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations getRules(int index);
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    int getRulesCount();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .RuleWithOperationsOrBuilder>
        getRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder
        getRulesOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    boolean hasFailurePolicy();
    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    java.lang.String getFailurePolicy();
    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    com.google.protobuf.ByteString getFailurePolicyBytes();
  }
  /**
   *
   *
   * <pre>
   * ExternalAdmissionHook describes an external admission webhook and the
   * resources and operations it applies to.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook}
   */
  public static final class ExternalAdmissionHook extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook)
      ExternalAdmissionHookOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalAdmissionHook.newBuilder() to construct.
    private ExternalAdmissionHook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalAdmissionHook() {
      name_ = "";
      rules_ = java.util.Collections.emptyList();
      failurePolicy_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalAdmissionHook(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                        .Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = clientConfig_.toBuilder();
                }
                clientConfig_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration
                            .AdmissionHookClientConfig.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(clientConfig_);
                  clientConfig_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  rules_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Admissionregistration
                              .RuleWithOperations>();
                  mutable_bitField0_ |= 0x00000004;
                }
                rules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
                            .PARSER,
                        extensionRegistry));
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                failurePolicy_ = bs;
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
                  .class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
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
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
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
     * The name of the external admission webhook.
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
     * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required.
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

    public static final int CLIENTCONFIG_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        clientConfig_;
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    public boolean hasClientConfig() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
        getClientConfig() {
      return clientConfig_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              .getDefaultInstance()
          : clientConfig_;
    }
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .AdmissionHookClientConfigOrBuilder
        getClientConfigOrBuilder() {
      return clientConfig_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              .getDefaultInstance()
          : clientConfig_;
    }

    public static final int RULES_FIELD_NUMBER = 3;
    private java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
        rules_;
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
        getRulesList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .RuleWithOperationsOrBuilder>
        getRulesOrBuilderList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    public int getRulesCount() {
      return rules_.size();
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations getRules(
        int index) {
      return rules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder
        getRulesOrBuilder(int index) {
      return rules_.get(index);
    }

    public static final int FAILUREPOLICY_FIELD_NUMBER = 4;
    private volatile java.lang.Object failurePolicy_;
    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    public boolean hasFailurePolicy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    public java.lang.String getFailurePolicy() {
      java.lang.Object ref = failurePolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          failurePolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
     * allowed values are Ignore or Fail. Defaults to Ignore.
     * +optional
     * </pre>
     *
     * <code>optional string failurePolicy = 4;</code>
     */
    public com.google.protobuf.ByteString getFailurePolicyBytes() {
      java.lang.Object ref = failurePolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        failurePolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getClientConfig());
      }
      for (int i = 0; i < rules_.size(); i++) {
        output.writeMessage(3, rules_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, failurePolicy_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getClientConfig());
      }
      for (int i = 0; i < rules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, rules_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, failurePolicy_);
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
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasClientConfig() == other.hasClientConfig());
      if (hasClientConfig()) {
        result = result && getClientConfig().equals(other.getClientConfig());
      }
      result = result && getRulesList().equals(other.getRulesList());
      result = result && (hasFailurePolicy() == other.hasFailurePolicy());
      if (hasFailurePolicy()) {
        result = result && getFailurePolicy().equals(other.getFailurePolicy());
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
      if (hasClientConfig()) {
        hash = (37 * hash) + CLIENTCONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getClientConfig().hashCode();
      }
      if (getRulesCount() > 0) {
        hash = (37 * hash) + RULES_FIELD_NUMBER;
        hash = (53 * hash) + getRulesList().hashCode();
      }
      if (hasFailurePolicy()) {
        hash = (37 * hash) + FAILUREPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getFailurePolicy().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * ExternalAdmissionHook describes an external admission webhook and the
     * resources and operations it applies to.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                    .class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getClientConfigFieldBuilder();
          getRulesFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (clientConfigBuilder_ == null) {
          clientConfig_ = null;
        } else {
          clientConfigBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          rulesBuilder_.clear();
        }
        failurePolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (clientConfigBuilder_ == null) {
          result.clientConfig_ = clientConfig_;
        } else {
          result.clientConfig_ = clientConfigBuilder_.build();
        }
        if (rulesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            rules_ = java.util.Collections.unmodifiableList(rules_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.rules_ = rules_;
        } else {
          result.rules_ = rulesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.failurePolicy_ = failurePolicy_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasClientConfig()) {
          mergeClientConfig(other.getClientConfig());
        }
        if (rulesBuilder_ == null) {
          if (!other.rules_.isEmpty()) {
            if (rules_.isEmpty()) {
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureRulesIsMutable();
              rules_.addAll(other.rules_);
            }
            onChanged();
          }
        } else {
          if (!other.rules_.isEmpty()) {
            if (rulesBuilder_.isEmpty()) {
              rulesBuilder_.dispose();
              rulesBuilder_ = null;
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000004);
              rulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRulesFieldBuilder()
                      : null;
            } else {
              rulesBuilder_.addAllMessages(other.rules_);
            }
          }
        }
        if (other.hasFailurePolicy()) {
          bitField0_ |= 0x00000008;
          failurePolicy_ = other.failurePolicy_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook)
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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
       * The name of the external admission webhook.
       * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where
       * "imagepolicy" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required.
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

      private io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
          clientConfig_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .AdmissionHookClientConfigOrBuilder>
          clientConfigBuilder_;
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public boolean hasClientConfig() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
          getClientConfig() {
        if (clientConfigBuilder_ == null) {
          return clientConfig_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .getDefaultInstance()
              : clientConfig_;
        } else {
          return clientConfigBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder setClientConfig(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              value) {
        if (clientConfigBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          clientConfig_ = value;
          onChanged();
        } else {
          clientConfigBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder setClientConfig(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig.Builder
              builderForValue) {
        if (clientConfigBuilder_ == null) {
          clientConfig_ = builderForValue.build();
          onChanged();
        } else {
          clientConfigBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder mergeClientConfig(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              value) {
        if (clientConfigBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && clientConfig_ != null
              && clientConfig_
                  != io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .AdmissionHookClientConfig.getDefaultInstance()) {
            clientConfig_ =
                io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                    .newBuilder(clientConfig_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            clientConfig_ = value;
          }
          onChanged();
        } else {
          clientConfigBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder clearClientConfig() {
        if (clientConfigBuilder_ == null) {
          clientConfig_ = null;
          onChanged();
        } else {
          clientConfigBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
              .Builder
          getClientConfigBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getClientConfigFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .AdmissionHookClientConfigOrBuilder
          getClientConfigOrBuilder() {
        if (clientConfigBuilder_ != null) {
          return clientConfigBuilder_.getMessageOrBuilder();
        } else {
          return clientConfig_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .getDefaultInstance()
              : clientConfig_;
        }
      }
      /**
       *
       *
       * <pre>
       * ClientConfig defines how to communicate with the hook.
       * Required
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1alpha1.AdmissionHookClientConfig clientConfig = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .AdmissionHookClientConfigOrBuilder>
          getClientConfigFieldBuilder() {
        if (clientConfigBuilder_ == null) {
          clientConfigBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .AdmissionHookClientConfig,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.AdmissionHookClientConfig
                      .Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .AdmissionHookClientConfigOrBuilder>(
                  getClientConfig(), getParentForChildren(), isClean());
          clientConfig_ = null;
        }
        return clientConfigBuilder_;
      }

      private java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
          rules_ = java.util.Collections.emptyList();

      private void ensureRulesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          rules_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>(
                  rules_);
          bitField0_ |= 0x00000004;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder>
          rulesBuilder_;

      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
          getRulesList() {
        if (rulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rules_);
        } else {
          return rulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public int getRulesCount() {
        if (rulesBuilder_ == null) {
          return rules_.size();
        } else {
          return rulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations getRules(
          int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder setRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.set(index, value);
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder setRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
              builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.set(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(index, value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
              builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
              builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addAllRules(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations>
              values) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
          onChanged();
        } else {
          rulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder clearRules() {
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder removeRules(int index) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.remove(index);
          onChanged();
        } else {
          rulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
          getRulesBuilder(int index) {
        return getRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder
          getRulesOrBuilder(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .RuleWithOperationsOrBuilder>
          getRulesOrBuilderList() {
        if (rulesBuilder_ != null) {
          return rulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rules_);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
          addRulesBuilder() {
        return getRulesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
          addRulesBuilder(int index) {
        return getRulesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder>
          getRulesBuilderList() {
        return getRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder>
          getRulesFieldBuilder() {
        if (rulesBuilder_ == null) {
          rulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
                      .Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .RuleWithOperationsOrBuilder>(
                  rules_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          rules_ = null;
        }
        return rulesBuilder_;
      }

      private java.lang.Object failurePolicy_ = "";
      /**
       *
       *
       * <pre>
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public boolean hasFailurePolicy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public java.lang.String getFailurePolicy() {
        java.lang.Object ref = failurePolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            failurePolicy_ = s;
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
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public com.google.protobuf.ByteString getFailurePolicyBytes() {
        java.lang.Object ref = failurePolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          failurePolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public Builder setFailurePolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        failurePolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public Builder clearFailurePolicy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        failurePolicy_ = getDefaultInstance().getFailurePolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
       * allowed values are Ignore or Fail. Defaults to Ignore.
       * +optional
       * </pre>
       *
       * <code>optional string failurePolicy = 4;</code>
       */
      public Builder setFailurePolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        failurePolicy_ = value;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHook
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalAdmissionHook> PARSER =
        new com.google.protobuf.AbstractParser<ExternalAdmissionHook>() {
          public ExternalAdmissionHook parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalAdmissionHook(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalAdmissionHook> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalAdmissionHook> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalAdmissionHookConfigurationOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>
        getExternalAdmissionHooksList();
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        getExternalAdmissionHooks(int index);
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    int getExternalAdmissionHooksCount();
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookOrBuilder>
        getExternalAdmissionHooksOrBuilderList();
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookOrBuilder
        getExternalAdmissionHooksOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * ExternalAdmissionHookConfiguration describes the configuration of initializers.
   * </pre>
   *
   * Protobuf type {@code
   * k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration}
   */
  public static final class ExternalAdmissionHookConfiguration
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration)
      ExternalAdmissionHookConfigurationOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalAdmissionHookConfiguration.newBuilder() to construct.
    private ExternalAdmissionHookConfiguration(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalAdmissionHookConfiguration() {
      externalAdmissionHooks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalAdmissionHookConfiguration(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
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
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  externalAdmissionHooks_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Admissionregistration
                              .ExternalAdmissionHook>();
                  mutable_bitField0_ |= 0x00000002;
                }
                externalAdmissionHooks_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration
                            .ExternalAdmissionHook.PARSER,
                        extensionRegistry));
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
          externalAdmissionHooks_ = java.util.Collections.unmodifiableList(externalAdmissionHooks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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

    public static final int EXTERNALADMISSIONHOOKS_FIELD_NUMBER = 2;
    private java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>
        externalAdmissionHooks_;
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>
        getExternalAdmissionHooksList() {
      return externalAdmissionHooks_;
    }
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookOrBuilder>
        getExternalAdmissionHooksOrBuilderList() {
      return externalAdmissionHooks_;
    }
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    public int getExternalAdmissionHooksCount() {
      return externalAdmissionHooks_.size();
    }
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
        getExternalAdmissionHooks(int index) {
      return externalAdmissionHooks_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ExternalAdmissionHooks is a list of external admission webhooks and the
     * affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookOrBuilder
        getExternalAdmissionHooksOrBuilder(int index) {
      return externalAdmissionHooks_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < externalAdmissionHooks_.size(); i++) {
        output.writeMessage(2, externalAdmissionHooks_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < externalAdmissionHooks_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(
                2, externalAdmissionHooks_.get(i));
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
          io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
          other =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration)
                  obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result =
          result && getExternalAdmissionHooksList().equals(other.getExternalAdmissionHooksList());
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
      if (getExternalAdmissionHooksCount() > 0) {
        hash = (37 * hash) + EXTERNALADMISSIONHOOKS_FIELD_NUMBER;
        hash = (53 * hash) + getExternalAdmissionHooksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * ExternalAdmissionHookConfiguration describes the configuration of initializers.
     * </pre>
     *
     * Protobuf type {@code
     * k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration)
        io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfiguration.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfiguration.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration.newBuilder()
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
          getExternalAdmissionHooksFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (externalAdmissionHooksBuilder_ == null) {
          externalAdmissionHooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          externalAdmissionHooksBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration.getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
            result =
                new io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfiguration(this);
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
        if (externalAdmissionHooksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            externalAdmissionHooks_ =
                java.util.Collections.unmodifiableList(externalAdmissionHooks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.externalAdmissionHooks_ = externalAdmissionHooks_;
        } else {
          result.externalAdmissionHooks_ = externalAdmissionHooksBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfiguration) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration
              other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfiguration.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (externalAdmissionHooksBuilder_ == null) {
          if (!other.externalAdmissionHooks_.isEmpty()) {
            if (externalAdmissionHooks_.isEmpty()) {
              externalAdmissionHooks_ = other.externalAdmissionHooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureExternalAdmissionHooksIsMutable();
              externalAdmissionHooks_.addAll(other.externalAdmissionHooks_);
            }
            onChanged();
          }
        } else {
          if (!other.externalAdmissionHooks_.isEmpty()) {
            if (externalAdmissionHooksBuilder_.isEmpty()) {
              externalAdmissionHooksBuilder_.dispose();
              externalAdmissionHooksBuilder_ = null;
              externalAdmissionHooks_ = other.externalAdmissionHooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              externalAdmissionHooksBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getExternalAdmissionHooksFieldBuilder()
                      : null;
            } else {
              externalAdmissionHooksBuilder_.addAllMessages(other.externalAdmissionHooks_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration)
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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

      private java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>
          externalAdmissionHooks_ = java.util.Collections.emptyList();

      private void ensureExternalAdmissionHooksIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          externalAdmissionHooks_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>(
                  externalAdmissionHooks_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookOrBuilder>
          externalAdmissionHooksBuilder_;

      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook>
          getExternalAdmissionHooksList() {
        if (externalAdmissionHooksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(externalAdmissionHooks_);
        } else {
          return externalAdmissionHooksBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public int getExternalAdmissionHooksCount() {
        if (externalAdmissionHooksBuilder_ == null) {
          return externalAdmissionHooks_.size();
        } else {
          return externalAdmissionHooksBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
          getExternalAdmissionHooks(int index) {
        if (externalAdmissionHooksBuilder_ == null) {
          return externalAdmissionHooks_.get(index);
        } else {
          return externalAdmissionHooksBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder setExternalAdmissionHooks(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook value) {
        if (externalAdmissionHooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.set(index, value);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder setExternalAdmissionHooks(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
              builderForValue) {
        if (externalAdmissionHooksBuilder_ == null) {
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.set(index, builderForValue.build());
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder addExternalAdmissionHooks(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook value) {
        if (externalAdmissionHooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.add(value);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder addExternalAdmissionHooks(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook value) {
        if (externalAdmissionHooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.add(index, value);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder addExternalAdmissionHooks(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
              builderForValue) {
        if (externalAdmissionHooksBuilder_ == null) {
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.add(builderForValue.build());
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder addExternalAdmissionHooks(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
              builderForValue) {
        if (externalAdmissionHooksBuilder_ == null) {
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.add(index, builderForValue.build());
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder addAllExternalAdmissionHooks(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1alpha1Admissionregistration
                          .ExternalAdmissionHook>
              values) {
        if (externalAdmissionHooksBuilder_ == null) {
          ensureExternalAdmissionHooksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, externalAdmissionHooks_);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder clearExternalAdmissionHooks() {
        if (externalAdmissionHooksBuilder_ == null) {
          externalAdmissionHooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public Builder removeExternalAdmissionHooks(int index) {
        if (externalAdmissionHooksBuilder_ == null) {
          ensureExternalAdmissionHooksIsMutable();
          externalAdmissionHooks_.remove(index);
          onChanged();
        } else {
          externalAdmissionHooksBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
          getExternalAdmissionHooksBuilder(int index) {
        return getExternalAdmissionHooksFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookOrBuilder
          getExternalAdmissionHooksOrBuilder(int index) {
        if (externalAdmissionHooksBuilder_ == null) {
          return externalAdmissionHooks_.get(index);
        } else {
          return externalAdmissionHooksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookOrBuilder>
          getExternalAdmissionHooksOrBuilderList() {
        if (externalAdmissionHooksBuilder_ != null) {
          return externalAdmissionHooksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(externalAdmissionHooks_);
        }
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
          addExternalAdmissionHooksBuilder() {
        return getExternalAdmissionHooksFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook.Builder
          addExternalAdmissionHooksBuilder(int index) {
        return getExternalAdmissionHooksFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ExternalAdmissionHooks is a list of external admission webhooks and the
       * affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHook externalAdmissionHooks = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                  .Builder>
          getExternalAdmissionHooksBuilderList() {
        return getExternalAdmissionHooksFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookOrBuilder>
          getExternalAdmissionHooksFieldBuilder() {
        if (externalAdmissionHooksBuilder_ == null) {
          externalAdmissionHooksBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHook
                      .Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookOrBuilder>(
                  externalAdmissionHooks_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          externalAdmissionHooks_ = null;
        }
        return externalAdmissionHooksBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalAdmissionHookConfiguration> PARSER =
        new com.google.protobuf.AbstractParser<ExternalAdmissionHookConfiguration>() {
          public ExternalAdmissionHookConfiguration parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalAdmissionHookConfiguration(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalAdmissionHookConfiguration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalAdmissionHookConfiguration> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalAdmissionHookConfigurationListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfiguration>
        getItemsList();
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfiguration
        getItems(int index);
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfigurationOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * ExternalAdmissionHookConfigurationList is a list of ExternalAdmissionHookConfiguration.
   * </pre>
   *
   * Protobuf type {@code
   * k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList}
   */
  public static final class ExternalAdmissionHookConfigurationList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList)
      ExternalAdmissionHookConfigurationListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalAdmissionHookConfigurationList.newBuilder() to construct.
    private ExternalAdmissionHookConfigurationList(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalAdmissionHookConfigurationList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalAdmissionHookConfigurationList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
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
                          io.kubernetes.client.proto.V1alpha1Admissionregistration
                              .ExternalAdmissionHookConfiguration>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration
                            .ExternalAdmissionHookConfiguration.PARSER,
                        extensionRegistry));
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
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfigurationList.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfigurationList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
    private java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfiguration>
        items_;
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfiguration>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfigurationOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfiguration
        getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationOrBuilder
        getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

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
          instanceof
          io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList
          other =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfigurationList)
                  obj;

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

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * ExternalAdmissionHookConfigurationList is a list of ExternalAdmissionHookConfiguration.
     * </pre>
     *
     * Protobuf type {@code
     * k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList)
        io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfigurationList.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfigurationList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.ExternalAdmissionHookConfigurationList.newBuilder()
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

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList.getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList
            result =
                new io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfigurationList(this);
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

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfigurationList)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfigurationList
              other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList.getDefaultInstance()) return this;
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

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration
                .ExternalAdmissionHookConfigurationList
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfigurationList)
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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

      private java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfigurationOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration>
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration
          getItems(int index) {
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration
              value) {
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration
              value) {
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration
              value) {
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1alpha1Admissionregistration
                          .ExternalAdmissionHookConfiguration>
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration.Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationOrBuilder
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfigurationOrBuilder>
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
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration.Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfiguration.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfiguration.Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .ExternalAdmissionHookConfiguration.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ExternalAdmissionHookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfiguration.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .ExternalAdmissionHookConfigurationOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfiguration.Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .ExternalAdmissionHookConfigurationOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.ExternalAdmissionHookConfigurationList)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration
              .ExternalAdmissionHookConfigurationList();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalAdmissionHookConfigurationList> PARSER =
        new com.google.protobuf.AbstractParser<ExternalAdmissionHookConfigurationList>() {
          public ExternalAdmissionHookConfigurationList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalAdmissionHookConfigurationList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalAdmissionHookConfigurationList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalAdmissionHookConfigurationList> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .ExternalAdmissionHookConfigurationList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface InitializerOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.Initializer)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule> getRulesList();
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRules(int index);
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    int getRulesCount();
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
        getRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder getRulesOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * Initializer describes the name and the failure policy of an initializer, and
   * what resources it applies to.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.Initializer}
   */
  public static final class Initializer extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.Initializer)
      InitializerOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Initializer.newBuilder() to construct.
    private Initializer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Initializer() {
      name_ = "";
      rules_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Initializer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  rules_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule>();
                  mutable_bitField0_ |= 0x00000002;
                }
                rules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.PARSER,
                        extensionRegistry));
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
          rules_ = java.util.Collections.unmodifiableList(rules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
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
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
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
     * Name is the identifier of the initializer. It will be added to the
     * object that needs to be initialized.
     * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
     * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
     * of the organization.
     * Required
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

    public static final int RULES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule> rules_;
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule>
        getRulesList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
        getRulesOrBuilderList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    public int getRulesCount() {
      return rules_.size();
    }
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRules(int index) {
      return rules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Rules describes what resources/subresources the initializer cares about.
     * The initializer cares about an operation if it matches _any_ Rule.
     * Rule.Resources must not include subresources.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder getRulesOrBuilder(
        int index) {
      return rules_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      for (int i = 0; i < rules_.size(); i++) {
        output.writeMessage(2, rules_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      for (int i = 0; i < rules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, rules_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && getRulesList().equals(other.getRulesList());
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
      if (getRulesCount() > 0) {
        hash = (37 * hash) + RULES_FIELD_NUMBER;
        hash = (53 * hash) + getRulesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * Initializer describes the name and the failure policy of an initializer, and
     * what resources it applies to.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.Initializer}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.Initializer)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRulesFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (rulesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            rules_ = java.util.Collections.unmodifiableList(rules_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.rules_ = rules_;
        } else {
          result.rules_ = rulesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (rulesBuilder_ == null) {
          if (!other.rules_.isEmpty()) {
            if (rules_.isEmpty()) {
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRulesIsMutable();
              rules_.addAll(other.rules_);
            }
            onChanged();
          }
        } else {
          if (!other.rules_.isEmpty()) {
            if (rulesBuilder_.isEmpty()) {
              rulesBuilder_.dispose();
              rulesBuilder_ = null;
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRulesFieldBuilder()
                      : null;
            } else {
              rulesBuilder_.addAllMessages(other.rules_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer)
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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
       * Name is the identifier of the initializer. It will be added to the
       * object that needs to be initialized.
       * Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
       * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name
       * of the organization.
       * Required
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

      private java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule> rules_ =
          java.util.Collections.emptyList();

      private void ensureRulesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule>(rules_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
          rulesBuilder_;

      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule>
          getRulesList() {
        if (rulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rules_);
        } else {
          return rulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public int getRulesCount() {
        if (rulesBuilder_ == null) {
          return rules_.size();
        } else {
          return rulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRules(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder setRules(
          int index, io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.set(index, value);
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder setRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.set(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder addRules(io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder addRules(
          int index, io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(index, value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder addRules(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder addAllRules(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule>
              values) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
          onChanged();
        } else {
          rulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder clearRules() {
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public Builder removeRules(int index) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.remove(index);
          onChanged();
        } else {
          rulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder getRulesBuilder(
          int index) {
        return getRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder
          getRulesOrBuilder(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
          getRulesOrBuilderList() {
        if (rulesBuilder_ != null) {
          return rulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rules_);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder
          addRulesBuilder() {
        return getRulesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder addRulesBuilder(
          int index) {
        return getRulesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what resources/subresources the initializer cares about.
       * The initializer cares about an operation if it matches _any_ Rule.
       * Rule.Resources must not include subresources.
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Rule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder>
          getRulesBuilderList() {
        return getRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
          getRulesFieldBuilder() {
        if (rulesBuilder_ == null) {
          rulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>(
                  rules_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          rules_ = null;
        }
        return rulesBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.Initializer)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.Initializer)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Initializer> PARSER =
        new com.google.protobuf.AbstractParser<Initializer>() {
          public Initializer parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Initializer(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Initializer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Initializer> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface InitializerConfigurationOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
        getInitializersList();
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer getInitializers(int index);
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    int getInitializersCount();
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>
        getInitializersOrBuilderList();
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder
        getInitializersOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * InitializerConfiguration describes the configuration of initializers.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration}
   */
  public static final class InitializerConfiguration extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration)
      InitializerConfigurationOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use InitializerConfiguration.newBuilder() to construct.
    private InitializerConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private InitializerConfiguration() {
      initializers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private InitializerConfiguration(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
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
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  initializers_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>();
                  mutable_bitField0_ |= 0x00000002;
                }
                initializers_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.PARSER,
                        extensionRegistry));
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
          initializers_ = java.util.Collections.unmodifiableList(initializers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                  .class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                  .Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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

    public static final int INITIALIZERS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
        initializers_;
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
        getInitializersList() {
      return initializers_;
    }
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>
        getInitializersOrBuilderList() {
      return initializers_;
    }
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    public int getInitializersCount() {
      return initializers_.size();
    }
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer getInitializers(
        int index) {
      return initializers_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Initializers is a list of resources and their default initializers
     * Order-sensitive.
     * When merging multiple InitializerConfigurations, we sort the initializers
     * from different InitializerConfigurations by the name of the
     * InitializerConfigurations; the order of the initializers from the same
     * InitializerConfiguration is preserved.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder
        getInitializersOrBuilder(int index) {
      return initializers_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < initializers_.size(); i++) {
        output.writeMessage(2, initializers_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < initializers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, initializers_.get(i));
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
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getInitializersList().equals(other.getInitializersList());
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
      if (getInitializersCount() > 0) {
        hash = (37 * hash) + INITIALIZERS_FIELD_NUMBER;
        hash = (53 * hash) + getInitializersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * InitializerConfiguration describes the configuration of initializers.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                    .class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration.newBuilder()
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
          getInitializersFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (initializersBuilder_ == null) {
          initializers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          initializersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration(
                this);
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
        if (initializersBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            initializers_ = java.util.Collections.unmodifiableList(initializers_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.initializers_ = initializers_;
        } else {
          result.initializers_ = initializersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (initializersBuilder_ == null) {
          if (!other.initializers_.isEmpty()) {
            if (initializers_.isEmpty()) {
              initializers_ = other.initializers_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureInitializersIsMutable();
              initializers_.addAll(other.initializers_);
            }
            onChanged();
          }
        } else {
          if (!other.initializers_.isEmpty()) {
            if (initializersBuilder_.isEmpty()) {
              initializersBuilder_.dispose();
              initializersBuilder_ = null;
              initializers_ = other.initializers_;
              bitField0_ = (bitField0_ & ~0x00000002);
              initializersBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getInitializersFieldBuilder()
                      : null;
            } else {
              initializersBuilder_.addAllMessages(other.initializers_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration)
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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
       * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
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

      private java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
          initializers_ = java.util.Collections.emptyList();

      private void ensureInitializersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          initializers_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>(
                  initializers_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>
          initializersBuilder_;

      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
          getInitializersList() {
        if (initializersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(initializers_);
        } else {
          return initializersBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public int getInitializersCount() {
        if (initializersBuilder_ == null) {
          return initializers_.size();
        } else {
          return initializersBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer getInitializers(
          int index) {
        if (initializersBuilder_ == null) {
          return initializers_.get(index);
        } else {
          return initializersBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder setInitializers(
          int index, io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer value) {
        if (initializersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInitializersIsMutable();
          initializers_.set(index, value);
          onChanged();
        } else {
          initializersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder setInitializers(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
              builderForValue) {
        if (initializersBuilder_ == null) {
          ensureInitializersIsMutable();
          initializers_.set(index, builderForValue.build());
          onChanged();
        } else {
          initializersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder addInitializers(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer value) {
        if (initializersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInitializersIsMutable();
          initializers_.add(value);
          onChanged();
        } else {
          initializersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder addInitializers(
          int index, io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer value) {
        if (initializersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInitializersIsMutable();
          initializers_.add(index, value);
          onChanged();
        } else {
          initializersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder addInitializers(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
              builderForValue) {
        if (initializersBuilder_ == null) {
          ensureInitializersIsMutable();
          initializers_.add(builderForValue.build());
          onChanged();
        } else {
          initializersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder addInitializers(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
              builderForValue) {
        if (initializersBuilder_ == null) {
          ensureInitializersIsMutable();
          initializers_.add(index, builderForValue.build());
          onChanged();
        } else {
          initializersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder addAllInitializers(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer>
              values) {
        if (initializersBuilder_ == null) {
          ensureInitializersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, initializers_);
          onChanged();
        } else {
          initializersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder clearInitializers() {
        if (initializersBuilder_ == null) {
          initializers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          initializersBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public Builder removeInitializers(int index) {
        if (initializersBuilder_ == null) {
          ensureInitializersIsMutable();
          initializers_.remove(index);
          onChanged();
        } else {
          initializersBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
          getInitializersBuilder(int index) {
        return getInitializersFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder
          getInitializersOrBuilder(int index) {
        if (initializersBuilder_ == null) {
          return initializers_.get(index);
        } else {
          return initializersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>
          getInitializersOrBuilderList() {
        if (initializersBuilder_ != null) {
          return initializersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(initializers_);
        }
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
          addInitializersBuilder() {
        return getInitializersFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder
          addInitializersBuilder(int index) {
        return getInitializersFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Initializers is a list of resources and their default initializers
       * Order-sensitive.
       * When merging multiple InitializerConfigurations, we sort the initializers
       * from different InitializerConfigurations by the name of the
       * InitializerConfigurations; the order of the initializers from the same
       * InitializerConfiguration is preserved.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.Initializer initializers = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder>
          getInitializersBuilderList() {
        return getInitializersFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>
          getInitializersFieldBuilder() {
        if (initializersBuilder_ == null) {
          initializersBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Initializer.Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerOrBuilder>(
                  initializers_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          initializers_ = null;
        }
        return initializersBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfiguration
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<InitializerConfiguration> PARSER =
        new com.google.protobuf.AbstractParser<InitializerConfiguration>() {
          public InitializerConfiguration parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new InitializerConfiguration(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<InitializerConfiguration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitializerConfiguration> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface InitializerConfigurationListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration>
        getItemsList();
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration getItems(
        int index);
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .InitializerConfigurationOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * InitializerConfigurationList is a list of InitializerConfiguration.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList}
   */
  public static final class InitializerConfigurationList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList)
      InitializerConfigurationListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use InitializerConfigurationList.newBuilder() to construct.
    private InitializerConfigurationList(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private InitializerConfigurationList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private InitializerConfigurationList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
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
                          io.kubernetes.client.proto.V1alpha1Admissionregistration
                              .InitializerConfiguration>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration
                            .InitializerConfiguration.PARSER,
                        extensionRegistry));
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
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
                  .class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
                  .Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
    private java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration>
        items_;
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .InitializerConfigurationOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
        getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of InitializerConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationOrBuilder
        getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

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
          instanceof
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList)
              obj;

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

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * InitializerConfigurationList is a list of InitializerConfiguration.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList)
        io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .InitializerConfigurationList.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .InitializerConfigurationList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList.newBuilder()
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

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
          build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
            result =
                new io.kubernetes.client.proto.V1alpha1Admissionregistration
                    .InitializerConfigurationList(this);
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

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .InitializerConfigurationList)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
              other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
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

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .InitializerConfigurationList)
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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

      private java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .InitializerConfiguration>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .InitializerConfigurationOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration>
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
          getItems(int index) {
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration value) {
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration.Builder
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration value) {
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration value) {
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration.Builder
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration.Builder
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1alpha1Admissionregistration
                          .InitializerConfiguration>
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
              .Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration
              .InitializerConfigurationOrBuilder
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .InitializerConfigurationOrBuilder>
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
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
              .Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
              .Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of InitializerConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1alpha1.InitializerConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                  .Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration
                  .InitializerConfigurationOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfiguration
                      .Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration
                      .InitializerConfigurationOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.InitializerConfigurationList)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration
              .InitializerConfigurationList();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration
            .InitializerConfigurationList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<InitializerConfigurationList> PARSER =
        new com.google.protobuf.AbstractParser<InitializerConfigurationList>() {
          public InitializerConfigurationList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new InitializerConfigurationList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<InitializerConfigurationList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitializerConfigurationList> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.InitializerConfigurationList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.Rule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    java.util.List<java.lang.String> getApiGroupsList();
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    int getApiGroupsCount();
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    java.lang.String getApiGroups(int index);
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    com.google.protobuf.ByteString getApiGroupsBytes(int index);

    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    java.util.List<java.lang.String> getApiVersionsList();
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    int getApiVersionsCount();
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    java.lang.String getApiVersions(int index);
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    com.google.protobuf.ByteString getApiVersionsBytes(int index);

    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.util.List<java.lang.String> getResourcesList();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    int getResourcesCount();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.lang.String getResources(int index);
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    com.google.protobuf.ByteString getResourcesBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended
   * to make sure that all the tuple expansions are valid.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.Rule}
   */
  public static final class Rule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.Rule)
      RuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Rule.newBuilder() to construct.
    private Rule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Rule() {
      apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      apiVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Rule(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  apiGroups_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                apiGroups_.add(bs);
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  apiVersions_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                apiVersions_.add(bs);
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  resources_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                resources_.add(bs);
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          apiVersions_ = apiVersions_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder.class);
    }

    public static final int APIGROUPS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList apiGroups_;
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getApiGroupsList() {
      return apiGroups_;
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    public int getApiGroupsCount() {
      return apiGroups_.size();
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    public java.lang.String getApiGroups(int index) {
      return apiGroups_.get(index);
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the API groups the resources belong to. '*' is all groups.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiGroups = 1;</code>
     */
    public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
      return apiGroups_.getByteString(index);
    }

    public static final int APIVERSIONS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList apiVersions_;
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getApiVersionsList() {
      return apiVersions_;
    }
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    public int getApiVersionsCount() {
      return apiVersions_.size();
    }
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    public java.lang.String getApiVersions(int index) {
      return apiVersions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * APIVersions is the API versions the resources belong to. '*' is all versions.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string apiVersions = 2;</code>
     */
    public com.google.protobuf.ByteString getApiVersionsBytes(int index) {
      return apiVersions_.getByteString(index);
    }

    public static final int RESOURCES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList resources_;
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getResourcesList() {
      return resources_;
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public int getResourcesCount() {
      return resources_.size();
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public java.lang.String getResources(int index) {
      return resources_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.
     *
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     *
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
     *
     * Depending on the enclosing object, subresources might not be allowed.
     * Required.
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ByteString getResourcesBytes(int index) {
      return resources_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < apiGroups_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiGroups_.getRaw(i));
      }
      for (int i = 0; i < apiVersions_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiVersions_.getRaw(i));
      }
      for (int i = 0; i < resources_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resources_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < apiGroups_.size(); i++) {
          dataSize += computeStringSizeNoTag(apiGroups_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getApiGroupsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < apiVersions_.size(); i++) {
          dataSize += computeStringSizeNoTag(apiVersions_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getApiVersionsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < resources_.size(); i++) {
          dataSize += computeStringSizeNoTag(resources_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getResourcesList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule) obj;

      boolean result = true;
      result = result && getApiGroupsList().equals(other.getApiGroupsList());
      result = result && getApiVersionsList().equals(other.getApiVersionsList());
      result = result && getResourcesList().equals(other.getResourcesList());
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
      if (getApiGroupsCount() > 0) {
        hash = (37 * hash) + APIGROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getApiGroupsList().hashCode();
      }
      if (getApiVersionsCount() > 0) {
        hash = (37 * hash) + APIVERSIONS_FIELD_NUMBER;
        hash = (53 * hash) + getApiVersionsList().hashCode();
      }
      if (getResourcesCount() > 0) {
        hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
        hash = (53 * hash) + getResourcesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended
     * to make sure that all the tuple expansions are valid.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.Rule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.Rule)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.newBuilder()
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

      public Builder clear() {
        super.clear();
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        apiVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.apiGroups_ = apiGroups_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          apiVersions_ = apiVersions_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.apiVersions_ = apiVersions_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.resources_ = resources_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance())
          return this;
        if (!other.apiGroups_.isEmpty()) {
          if (apiGroups_.isEmpty()) {
            apiGroups_ = other.apiGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureApiGroupsIsMutable();
            apiGroups_.addAll(other.apiGroups_);
          }
          onChanged();
        }
        if (!other.apiVersions_.isEmpty()) {
          if (apiVersions_.isEmpty()) {
            apiVersions_ = other.apiVersions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureApiVersionsIsMutable();
            apiVersions_.addAll(other.apiVersions_);
          }
          onChanged();
        }
        if (!other.resources_.isEmpty()) {
          if (resources_.isEmpty()) {
            resources_ = other.resources_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureResourcesIsMutable();
            resources_.addAll(other.resources_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule)
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

      private com.google.protobuf.LazyStringList apiGroups_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureApiGroupsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          apiGroups_ = new com.google.protobuf.LazyStringArrayList(apiGroups_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList getApiGroupsList() {
        return apiGroups_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public int getApiGroupsCount() {
        return apiGroups_.size();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public java.lang.String getApiGroups(int index) {
        return apiGroups_.get(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
        return apiGroups_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public Builder setApiGroups(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public Builder addApiGroups(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public Builder addAllApiGroups(java.lang.Iterable<java.lang.String> values) {
        ensureApiGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiGroups_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public Builder clearApiGroups() {
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the API groups the resources belong to. '*' is all groups.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiGroups = 1;</code>
       */
      public Builder addApiGroupsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList apiVersions_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureApiVersionsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          apiVersions_ = new com.google.protobuf.LazyStringArrayList(apiVersions_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getApiVersionsList() {
        return apiVersions_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public int getApiVersionsCount() {
        return apiVersions_.size();
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public java.lang.String getApiVersions(int index) {
        return apiVersions_.get(index);
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public com.google.protobuf.ByteString getApiVersionsBytes(int index) {
        return apiVersions_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public Builder setApiVersions(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiVersionsIsMutable();
        apiVersions_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public Builder addApiVersions(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiVersionsIsMutable();
        apiVersions_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public Builder addAllApiVersions(java.lang.Iterable<java.lang.String> values) {
        ensureApiVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiVersions_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public Builder clearApiVersions() {
        apiVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIVersions is the API versions the resources belong to. '*' is all versions.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string apiVersions = 2;</code>
       */
      public Builder addApiVersionsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiVersionsIsMutable();
        apiVersions_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList resources_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureResourcesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = new com.google.protobuf.LazyStringArrayList(resources_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getResourcesList() {
        return resources_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public int getResourcesCount() {
        return resources_.size();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public java.lang.String getResources(int index) {
        return resources_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ByteString getResourcesBytes(int index) {
        return resources_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder setResources(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResources(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addAllResources(java.lang.Iterable<java.lang.String> values) {
        ensureResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resources_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder clearResources() {
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.
       *
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       *
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
       *
       * Depending on the enclosing object, subresources might not be allowed.
       * Required.
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResourcesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.Rule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.Rule)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Rule> PARSER =
        new com.google.protobuf.AbstractParser<Rule>() {
          public Rule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Rule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Rule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Rule> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RuleWithOperationsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    java.util.List<java.lang.String> getOperationsList();
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    int getOperationsCount();
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    java.lang.String getOperations(int index);
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    com.google.protobuf.ByteString getOperationsBytes(int index);

    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRule();
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder getRuleOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make
   * sure that all the tuple expansions are valid.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations}
   */
  public static final class RuleWithOperations extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations)
      RuleWithOperationsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RuleWithOperations.newBuilder() to construct.
    private RuleWithOperations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RuleWithOperations() {
      operations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RuleWithOperations(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  operations_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                operations_.add(bs);
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = rule_.toBuilder();
                }
                rule_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(rule_);
                  rule_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = operations_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
                  .class);
    }

    private int bitField0_;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList operations_;
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getOperationsList() {
      return operations_;
    }
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    public int getOperationsCount() {
      return operations_.size();
    }
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    public java.lang.String getOperations(int index) {
      return operations_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
     * for all operations.
     * If '*' is present, the length of the slice must be one.
     * Required.
     * </pre>
     *
     * <code>repeated string operations = 1;</code>
     */
    public com.google.protobuf.ByteString getOperationsBytes(int index) {
      return operations_.getByteString(index);
    }

    public static final int RULE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule rule_;
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRule() {
      return rule_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance()
          : rule_;
    }
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder
        getRuleOrBuilder() {
      return rule_ == null
          ? io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance()
          : rule_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < operations_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operations_.getRaw(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(2, getRule());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < operations_.size(); i++) {
          dataSize += computeStringSizeNoTag(operations_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOperationsList().size();
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRule());
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
          instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations) obj;

      boolean result = true;
      result = result && getOperationsList().equals(other.getOperationsList());
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
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
      if (getOperationsCount() > 0) {
        hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
        hash = (53 * hash) + getOperationsList().hashCode();
      }
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make
     * sure that all the tuple expansions are valid.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperationsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRuleFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        operations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (ruleBuilder_ == null) {
          rule_ = null;
        } else {
          ruleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = operations_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        if (ruleBuilder_ == null) {
          result.rule_ = rule_;
        } else {
          result.rule_ = ruleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
                .getDefaultInstance()) return this;
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
        if (other.hasRule()) {
          mergeRule(other.getRule());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations)
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

      private com.google.protobuf.LazyStringList operations_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureOperationsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = new com.google.protobuf.LazyStringArrayList(operations_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList getOperationsList() {
        return operations_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public int getOperationsCount() {
        return operations_.size();
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public java.lang.String getOperations(int index) {
        return operations_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public com.google.protobuf.ByteString getOperationsBytes(int index) {
        return operations_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public Builder setOperations(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public Builder addOperations(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public Builder addAllOperations(java.lang.Iterable<java.lang.String> values) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, operations_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public Builder clearOperations() {
        operations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operations is the operations the admission hook cares about - CREATE, UPDATE, or *
       * for all operations.
       * If '*' is present, the length of the slice must be one.
       * Required.
       * </pre>
       *
       * <code>repeated string operations = 1;</code>
       */
      public Builder addOperationsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule rule_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
          ruleBuilder_;
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule getRule() {
        if (ruleBuilder_ == null) {
          return rule_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance()
              : rule_;
        } else {
          return ruleBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public Builder setRule(io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule value) {
        if (ruleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rule_ = value;
          onChanged();
        } else {
          ruleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public Builder setRule(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder builderForValue) {
        if (ruleBuilder_ == null) {
          rule_ = builderForValue.build();
          onChanged();
        } else {
          ruleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public Builder mergeRule(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule value) {
        if (ruleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && rule_ != null
              && rule_
                  != io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule
                      .getDefaultInstance()) {
            rule_ =
                io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.newBuilder(rule_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            rule_ = value;
          }
          onChanged();
        } else {
          ruleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public Builder clearRule() {
        if (ruleBuilder_ == null) {
          rule_ = null;
          onChanged();
        } else {
          ruleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder
          getRuleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRuleFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder
          getRuleOrBuilder() {
        if (ruleBuilder_ != null) {
          return ruleBuilder_.getMessageOrBuilder();
        } else {
          return rule_ == null
              ? io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.getDefaultInstance()
              : rule_;
        }
      }
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1alpha1.Rule rule = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>
          getRuleFieldBuilder() {
        if (ruleBuilder_ == null) {
          ruleBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.Rule.Builder,
                  io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleOrBuilder>(
                  getRule(), getParentForChildren(), isClean());
          rule_ = null;
        }
        return ruleBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.RuleWithOperations)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RuleWithOperations> PARSER =
        new com.google.protobuf.AbstractParser<RuleWithOperations>() {
          public RuleWithOperations parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RuleWithOperations(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RuleWithOperations> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RuleWithOperations> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.RuleWithOperations
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ServiceReferenceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1alpha1.ServiceReference)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();

    /**
     *
     *
     * <pre>
     * Name is the name of the service
     * Required
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of the service
     * Required
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of the service
     * Required
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString getNameBytes();
  }
  /**
   *
   *
   * <pre>
   * ServiceReference holds a reference to Service.legacy.k8s.io
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.ServiceReference}
   */
  public static final class ServiceReference extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1alpha1.ServiceReference)
      ServiceReferenceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ServiceReference.newBuilder() to construct.
    private ServiceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ServiceReference() {
      namespace_ = "";
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ServiceReference(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                namespace_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                name_ = bs;
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
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.class,
              io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder
                  .class);
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namespace_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the service
     * Required
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
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
     * Name is the name of the service
     * Required
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
     * Name is the name of the service
     * Required
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
     * Name is the name of the service
     * Required
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

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
          instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference other =
          (io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference) obj;

      boolean result = true;
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
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
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * ServiceReference holds a reference to Service.legacy.k8s.io
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1alpha1.ServiceReference}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1alpha1.ServiceReference)
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.class,
                io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference.newBuilder()
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

      public Builder clear() {
        super.clear();
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference build() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference result =
            new io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
                .getDefaultInstance()) return this;
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000001;
          namespace_ = other.namespace_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference)
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

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public java.lang.String getNamespace() {
        java.lang.Object ref = namespace_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namespace_ = s;
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
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public com.google.protobuf.ByteString getNamespaceBytes() {
        java.lang.Object ref = namespace_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          namespace_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the service
       * Required
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of the service
       * Required
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
       * Name is the name of the service
       * Required
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
       * Name is the name of the service
       * Required
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
       * Name is the name of the service
       * Required
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
       * Name is the name of the service
       * Required
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
       * Name is the name of the service
       * Required
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

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1alpha1.ServiceReference)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1alpha1.ServiceReference)
    private static final io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference();
    }

    public static io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ServiceReference> PARSER =
        new com.google.protobuf.AbstractParser<ServiceReference>() {
          public ServiceReference parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ServiceReference(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ServiceReference> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServiceReference> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admissionregistration.ServiceReference
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9k8s.io/api/admissionregistration/v1alp"
          + "ha1/generated.proto\022)k8s.io.api.admissio"
          + "nregistration.v1alpha1\0324k8s.io/apimachin"
          + "ery/pkg/apis/meta/v1/generated.proto\032/k8"
          + "s.io/apimachinery/pkg/runtime/generated."
          + "proto\0326k8s.io/apimachinery/pkg/runtime/s"
          + "chema/generated.proto\0323k8s.io/apimachine"
          + "ry/pkg/util/intstr/generated.proto\"\214\001\n\031A"
          + "dmissionHookClientConfig\022L\n\007service\030\001 \001("
          + "\0132;.k8s.io.api.admissionregistration.v1a",
      "lpha1.ServiceReference\022\017\n\007urlPath\030\003 \001(\t\022"
          + "\020\n\010caBundle\030\002 \001(\014\"\346\001\n\025ExternalAdmissionH"
          + "ook\022\014\n\004name\030\001 \001(\t\022Z\n\014clientConfig\030\002 \001(\0132"
          + "D.k8s.io.api.admissionregistration.v1alp"
          + "ha1.AdmissionHookClientConfig\022L\n\005rules\030\003"
          + " \003(\0132=.k8s.io.api.admissionregistration."
          + "v1alpha1.RuleWithOperations\022\025\n\rfailurePo"
          + "licy\030\004 \001(\t\"\312\001\n\"ExternalAdmissionHookConf"
          + "iguration\022B\n\010metadata\030\001 \001(\01320.k8s.io.api"
          + "machinery.pkg.apis.meta.v1.ObjectMeta\022`\n",
      "\026externalAdmissionHooks\030\002 \003(\0132@.k8s.io.a"
          + "pi.admissionregistration.v1alpha1.Extern"
          + "alAdmissionHook\"\310\001\n&ExternalAdmissionHoo"
          + "kConfigurationList\022@\n\010metadata\030\001 \001(\0132..k"
          + "8s.io.apimachinery.pkg.apis.meta.v1.List"
          + "Meta\022\\\n\005items\030\002 \003(\0132M.k8s.io.api.admissi"
          + "onregistration.v1alpha1.ExternalAdmissio"
          + "nHookConfiguration\"[\n\013Initializer\022\014\n\004nam"
          + "e\030\001 \001(\t\022>\n\005rules\030\002 \003(\0132/.k8s.io.api.admi"
          + "ssionregistration.v1alpha1.Rule\"\254\001\n\030Init",
      "ializerConfiguration\022B\n\010metadata\030\001 \001(\01320"
          + ".k8s.io.apimachinery.pkg.apis.meta.v1.Ob"
          + "jectMeta\022L\n\014initializers\030\002 \003(\01326.k8s.io."
          + "api.admissionregistration.v1alpha1.Initi"
          + "alizer\"\264\001\n\034InitializerConfigurationList\022"
          + "@\n\010metadata\030\001 \001(\0132..k8s.io.apimachinery."
          + "pkg.apis.meta.v1.ListMeta\022R\n\005items\030\002 \003(\013"
          + "2C.k8s.io.api.admissionregistration.v1al"
          + "pha1.InitializerConfiguration\"A\n\004Rule\022\021\n"
          + "\tapiGroups\030\001 \003(\t\022\023\n\013apiVersions\030\002 \003(\t\022\021\n",
      "\tresources\030\003 \003(\t\"g\n\022RuleWithOperations\022\022"
          + "\n\noperations\030\001 \003(\t\022=\n\004rule\030\002 \001(\0132/.k8s.i"
          + "o.api.admissionregistration.v1alpha1.Rul"
          + "e\"3\n\020ServiceReference\022\021\n\tnamespace\030\001 \001(\t"
          + "\022\014\n\004name\030\002 \001(\tBE\n\032io.kubernetes.client.p"
          + "rotoB\035V1alpha1AdmissionregistrationZ\010v1a"
          + "lpha1"
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
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
          io.kubernetes.client.proto.IntStr.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_AdmissionHookClientConfig_descriptor,
            new java.lang.String[] {
              "Service", "UrlPath", "CaBundle",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHook_descriptor,
            new java.lang.String[] {
              "Name", "ClientConfig", "Rules", "FailurePolicy",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfiguration_descriptor,
            new java.lang.String[] {
              "Metadata", "ExternalAdmissionHooks",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_ExternalAdmissionHookConfigurationList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_Initializer_descriptor,
            new java.lang.String[] {
              "Name", "Rules",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfiguration_descriptor,
            new java.lang.String[] {
              "Metadata", "Initializers",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_InitializerConfigurationList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_Rule_descriptor,
            new java.lang.String[] {
              "ApiGroups", "ApiVersions", "Resources",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_RuleWithOperations_descriptor,
            new java.lang.String[] {
              "Operations", "Rule",
            });
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1alpha1_ServiceReference_descriptor,
            new java.lang.String[] {
              "Namespace", "Name",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
    io.kubernetes.client.proto.IntStr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
