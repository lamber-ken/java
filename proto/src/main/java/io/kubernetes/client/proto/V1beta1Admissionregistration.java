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

public final class V1beta1Admissionregistration {
  private V1beta1Admissionregistration() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface MutatingWebhookConfigurationOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration)
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
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        getWebhooksList();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(int index);
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    int getWebhooksCount();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
        getWebhooksOrBuilderList();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder getWebhooksOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration}
   */
  public static final class MutatingWebhookConfiguration
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration)
      MutatingWebhookConfigurationOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MutatingWebhookConfiguration.newBuilder() to construct.
    private MutatingWebhookConfiguration(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MutatingWebhookConfiguration() {
      webhooks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MutatingWebhookConfiguration(
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
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  webhooks_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>();
                  mutable_bitField0_ |= 0x00000002;
                }
                webhooks_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.PARSER,
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
          webhooks_ = java.util.Collections.unmodifiableList(webhooks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
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

    public static final int WEBHOOKS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        webhooks_;
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        getWebhooksList() {
      return webhooks_;
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
        getWebhooksOrBuilderList() {
      return webhooks_;
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public int getWebhooksCount() {
      return webhooks_.size();
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(int index) {
      return webhooks_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder
        getWebhooksOrBuilder(int index) {
      return webhooks_.get(index);
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
      for (int i = 0; i < webhooks_.size(); i++) {
        output.writeMessage(2, webhooks_.get(i));
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
      for (int i = 0; i < webhooks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, webhooks_.get(i));
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
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration)
              obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getWebhooksList().equals(other.getWebhooksList());
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
      if (getWebhooksCount() > 0) {
        hash = (37 * hash) + WEBHOOKS_FIELD_NUMBER;
        hash = (53 * hash) + getWebhooksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
            prototype) {
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
     * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration)
        io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                    .class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration.newBuilder()
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
          getWebhooksFieldBuilder();
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
        if (webhooksBuilder_ == null) {
          webhooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          webhooksBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
          build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
            result =
                new io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfiguration(this);
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
        if (webhooksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            webhooks_ = java.util.Collections.unmodifiableList(webhooks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.webhooks_ = webhooks_;
        } else {
          result.webhooks_ = webhooksBuilder_.build();
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
            io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
              other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (webhooksBuilder_ == null) {
          if (!other.webhooks_.isEmpty()) {
            if (webhooks_.isEmpty()) {
              webhooks_ = other.webhooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureWebhooksIsMutable();
              webhooks_.addAll(other.webhooks_);
            }
            onChanged();
          }
        } else {
          if (!other.webhooks_.isEmpty()) {
            if (webhooksBuilder_.isEmpty()) {
              webhooksBuilder_.dispose();
              webhooksBuilder_ = null;
              webhooks_ = other.webhooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              webhooksBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getWebhooksFieldBuilder()
                      : null;
            } else {
              webhooksBuilder_.addAllMessages(other.webhooks_);
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration)
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

      private java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
          webhooks_ = java.util.Collections.emptyList();

      private void ensureWebhooksIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          webhooks_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>(webhooks_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          webhooksBuilder_;

      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
          getWebhooksList() {
        if (webhooksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(webhooks_);
        } else {
          return webhooksBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public int getWebhooksCount() {
        if (webhooksBuilder_ == null) {
          return webhooks_.size();
        } else {
          return webhooksBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(
          int index) {
        if (webhooksBuilder_ == null) {
          return webhooks_.get(index);
        } else {
          return webhooksBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder setWebhooks(
          int index, io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.set(index, value);
          onChanged();
        } else {
          webhooksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder setWebhooks(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.set(index, builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.add(value);
          onChanged();
        } else {
          webhooksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          int index, io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.add(index, value);
          onChanged();
        } else {
          webhooksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.add(builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.add(index, builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addAllWebhooks(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
              values) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, webhooks_);
          onChanged();
        } else {
          webhooksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder clearWebhooks() {
        if (webhooksBuilder_ == null) {
          webhooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          webhooksBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder removeWebhooks(int index) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.remove(index);
          onChanged();
        } else {
          webhooksBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          getWebhooksBuilder(int index) {
        return getWebhooksFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder
          getWebhooksOrBuilder(int index) {
        if (webhooksBuilder_ == null) {
          return webhooks_.get(index);
        } else {
          return webhooksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          getWebhooksOrBuilderList() {
        if (webhooksBuilder_ != null) {
          return webhooksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(webhooks_);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          addWebhooksBuilder() {
        return getWebhooksFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          addWebhooksBuilder(int index) {
        return getWebhooksFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder>
          getWebhooksBuilderList() {
        return getWebhooksFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          getWebhooksFieldBuilder() {
        if (webhooksBuilder_ == null) {
          webhooksBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>(
                  webhooks_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          webhooks_ = null;
        }
        return webhooksBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfiguration();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfiguration
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MutatingWebhookConfiguration> PARSER =
        new com.google.protobuf.AbstractParser<MutatingWebhookConfiguration>() {
          @java.lang.Override
          public MutatingWebhookConfiguration parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MutatingWebhookConfiguration(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MutatingWebhookConfiguration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MutatingWebhookConfiguration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MutatingWebhookConfigurationListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList)
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
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration>
        getItemsList();
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration getItems(
        int index);
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfigurationOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList}
   */
  public static final class MutatingWebhookConfigurationList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList)
      MutatingWebhookConfigurationListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MutatingWebhookConfigurationList.newBuilder() to construct.
    private MutatingWebhookConfigurationList(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MutatingWebhookConfigurationList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MutatingWebhookConfigurationList(
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
                          io.kubernetes.client.proto.V1beta1Admissionregistration
                              .MutatingWebhookConfiguration>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration
                            .MutatingWebhookConfiguration.PARSER,
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
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .MutatingWebhookConfigurationList.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .MutatingWebhookConfigurationList.Builder.class);
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
            io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration>
        items_;
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfigurationOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
        getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of MutatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationOrBuilder
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
          instanceof
          io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
          other =
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfigurationList)
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

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
            prototype) {
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
     * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
     * </pre>
     *
     * Protobuf type {@code
     * k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList)
        io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfigurationList.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfigurationList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationList
          build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationList
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
            result =
                new io.kubernetes.client.proto.V1beta1Admissionregistration
                    .MutatingWebhookConfigurationList(this);
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
            instanceof
            io.kubernetes.client.proto.V1beta1Admissionregistration
                .MutatingWebhookConfigurationList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfigurationList)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
              other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration
                .MutatingWebhookConfigurationList.getDefaultInstance()) return this;
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfigurationList)
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
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfiguration>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration,
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .MutatingWebhookConfigurationOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration>
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1beta1Admissionregistration
                          .MutatingWebhookConfiguration>
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
              .Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationOrBuilder
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfigurationOrBuilder>
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
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
              .Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
              .Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of MutatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration,
              io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .MutatingWebhookConfigurationOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfiguration,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfiguration.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .MutatingWebhookConfigurationOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration
              .MutatingWebhookConfigurationList();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .MutatingWebhookConfigurationList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MutatingWebhookConfigurationList> PARSER =
        new com.google.protobuf.AbstractParser<MutatingWebhookConfigurationList>() {
          @java.lang.Override
          public MutatingWebhookConfigurationList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MutatingWebhookConfigurationList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MutatingWebhookConfigurationList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MutatingWebhookConfigurationList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.MutatingWebhookConfigurationList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.Rule)
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.Rule}
   */
  public static final class Rule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.Rule)
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
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder.class);
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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
     * For example:
     * 'pods' means pods.
     * 'pods/log' means the log subresource of pods.
     * '*' means all resources, but not subresources.
     * 'pods/&#42;' means all subresources of pods.
     * '*&#47;scale' means all scale subresources.
     * '*&#47;&#42;' means all resources and their subresources.
     * If wildcard is present, the validation rule will ensure resources do not
     * overlap with each other.
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

    @java.lang.Override
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.Rule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.Rule other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.Rule) obj;

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

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parseFrom(
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.Rule prototype) {
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
     * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended
     * to make sure that all the tuple expansions are valid.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.Rule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.Rule)
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.newBuilder()
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
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        apiVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.Rule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.Rule result =
            new io.kubernetes.client.proto.V1beta1Admissionregistration.Rule(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.Rule) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Admissionregistration.Rule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Admissionregistration.Rule other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance())
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

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Admissionregistration.Rule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.Rule)
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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
       * For example:
       * 'pods' means pods.
       * 'pods/log' means the log subresource of pods.
       * '*' means all resources, but not subresources.
       * 'pods/&#42;' means all subresources of pods.
       * '*&#47;scale' means all scale subresources.
       * '*&#47;&#42;' means all resources and their subresources.
       * If wildcard is present, the validation rule will ensure resources do not
       * overlap with each other.
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.Rule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.Rule)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration.Rule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Admissionregistration.Rule();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Rule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Rule> PARSER =
        new com.google.protobuf.AbstractParser<Rule>() {
          @java.lang.Override
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

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RuleWithOperationsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.RuleWithOperations)
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
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
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
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.Rule getRule();
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder getRuleOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make
   * sure that all the tuple expansions are valid.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.RuleWithOperations}
   */
  public static final class RuleWithOperations extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.RuleWithOperations)
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  operations_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                operations_.add(bs);
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = rule_.toBuilder();
                }
                rule_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(rule_);
                  rule_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = operations_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
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
    private io.kubernetes.client.proto.V1beta1Admissionregistration.Rule rule_;
    /**
     *
     *
     * <pre>
     * Rule is embedded, it describes other criteria of the rule, like
     * APIGroups, APIVersions, Resources, etc.
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
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
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule getRule() {
      return rule_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance()
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
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder
        getRuleOrBuilder() {
      return rule_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance()
          : rule_;
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
      for (int i = 0; i < operations_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operations_.getRaw(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(2, getRule());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
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
          instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations) obj;

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

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations prototype) {
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
     * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make
     * sure that all the tuple expansions are valid.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.RuleWithOperations}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.RuleWithOperations)
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.newBuilder()
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

      @java.lang.Override
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

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations result =
            new io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations(this);
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
            instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
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

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations)
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

      private io.kubernetes.client.proto.V1beta1Admissionregistration.Rule rule_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder>
          ruleBuilder_;
      /**
       *
       *
       * <pre>
       * Rule is embedded, it describes other criteria of the rule, like
       * APIGroups, APIVersions, Resources, etc.
       * </pre>
       *
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule getRule() {
        if (ruleBuilder_ == null) {
          return rule_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance()
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public Builder setRule(io.kubernetes.client.proto.V1beta1Admissionregistration.Rule value) {
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public Builder setRule(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder builderForValue) {
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public Builder mergeRule(io.kubernetes.client.proto.V1beta1Admissionregistration.Rule value) {
        if (ruleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && rule_ != null
              && rule_
                  != io.kubernetes.client.proto.V1beta1Admissionregistration.Rule
                      .getDefaultInstance()) {
            rule_ =
                io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.newBuilder(rule_)
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder getRuleBuilder() {
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder
          getRuleOrBuilder() {
        if (ruleBuilder_ != null) {
          return ruleBuilder_.getMessageOrBuilder();
        } else {
          return rule_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.getDefaultInstance()
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
       * <code>optional .k8s.io.api.admissionregistration.v1beta1.Rule rule = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder>
          getRuleFieldBuilder() {
        if (ruleBuilder_ == null) {
          ruleBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Rule,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Rule.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.RuleOrBuilder>(
                  getRule(), getParentForChildren(), isClean());
          rule_ = null;
        }
        return ruleBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.RuleWithOperations)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.RuleWithOperations)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RuleWithOperations> PARSER =
        new com.google.protobuf.AbstractParser<RuleWithOperations>() {
          @java.lang.Override
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

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ServiceReferenceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.ServiceReference)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * `namespace` is the namespace of the service.
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
     * `namespace` is the namespace of the service.
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
     * `namespace` is the namespace of the service.
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
     * `name` is the name of the service.
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
     * `name` is the name of the service.
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
     * `name` is the name of the service.
     * Required
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    boolean hasPath();
    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    java.lang.String getPath();
    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    com.google.protobuf.ByteString getPathBytes();
  }
  /**
   *
   *
   * <pre>
   * ServiceReference holds a reference to Service.legacy.k8s.io
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.ServiceReference}
   */
  public static final class ServiceReference extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.ServiceReference)
      ServiceReferenceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ServiceReference.newBuilder() to construct.
    private ServiceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ServiceReference() {
      namespace_ = "";
      name_ = "";
      path_ = "";
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
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                path_ = bs;
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
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder
                  .class);
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * `namespace` is the namespace of the service.
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
     * `namespace` is the namespace of the service.
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
     * `namespace` is the namespace of the service.
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
     * `name` is the name of the service.
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
     * `name` is the name of the service.
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
     * `name` is the name of the service.
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

    public static final int PATH_FIELD_NUMBER = 3;
    private volatile java.lang.Object path_;
    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * `path` is an optional URL path which will be sent in any request to
     * this service.
     * +optional
     * </pre>
     *
     * <code>optional string path = 3;</code>
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
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
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
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
          instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference) obj;

      boolean result = true;
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasPath() == other.hasPath());
      if (hasPath()) {
        result = result && getPath().equals(other.getPath());
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference prototype) {
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
     * ServiceReference holds a reference to Service.legacy.k8s.io
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.ServiceReference}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.ServiceReference)
        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.newBuilder()
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
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference result =
            new io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference(this);
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
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.path_ = path_;
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
            instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
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
        if (other.hasPath()) {
          bitField0_ |= 0x00000004;
          path_ = other.path_;
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference)
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
       * `namespace` is the namespace of the service.
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
       * `namespace` is the namespace of the service.
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
       * `namespace` is the namespace of the service.
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
       * `namespace` is the namespace of the service.
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
       * `namespace` is the namespace of the service.
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
       * `namespace` is the namespace of the service.
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
       * `name` is the name of the service.
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
       * `name` is the name of the service.
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
       * `name` is the name of the service.
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
       * `name` is the name of the service.
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
       * `name` is the name of the service.
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
       * `name` is the name of the service.
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

      private java.lang.Object path_ = "";
      /**
       *
       *
       * <pre>
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            path_ = s;
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
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public com.google.protobuf.ByteString getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public Builder setPath(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000004);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * `path` is an optional URL path which will be sent in any request to
       * this service.
       * +optional
       * </pre>
       *
       * <code>optional string path = 3;</code>
       */
      public Builder setPathBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        path_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.ServiceReference)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.ServiceReference)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ServiceReference> PARSER =
        new com.google.protobuf.AbstractParser<ServiceReference>() {
          @java.lang.Override
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

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ValidatingWebhookConfigurationOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration)
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
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        getWebhooksList();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(int index);
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    int getWebhooksCount();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
        getWebhooksOrBuilderList();
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder getWebhooksOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration}
   */
  public static final class ValidatingWebhookConfiguration
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration)
      ValidatingWebhookConfigurationOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ValidatingWebhookConfiguration.newBuilder() to construct.
    private ValidatingWebhookConfiguration(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ValidatingWebhookConfiguration() {
      webhooks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ValidatingWebhookConfiguration(
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
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  webhooks_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>();
                  mutable_bitField0_ |= 0x00000002;
                }
                webhooks_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.PARSER,
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
          webhooks_ = java.util.Collections.unmodifiableList(webhooks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
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

    public static final int WEBHOOKS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        webhooks_;
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
        getWebhooksList() {
      return webhooks_;
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
        getWebhooksOrBuilderList() {
      return webhooks_;
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public int getWebhooksCount() {
      return webhooks_.size();
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(int index) {
      return webhooks_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Webhooks is a list of webhooks and the affected resources and operations.
     * +optional
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder
        getWebhooksOrBuilder(int index) {
      return webhooks_.get(index);
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
      for (int i = 0; i < webhooks_.size(); i++) {
        output.writeMessage(2, webhooks_.get(i));
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
      for (int i = 0; i < webhooks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, webhooks_.get(i));
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
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration)
              obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getWebhooksList().equals(other.getWebhooksList());
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
      if (getWebhooksCount() > 0) {
        hash = (37 * hash) + WEBHOOKS_FIELD_NUMBER;
        hash = (53 * hash) + getWebhooksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
            prototype) {
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
     * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration)
        io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfiguration.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfiguration.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration.newBuilder()
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
          getWebhooksFieldBuilder();
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
        if (webhooksBuilder_ == null) {
          webhooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          webhooksBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
          build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
            result =
                new io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfiguration(this);
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
        if (webhooksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            webhooks_ = java.util.Collections.unmodifiableList(webhooks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.webhooks_ = webhooks_;
        } else {
          result.webhooks_ = webhooksBuilder_.build();
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
            io.kubernetes.client.proto.V1beta1Admissionregistration
                .ValidatingWebhookConfiguration) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfiguration)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
              other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration
                .ValidatingWebhookConfiguration.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (webhooksBuilder_ == null) {
          if (!other.webhooks_.isEmpty()) {
            if (webhooks_.isEmpty()) {
              webhooks_ = other.webhooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureWebhooksIsMutable();
              webhooks_.addAll(other.webhooks_);
            }
            onChanged();
          }
        } else {
          if (!other.webhooks_.isEmpty()) {
            if (webhooksBuilder_.isEmpty()) {
              webhooksBuilder_.dispose();
              webhooksBuilder_ = null;
              webhooks_ = other.webhooks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              webhooksBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getWebhooksFieldBuilder()
                      : null;
            } else {
              webhooksBuilder_.addAllMessages(other.webhooks_);
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfiguration)
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

      private java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
          webhooks_ = java.util.Collections.emptyList();

      private void ensureWebhooksIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          webhooks_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>(webhooks_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          webhooksBuilder_;

      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
          getWebhooksList() {
        if (webhooksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(webhooks_);
        } else {
          return webhooksBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public int getWebhooksCount() {
        if (webhooksBuilder_ == null) {
          return webhooks_.size();
        } else {
          return webhooksBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook getWebhooks(
          int index) {
        if (webhooksBuilder_ == null) {
          return webhooks_.get(index);
        } else {
          return webhooksBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder setWebhooks(
          int index, io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.set(index, value);
          onChanged();
        } else {
          webhooksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder setWebhooks(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.set(index, builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.add(value);
          onChanged();
        } else {
          webhooksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          int index, io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook value) {
        if (webhooksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWebhooksIsMutable();
          webhooks_.add(index, value);
          onChanged();
        } else {
          webhooksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.add(builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addWebhooks(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder builderForValue) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.add(index, builderForValue.build());
          onChanged();
        } else {
          webhooksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder addAllWebhooks(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook>
              values) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, webhooks_);
          onChanged();
        } else {
          webhooksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder clearWebhooks() {
        if (webhooksBuilder_ == null) {
          webhooks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          webhooksBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public Builder removeWebhooks(int index) {
        if (webhooksBuilder_ == null) {
          ensureWebhooksIsMutable();
          webhooks_.remove(index);
          onChanged();
        } else {
          webhooksBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          getWebhooksBuilder(int index) {
        return getWebhooksFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder
          getWebhooksOrBuilder(int index) {
        if (webhooksBuilder_ == null) {
          return webhooks_.get(index);
        } else {
          return webhooksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          getWebhooksOrBuilderList() {
        if (webhooksBuilder_ != null) {
          return webhooksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(webhooks_);
        }
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          addWebhooksBuilder() {
        return getWebhooksFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder
          addWebhooksBuilder(int index) {
        return getWebhooksFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Webhooks is a list of webhooks and the affected resources and operations.
       * +optional
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.admissionregistration.v1beta1.Webhook Webhooks = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder>
          getWebhooksBuilderList() {
        return getWebhooksFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>
          getWebhooksFieldBuilder() {
        if (webhooksBuilder_ == null) {
          webhooksBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder>(
                  webhooks_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          webhooks_ = null;
        }
        return webhooksBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfiguration();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfiguration
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ValidatingWebhookConfiguration> PARSER =
        new com.google.protobuf.AbstractParser<ValidatingWebhookConfiguration>() {
          @java.lang.Override
          public ValidatingWebhookConfiguration parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ValidatingWebhookConfiguration(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ValidatingWebhookConfiguration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValidatingWebhookConfiguration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ValidatingWebhookConfigurationListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList)
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
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration>
        getItemsList();
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration getItems(
        int index);
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfigurationOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
   * </pre>
   *
   * Protobuf type {@code
   * k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList}
   */
  public static final class ValidatingWebhookConfigurationList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList)
      ValidatingWebhookConfigurationListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ValidatingWebhookConfigurationList.newBuilder() to construct.
    private ValidatingWebhookConfigurationList(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ValidatingWebhookConfigurationList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ValidatingWebhookConfigurationList(
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
                          io.kubernetes.client.proto.V1beta1Admissionregistration
                              .ValidatingWebhookConfiguration>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration
                            .ValidatingWebhookConfiguration.PARSER,
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
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfigurationList.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfigurationList.Builder.class);
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
            io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration>
        items_;
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfigurationOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
        getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of ValidatingWebhookConfiguration.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationOrBuilder
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
          instanceof
          io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
          other =
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfigurationList)
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

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
            prototype) {
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
     * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
     * </pre>
     *
     * Protobuf type {@code
     * k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList)
        io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfigurationList.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfigurationList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationList
          build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
            result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationList
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
            result =
                new io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfigurationList(this);
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
            instanceof
            io.kubernetes.client.proto.V1beta1Admissionregistration
                .ValidatingWebhookConfigurationList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfigurationList)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
              other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration
                .ValidatingWebhookConfigurationList.getDefaultInstance()) return this;
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfigurationList
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfigurationList)
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
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfiguration>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfiguration>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfiguration,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfigurationOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfiguration>
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1beta1Admissionregistration
                          .ValidatingWebhookConfiguration>
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
              .Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationOrBuilder
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfigurationOrBuilder>
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
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
              .Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfiguration.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
              .Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Admissionregistration
                    .ValidatingWebhookConfiguration.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ValidatingWebhookConfiguration.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfiguration items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfiguration,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ValidatingWebhookConfiguration
                  .Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration
                  .ValidatingWebhookConfigurationOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfiguration,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfiguration.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ValidatingWebhookConfigurationOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.ValidatingWebhookConfigurationList)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration
              .ValidatingWebhookConfigurationList();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ValidatingWebhookConfigurationList> PARSER =
        new com.google.protobuf.AbstractParser<ValidatingWebhookConfigurationList>() {
          @java.lang.Override
          public ValidatingWebhookConfigurationList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ValidatingWebhookConfigurationList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ValidatingWebhookConfigurationList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValidatingWebhookConfigurationList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration
            .ValidatingWebhookConfigurationList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface WebhookOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.Webhook)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The name of the admission webhook.
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
     * The name of the admission webhook.
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
     * The name of the admission webhook.
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
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
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
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig getClientConfig();
    /**
     *
     *
     * <pre>
     * ClientConfig defines how to communicate with the hook.
     * Required
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder
        getClientConfigOrBuilder();

    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
        getRulesList();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations getRules(int index);
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    int getRulesCount();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder>
        getRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder
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

    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    boolean hasNamespaceSelector();
    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector();
    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getNamespaceSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    boolean hasSideEffects();
    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    java.lang.String getSideEffects();
    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    com.google.protobuf.ByteString getSideEffectsBytes();
  }
  /**
   *
   *
   * <pre>
   * Webhook describes an admission webhook and the resources and operations it applies to.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.Webhook}
   */
  public static final class Webhook extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.Webhook)
      WebhookOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Webhook.newBuilder() to construct.
    private Webhook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Webhook() {
      name_ = "";
      rules_ = java.util.Collections.emptyList();
      failurePolicy_ = "";
      sideEffects_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Webhook(
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
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = clientConfig_.toBuilder();
                }
                clientConfig_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
                            .PARSER,
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
                          io.kubernetes.client.proto.V1beta1Admissionregistration
                              .RuleWithOperations>();
                  mutable_bitField0_ |= 0x00000004;
                }
                rules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
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
            case 42:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = namespaceSelector_.toBuilder();
                }
                namespaceSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(namespaceSelector_);
                  namespaceSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                sideEffects_ = bs;
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * The name of the admission webhook.
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
     * The name of the admission webhook.
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
     * The name of the admission webhook.
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
    private io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
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
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        getClientConfig() {
      return clientConfig_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
     * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder
        getClientConfigOrBuilder() {
      return clientConfig_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
              .getDefaultInstance()
          : clientConfig_;
    }

    public static final int RULES_FIELD_NUMBER = 3;
    private java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
        rules_;
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
        getRulesList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder>
        getRulesOrBuilderList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
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
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations getRules(
        int index) {
      return rules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * The webhook cares about an operation if it matches _any_ Rule.
     * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
     * from putting the cluster in a state which cannot be recovered from without completely
     * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
     * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder
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

    public static final int NAMESPACESELECTOR_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.Meta.LabelSelector namespaceSelector_;
    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    public boolean hasNamespaceSelector() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector() {
      return namespaceSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : namespaceSelector_;
    }
    /**
     *
     *
     * <pre>
     * NamespaceSelector decides whether to run the webhook on an object based
     * on whether the namespace for that object matches the selector. If the
     * object itself is a namespace, the matching is performed on
     * object.metadata.labels. If the object is another cluster scoped resource,
     * it never skips the webhook.
     * For example, to run the webhook on any objects whose namespace is not
     * associated with "runlevel" of "0" or "1";  you will set the selector as
     * follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * If instead you want to only run the webhook on any objects whose
     * namespace is associated with the "environment" of "prod" or "staging";
     * you will set the selector as follows:
     * "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * See
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * for more examples of label selectors.
     * Default to the empty LabelSelector, which matches everything.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getNamespaceSelectorOrBuilder() {
      return namespaceSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : namespaceSelector_;
    }

    public static final int SIDEEFFECTS_FIELD_NUMBER = 6;
    private volatile java.lang.Object sideEffects_;
    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    public boolean hasSideEffects() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    public java.lang.String getSideEffects() {
      java.lang.Object ref = sideEffects_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sideEffects_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * SideEffects states whether this webhookk has side effects.
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun
     * Webhooks with side effects MUST implement a reconciliation system, since a request may be
     * rejected by a future step in the admission change and the side effects therefore need to be undone.
     * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
     * sideEffects == Unknown or Some. Defaults to Unknown.
     * +optional
     * </pre>
     *
     * <code>optional string sideEffects = 6;</code>
     */
    public com.google.protobuf.ByteString getSideEffectsBytes() {
      java.lang.Object ref = sideEffects_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sideEffects_ = b;
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
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(5, getNamespaceSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sideEffects_);
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
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getClientConfig());
      }
      for (int i = 0; i < rules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, rules_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, failurePolicy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getNamespaceSelector());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sideEffects_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook) obj;

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
      result = result && (hasNamespaceSelector() == other.hasNamespaceSelector());
      if (hasNamespaceSelector()) {
        result = result && getNamespaceSelector().equals(other.getNamespaceSelector());
      }
      result = result && (hasSideEffects() == other.hasSideEffects());
      if (hasSideEffects()) {
        result = result && getSideEffects().equals(other.getSideEffects());
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
      if (hasNamespaceSelector()) {
        hash = (37 * hash) + NAMESPACESELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getNamespaceSelector().hashCode();
      }
      if (hasSideEffects()) {
        hash = (37 * hash) + SIDEEFFECTS_FIELD_NUMBER;
        hash = (53 * hash) + getSideEffects().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parseFrom(
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook prototype) {
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
     * Webhook describes an admission webhook and the resources and operations it applies to.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.Webhook}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.Webhook)
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.newBuilder()
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
          getNamespaceSelectorFieldBuilder();
        }
      }

      @java.lang.Override
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
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = null;
        } else {
          namespaceSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        sideEffects_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook result =
            new io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook(this);
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
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        if (namespaceSelectorBuilder_ == null) {
          result.namespaceSelector_ = namespaceSelector_;
        } else {
          result.namespaceSelector_ = namespaceSelectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.sideEffects_ = sideEffects_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook.getDefaultInstance())
          return this;
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
        if (other.hasNamespaceSelector()) {
          mergeNamespaceSelector(other.getNamespaceSelector());
        }
        if (other.hasSideEffects()) {
          bitField0_ |= 0x00000020;
          sideEffects_ = other.sideEffects_;
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook)
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
       * The name of the admission webhook.
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
       * The name of the admission webhook.
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
       * The name of the admission webhook.
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
       * The name of the admission webhook.
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
       * The name of the admission webhook.
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
       * The name of the admission webhook.
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

      private io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
          clientConfig_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder>
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
          getClientConfig() {
        if (clientConfigBuilder_ == null) {
          return clientConfig_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder setClientConfig(
          io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig value) {
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder setClientConfig(
          io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public Builder mergeClientConfig(
          io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig value) {
        if (clientConfigBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && clientConfig_ != null
              && clientConfig_
                  != io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
                      .getDefaultInstance()) {
            clientConfig_ =
                io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder
          getClientConfigOrBuilder() {
        if (clientConfigBuilder_ != null) {
          return clientConfigBuilder_.getMessageOrBuilder();
        } else {
          return clientConfig_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
       * optional .k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig clientConfig = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder>
          getClientConfigFieldBuilder() {
        if (clientConfigBuilder_ == null) {
          clientConfigBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .WebhookClientConfigOrBuilder>(
                  getClientConfig(), getParentForChildren(), isClean());
          clientConfig_ = null;
        }
        return clientConfigBuilder_;
      }

      private java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
          rules_ = java.util.Collections.emptyList();

      private void ensureRulesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          rules_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>(
                  rules_);
          bitField0_ |= 0x00000004;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder>
          rulesBuilder_;

      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations getRules(
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder setRules(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations value) {
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder setRules(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations value) {
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations value) {
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addRules(
          int index,
          io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public Builder addAllRules(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations>
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
          getRulesBuilder(int index) {
        return getRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1beta1Admissionregistration
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
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
          addRulesBuilder() {
        return getRulesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder
          addRulesBuilder(int index) {
        return getRulesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules describes what operations on what resources/subresources the webhook cares about.
       * The webhook cares about an operation if it matches _any_ Rule.
       * However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks
       * from putting the cluster in a state which cannot be recovered from without completely
       * disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called
       * on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.admissionregistration.v1beta1.RuleWithOperations rules = 3;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder>
          getRulesBuilderList() {
        return getRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperationsOrBuilder>
          getRulesFieldBuilder() {
        if (rulesBuilder_ == null) {
          rulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.RuleWithOperations
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
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

      private io.kubernetes.client.proto.Meta.LabelSelector namespaceSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          namespaceSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public boolean hasNamespaceSelector() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector() {
        if (namespaceSelectorBuilder_ == null) {
          return namespaceSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : namespaceSelector_;
        } else {
          return namespaceSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public Builder setNamespaceSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (namespaceSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          namespaceSelector_ = value;
          onChanged();
        } else {
          namespaceSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public Builder setNamespaceSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = builderForValue.build();
          onChanged();
        } else {
          namespaceSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public Builder mergeNamespaceSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (namespaceSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && namespaceSelector_ != null
              && namespaceSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            namespaceSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(namespaceSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            namespaceSelector_ = value;
          }
          onChanged();
        } else {
          namespaceSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public Builder clearNamespaceSelector() {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = null;
          onChanged();
        } else {
          namespaceSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getNamespaceSelectorBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getNamespaceSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder
          getNamespaceSelectorOrBuilder() {
        if (namespaceSelectorBuilder_ != null) {
          return namespaceSelectorBuilder_.getMessageOrBuilder();
        } else {
          return namespaceSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : namespaceSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * NamespaceSelector decides whether to run the webhook on an object based
       * on whether the namespace for that object matches the selector. If the
       * object itself is a namespace, the matching is performed on
       * object.metadata.labels. If the object is another cluster scoped resource,
       * it never skips the webhook.
       * For example, to run the webhook on any objects whose namespace is not
       * associated with "runlevel" of "0" or "1";  you will set the selector as
       * follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "runlevel",
       *       "operator": "NotIn",
       *       "values": [
       *         "0",
       *         "1"
       *       ]
       *     }
       *   ]
       * }
       * If instead you want to only run the webhook on any objects whose
       * namespace is associated with the "environment" of "prod" or "staging";
       * you will set the selector as follows:
       * "namespaceSelector": {
       *   "matchExpressions": [
       *     {
       *       "key": "environment",
       *       "operator": "In",
       *       "values": [
       *         "prod",
       *         "staging"
       *       ]
       *     }
       *   ]
       * }
       * See
       * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
       * for more examples of label selectors.
       * Default to the empty LabelSelector, which matches everything.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getNamespaceSelectorFieldBuilder() {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getNamespaceSelector(), getParentForChildren(), isClean());
          namespaceSelector_ = null;
        }
        return namespaceSelectorBuilder_;
      }

      private java.lang.Object sideEffects_ = "";
      /**
       *
       *
       * <pre>
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public boolean hasSideEffects() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public java.lang.String getSideEffects() {
        java.lang.Object ref = sideEffects_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sideEffects_ = s;
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
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public com.google.protobuf.ByteString getSideEffectsBytes() {
        java.lang.Object ref = sideEffects_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          sideEffects_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public Builder setSideEffects(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        sideEffects_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public Builder clearSideEffects() {
        bitField0_ = (bitField0_ & ~0x00000020);
        sideEffects_ = getDefaultInstance().getSideEffects();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SideEffects states whether this webhookk has side effects.
       * Acceptable values are: Unknown, None, Some, NoneOnDryRun
       * Webhooks with side effects MUST implement a reconciliation system, since a request may be
       * rejected by a future step in the admission change and the side effects therefore need to be undone.
       * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
       * sideEffects == Unknown or Some. Defaults to Unknown.
       * +optional
       * </pre>
       *
       * <code>optional string sideEffects = 6;</code>
       */
      public Builder setSideEffectsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        sideEffects_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.Webhook)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.Webhook)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Webhook> PARSER =
        new com.google.protobuf.AbstractParser<Webhook>() {
          @java.lang.Override
          public Webhook parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Webhook(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Webhook> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Webhook> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.Webhook
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface WebhookClientConfigOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    boolean hasUrl();
    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    java.lang.String getUrl();
    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    com.google.protobuf.ByteString getUrlBytes();

    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    boolean hasService();
    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference getService();
    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder
        getServiceOrBuilder();

    /**
     *
     *
     * <pre>
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * If unspecified, system trust roots on the apiserver are used.
     * +optional
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    boolean hasCaBundle();
    /**
     *
     *
     * <pre>
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * If unspecified, system trust roots on the apiserver are used.
     * +optional
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
   * WebhookClientConfig contains the information to make a TLS
   * connection with the webhook
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig}
   */
  public static final class WebhookClientConfig extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig)
      WebhookClientConfigOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use WebhookClientConfig.newBuilder() to construct.
    private WebhookClientConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private WebhookClientConfig() {
      url_ = "";
      caBundle_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private WebhookClientConfig(
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
                io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = service_.toBuilder();
                }
                service_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(service_);
                  service_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000001;
                url_ = bs;
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
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Admissionregistration
          .internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.class,
              io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder
                  .class);
    }

    private int bitField0_;
    public static final int URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object url_;
    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * `url` gives the location of the webhook, in standard URL form
     * (`scheme://host:port/path`). Exactly one of `url` or `service`
     * must be specified.
     * The `host` should not refer to a service running in the cluster; use
     * the `service` field instead. The host might be resolved via external
     * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
     * in-cluster DNS as that would be a layering violation). `host` may
     * also be an IP address.
     * Please note that using `localhost` or `127.0.0.1` as a `host` is
     * risky unless you take great care to run this webhook on all hosts
     * which run an apiserver which might need to make calls to this
     * webhook. Such installs are likely to be non-portable, i.e., not easy
     * to turn up in a new cluster.
     * The scheme must be "https"; the URL must begin with "https://".
     * A path is optional, and if present may be any string permissible in
     * a URL. You may use the path to pass an arbitrary string to the
     * webhook, for example, a cluster identifier.
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
     * allowed. Fragments ("#...") and query parameters ("?...") are not
     * allowed, either.
     * +optional
     * </pre>
     *
     * <code>optional string url = 3;</code>
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVICE_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference service_;
    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference getService() {
      return service_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
              .getDefaultInstance()
          : service_;
    }
    /**
     *
     *
     * <pre>
     * `service` is a reference to the service for this webhook. Either
     * `service` or `url` must be specified.
     * If the webhook is running within the cluster, then you should use `service`.
     * Port 443 will be used if it is open, otherwise it is an error.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder
        getServiceOrBuilder() {
      return service_ == null
          ? io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
              .getDefaultInstance()
          : service_;
    }

    public static final int CABUNDLE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString caBundle_;
    /**
     *
     *
     * <pre>
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * If unspecified, system trust roots on the apiserver are used.
     * +optional
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
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * If unspecified, system trust roots on the apiserver are used.
     * +optional
     * </pre>
     *
     * <code>optional bytes caBundle = 2;</code>
     */
    public com.google.protobuf.ByteString getCaBundle() {
      return caBundle_;
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(1, getService());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(2, caBundle_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getService());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, caBundle_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
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
          instanceof io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig other =
          (io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig) obj;

      boolean result = true;
      result = result && (hasUrl() == other.hasUrl());
      if (hasUrl()) {
        result = result && getUrl().equals(other.getUrl());
      }
      result = result && (hasService() == other.hasService());
      if (hasService()) {
        result = result && getService().equals(other.getService());
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
      if (hasUrl()) {
        hash = (37 * hash) + URL_FIELD_NUMBER;
        hash = (53 * hash) + getUrl().hashCode();
      }
      if (hasService()) {
        hash = (37 * hash) + SERVICE_FIELD_NUMBER;
        hash = (53 * hash) + getService().hashCode();
      }
      if (hasCaBundle()) {
        hash = (37 * hash) + CABUNDLE_FIELD_NUMBER;
        hash = (53 * hash) + getCaBundle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig prototype) {
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
     * WebhookClientConfig contains the information to make a TLS
     * connection with the webhook
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig)
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.class,
                io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig.newBuilder()
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

      @java.lang.Override
      public Builder clear() {
        super.clear();
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (serviceBuilder_ == null) {
          service_ = null;
        } else {
          serviceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        caBundle_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration
            .internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig build() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig result =
            new io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.url_ = url_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (serviceBuilder_ == null) {
          result.service_ = service_;
        } else {
          result.service_ = serviceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.caBundle_ = caBundle_;
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
            io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
                .getDefaultInstance()) return this;
        if (other.hasUrl()) {
          bitField0_ |= 0x00000001;
          url_ = other.url_;
          onChanged();
        }
        if (other.hasService()) {
          mergeService(other.getService());
        }
        if (other.hasCaBundle()) {
          setCaBundle(other.getCaBundle());
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
        io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig)
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

      private java.lang.Object url_ = "";
      /**
       *
       *
       * <pre>
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            url_ = s;
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
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public com.google.protobuf.ByteString getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public Builder setUrl(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000001);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * `url` gives the location of the webhook, in standard URL form
       * (`scheme://host:port/path`). Exactly one of `url` or `service`
       * must be specified.
       * The `host` should not refer to a service running in the cluster; use
       * the `service` field instead. The host might be resolved via external
       * DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
       * in-cluster DNS as that would be a layering violation). `host` may
       * also be an IP address.
       * Please note that using `localhost` or `127.0.0.1` as a `host` is
       * risky unless you take great care to run this webhook on all hosts
       * which run an apiserver which might need to make calls to this
       * webhook. Such installs are likely to be non-portable, i.e., not easy
       * to turn up in a new cluster.
       * The scheme must be "https"; the URL must begin with "https://".
       * A path is optional, and if present may be any string permissible in
       * a URL. You may use the path to pass an arbitrary string to the
       * webhook, for example, a cluster identifier.
       * Attempting to use a user or basic auth e.g. "user:password&#64;" is not
       * allowed. Fragments ("#...") and query parameters ("?...") are not
       * allowed, either.
       * +optional
       * </pre>
       *
       * <code>optional string url = 3;</code>
       */
      public Builder setUrlBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        url_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference service_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder>
          serviceBuilder_;
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public boolean hasService() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference getService() {
        if (serviceBuilder_ == null) {
          return service_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
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
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public Builder setService(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference value) {
        if (serviceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          service_ = value;
          onChanged();
        } else {
          serviceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public Builder setService(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder
              builderForValue) {
        if (serviceBuilder_ == null) {
          service_ = builderForValue.build();
          onChanged();
        } else {
          serviceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public Builder mergeService(
          io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference value) {
        if (serviceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && service_ != null
              && service_
                  != io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
                      .getDefaultInstance()) {
            service_ =
                io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.newBuilder(
                        service_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            service_ = value;
          }
          onChanged();
        } else {
          serviceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public Builder clearService() {
        if (serviceBuilder_ == null) {
          service_ = null;
          onChanged();
        } else {
          serviceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder
          getServiceBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getServiceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder
          getServiceOrBuilder() {
        if (serviceBuilder_ != null) {
          return serviceBuilder_.getMessageOrBuilder();
        } else {
          return service_ == null
              ? io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference
                  .getDefaultInstance()
              : service_;
        }
      }
      /**
       *
       *
       * <pre>
       * `service` is a reference to the service for this webhook. Either
       * `service` or `url` must be specified.
       * If the webhook is running within the cluster, then you should use `service`.
       * Port 443 will be used if it is open, otherwise it is an error.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.admissionregistration.v1beta1.ServiceReference service = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder,
              io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReferenceOrBuilder>
          getServiceFieldBuilder() {
        if (serviceBuilder_ == null) {
          serviceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference,
                  io.kubernetes.client.proto.V1beta1Admissionregistration.ServiceReference.Builder,
                  io.kubernetes.client.proto.V1beta1Admissionregistration
                      .ServiceReferenceOrBuilder>(getService(), getParentForChildren(), isClean());
          service_ = null;
        }
        return serviceBuilder_;
      }

      private com.google.protobuf.ByteString caBundle_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
       * If unspecified, system trust roots on the apiserver are used.
       * +optional
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
       * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
       * If unspecified, system trust roots on the apiserver are used.
       * +optional
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
       * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
       * If unspecified, system trust roots on the apiserver are used.
       * +optional
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
       * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
       * If unspecified, system trust roots on the apiserver are used.
       * +optional
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admissionregistration.v1beta1.WebhookClientConfig)
    private static final io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig();
    }

    public static io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<WebhookClientConfig> PARSER =
        new com.google.protobuf.AbstractParser<WebhookClientConfig>() {
          @java.lang.Override
          public WebhookClientConfig parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new WebhookClientConfig(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<WebhookClientConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WebhookClientConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Admissionregistration.WebhookClientConfig
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8k8s.io/api/admissionregistration/v1bet"
          + "a1/generated.proto\022(k8s.io.api.admission"
          + "registration.v1beta1\0324k8s.io/apimachiner"
          + "y/pkg/apis/meta/v1/generated.proto\032/k8s."
          + "io/apimachinery/pkg/runtime/generated.pr"
          + "oto\0326k8s.io/apimachinery/pkg/runtime/sch"
          + "ema/generated.proto\"\247\001\n\034MutatingWebhookC"
          + "onfiguration\022B\n\010metadata\030\001 \001(\01320.k8s.io."
          + "apimachinery.pkg.apis.meta.v1.ObjectMeta"
          + "\022C\n\010Webhooks\030\002 \003(\01321.k8s.io.api.admissio"
          + "nregistration.v1beta1.Webhook\"\273\001\n Mutati"
          + "ngWebhookConfigurationList\022@\n\010metadata\030\001"
          + " \001(\0132..k8s.io.apimachinery.pkg.apis.meta"
          + ".v1.ListMeta\022U\n\005items\030\002 \003(\0132F.k8s.io.api"
          + ".admissionregistration.v1beta1.MutatingW"
          + "ebhookConfiguration\"A\n\004Rule\022\021\n\tapiGroups"
          + "\030\001 \003(\t\022\023\n\013apiVersions\030\002 \003(\t\022\021\n\tresources"
          + "\030\003 \003(\t\"f\n\022RuleWithOperations\022\022\n\noperatio"
          + "ns\030\001 \003(\t\022<\n\004rule\030\002 \001(\0132..k8s.io.api.admi"
          + "ssionregistration.v1beta1.Rule\"A\n\020Servic"
          + "eReference\022\021\n\tnamespace\030\001 \001(\t\022\014\n\004name\030\002 "
          + "\001(\t\022\014\n\004path\030\003 \001(\t\"\251\001\n\036ValidatingWebhookC"
          + "onfiguration\022B\n\010metadata\030\001 \001(\01320.k8s.io."
          + "apimachinery.pkg.apis.meta.v1.ObjectMeta"
          + "\022C\n\010Webhooks\030\002 \003(\01321.k8s.io.api.admissio"
          + "nregistration.v1beta1.Webhook\"\277\001\n\"Valida"
          + "tingWebhookConfigurationList\022@\n\010metadata"
          + "\030\001 \001(\0132..k8s.io.apimachinery.pkg.apis.me"
          + "ta.v1.ListMeta\022W\n\005items\030\002 \003(\0132H.k8s.io.a"
          + "pi.admissionregistration.v1beta1.Validat"
          + "ingWebhookConfiguration\"\265\002\n\007Webhook\022\014\n\004n"
          + "ame\030\001 \001(\t\022S\n\014clientConfig\030\002 \001(\0132=.k8s.io"
          + ".api.admissionregistration.v1beta1.Webho"
          + "okClientConfig\022K\n\005rules\030\003 \003(\0132<.k8s.io.a"
          + "pi.admissionregistration.v1beta1.RuleWit"
          + "hOperations\022\025\n\rfailurePolicy\030\004 \001(\t\022N\n\021na"
          + "mespaceSelector\030\005 \001(\01323.k8s.io.apimachin"
          + "ery.pkg.apis.meta.v1.LabelSelector\022\023\n\013si"
          + "deEffects\030\006 \001(\t\"\201\001\n\023WebhookClientConfig\022"
          + "\013\n\003url\030\003 \001(\t\022K\n\007service\030\001 \001(\0132:.k8s.io.a"
          + "pi.admissionregistration.v1beta1.Service"
          + "Reference\022\020\n\010caBundle\030\002 \001(\014BC\n\032io.kubern"
          + "etes.client.protoB\034V1beta1Admissionregis"
          + "trationZ\007v1beta1"
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
        },
        assigner);
    internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfiguration_descriptor,
            new java.lang.String[] {
              "Metadata", "Webhooks",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_MutatingWebhookConfigurationList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_Rule_descriptor,
            new java.lang.String[] {
              "ApiGroups", "ApiVersions", "Resources",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_RuleWithOperations_descriptor,
            new java.lang.String[] {
              "Operations", "Rule",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_ServiceReference_descriptor,
            new java.lang.String[] {
              "Namespace", "Name", "Path",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfiguration_descriptor,
            new java.lang.String[] {
              "Metadata", "Webhooks",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_ValidatingWebhookConfigurationList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_Webhook_descriptor,
            new java.lang.String[] {
              "Name", "ClientConfig", "Rules", "FailurePolicy", "NamespaceSelector", "SideEffects",
            });
    internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admissionregistration_v1beta1_WebhookClientConfig_descriptor,
            new java.lang.String[] {
              "Url", "Service", "CaBundle",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
