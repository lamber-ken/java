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

public final class V1alpha1Admission {
  private V1alpha1Admission() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface AdmissionReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1alpha1.AdmissionReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * AdmissionReview describes an admission request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReview}
   */
  public static final class AdmissionReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1alpha1.AdmissionReview)
      AdmissionReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionReview.newBuilder() to construct.
    private AdmissionReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionReview(
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
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.class,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.Builder.class);
    }

    private int bitField0_;
    public static final int SPEC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec describes the attributes for the admission request.
     * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
     * cost of deserializing it.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the webhook and indicates whether the admission request should be permitted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.getDefaultInstance()
          : status_;
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
        output.writeMessage(1, getSpec());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getStatus());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSpec());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview other =
          (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview) obj;

      boolean result = true;
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

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview prototype) {
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
     * AdmissionReview describes an admission request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1alpha1.AdmissionReview)
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.class,
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview build() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview result =
            new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview.getDefaultInstance())
          return this;
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

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview)
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

      private io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
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
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec describes the attributes for the admission request.
       * Since this admission controller is non-mutating the webhook should avoid setting this in its response to avoid the
       * cost of deserializing it.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewSpec spec = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec,
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder,
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
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
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.newBuilder(
                        status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the webhook and indicates whether the admission request should be permitted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1alpha1.AdmissionReviewStatus status = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus,
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder,
                  io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1alpha1.AdmissionReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1alpha1.AdmissionReview)
    private static final io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview();
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionReview> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionReview>() {
          public AdmissionReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionReview> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface AdmissionReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1alpha1.AdmissionReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKind getKind();
    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder();

    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtension getObject();
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    boolean hasOldObject();
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtension getOldObject();
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    boolean hasOperation();
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    java.lang.String getOperation();
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    com.google.protobuf.ByteString getOperationBytes();

    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();

    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResource getResource();
    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    boolean hasSubResource();
    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    java.lang.String getSubResource();
    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    com.google.protobuf.ByteString getSubResourceBytes();

    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    boolean hasUserInfo();
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo();
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * AdmissionReviewSpec describes the admission.Attributes for the admission request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReviewSpec}
   */
  public static final class AdmissionReviewSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1alpha1.AdmissionReviewSpec)
      AdmissionReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionReviewSpec.newBuilder() to construct.
    private AdmissionReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionReviewSpec() {
      operation_ = "";
      name_ = "";
      namespace_ = "";
      subResource_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionReviewSpec(
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
                io.kubernetes.client.proto.Meta.GroupVersionKind.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = kind_.toBuilder();
                }
                kind_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionKind.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(kind_);
                  kind_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Runtime.RawExtension.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.RawExtension.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Runtime.RawExtension.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = oldObject_.toBuilder();
                }
                oldObject_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.RawExtension.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(oldObject_);
                  oldObject_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                operation_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                name_ = bs;
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000020;
                namespace_ = bs;
                break;
              }
            case 58:
              {
                io.kubernetes.client.proto.Meta.GroupVersionResource.Builder subBuilder = null;
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionResource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000040;
                break;
              }
            case 66:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000080;
                subResource_ = bs;
                break;
              }
            case 74:
              {
                io.kubernetes.client.proto.V1Authentication.UserInfo.Builder subBuilder = null;
                if (((bitField0_ & 0x00000100) == 0x00000100)) {
                  subBuilder = userInfo_.toBuilder();
                }
                userInfo_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Authentication.UserInfo.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(userInfo_);
                  userInfo_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000100;
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
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.class,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder.class);
    }

    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.GroupVersionKind kind_;
    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKind getKind() {
      return kind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : kind_;
    }
    /**
     *
     *
     * <pre>
     * Kind is the type of object being manipulated.  For example: Pod
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder() {
      return kind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : kind_;
    }

    public static final int OBJECT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Runtime.RawExtension object_;
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtension getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request prior to default values being applied
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : object_;
    }

    public static final int OLDOBJECT_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Runtime.RawExtension oldObject_;
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    public boolean hasOldObject() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtension getOldObject() {
      return oldObject_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : oldObject_;
    }
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder() {
      return oldObject_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : oldObject_;
    }

    public static final int OPERATION_FIELD_NUMBER = 4;
    private volatile java.lang.Object operation_;
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    public boolean hasOperation() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    public java.lang.String getOperation() {
      java.lang.Object ref = operation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          operation_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed
     * </pre>
     *
     * <code>optional string operation = 4;</code>
     */
    public com.google.protobuf.ByteString getOperationBytes() {
      java.lang.Object ref = operation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
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
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this method will return the empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
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

    public static final int NAMESPACE_FIELD_NUMBER = 6;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
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
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
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

    public static final int RESOURCE_FIELD_NUMBER = 7;
    private io.kubernetes.client.proto.Meta.GroupVersionResource resource_;
    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResource getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : resource_;
    }

    public static final int SUBRESOURCE_FIELD_NUMBER = 8;
    private volatile java.lang.Object subResource_;
    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    public boolean hasSubResource() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    public java.lang.String getSubResource() {
      java.lang.Object ref = subResource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subResource_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
     * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
     * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
     * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
     * "binding", and kind "Binding".
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 8;</code>
     */
    public com.google.protobuf.ByteString getSubResourceBytes() {
      java.lang.Object ref = subResource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERINFO_FIELD_NUMBER = 9;
    private io.kubernetes.client.proto.V1Authentication.UserInfo userInfo_;
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    public boolean hasUserInfo() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    public io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo() {
      return userInfo_ == null
          ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
          : userInfo_;
    }
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
     */
    public io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder() {
      return userInfo_ == null
          ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
          : userInfo_;
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
        output.writeMessage(1, getKind());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getOldObject());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, operation_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, namespace_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(7, getResource());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, subResource_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeMessage(9, getUserInfo());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getKind());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getOldObject());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, operation_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, namespace_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, getResource());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, subResource_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(9, getUserInfo());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec other =
          (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec) obj;

      boolean result = true;
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasOldObject() == other.hasOldObject());
      if (hasOldObject()) {
        result = result && getOldObject().equals(other.getOldObject());
      }
      result = result && (hasOperation() == other.hasOperation());
      if (hasOperation()) {
        result = result && getOperation().equals(other.getOperation());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasSubResource() == other.hasSubResource());
      if (hasSubResource()) {
        result = result && getSubResource().equals(other.getSubResource());
      }
      result = result && (hasUserInfo() == other.hasUserInfo());
      if (hasUserInfo()) {
        result = result && getUserInfo().equals(other.getUserInfo());
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
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasOldObject()) {
        hash = (37 * hash) + OLDOBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getOldObject().hashCode();
      }
      if (hasOperation()) {
        hash = (37 * hash) + OPERATION_FIELD_NUMBER;
        hash = (53 * hash) + getOperation().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasSubResource()) {
        hash = (37 * hash) + SUBRESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSubResource().hashCode();
      }
      if (hasUserInfo()) {
        hash = (37 * hash) + USERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getUserInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec prototype) {
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
     * AdmissionReviewSpec describes the admission.Attributes for the admission request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReviewSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1alpha1.AdmissionReviewSpec)
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.class,
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getKindFieldBuilder();
          getObjectFieldBuilder();
          getOldObjectFieldBuilder();
          getResourceFieldBuilder();
          getUserInfoFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (kindBuilder_ == null) {
          kind_ = null;
        } else {
          kindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (oldObjectBuilder_ == null) {
          oldObject_ = null;
        } else {
          oldObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        operation_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        subResource_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec build() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec result =
            new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (kindBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = kindBuilder_.build();
        }
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
        if (oldObjectBuilder_ == null) {
          result.oldObject_ = oldObject_;
        } else {
          result.oldObject_ = oldObjectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.operation_ = operation_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.subResource_ = subResource_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        if (userInfoBuilder_ == null) {
          result.userInfo_ = userInfo_;
        } else {
          result.userInfo_ = userInfoBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
                .getDefaultInstance()) return this;
        if (other.hasKind()) {
          mergeKind(other.getKind());
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasOldObject()) {
          mergeOldObject(other.getOldObject());
        }
        if (other.hasOperation()) {
          bitField0_ |= 0x00000008;
          operation_ = other.operation_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000010;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000020;
          namespace_ = other.namespace_;
          onChanged();
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasSubResource()) {
          bitField0_ |= 0x00000080;
          subResource_ = other.subResource_;
          onChanged();
        }
        if (other.hasUserInfo()) {
          mergeUserInfo(other.getUserInfo());
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
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec)
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

      private io.kubernetes.client.proto.Meta.GroupVersionKind kind_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          kindBuilder_;
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind getKind() {
        if (kindBuilder_ == null) {
          return kind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : kind_;
        } else {
          return kindBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public Builder setKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (kindBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          kind_ = value;
          onChanged();
        } else {
          kindBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public Builder setKind(
          io.kubernetes.client.proto.Meta.GroupVersionKind.Builder builderForValue) {
        if (kindBuilder_ == null) {
          kind_ = builderForValue.build();
          onChanged();
        } else {
          kindBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public Builder mergeKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (kindBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && kind_ != null
              && kind_ != io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()) {
            kind_ =
                io.kubernetes.client.proto.Meta.GroupVersionKind.newBuilder(kind_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            kind_ = value;
          }
          onChanged();
        } else {
          kindBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public Builder clearKind() {
        if (kindBuilder_ == null) {
          kind_ = null;
          onChanged();
        } else {
          kindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind.Builder getKindBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getKindFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder() {
        if (kindBuilder_ != null) {
          return kindBuilder_.getMessageOrBuilder();
        } else {
          return kind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : kind_;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of object being manipulated.  For example: Pod
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          getKindFieldBuilder() {
        if (kindBuilder_ == null) {
          kindBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionKind,
                  io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>(
                  getKind(), getParentForChildren(), isClean());
          kind_ = null;
        }
        return kindBuilder_;
      }

      private io.kubernetes.client.proto.Runtime.RawExtension object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public Builder setObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
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
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.Runtime.RawExtension.Builder builderForValue) {
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
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public Builder mergeObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && object_ != null
              && object_ != io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.Runtime.RawExtension.newBuilder(object_)
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
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
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
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension.Builder getObjectBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request prior to default values being applied
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.RawExtension,
                  io.kubernetes.client.proto.Runtime.RawExtension.Builder,
                  io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.Runtime.RawExtension oldObject_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          oldObjectBuilder_;
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public boolean hasOldObject() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension getOldObject() {
        if (oldObjectBuilder_ == null) {
          return oldObject_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : oldObject_;
        } else {
          return oldObjectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public Builder setOldObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (oldObjectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oldObject_ = value;
          onChanged();
        } else {
          oldObjectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public Builder setOldObject(
          io.kubernetes.client.proto.Runtime.RawExtension.Builder builderForValue) {
        if (oldObjectBuilder_ == null) {
          oldObject_ = builderForValue.build();
          onChanged();
        } else {
          oldObjectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public Builder mergeOldObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (oldObjectBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && oldObject_ != null
              && oldObject_
                  != io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()) {
            oldObject_ =
                io.kubernetes.client.proto.Runtime.RawExtension.newBuilder(oldObject_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            oldObject_ = value;
          }
          onChanged();
        } else {
          oldObjectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public Builder clearOldObject() {
        if (oldObjectBuilder_ == null) {
          oldObject_ = null;
          onChanged();
        } else {
          oldObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension.Builder getOldObjectBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getOldObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder() {
        if (oldObjectBuilder_ != null) {
          return oldObjectBuilder_.getMessageOrBuilder();
        } else {
          return oldObject_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : oldObject_;
        }
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          getOldObjectFieldBuilder() {
        if (oldObjectBuilder_ == null) {
          oldObjectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.RawExtension,
                  io.kubernetes.client.proto.Runtime.RawExtension.Builder,
                  io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>(
                  getOldObject(), getParentForChildren(), isClean());
          oldObject_ = null;
        }
        return oldObjectBuilder_;
      }

      private java.lang.Object operation_ = "";
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public boolean hasOperation() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public java.lang.String getOperation() {
        java.lang.Object ref = operation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            operation_ = s;
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
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public com.google.protobuf.ByteString getOperationBytes() {
        java.lang.Object ref = operation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          operation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public Builder setOperation(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        operation_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public Builder clearOperation() {
        bitField0_ = (bitField0_ & ~0x00000008);
        operation_ = getDefaultInstance().getOperation();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed
       * </pre>
       *
       * <code>optional string operation = 4;</code>
       */
      public Builder setOperationBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        operation_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
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
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
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
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this method will return the empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
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
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
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
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000020);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        namespace_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.GroupVersionResource resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public Builder setResource(io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.Meta.GroupVersionResource.Builder builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public Builder mergeResource(io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.Meta.GroupVersionResource.newBuilder(resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource.Builder getResourceBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is the name of the resource being requested.  This is not the kind.  For example: pods
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 7;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionResource,
                  io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private java.lang.Object subResource_ = "";
      /**
       *
       *
       * <pre>
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public boolean hasSubResource() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       *
       *
       * <pre>
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public java.lang.String getSubResource() {
        java.lang.Object ref = subResource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            subResource_ = s;
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
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public com.google.protobuf.ByteString getSubResourceBytes() {
        java.lang.Object ref = subResource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          subResource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public Builder setSubResource(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        subResource_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public Builder clearSubResource() {
        bitField0_ = (bitField0_ & ~0x00000080);
        subResource_ = getDefaultInstance().getSubResource();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SubResource is the name of the subresource being requested.  This is a different resource, scoped to the parent
       * resource, but it may have a different kind. For instance, /pods has the resource "pods" and the kind "Pod", while
       * /pods/foo/status has the resource "pods", the sub resource "status", and the kind "Pod" (because status operates on
       * pods). The binding resource for a pod though may be /pods/foo/binding, which has resource "pods", subresource
       * "binding", and kind "Binding".
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 8;</code>
       */
      public Builder setSubResourceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        subResource_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1Authentication.UserInfo userInfo_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Authentication.UserInfo,
              io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>
          userInfoBuilder_;
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public boolean hasUserInfo() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo() {
        if (userInfoBuilder_ == null) {
          return userInfo_ == null
              ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
              : userInfo_;
        } else {
          return userInfoBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public Builder setUserInfo(io.kubernetes.client.proto.V1Authentication.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userInfo_ = value;
          onChanged();
        } else {
          userInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public Builder setUserInfo(
          io.kubernetes.client.proto.V1Authentication.UserInfo.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          userInfo_ = builderForValue.build();
          onChanged();
        } else {
          userInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public Builder mergeUserInfo(io.kubernetes.client.proto.V1Authentication.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100)
              && userInfo_ != null
              && userInfo_
                  != io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()) {
            userInfo_ =
                io.kubernetes.client.proto.V1Authentication.UserInfo.newBuilder(userInfo_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            userInfo_ = value;
          }
          onChanged();
        } else {
          userInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public Builder clearUserInfo() {
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
          onChanged();
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfo.Builder getUserInfoBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getUserInfoFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder() {
        if (userInfoBuilder_ != null) {
          return userInfoBuilder_.getMessageOrBuilder();
        } else {
          return userInfo_ == null
              ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
              : userInfo_;
        }
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Authentication.UserInfo,
              io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>
          getUserInfoFieldBuilder() {
        if (userInfoBuilder_ == null) {
          userInfoBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Authentication.UserInfo,
                  io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
                  io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>(
                  getUserInfo(), getParentForChildren(), isClean());
          userInfo_ = null;
        }
        return userInfoBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1alpha1.AdmissionReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1alpha1.AdmissionReviewSpec)
    private static final io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec();
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionReviewSpec>() {
          public AdmissionReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionReviewSpec> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface AdmissionReviewStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1alpha1.AdmissionReviewStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean hasAllowed();
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean getAllowed();

    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Status getStatus();
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * AdmissionReviewStatus describes the status of the admission request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReviewStatus}
   */
  public static final class AdmissionReviewStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1alpha1.AdmissionReviewStatus)
      AdmissionReviewStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionReviewStatus.newBuilder() to construct.
    private AdmissionReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionReviewStatus() {
      allowed_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionReviewStatus(
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
            case 8:
              {
                bitField0_ |= 0x00000001;
                allowed_ = input.readBool();
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.Status.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Status.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Admission
          .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.class,
              io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private boolean allowed_;
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean hasAllowed() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean getAllowed() {
      return allowed_;
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.Status status_;
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Status getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
          : status_;
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
        output.writeBool(1, allowed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getStatus());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, allowed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus other =
          (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus) obj;

      boolean result = true;
      result = result && (hasAllowed() == other.hasAllowed());
      if (hasAllowed()) {
        result = result && (getAllowed() == other.getAllowed());
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
      if (hasAllowed()) {
        hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowed());
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus prototype) {
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
     * AdmissionReviewStatus describes the status of the admission request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1alpha1.AdmissionReviewStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1alpha1.AdmissionReviewStatus)
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.class,
                io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getStatusFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        allowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Admission
            .internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
            .getDefaultInstance();
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus build() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus buildPartial() {
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus result =
            new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.allowed_ = allowed_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
                .getDefaultInstance()) return this;
        if (other.hasAllowed()) {
          setAllowed(other.getAllowed());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus)
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

      private boolean allowed_;
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean hasAllowed() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean getAllowed() {
        return allowed_;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder setAllowed(boolean value) {
        bitField0_ |= 0x00000001;
        allowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder clearAllowed() {
        bitField0_ = (bitField0_ & ~0x00000001);
        allowed_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Status status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Status,
              io.kubernetes.client.proto.Meta.Status.Builder,
              io.kubernetes.client.proto.Meta.StatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Status getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.Meta.Status value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.Meta.Status.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public Builder mergeStatus(io.kubernetes.client.proto.Meta.Status value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && status_ != null
              && status_ != io.kubernetes.client.proto.Meta.Status.getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.Meta.Status.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Status.Builder getStatusBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Status,
              io.kubernetes.client.proto.Meta.Status.Builder,
              io.kubernetes.client.proto.Meta.StatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Status,
                  io.kubernetes.client.proto.Meta.Status.Builder,
                  io.kubernetes.client.proto.Meta.StatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1alpha1.AdmissionReviewStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1alpha1.AdmissionReviewStatus)
    private static final io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus();
    }

    public static io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionReviewStatus> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionReviewStatus>() {
          public AdmissionReviewStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionReviewStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionReviewStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionReviewStatus> getParserForType() {
      return PARSER;
    }

    public io.kubernetes.client.proto.V1alpha1Admission.AdmissionReviewStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-k8s.io/api/admission/v1alpha1/generate"
          + "d.proto\022\035k8s.io.api.admission.v1alpha1\032,"
          + "k8s.io/api/authentication/v1/generated.p"
          + "roto\0324k8s.io/apimachinery/pkg/apis/meta/"
          + "v1/generated.proto\032/k8s.io/apimachinery/"
          + "pkg/runtime/generated.proto\0326k8s.io/apim"
          + "achinery/pkg/runtime/schema/generated.pr"
          + "oto\0323k8s.io/apimachinery/pkg/util/intstr"
          + "/generated.proto\"\231\001\n\017AdmissionReview\022@\n\004"
          + "spec\030\001 \001(\01322.k8s.io.api.admission.v1alph",
      "a1.AdmissionReviewSpec\022D\n\006status\030\002 \001(\01324"
          + ".k8s.io.api.admission.v1alpha1.Admission"
          + "ReviewStatus\"\255\003\n\023AdmissionReviewSpec\022D\n\004"
          + "kind\030\001 \001(\01326.k8s.io.apimachinery.pkg.api"
          + "s.meta.v1.GroupVersionKind\022=\n\006object\030\002 \001"
          + "(\0132-.k8s.io.apimachinery.pkg.runtime.Raw"
          + "Extension\022@\n\toldObject\030\003 \001(\0132-.k8s.io.ap"
          + "imachinery.pkg.runtime.RawExtension\022\021\n\to"
          + "peration\030\004 \001(\t\022\014\n\004name\030\005 \001(\t\022\021\n\tnamespac"
          + "e\030\006 \001(\t\022L\n\010resource\030\007 \001(\0132:.k8s.io.apima",
      "chinery.pkg.apis.meta.v1.GroupVersionRes"
          + "ource\022\023\n\013subResource\030\010 \001(\t\0228\n\010userInfo\030\t"
          + " \001(\0132&.k8s.io.api.authentication.v1.User"
          + "Info\"f\n\025AdmissionReviewStatus\022\017\n\007allowed"
          + "\030\001 \001(\010\022<\n\006status\030\002 \001(\0132,.k8s.io.apimachi"
          + "nery.pkg.apis.meta.v1.StatusB9\n\032io.kuber"
          + "netes.client.protoB\021V1alpha1AdmissionZ\010v"
          + "1alpha1"
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
          io.kubernetes.client.proto.V1Authentication.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
          io.kubernetes.client.proto.IntStr.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1alpha1_AdmissionReview_descriptor,
            new java.lang.String[] {
              "Spec", "Status",
            });
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewSpec_descriptor,
            new java.lang.String[] {
              "Kind",
              "Object",
              "OldObject",
              "Operation",
              "Name",
              "Namespace",
              "Resource",
              "SubResource",
              "UserInfo",
            });
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1alpha1_AdmissionReviewStatus_descriptor,
            new java.lang.String[] {
              "Allowed", "Status",
            });
    io.kubernetes.client.proto.V1Authentication.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
    io.kubernetes.client.proto.IntStr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
