package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Assettransfer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Assettransfer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[AssetGroupMetadata.MetadataCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase = iArr;
            try {
                iArr[AssetGroupMetadata.MetadataCase.FIRMWARE_UPDATE_GROUP_METADATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase[AssetGroupMetadata.MetadataCase.VISUAL_ID_ENROLLMENT_GROUP_METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase[AssetGroupMetadata.MetadataCase.DIAGNOSTICS_UPLOAD_GROUP_METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase[AssetGroupMetadata.MetadataCase.METADATA_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[AssetMetadata.MetadataCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase = iArr2;
            try {
                iArr2[AssetMetadata.MetadataCase.IMAGE_METADATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.VIDEO_METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.FIRMWARE_UPDATE_METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.VISUAL_ID_ENROLLMENT_METADATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.DIAGNOSTICS_UPLOAD_METADATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.CUSTOMER_INFO_METADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[AssetMetadata.MetadataCase.METADATA_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr3;
            try {
                iArr3[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetAvailableInfoOrBuilder extends MessageLiteOrBuilder {
        int getAssetCount();

        AssetManifest getAssetManifest();

        long getAssetSize();

        boolean getIsHighPriority();

        boolean hasAssetManifest();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetGroupMetadataOrBuilder extends MessageLiteOrBuilder {
        DiagnosticsUploadGroupMetadata getDiagnosticsUploadGroupMetadata();

        FirmwareUpdateGroupMetadata getFirmwareUpdateGroupMetadata();

        AssetGroupMetadata.MetadataCase getMetadataCase();

        VisualIdEnrollmentGroupMetadata getVisualIdEnrollmentGroupMetadata();

        boolean hasDiagnosticsUploadGroupMetadata();

        boolean hasFirmwareUpdateGroupMetadata();

        boolean hasVisualIdEnrollmentGroupMetadata();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetInfoOrBuilder extends MessageLiteOrBuilder {
        AssetAvailableInfo getAssetAvailableInfo();

        AssetType getAssetType();

        int getAssetTypeValue();

        boolean hasAssetAvailableInfo();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetManifestOrBuilder extends MessageLiteOrBuilder {
        AssetGroupMetadata getAssetGroupMetadata();

        Asset getAssets(int i);

        int getAssetsCount();

        List<Asset> getAssetsList();

        int getBatchId();

        boolean getHasNext();

        int getTotalAssetCount();

        boolean hasAssetGroupMetadata();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetMetadataOrBuilder extends MessageLiteOrBuilder {
        CustomerInfoMetadata getCustomerInfoMetadata();

        DiagnosticsUploadMetadata getDiagnosticsUploadMetadata();

        FirmwareUpdateMetadata getFirmwareUpdateMetadata();

        ImageMetadata getImageMetadata();

        AssetMetadata.MetadataCase getMetadataCase();

        VideoMetadata getVideoMetadata();

        VisualIdEnrollmentMetadata getVisualIdEnrollmentMetadata();

        boolean hasCustomerInfoMetadata();

        boolean hasDiagnosticsUploadMetadata();

        boolean hasFirmwareUpdateMetadata();

        boolean hasImageMetadata();

        boolean hasVideoMetadata();

        boolean hasVisualIdEnrollmentMetadata();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetOrBuilder extends MessageLiteOrBuilder {
        String getAssetHash();

        ByteString getAssetHashBytes();

        String getAssetId();

        ByteString getAssetIdBytes();

        String getAssetLocation();

        ByteString getAssetLocationBytes();

        AssetMetadata getAssetMetadata();

        AssetRelationship getAssetRelationships(int i);

        int getAssetRelationshipsCount();

        List<AssetRelationship> getAssetRelationshipsList();

        String getCreationUnixTimestamp();

        ByteString getCreationUnixTimestampBytes();

        long getSize();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasAssetMetadata();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetProgressOrBuilder extends MessageLiteOrBuilder {
        int getProgress();

        int getScale();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetRelationshipOrBuilder extends MessageLiteOrBuilder {
        String getRelatedAssetId();

        ByteString getRelatedAssetIdBytes();

        AssetRelationshipType getRelationshipType();

        int getRelationshipTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetTransferSessionConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getMaxItemsPerBatch();

        RequestMode getRequestMode();

        int getRequestModeValue();

        TransferMode getTransferMode();

        int getTransferModeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetTransferStateInfoOrBuilder extends MessageLiteOrBuilder {
        AssetManifest getAssetManifest();

        AssetProgress getAssetProgress();

        TransferErrorCode getErrorCode();

        int getErrorCodeValue();

        TransferStatus getTransferStatus();

        int getTransferStatusValue();

        TransferSummary getTransferSummary();

        boolean hasAssetManifest();

        boolean hasAssetProgress();

        boolean hasTransferSummary();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AssetTransferStatusOrBuilder extends MessageLiteOrBuilder {
        String getAssetId();

        ByteString getAssetIdBytes();

        AssetStatus getAssetStatus();

        int getAssetStatusValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CustomerInfoAttributeOrBuilder extends MessageLiteOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        String getValue();

        ByteString getValueBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CustomerInfoMetadataOrBuilder extends MessageLiteOrBuilder {
        CustomerInfoAttribute getAttributes(int i);

        int getAttributesCount();

        List<CustomerInfoAttribute> getAttributesList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DiagnosticsUploadGroupMetadataOrBuilder extends MessageLiteOrBuilder {
        String getUploadTag();

        ByteString getUploadTagBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DiagnosticsUploadMetadataOrBuilder extends MessageLiteOrBuilder {
        DiagnosticsOuterClass.DiagnosticsType getDiagnosticsType();

        int getDiagnosticsTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FirmwareUpdateGroupMetadataOrBuilder extends MessageLiteOrBuilder {
        String getLocale();

        ByteString getLocaleBytes();

        String getName();

        ByteString getNameBytes();

        String getVersionName();

        ByteString getVersionNameBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FirmwareUpdateMetadataOrBuilder extends MessageLiteOrBuilder {
        int getCurrentVersionCode();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getGroupName();

        ByteString getGroupNameBytes();

        String getMetadataHash();

        ByteString getMetadataHashBytes();

        int getMetadataSize();

        int getOffset();

        boolean getRestartRequired();

        int getTargetVersionCode();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetAssetInfoOrBuilder extends MessageLiteOrBuilder {
        AssetType getAssetType();

        int getAssetTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ImageMetadataOrBuilder extends MessageLiteOrBuilder {
        boolean getIsAutoCapture();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyAssetAvailableOrBuilder extends MessageLiteOrBuilder {
        AssetInfo getAssetInfo();

        boolean hasAssetInfo();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyAssetTransferSessionOrBuilder extends MessageLiteOrBuilder {
        AssetType getAssetType();

        int getAssetTypeValue();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyTransferStateOrBuilder extends MessageLiteOrBuilder {
        AssetTransferStateInfo getAssetTransferStateInfo();

        AssetType getAssetType();

        int getAssetTypeValue();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAssetTransferStateInfo();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoveAssetsOrBuilder extends MessageLiteOrBuilder {
        String getAssetIds(int i);

        ByteString getAssetIdsBytes(int i);

        int getAssetIdsCount();

        List<String> getAssetIdsList();

        AssetType getAssetType();

        int getAssetTypeValue();

        String getBatchId();

        ByteString getBatchIdBytes();

        boolean getForceRemove();

        boolean getRemoveAll();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoveAssetsResponseOrBuilder extends MessageLiteOrBuilder {
        boolean getAllSucceeded();

        String getBatchId();

        ByteString getBatchIdBytes();

        RemoveAssetsResponse.RemovedAssetStatus getRemovedAssets(int i);

        int getRemovedAssetsCount();

        List<RemoveAssetsResponse.RemovedAssetStatus> getRemovedAssetsList();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartAssetTransferSessionOrBuilder extends MessageLiteOrBuilder {
        AssetType getAssetType();

        int getAssetTypeValue();

        AssetTransferSessionConfiguration getConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TransferSummaryOrBuilder extends MessageLiteOrBuilder {
        AssetTransferStatus getAssetTransferStatus(int i);

        int getAssetTransferStatusCount();

        List<AssetTransferStatus> getAssetTransferStatusList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoMetadataOrBuilder extends MessageLiteOrBuilder {
        int getDuration();

        boolean getIsAutoCapture();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisualIdEnrollmentGroupMetadataOrBuilder extends MessageLiteOrBuilder {
        String getVersion();

        ByteString getVersionBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisualIdEnrollmentMetadataOrBuilder extends MessageLiteOrBuilder {
        boolean getEnabled();

        String getPersonId();

        ByteString getPersonIdBytes();

        VisualIdEnrollmentPersonType getPersonType();

        int getPersonTypeValue();
    }

    private Assettransfer() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Asset extends GeneratedMessageLite<Asset, Builder> implements AssetOrBuilder {
        public static final int ASSET_HASH_FIELD_NUMBER = 6;
        public static final int ASSET_ID_FIELD_NUMBER = 2;
        public static final int ASSET_LOCATION_FIELD_NUMBER = 3;
        public static final int ASSET_METADATA_FIELD_NUMBER = 7;
        public static final int ASSET_RELATIONSHIPS_FIELD_NUMBER = 4;
        public static final int CREATION_UNIX_TIMESTAMP_FIELD_NUMBER = 5;
        private static final Asset DEFAULT_INSTANCE;
        private static volatile Parser<Asset> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 8;
        private AssetMetadata assetMetadata_;
        private int bitField0_;
        private long size_;
        private String assetId_ = "";
        private String assetLocation_ = "";
        private Internal.ProtobufList<AssetRelationship> assetRelationships_ = GeneratedMessageLite.emptyProtobufList();
        private String creationUnixTimestamp_ = "";
        private String assetHash_ = "";
        private String version_ = "";

        static {
            Asset asset = new Asset();
            DEFAULT_INSTANCE = asset;
            asset.makeImmutable();
        }

        private Asset() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAssetRelationships(Iterable<? extends AssetRelationship> iterable) {
            ensureAssetRelationshipsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assetRelationships_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetRelationships(AssetRelationship.Builder builder) {
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetHash() {
            this.assetHash_ = getDefaultInstance().getAssetHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = getDefaultInstance().getAssetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetLocation() {
            this.assetLocation_ = getDefaultInstance().getAssetLocation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetMetadata() {
            this.assetMetadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetRelationships() {
            this.assetRelationships_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreationUnixTimestamp() {
            this.creationUnixTimestamp_ = getDefaultInstance().getCreationUnixTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        private void ensureAssetRelationshipsIsMutable() {
            if (this.assetRelationships_.isModifiable()) {
                return;
            }
            this.assetRelationships_ = GeneratedMessageLite.mutableCopy(this.assetRelationships_);
        }

        public static Asset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetMetadata(AssetMetadata assetMetadata) {
            AssetMetadata assetMetadata2 = this.assetMetadata_;
            if (assetMetadata2 == null || assetMetadata2 == AssetMetadata.getDefaultInstance()) {
                this.assetMetadata_ = assetMetadata;
            } else {
                this.assetMetadata_ = AssetMetadata.newBuilder(this.assetMetadata_).mergeFrom((AssetMetadata.Builder) assetMetadata).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Asset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAssetRelationships(int i) {
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetHash(String str) {
            str.getClass();
            this.assetHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetHashBytes(ByteString byteString) {
            this.assetHash_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetId(String str) {
            str.getClass();
            this.assetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetIdBytes(ByteString byteString) {
            this.assetId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetLocation(String str) {
            str.getClass();
            this.assetLocation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetLocationBytes(ByteString byteString) {
            this.assetLocation_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetMetadata(AssetMetadata.Builder builder) {
            this.assetMetadata_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetRelationships(int i, AssetRelationship.Builder builder) {
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreationUnixTimestamp(String str) {
            str.getClass();
            this.creationUnixTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreationUnixTimestampBytes(ByteString byteString) {
            this.creationUnixTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            this.version_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Asset();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.assetRelationships_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Asset asset = (Asset) obj2;
                    long j = this.size_;
                    boolean z = j != 0;
                    long j2 = asset.size_;
                    this.size_ = visitor.visitLong(z, j, j2 != 0, j2);
                    this.assetId_ = visitor.visitString(!this.assetId_.isEmpty(), this.assetId_, !asset.assetId_.isEmpty(), asset.assetId_);
                    this.assetLocation_ = visitor.visitString(!this.assetLocation_.isEmpty(), this.assetLocation_, !asset.assetLocation_.isEmpty(), asset.assetLocation_);
                    this.assetRelationships_ = visitor.visitList(this.assetRelationships_, asset.assetRelationships_);
                    this.creationUnixTimestamp_ = visitor.visitString(!this.creationUnixTimestamp_.isEmpty(), this.creationUnixTimestamp_, !asset.creationUnixTimestamp_.isEmpty(), asset.creationUnixTimestamp_);
                    this.assetHash_ = visitor.visitString(!this.assetHash_.isEmpty(), this.assetHash_, !asset.assetHash_.isEmpty(), asset.assetHash_);
                    this.assetMetadata_ = (AssetMetadata) visitor.visitMessage(this.assetMetadata_, asset.assetMetadata_);
                    this.version_ = visitor.visitString(!this.version_.isEmpty(), this.version_, !asset.version_.isEmpty(), asset.version_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= asset.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.size_ = codedInputStream.readUInt64();
                                } else if (readTag == 18) {
                                    this.assetId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.assetLocation_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    if (!this.assetRelationships_.isModifiable()) {
                                        this.assetRelationships_ = GeneratedMessageLite.mutableCopy(this.assetRelationships_);
                                    }
                                    this.assetRelationships_.add((AssetRelationship) codedInputStream.readMessage(AssetRelationship.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
                                    this.creationUnixTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 50) {
                                    this.assetHash_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 58) {
                                    AssetMetadata assetMetadata = this.assetMetadata_;
                                    AssetMetadata.Builder builder = assetMetadata != null ? assetMetadata.toBuilder() : null;
                                    AssetMetadata assetMetadata2 = (AssetMetadata) codedInputStream.readMessage(AssetMetadata.parser(), extensionRegistryLite);
                                    this.assetMetadata_ = assetMetadata2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetMetadata.Builder) assetMetadata2);
                                        this.assetMetadata_ = builder.buildPartial();
                                    }
                                } else if (readTag == 66) {
                                    this.version_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Asset.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public String getAssetHash() {
            return this.assetHash_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public ByteString getAssetHashBytes() {
            return ByteString.copyFromUtf8(this.assetHash_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public String getAssetId() {
            return this.assetId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public ByteString getAssetIdBytes() {
            return ByteString.copyFromUtf8(this.assetId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public String getAssetLocation() {
            return this.assetLocation_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public ByteString getAssetLocationBytes() {
            return ByteString.copyFromUtf8(this.assetLocation_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public AssetMetadata getAssetMetadata() {
            AssetMetadata assetMetadata = this.assetMetadata_;
            return assetMetadata == null ? AssetMetadata.getDefaultInstance() : assetMetadata;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public AssetRelationship getAssetRelationships(int i) {
            return this.assetRelationships_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public int getAssetRelationshipsCount() {
            return this.assetRelationships_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public List<AssetRelationship> getAssetRelationshipsList() {
            return this.assetRelationships_;
        }

        public AssetRelationshipOrBuilder getAssetRelationshipsOrBuilder(int i) {
            return this.assetRelationships_.get(i);
        }

        public List<? extends AssetRelationshipOrBuilder> getAssetRelationshipsOrBuilderList() {
            return this.assetRelationships_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public String getCreationUnixTimestamp() {
            return this.creationUnixTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public ByteString getCreationUnixTimestampBytes() {
            return ByteString.copyFromUtf8(this.creationUnixTimestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.size_;
            int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) : 0;
            if (!this.assetId_.isEmpty()) {
                computeUInt64Size += CodedOutputStream.computeStringSize(2, getAssetId());
            }
            if (!this.assetLocation_.isEmpty()) {
                computeUInt64Size += CodedOutputStream.computeStringSize(3, getAssetLocation());
            }
            for (int i2 = 0; i2 < this.assetRelationships_.size(); i2++) {
                computeUInt64Size += CodedOutputStream.computeMessageSize(4, this.assetRelationships_.get(i2));
            }
            if (!this.creationUnixTimestamp_.isEmpty()) {
                computeUInt64Size += CodedOutputStream.computeStringSize(5, getCreationUnixTimestamp());
            }
            if (!this.assetHash_.isEmpty()) {
                computeUInt64Size += CodedOutputStream.computeStringSize(6, getAssetHash());
            }
            if (this.assetMetadata_ != null) {
                computeUInt64Size += CodedOutputStream.computeMessageSize(7, getAssetMetadata());
            }
            if (!this.version_.isEmpty()) {
                computeUInt64Size += CodedOutputStream.computeStringSize(8, getVersion());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt64Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public long getSize() {
            return this.size_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
        public boolean hasAssetMetadata() {
            return this.assetMetadata_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.size_;
            if (j != 0) {
                codedOutputStream.writeUInt64(1, j);
            }
            if (!this.assetId_.isEmpty()) {
                codedOutputStream.writeString(2, getAssetId());
            }
            if (!this.assetLocation_.isEmpty()) {
                codedOutputStream.writeString(3, getAssetLocation());
            }
            for (int i = 0; i < this.assetRelationships_.size(); i++) {
                codedOutputStream.writeMessage(4, this.assetRelationships_.get(i));
            }
            if (!this.creationUnixTimestamp_.isEmpty()) {
                codedOutputStream.writeString(5, getCreationUnixTimestamp());
            }
            if (!this.assetHash_.isEmpty()) {
                codedOutputStream.writeString(6, getAssetHash());
            }
            if (this.assetMetadata_ != null) {
                codedOutputStream.writeMessage(7, getAssetMetadata());
            }
            if (!this.version_.isEmpty()) {
                codedOutputStream.writeString(8, getVersion());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Asset, Builder> implements AssetOrBuilder {
            private Builder() {
                super(Asset.DEFAULT_INSTANCE);
            }

            public Builder addAllAssetRelationships(Iterable<? extends AssetRelationship> iterable) {
                copyOnWrite();
                ((Asset) this.instance).addAllAssetRelationships(iterable);
                return this;
            }

            public Builder addAssetRelationships(AssetRelationship assetRelationship) {
                copyOnWrite();
                ((Asset) this.instance).addAssetRelationships(assetRelationship);
                return this;
            }

            public Builder clearAssetHash() {
                copyOnWrite();
                ((Asset) this.instance).clearAssetHash();
                return this;
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((Asset) this.instance).clearAssetId();
                return this;
            }

            public Builder clearAssetLocation() {
                copyOnWrite();
                ((Asset) this.instance).clearAssetLocation();
                return this;
            }

            public Builder clearAssetMetadata() {
                copyOnWrite();
                ((Asset) this.instance).clearAssetMetadata();
                return this;
            }

            public Builder clearAssetRelationships() {
                copyOnWrite();
                ((Asset) this.instance).clearAssetRelationships();
                return this;
            }

            public Builder clearCreationUnixTimestamp() {
                copyOnWrite();
                ((Asset) this.instance).clearCreationUnixTimestamp();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((Asset) this.instance).clearSize();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Asset) this.instance).clearVersion();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public String getAssetHash() {
                return ((Asset) this.instance).getAssetHash();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public ByteString getAssetHashBytes() {
                return ((Asset) this.instance).getAssetHashBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public String getAssetId() {
                return ((Asset) this.instance).getAssetId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public ByteString getAssetIdBytes() {
                return ((Asset) this.instance).getAssetIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public String getAssetLocation() {
                return ((Asset) this.instance).getAssetLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public ByteString getAssetLocationBytes() {
                return ((Asset) this.instance).getAssetLocationBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public AssetMetadata getAssetMetadata() {
                return ((Asset) this.instance).getAssetMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public AssetRelationship getAssetRelationships(int i) {
                return ((Asset) this.instance).getAssetRelationships(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public int getAssetRelationshipsCount() {
                return ((Asset) this.instance).getAssetRelationshipsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public List<AssetRelationship> getAssetRelationshipsList() {
                return Collections.unmodifiableList(((Asset) this.instance).getAssetRelationshipsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public String getCreationUnixTimestamp() {
                return ((Asset) this.instance).getCreationUnixTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public ByteString getCreationUnixTimestampBytes() {
                return ((Asset) this.instance).getCreationUnixTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public long getSize() {
                return ((Asset) this.instance).getSize();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public String getVersion() {
                return ((Asset) this.instance).getVersion();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public ByteString getVersionBytes() {
                return ((Asset) this.instance).getVersionBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetOrBuilder
            public boolean hasAssetMetadata() {
                return ((Asset) this.instance).hasAssetMetadata();
            }

            public Builder mergeAssetMetadata(AssetMetadata assetMetadata) {
                copyOnWrite();
                ((Asset) this.instance).mergeAssetMetadata(assetMetadata);
                return this;
            }

            public Builder removeAssetRelationships(int i) {
                copyOnWrite();
                ((Asset) this.instance).removeAssetRelationships(i);
                return this;
            }

            public Builder setAssetHash(String str) {
                copyOnWrite();
                ((Asset) this.instance).setAssetHash(str);
                return this;
            }

            public Builder setAssetHashBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setAssetHashBytes(byteString);
                return this;
            }

            public Builder setAssetId(String str) {
                copyOnWrite();
                ((Asset) this.instance).setAssetId(str);
                return this;
            }

            public Builder setAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setAssetIdBytes(byteString);
                return this;
            }

            public Builder setAssetLocation(String str) {
                copyOnWrite();
                ((Asset) this.instance).setAssetLocation(str);
                return this;
            }

            public Builder setAssetLocationBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setAssetLocationBytes(byteString);
                return this;
            }

            public Builder setAssetMetadata(AssetMetadata assetMetadata) {
                copyOnWrite();
                ((Asset) this.instance).setAssetMetadata(assetMetadata);
                return this;
            }

            public Builder setAssetRelationships(int i, AssetRelationship assetRelationship) {
                copyOnWrite();
                ((Asset) this.instance).setAssetRelationships(i, assetRelationship);
                return this;
            }

            public Builder setCreationUnixTimestamp(String str) {
                copyOnWrite();
                ((Asset) this.instance).setCreationUnixTimestamp(str);
                return this;
            }

            public Builder setCreationUnixTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setCreationUnixTimestampBytes(byteString);
                return this;
            }

            public Builder setSize(long j) {
                copyOnWrite();
                ((Asset) this.instance).setSize(j);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((Asset) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setVersionBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAssetRelationships(int i, AssetRelationship assetRelationship) {
                copyOnWrite();
                ((Asset) this.instance).addAssetRelationships(i, assetRelationship);
                return this;
            }

            public Builder setAssetMetadata(AssetMetadata.Builder builder) {
                copyOnWrite();
                ((Asset) this.instance).setAssetMetadata(builder);
                return this;
            }

            public Builder setAssetRelationships(int i, AssetRelationship.Builder builder) {
                copyOnWrite();
                ((Asset) this.instance).setAssetRelationships(i, builder);
                return this;
            }

            public Builder addAssetRelationships(AssetRelationship.Builder builder) {
                copyOnWrite();
                ((Asset) this.instance).addAssetRelationships(builder);
                return this;
            }

            public Builder addAssetRelationships(int i, AssetRelationship.Builder builder) {
                copyOnWrite();
                ((Asset) this.instance).addAssetRelationships(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(Asset asset) {
            return DEFAULT_INSTANCE.createBuilder(asset);
        }

        public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetMetadata(AssetMetadata assetMetadata) {
            assetMetadata.getClass();
            this.assetMetadata_ = assetMetadata;
        }

        public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Asset parseFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetRelationships(int i, AssetRelationship assetRelationship) {
            assetRelationship.getClass();
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.add(i, assetRelationship);
        }

        public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetRelationships(int i, AssetRelationship assetRelationship) {
            assetRelationship.getClass();
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.set(i, assetRelationship);
        }

        public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetRelationships(AssetRelationship assetRelationship) {
            assetRelationship.getClass();
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.add(assetRelationship);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetRelationships(int i, AssetRelationship.Builder builder) {
            ensureAssetRelationshipsIsMutable();
            this.assetRelationships_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetAvailableInfo extends GeneratedMessageLite<AssetAvailableInfo, Builder> implements AssetAvailableInfoOrBuilder {
        public static final int ASSET_COUNT_FIELD_NUMBER = 1;
        public static final int ASSET_MANIFEST_FIELD_NUMBER = 4;
        public static final int ASSET_SIZE_FIELD_NUMBER = 2;
        private static final AssetAvailableInfo DEFAULT_INSTANCE;
        public static final int IS_HIGH_PRIORITY_FIELD_NUMBER = 3;
        private static volatile Parser<AssetAvailableInfo> PARSER;
        private int assetCount_;
        private AssetManifest assetManifest_;
        private long assetSize_;
        private boolean isHighPriority_;

        static {
            AssetAvailableInfo assetAvailableInfo = new AssetAvailableInfo();
            DEFAULT_INSTANCE = assetAvailableInfo;
            assetAvailableInfo.makeImmutable();
        }

        private AssetAvailableInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetCount() {
            this.assetCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetManifest() {
            this.assetManifest_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetSize() {
            this.assetSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHighPriority() {
            this.isHighPriority_ = false;
        }

        public static AssetAvailableInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetManifest(AssetManifest assetManifest) {
            AssetManifest assetManifest2 = this.assetManifest_;
            if (assetManifest2 == null || assetManifest2 == AssetManifest.getDefaultInstance()) {
                this.assetManifest_ = assetManifest;
            } else {
                this.assetManifest_ = AssetManifest.newBuilder(this.assetManifest_).mergeFrom((AssetManifest.Builder) assetManifest).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetAvailableInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetAvailableInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetAvailableInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetCount(int i) {
            this.assetCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetManifest(AssetManifest.Builder builder) {
            this.assetManifest_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetSize(long j) {
            this.assetSize_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHighPriority(boolean z) {
            this.isHighPriority_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetAvailableInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetAvailableInfo assetAvailableInfo = (AssetAvailableInfo) obj2;
                    int i2 = this.assetCount_;
                    boolean z = i2 != 0;
                    int i3 = assetAvailableInfo.assetCount_;
                    this.assetCount_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    long j = this.assetSize_;
                    boolean z2 = j != 0;
                    long j2 = assetAvailableInfo.assetSize_;
                    this.assetSize_ = visitor.visitLong(z2, j, j2 != 0, j2);
                    boolean z3 = this.isHighPriority_;
                    boolean z4 = assetAvailableInfo.isHighPriority_;
                    this.isHighPriority_ = visitor.visitBoolean(z3, z3, z4, z4);
                    this.assetManifest_ = (AssetManifest) visitor.visitMessage(this.assetManifest_, assetAvailableInfo.assetManifest_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.assetCount_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.assetSize_ = codedInputStream.readUInt64();
                                } else if (readTag == 24) {
                                    this.isHighPriority_ = codedInputStream.readBool();
                                } else if (readTag == 34) {
                                    AssetManifest assetManifest = this.assetManifest_;
                                    AssetManifest.Builder builder = assetManifest != null ? assetManifest.toBuilder() : null;
                                    AssetManifest assetManifest2 = (AssetManifest) codedInputStream.readMessage(AssetManifest.parser(), extensionRegistryLite);
                                    this.assetManifest_ = assetManifest2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetManifest.Builder) assetManifest2);
                                        this.assetManifest_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetAvailableInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
        public int getAssetCount() {
            return this.assetCount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
        public AssetManifest getAssetManifest() {
            AssetManifest assetManifest = this.assetManifest_;
            return assetManifest == null ? AssetManifest.getDefaultInstance() : assetManifest;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
        public long getAssetSize() {
            return this.assetSize_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
        public boolean getIsHighPriority() {
            return this.isHighPriority_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.assetCount_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            long j = this.assetSize_;
            if (j != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt64Size(2, j);
            }
            boolean z = this.isHighPriority_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(3, z);
            }
            if (this.assetManifest_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(4, getAssetManifest());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
        public boolean hasAssetManifest() {
            return this.assetManifest_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.assetCount_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            long j = this.assetSize_;
            if (j != 0) {
                codedOutputStream.writeUInt64(2, j);
            }
            boolean z = this.isHighPriority_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            if (this.assetManifest_ != null) {
                codedOutputStream.writeMessage(4, getAssetManifest());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetAvailableInfo, Builder> implements AssetAvailableInfoOrBuilder {
            private Builder() {
                super(AssetAvailableInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAssetCount() {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).clearAssetCount();
                return this;
            }

            public Builder clearAssetManifest() {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).clearAssetManifest();
                return this;
            }

            public Builder clearAssetSize() {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).clearAssetSize();
                return this;
            }

            public Builder clearIsHighPriority() {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).clearIsHighPriority();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
            public int getAssetCount() {
                return ((AssetAvailableInfo) this.instance).getAssetCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
            public AssetManifest getAssetManifest() {
                return ((AssetAvailableInfo) this.instance).getAssetManifest();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
            public long getAssetSize() {
                return ((AssetAvailableInfo) this.instance).getAssetSize();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
            public boolean getIsHighPriority() {
                return ((AssetAvailableInfo) this.instance).getIsHighPriority();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetAvailableInfoOrBuilder
            public boolean hasAssetManifest() {
                return ((AssetAvailableInfo) this.instance).hasAssetManifest();
            }

            public Builder mergeAssetManifest(AssetManifest assetManifest) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).mergeAssetManifest(assetManifest);
                return this;
            }

            public Builder setAssetCount(int i) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).setAssetCount(i);
                return this;
            }

            public Builder setAssetManifest(AssetManifest assetManifest) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).setAssetManifest(assetManifest);
                return this;
            }

            public Builder setAssetSize(long j) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).setAssetSize(j);
                return this;
            }

            public Builder setIsHighPriority(boolean z) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).setIsHighPriority(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAssetManifest(AssetManifest.Builder builder) {
                copyOnWrite();
                ((AssetAvailableInfo) this.instance).setAssetManifest(builder);
                return this;
            }
        }

        public static Builder newBuilder(AssetAvailableInfo assetAvailableInfo) {
            return DEFAULT_INSTANCE.createBuilder(assetAvailableInfo);
        }

        public static AssetAvailableInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetAvailableInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetManifest(AssetManifest assetManifest) {
            assetManifest.getClass();
            this.assetManifest_ = assetManifest;
        }

        public static AssetAvailableInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetAvailableInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetAvailableInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetAvailableInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetAvailableInfo parseFrom(InputStream inputStream) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetAvailableInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetAvailableInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetAvailableInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAvailableInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetGroupMetadata extends GeneratedMessageLite<AssetGroupMetadata, Builder> implements AssetGroupMetadataOrBuilder {
        private static final AssetGroupMetadata DEFAULT_INSTANCE;
        public static final int DIAGNOSTICS_UPLOAD_GROUP_METADATA_FIELD_NUMBER = 3;
        public static final int FIRMWARE_UPDATE_GROUP_METADATA_FIELD_NUMBER = 1;
        private static volatile Parser<AssetGroupMetadata> PARSER = null;
        public static final int VISUAL_ID_ENROLLMENT_GROUP_METADATA_FIELD_NUMBER = 2;
        private int metadataCase_ = 0;
        private Object metadata_;

        static {
            AssetGroupMetadata assetGroupMetadata = new AssetGroupMetadata();
            DEFAULT_INSTANCE = assetGroupMetadata;
            assetGroupMetadata.makeImmutable();
        }

        private AssetGroupMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticsUploadGroupMetadata() {
            if (this.metadataCase_ == 3) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirmwareUpdateGroupMetadata() {
            if (this.metadataCase_ == 1) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVisualIdEnrollmentGroupMetadata() {
            if (this.metadataCase_ == 2) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        public static AssetGroupMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata) {
            if (this.metadataCase_ != 3 || this.metadata_ == DiagnosticsUploadGroupMetadata.getDefaultInstance()) {
                this.metadata_ = diagnosticsUploadGroupMetadata;
            } else {
                this.metadata_ = DiagnosticsUploadGroupMetadata.newBuilder((DiagnosticsUploadGroupMetadata) this.metadata_).mergeFrom((DiagnosticsUploadGroupMetadata.Builder) diagnosticsUploadGroupMetadata).buildPartial();
            }
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata) {
            if (this.metadataCase_ != 1 || this.metadata_ == FirmwareUpdateGroupMetadata.getDefaultInstance()) {
                this.metadata_ = firmwareUpdateGroupMetadata;
            } else {
                this.metadata_ = FirmwareUpdateGroupMetadata.newBuilder((FirmwareUpdateGroupMetadata) this.metadata_).mergeFrom((FirmwareUpdateGroupMetadata.Builder) firmwareUpdateGroupMetadata).buildPartial();
            }
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata) {
            if (this.metadataCase_ != 2 || this.metadata_ == VisualIdEnrollmentGroupMetadata.getDefaultInstance()) {
                this.metadata_ = visualIdEnrollmentGroupMetadata;
            } else {
                this.metadata_ = VisualIdEnrollmentGroupMetadata.newBuilder((VisualIdEnrollmentGroupMetadata) this.metadata_).mergeFrom((VisualIdEnrollmentGroupMetadata.Builder) visualIdEnrollmentGroupMetadata).buildPartial();
            }
            this.metadataCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetGroupMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetGroupMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetGroupMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetGroupMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetGroupMetadata assetGroupMetadata = (AssetGroupMetadata) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetGroupMetadata$MetadataCase[assetGroupMetadata.getMetadataCase().ordinal()];
                    if (i2 == 1) {
                        this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 1, this.metadata_, assetGroupMetadata.metadata_);
                    } else if (i2 == 2) {
                        this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 2, this.metadata_, assetGroupMetadata.metadata_);
                    } else if (i2 == 3) {
                        this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 3, this.metadata_, assetGroupMetadata.metadata_);
                    } else if (i2 == 4) {
                        visitor.visitOneofNotSet(this.metadataCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = assetGroupMetadata.metadataCase_) != 0) {
                        this.metadataCase_ = i;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    FirmwareUpdateGroupMetadata.Builder builder = this.metadataCase_ == 1 ? ((FirmwareUpdateGroupMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(FirmwareUpdateGroupMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((FirmwareUpdateGroupMetadata.Builder) readMessage);
                                        this.metadata_ = builder.buildPartial();
                                    }
                                    this.metadataCase_ = 1;
                                } else if (readTag == 18) {
                                    VisualIdEnrollmentGroupMetadata.Builder builder2 = this.metadataCase_ == 2 ? ((VisualIdEnrollmentGroupMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(VisualIdEnrollmentGroupMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VisualIdEnrollmentGroupMetadata.Builder) readMessage2);
                                        this.metadata_ = builder2.buildPartial();
                                    }
                                    this.metadataCase_ = 2;
                                } else if (readTag == 26) {
                                    DiagnosticsUploadGroupMetadata.Builder builder3 = this.metadataCase_ == 3 ? ((DiagnosticsUploadGroupMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage3 = codedInputStream.readMessage(DiagnosticsUploadGroupMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((DiagnosticsUploadGroupMetadata.Builder) readMessage3);
                                        this.metadata_ = builder3.buildPartial();
                                    }
                                    this.metadataCase_ = 3;
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetGroupMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public DiagnosticsUploadGroupMetadata getDiagnosticsUploadGroupMetadata() {
            return this.metadataCase_ == 3 ? (DiagnosticsUploadGroupMetadata) this.metadata_ : DiagnosticsUploadGroupMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public FirmwareUpdateGroupMetadata getFirmwareUpdateGroupMetadata() {
            return this.metadataCase_ == 1 ? (FirmwareUpdateGroupMetadata) this.metadata_ : FirmwareUpdateGroupMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public MetadataCase getMetadataCase() {
            return MetadataCase.forNumber(this.metadataCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.metadataCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (FirmwareUpdateGroupMetadata) this.metadata_) : 0;
            if (this.metadataCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (VisualIdEnrollmentGroupMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 3) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, (DiagnosticsUploadGroupMetadata) this.metadata_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public VisualIdEnrollmentGroupMetadata getVisualIdEnrollmentGroupMetadata() {
            return this.metadataCase_ == 2 ? (VisualIdEnrollmentGroupMetadata) this.metadata_ : VisualIdEnrollmentGroupMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public boolean hasDiagnosticsUploadGroupMetadata() {
            return this.metadataCase_ == 3;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public boolean hasFirmwareUpdateGroupMetadata() {
            return this.metadataCase_ == 1;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
        public boolean hasVisualIdEnrollmentGroupMetadata() {
            return this.metadataCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.metadataCase_ == 1) {
                codedOutputStream.writeMessage(1, (FirmwareUpdateGroupMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 2) {
                codedOutputStream.writeMessage(2, (VisualIdEnrollmentGroupMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 3) {
                codedOutputStream.writeMessage(3, (DiagnosticsUploadGroupMetadata) this.metadata_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetGroupMetadata, Builder> implements AssetGroupMetadataOrBuilder {
            private Builder() {
                super(AssetGroupMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearDiagnosticsUploadGroupMetadata() {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).clearDiagnosticsUploadGroupMetadata();
                return this;
            }

            public Builder clearFirmwareUpdateGroupMetadata() {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).clearFirmwareUpdateGroupMetadata();
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).clearMetadata();
                return this;
            }

            public Builder clearVisualIdEnrollmentGroupMetadata() {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).clearVisualIdEnrollmentGroupMetadata();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public DiagnosticsUploadGroupMetadata getDiagnosticsUploadGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).getDiagnosticsUploadGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public FirmwareUpdateGroupMetadata getFirmwareUpdateGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).getFirmwareUpdateGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public MetadataCase getMetadataCase() {
                return ((AssetGroupMetadata) this.instance).getMetadataCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public VisualIdEnrollmentGroupMetadata getVisualIdEnrollmentGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).getVisualIdEnrollmentGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public boolean hasDiagnosticsUploadGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).hasDiagnosticsUploadGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public boolean hasFirmwareUpdateGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).hasFirmwareUpdateGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetGroupMetadataOrBuilder
            public boolean hasVisualIdEnrollmentGroupMetadata() {
                return ((AssetGroupMetadata) this.instance).hasVisualIdEnrollmentGroupMetadata();
            }

            public Builder mergeDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).mergeDiagnosticsUploadGroupMetadata(diagnosticsUploadGroupMetadata);
                return this;
            }

            public Builder mergeFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).mergeFirmwareUpdateGroupMetadata(firmwareUpdateGroupMetadata);
                return this;
            }

            public Builder mergeVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).mergeVisualIdEnrollmentGroupMetadata(visualIdEnrollmentGroupMetadata);
                return this;
            }

            public Builder setDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setDiagnosticsUploadGroupMetadata(diagnosticsUploadGroupMetadata);
                return this;
            }

            public Builder setFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setFirmwareUpdateGroupMetadata(firmwareUpdateGroupMetadata);
                return this;
            }

            public Builder setVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setVisualIdEnrollmentGroupMetadata(visualIdEnrollmentGroupMetadata);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata.Builder builder) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setDiagnosticsUploadGroupMetadata(builder);
                return this;
            }

            public Builder setFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata.Builder builder) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setFirmwareUpdateGroupMetadata(builder);
                return this;
            }

            public Builder setVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata.Builder builder) {
                copyOnWrite();
                ((AssetGroupMetadata) this.instance).setVisualIdEnrollmentGroupMetadata(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MetadataCase implements Internal.EnumLite {
            FIRMWARE_UPDATE_GROUP_METADATA(1),
            VISUAL_ID_ENROLLMENT_GROUP_METADATA(2),
            DIAGNOSTICS_UPLOAD_GROUP_METADATA(3),
            METADATA_NOT_SET(0);

            private final int value;

            MetadataCase(int i) {
                this.value = i;
            }

            public static MetadataCase forNumber(int i) {
                if (i == 0) {
                    return METADATA_NOT_SET;
                }
                if (i == 1) {
                    return FIRMWARE_UPDATE_GROUP_METADATA;
                }
                if (i == 2) {
                    return VISUAL_ID_ENROLLMENT_GROUP_METADATA;
                }
                if (i != 3) {
                    return null;
                }
                return DIAGNOSTICS_UPLOAD_GROUP_METADATA;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MetadataCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(AssetGroupMetadata assetGroupMetadata) {
            return DEFAULT_INSTANCE.createBuilder(assetGroupMetadata);
        }

        public static AssetGroupMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetGroupMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetGroupMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsUploadGroupMetadata(DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata) {
            diagnosticsUploadGroupMetadata.getClass();
            this.metadata_ = diagnosticsUploadGroupMetadata;
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpdateGroupMetadata(FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata) {
            firmwareUpdateGroupMetadata.getClass();
            this.metadata_ = firmwareUpdateGroupMetadata;
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisualIdEnrollmentGroupMetadata(VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata) {
            visualIdEnrollmentGroupMetadata.getClass();
            this.metadata_ = visualIdEnrollmentGroupMetadata;
            this.metadataCase_ = 2;
        }

        public static AssetGroupMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetGroupMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetGroupMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetGroupMetadata parseFrom(InputStream inputStream) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetGroupMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetGroupMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetGroupMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetInfo extends GeneratedMessageLite<AssetInfo, Builder> implements AssetInfoOrBuilder {
        public static final int ASSET_AVAILABLE_INFO_FIELD_NUMBER = 2;
        public static final int ASSET_TYPE_FIELD_NUMBER = 1;
        private static final AssetInfo DEFAULT_INSTANCE;
        private static volatile Parser<AssetInfo> PARSER;
        private AssetAvailableInfo assetAvailableInfo_;
        private int assetType_;

        static {
            AssetInfo assetInfo = new AssetInfo();
            DEFAULT_INSTANCE = assetInfo;
            assetInfo.makeImmutable();
        }

        private AssetInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetAvailableInfo() {
            this.assetAvailableInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        public static AssetInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetAvailableInfo(AssetAvailableInfo assetAvailableInfo) {
            AssetAvailableInfo assetAvailableInfo2 = this.assetAvailableInfo_;
            if (assetAvailableInfo2 == null || assetAvailableInfo2 == AssetAvailableInfo.getDefaultInstance()) {
                this.assetAvailableInfo_ = assetAvailableInfo;
            } else {
                this.assetAvailableInfo_ = AssetAvailableInfo.newBuilder(this.assetAvailableInfo_).mergeFrom((AssetAvailableInfo.Builder) assetAvailableInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetAvailableInfo(AssetAvailableInfo.Builder builder) {
            this.assetAvailableInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetInfo assetInfo = (AssetInfo) obj2;
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = assetInfo.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.assetAvailableInfo_ = (AssetAvailableInfo) visitor.visitMessage(this.assetAvailableInfo_, assetInfo.assetAvailableInfo_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    AssetAvailableInfo assetAvailableInfo = this.assetAvailableInfo_;
                                    AssetAvailableInfo.Builder builder = assetAvailableInfo != null ? assetAvailableInfo.toBuilder() : null;
                                    AssetAvailableInfo assetAvailableInfo2 = (AssetAvailableInfo) codedInputStream.readMessage(AssetAvailableInfo.parser(), extensionRegistryLite);
                                    this.assetAvailableInfo_ = assetAvailableInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetAvailableInfo.Builder) assetAvailableInfo2);
                                        this.assetAvailableInfo_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
        public AssetAvailableInfo getAssetAvailableInfo() {
            AssetAvailableInfo assetAvailableInfo = this.assetAvailableInfo_;
            return assetAvailableInfo == null ? AssetAvailableInfo.getDefaultInstance() : assetAvailableInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.assetType_) : 0;
            if (this.assetAvailableInfo_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, getAssetAvailableInfo());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
        public boolean hasAssetAvailableInfo() {
            return this.assetAvailableInfo_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.assetType_);
            }
            if (this.assetAvailableInfo_ != null) {
                codedOutputStream.writeMessage(2, getAssetAvailableInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetInfo, Builder> implements AssetInfoOrBuilder {
            private Builder() {
                super(AssetInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAssetAvailableInfo() {
                copyOnWrite();
                ((AssetInfo) this.instance).clearAssetAvailableInfo();
                return this;
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((AssetInfo) this.instance).clearAssetType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
            public AssetAvailableInfo getAssetAvailableInfo() {
                return ((AssetInfo) this.instance).getAssetAvailableInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
            public AssetType getAssetType() {
                return ((AssetInfo) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
            public int getAssetTypeValue() {
                return ((AssetInfo) this.instance).getAssetTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetInfoOrBuilder
            public boolean hasAssetAvailableInfo() {
                return ((AssetInfo) this.instance).hasAssetAvailableInfo();
            }

            public Builder mergeAssetAvailableInfo(AssetAvailableInfo assetAvailableInfo) {
                copyOnWrite();
                ((AssetInfo) this.instance).mergeAssetAvailableInfo(assetAvailableInfo);
                return this;
            }

            public Builder setAssetAvailableInfo(AssetAvailableInfo assetAvailableInfo) {
                copyOnWrite();
                ((AssetInfo) this.instance).setAssetAvailableInfo(assetAvailableInfo);
                return this;
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((AssetInfo) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((AssetInfo) this.instance).setAssetTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAssetAvailableInfo(AssetAvailableInfo.Builder builder) {
                copyOnWrite();
                ((AssetInfo) this.instance).setAssetAvailableInfo(builder);
                return this;
            }
        }

        public static Builder newBuilder(AssetInfo assetInfo) {
            return DEFAULT_INSTANCE.createBuilder(assetInfo);
        }

        public static AssetInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetAvailableInfo(AssetAvailableInfo assetAvailableInfo) {
            assetAvailableInfo.getClass();
            this.assetAvailableInfo_ = assetAvailableInfo;
        }

        public static AssetInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetInfo parseFrom(InputStream inputStream) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetManifest extends GeneratedMessageLite<AssetManifest, Builder> implements AssetManifestOrBuilder {
        public static final int ASSETS_FIELD_NUMBER = 1;
        public static final int ASSET_GROUP_METADATA_FIELD_NUMBER = 5;
        public static final int BATCH_ID_FIELD_NUMBER = 4;
        private static final AssetManifest DEFAULT_INSTANCE;
        public static final int HAS_NEXT_FIELD_NUMBER = 2;
        private static volatile Parser<AssetManifest> PARSER = null;
        public static final int TOTAL_ASSET_COUNT_FIELD_NUMBER = 3;
        private AssetGroupMetadata assetGroupMetadata_;
        private Internal.ProtobufList<Asset> assets_ = GeneratedMessageLite.emptyProtobufList();
        private int batchId_;
        private int bitField0_;
        private boolean hasNext_;
        private int totalAssetCount_;

        static {
            AssetManifest assetManifest = new AssetManifest();
            DEFAULT_INSTANCE = assetManifest;
            assetManifest.makeImmutable();
        }

        private AssetManifest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAssets(Iterable<? extends Asset> iterable) {
            ensureAssetsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assets_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssets(Asset.Builder builder) {
            ensureAssetsIsMutable();
            this.assets_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetGroupMetadata() {
            this.assetGroupMetadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssets() {
            this.assets_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatchId() {
            this.batchId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasNext() {
            this.hasNext_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalAssetCount() {
            this.totalAssetCount_ = 0;
        }

        private void ensureAssetsIsMutable() {
            if (this.assets_.isModifiable()) {
                return;
            }
            this.assets_ = GeneratedMessageLite.mutableCopy(this.assets_);
        }

        public static AssetManifest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetGroupMetadata(AssetGroupMetadata assetGroupMetadata) {
            AssetGroupMetadata assetGroupMetadata2 = this.assetGroupMetadata_;
            if (assetGroupMetadata2 == null || assetGroupMetadata2 == AssetGroupMetadata.getDefaultInstance()) {
                this.assetGroupMetadata_ = assetGroupMetadata;
            } else {
                this.assetGroupMetadata_ = AssetGroupMetadata.newBuilder(this.assetGroupMetadata_).mergeFrom((AssetGroupMetadata.Builder) assetGroupMetadata).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetManifest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetManifest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetManifest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAssets(int i) {
            ensureAssetsIsMutable();
            this.assets_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetGroupMetadata(AssetGroupMetadata.Builder builder) {
            this.assetGroupMetadata_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssets(int i, Asset.Builder builder) {
            ensureAssetsIsMutable();
            this.assets_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchId(int i) {
            this.batchId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasNext(boolean z) {
            this.hasNext_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalAssetCount(int i) {
            this.totalAssetCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetManifest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.assets_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetManifest assetManifest = (AssetManifest) obj2;
                    this.assets_ = visitor.visitList(this.assets_, assetManifest.assets_);
                    boolean z = this.hasNext_;
                    boolean z2 = assetManifest.hasNext_;
                    this.hasNext_ = visitor.visitBoolean(z, z, z2, z2);
                    int i = this.totalAssetCount_;
                    boolean z3 = i != 0;
                    int i2 = assetManifest.totalAssetCount_;
                    this.totalAssetCount_ = visitor.visitInt(z3, i, i2 != 0, i2);
                    int i3 = this.batchId_;
                    boolean z4 = i3 != 0;
                    int i4 = assetManifest.batchId_;
                    this.batchId_ = visitor.visitInt(z4, i3, i4 != 0, i4);
                    this.assetGroupMetadata_ = (AssetGroupMetadata) visitor.visitMessage(this.assetGroupMetadata_, assetManifest.assetGroupMetadata_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= assetManifest.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.assets_.isModifiable()) {
                                        this.assets_ = GeneratedMessageLite.mutableCopy(this.assets_);
                                    }
                                    this.assets_.add((Asset) codedInputStream.readMessage(Asset.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.hasNext_ = codedInputStream.readBool();
                                } else if (readTag == 24) {
                                    this.totalAssetCount_ = codedInputStream.readUInt32();
                                } else if (readTag == 32) {
                                    this.batchId_ = codedInputStream.readUInt32();
                                } else if (readTag == 42) {
                                    AssetGroupMetadata assetGroupMetadata = this.assetGroupMetadata_;
                                    AssetGroupMetadata.Builder builder = assetGroupMetadata != null ? assetGroupMetadata.toBuilder() : null;
                                    AssetGroupMetadata assetGroupMetadata2 = (AssetGroupMetadata) codedInputStream.readMessage(AssetGroupMetadata.parser(), extensionRegistryLite);
                                    this.assetGroupMetadata_ = assetGroupMetadata2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetGroupMetadata.Builder) assetGroupMetadata2);
                                        this.assetGroupMetadata_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetManifest.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public AssetGroupMetadata getAssetGroupMetadata() {
            AssetGroupMetadata assetGroupMetadata = this.assetGroupMetadata_;
            return assetGroupMetadata == null ? AssetGroupMetadata.getDefaultInstance() : assetGroupMetadata;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public Asset getAssets(int i) {
            return this.assets_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public int getAssetsCount() {
            return this.assets_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public List<Asset> getAssetsList() {
            return this.assets_;
        }

        public AssetOrBuilder getAssetsOrBuilder(int i) {
            return this.assets_.get(i);
        }

        public List<? extends AssetOrBuilder> getAssetsOrBuilderList() {
            return this.assets_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public int getBatchId() {
            return this.batchId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public boolean getHasNext() {
            return this.hasNext_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.assets_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.assets_.get(i3));
            }
            boolean z = this.hasNext_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(2, z);
            }
            int i4 = this.totalAssetCount_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(3, i4);
            }
            int i5 = this.batchId_;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(4, i5);
            }
            if (this.assetGroupMetadata_ != null) {
                i2 += CodedOutputStream.computeMessageSize(5, getAssetGroupMetadata());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public int getTotalAssetCount() {
            return this.totalAssetCount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
        public boolean hasAssetGroupMetadata() {
            return this.assetGroupMetadata_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.assets_.size(); i++) {
                codedOutputStream.writeMessage(1, this.assets_.get(i));
            }
            boolean z = this.hasNext_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            int i2 = this.totalAssetCount_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(3, i2);
            }
            int i3 = this.batchId_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(4, i3);
            }
            if (this.assetGroupMetadata_ != null) {
                codedOutputStream.writeMessage(5, getAssetGroupMetadata());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetManifest, Builder> implements AssetManifestOrBuilder {
            private Builder() {
                super(AssetManifest.DEFAULT_INSTANCE);
            }

            public Builder addAllAssets(Iterable<? extends Asset> iterable) {
                copyOnWrite();
                ((AssetManifest) this.instance).addAllAssets(iterable);
                return this;
            }

            public Builder addAssets(Asset asset) {
                copyOnWrite();
                ((AssetManifest) this.instance).addAssets(asset);
                return this;
            }

            public Builder clearAssetGroupMetadata() {
                copyOnWrite();
                ((AssetManifest) this.instance).clearAssetGroupMetadata();
                return this;
            }

            public Builder clearAssets() {
                copyOnWrite();
                ((AssetManifest) this.instance).clearAssets();
                return this;
            }

            public Builder clearBatchId() {
                copyOnWrite();
                ((AssetManifest) this.instance).clearBatchId();
                return this;
            }

            public Builder clearHasNext() {
                copyOnWrite();
                ((AssetManifest) this.instance).clearHasNext();
                return this;
            }

            public Builder clearTotalAssetCount() {
                copyOnWrite();
                ((AssetManifest) this.instance).clearTotalAssetCount();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public AssetGroupMetadata getAssetGroupMetadata() {
                return ((AssetManifest) this.instance).getAssetGroupMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public Asset getAssets(int i) {
                return ((AssetManifest) this.instance).getAssets(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public int getAssetsCount() {
                return ((AssetManifest) this.instance).getAssetsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public List<Asset> getAssetsList() {
                return Collections.unmodifiableList(((AssetManifest) this.instance).getAssetsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public int getBatchId() {
                return ((AssetManifest) this.instance).getBatchId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public boolean getHasNext() {
                return ((AssetManifest) this.instance).getHasNext();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public int getTotalAssetCount() {
                return ((AssetManifest) this.instance).getTotalAssetCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetManifestOrBuilder
            public boolean hasAssetGroupMetadata() {
                return ((AssetManifest) this.instance).hasAssetGroupMetadata();
            }

            public Builder mergeAssetGroupMetadata(AssetGroupMetadata assetGroupMetadata) {
                copyOnWrite();
                ((AssetManifest) this.instance).mergeAssetGroupMetadata(assetGroupMetadata);
                return this;
            }

            public Builder removeAssets(int i) {
                copyOnWrite();
                ((AssetManifest) this.instance).removeAssets(i);
                return this;
            }

            public Builder setAssetGroupMetadata(AssetGroupMetadata assetGroupMetadata) {
                copyOnWrite();
                ((AssetManifest) this.instance).setAssetGroupMetadata(assetGroupMetadata);
                return this;
            }

            public Builder setAssets(int i, Asset asset) {
                copyOnWrite();
                ((AssetManifest) this.instance).setAssets(i, asset);
                return this;
            }

            public Builder setBatchId(int i) {
                copyOnWrite();
                ((AssetManifest) this.instance).setBatchId(i);
                return this;
            }

            public Builder setHasNext(boolean z) {
                copyOnWrite();
                ((AssetManifest) this.instance).setHasNext(z);
                return this;
            }

            public Builder setTotalAssetCount(int i) {
                copyOnWrite();
                ((AssetManifest) this.instance).setTotalAssetCount(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAssets(int i, Asset asset) {
                copyOnWrite();
                ((AssetManifest) this.instance).addAssets(i, asset);
                return this;
            }

            public Builder setAssetGroupMetadata(AssetGroupMetadata.Builder builder) {
                copyOnWrite();
                ((AssetManifest) this.instance).setAssetGroupMetadata(builder);
                return this;
            }

            public Builder setAssets(int i, Asset.Builder builder) {
                copyOnWrite();
                ((AssetManifest) this.instance).setAssets(i, builder);
                return this;
            }

            public Builder addAssets(Asset.Builder builder) {
                copyOnWrite();
                ((AssetManifest) this.instance).addAssets(builder);
                return this;
            }

            public Builder addAssets(int i, Asset.Builder builder) {
                copyOnWrite();
                ((AssetManifest) this.instance).addAssets(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(AssetManifest assetManifest) {
            return DEFAULT_INSTANCE.createBuilder(assetManifest);
        }

        public static AssetManifest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetManifest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetGroupMetadata(AssetGroupMetadata assetGroupMetadata) {
            assetGroupMetadata.getClass();
            this.assetGroupMetadata_ = assetGroupMetadata;
        }

        public static AssetManifest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetManifest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetManifest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetManifest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetManifest parseFrom(InputStream inputStream) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssets(int i, Asset asset) {
            asset.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(i, asset);
        }

        public static AssetManifest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssets(int i, Asset asset) {
            asset.getClass();
            ensureAssetsIsMutable();
            this.assets_.set(i, asset);
        }

        public static AssetManifest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetManifest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetManifest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssets(Asset asset) {
            asset.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(asset);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssets(int i, Asset.Builder builder) {
            ensureAssetsIsMutable();
            this.assets_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetMetadata extends GeneratedMessageLite<AssetMetadata, Builder> implements AssetMetadataOrBuilder {
        public static final int CUSTOMER_INFO_METADATA_FIELD_NUMBER = 6;
        private static final AssetMetadata DEFAULT_INSTANCE;
        public static final int DIAGNOSTICS_UPLOAD_METADATA_FIELD_NUMBER = 5;
        public static final int FIRMWARE_UPDATE_METADATA_FIELD_NUMBER = 3;
        public static final int IMAGE_METADATA_FIELD_NUMBER = 1;
        private static volatile Parser<AssetMetadata> PARSER = null;
        public static final int VIDEO_METADATA_FIELD_NUMBER = 2;
        public static final int VISUAL_ID_ENROLLMENT_METADATA_FIELD_NUMBER = 4;
        private int metadataCase_ = 0;
        private Object metadata_;

        static {
            AssetMetadata assetMetadata = new AssetMetadata();
            DEFAULT_INSTANCE = assetMetadata;
            assetMetadata.makeImmutable();
        }

        private AssetMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomerInfoMetadata() {
            if (this.metadataCase_ == 6) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticsUploadMetadata() {
            if (this.metadataCase_ == 5) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirmwareUpdateMetadata() {
            if (this.metadataCase_ == 3) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageMetadata() {
            if (this.metadataCase_ == 1) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoMetadata() {
            if (this.metadataCase_ == 2) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVisualIdEnrollmentMetadata() {
            if (this.metadataCase_ == 4) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        public static AssetMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCustomerInfoMetadata(CustomerInfoMetadata customerInfoMetadata) {
            if (this.metadataCase_ != 6 || this.metadata_ == CustomerInfoMetadata.getDefaultInstance()) {
                this.metadata_ = customerInfoMetadata;
            } else {
                this.metadata_ = CustomerInfoMetadata.newBuilder((CustomerInfoMetadata) this.metadata_).mergeFrom((CustomerInfoMetadata.Builder) customerInfoMetadata).buildPartial();
            }
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticsUploadMetadata(DiagnosticsUploadMetadata diagnosticsUploadMetadata) {
            if (this.metadataCase_ != 5 || this.metadata_ == DiagnosticsUploadMetadata.getDefaultInstance()) {
                this.metadata_ = diagnosticsUploadMetadata;
            } else {
                this.metadata_ = DiagnosticsUploadMetadata.newBuilder((DiagnosticsUploadMetadata) this.metadata_).mergeFrom((DiagnosticsUploadMetadata.Builder) diagnosticsUploadMetadata).buildPartial();
            }
            this.metadataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFirmwareUpdateMetadata(FirmwareUpdateMetadata firmwareUpdateMetadata) {
            if (this.metadataCase_ != 3 || this.metadata_ == FirmwareUpdateMetadata.getDefaultInstance()) {
                this.metadata_ = firmwareUpdateMetadata;
            } else {
                this.metadata_ = FirmwareUpdateMetadata.newBuilder((FirmwareUpdateMetadata) this.metadata_).mergeFrom((FirmwareUpdateMetadata.Builder) firmwareUpdateMetadata).buildPartial();
            }
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageMetadata(ImageMetadata imageMetadata) {
            if (this.metadataCase_ != 1 || this.metadata_ == ImageMetadata.getDefaultInstance()) {
                this.metadata_ = imageMetadata;
            } else {
                this.metadata_ = ImageMetadata.newBuilder((ImageMetadata) this.metadata_).mergeFrom((ImageMetadata.Builder) imageMetadata).buildPartial();
            }
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoMetadata(VideoMetadata videoMetadata) {
            if (this.metadataCase_ != 2 || this.metadata_ == VideoMetadata.getDefaultInstance()) {
                this.metadata_ = videoMetadata;
            } else {
                this.metadata_ = VideoMetadata.newBuilder((VideoMetadata) this.metadata_).mergeFrom((VideoMetadata.Builder) videoMetadata).buildPartial();
            }
            this.metadataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata visualIdEnrollmentMetadata) {
            if (this.metadataCase_ != 4 || this.metadata_ == VisualIdEnrollmentMetadata.getDefaultInstance()) {
                this.metadata_ = visualIdEnrollmentMetadata;
            } else {
                this.metadata_ = VisualIdEnrollmentMetadata.newBuilder((VisualIdEnrollmentMetadata) this.metadata_).mergeFrom((VisualIdEnrollmentMetadata.Builder) visualIdEnrollmentMetadata).buildPartial();
            }
            this.metadataCase_ = 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomerInfoMetadata(CustomerInfoMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsUploadMetadata(DiagnosticsUploadMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpdateMetadata(FirmwareUpdateMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageMetadata(ImageMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoMetadata(VideoMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata.Builder builder) {
            this.metadata_ = builder.build();
            this.metadataCase_ = 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetMetadata assetMetadata = (AssetMetadata) obj2;
                    switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$AssetMetadata$MetadataCase[assetMetadata.getMetadataCase().ordinal()]) {
                        case 1:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 1, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 2:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 2, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 3:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 3, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 4:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 4, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 5:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 5, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 6:
                            this.metadata_ = visitor.visitOneofMessage(this.metadataCase_ == 6, this.metadata_, assetMetadata.metadata_);
                            break;
                        case 7:
                            visitor.visitOneofNotSet(this.metadataCase_ != 0);
                            break;
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = assetMetadata.metadataCase_) != 0) {
                        this.metadataCase_ = i;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    ImageMetadata.Builder builder = this.metadataCase_ == 1 ? ((ImageMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(ImageMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((ImageMetadata.Builder) readMessage);
                                        this.metadata_ = builder.buildPartial();
                                    }
                                    this.metadataCase_ = 1;
                                } else if (readTag == 18) {
                                    VideoMetadata.Builder builder2 = this.metadataCase_ == 2 ? ((VideoMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(VideoMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VideoMetadata.Builder) readMessage2);
                                        this.metadata_ = builder2.buildPartial();
                                    }
                                    this.metadataCase_ = 2;
                                } else if (readTag == 26) {
                                    FirmwareUpdateMetadata.Builder builder3 = this.metadataCase_ == 3 ? ((FirmwareUpdateMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage3 = codedInputStream.readMessage(FirmwareUpdateMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((FirmwareUpdateMetadata.Builder) readMessage3);
                                        this.metadata_ = builder3.buildPartial();
                                    }
                                    this.metadataCase_ = 3;
                                } else if (readTag == 34) {
                                    VisualIdEnrollmentMetadata.Builder builder4 = this.metadataCase_ == 4 ? ((VisualIdEnrollmentMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage4 = codedInputStream.readMessage(VisualIdEnrollmentMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage4;
                                    if (builder4 != null) {
                                        builder4.mergeFrom((VisualIdEnrollmentMetadata.Builder) readMessage4);
                                        this.metadata_ = builder4.buildPartial();
                                    }
                                    this.metadataCase_ = 4;
                                } else if (readTag == 42) {
                                    DiagnosticsUploadMetadata.Builder builder5 = this.metadataCase_ == 5 ? ((DiagnosticsUploadMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage5 = codedInputStream.readMessage(DiagnosticsUploadMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage5;
                                    if (builder5 != null) {
                                        builder5.mergeFrom((DiagnosticsUploadMetadata.Builder) readMessage5);
                                        this.metadata_ = builder5.buildPartial();
                                    }
                                    this.metadataCase_ = 5;
                                } else if (readTag == 50) {
                                    CustomerInfoMetadata.Builder builder6 = this.metadataCase_ == 6 ? ((CustomerInfoMetadata) this.metadata_).toBuilder() : null;
                                    MessageLite readMessage6 = codedInputStream.readMessage(CustomerInfoMetadata.parser(), extensionRegistryLite);
                                    this.metadata_ = readMessage6;
                                    if (builder6 != null) {
                                        builder6.mergeFrom((CustomerInfoMetadata.Builder) readMessage6);
                                        this.metadata_ = builder6.buildPartial();
                                    }
                                    this.metadataCase_ = 6;
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public CustomerInfoMetadata getCustomerInfoMetadata() {
            return this.metadataCase_ == 6 ? (CustomerInfoMetadata) this.metadata_ : CustomerInfoMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public DiagnosticsUploadMetadata getDiagnosticsUploadMetadata() {
            return this.metadataCase_ == 5 ? (DiagnosticsUploadMetadata) this.metadata_ : DiagnosticsUploadMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public FirmwareUpdateMetadata getFirmwareUpdateMetadata() {
            return this.metadataCase_ == 3 ? (FirmwareUpdateMetadata) this.metadata_ : FirmwareUpdateMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public ImageMetadata getImageMetadata() {
            return this.metadataCase_ == 1 ? (ImageMetadata) this.metadata_ : ImageMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public MetadataCase getMetadataCase() {
            return MetadataCase.forNumber(this.metadataCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.metadataCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (ImageMetadata) this.metadata_) : 0;
            if (this.metadataCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (VideoMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 3) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, (FirmwareUpdateMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 4) {
                computeMessageSize += CodedOutputStream.computeMessageSize(4, (VisualIdEnrollmentMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 5) {
                computeMessageSize += CodedOutputStream.computeMessageSize(5, (DiagnosticsUploadMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 6) {
                computeMessageSize += CodedOutputStream.computeMessageSize(6, (CustomerInfoMetadata) this.metadata_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public VideoMetadata getVideoMetadata() {
            return this.metadataCase_ == 2 ? (VideoMetadata) this.metadata_ : VideoMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public VisualIdEnrollmentMetadata getVisualIdEnrollmentMetadata() {
            return this.metadataCase_ == 4 ? (VisualIdEnrollmentMetadata) this.metadata_ : VisualIdEnrollmentMetadata.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasCustomerInfoMetadata() {
            return this.metadataCase_ == 6;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasDiagnosticsUploadMetadata() {
            return this.metadataCase_ == 5;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasFirmwareUpdateMetadata() {
            return this.metadataCase_ == 3;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasImageMetadata() {
            return this.metadataCase_ == 1;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasVideoMetadata() {
            return this.metadataCase_ == 2;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
        public boolean hasVisualIdEnrollmentMetadata() {
            return this.metadataCase_ == 4;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.metadataCase_ == 1) {
                codedOutputStream.writeMessage(1, (ImageMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 2) {
                codedOutputStream.writeMessage(2, (VideoMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 3) {
                codedOutputStream.writeMessage(3, (FirmwareUpdateMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 4) {
                codedOutputStream.writeMessage(4, (VisualIdEnrollmentMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 5) {
                codedOutputStream.writeMessage(5, (DiagnosticsUploadMetadata) this.metadata_);
            }
            if (this.metadataCase_ == 6) {
                codedOutputStream.writeMessage(6, (CustomerInfoMetadata) this.metadata_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetMetadata, Builder> implements AssetMetadataOrBuilder {
            private Builder() {
                super(AssetMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearCustomerInfoMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearCustomerInfoMetadata();
                return this;
            }

            public Builder clearDiagnosticsUploadMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearDiagnosticsUploadMetadata();
                return this;
            }

            public Builder clearFirmwareUpdateMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearFirmwareUpdateMetadata();
                return this;
            }

            public Builder clearImageMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearImageMetadata();
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearMetadata();
                return this;
            }

            public Builder clearVideoMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearVideoMetadata();
                return this;
            }

            public Builder clearVisualIdEnrollmentMetadata() {
                copyOnWrite();
                ((AssetMetadata) this.instance).clearVisualIdEnrollmentMetadata();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public CustomerInfoMetadata getCustomerInfoMetadata() {
                return ((AssetMetadata) this.instance).getCustomerInfoMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public DiagnosticsUploadMetadata getDiagnosticsUploadMetadata() {
                return ((AssetMetadata) this.instance).getDiagnosticsUploadMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public FirmwareUpdateMetadata getFirmwareUpdateMetadata() {
                return ((AssetMetadata) this.instance).getFirmwareUpdateMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public ImageMetadata getImageMetadata() {
                return ((AssetMetadata) this.instance).getImageMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public MetadataCase getMetadataCase() {
                return ((AssetMetadata) this.instance).getMetadataCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public VideoMetadata getVideoMetadata() {
                return ((AssetMetadata) this.instance).getVideoMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public VisualIdEnrollmentMetadata getVisualIdEnrollmentMetadata() {
                return ((AssetMetadata) this.instance).getVisualIdEnrollmentMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasCustomerInfoMetadata() {
                return ((AssetMetadata) this.instance).hasCustomerInfoMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasDiagnosticsUploadMetadata() {
                return ((AssetMetadata) this.instance).hasDiagnosticsUploadMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasFirmwareUpdateMetadata() {
                return ((AssetMetadata) this.instance).hasFirmwareUpdateMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasImageMetadata() {
                return ((AssetMetadata) this.instance).hasImageMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasVideoMetadata() {
                return ((AssetMetadata) this.instance).hasVideoMetadata();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetMetadataOrBuilder
            public boolean hasVisualIdEnrollmentMetadata() {
                return ((AssetMetadata) this.instance).hasVisualIdEnrollmentMetadata();
            }

            public Builder mergeCustomerInfoMetadata(CustomerInfoMetadata customerInfoMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeCustomerInfoMetadata(customerInfoMetadata);
                return this;
            }

            public Builder mergeDiagnosticsUploadMetadata(DiagnosticsUploadMetadata diagnosticsUploadMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeDiagnosticsUploadMetadata(diagnosticsUploadMetadata);
                return this;
            }

            public Builder mergeFirmwareUpdateMetadata(FirmwareUpdateMetadata firmwareUpdateMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeFirmwareUpdateMetadata(firmwareUpdateMetadata);
                return this;
            }

            public Builder mergeImageMetadata(ImageMetadata imageMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeImageMetadata(imageMetadata);
                return this;
            }

            public Builder mergeVideoMetadata(VideoMetadata videoMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeVideoMetadata(videoMetadata);
                return this;
            }

            public Builder mergeVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata visualIdEnrollmentMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).mergeVisualIdEnrollmentMetadata(visualIdEnrollmentMetadata);
                return this;
            }

            public Builder setCustomerInfoMetadata(CustomerInfoMetadata customerInfoMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setCustomerInfoMetadata(customerInfoMetadata);
                return this;
            }

            public Builder setDiagnosticsUploadMetadata(DiagnosticsUploadMetadata diagnosticsUploadMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setDiagnosticsUploadMetadata(diagnosticsUploadMetadata);
                return this;
            }

            public Builder setFirmwareUpdateMetadata(FirmwareUpdateMetadata firmwareUpdateMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setFirmwareUpdateMetadata(firmwareUpdateMetadata);
                return this;
            }

            public Builder setImageMetadata(ImageMetadata imageMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setImageMetadata(imageMetadata);
                return this;
            }

            public Builder setVideoMetadata(VideoMetadata videoMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setVideoMetadata(videoMetadata);
                return this;
            }

            public Builder setVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata visualIdEnrollmentMetadata) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setVisualIdEnrollmentMetadata(visualIdEnrollmentMetadata);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCustomerInfoMetadata(CustomerInfoMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setCustomerInfoMetadata(builder);
                return this;
            }

            public Builder setDiagnosticsUploadMetadata(DiagnosticsUploadMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setDiagnosticsUploadMetadata(builder);
                return this;
            }

            public Builder setFirmwareUpdateMetadata(FirmwareUpdateMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setFirmwareUpdateMetadata(builder);
                return this;
            }

            public Builder setImageMetadata(ImageMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setImageMetadata(builder);
                return this;
            }

            public Builder setVideoMetadata(VideoMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setVideoMetadata(builder);
                return this;
            }

            public Builder setVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata.Builder builder) {
                copyOnWrite();
                ((AssetMetadata) this.instance).setVisualIdEnrollmentMetadata(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MetadataCase implements Internal.EnumLite {
            IMAGE_METADATA(1),
            VIDEO_METADATA(2),
            FIRMWARE_UPDATE_METADATA(3),
            VISUAL_ID_ENROLLMENT_METADATA(4),
            DIAGNOSTICS_UPLOAD_METADATA(5),
            CUSTOMER_INFO_METADATA(6),
            METADATA_NOT_SET(0);

            private final int value;

            MetadataCase(int i) {
                this.value = i;
            }

            public static MetadataCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return METADATA_NOT_SET;
                    case 1:
                        return IMAGE_METADATA;
                    case 2:
                        return VIDEO_METADATA;
                    case 3:
                        return FIRMWARE_UPDATE_METADATA;
                    case 4:
                        return VISUAL_ID_ENROLLMENT_METADATA;
                    case 5:
                        return DIAGNOSTICS_UPLOAD_METADATA;
                    case 6:
                        return CUSTOMER_INFO_METADATA;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MetadataCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(AssetMetadata assetMetadata) {
            return DEFAULT_INSTANCE.createBuilder(assetMetadata);
        }

        public static AssetMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomerInfoMetadata(CustomerInfoMetadata customerInfoMetadata) {
            customerInfoMetadata.getClass();
            this.metadata_ = customerInfoMetadata;
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsUploadMetadata(DiagnosticsUploadMetadata diagnosticsUploadMetadata) {
            diagnosticsUploadMetadata.getClass();
            this.metadata_ = diagnosticsUploadMetadata;
            this.metadataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpdateMetadata(FirmwareUpdateMetadata firmwareUpdateMetadata) {
            firmwareUpdateMetadata.getClass();
            this.metadata_ = firmwareUpdateMetadata;
            this.metadataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageMetadata(ImageMetadata imageMetadata) {
            imageMetadata.getClass();
            this.metadata_ = imageMetadata;
            this.metadataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoMetadata(VideoMetadata videoMetadata) {
            videoMetadata.getClass();
            this.metadata_ = videoMetadata;
            this.metadataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisualIdEnrollmentMetadata(VisualIdEnrollmentMetadata visualIdEnrollmentMetadata) {
            visualIdEnrollmentMetadata.getClass();
            this.metadata_ = visualIdEnrollmentMetadata;
            this.metadataCase_ = 4;
        }

        public static AssetMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetMetadata parseFrom(InputStream inputStream) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetTransferStateInfo extends GeneratedMessageLite<AssetTransferStateInfo, Builder> implements AssetTransferStateInfoOrBuilder {
        public static final int ASSET_MANIFEST_FIELD_NUMBER = 4;
        public static final int ASSET_PROGRESS_FIELD_NUMBER = 5;
        private static final AssetTransferStateInfo DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        private static volatile Parser<AssetTransferStateInfo> PARSER = null;
        public static final int TRANSFER_STATUS_FIELD_NUMBER = 1;
        public static final int TRANSFER_SUMMARY_FIELD_NUMBER = 3;
        private AssetManifest assetManifest_;
        private AssetProgress assetProgress_;
        private int errorCode_;
        private int transferStatus_;
        private TransferSummary transferSummary_;

        static {
            AssetTransferStateInfo assetTransferStateInfo = new AssetTransferStateInfo();
            DEFAULT_INSTANCE = assetTransferStateInfo;
            assetTransferStateInfo.makeImmutable();
        }

        private AssetTransferStateInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetManifest() {
            this.assetManifest_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetProgress() {
            this.assetProgress_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransferStatus() {
            this.transferStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransferSummary() {
            this.transferSummary_ = null;
        }

        public static AssetTransferStateInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetManifest(AssetManifest assetManifest) {
            AssetManifest assetManifest2 = this.assetManifest_;
            if (assetManifest2 == null || assetManifest2 == AssetManifest.getDefaultInstance()) {
                this.assetManifest_ = assetManifest;
            } else {
                this.assetManifest_ = AssetManifest.newBuilder(this.assetManifest_).mergeFrom((AssetManifest.Builder) assetManifest).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetProgress(AssetProgress assetProgress) {
            AssetProgress assetProgress2 = this.assetProgress_;
            if (assetProgress2 == null || assetProgress2 == AssetProgress.getDefaultInstance()) {
                this.assetProgress_ = assetProgress;
            } else {
                this.assetProgress_ = AssetProgress.newBuilder(this.assetProgress_).mergeFrom((AssetProgress.Builder) assetProgress).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTransferSummary(TransferSummary transferSummary) {
            TransferSummary transferSummary2 = this.transferSummary_;
            if (transferSummary2 == null || transferSummary2 == TransferSummary.getDefaultInstance()) {
                this.transferSummary_ = transferSummary;
            } else {
                this.transferSummary_ = TransferSummary.newBuilder(this.transferSummary_).mergeFrom((TransferSummary.Builder) transferSummary).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetTransferStateInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferStateInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetTransferStateInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetManifest(AssetManifest.Builder builder) {
            this.assetManifest_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetProgress(AssetProgress.Builder builder) {
            this.assetProgress_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(TransferErrorCode transferErrorCode) {
            transferErrorCode.getClass();
            this.errorCode_ = transferErrorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferStatus(TransferStatus transferStatus) {
            transferStatus.getClass();
            this.transferStatus_ = transferStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferStatusValue(int i) {
            this.transferStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferSummary(TransferSummary.Builder builder) {
            this.transferSummary_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetTransferStateInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetTransferStateInfo assetTransferStateInfo = (AssetTransferStateInfo) obj2;
                    int i = this.transferStatus_;
                    boolean z = i != 0;
                    int i2 = assetTransferStateInfo.transferStatus_;
                    this.transferStatus_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.errorCode_;
                    boolean z2 = i3 != 0;
                    int i4 = assetTransferStateInfo.errorCode_;
                    this.errorCode_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.transferSummary_ = (TransferSummary) visitor.visitMessage(this.transferSummary_, assetTransferStateInfo.transferSummary_);
                    this.assetManifest_ = (AssetManifest) visitor.visitMessage(this.assetManifest_, assetTransferStateInfo.assetManifest_);
                    this.assetProgress_ = (AssetProgress) visitor.visitMessage(this.assetProgress_, assetTransferStateInfo.assetProgress_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.transferStatus_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.errorCode_ = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    TransferSummary transferSummary = this.transferSummary_;
                                    TransferSummary.Builder builder = transferSummary != null ? transferSummary.toBuilder() : null;
                                    TransferSummary transferSummary2 = (TransferSummary) codedInputStream.readMessage(TransferSummary.parser(), extensionRegistryLite);
                                    this.transferSummary_ = transferSummary2;
                                    if (builder != null) {
                                        builder.mergeFrom((TransferSummary.Builder) transferSummary2);
                                        this.transferSummary_ = builder.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    AssetManifest assetManifest = this.assetManifest_;
                                    AssetManifest.Builder builder2 = assetManifest != null ? assetManifest.toBuilder() : null;
                                    AssetManifest assetManifest2 = (AssetManifest) codedInputStream.readMessage(AssetManifest.parser(), extensionRegistryLite);
                                    this.assetManifest_ = assetManifest2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((AssetManifest.Builder) assetManifest2);
                                        this.assetManifest_ = builder2.buildPartial();
                                    }
                                } else if (readTag == 42) {
                                    AssetProgress assetProgress = this.assetProgress_;
                                    AssetProgress.Builder builder3 = assetProgress != null ? assetProgress.toBuilder() : null;
                                    AssetProgress assetProgress2 = (AssetProgress) codedInputStream.readMessage(AssetProgress.parser(), extensionRegistryLite);
                                    this.assetProgress_ = assetProgress2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((AssetProgress.Builder) assetProgress2);
                                        this.assetProgress_ = builder3.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetTransferStateInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public AssetManifest getAssetManifest() {
            AssetManifest assetManifest = this.assetManifest_;
            return assetManifest == null ? AssetManifest.getDefaultInstance() : assetManifest;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public AssetProgress getAssetProgress() {
            AssetProgress assetProgress = this.assetProgress_;
            return assetProgress == null ? AssetProgress.getDefaultInstance() : assetProgress;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public TransferErrorCode getErrorCode() {
            TransferErrorCode forNumber = TransferErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? TransferErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.transferStatus_ != TransferStatus.TRANSFER_STATUS_BATCH_READY.getNumber() ? CodedOutputStream.computeEnumSize(1, this.transferStatus_) : 0;
            if (this.errorCode_ != TransferErrorCode.TRANSFER_ERROR_TIMEOUT.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.errorCode_);
            }
            if (this.transferSummary_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, getTransferSummary());
            }
            if (this.assetManifest_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(4, getAssetManifest());
            }
            if (this.assetProgress_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(5, getAssetProgress());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public TransferStatus getTransferStatus() {
            TransferStatus forNumber = TransferStatus.forNumber(this.transferStatus_);
            return forNumber == null ? TransferStatus.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public int getTransferStatusValue() {
            return this.transferStatus_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public TransferSummary getTransferSummary() {
            TransferSummary transferSummary = this.transferSummary_;
            return transferSummary == null ? TransferSummary.getDefaultInstance() : transferSummary;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public boolean hasAssetManifest() {
            return this.assetManifest_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public boolean hasAssetProgress() {
            return this.assetProgress_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
        public boolean hasTransferSummary() {
            return this.transferSummary_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.transferStatus_ != TransferStatus.TRANSFER_STATUS_BATCH_READY.getNumber()) {
                codedOutputStream.writeEnum(1, this.transferStatus_);
            }
            if (this.errorCode_ != TransferErrorCode.TRANSFER_ERROR_TIMEOUT.getNumber()) {
                codedOutputStream.writeEnum(2, this.errorCode_);
            }
            if (this.transferSummary_ != null) {
                codedOutputStream.writeMessage(3, getTransferSummary());
            }
            if (this.assetManifest_ != null) {
                codedOutputStream.writeMessage(4, getAssetManifest());
            }
            if (this.assetProgress_ != null) {
                codedOutputStream.writeMessage(5, getAssetProgress());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetTransferStateInfo, Builder> implements AssetTransferStateInfoOrBuilder {
            private Builder() {
                super(AssetTransferStateInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAssetManifest() {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).clearAssetManifest();
                return this;
            }

            public Builder clearAssetProgress() {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).clearAssetProgress();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearTransferStatus() {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).clearTransferStatus();
                return this;
            }

            public Builder clearTransferSummary() {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).clearTransferSummary();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public AssetManifest getAssetManifest() {
                return ((AssetTransferStateInfo) this.instance).getAssetManifest();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public AssetProgress getAssetProgress() {
                return ((AssetTransferStateInfo) this.instance).getAssetProgress();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public TransferErrorCode getErrorCode() {
                return ((AssetTransferStateInfo) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public int getErrorCodeValue() {
                return ((AssetTransferStateInfo) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public TransferStatus getTransferStatus() {
                return ((AssetTransferStateInfo) this.instance).getTransferStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public int getTransferStatusValue() {
                return ((AssetTransferStateInfo) this.instance).getTransferStatusValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public TransferSummary getTransferSummary() {
                return ((AssetTransferStateInfo) this.instance).getTransferSummary();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public boolean hasAssetManifest() {
                return ((AssetTransferStateInfo) this.instance).hasAssetManifest();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public boolean hasAssetProgress() {
                return ((AssetTransferStateInfo) this.instance).hasAssetProgress();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStateInfoOrBuilder
            public boolean hasTransferSummary() {
                return ((AssetTransferStateInfo) this.instance).hasTransferSummary();
            }

            public Builder mergeAssetManifest(AssetManifest assetManifest) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).mergeAssetManifest(assetManifest);
                return this;
            }

            public Builder mergeAssetProgress(AssetProgress assetProgress) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).mergeAssetProgress(assetProgress);
                return this;
            }

            public Builder mergeTransferSummary(TransferSummary transferSummary) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).mergeTransferSummary(transferSummary);
                return this;
            }

            public Builder setAssetManifest(AssetManifest assetManifest) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setAssetManifest(assetManifest);
                return this;
            }

            public Builder setAssetProgress(AssetProgress assetProgress) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setAssetProgress(assetProgress);
                return this;
            }

            public Builder setErrorCode(TransferErrorCode transferErrorCode) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setErrorCode(transferErrorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setErrorCodeValue(i);
                return this;
            }

            public Builder setTransferStatus(TransferStatus transferStatus) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setTransferStatus(transferStatus);
                return this;
            }

            public Builder setTransferStatusValue(int i) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setTransferStatusValue(i);
                return this;
            }

            public Builder setTransferSummary(TransferSummary transferSummary) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setTransferSummary(transferSummary);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAssetManifest(AssetManifest.Builder builder) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setAssetManifest(builder);
                return this;
            }

            public Builder setAssetProgress(AssetProgress.Builder builder) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setAssetProgress(builder);
                return this;
            }

            public Builder setTransferSummary(TransferSummary.Builder builder) {
                copyOnWrite();
                ((AssetTransferStateInfo) this.instance).setTransferSummary(builder);
                return this;
            }
        }

        public static Builder newBuilder(AssetTransferStateInfo assetTransferStateInfo) {
            return DEFAULT_INSTANCE.createBuilder(assetTransferStateInfo);
        }

        public static AssetTransferStateInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferStateInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetManifest(AssetManifest assetManifest) {
            assetManifest.getClass();
            this.assetManifest_ = assetManifest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetProgress(AssetProgress assetProgress) {
            assetProgress.getClass();
            this.assetProgress_ = assetProgress;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferSummary(TransferSummary transferSummary) {
            transferSummary.getClass();
            this.transferSummary_ = transferSummary;
        }

        public static AssetTransferStateInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetTransferStateInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetTransferStateInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetTransferStateInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetTransferStateInfo parseFrom(InputStream inputStream) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferStateInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferStateInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetTransferStateInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStateInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CustomerInfoMetadata extends GeneratedMessageLite<CustomerInfoMetadata, Builder> implements CustomerInfoMetadataOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 1;
        private static final CustomerInfoMetadata DEFAULT_INSTANCE;
        private static volatile Parser<CustomerInfoMetadata> PARSER;
        private Internal.ProtobufList<CustomerInfoAttribute> attributes_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CustomerInfoMetadata customerInfoMetadata = new CustomerInfoMetadata();
            DEFAULT_INSTANCE = customerInfoMetadata;
            customerInfoMetadata.makeImmutable();
        }

        private CustomerInfoMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttributes(Iterable<? extends CustomerInfoAttribute> iterable) {
            ensureAttributesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(CustomerInfoAttribute.Builder builder) {
            ensureAttributesIsMutable();
            this.attributes_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAttributesIsMutable() {
            if (this.attributes_.isModifiable()) {
                return;
            }
            this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
        }

        public static CustomerInfoMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CustomerInfoMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CustomerInfoMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CustomerInfoMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttributes(int i) {
            ensureAttributesIsMutable();
            this.attributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, CustomerInfoAttribute.Builder builder) {
            ensureAttributesIsMutable();
            this.attributes_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CustomerInfoMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.attributes_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.attributes_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.attributes_, ((CustomerInfoMetadata) obj2).attributes_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.attributes_.isModifiable()) {
                                        this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
                                    }
                                    this.attributes_.add((CustomerInfoAttribute) codedInputStream.readMessage(CustomerInfoAttribute.parser(), extensionRegistryLite));
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (CustomerInfoMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                case 10:
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
        public CustomerInfoAttribute getAttributes(int i) {
            return this.attributes_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
        public int getAttributesCount() {
            return this.attributes_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
        public List<CustomerInfoAttribute> getAttributesList() {
            return this.attributes_;
        }

        public CustomerInfoAttributeOrBuilder getAttributesOrBuilder(int i) {
            return this.attributes_.get(i);
        }

        public List<? extends CustomerInfoAttributeOrBuilder> getAttributesOrBuilderList() {
            return this.attributes_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.attributes_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.attributes_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.attributes_.size(); i++) {
                codedOutputStream.writeMessage(1, this.attributes_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CustomerInfoMetadata, Builder> implements CustomerInfoMetadataOrBuilder {
            private Builder() {
                super(CustomerInfoMetadata.DEFAULT_INSTANCE);
            }

            public Builder addAllAttributes(Iterable<? extends CustomerInfoAttribute> iterable) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).addAllAttributes(iterable);
                return this;
            }

            public Builder addAttributes(CustomerInfoAttribute customerInfoAttribute) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).addAttributes(customerInfoAttribute);
                return this;
            }

            public Builder clearAttributes() {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).clearAttributes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
            public CustomerInfoAttribute getAttributes(int i) {
                return ((CustomerInfoMetadata) this.instance).getAttributes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
            public int getAttributesCount() {
                return ((CustomerInfoMetadata) this.instance).getAttributesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoMetadataOrBuilder
            public List<CustomerInfoAttribute> getAttributesList() {
                return Collections.unmodifiableList(((CustomerInfoMetadata) this.instance).getAttributesList());
            }

            public Builder removeAttributes(int i) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).removeAttributes(i);
                return this;
            }

            public Builder setAttributes(int i, CustomerInfoAttribute customerInfoAttribute) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).setAttributes(i, customerInfoAttribute);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAttributes(int i, CustomerInfoAttribute customerInfoAttribute) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).addAttributes(i, customerInfoAttribute);
                return this;
            }

            public Builder setAttributes(int i, CustomerInfoAttribute.Builder builder) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).setAttributes(i, builder);
                return this;
            }

            public Builder addAttributes(CustomerInfoAttribute.Builder builder) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).addAttributes(builder);
                return this;
            }

            public Builder addAttributes(int i, CustomerInfoAttribute.Builder builder) {
                copyOnWrite();
                ((CustomerInfoMetadata) this.instance).addAttributes(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(CustomerInfoMetadata customerInfoMetadata) {
            return DEFAULT_INSTANCE.createBuilder(customerInfoMetadata);
        }

        public static CustomerInfoMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CustomerInfoMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CustomerInfoMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CustomerInfoMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CustomerInfoMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CustomerInfoMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CustomerInfoMetadata parseFrom(InputStream inputStream) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, CustomerInfoAttribute customerInfoAttribute) {
            customerInfoAttribute.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(i, customerInfoAttribute);
        }

        public static CustomerInfoMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, CustomerInfoAttribute customerInfoAttribute) {
            customerInfoAttribute.getClass();
            ensureAttributesIsMutable();
            this.attributes_.set(i, customerInfoAttribute);
        }

        public static CustomerInfoMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CustomerInfoMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(CustomerInfoAttribute customerInfoAttribute) {
            customerInfoAttribute.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(customerInfoAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, CustomerInfoAttribute.Builder builder) {
            ensureAttributesIsMutable();
            this.attributes_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyAssetAvailable extends GeneratedMessageLite<NotifyAssetAvailable, Builder> implements NotifyAssetAvailableOrBuilder {
        public static final int ASSET_INFO_FIELD_NUMBER = 1;
        private static final NotifyAssetAvailable DEFAULT_INSTANCE;
        private static volatile Parser<NotifyAssetAvailable> PARSER;
        private AssetInfo assetInfo_;

        static {
            NotifyAssetAvailable notifyAssetAvailable = new NotifyAssetAvailable();
            DEFAULT_INSTANCE = notifyAssetAvailable;
            notifyAssetAvailable.makeImmutable();
        }

        private NotifyAssetAvailable() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetInfo() {
            this.assetInfo_ = null;
        }

        public static NotifyAssetAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetInfo(AssetInfo assetInfo) {
            AssetInfo assetInfo2 = this.assetInfo_;
            if (assetInfo2 == null || assetInfo2 == AssetInfo.getDefaultInstance()) {
                this.assetInfo_ = assetInfo;
            } else {
                this.assetInfo_ = AssetInfo.newBuilder(this.assetInfo_).mergeFrom((AssetInfo.Builder) assetInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyAssetAvailable parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyAssetAvailable parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyAssetAvailable> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetInfo(AssetInfo.Builder builder) {
            this.assetInfo_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyAssetAvailable();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.assetInfo_ = (AssetInfo) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.assetInfo_, ((NotifyAssetAvailable) obj2).assetInfo_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    AssetInfo assetInfo = this.assetInfo_;
                                    AssetInfo.Builder builder = assetInfo != null ? assetInfo.toBuilder() : null;
                                    AssetInfo assetInfo2 = (AssetInfo) codedInputStream.readMessage(AssetInfo.parser(), extensionRegistryLite);
                                    this.assetInfo_ = assetInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetInfo.Builder) assetInfo2);
                                        this.assetInfo_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (NotifyAssetAvailable.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetAvailableOrBuilder
        public AssetInfo getAssetInfo() {
            AssetInfo assetInfo = this.assetInfo_;
            return assetInfo == null ? AssetInfo.getDefaultInstance() : assetInfo;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.assetInfo_ != null ? CodedOutputStream.computeMessageSize(1, getAssetInfo()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetAvailableOrBuilder
        public boolean hasAssetInfo() {
            return this.assetInfo_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.assetInfo_ != null) {
                codedOutputStream.writeMessage(1, getAssetInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyAssetAvailable, Builder> implements NotifyAssetAvailableOrBuilder {
            private Builder() {
                super(NotifyAssetAvailable.DEFAULT_INSTANCE);
            }

            public Builder clearAssetInfo() {
                copyOnWrite();
                ((NotifyAssetAvailable) this.instance).clearAssetInfo();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetAvailableOrBuilder
            public AssetInfo getAssetInfo() {
                return ((NotifyAssetAvailable) this.instance).getAssetInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetAvailableOrBuilder
            public boolean hasAssetInfo() {
                return ((NotifyAssetAvailable) this.instance).hasAssetInfo();
            }

            public Builder mergeAssetInfo(AssetInfo assetInfo) {
                copyOnWrite();
                ((NotifyAssetAvailable) this.instance).mergeAssetInfo(assetInfo);
                return this;
            }

            public Builder setAssetInfo(AssetInfo assetInfo) {
                copyOnWrite();
                ((NotifyAssetAvailable) this.instance).setAssetInfo(assetInfo);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAssetInfo(AssetInfo.Builder builder) {
                copyOnWrite();
                ((NotifyAssetAvailable) this.instance).setAssetInfo(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyAssetAvailable notifyAssetAvailable) {
            return DEFAULT_INSTANCE.createBuilder(notifyAssetAvailable);
        }

        public static NotifyAssetAvailable parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyAssetAvailable parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetInfo(AssetInfo assetInfo) {
            assetInfo.getClass();
            this.assetInfo_ = assetInfo;
        }

        public static NotifyAssetAvailable parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyAssetAvailable parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyAssetAvailable parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyAssetAvailable parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyAssetAvailable parseFrom(InputStream inputStream) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyAssetAvailable parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyAssetAvailable parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyAssetAvailable parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyTransferState extends GeneratedMessageLite<NotifyTransferState, Builder> implements NotifyTransferStateOrBuilder {
        public static final int ASSET_TRANSFER_STATE_INFO_FIELD_NUMBER = 3;
        public static final int ASSET_TYPE_FIELD_NUMBER = 2;
        private static final NotifyTransferState DEFAULT_INSTANCE;
        private static volatile Parser<NotifyTransferState> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private AssetTransferStateInfo assetTransferStateInfo_;
        private int assetType_;
        private String sessionId_ = "";

        static {
            NotifyTransferState notifyTransferState = new NotifyTransferState();
            DEFAULT_INSTANCE = notifyTransferState;
            notifyTransferState.makeImmutable();
        }

        private NotifyTransferState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetTransferStateInfo() {
            this.assetTransferStateInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static NotifyTransferState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAssetTransferStateInfo(AssetTransferStateInfo assetTransferStateInfo) {
            AssetTransferStateInfo assetTransferStateInfo2 = this.assetTransferStateInfo_;
            if (assetTransferStateInfo2 == null || assetTransferStateInfo2 == AssetTransferStateInfo.getDefaultInstance()) {
                this.assetTransferStateInfo_ = assetTransferStateInfo;
            } else {
                this.assetTransferStateInfo_ = AssetTransferStateInfo.newBuilder(this.assetTransferStateInfo_).mergeFrom((AssetTransferStateInfo.Builder) assetTransferStateInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyTransferState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyTransferState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyTransferState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTransferStateInfo(AssetTransferStateInfo.Builder builder) {
            this.assetTransferStateInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyTransferState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyTransferState notifyTransferState = (NotifyTransferState) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyTransferState.sessionId_.isEmpty(), notifyTransferState.sessionId_);
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = notifyTransferState.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.assetTransferStateInfo_ = (AssetTransferStateInfo) visitor.visitMessage(this.assetTransferStateInfo_, notifyTransferState.assetTransferStateInfo_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    AssetTransferStateInfo assetTransferStateInfo = this.assetTransferStateInfo_;
                                    AssetTransferStateInfo.Builder builder = assetTransferStateInfo != null ? assetTransferStateInfo.toBuilder() : null;
                                    AssetTransferStateInfo assetTransferStateInfo2 = (AssetTransferStateInfo) codedInputStream.readMessage(AssetTransferStateInfo.parser(), extensionRegistryLite);
                                    this.assetTransferStateInfo_ = assetTransferStateInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetTransferStateInfo.Builder) assetTransferStateInfo2);
                                        this.assetTransferStateInfo_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (NotifyTransferState.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public AssetTransferStateInfo getAssetTransferStateInfo() {
            AssetTransferStateInfo assetTransferStateInfo = this.assetTransferStateInfo_;
            return assetTransferStateInfo == null ? AssetTransferStateInfo.getDefaultInstance() : assetTransferStateInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.assetType_);
            }
            if (this.assetTransferStateInfo_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getAssetTransferStateInfo());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
        public boolean hasAssetTransferStateInfo() {
            return this.assetTransferStateInfo_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.assetType_);
            }
            if (this.assetTransferStateInfo_ != null) {
                codedOutputStream.writeMessage(3, getAssetTransferStateInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyTransferState, Builder> implements NotifyTransferStateOrBuilder {
            private Builder() {
                super(NotifyTransferState.DEFAULT_INSTANCE);
            }

            public Builder clearAssetTransferStateInfo() {
                copyOnWrite();
                ((NotifyTransferState) this.instance).clearAssetTransferStateInfo();
                return this;
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((NotifyTransferState) this.instance).clearAssetType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyTransferState) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public AssetTransferStateInfo getAssetTransferStateInfo() {
                return ((NotifyTransferState) this.instance).getAssetTransferStateInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public AssetType getAssetType() {
                return ((NotifyTransferState) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public int getAssetTypeValue() {
                return ((NotifyTransferState) this.instance).getAssetTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public String getSessionId() {
                return ((NotifyTransferState) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyTransferState) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyTransferStateOrBuilder
            public boolean hasAssetTransferStateInfo() {
                return ((NotifyTransferState) this.instance).hasAssetTransferStateInfo();
            }

            public Builder mergeAssetTransferStateInfo(AssetTransferStateInfo assetTransferStateInfo) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).mergeAssetTransferStateInfo(assetTransferStateInfo);
                return this;
            }

            public Builder setAssetTransferStateInfo(AssetTransferStateInfo assetTransferStateInfo) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setAssetTransferStateInfo(assetTransferStateInfo);
                return this;
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setAssetTypeValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAssetTransferStateInfo(AssetTransferStateInfo.Builder builder) {
                copyOnWrite();
                ((NotifyTransferState) this.instance).setAssetTransferStateInfo(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyTransferState notifyTransferState) {
            return DEFAULT_INSTANCE.createBuilder(notifyTransferState);
        }

        public static NotifyTransferState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyTransferState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTransferStateInfo(AssetTransferStateInfo assetTransferStateInfo) {
            assetTransferStateInfo.getClass();
            this.assetTransferStateInfo_ = assetTransferStateInfo;
        }

        public static NotifyTransferState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyTransferState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyTransferState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyTransferState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyTransferState parseFrom(InputStream inputStream) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyTransferState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyTransferState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyTransferState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyTransferState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoveAssetsResponse extends GeneratedMessageLite<RemoveAssetsResponse, Builder> implements RemoveAssetsResponseOrBuilder {
        public static final int ALL_SUCCEEDED_FIELD_NUMBER = 2;
        public static final int BATCH_ID_FIELD_NUMBER = 4;
        private static final RemoveAssetsResponse DEFAULT_INSTANCE;
        private static volatile Parser<RemoveAssetsResponse> PARSER = null;
        public static final int REMOVED_ASSETS_FIELD_NUMBER = 1;
        public static final int SESSION_ID_FIELD_NUMBER = 3;
        private boolean allSucceeded_;
        private int bitField0_;
        private Internal.ProtobufList<RemovedAssetStatus> removedAssets_ = GeneratedMessageLite.emptyProtobufList();
        private String sessionId_ = "";
        private String batchId_ = "";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface RemovedAssetStatusOrBuilder extends MessageLiteOrBuilder {
            String getAssetId();

            ByteString getAssetIdBytes();

            String getErrorMessage();

            ByteString getErrorMessageBytes();

            boolean getSuccess();
        }

        static {
            RemoveAssetsResponse removeAssetsResponse = new RemoveAssetsResponse();
            DEFAULT_INSTANCE = removeAssetsResponse;
            removeAssetsResponse.makeImmutable();
        }

        private RemoveAssetsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRemovedAssets(Iterable<? extends RemovedAssetStatus> iterable) {
            ensureRemovedAssetsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.removedAssets_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemovedAssets(RemovedAssetStatus.Builder builder) {
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllSucceeded() {
            this.allSucceeded_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatchId() {
            this.batchId_ = getDefaultInstance().getBatchId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemovedAssets() {
            this.removedAssets_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        private void ensureRemovedAssetsIsMutable() {
            if (this.removedAssets_.isModifiable()) {
                return;
            }
            this.removedAssets_ = GeneratedMessageLite.mutableCopy(this.removedAssets_);
        }

        public static RemoveAssetsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveAssetsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveAssetsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RemoveAssetsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRemovedAssets(int i) {
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllSucceeded(boolean z) {
            this.allSucceeded_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchId(String str) {
            str.getClass();
            this.batchId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchIdBytes(ByteString byteString) {
            this.batchId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemovedAssets(int i, RemovedAssetStatus.Builder builder) {
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveAssetsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.removedAssets_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    RemoveAssetsResponse removeAssetsResponse = (RemoveAssetsResponse) obj2;
                    this.removedAssets_ = visitor.visitList(this.removedAssets_, removeAssetsResponse.removedAssets_);
                    boolean z = this.allSucceeded_;
                    boolean z2 = removeAssetsResponse.allSucceeded_;
                    this.allSucceeded_ = visitor.visitBoolean(z, z, z2, z2);
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !removeAssetsResponse.sessionId_.isEmpty(), removeAssetsResponse.sessionId_);
                    this.batchId_ = visitor.visitString(!this.batchId_.isEmpty(), this.batchId_, !removeAssetsResponse.batchId_.isEmpty(), removeAssetsResponse.batchId_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= removeAssetsResponse.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.removedAssets_.isModifiable()) {
                                        this.removedAssets_ = GeneratedMessageLite.mutableCopy(this.removedAssets_);
                                    }
                                    this.removedAssets_.add((RemovedAssetStatus) codedInputStream.readMessage(RemovedAssetStatus.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.allSucceeded_ = codedInputStream.readBool();
                                } else if (readTag == 26) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.batchId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (RemoveAssetsResponse.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public boolean getAllSucceeded() {
            return this.allSucceeded_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public String getBatchId() {
            return this.batchId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public ByteString getBatchIdBytes() {
            return ByteString.copyFromUtf8(this.batchId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public RemovedAssetStatus getRemovedAssets(int i) {
            return this.removedAssets_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public int getRemovedAssetsCount() {
            return this.removedAssets_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public List<RemovedAssetStatus> getRemovedAssetsList() {
            return this.removedAssets_;
        }

        public RemovedAssetStatusOrBuilder getRemovedAssetsOrBuilder(int i) {
            return this.removedAssets_.get(i);
        }

        public List<? extends RemovedAssetStatusOrBuilder> getRemovedAssetsOrBuilderList() {
            return this.removedAssets_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.removedAssets_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.removedAssets_.get(i3));
            }
            boolean z = this.allSucceeded_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(2, z);
            }
            if (!this.sessionId_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getSessionId());
            }
            if (!this.batchId_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(4, getBatchId());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.removedAssets_.size(); i++) {
                codedOutputStream.writeMessage(1, this.removedAssets_.get(i));
            }
            boolean z = this.allSucceeded_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(3, getSessionId());
            }
            if (!this.batchId_.isEmpty()) {
                codedOutputStream.writeString(4, getBatchId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class RemovedAssetStatus extends GeneratedMessageLite<RemovedAssetStatus, Builder> implements RemovedAssetStatusOrBuilder {
            public static final int ASSET_ID_FIELD_NUMBER = 1;
            private static final RemovedAssetStatus DEFAULT_INSTANCE;
            public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
            private static volatile Parser<RemovedAssetStatus> PARSER = null;
            public static final int SUCCESS_FIELD_NUMBER = 2;
            private String assetId_ = "";
            private String errorMessage_ = "";
            private boolean success_;

            static {
                RemovedAssetStatus removedAssetStatus = new RemovedAssetStatus();
                DEFAULT_INSTANCE = removedAssetStatus;
                removedAssetStatus.makeImmutable();
            }

            private RemovedAssetStatus() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAssetId() {
                this.assetId_ = getDefaultInstance().getAssetId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearErrorMessage() {
                this.errorMessage_ = getDefaultInstance().getErrorMessage();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSuccess() {
                this.success_ = false;
            }

            public static RemovedAssetStatus getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static RemovedAssetStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RemovedAssetStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<RemovedAssetStatus> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAssetId(String str) {
                str.getClass();
                this.assetId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAssetIdBytes(ByteString byteString) {
                this.assetId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setErrorMessage(String str) {
                str.getClass();
                this.errorMessage_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setErrorMessageBytes(ByteString byteString) {
                this.errorMessage_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSuccess(boolean z) {
                this.success_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                int i = 0;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RemovedAssetStatus();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                    case 10:
                        return null;
                    case 4:
                        return new Builder(i);
                    case 5:
                        GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                        RemovedAssetStatus removedAssetStatus = (RemovedAssetStatus) obj2;
                        this.assetId_ = visitor.visitString(!this.assetId_.isEmpty(), this.assetId_, !removedAssetStatus.assetId_.isEmpty(), removedAssetStatus.assetId_);
                        boolean z = this.success_;
                        boolean z2 = removedAssetStatus.success_;
                        this.success_ = visitor.visitBoolean(z, z, z2, z2);
                        this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !removedAssetStatus.errorMessage_.isEmpty(), removedAssetStatus.errorMessage_);
                        GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                        return this;
                    case 6:
                        CodedInputStream codedInputStream = (CodedInputStream) obj;
                        ((ExtensionRegistryLite) obj2).getClass();
                        while (i == 0) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.assetId_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 16) {
                                        this.success_ = codedInputStream.readBool();
                                    } else if (readTag == 26) {
                                        this.errorMessage_ = codedInputStream.readStringRequireUtf8();
                                    } else if (!parseUnknownField(readTag, codedInputStream)) {
                                    }
                                }
                                i = 1;
                            } catch (InvalidProtocolBufferException e) {
                                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                                return null;
                            } catch (IOException e2) {
                                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                                return null;
                            }
                        }
                        break;
                    case 7:
                        break;
                    case 8:
                        if (PARSER == null) {
                            synchronized (RemovedAssetStatus.class) {
                                try {
                                    if (PARSER == null) {
                                        PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    }
                                } finally {
                                }
                            }
                        }
                        return PARSER;
                    case 9:
                        return (byte) 1;
                    default:
                        Duration$$ExternalSyntheticBUOutline0.m();
                        return null;
                }
                return DEFAULT_INSTANCE;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
            public String getAssetId() {
                return this.assetId_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
            public ByteString getAssetIdBytes() {
                return ByteString.copyFromUtf8(this.assetId_);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
            public String getErrorMessage() {
                return this.errorMessage_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
            public ByteString getErrorMessageBytes() {
                return ByteString.copyFromUtf8(this.errorMessage_);
            }

            @Override // com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !this.assetId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAssetId()) : 0;
                boolean z = this.success_;
                if (z) {
                    computeStringSize += CodedOutputStream.computeBoolSize(2, z);
                }
                if (!this.errorMessage_.isEmpty()) {
                    computeStringSize += CodedOutputStream.computeStringSize(3, getErrorMessage());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
                this.memoizedSerializedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.assetId_.isEmpty()) {
                    codedOutputStream.writeString(1, getAssetId());
                }
                boolean z = this.success_;
                if (z) {
                    codedOutputStream.writeBool(2, z);
                }
                if (!this.errorMessage_.isEmpty()) {
                    codedOutputStream.writeString(3, getErrorMessage());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Builder extends GeneratedMessageLite.Builder<RemovedAssetStatus, Builder> implements RemovedAssetStatusOrBuilder {
                private Builder() {
                    super(RemovedAssetStatus.DEFAULT_INSTANCE);
                }

                public Builder clearAssetId() {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).clearAssetId();
                    return this;
                }

                public Builder clearErrorMessage() {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).clearErrorMessage();
                    return this;
                }

                public Builder clearSuccess() {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).clearSuccess();
                    return this;
                }

                @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
                public String getAssetId() {
                    return ((RemovedAssetStatus) this.instance).getAssetId();
                }

                @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
                public ByteString getAssetIdBytes() {
                    return ((RemovedAssetStatus) this.instance).getAssetIdBytes();
                }

                @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
                public String getErrorMessage() {
                    return ((RemovedAssetStatus) this.instance).getErrorMessage();
                }

                @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
                public ByteString getErrorMessageBytes() {
                    return ((RemovedAssetStatus) this.instance).getErrorMessageBytes();
                }

                @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponse.RemovedAssetStatusOrBuilder
                public boolean getSuccess() {
                    return ((RemovedAssetStatus) this.instance).getSuccess();
                }

                public Builder setAssetId(String str) {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).setAssetId(str);
                    return this;
                }

                public Builder setAssetIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).setAssetIdBytes(byteString);
                    return this;
                }

                public Builder setErrorMessage(String str) {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).setErrorMessage(str);
                    return this;
                }

                public Builder setErrorMessageBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).setErrorMessageBytes(byteString);
                    return this;
                }

                public Builder setSuccess(boolean z) {
                    copyOnWrite();
                    ((RemovedAssetStatus) this.instance).setSuccess(z);
                    return this;
                }

                public /* synthetic */ Builder(int i) {
                    this();
                }
            }

            public static Builder newBuilder(RemovedAssetStatus removedAssetStatus) {
                return DEFAULT_INSTANCE.createBuilder(removedAssetStatus);
            }

            public static RemovedAssetStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RemovedAssetStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static RemovedAssetStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RemovedAssetStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static RemovedAssetStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RemovedAssetStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static RemovedAssetStatus parseFrom(InputStream inputStream) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RemovedAssetStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RemovedAssetStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static RemovedAssetStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (RemovedAssetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<RemoveAssetsResponse, Builder> implements RemoveAssetsResponseOrBuilder {
            private Builder() {
                super(RemoveAssetsResponse.DEFAULT_INSTANCE);
            }

            public Builder addAllRemovedAssets(Iterable<? extends RemovedAssetStatus> iterable) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).addAllRemovedAssets(iterable);
                return this;
            }

            public Builder addRemovedAssets(RemovedAssetStatus removedAssetStatus) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).addRemovedAssets(removedAssetStatus);
                return this;
            }

            public Builder clearAllSucceeded() {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).clearAllSucceeded();
                return this;
            }

            public Builder clearBatchId() {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).clearBatchId();
                return this;
            }

            public Builder clearRemovedAssets() {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).clearRemovedAssets();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public boolean getAllSucceeded() {
                return ((RemoveAssetsResponse) this.instance).getAllSucceeded();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public String getBatchId() {
                return ((RemoveAssetsResponse) this.instance).getBatchId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public ByteString getBatchIdBytes() {
                return ((RemoveAssetsResponse) this.instance).getBatchIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public RemovedAssetStatus getRemovedAssets(int i) {
                return ((RemoveAssetsResponse) this.instance).getRemovedAssets(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public int getRemovedAssetsCount() {
                return ((RemoveAssetsResponse) this.instance).getRemovedAssetsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public List<RemovedAssetStatus> getRemovedAssetsList() {
                return Collections.unmodifiableList(((RemoveAssetsResponse) this.instance).getRemovedAssetsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public String getSessionId() {
                return ((RemoveAssetsResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((RemoveAssetsResponse) this.instance).getSessionIdBytes();
            }

            public Builder removeRemovedAssets(int i) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).removeRemovedAssets(i);
                return this;
            }

            public Builder setAllSucceeded(boolean z) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setAllSucceeded(z);
                return this;
            }

            public Builder setBatchId(String str) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setBatchId(str);
                return this;
            }

            public Builder setBatchIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setBatchIdBytes(byteString);
                return this;
            }

            public Builder setRemovedAssets(int i, RemovedAssetStatus removedAssetStatus) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setRemovedAssets(i, removedAssetStatus);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addRemovedAssets(int i, RemovedAssetStatus removedAssetStatus) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).addRemovedAssets(i, removedAssetStatus);
                return this;
            }

            public Builder setRemovedAssets(int i, RemovedAssetStatus.Builder builder) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).setRemovedAssets(i, builder);
                return this;
            }

            public Builder addRemovedAssets(RemovedAssetStatus.Builder builder) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).addRemovedAssets(builder);
                return this;
            }

            public Builder addRemovedAssets(int i, RemovedAssetStatus.Builder builder) {
                copyOnWrite();
                ((RemoveAssetsResponse) this.instance).addRemovedAssets(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(RemoveAssetsResponse removeAssetsResponse) {
            return DEFAULT_INSTANCE.createBuilder(removeAssetsResponse);
        }

        public static RemoveAssetsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveAssetsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RemoveAssetsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RemoveAssetsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveAssetsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveAssetsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveAssetsResponse parseFrom(InputStream inputStream) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemovedAssets(int i, RemovedAssetStatus removedAssetStatus) {
            removedAssetStatus.getClass();
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.add(i, removedAssetStatus);
        }

        public static RemoveAssetsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemovedAssets(int i, RemovedAssetStatus removedAssetStatus) {
            removedAssetStatus.getClass();
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.set(i, removedAssetStatus);
        }

        public static RemoveAssetsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveAssetsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssetsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemovedAssets(RemovedAssetStatus removedAssetStatus) {
            removedAssetStatus.getClass();
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.add(removedAssetStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemovedAssets(int i, RemovedAssetStatus.Builder builder) {
            ensureRemovedAssetsIsMutable();
            this.removedAssets_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartAssetTransferSession extends GeneratedMessageLite<StartAssetTransferSession, Builder> implements StartAssetTransferSessionOrBuilder {
        public static final int ASSET_TYPE_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_FIELD_NUMBER = 3;
        private static final StartAssetTransferSession DEFAULT_INSTANCE;
        private static volatile Parser<StartAssetTransferSession> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int assetType_;
        private AssetTransferSessionConfiguration configuration_;
        private String sessionId_ = "";

        static {
            StartAssetTransferSession startAssetTransferSession = new StartAssetTransferSession();
            DEFAULT_INSTANCE = startAssetTransferSession;
            startAssetTransferSession.makeImmutable();
        }

        private StartAssetTransferSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static StartAssetTransferSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(AssetTransferSessionConfiguration assetTransferSessionConfiguration) {
            AssetTransferSessionConfiguration assetTransferSessionConfiguration2 = this.configuration_;
            if (assetTransferSessionConfiguration2 == null || assetTransferSessionConfiguration2 == AssetTransferSessionConfiguration.getDefaultInstance()) {
                this.configuration_ = assetTransferSessionConfiguration;
            } else {
                this.configuration_ = AssetTransferSessionConfiguration.newBuilder(this.configuration_).mergeFrom((AssetTransferSessionConfiguration.Builder) assetTransferSessionConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartAssetTransferSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAssetTransferSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartAssetTransferSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(AssetTransferSessionConfiguration.Builder builder) {
            this.configuration_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartAssetTransferSession();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartAssetTransferSession startAssetTransferSession = (StartAssetTransferSession) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !startAssetTransferSession.sessionId_.isEmpty(), startAssetTransferSession.sessionId_);
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = startAssetTransferSession.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.configuration_ = (AssetTransferSessionConfiguration) visitor.visitMessage(this.configuration_, startAssetTransferSession.configuration_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    AssetTransferSessionConfiguration assetTransferSessionConfiguration = this.configuration_;
                                    AssetTransferSessionConfiguration.Builder builder = assetTransferSessionConfiguration != null ? assetTransferSessionConfiguration.toBuilder() : null;
                                    AssetTransferSessionConfiguration assetTransferSessionConfiguration2 = (AssetTransferSessionConfiguration) codedInputStream.readMessage(AssetTransferSessionConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = assetTransferSessionConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((AssetTransferSessionConfiguration.Builder) assetTransferSessionConfiguration2);
                                        this.configuration_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (StartAssetTransferSession.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public AssetTransferSessionConfiguration getConfiguration() {
            AssetTransferSessionConfiguration assetTransferSessionConfiguration = this.configuration_;
            return assetTransferSessionConfiguration == null ? AssetTransferSessionConfiguration.getDefaultInstance() : assetTransferSessionConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.assetType_);
            }
            if (this.configuration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getConfiguration());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.assetType_);
            }
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(3, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartAssetTransferSession, Builder> implements StartAssetTransferSessionOrBuilder {
            private Builder() {
                super(StartAssetTransferSession.DEFAULT_INSTANCE);
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).clearAssetType();
                return this;
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public AssetType getAssetType() {
                return ((StartAssetTransferSession) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public int getAssetTypeValue() {
                return ((StartAssetTransferSession) this.instance).getAssetTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public AssetTransferSessionConfiguration getConfiguration() {
                return ((StartAssetTransferSession) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public String getSessionId() {
                return ((StartAssetTransferSession) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StartAssetTransferSession) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.StartAssetTransferSessionOrBuilder
            public boolean hasConfiguration() {
                return ((StartAssetTransferSession) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(AssetTransferSessionConfiguration assetTransferSessionConfiguration) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).mergeConfiguration(assetTransferSessionConfiguration);
                return this;
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setAssetTypeValue(i);
                return this;
            }

            public Builder setConfiguration(AssetTransferSessionConfiguration assetTransferSessionConfiguration) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setConfiguration(assetTransferSessionConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(AssetTransferSessionConfiguration.Builder builder) {
                copyOnWrite();
                ((StartAssetTransferSession) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartAssetTransferSession startAssetTransferSession) {
            return DEFAULT_INSTANCE.createBuilder(startAssetTransferSession);
        }

        public static StartAssetTransferSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAssetTransferSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(AssetTransferSessionConfiguration assetTransferSessionConfiguration) {
            assetTransferSessionConfiguration.getClass();
            this.configuration_ = assetTransferSessionConfiguration;
        }

        public static StartAssetTransferSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartAssetTransferSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartAssetTransferSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartAssetTransferSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartAssetTransferSession parseFrom(InputStream inputStream) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAssetTransferSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAssetTransferSession parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartAssetTransferSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransferSummary extends GeneratedMessageLite<TransferSummary, Builder> implements TransferSummaryOrBuilder {
        public static final int ASSET_TRANSFER_STATUS_FIELD_NUMBER = 1;
        private static final TransferSummary DEFAULT_INSTANCE;
        private static volatile Parser<TransferSummary> PARSER;
        private Internal.ProtobufList<AssetTransferStatus> assetTransferStatus_ = GeneratedMessageLite.emptyProtobufList();

        static {
            TransferSummary transferSummary = new TransferSummary();
            DEFAULT_INSTANCE = transferSummary;
            transferSummary.makeImmutable();
        }

        private TransferSummary() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAssetTransferStatus(Iterable<? extends AssetTransferStatus> iterable) {
            ensureAssetTransferStatusIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assetTransferStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetTransferStatus(AssetTransferStatus.Builder builder) {
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetTransferStatus() {
            this.assetTransferStatus_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAssetTransferStatusIsMutable() {
            if (this.assetTransferStatus_.isModifiable()) {
                return;
            }
            this.assetTransferStatus_ = GeneratedMessageLite.mutableCopy(this.assetTransferStatus_);
        }

        public static TransferSummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TransferSummary> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAssetTransferStatus(int i) {
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTransferStatus(int i, AssetTransferStatus.Builder builder) {
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferSummary();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.assetTransferStatus_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.assetTransferStatus_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.assetTransferStatus_, ((TransferSummary) obj2).assetTransferStatus_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.assetTransferStatus_.isModifiable()) {
                                        this.assetTransferStatus_ = GeneratedMessageLite.mutableCopy(this.assetTransferStatus_);
                                    }
                                    this.assetTransferStatus_.add((AssetTransferStatus) codedInputStream.readMessage(AssetTransferStatus.parser(), extensionRegistryLite));
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (TransferSummary.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                case 10:
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
        public AssetTransferStatus getAssetTransferStatus(int i) {
            return this.assetTransferStatus_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
        public int getAssetTransferStatusCount() {
            return this.assetTransferStatus_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
        public List<AssetTransferStatus> getAssetTransferStatusList() {
            return this.assetTransferStatus_;
        }

        public AssetTransferStatusOrBuilder getAssetTransferStatusOrBuilder(int i) {
            return this.assetTransferStatus_.get(i);
        }

        public List<? extends AssetTransferStatusOrBuilder> getAssetTransferStatusOrBuilderList() {
            return this.assetTransferStatus_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.assetTransferStatus_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.assetTransferStatus_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.assetTransferStatus_.size(); i++) {
                codedOutputStream.writeMessage(1, this.assetTransferStatus_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<TransferSummary, Builder> implements TransferSummaryOrBuilder {
            private Builder() {
                super(TransferSummary.DEFAULT_INSTANCE);
            }

            public Builder addAllAssetTransferStatus(Iterable<? extends AssetTransferStatus> iterable) {
                copyOnWrite();
                ((TransferSummary) this.instance).addAllAssetTransferStatus(iterable);
                return this;
            }

            public Builder addAssetTransferStatus(AssetTransferStatus assetTransferStatus) {
                copyOnWrite();
                ((TransferSummary) this.instance).addAssetTransferStatus(assetTransferStatus);
                return this;
            }

            public Builder clearAssetTransferStatus() {
                copyOnWrite();
                ((TransferSummary) this.instance).clearAssetTransferStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
            public AssetTransferStatus getAssetTransferStatus(int i) {
                return ((TransferSummary) this.instance).getAssetTransferStatus(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
            public int getAssetTransferStatusCount() {
                return ((TransferSummary) this.instance).getAssetTransferStatusCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.TransferSummaryOrBuilder
            public List<AssetTransferStatus> getAssetTransferStatusList() {
                return Collections.unmodifiableList(((TransferSummary) this.instance).getAssetTransferStatusList());
            }

            public Builder removeAssetTransferStatus(int i) {
                copyOnWrite();
                ((TransferSummary) this.instance).removeAssetTransferStatus(i);
                return this;
            }

            public Builder setAssetTransferStatus(int i, AssetTransferStatus assetTransferStatus) {
                copyOnWrite();
                ((TransferSummary) this.instance).setAssetTransferStatus(i, assetTransferStatus);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAssetTransferStatus(int i, AssetTransferStatus assetTransferStatus) {
                copyOnWrite();
                ((TransferSummary) this.instance).addAssetTransferStatus(i, assetTransferStatus);
                return this;
            }

            public Builder setAssetTransferStatus(int i, AssetTransferStatus.Builder builder) {
                copyOnWrite();
                ((TransferSummary) this.instance).setAssetTransferStatus(i, builder);
                return this;
            }

            public Builder addAssetTransferStatus(AssetTransferStatus.Builder builder) {
                copyOnWrite();
                ((TransferSummary) this.instance).addAssetTransferStatus(builder);
                return this;
            }

            public Builder addAssetTransferStatus(int i, AssetTransferStatus.Builder builder) {
                copyOnWrite();
                ((TransferSummary) this.instance).addAssetTransferStatus(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(TransferSummary transferSummary) {
            return DEFAULT_INSTANCE.createBuilder(transferSummary);
        }

        public static TransferSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransferSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TransferSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TransferSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TransferSummary parseFrom(InputStream inputStream) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetTransferStatus(int i, AssetTransferStatus assetTransferStatus) {
            assetTransferStatus.getClass();
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.add(i, assetTransferStatus);
        }

        public static TransferSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTransferStatus(int i, AssetTransferStatus assetTransferStatus) {
            assetTransferStatus.getClass();
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.set(i, assetTransferStatus);
        }

        public static TransferSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TransferSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransferSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetTransferStatus(AssetTransferStatus assetTransferStatus) {
            assetTransferStatus.getClass();
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.add(assetTransferStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetTransferStatus(int i, AssetTransferStatus.Builder builder) {
            ensureAssetTransferStatusIsMutable();
            this.assetTransferStatus_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetProgress extends GeneratedMessageLite<AssetProgress, Builder> implements AssetProgressOrBuilder {
        private static final AssetProgress DEFAULT_INSTANCE;
        private static volatile Parser<AssetProgress> PARSER = null;
        public static final int PROGRESS_FIELD_NUMBER = 1;
        public static final int SCALE_FIELD_NUMBER = 2;
        private int progress_;
        private int scale_;

        static {
            AssetProgress assetProgress = new AssetProgress();
            DEFAULT_INSTANCE = assetProgress;
            assetProgress.makeImmutable();
        }

        private AssetProgress() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgress() {
            this.progress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScale() {
            this.scale_ = 0;
        }

        public static AssetProgress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetProgress parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetProgress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetProgress> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(int i) {
            this.progress_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScale(int i) {
            this.scale_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetProgress();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetProgress assetProgress = (AssetProgress) obj2;
                    int i = this.progress_;
                    boolean z = i != 0;
                    int i2 = assetProgress.progress_;
                    this.progress_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.scale_;
                    boolean z2 = i3 != 0;
                    int i4 = assetProgress.scale_;
                    this.scale_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.progress_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.scale_ = codedInputStream.readUInt32();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetProgress.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetProgressOrBuilder
        public int getProgress() {
            return this.progress_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetProgressOrBuilder
        public int getScale() {
            return this.scale_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.progress_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.scale_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.progress_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.scale_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetProgress, Builder> implements AssetProgressOrBuilder {
            private Builder() {
                super(AssetProgress.DEFAULT_INSTANCE);
            }

            public Builder clearProgress() {
                copyOnWrite();
                ((AssetProgress) this.instance).clearProgress();
                return this;
            }

            public Builder clearScale() {
                copyOnWrite();
                ((AssetProgress) this.instance).clearScale();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetProgressOrBuilder
            public int getProgress() {
                return ((AssetProgress) this.instance).getProgress();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetProgressOrBuilder
            public int getScale() {
                return ((AssetProgress) this.instance).getScale();
            }

            public Builder setProgress(int i) {
                copyOnWrite();
                ((AssetProgress) this.instance).setProgress(i);
                return this;
            }

            public Builder setScale(int i) {
                copyOnWrite();
                ((AssetProgress) this.instance).setScale(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AssetProgress assetProgress) {
            return DEFAULT_INSTANCE.createBuilder(assetProgress);
        }

        public static AssetProgress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetProgress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetProgress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetProgress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetProgress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetProgress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetProgress parseFrom(InputStream inputStream) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetProgress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetProgress parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetProgress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetRelationship extends GeneratedMessageLite<AssetRelationship, Builder> implements AssetRelationshipOrBuilder {
        private static final AssetRelationship DEFAULT_INSTANCE;
        private static volatile Parser<AssetRelationship> PARSER = null;
        public static final int RELATED_ASSET_ID_FIELD_NUMBER = 2;
        public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 1;
        private String relatedAssetId_ = "";
        private int relationshipType_;

        static {
            AssetRelationship assetRelationship = new AssetRelationship();
            DEFAULT_INSTANCE = assetRelationship;
            assetRelationship.makeImmutable();
        }

        private AssetRelationship() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelatedAssetId() {
            this.relatedAssetId_ = getDefaultInstance().getRelatedAssetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelationshipType() {
            this.relationshipType_ = 0;
        }

        public static AssetRelationship getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetRelationship parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetRelationship parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetRelationship> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelatedAssetId(String str) {
            str.getClass();
            this.relatedAssetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelatedAssetIdBytes(ByteString byteString) {
            this.relatedAssetId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationshipType(AssetRelationshipType assetRelationshipType) {
            assetRelationshipType.getClass();
            this.relationshipType_ = assetRelationshipType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationshipTypeValue(int i) {
            this.relationshipType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetRelationship();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetRelationship assetRelationship = (AssetRelationship) obj2;
                    int i = this.relationshipType_;
                    boolean z = i != 0;
                    int i2 = assetRelationship.relationshipType_;
                    this.relationshipType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.relatedAssetId_ = visitor.visitString(!this.relatedAssetId_.isEmpty(), this.relatedAssetId_, !assetRelationship.relatedAssetId_.isEmpty(), assetRelationship.relatedAssetId_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.relationshipType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.relatedAssetId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetRelationship.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
        public String getRelatedAssetId() {
            return this.relatedAssetId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
        public ByteString getRelatedAssetIdBytes() {
            return ByteString.copyFromUtf8(this.relatedAssetId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
        public AssetRelationshipType getRelationshipType() {
            AssetRelationshipType forNumber = AssetRelationshipType.forNumber(this.relationshipType_);
            return forNumber == null ? AssetRelationshipType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
        public int getRelationshipTypeValue() {
            return this.relationshipType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.relationshipType_ != AssetRelationshipType.RELATIONSHIP_TYPE_THUMBNAIL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.relationshipType_) : 0;
            if (!this.relatedAssetId_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getRelatedAssetId());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.relationshipType_ != AssetRelationshipType.RELATIONSHIP_TYPE_THUMBNAIL.getNumber()) {
                codedOutputStream.writeEnum(1, this.relationshipType_);
            }
            if (!this.relatedAssetId_.isEmpty()) {
                codedOutputStream.writeString(2, getRelatedAssetId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetRelationship, Builder> implements AssetRelationshipOrBuilder {
            private Builder() {
                super(AssetRelationship.DEFAULT_INSTANCE);
            }

            public Builder clearRelatedAssetId() {
                copyOnWrite();
                ((AssetRelationship) this.instance).clearRelatedAssetId();
                return this;
            }

            public Builder clearRelationshipType() {
                copyOnWrite();
                ((AssetRelationship) this.instance).clearRelationshipType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
            public String getRelatedAssetId() {
                return ((AssetRelationship) this.instance).getRelatedAssetId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
            public ByteString getRelatedAssetIdBytes() {
                return ((AssetRelationship) this.instance).getRelatedAssetIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
            public AssetRelationshipType getRelationshipType() {
                return ((AssetRelationship) this.instance).getRelationshipType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipOrBuilder
            public int getRelationshipTypeValue() {
                return ((AssetRelationship) this.instance).getRelationshipTypeValue();
            }

            public Builder setRelatedAssetId(String str) {
                copyOnWrite();
                ((AssetRelationship) this.instance).setRelatedAssetId(str);
                return this;
            }

            public Builder setRelatedAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AssetRelationship) this.instance).setRelatedAssetIdBytes(byteString);
                return this;
            }

            public Builder setRelationshipType(AssetRelationshipType assetRelationshipType) {
                copyOnWrite();
                ((AssetRelationship) this.instance).setRelationshipType(assetRelationshipType);
                return this;
            }

            public Builder setRelationshipTypeValue(int i) {
                copyOnWrite();
                ((AssetRelationship) this.instance).setRelationshipTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AssetRelationship assetRelationship) {
            return DEFAULT_INSTANCE.createBuilder(assetRelationship);
        }

        public static AssetRelationship parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetRelationship parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetRelationship parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetRelationship parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetRelationship parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetRelationship parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetRelationship parseFrom(InputStream inputStream) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetRelationship parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetRelationship parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetRelationship parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetRelationship) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetTransferSessionConfiguration extends GeneratedMessageLite<AssetTransferSessionConfiguration, Builder> implements AssetTransferSessionConfigurationOrBuilder {
        private static final AssetTransferSessionConfiguration DEFAULT_INSTANCE;
        public static final int MAX_ITEMS_PER_BATCH_FIELD_NUMBER = 2;
        private static volatile Parser<AssetTransferSessionConfiguration> PARSER = null;
        public static final int REQUEST_MODE_FIELD_NUMBER = 3;
        public static final int TRANSFER_MODE_FIELD_NUMBER = 1;
        private int maxItemsPerBatch_;
        private int requestMode_;
        private int transferMode_;

        static {
            AssetTransferSessionConfiguration assetTransferSessionConfiguration = new AssetTransferSessionConfiguration();
            DEFAULT_INSTANCE = assetTransferSessionConfiguration;
            assetTransferSessionConfiguration.makeImmutable();
        }

        private AssetTransferSessionConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxItemsPerBatch() {
            this.maxItemsPerBatch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestMode() {
            this.requestMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransferMode() {
            this.transferMode_ = 0;
        }

        public static AssetTransferSessionConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetTransferSessionConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferSessionConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetTransferSessionConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxItemsPerBatch(int i) {
            this.maxItemsPerBatch_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestMode(RequestMode requestMode) {
            requestMode.getClass();
            this.requestMode_ = requestMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestModeValue(int i) {
            this.requestMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferMode(TransferMode transferMode) {
            transferMode.getClass();
            this.transferMode_ = transferMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransferModeValue(int i) {
            this.transferMode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetTransferSessionConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetTransferSessionConfiguration assetTransferSessionConfiguration = (AssetTransferSessionConfiguration) obj2;
                    int i = this.transferMode_;
                    boolean z = i != 0;
                    int i2 = assetTransferSessionConfiguration.transferMode_;
                    this.transferMode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.maxItemsPerBatch_;
                    boolean z2 = i3 != 0;
                    int i4 = assetTransferSessionConfiguration.maxItemsPerBatch_;
                    this.maxItemsPerBatch_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.requestMode_;
                    boolean z3 = i5 != 0;
                    int i6 = assetTransferSessionConfiguration.requestMode_;
                    this.requestMode_ = visitor.visitInt(z3, i5, i6 != 0, i6);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.transferMode_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.maxItemsPerBatch_ = codedInputStream.readUInt32();
                                } else if (readTag == 24) {
                                    this.requestMode_ = codedInputStream.readEnum();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetTransferSessionConfiguration.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
        public int getMaxItemsPerBatch() {
            return this.maxItemsPerBatch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
        public RequestMode getRequestMode() {
            RequestMode forNumber = RequestMode.forNumber(this.requestMode_);
            return forNumber == null ? RequestMode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
        public int getRequestModeValue() {
            return this.requestMode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.transferMode_ != TransferMode.TRANSFER_MODE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.transferMode_) : 0;
            int i2 = this.maxItemsPerBatch_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            if (this.requestMode_ != RequestMode.REQUEST_MODE_UNSPECIFIED.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, this.requestMode_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
        public TransferMode getTransferMode() {
            TransferMode forNumber = TransferMode.forNumber(this.transferMode_);
            return forNumber == null ? TransferMode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
        public int getTransferModeValue() {
            return this.transferMode_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.transferMode_ != TransferMode.TRANSFER_MODE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.transferMode_);
            }
            int i = this.maxItemsPerBatch_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            if (this.requestMode_ != RequestMode.REQUEST_MODE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(3, this.requestMode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetTransferSessionConfiguration, Builder> implements AssetTransferSessionConfigurationOrBuilder {
            private Builder() {
                super(AssetTransferSessionConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearMaxItemsPerBatch() {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).clearMaxItemsPerBatch();
                return this;
            }

            public Builder clearRequestMode() {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).clearRequestMode();
                return this;
            }

            public Builder clearTransferMode() {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).clearTransferMode();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
            public int getMaxItemsPerBatch() {
                return ((AssetTransferSessionConfiguration) this.instance).getMaxItemsPerBatch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
            public RequestMode getRequestMode() {
                return ((AssetTransferSessionConfiguration) this.instance).getRequestMode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
            public int getRequestModeValue() {
                return ((AssetTransferSessionConfiguration) this.instance).getRequestModeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
            public TransferMode getTransferMode() {
                return ((AssetTransferSessionConfiguration) this.instance).getTransferMode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferSessionConfigurationOrBuilder
            public int getTransferModeValue() {
                return ((AssetTransferSessionConfiguration) this.instance).getTransferModeValue();
            }

            public Builder setMaxItemsPerBatch(int i) {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).setMaxItemsPerBatch(i);
                return this;
            }

            public Builder setRequestMode(RequestMode requestMode) {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).setRequestMode(requestMode);
                return this;
            }

            public Builder setRequestModeValue(int i) {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).setRequestModeValue(i);
                return this;
            }

            public Builder setTransferMode(TransferMode transferMode) {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).setTransferMode(transferMode);
                return this;
            }

            public Builder setTransferModeValue(int i) {
                copyOnWrite();
                ((AssetTransferSessionConfiguration) this.instance).setTransferModeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AssetTransferSessionConfiguration assetTransferSessionConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(assetTransferSessionConfiguration);
        }

        public static AssetTransferSessionConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferSessionConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetTransferSessionConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetTransferSessionConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetTransferSessionConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetTransferSessionConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetTransferSessionConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferSessionConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferSessionConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetTransferSessionConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferSessionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetTransferStatus extends GeneratedMessageLite<AssetTransferStatus, Builder> implements AssetTransferStatusOrBuilder {
        public static final int ASSET_ID_FIELD_NUMBER = 1;
        public static final int ASSET_STATUS_FIELD_NUMBER = 2;
        private static final AssetTransferStatus DEFAULT_INSTANCE;
        private static volatile Parser<AssetTransferStatus> PARSER;
        private String assetId_ = "";
        private int assetStatus_;

        static {
            AssetTransferStatus assetTransferStatus = new AssetTransferStatus();
            DEFAULT_INSTANCE = assetTransferStatus;
            assetTransferStatus.makeImmutable();
        }

        private AssetTransferStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = getDefaultInstance().getAssetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetStatus() {
            this.assetStatus_ = 0;
        }

        public static AssetTransferStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetTransferStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetTransferStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetId(String str) {
            str.getClass();
            this.assetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetIdBytes(ByteString byteString) {
            this.assetId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetStatus(AssetStatus assetStatus) {
            assetStatus.getClass();
            this.assetStatus_ = assetStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetStatusValue(int i) {
            this.assetStatus_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetTransferStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AssetTransferStatus assetTransferStatus = (AssetTransferStatus) obj2;
                    this.assetId_ = visitor.visitString(!this.assetId_.isEmpty(), this.assetId_, !assetTransferStatus.assetId_.isEmpty(), assetTransferStatus.assetId_);
                    int i = this.assetStatus_;
                    boolean z = i != 0;
                    int i2 = assetTransferStatus.assetStatus_;
                    this.assetStatus_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.assetId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.assetStatus_ = codedInputStream.readEnum();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (AssetTransferStatus.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
        public String getAssetId() {
            return this.assetId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
        public ByteString getAssetIdBytes() {
            return ByteString.copyFromUtf8(this.assetId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
        public AssetStatus getAssetStatus() {
            AssetStatus forNumber = AssetStatus.forNumber(this.assetStatus_);
            return forNumber == null ? AssetStatus.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
        public int getAssetStatusValue() {
            return this.assetStatus_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.assetId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAssetId()) : 0;
            if (this.assetStatus_ != AssetStatus.ASSET_STATUS_UNKNOWN.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.assetStatus_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.assetId_.isEmpty()) {
                codedOutputStream.writeString(1, getAssetId());
            }
            if (this.assetStatus_ != AssetStatus.ASSET_STATUS_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.assetStatus_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AssetTransferStatus, Builder> implements AssetTransferStatusOrBuilder {
            private Builder() {
                super(AssetTransferStatus.DEFAULT_INSTANCE);
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).clearAssetId();
                return this;
            }

            public Builder clearAssetStatus() {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).clearAssetStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
            public String getAssetId() {
                return ((AssetTransferStatus) this.instance).getAssetId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
            public ByteString getAssetIdBytes() {
                return ((AssetTransferStatus) this.instance).getAssetIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
            public AssetStatus getAssetStatus() {
                return ((AssetTransferStatus) this.instance).getAssetStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.AssetTransferStatusOrBuilder
            public int getAssetStatusValue() {
                return ((AssetTransferStatus) this.instance).getAssetStatusValue();
            }

            public Builder setAssetId(String str) {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).setAssetId(str);
                return this;
            }

            public Builder setAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).setAssetIdBytes(byteString);
                return this;
            }

            public Builder setAssetStatus(AssetStatus assetStatus) {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).setAssetStatus(assetStatus);
                return this;
            }

            public Builder setAssetStatusValue(int i) {
                copyOnWrite();
                ((AssetTransferStatus) this.instance).setAssetStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AssetTransferStatus assetTransferStatus) {
            return DEFAULT_INSTANCE.createBuilder(assetTransferStatus);
        }

        public static AssetTransferStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetTransferStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetTransferStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetTransferStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetTransferStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetTransferStatus parseFrom(InputStream inputStream) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransferStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetTransferStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetTransferStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetTransferStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CustomerInfoAttribute extends GeneratedMessageLite<CustomerInfoAttribute, Builder> implements CustomerInfoAttributeOrBuilder {
        private static final CustomerInfoAttribute DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile Parser<CustomerInfoAttribute> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String key_ = "";
        private String value_ = "";

        static {
            CustomerInfoAttribute customerInfoAttribute = new CustomerInfoAttribute();
            DEFAULT_INSTANCE = customerInfoAttribute;
            customerInfoAttribute.makeImmutable();
        }

        private CustomerInfoAttribute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static CustomerInfoAttribute getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CustomerInfoAttribute parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CustomerInfoAttribute parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CustomerInfoAttribute> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(String str) {
            str.getClass();
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(ByteString byteString) {
            this.key_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            this.value_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CustomerInfoAttribute();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CustomerInfoAttribute customerInfoAttribute = (CustomerInfoAttribute) obj2;
                    this.key_ = visitor.visitString(!this.key_.isEmpty(), this.key_, !customerInfoAttribute.key_.isEmpty(), customerInfoAttribute.key_);
                    this.value_ = visitor.visitString(!this.value_.isEmpty(), this.value_, !customerInfoAttribute.value_.isEmpty(), customerInfoAttribute.value_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.key_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (CustomerInfoAttribute.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
        public String getKey() {
            return this.key_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.key_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.key_.isEmpty() ? CodedOutputStream.computeStringSize(1, getKey()) : 0;
            if (!this.value_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getValue());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.key_.isEmpty()) {
                codedOutputStream.writeString(1, getKey());
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.writeString(2, getValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CustomerInfoAttribute, Builder> implements CustomerInfoAttributeOrBuilder {
            private Builder() {
                super(CustomerInfoAttribute.DEFAULT_INSTANCE);
            }

            public Builder clearKey() {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).clearKey();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).clearValue();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
            public String getKey() {
                return ((CustomerInfoAttribute) this.instance).getKey();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
            public ByteString getKeyBytes() {
                return ((CustomerInfoAttribute) this.instance).getKeyBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
            public String getValue() {
                return ((CustomerInfoAttribute) this.instance).getValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.CustomerInfoAttributeOrBuilder
            public ByteString getValueBytes() {
                return ((CustomerInfoAttribute) this.instance).getValueBytes();
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).setKeyBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((CustomerInfoAttribute) this.instance).setValueBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CustomerInfoAttribute customerInfoAttribute) {
            return DEFAULT_INSTANCE.createBuilder(customerInfoAttribute);
        }

        public static CustomerInfoAttribute parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CustomerInfoAttribute parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CustomerInfoAttribute parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CustomerInfoAttribute parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CustomerInfoAttribute parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CustomerInfoAttribute parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CustomerInfoAttribute parseFrom(InputStream inputStream) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CustomerInfoAttribute parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CustomerInfoAttribute parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CustomerInfoAttribute parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomerInfoAttribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DiagnosticsUploadGroupMetadata extends GeneratedMessageLite<DiagnosticsUploadGroupMetadata, Builder> implements DiagnosticsUploadGroupMetadataOrBuilder {
        private static final DiagnosticsUploadGroupMetadata DEFAULT_INSTANCE;
        private static volatile Parser<DiagnosticsUploadGroupMetadata> PARSER = null;
        public static final int UPLOAD_TAG_FIELD_NUMBER = 1;
        private String uploadTag_ = "";

        static {
            DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata = new DiagnosticsUploadGroupMetadata();
            DEFAULT_INSTANCE = diagnosticsUploadGroupMetadata;
            diagnosticsUploadGroupMetadata.makeImmutable();
        }

        private DiagnosticsUploadGroupMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadTag() {
            this.uploadTag_ = getDefaultInstance().getUploadTag();
        }

        public static DiagnosticsUploadGroupMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticsUploadGroupMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticsUploadGroupMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadTag(String str) {
            str.getClass();
            this.uploadTag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadTagBytes(ByteString byteString) {
            this.uploadTag_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticsUploadGroupMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.uploadTag_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.uploadTag_.isEmpty(), this.uploadTag_, !r6.uploadTag_.isEmpty(), ((DiagnosticsUploadGroupMetadata) obj2).uploadTag_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.uploadTag_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (DiagnosticsUploadGroupMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.uploadTag_.isEmpty() ? CodedOutputStream.computeStringSize(1, getUploadTag()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadGroupMetadataOrBuilder
        public String getUploadTag() {
            return this.uploadTag_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadGroupMetadataOrBuilder
        public ByteString getUploadTagBytes() {
            return ByteString.copyFromUtf8(this.uploadTag_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.uploadTag_.isEmpty()) {
                codedOutputStream.writeString(1, getUploadTag());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticsUploadGroupMetadata, Builder> implements DiagnosticsUploadGroupMetadataOrBuilder {
            private Builder() {
                super(DiagnosticsUploadGroupMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearUploadTag() {
                copyOnWrite();
                ((DiagnosticsUploadGroupMetadata) this.instance).clearUploadTag();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadGroupMetadataOrBuilder
            public String getUploadTag() {
                return ((DiagnosticsUploadGroupMetadata) this.instance).getUploadTag();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadGroupMetadataOrBuilder
            public ByteString getUploadTagBytes() {
                return ((DiagnosticsUploadGroupMetadata) this.instance).getUploadTagBytes();
            }

            public Builder setUploadTag(String str) {
                copyOnWrite();
                ((DiagnosticsUploadGroupMetadata) this.instance).setUploadTag(str);
                return this;
            }

            public Builder setUploadTagBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticsUploadGroupMetadata) this.instance).setUploadTagBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(DiagnosticsUploadGroupMetadata diagnosticsUploadGroupMetadata) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticsUploadGroupMetadata);
        }

        public static DiagnosticsUploadGroupMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticsUploadGroupMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DiagnosticsUploadMetadata extends GeneratedMessageLite<DiagnosticsUploadMetadata, Builder> implements DiagnosticsUploadMetadataOrBuilder {
        private static final DiagnosticsUploadMetadata DEFAULT_INSTANCE;
        public static final int DIAGNOSTICS_TYPE_FIELD_NUMBER = 1;
        private static volatile Parser<DiagnosticsUploadMetadata> PARSER;
        private int diagnosticsType_;

        static {
            DiagnosticsUploadMetadata diagnosticsUploadMetadata = new DiagnosticsUploadMetadata();
            DEFAULT_INSTANCE = diagnosticsUploadMetadata;
            diagnosticsUploadMetadata.makeImmutable();
        }

        private DiagnosticsUploadMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticsType() {
            this.diagnosticsType_ = 0;
        }

        public static DiagnosticsUploadMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticsUploadMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticsUploadMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticsUploadMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsType(DiagnosticsOuterClass.DiagnosticsType diagnosticsType) {
            diagnosticsType.getClass();
            this.diagnosticsType_ = diagnosticsType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticsTypeValue(int i) {
            this.diagnosticsType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticsUploadMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    DiagnosticsUploadMetadata diagnosticsUploadMetadata = (DiagnosticsUploadMetadata) obj2;
                    int i = this.diagnosticsType_;
                    boolean z = i != 0;
                    int i2 = diagnosticsUploadMetadata.diagnosticsType_;
                    this.diagnosticsType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.diagnosticsType_ = codedInputStream.readEnum();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (DiagnosticsUploadMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadMetadataOrBuilder
        public DiagnosticsOuterClass.DiagnosticsType getDiagnosticsType() {
            DiagnosticsOuterClass.DiagnosticsType forNumber = DiagnosticsOuterClass.DiagnosticsType.forNumber(this.diagnosticsType_);
            return forNumber == null ? DiagnosticsOuterClass.DiagnosticsType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadMetadataOrBuilder
        public int getDiagnosticsTypeValue() {
            return this.diagnosticsType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.diagnosticsType_ != DiagnosticsOuterClass.DiagnosticsType.LOG.getNumber() ? CodedOutputStream.computeEnumSize(1, this.diagnosticsType_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.diagnosticsType_ != DiagnosticsOuterClass.DiagnosticsType.LOG.getNumber()) {
                codedOutputStream.writeEnum(1, this.diagnosticsType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticsUploadMetadata, Builder> implements DiagnosticsUploadMetadataOrBuilder {
            private Builder() {
                super(DiagnosticsUploadMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearDiagnosticsType() {
                copyOnWrite();
                ((DiagnosticsUploadMetadata) this.instance).clearDiagnosticsType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadMetadataOrBuilder
            public DiagnosticsOuterClass.DiagnosticsType getDiagnosticsType() {
                return ((DiagnosticsUploadMetadata) this.instance).getDiagnosticsType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.DiagnosticsUploadMetadataOrBuilder
            public int getDiagnosticsTypeValue() {
                return ((DiagnosticsUploadMetadata) this.instance).getDiagnosticsTypeValue();
            }

            public Builder setDiagnosticsType(DiagnosticsOuterClass.DiagnosticsType diagnosticsType) {
                copyOnWrite();
                ((DiagnosticsUploadMetadata) this.instance).setDiagnosticsType(diagnosticsType);
                return this;
            }

            public Builder setDiagnosticsTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticsUploadMetadata) this.instance).setDiagnosticsTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(DiagnosticsUploadMetadata diagnosticsUploadMetadata) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticsUploadMetadata);
        }

        public static DiagnosticsUploadMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsUploadMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticsUploadMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticsUploadMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticsUploadMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticsUploadMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticsUploadMetadata parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticsUploadMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsUploadMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticsUploadMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticsUploadMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FirmwareUpdateGroupMetadata extends GeneratedMessageLite<FirmwareUpdateGroupMetadata, Builder> implements FirmwareUpdateGroupMetadataOrBuilder {
        private static final FirmwareUpdateGroupMetadata DEFAULT_INSTANCE;
        public static final int LOCALE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<FirmwareUpdateGroupMetadata> PARSER = null;
        public static final int VERSION_NAME_FIELD_NUMBER = 3;
        private String name_ = "";
        private String locale_ = "";
        private String versionName_ = "";

        static {
            FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata = new FirmwareUpdateGroupMetadata();
            DEFAULT_INSTANCE = firmwareUpdateGroupMetadata;
            firmwareUpdateGroupMetadata.makeImmutable();
        }

        private FirmwareUpdateGroupMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocale() {
            this.locale_ = getDefaultInstance().getLocale();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionName() {
            this.versionName_ = getDefaultInstance().getVersionName();
        }

        public static FirmwareUpdateGroupMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FirmwareUpdateGroupMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FirmwareUpdateGroupMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(String str) {
            str.getClass();
            this.locale_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocaleBytes(ByteString byteString) {
            this.locale_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionName(String str) {
            str.getClass();
            this.versionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionNameBytes(ByteString byteString) {
            this.versionName_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FirmwareUpdateGroupMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata = (FirmwareUpdateGroupMetadata) obj2;
                    this.name_ = visitor.visitString(!this.name_.isEmpty(), this.name_, !firmwareUpdateGroupMetadata.name_.isEmpty(), firmwareUpdateGroupMetadata.name_);
                    this.locale_ = visitor.visitString(!this.locale_.isEmpty(), this.locale_, !firmwareUpdateGroupMetadata.locale_.isEmpty(), firmwareUpdateGroupMetadata.locale_);
                    this.versionName_ = visitor.visitString(!this.versionName_.isEmpty(), this.versionName_, !firmwareUpdateGroupMetadata.versionName_.isEmpty(), firmwareUpdateGroupMetadata.versionName_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.locale_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.versionName_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (FirmwareUpdateGroupMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public String getLocale() {
            return this.locale_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public ByteString getLocaleBytes() {
            return ByteString.copyFromUtf8(this.locale_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.name_.isEmpty() ? CodedOutputStream.computeStringSize(1, getName()) : 0;
            if (!this.locale_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getLocale());
            }
            if (!this.versionName_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getVersionName());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public String getVersionName() {
            return this.versionName_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
        public ByteString getVersionNameBytes() {
            return ByteString.copyFromUtf8(this.versionName_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.writeString(1, getName());
            }
            if (!this.locale_.isEmpty()) {
                codedOutputStream.writeString(2, getLocale());
            }
            if (!this.versionName_.isEmpty()) {
                codedOutputStream.writeString(3, getVersionName());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<FirmwareUpdateGroupMetadata, Builder> implements FirmwareUpdateGroupMetadataOrBuilder {
            private Builder() {
                super(FirmwareUpdateGroupMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearLocale() {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).clearLocale();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).clearName();
                return this;
            }

            public Builder clearVersionName() {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).clearVersionName();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public String getLocale() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getLocale();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public ByteString getLocaleBytes() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getLocaleBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public String getName() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getName();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public ByteString getNameBytes() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getNameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public String getVersionName() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getVersionName();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateGroupMetadataOrBuilder
            public ByteString getVersionNameBytes() {
                return ((FirmwareUpdateGroupMetadata) this.instance).getVersionNameBytes();
            }

            public Builder setLocale(String str) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setLocale(str);
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setLocaleBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setVersionName(String str) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setVersionName(str);
                return this;
            }

            public Builder setVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateGroupMetadata) this.instance).setVersionNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(FirmwareUpdateGroupMetadata firmwareUpdateGroupMetadata) {
            return DEFAULT_INSTANCE.createBuilder(firmwareUpdateGroupMetadata);
        }

        public static FirmwareUpdateGroupMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(InputStream inputStream) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FirmwareUpdateGroupMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FirmwareUpdateMetadata extends GeneratedMessageLite<FirmwareUpdateMetadata, Builder> implements FirmwareUpdateMetadataOrBuilder {
        public static final int CURRENT_VERSION_CODE_FIELD_NUMBER = 2;
        private static final FirmwareUpdateMetadata DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 6;
        public static final int GROUP_NAME_FIELD_NUMBER = 7;
        public static final int METADATA_HASH_FIELD_NUMBER = 3;
        public static final int METADATA_SIZE_FIELD_NUMBER = 4;
        public static final int OFFSET_FIELD_NUMBER = 5;
        private static volatile Parser<FirmwareUpdateMetadata> PARSER = null;
        public static final int RESTART_REQUIRED_FIELD_NUMBER = 8;
        public static final int TARGET_VERSION_CODE_FIELD_NUMBER = 1;
        private int currentVersionCode_;
        private int metadataSize_;
        private int offset_;
        private boolean restartRequired_;
        private int targetVersionCode_;
        private String metadataHash_ = "";
        private String deviceId_ = "";
        private String groupName_ = "";

        static {
            FirmwareUpdateMetadata firmwareUpdateMetadata = new FirmwareUpdateMetadata();
            DEFAULT_INSTANCE = firmwareUpdateMetadata;
            firmwareUpdateMetadata.makeImmutable();
        }

        private FirmwareUpdateMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentVersionCode() {
            this.currentVersionCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupName() {
            this.groupName_ = getDefaultInstance().getGroupName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadataHash() {
            this.metadataHash_ = getDefaultInstance().getMetadataHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadataSize() {
            this.metadataSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffset() {
            this.offset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRestartRequired() {
            this.restartRequired_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetVersionCode() {
            this.targetVersionCode_ = 0;
        }

        public static FirmwareUpdateMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FirmwareUpdateMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirmwareUpdateMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FirmwareUpdateMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentVersionCode(int i) {
            this.currentVersionCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(ByteString byteString) {
            this.deviceId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupName(String str) {
            str.getClass();
            this.groupName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupNameBytes(ByteString byteString) {
            this.groupName_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataHash(String str) {
            str.getClass();
            this.metadataHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataHashBytes(ByteString byteString) {
            this.metadataHash_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataSize(int i) {
            this.metadataSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffset(int i) {
            this.offset_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestartRequired(boolean z) {
            this.restartRequired_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetVersionCode(int i) {
            this.targetVersionCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FirmwareUpdateMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    FirmwareUpdateMetadata firmwareUpdateMetadata = (FirmwareUpdateMetadata) obj2;
                    int i = this.targetVersionCode_;
                    boolean z = i != 0;
                    int i2 = firmwareUpdateMetadata.targetVersionCode_;
                    this.targetVersionCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.currentVersionCode_;
                    boolean z2 = i3 != 0;
                    int i4 = firmwareUpdateMetadata.currentVersionCode_;
                    this.currentVersionCode_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.metadataHash_ = visitor.visitString(!this.metadataHash_.isEmpty(), this.metadataHash_, !firmwareUpdateMetadata.metadataHash_.isEmpty(), firmwareUpdateMetadata.metadataHash_);
                    int i5 = this.metadataSize_;
                    boolean z3 = i5 != 0;
                    int i6 = firmwareUpdateMetadata.metadataSize_;
                    this.metadataSize_ = visitor.visitInt(z3, i5, i6 != 0, i6);
                    int i7 = this.offset_;
                    boolean z4 = i7 != 0;
                    int i8 = firmwareUpdateMetadata.offset_;
                    this.offset_ = visitor.visitInt(z4, i7, i8 != 0, i8);
                    this.deviceId_ = visitor.visitString(!this.deviceId_.isEmpty(), this.deviceId_, !firmwareUpdateMetadata.deviceId_.isEmpty(), firmwareUpdateMetadata.deviceId_);
                    this.groupName_ = visitor.visitString(!this.groupName_.isEmpty(), this.groupName_, !firmwareUpdateMetadata.groupName_.isEmpty(), firmwareUpdateMetadata.groupName_);
                    boolean z5 = this.restartRequired_;
                    boolean z6 = firmwareUpdateMetadata.restartRequired_;
                    this.restartRequired_ = visitor.visitBoolean(z5, z5, z6, z6);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.targetVersionCode_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.currentVersionCode_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    this.metadataHash_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 32) {
                                    this.metadataSize_ = codedInputStream.readUInt32();
                                } else if (readTag == 40) {
                                    this.offset_ = codedInputStream.readUInt32();
                                } else if (readTag == 50) {
                                    this.deviceId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 58) {
                                    this.groupName_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 64) {
                                    this.restartRequired_ = codedInputStream.readBool();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (FirmwareUpdateMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public int getCurrentVersionCode() {
            return this.currentVersionCode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public ByteString getDeviceIdBytes() {
            return ByteString.copyFromUtf8(this.deviceId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public String getGroupName() {
            return this.groupName_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public ByteString getGroupNameBytes() {
            return ByteString.copyFromUtf8(this.groupName_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public String getMetadataHash() {
            return this.metadataHash_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public ByteString getMetadataHashBytes() {
            return ByteString.copyFromUtf8(this.metadataHash_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public int getMetadataSize() {
            return this.metadataSize_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public boolean getRestartRequired() {
            return this.restartRequired_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.targetVersionCode_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.currentVersionCode_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            if (!this.metadataHash_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(3, getMetadataHash());
            }
            int i4 = this.metadataSize_;
            if (i4 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(4, i4);
            }
            int i5 = this.offset_;
            if (i5 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(5, i5);
            }
            if (!this.deviceId_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(6, getDeviceId());
            }
            if (!this.groupName_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(7, getGroupName());
            }
            boolean z = this.restartRequired_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(8, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
        public int getTargetVersionCode() {
            return this.targetVersionCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.targetVersionCode_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.currentVersionCode_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            if (!this.metadataHash_.isEmpty()) {
                codedOutputStream.writeString(3, getMetadataHash());
            }
            int i3 = this.metadataSize_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(4, i3);
            }
            int i4 = this.offset_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(5, i4);
            }
            if (!this.deviceId_.isEmpty()) {
                codedOutputStream.writeString(6, getDeviceId());
            }
            if (!this.groupName_.isEmpty()) {
                codedOutputStream.writeString(7, getGroupName());
            }
            boolean z = this.restartRequired_;
            if (z) {
                codedOutputStream.writeBool(8, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<FirmwareUpdateMetadata, Builder> implements FirmwareUpdateMetadataOrBuilder {
            private Builder() {
                super(FirmwareUpdateMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentVersionCode() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearCurrentVersionCode();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearGroupName() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearGroupName();
                return this;
            }

            public Builder clearMetadataHash() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearMetadataHash();
                return this;
            }

            public Builder clearMetadataSize() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearMetadataSize();
                return this;
            }

            public Builder clearOffset() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearOffset();
                return this;
            }

            public Builder clearRestartRequired() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearRestartRequired();
                return this;
            }

            public Builder clearTargetVersionCode() {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).clearTargetVersionCode();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public int getCurrentVersionCode() {
                return ((FirmwareUpdateMetadata) this.instance).getCurrentVersionCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public String getDeviceId() {
                return ((FirmwareUpdateMetadata) this.instance).getDeviceId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public ByteString getDeviceIdBytes() {
                return ((FirmwareUpdateMetadata) this.instance).getDeviceIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public String getGroupName() {
                return ((FirmwareUpdateMetadata) this.instance).getGroupName();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public ByteString getGroupNameBytes() {
                return ((FirmwareUpdateMetadata) this.instance).getGroupNameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public String getMetadataHash() {
                return ((FirmwareUpdateMetadata) this.instance).getMetadataHash();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public ByteString getMetadataHashBytes() {
                return ((FirmwareUpdateMetadata) this.instance).getMetadataHashBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public int getMetadataSize() {
                return ((FirmwareUpdateMetadata) this.instance).getMetadataSize();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public int getOffset() {
                return ((FirmwareUpdateMetadata) this.instance).getOffset();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public boolean getRestartRequired() {
                return ((FirmwareUpdateMetadata) this.instance).getRestartRequired();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.FirmwareUpdateMetadataOrBuilder
            public int getTargetVersionCode() {
                return ((FirmwareUpdateMetadata) this.instance).getTargetVersionCode();
            }

            public Builder setCurrentVersionCode(int i) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setCurrentVersionCode(i);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setDeviceIdBytes(byteString);
                return this;
            }

            public Builder setGroupName(String str) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setGroupName(str);
                return this;
            }

            public Builder setGroupNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setGroupNameBytes(byteString);
                return this;
            }

            public Builder setMetadataHash(String str) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setMetadataHash(str);
                return this;
            }

            public Builder setMetadataHashBytes(ByteString byteString) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setMetadataHashBytes(byteString);
                return this;
            }

            public Builder setMetadataSize(int i) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setMetadataSize(i);
                return this;
            }

            public Builder setOffset(int i) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setOffset(i);
                return this;
            }

            public Builder setRestartRequired(boolean z) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setRestartRequired(z);
                return this;
            }

            public Builder setTargetVersionCode(int i) {
                copyOnWrite();
                ((FirmwareUpdateMetadata) this.instance).setTargetVersionCode(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(FirmwareUpdateMetadata firmwareUpdateMetadata) {
            return DEFAULT_INSTANCE.createBuilder(firmwareUpdateMetadata);
        }

        public static FirmwareUpdateMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirmwareUpdateMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FirmwareUpdateMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FirmwareUpdateMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FirmwareUpdateMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FirmwareUpdateMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FirmwareUpdateMetadata parseFrom(InputStream inputStream) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirmwareUpdateMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirmwareUpdateMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FirmwareUpdateMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FirmwareUpdateMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetAssetInfo extends GeneratedMessageLite<GetAssetInfo, Builder> implements GetAssetInfoOrBuilder {
        public static final int ASSET_TYPE_FIELD_NUMBER = 1;
        private static final GetAssetInfo DEFAULT_INSTANCE;
        private static volatile Parser<GetAssetInfo> PARSER;
        private int assetType_;

        static {
            GetAssetInfo getAssetInfo = new GetAssetInfo();
            DEFAULT_INSTANCE = getAssetInfo;
            getAssetInfo.makeImmutable();
        }

        private GetAssetInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        public static GetAssetInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAssetInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAssetInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAssetInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetAssetInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetAssetInfo getAssetInfo = (GetAssetInfo) obj2;
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = getAssetInfo.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (GetAssetInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.GetAssetInfoOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.GetAssetInfoOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.assetType_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.assetType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetAssetInfo, Builder> implements GetAssetInfoOrBuilder {
            private Builder() {
                super(GetAssetInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((GetAssetInfo) this.instance).clearAssetType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.GetAssetInfoOrBuilder
            public AssetType getAssetType() {
                return ((GetAssetInfo) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.GetAssetInfoOrBuilder
            public int getAssetTypeValue() {
                return ((GetAssetInfo) this.instance).getAssetTypeValue();
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((GetAssetInfo) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((GetAssetInfo) this.instance).setAssetTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetAssetInfo getAssetInfo) {
            return DEFAULT_INSTANCE.createBuilder(getAssetInfo);
        }

        public static GetAssetInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAssetInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAssetInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAssetInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAssetInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAssetInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAssetInfo parseFrom(InputStream inputStream) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAssetInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAssetInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAssetInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAssetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageMetadata extends GeneratedMessageLite<ImageMetadata, Builder> implements ImageMetadataOrBuilder {
        private static final ImageMetadata DEFAULT_INSTANCE;
        public static final int ISAUTOCAPTURE_FIELD_NUMBER = 1;
        private static volatile Parser<ImageMetadata> PARSER;
        private boolean isAutoCapture_;

        static {
            ImageMetadata imageMetadata = new ImageMetadata();
            DEFAULT_INSTANCE = imageMetadata;
            imageMetadata.makeImmutable();
        }

        private ImageMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAutoCapture() {
            this.isAutoCapture_ = false;
        }

        public static ImageMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImageMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImageMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAutoCapture(boolean z) {
            this.isAutoCapture_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImageMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    boolean z = this.isAutoCapture_;
                    boolean z2 = ((ImageMetadata) obj2).isAutoCapture_;
                    this.isAutoCapture_ = ((GeneratedMessageLite.Visitor) obj).visitBoolean(z, z, z2, z2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.isAutoCapture_ = codedInputStream.readBool();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (ImageMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.ImageMetadataOrBuilder
        public boolean getIsAutoCapture() {
            return this.isAutoCapture_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isAutoCapture_;
            int serializedSize = this.unknownFields.getSerializedSize() + (z ? CodedOutputStream.computeBoolSize(1, z) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isAutoCapture_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ImageMetadata, Builder> implements ImageMetadataOrBuilder {
            private Builder() {
                super(ImageMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearIsAutoCapture() {
                copyOnWrite();
                ((ImageMetadata) this.instance).clearIsAutoCapture();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.ImageMetadataOrBuilder
            public boolean getIsAutoCapture() {
                return ((ImageMetadata) this.instance).getIsAutoCapture();
            }

            public Builder setIsAutoCapture(boolean z) {
                copyOnWrite();
                ((ImageMetadata) this.instance).setIsAutoCapture(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ImageMetadata imageMetadata) {
            return DEFAULT_INSTANCE.createBuilder(imageMetadata);
        }

        public static ImageMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ImageMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImageMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImageMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImageMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImageMetadata parseFrom(InputStream inputStream) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImageMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyAssetTransferSession extends GeneratedMessageLite<NotifyAssetTransferSession, Builder> implements NotifyAssetTransferSessionOrBuilder {
        public static final int ASSET_TYPE_FIELD_NUMBER = 2;
        private static final NotifyAssetTransferSession DEFAULT_INSTANCE;
        private static volatile Parser<NotifyAssetTransferSession> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int assetType_;
        private String sessionId_ = "";

        static {
            NotifyAssetTransferSession notifyAssetTransferSession = new NotifyAssetTransferSession();
            DEFAULT_INSTANCE = notifyAssetTransferSession;
            notifyAssetTransferSession.makeImmutable();
        }

        private NotifyAssetTransferSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static NotifyAssetTransferSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyAssetTransferSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyAssetTransferSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyAssetTransferSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyAssetTransferSession();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyAssetTransferSession notifyAssetTransferSession = (NotifyAssetTransferSession) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyAssetTransferSession.sessionId_.isEmpty(), notifyAssetTransferSession.sessionId_);
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = notifyAssetTransferSession.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (NotifyAssetTransferSession.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.assetType_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.assetType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyAssetTransferSession, Builder> implements NotifyAssetTransferSessionOrBuilder {
            private Builder() {
                super(NotifyAssetTransferSession.DEFAULT_INSTANCE);
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).clearAssetType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
            public AssetType getAssetType() {
                return ((NotifyAssetTransferSession) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
            public int getAssetTypeValue() {
                return ((NotifyAssetTransferSession) this.instance).getAssetTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
            public String getSessionId() {
                return ((NotifyAssetTransferSession) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.NotifyAssetTransferSessionOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyAssetTransferSession) this.instance).getSessionIdBytes();
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).setAssetTypeValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyAssetTransferSession) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyAssetTransferSession notifyAssetTransferSession) {
            return DEFAULT_INSTANCE.createBuilder(notifyAssetTransferSession);
        }

        public static NotifyAssetTransferSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyAssetTransferSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyAssetTransferSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyAssetTransferSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyAssetTransferSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyAssetTransferSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyAssetTransferSession parseFrom(InputStream inputStream) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyAssetTransferSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyAssetTransferSession parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyAssetTransferSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyAssetTransferSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoveAssets extends GeneratedMessageLite<RemoveAssets, Builder> implements RemoveAssetsOrBuilder {
        public static final int ASSET_IDS_FIELD_NUMBER = 2;
        public static final int ASSET_TYPE_FIELD_NUMBER = 1;
        public static final int BATCH_ID_FIELD_NUMBER = 6;
        private static final RemoveAssets DEFAULT_INSTANCE;
        public static final int FORCE_REMOVE_FIELD_NUMBER = 4;
        private static volatile Parser<RemoveAssets> PARSER = null;
        public static final int REMOVE_ALL_FIELD_NUMBER = 3;
        public static final int SESSION_ID_FIELD_NUMBER = 5;
        private int assetType_;
        private int bitField0_;
        private boolean forceRemove_;
        private boolean removeAll_;
        private Internal.ProtobufList<String> assetIds_ = GeneratedMessageLite.emptyProtobufList();
        private String sessionId_ = "";
        private String batchId_ = "";

        static {
            RemoveAssets removeAssets = new RemoveAssets();
            DEFAULT_INSTANCE = removeAssets;
            removeAssets.makeImmutable();
        }

        private RemoveAssets() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAssetIds(Iterable<String> iterable) {
            ensureAssetIdsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assetIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetIds(String str) {
            str.getClass();
            ensureAssetIdsIsMutable();
            this.assetIds_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetIdsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAssetIdsIsMutable();
            this.assetIds_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetIds() {
            this.assetIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetType() {
            this.assetType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatchId() {
            this.batchId_ = getDefaultInstance().getBatchId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceRemove() {
            this.forceRemove_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemoveAll() {
            this.removeAll_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        private void ensureAssetIdsIsMutable() {
            if (this.assetIds_.isModifiable()) {
                return;
            }
            this.assetIds_ = GeneratedMessageLite.mutableCopy(this.assetIds_);
        }

        public static RemoveAssets getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveAssets parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveAssets parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RemoveAssets> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetIds(int i, String str) {
            str.getClass();
            ensureAssetIdsIsMutable();
            this.assetIds_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetType(AssetType assetType) {
            assetType.getClass();
            this.assetType_ = assetType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetTypeValue(int i) {
            this.assetType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchId(String str) {
            str.getClass();
            this.batchId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchIdBytes(ByteString byteString) {
            this.batchId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceRemove(boolean z) {
            this.forceRemove_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemoveAll(boolean z) {
            this.removeAll_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveAssets();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.assetIds_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    RemoveAssets removeAssets = (RemoveAssets) obj2;
                    int i = this.assetType_;
                    boolean z = i != 0;
                    int i2 = removeAssets.assetType_;
                    this.assetType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.assetIds_ = visitor.visitList(this.assetIds_, removeAssets.assetIds_);
                    boolean z2 = this.removeAll_;
                    boolean z3 = removeAssets.removeAll_;
                    this.removeAll_ = visitor.visitBoolean(z2, z2, z3, z3);
                    boolean z4 = this.forceRemove_;
                    boolean z5 = removeAssets.forceRemove_;
                    this.forceRemove_ = visitor.visitBoolean(z4, z4, z5, z5);
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !removeAssets.sessionId_.isEmpty(), removeAssets.sessionId_);
                    this.batchId_ = visitor.visitString(!this.batchId_.isEmpty(), this.batchId_, !removeAssets.batchId_.isEmpty(), removeAssets.batchId_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= removeAssets.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.assetType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.assetIds_.isModifiable()) {
                                        this.assetIds_ = GeneratedMessageLite.mutableCopy(this.assetIds_);
                                    }
                                    this.assetIds_.add(readStringRequireUtf8);
                                } else if (readTag == 24) {
                                    this.removeAll_ = codedInputStream.readBool();
                                } else if (readTag == 32) {
                                    this.forceRemove_ = codedInputStream.readBool();
                                } else if (readTag == 42) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 50) {
                                    this.batchId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (RemoveAssets.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public String getAssetIds(int i) {
            return this.assetIds_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public ByteString getAssetIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.assetIds_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public int getAssetIdsCount() {
            return this.assetIds_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public List<String> getAssetIdsList() {
            return this.assetIds_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public AssetType getAssetType() {
            AssetType forNumber = AssetType.forNumber(this.assetType_);
            return forNumber == null ? AssetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public int getAssetTypeValue() {
            return this.assetType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public String getBatchId() {
            return this.batchId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public ByteString getBatchIdBytes() {
            return ByteString.copyFromUtf8(this.batchId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public boolean getForceRemove() {
            return this.forceRemove_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public boolean getRemoveAll() {
            return this.removeAll_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.assetType_) : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.assetIds_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.assetIds_.get(i3));
            }
            int size = getAssetIdsList().size() + computeEnumSize + i2;
            boolean z = this.removeAll_;
            if (z) {
                size += CodedOutputStream.computeBoolSize(3, z);
            }
            boolean z2 = this.forceRemove_;
            if (z2) {
                size += CodedOutputStream.computeBoolSize(4, z2);
            }
            if (!this.sessionId_.isEmpty()) {
                size += CodedOutputStream.computeStringSize(5, getSessionId());
            }
            if (!this.batchId_.isEmpty()) {
                size += CodedOutputStream.computeStringSize(6, getBatchId());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.assetType_ != AssetType.ASSET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.assetType_);
            }
            for (int i = 0; i < this.assetIds_.size(); i++) {
                codedOutputStream.writeString(2, this.assetIds_.get(i));
            }
            boolean z = this.removeAll_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            boolean z2 = this.forceRemove_;
            if (z2) {
                codedOutputStream.writeBool(4, z2);
            }
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(5, getSessionId());
            }
            if (!this.batchId_.isEmpty()) {
                codedOutputStream.writeString(6, getBatchId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<RemoveAssets, Builder> implements RemoveAssetsOrBuilder {
            private Builder() {
                super(RemoveAssets.DEFAULT_INSTANCE);
            }

            public Builder addAllAssetIds(Iterable<String> iterable) {
                copyOnWrite();
                ((RemoveAssets) this.instance).addAllAssetIds(iterable);
                return this;
            }

            public Builder addAssetIds(String str) {
                copyOnWrite();
                ((RemoveAssets) this.instance).addAssetIds(str);
                return this;
            }

            public Builder addAssetIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveAssets) this.instance).addAssetIdsBytes(byteString);
                return this;
            }

            public Builder clearAssetIds() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearAssetIds();
                return this;
            }

            public Builder clearAssetType() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearAssetType();
                return this;
            }

            public Builder clearBatchId() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearBatchId();
                return this;
            }

            public Builder clearForceRemove() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearForceRemove();
                return this;
            }

            public Builder clearRemoveAll() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearRemoveAll();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((RemoveAssets) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public String getAssetIds(int i) {
                return ((RemoveAssets) this.instance).getAssetIds(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public ByteString getAssetIdsBytes(int i) {
                return ((RemoveAssets) this.instance).getAssetIdsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public int getAssetIdsCount() {
                return ((RemoveAssets) this.instance).getAssetIdsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public List<String> getAssetIdsList() {
                return Collections.unmodifiableList(((RemoveAssets) this.instance).getAssetIdsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public AssetType getAssetType() {
                return ((RemoveAssets) this.instance).getAssetType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public int getAssetTypeValue() {
                return ((RemoveAssets) this.instance).getAssetTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public String getBatchId() {
                return ((RemoveAssets) this.instance).getBatchId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public ByteString getBatchIdBytes() {
                return ((RemoveAssets) this.instance).getBatchIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public boolean getForceRemove() {
                return ((RemoveAssets) this.instance).getForceRemove();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public boolean getRemoveAll() {
                return ((RemoveAssets) this.instance).getRemoveAll();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public String getSessionId() {
                return ((RemoveAssets) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.RemoveAssetsOrBuilder
            public ByteString getSessionIdBytes() {
                return ((RemoveAssets) this.instance).getSessionIdBytes();
            }

            public Builder setAssetIds(int i, String str) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setAssetIds(i, str);
                return this;
            }

            public Builder setAssetType(AssetType assetType) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setAssetType(assetType);
                return this;
            }

            public Builder setAssetTypeValue(int i) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setAssetTypeValue(i);
                return this;
            }

            public Builder setBatchId(String str) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setBatchId(str);
                return this;
            }

            public Builder setBatchIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setBatchIdBytes(byteString);
                return this;
            }

            public Builder setForceRemove(boolean z) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setForceRemove(z);
                return this;
            }

            public Builder setRemoveAll(boolean z) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setRemoveAll(z);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveAssets) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RemoveAssets removeAssets) {
            return DEFAULT_INSTANCE.createBuilder(removeAssets);
        }

        public static RemoveAssets parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveAssets parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RemoveAssets parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RemoveAssets parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveAssets parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveAssets parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveAssets parseFrom(InputStream inputStream) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveAssets parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveAssets parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveAssets parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VideoMetadata extends GeneratedMessageLite<VideoMetadata, Builder> implements VideoMetadataOrBuilder {
        private static final VideoMetadata DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int ISAUTOCAPTURE_FIELD_NUMBER = 1;
        private static volatile Parser<VideoMetadata> PARSER;
        private int duration_;
        private boolean isAutoCapture_;

        static {
            VideoMetadata videoMetadata = new VideoMetadata();
            DEFAULT_INSTANCE = videoMetadata;
            videoMetadata.makeImmutable();
        }

        private VideoMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAutoCapture() {
            this.isAutoCapture_ = false;
        }

        public static VideoMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VideoMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VideoMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAutoCapture(boolean z) {
            this.isAutoCapture_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VideoMetadata videoMetadata = (VideoMetadata) obj2;
                    boolean z = this.isAutoCapture_;
                    boolean z2 = videoMetadata.isAutoCapture_;
                    this.isAutoCapture_ = visitor.visitBoolean(z, z, z2, z2);
                    int i = this.duration_;
                    boolean z3 = i != 0;
                    int i2 = videoMetadata.duration_;
                    this.duration_ = visitor.visitInt(z3, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.isAutoCapture_ = codedInputStream.readBool();
                                } else if (readTag == 16) {
                                    this.duration_ = codedInputStream.readUInt32();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VideoMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VideoMetadataOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VideoMetadataOrBuilder
        public boolean getIsAutoCapture() {
            return this.isAutoCapture_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isAutoCapture_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
            int i2 = this.duration_;
            if (i2 != 0) {
                computeBoolSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeBoolSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isAutoCapture_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            int i = this.duration_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VideoMetadata, Builder> implements VideoMetadataOrBuilder {
            private Builder() {
                super(VideoMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((VideoMetadata) this.instance).clearDuration();
                return this;
            }

            public Builder clearIsAutoCapture() {
                copyOnWrite();
                ((VideoMetadata) this.instance).clearIsAutoCapture();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VideoMetadataOrBuilder
            public int getDuration() {
                return ((VideoMetadata) this.instance).getDuration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VideoMetadataOrBuilder
            public boolean getIsAutoCapture() {
                return ((VideoMetadata) this.instance).getIsAutoCapture();
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((VideoMetadata) this.instance).setDuration(i);
                return this;
            }

            public Builder setIsAutoCapture(boolean z) {
                copyOnWrite();
                ((VideoMetadata) this.instance).setIsAutoCapture(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VideoMetadata videoMetadata) {
            return DEFAULT_INSTANCE.createBuilder(videoMetadata);
        }

        public static VideoMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VideoMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VideoMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VideoMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VideoMetadata parseFrom(InputStream inputStream) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VideoMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisualIdEnrollmentGroupMetadata extends GeneratedMessageLite<VisualIdEnrollmentGroupMetadata, Builder> implements VisualIdEnrollmentGroupMetadataOrBuilder {
        private static final VisualIdEnrollmentGroupMetadata DEFAULT_INSTANCE;
        private static volatile Parser<VisualIdEnrollmentGroupMetadata> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private String version_ = "";

        static {
            VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata = new VisualIdEnrollmentGroupMetadata();
            DEFAULT_INSTANCE = visualIdEnrollmentGroupMetadata;
            visualIdEnrollmentGroupMetadata.makeImmutable();
        }

        private VisualIdEnrollmentGroupMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static VisualIdEnrollmentGroupMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisualIdEnrollmentGroupMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisualIdEnrollmentGroupMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            this.version_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisualIdEnrollmentGroupMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.version_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.version_.isEmpty(), this.version_, !r6.version_.isEmpty(), ((VisualIdEnrollmentGroupMetadata) obj2).version_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.version_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VisualIdEnrollmentGroupMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.version_.isEmpty() ? CodedOutputStream.computeStringSize(1, getVersion()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentGroupMetadataOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentGroupMetadataOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.version_.isEmpty()) {
                codedOutputStream.writeString(1, getVersion());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisualIdEnrollmentGroupMetadata, Builder> implements VisualIdEnrollmentGroupMetadataOrBuilder {
            private Builder() {
                super(VisualIdEnrollmentGroupMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((VisualIdEnrollmentGroupMetadata) this.instance).clearVersion();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentGroupMetadataOrBuilder
            public String getVersion() {
                return ((VisualIdEnrollmentGroupMetadata) this.instance).getVersion();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentGroupMetadataOrBuilder
            public ByteString getVersionBytes() {
                return ((VisualIdEnrollmentGroupMetadata) this.instance).getVersionBytes();
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((VisualIdEnrollmentGroupMetadata) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((VisualIdEnrollmentGroupMetadata) this.instance).setVersionBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VisualIdEnrollmentGroupMetadata visualIdEnrollmentGroupMetadata) {
            return DEFAULT_INSTANCE.createBuilder(visualIdEnrollmentGroupMetadata);
        }

        public static VisualIdEnrollmentGroupMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(InputStream inputStream) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisualIdEnrollmentGroupMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentGroupMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisualIdEnrollmentMetadata extends GeneratedMessageLite<VisualIdEnrollmentMetadata, Builder> implements VisualIdEnrollmentMetadataOrBuilder {
        private static final VisualIdEnrollmentMetadata DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 3;
        private static volatile Parser<VisualIdEnrollmentMetadata> PARSER = null;
        public static final int PERSON_ID_FIELD_NUMBER = 1;
        public static final int PERSON_TYPE_FIELD_NUMBER = 2;
        private boolean enabled_;
        private String personId_ = "";
        private int personType_;

        static {
            VisualIdEnrollmentMetadata visualIdEnrollmentMetadata = new VisualIdEnrollmentMetadata();
            DEFAULT_INSTANCE = visualIdEnrollmentMetadata;
            visualIdEnrollmentMetadata.makeImmutable();
        }

        private VisualIdEnrollmentMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPersonId() {
            this.personId_ = getDefaultInstance().getPersonId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPersonType() {
            this.personType_ = 0;
        }

        public static VisualIdEnrollmentMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisualIdEnrollmentMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisualIdEnrollmentMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisualIdEnrollmentMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonId(String str) {
            str.getClass();
            this.personId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonIdBytes(ByteString byteString) {
            this.personId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonType(VisualIdEnrollmentPersonType visualIdEnrollmentPersonType) {
            visualIdEnrollmentPersonType.getClass();
            this.personType_ = visualIdEnrollmentPersonType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonTypeValue(int i) {
            this.personType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisualIdEnrollmentMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisualIdEnrollmentMetadata visualIdEnrollmentMetadata = (VisualIdEnrollmentMetadata) obj2;
                    this.personId_ = visitor.visitString(!this.personId_.isEmpty(), this.personId_, !visualIdEnrollmentMetadata.personId_.isEmpty(), visualIdEnrollmentMetadata.personId_);
                    int i = this.personType_;
                    boolean z = i != 0;
                    int i2 = visualIdEnrollmentMetadata.personType_;
                    this.personType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    boolean z2 = this.enabled_;
                    boolean z3 = visualIdEnrollmentMetadata.enabled_;
                    this.enabled_ = visitor.visitBoolean(z2, z2, z3, z3);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.personId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.personType_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.enabled_ = codedInputStream.readBool();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VisualIdEnrollmentMetadata.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
        public String getPersonId() {
            return this.personId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
        public ByteString getPersonIdBytes() {
            return ByteString.copyFromUtf8(this.personId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
        public VisualIdEnrollmentPersonType getPersonType() {
            VisualIdEnrollmentPersonType forNumber = VisualIdEnrollmentPersonType.forNumber(this.personType_);
            return forNumber == null ? VisualIdEnrollmentPersonType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
        public int getPersonTypeValue() {
            return this.personType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.personId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getPersonId()) : 0;
            if (this.personType_ != VisualIdEnrollmentPersonType.VISUAL_ID_ENROLLMENT_PERSON_TYPE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.personType_);
            }
            boolean z = this.enabled_;
            if (z) {
                computeStringSize += CodedOutputStream.computeBoolSize(3, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.personId_.isEmpty()) {
                codedOutputStream.writeString(1, getPersonId());
            }
            if (this.personType_ != VisualIdEnrollmentPersonType.VISUAL_ID_ENROLLMENT_PERSON_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.personType_);
            }
            boolean z = this.enabled_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisualIdEnrollmentMetadata, Builder> implements VisualIdEnrollmentMetadataOrBuilder {
            private Builder() {
                super(VisualIdEnrollmentMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).clearEnabled();
                return this;
            }

            public Builder clearPersonId() {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).clearPersonId();
                return this;
            }

            public Builder clearPersonType() {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).clearPersonType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
            public boolean getEnabled() {
                return ((VisualIdEnrollmentMetadata) this.instance).getEnabled();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
            public String getPersonId() {
                return ((VisualIdEnrollmentMetadata) this.instance).getPersonId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
            public ByteString getPersonIdBytes() {
                return ((VisualIdEnrollmentMetadata) this.instance).getPersonIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
            public VisualIdEnrollmentPersonType getPersonType() {
                return ((VisualIdEnrollmentMetadata) this.instance).getPersonType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentMetadataOrBuilder
            public int getPersonTypeValue() {
                return ((VisualIdEnrollmentMetadata) this.instance).getPersonTypeValue();
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).setEnabled(z);
                return this;
            }

            public Builder setPersonId(String str) {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).setPersonId(str);
                return this;
            }

            public Builder setPersonIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).setPersonIdBytes(byteString);
                return this;
            }

            public Builder setPersonType(VisualIdEnrollmentPersonType visualIdEnrollmentPersonType) {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).setPersonType(visualIdEnrollmentPersonType);
                return this;
            }

            public Builder setPersonTypeValue(int i) {
                copyOnWrite();
                ((VisualIdEnrollmentMetadata) this.instance).setPersonTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VisualIdEnrollmentMetadata visualIdEnrollmentMetadata) {
            return DEFAULT_INSTANCE.createBuilder(visualIdEnrollmentMetadata);
        }

        public static VisualIdEnrollmentMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisualIdEnrollmentMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisualIdEnrollmentMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisualIdEnrollmentMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisualIdEnrollmentMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisualIdEnrollmentMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisualIdEnrollmentMetadata parseFrom(InputStream inputStream) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisualIdEnrollmentMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisualIdEnrollmentMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisualIdEnrollmentMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisualIdEnrollmentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AssetRelationshipType implements Internal.EnumLite {
        RELATIONSHIP_TYPE_THUMBNAIL(0),
        RELATIONSHIP_TYPE_FIRMWARE_COMPONENT(1),
        UNRECOGNIZED(-1);

        public static final int RELATIONSHIP_TYPE_FIRMWARE_COMPONENT_VALUE = 1;
        public static final int RELATIONSHIP_TYPE_THUMBNAIL_VALUE = 0;
        private static final Internal.EnumLiteMap<AssetRelationshipType> internalValueMap = new Internal.EnumLiteMap<AssetRelationshipType>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.AssetRelationshipType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AssetRelationshipType findValueByNumber(int i) {
                return AssetRelationshipType.forNumber(i);
            }
        };
        private final int value;

        AssetRelationshipType(int i) {
            this.value = i;
        }

        public static AssetRelationshipType forNumber(int i) {
            if (i == 0) {
                return RELATIONSHIP_TYPE_THUMBNAIL;
            }
            if (i != 1) {
                return null;
            }
            return RELATIONSHIP_TYPE_FIRMWARE_COMPONENT;
        }

        public static Internal.EnumLiteMap<AssetRelationshipType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static AssetRelationshipType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AssetStatus implements Internal.EnumLite {
        ASSET_STATUS_UNKNOWN(0),
        ASSET_STATUS_SUCCESS(1),
        ASSET_STATUS_FAILURE(2),
        UNRECOGNIZED(-1);

        public static final int ASSET_STATUS_FAILURE_VALUE = 2;
        public static final int ASSET_STATUS_SUCCESS_VALUE = 1;
        public static final int ASSET_STATUS_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<AssetStatus> internalValueMap = new Internal.EnumLiteMap<AssetStatus>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.AssetStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AssetStatus findValueByNumber(int i) {
                return AssetStatus.forNumber(i);
            }
        };
        private final int value;

        AssetStatus(int i) {
            this.value = i;
        }

        public static AssetStatus forNumber(int i) {
            if (i == 0) {
                return ASSET_STATUS_UNKNOWN;
            }
            if (i == 1) {
                return ASSET_STATUS_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return ASSET_STATUS_FAILURE;
        }

        public static Internal.EnumLiteMap<AssetStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static AssetStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AssetType implements Internal.EnumLite {
        ASSET_TYPE_UNSPECIFIED(0),
        ASSET_TYPE_MEDIA_ELEMENT(1),
        ASSET_TYPE_FIRMWARE_ELEMENT(2),
        ASSET_TYPE_DIAGNOSTIC_ELEMENT(3),
        ASSET_TYPE_VISUAL_ID_ENROLLMENT_ELEMENT(4),
        ASSET_TYPE_DISPLAY_ELEMENT(5),
        ASSET_TYPE_CUSTOMER_INFO_ELEMENT(6),
        UNRECOGNIZED(-1);

        public static final int ASSET_TYPE_CUSTOMER_INFO_ELEMENT_VALUE = 6;
        public static final int ASSET_TYPE_DIAGNOSTIC_ELEMENT_VALUE = 3;
        public static final int ASSET_TYPE_DISPLAY_ELEMENT_VALUE = 5;
        public static final int ASSET_TYPE_FIRMWARE_ELEMENT_VALUE = 2;
        public static final int ASSET_TYPE_MEDIA_ELEMENT_VALUE = 1;
        public static final int ASSET_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int ASSET_TYPE_VISUAL_ID_ENROLLMENT_ELEMENT_VALUE = 4;
        private static final Internal.EnumLiteMap<AssetType> internalValueMap = new Internal.EnumLiteMap<AssetType>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.AssetType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AssetType findValueByNumber(int i) {
                return AssetType.forNumber(i);
            }
        };
        private final int value;

        AssetType(int i) {
            this.value = i;
        }

        public static AssetType forNumber(int i) {
            switch (i) {
                case 0:
                    return ASSET_TYPE_UNSPECIFIED;
                case 1:
                    return ASSET_TYPE_MEDIA_ELEMENT;
                case 2:
                    return ASSET_TYPE_FIRMWARE_ELEMENT;
                case 3:
                    return ASSET_TYPE_DIAGNOSTIC_ELEMENT;
                case 4:
                    return ASSET_TYPE_VISUAL_ID_ENROLLMENT_ELEMENT;
                case 5:
                    return ASSET_TYPE_DISPLAY_ELEMENT;
                case 6:
                    return ASSET_TYPE_CUSTOMER_INFO_ELEMENT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<AssetType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static AssetType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RequestMode implements Internal.EnumLite {
        REQUEST_MODE_UNSPECIFIED(0),
        REQUEST_MODE_PUSH(1),
        REQUEST_MODE_PULL(2),
        UNRECOGNIZED(-1);

        public static final int REQUEST_MODE_PULL_VALUE = 2;
        public static final int REQUEST_MODE_PUSH_VALUE = 1;
        public static final int REQUEST_MODE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<RequestMode> internalValueMap = new Internal.EnumLiteMap<RequestMode>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.RequestMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public RequestMode findValueByNumber(int i) {
                return RequestMode.forNumber(i);
            }
        };
        private final int value;

        RequestMode(int i) {
            this.value = i;
        }

        public static RequestMode forNumber(int i) {
            if (i == 0) {
                return REQUEST_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return REQUEST_MODE_PUSH;
            }
            if (i != 2) {
                return null;
            }
            return REQUEST_MODE_PULL;
        }

        public static Internal.EnumLiteMap<RequestMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static RequestMode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TransferErrorCode implements Internal.EnumLite {
        TRANSFER_ERROR_TIMEOUT(0),
        TRANSFER_ERROR_TEMPERATURE_UNSAFE(1),
        TRANSFER_ERROR_CONNECTION_LOST(2),
        TRANSFER_ERROR_CONNECTION_REFUSED(3),
        TRANSFER_ERROR_STORAGE_FULL(4),
        TRANSFER_ERROR_ASSET_CORRUPTED(5),
        TRANSFER_ERROR_RESOURCE_BUSY(6),
        TRANSFER_ERROR_DOWNLOAD_FAILED(7),
        TRANSFER_ERROR_POOR_WIFI_CONNECTION(8),
        UNRECOGNIZED(-1);

        public static final int TRANSFER_ERROR_ASSET_CORRUPTED_VALUE = 5;
        public static final int TRANSFER_ERROR_CONNECTION_LOST_VALUE = 2;
        public static final int TRANSFER_ERROR_CONNECTION_REFUSED_VALUE = 3;
        public static final int TRANSFER_ERROR_DOWNLOAD_FAILED_VALUE = 7;
        public static final int TRANSFER_ERROR_POOR_WIFI_CONNECTION_VALUE = 8;
        public static final int TRANSFER_ERROR_RESOURCE_BUSY_VALUE = 6;
        public static final int TRANSFER_ERROR_STORAGE_FULL_VALUE = 4;
        public static final int TRANSFER_ERROR_TEMPERATURE_UNSAFE_VALUE = 1;
        public static final int TRANSFER_ERROR_TIMEOUT_VALUE = 0;
        private static final Internal.EnumLiteMap<TransferErrorCode> internalValueMap = new Internal.EnumLiteMap<TransferErrorCode>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.TransferErrorCode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransferErrorCode findValueByNumber(int i) {
                return TransferErrorCode.forNumber(i);
            }
        };
        private final int value;

        TransferErrorCode(int i) {
            this.value = i;
        }

        public static TransferErrorCode forNumber(int i) {
            switch (i) {
                case 0:
                    return TRANSFER_ERROR_TIMEOUT;
                case 1:
                    return TRANSFER_ERROR_TEMPERATURE_UNSAFE;
                case 2:
                    return TRANSFER_ERROR_CONNECTION_LOST;
                case 3:
                    return TRANSFER_ERROR_CONNECTION_REFUSED;
                case 4:
                    return TRANSFER_ERROR_STORAGE_FULL;
                case 5:
                    return TRANSFER_ERROR_ASSET_CORRUPTED;
                case 6:
                    return TRANSFER_ERROR_RESOURCE_BUSY;
                case 7:
                    return TRANSFER_ERROR_DOWNLOAD_FAILED;
                case 8:
                    return TRANSFER_ERROR_POOR_WIFI_CONNECTION;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<TransferErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static TransferErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TransferMode implements Internal.EnumLite {
        TRANSFER_MODE_UNSPECIFIED(0),
        TRANSFER_MODE_CLOUD_TRANSFER(1),
        TRANSFER_MODE_P2P_WIFI_TRANSFER(2),
        TRANSFER_MODE_BT_TRANSFER(3),
        TRANSFER_MODE_NAN_WIFI_TRANSFER(4),
        UNRECOGNIZED(-1);

        public static final int TRANSFER_MODE_BT_TRANSFER_VALUE = 3;
        public static final int TRANSFER_MODE_CLOUD_TRANSFER_VALUE = 1;
        public static final int TRANSFER_MODE_NAN_WIFI_TRANSFER_VALUE = 4;
        public static final int TRANSFER_MODE_P2P_WIFI_TRANSFER_VALUE = 2;
        public static final int TRANSFER_MODE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<TransferMode> internalValueMap = new Internal.EnumLiteMap<TransferMode>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.TransferMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransferMode findValueByNumber(int i) {
                return TransferMode.forNumber(i);
            }
        };
        private final int value;

        TransferMode(int i) {
            this.value = i;
        }

        public static TransferMode forNumber(int i) {
            if (i == 0) {
                return TRANSFER_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSFER_MODE_CLOUD_TRANSFER;
            }
            if (i == 2) {
                return TRANSFER_MODE_P2P_WIFI_TRANSFER;
            }
            if (i == 3) {
                return TRANSFER_MODE_BT_TRANSFER;
            }
            if (i != 4) {
                return null;
            }
            return TRANSFER_MODE_NAN_WIFI_TRANSFER;
        }

        public static Internal.EnumLiteMap<TransferMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static TransferMode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TransferStatus implements Internal.EnumLite {
        TRANSFER_STATUS_BATCH_READY(0),
        TRANSFER_STATUS_BATCH_IMPORTED(1),
        TRANSFER_STATUS_DONE(2),
        TRANSFER_STATUS_ERROR(3),
        TRANSFER_STATUS_APPLY(4),
        TRANSFER_STATUS_CANCELLED(5),
        TRANSFER_STATUS_CLEANUP_COMPLETE(6),
        UNRECOGNIZED(-1);

        public static final int TRANSFER_STATUS_APPLY_VALUE = 4;
        public static final int TRANSFER_STATUS_BATCH_IMPORTED_VALUE = 1;
        public static final int TRANSFER_STATUS_BATCH_READY_VALUE = 0;
        public static final int TRANSFER_STATUS_CANCELLED_VALUE = 5;
        public static final int TRANSFER_STATUS_CLEANUP_COMPLETE_VALUE = 6;
        public static final int TRANSFER_STATUS_DONE_VALUE = 2;
        public static final int TRANSFER_STATUS_ERROR_VALUE = 3;
        private static final Internal.EnumLiteMap<TransferStatus> internalValueMap = new Internal.EnumLiteMap<TransferStatus>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.TransferStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransferStatus findValueByNumber(int i) {
                return TransferStatus.forNumber(i);
            }
        };
        private final int value;

        TransferStatus(int i) {
            this.value = i;
        }

        public static TransferStatus forNumber(int i) {
            switch (i) {
                case 0:
                    return TRANSFER_STATUS_BATCH_READY;
                case 1:
                    return TRANSFER_STATUS_BATCH_IMPORTED;
                case 2:
                    return TRANSFER_STATUS_DONE;
                case 3:
                    return TRANSFER_STATUS_ERROR;
                case 4:
                    return TRANSFER_STATUS_APPLY;
                case 5:
                    return TRANSFER_STATUS_CANCELLED;
                case 6:
                    return TRANSFER_STATUS_CLEANUP_COMPLETE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<TransferStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static TransferStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VisualIdEnrollmentPersonType implements Internal.EnumLite {
        VISUAL_ID_ENROLLMENT_PERSON_TYPE_UNSPECIFIED(0),
        VISUAL_ID_ENROLLMENT_PERSON_TYPE_PERSON_ID(1),
        UNRECOGNIZED(-1);

        public static final int VISUAL_ID_ENROLLMENT_PERSON_TYPE_PERSON_ID_VALUE = 1;
        public static final int VISUAL_ID_ENROLLMENT_PERSON_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<VisualIdEnrollmentPersonType> internalValueMap = new Internal.EnumLiteMap<VisualIdEnrollmentPersonType>() { // from class: com.amazon.alexa.accessory.protocol.Assettransfer.VisualIdEnrollmentPersonType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VisualIdEnrollmentPersonType findValueByNumber(int i) {
                return VisualIdEnrollmentPersonType.forNumber(i);
            }
        };
        private final int value;

        VisualIdEnrollmentPersonType(int i) {
            this.value = i;
        }

        public static VisualIdEnrollmentPersonType forNumber(int i) {
            if (i == 0) {
                return VISUAL_ID_ENROLLMENT_PERSON_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return VISUAL_ID_ENROLLMENT_PERSON_TYPE_PERSON_ID;
        }

        public static Internal.EnumLiteMap<VisualIdEnrollmentPersonType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static VisualIdEnrollmentPersonType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
