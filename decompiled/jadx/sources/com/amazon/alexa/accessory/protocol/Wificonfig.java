package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Wificommon;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
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
public final class Wificonfig {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Wificonfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ForgetWiFiNetworkOrBuilder extends MessageLiteOrBuilder {
        int getNetworkId();

        ByteString getSsid();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetSavedWiFiNetworksOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetSavedWiFiNetworksResponseOrBuilder extends MessageLiteOrBuilder {
        SavedWiFiNetwork getSavedNetworks(int i);

        int getSavedNetworksCount();

        List<SavedWiFiNetwork> getSavedNetworksList();

        int getTotalCount();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetWiFiConfigAPDetailsOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetWiFiConfigAPDetailsResponseOrBuilder extends MessageLiteOrBuilder {
        Wificommon.TLSCertInfo getTlsCertInfo();

        WiFiConfigAPInfo getWifiApInfo();

        boolean hasTlsCertInfo();

        boolean hasWifiApInfo();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyWiFiNetworkConnectionChangesOrBuilder extends MessageLiteOrBuilder {
        SavedWiFiNetwork getSavedNetworks(int i);

        int getSavedNetworksCount();

        List<SavedWiFiNetwork> getSavedNetworksList();

        int getTotalCount();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SavedWiFiNetworkOrBuilder extends MessageLiteOrBuilder {
        boolean getConnectionStatus();

        WiFiLastConnectionAttempt getLastConnectionAttempt();

        int getNetworkId();

        SecurityType getSecurityType();

        int getSecurityTypeValue();

        ByteString getSsid();

        boolean hasLastConnectionAttempt();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartWiFiConfigAPOrBuilder extends MessageLiteOrBuilder {
        WiFiConfigAPSetting getSetting();

        boolean hasSetting();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartWiFiConfigAPResponseOrBuilder extends MessageLiteOrBuilder {
        Wificommon.TLSCertInfo getTlsCertInfo();

        WiFiConfigAPInfo getWifiApInfo();

        boolean hasTlsCertInfo();

        boolean hasWifiApInfo();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopWiFiConfigAPOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WiFiConfigAPInfoOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalInfo();

        ByteString getAdditionalInfoBytes();

        boolean getBroadcastSsid();

        ChannelBandwidth getChannelBandwidth();

        int getChannelBandwidthValue();

        int getChannelFrequencyMhz();

        String getHostname();

        ByteString getHostnameBytes();

        String getIpAddress();

        ByteString getIpAddressBytes();

        String getPassphrase();

        ByteString getPassphraseBytes();

        SecurityType getSecurityType();

        int getSecurityTypeValue();

        ByteString getSsid();

        WiFiConfigAPType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WiFiConfigAPSettingOrBuilder extends MessageLiteOrBuilder {
        boolean getBroadcastSsid();

        WiFiConfigAPType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WiFiLastConnectionAttemptOrBuilder extends MessageLiteOrBuilder {
        String getConnectionAttemptTimestampEpoch();

        ByteString getConnectionAttemptTimestampEpochBytes();

        String getConnectionFailedReason();

        ByteString getConnectionFailedReasonBytes();

        WiFiLastConnectionStatus getConnectionStatus();

        int getConnectionStatusValue();
    }

    private Wificonfig() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetSavedWiFiNetworksResponse extends GeneratedMessageLite<GetSavedWiFiNetworksResponse, Builder> implements GetSavedWiFiNetworksResponseOrBuilder {
        private static final GetSavedWiFiNetworksResponse DEFAULT_INSTANCE;
        private static volatile Parser<GetSavedWiFiNetworksResponse> PARSER = null;
        public static final int SAVED_NETWORKS_FIELD_NUMBER = 1;
        public static final int TOTAL_COUNT_FIELD_NUMBER = 2;
        private int bitField0_;
        private Internal.ProtobufList<SavedWiFiNetwork> savedNetworks_ = GeneratedMessageLite.emptyProtobufList();
        private int totalCount_;

        static {
            GetSavedWiFiNetworksResponse getSavedWiFiNetworksResponse = new GetSavedWiFiNetworksResponse();
            DEFAULT_INSTANCE = getSavedWiFiNetworksResponse;
            getSavedWiFiNetworksResponse.makeImmutable();
        }

        private GetSavedWiFiNetworksResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSavedNetworks(Iterable<? extends SavedWiFiNetwork> iterable) {
            ensureSavedNetworksIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.savedNetworks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSavedNetworks() {
            this.savedNetworks_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalCount() {
            this.totalCount_ = 0;
        }

        private void ensureSavedNetworksIsMutable() {
            if (this.savedNetworks_.isModifiable()) {
                return;
            }
            this.savedNetworks_ = GeneratedMessageLite.mutableCopy(this.savedNetworks_);
        }

        public static GetSavedWiFiNetworksResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetSavedWiFiNetworksResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetSavedWiFiNetworksResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSavedNetworks(int i) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalCount(int i) {
            this.totalCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetSavedWiFiNetworksResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.savedNetworks_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetSavedWiFiNetworksResponse getSavedWiFiNetworksResponse = (GetSavedWiFiNetworksResponse) obj2;
                    this.savedNetworks_ = visitor.visitList(this.savedNetworks_, getSavedWiFiNetworksResponse.savedNetworks_);
                    int i = this.totalCount_;
                    boolean z = i != 0;
                    int i2 = getSavedWiFiNetworksResponse.totalCount_;
                    this.totalCount_ = visitor.visitInt(z, i, i2 != 0, i2);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= getSavedWiFiNetworksResponse.bitField0_;
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
                                    if (!this.savedNetworks_.isModifiable()) {
                                        this.savedNetworks_ = GeneratedMessageLite.mutableCopy(this.savedNetworks_);
                                    }
                                    this.savedNetworks_.add((SavedWiFiNetwork) codedInputStream.readMessage(SavedWiFiNetwork.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.totalCount_ = codedInputStream.readUInt32();
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
                        synchronized (GetSavedWiFiNetworksResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
        public SavedWiFiNetwork getSavedNetworks(int i) {
            return this.savedNetworks_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
        public int getSavedNetworksCount() {
            return this.savedNetworks_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
        public List<SavedWiFiNetwork> getSavedNetworksList() {
            return this.savedNetworks_;
        }

        public SavedWiFiNetworkOrBuilder getSavedNetworksOrBuilder(int i) {
            return this.savedNetworks_.get(i);
        }

        public List<? extends SavedWiFiNetworkOrBuilder> getSavedNetworksOrBuilderList() {
            return this.savedNetworks_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.savedNetworks_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.savedNetworks_.get(i3));
            }
            int i4 = this.totalCount_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(2, i4);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
        public int getTotalCount() {
            return this.totalCount_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.savedNetworks_.size(); i++) {
                codedOutputStream.writeMessage(1, this.savedNetworks_.get(i));
            }
            int i2 = this.totalCount_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetSavedWiFiNetworksResponse, Builder> implements GetSavedWiFiNetworksResponseOrBuilder {
            private Builder() {
                super(GetSavedWiFiNetworksResponse.DEFAULT_INSTANCE);
            }

            public Builder addAllSavedNetworks(Iterable<? extends SavedWiFiNetwork> iterable) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).addAllSavedNetworks(iterable);
                return this;
            }

            public Builder addSavedNetworks(SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).addSavedNetworks(savedWiFiNetwork);
                return this;
            }

            public Builder clearSavedNetworks() {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).clearSavedNetworks();
                return this;
            }

            public Builder clearTotalCount() {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).clearTotalCount();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
            public SavedWiFiNetwork getSavedNetworks(int i) {
                return ((GetSavedWiFiNetworksResponse) this.instance).getSavedNetworks(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
            public int getSavedNetworksCount() {
                return ((GetSavedWiFiNetworksResponse) this.instance).getSavedNetworksCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
            public List<SavedWiFiNetwork> getSavedNetworksList() {
                return Collections.unmodifiableList(((GetSavedWiFiNetworksResponse) this.instance).getSavedNetworksList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetSavedWiFiNetworksResponseOrBuilder
            public int getTotalCount() {
                return ((GetSavedWiFiNetworksResponse) this.instance).getTotalCount();
            }

            public Builder removeSavedNetworks(int i) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).removeSavedNetworks(i);
                return this;
            }

            public Builder setSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).setSavedNetworks(i, savedWiFiNetwork);
                return this;
            }

            public Builder setTotalCount(int i) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).setTotalCount(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).addSavedNetworks(i, savedWiFiNetwork);
                return this;
            }

            public Builder setSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).setSavedNetworks(i, builder);
                return this;
            }

            public Builder addSavedNetworks(SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).addSavedNetworks(builder);
                return this;
            }

            public Builder addSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((GetSavedWiFiNetworksResponse) this.instance).addSavedNetworks(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(GetSavedWiFiNetworksResponse getSavedWiFiNetworksResponse) {
            return DEFAULT_INSTANCE.createBuilder(getSavedWiFiNetworksResponse);
        }

        public static GetSavedWiFiNetworksResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(InputStream inputStream) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(i, savedWiFiNetwork);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.set(i, savedWiFiNetwork);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetSavedWiFiNetworksResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworksResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(savedWiFiNetwork);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetWiFiConfigAPDetailsResponse extends GeneratedMessageLite<GetWiFiConfigAPDetailsResponse, Builder> implements GetWiFiConfigAPDetailsResponseOrBuilder {
        private static final GetWiFiConfigAPDetailsResponse DEFAULT_INSTANCE;
        private static volatile Parser<GetWiFiConfigAPDetailsResponse> PARSER = null;
        public static final int TLS_CERT_INFO_FIELD_NUMBER = 2;
        public static final int WIFI_AP_INFO_FIELD_NUMBER = 1;
        private Wificommon.TLSCertInfo tlsCertInfo_;
        private WiFiConfigAPInfo wifiApInfo_;

        static {
            GetWiFiConfigAPDetailsResponse getWiFiConfigAPDetailsResponse = new GetWiFiConfigAPDetailsResponse();
            DEFAULT_INSTANCE = getWiFiConfigAPDetailsResponse;
            getWiFiConfigAPDetailsResponse.makeImmutable();
        }

        private GetWiFiConfigAPDetailsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTlsCertInfo() {
            this.tlsCertInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiApInfo() {
            this.wifiApInfo_ = null;
        }

        public static GetWiFiConfigAPDetailsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
            Wificommon.TLSCertInfo tLSCertInfo2 = this.tlsCertInfo_;
            if (tLSCertInfo2 == null || tLSCertInfo2 == Wificommon.TLSCertInfo.getDefaultInstance()) {
                this.tlsCertInfo_ = tLSCertInfo;
            } else {
                this.tlsCertInfo_ = Wificommon.TLSCertInfo.newBuilder(this.tlsCertInfo_).mergeFrom((Wificommon.TLSCertInfo.Builder) tLSCertInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
            WiFiConfigAPInfo wiFiConfigAPInfo2 = this.wifiApInfo_;
            if (wiFiConfigAPInfo2 == null || wiFiConfigAPInfo2 == WiFiConfigAPInfo.getDefaultInstance()) {
                this.wifiApInfo_ = wiFiConfigAPInfo;
            } else {
                this.wifiApInfo_ = WiFiConfigAPInfo.newBuilder(this.wifiApInfo_).mergeFrom((WiFiConfigAPInfo.Builder) wiFiConfigAPInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetWiFiConfigAPDetailsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetWiFiConfigAPDetailsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTlsCertInfo(Wificommon.TLSCertInfo.Builder builder) {
            this.tlsCertInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiApInfo(WiFiConfigAPInfo.Builder builder) {
            this.wifiApInfo_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetWiFiConfigAPDetailsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetWiFiConfigAPDetailsResponse getWiFiConfigAPDetailsResponse = (GetWiFiConfigAPDetailsResponse) obj2;
                    this.wifiApInfo_ = (WiFiConfigAPInfo) visitor.visitMessage(this.wifiApInfo_, getWiFiConfigAPDetailsResponse.wifiApInfo_);
                    this.tlsCertInfo_ = (Wificommon.TLSCertInfo) visitor.visitMessage(this.tlsCertInfo_, getWiFiConfigAPDetailsResponse.tlsCertInfo_);
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
                                    WiFiConfigAPInfo wiFiConfigAPInfo = this.wifiApInfo_;
                                    WiFiConfigAPInfo.Builder builder = wiFiConfigAPInfo != null ? wiFiConfigAPInfo.toBuilder() : null;
                                    WiFiConfigAPInfo wiFiConfigAPInfo2 = (WiFiConfigAPInfo) codedInputStream.readMessage(WiFiConfigAPInfo.parser(), extensionRegistryLite);
                                    this.wifiApInfo_ = wiFiConfigAPInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom((WiFiConfigAPInfo.Builder) wiFiConfigAPInfo2);
                                        this.wifiApInfo_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Wificommon.TLSCertInfo tLSCertInfo = this.tlsCertInfo_;
                                    Wificommon.TLSCertInfo.Builder builder2 = tLSCertInfo != null ? tLSCertInfo.toBuilder() : null;
                                    Wificommon.TLSCertInfo tLSCertInfo2 = (Wificommon.TLSCertInfo) codedInputStream.readMessage(Wificommon.TLSCertInfo.parser(), extensionRegistryLite);
                                    this.tlsCertInfo_ = tLSCertInfo2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Wificommon.TLSCertInfo.Builder) tLSCertInfo2);
                                        this.tlsCertInfo_ = builder2.buildPartial();
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
                        synchronized (GetWiFiConfigAPDetailsResponse.class) {
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
            int computeMessageSize = this.wifiApInfo_ != null ? CodedOutputStream.computeMessageSize(1, getWifiApInfo()) : 0;
            if (this.tlsCertInfo_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getTlsCertInfo());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
        public Wificommon.TLSCertInfo getTlsCertInfo() {
            Wificommon.TLSCertInfo tLSCertInfo = this.tlsCertInfo_;
            return tLSCertInfo == null ? Wificommon.TLSCertInfo.getDefaultInstance() : tLSCertInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
        public WiFiConfigAPInfo getWifiApInfo() {
            WiFiConfigAPInfo wiFiConfigAPInfo = this.wifiApInfo_;
            return wiFiConfigAPInfo == null ? WiFiConfigAPInfo.getDefaultInstance() : wiFiConfigAPInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
        public boolean hasTlsCertInfo() {
            return this.tlsCertInfo_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
        public boolean hasWifiApInfo() {
            return this.wifiApInfo_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.wifiApInfo_ != null) {
                codedOutputStream.writeMessage(1, getWifiApInfo());
            }
            if (this.tlsCertInfo_ != null) {
                codedOutputStream.writeMessage(2, getTlsCertInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetWiFiConfigAPDetailsResponse, Builder> implements GetWiFiConfigAPDetailsResponseOrBuilder {
            private Builder() {
                super(GetWiFiConfigAPDetailsResponse.DEFAULT_INSTANCE);
            }

            public Builder clearTlsCertInfo() {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).clearTlsCertInfo();
                return this;
            }

            public Builder clearWifiApInfo() {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).clearWifiApInfo();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
            public Wificommon.TLSCertInfo getTlsCertInfo() {
                return ((GetWiFiConfigAPDetailsResponse) this.instance).getTlsCertInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
            public WiFiConfigAPInfo getWifiApInfo() {
                return ((GetWiFiConfigAPDetailsResponse) this.instance).getWifiApInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
            public boolean hasTlsCertInfo() {
                return ((GetWiFiConfigAPDetailsResponse) this.instance).hasTlsCertInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.GetWiFiConfigAPDetailsResponseOrBuilder
            public boolean hasWifiApInfo() {
                return ((GetWiFiConfigAPDetailsResponse) this.instance).hasWifiApInfo();
            }

            public Builder mergeTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).mergeTlsCertInfo(tLSCertInfo);
                return this;
            }

            public Builder mergeWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).mergeWifiApInfo(wiFiConfigAPInfo);
                return this;
            }

            public Builder setTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).setTlsCertInfo(tLSCertInfo);
                return this;
            }

            public Builder setWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).setWifiApInfo(wiFiConfigAPInfo);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setTlsCertInfo(Wificommon.TLSCertInfo.Builder builder) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).setTlsCertInfo(builder);
                return this;
            }

            public Builder setWifiApInfo(WiFiConfigAPInfo.Builder builder) {
                copyOnWrite();
                ((GetWiFiConfigAPDetailsResponse) this.instance).setWifiApInfo(builder);
                return this;
            }
        }

        public static Builder newBuilder(GetWiFiConfigAPDetailsResponse getWiFiConfigAPDetailsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getWiFiConfigAPDetailsResponse);
        }

        public static GetWiFiConfigAPDetailsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
            tLSCertInfo.getClass();
            this.tlsCertInfo_ = tLSCertInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
            wiFiConfigAPInfo.getClass();
            this.wifiApInfo_ = wiFiConfigAPInfo;
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(InputStream inputStream) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetWiFiConfigAPDetailsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetailsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyWiFiNetworkConnectionChanges extends GeneratedMessageLite<NotifyWiFiNetworkConnectionChanges, Builder> implements NotifyWiFiNetworkConnectionChangesOrBuilder {
        private static final NotifyWiFiNetworkConnectionChanges DEFAULT_INSTANCE;
        private static volatile Parser<NotifyWiFiNetworkConnectionChanges> PARSER = null;
        public static final int SAVED_NETWORKS_FIELD_NUMBER = 1;
        public static final int TOTAL_COUNT_FIELD_NUMBER = 2;
        private int bitField0_;
        private Internal.ProtobufList<SavedWiFiNetwork> savedNetworks_ = GeneratedMessageLite.emptyProtobufList();
        private int totalCount_;

        static {
            NotifyWiFiNetworkConnectionChanges notifyWiFiNetworkConnectionChanges = new NotifyWiFiNetworkConnectionChanges();
            DEFAULT_INSTANCE = notifyWiFiNetworkConnectionChanges;
            notifyWiFiNetworkConnectionChanges.makeImmutable();
        }

        private NotifyWiFiNetworkConnectionChanges() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSavedNetworks(Iterable<? extends SavedWiFiNetwork> iterable) {
            ensureSavedNetworksIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.savedNetworks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSavedNetworks() {
            this.savedNetworks_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalCount() {
            this.totalCount_ = 0;
        }

        private void ensureSavedNetworksIsMutable() {
            if (this.savedNetworks_.isModifiable()) {
                return;
            }
            this.savedNetworks_ = GeneratedMessageLite.mutableCopy(this.savedNetworks_);
        }

        public static NotifyWiFiNetworkConnectionChanges getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyWiFiNetworkConnectionChanges parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyWiFiNetworkConnectionChanges> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSavedNetworks(int i) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalCount(int i) {
            this.totalCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyWiFiNetworkConnectionChanges();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.savedNetworks_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyWiFiNetworkConnectionChanges notifyWiFiNetworkConnectionChanges = (NotifyWiFiNetworkConnectionChanges) obj2;
                    this.savedNetworks_ = visitor.visitList(this.savedNetworks_, notifyWiFiNetworkConnectionChanges.savedNetworks_);
                    int i = this.totalCount_;
                    boolean z = i != 0;
                    int i2 = notifyWiFiNetworkConnectionChanges.totalCount_;
                    this.totalCount_ = visitor.visitInt(z, i, i2 != 0, i2);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= notifyWiFiNetworkConnectionChanges.bitField0_;
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
                                    if (!this.savedNetworks_.isModifiable()) {
                                        this.savedNetworks_ = GeneratedMessageLite.mutableCopy(this.savedNetworks_);
                                    }
                                    this.savedNetworks_.add((SavedWiFiNetwork) codedInputStream.readMessage(SavedWiFiNetwork.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.totalCount_ = codedInputStream.readUInt32();
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
                        synchronized (NotifyWiFiNetworkConnectionChanges.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
        public SavedWiFiNetwork getSavedNetworks(int i) {
            return this.savedNetworks_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
        public int getSavedNetworksCount() {
            return this.savedNetworks_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
        public List<SavedWiFiNetwork> getSavedNetworksList() {
            return this.savedNetworks_;
        }

        public SavedWiFiNetworkOrBuilder getSavedNetworksOrBuilder(int i) {
            return this.savedNetworks_.get(i);
        }

        public List<? extends SavedWiFiNetworkOrBuilder> getSavedNetworksOrBuilderList() {
            return this.savedNetworks_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.savedNetworks_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.savedNetworks_.get(i3));
            }
            int i4 = this.totalCount_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(2, i4);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
        public int getTotalCount() {
            return this.totalCount_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.savedNetworks_.size(); i++) {
                codedOutputStream.writeMessage(1, this.savedNetworks_.get(i));
            }
            int i2 = this.totalCount_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyWiFiNetworkConnectionChanges, Builder> implements NotifyWiFiNetworkConnectionChangesOrBuilder {
            private Builder() {
                super(NotifyWiFiNetworkConnectionChanges.DEFAULT_INSTANCE);
            }

            public Builder addAllSavedNetworks(Iterable<? extends SavedWiFiNetwork> iterable) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).addAllSavedNetworks(iterable);
                return this;
            }

            public Builder addSavedNetworks(SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).addSavedNetworks(savedWiFiNetwork);
                return this;
            }

            public Builder clearSavedNetworks() {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).clearSavedNetworks();
                return this;
            }

            public Builder clearTotalCount() {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).clearTotalCount();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
            public SavedWiFiNetwork getSavedNetworks(int i) {
                return ((NotifyWiFiNetworkConnectionChanges) this.instance).getSavedNetworks(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
            public int getSavedNetworksCount() {
                return ((NotifyWiFiNetworkConnectionChanges) this.instance).getSavedNetworksCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
            public List<SavedWiFiNetwork> getSavedNetworksList() {
                return Collections.unmodifiableList(((NotifyWiFiNetworkConnectionChanges) this.instance).getSavedNetworksList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.NotifyWiFiNetworkConnectionChangesOrBuilder
            public int getTotalCount() {
                return ((NotifyWiFiNetworkConnectionChanges) this.instance).getTotalCount();
            }

            public Builder removeSavedNetworks(int i) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).removeSavedNetworks(i);
                return this;
            }

            public Builder setSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).setSavedNetworks(i, savedWiFiNetwork);
                return this;
            }

            public Builder setTotalCount(int i) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).setTotalCount(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).addSavedNetworks(i, savedWiFiNetwork);
                return this;
            }

            public Builder setSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).setSavedNetworks(i, builder);
                return this;
            }

            public Builder addSavedNetworks(SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).addSavedNetworks(builder);
                return this;
            }

            public Builder addSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
                copyOnWrite();
                ((NotifyWiFiNetworkConnectionChanges) this.instance).addSavedNetworks(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyWiFiNetworkConnectionChanges notifyWiFiNetworkConnectionChanges) {
            return DEFAULT_INSTANCE.createBuilder(notifyWiFiNetworkConnectionChanges);
        }

        public static NotifyWiFiNetworkConnectionChanges parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(InputStream inputStream) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(i, savedWiFiNetwork);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSavedNetworks(int i, SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.set(i, savedWiFiNetwork);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyWiFiNetworkConnectionChanges parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyWiFiNetworkConnectionChanges) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(SavedWiFiNetwork savedWiFiNetwork) {
            savedWiFiNetwork.getClass();
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(savedWiFiNetwork);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSavedNetworks(int i, SavedWiFiNetwork.Builder builder) {
            ensureSavedNetworksIsMutable();
            this.savedNetworks_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SavedWiFiNetwork extends GeneratedMessageLite<SavedWiFiNetwork, Builder> implements SavedWiFiNetworkOrBuilder {
        public static final int CONNECTION_STATUS_FIELD_NUMBER = 4;
        private static final SavedWiFiNetwork DEFAULT_INSTANCE;
        public static final int LAST_CONNECTION_ATTEMPT_FIELD_NUMBER = 5;
        public static final int NETWORK_ID_FIELD_NUMBER = 1;
        private static volatile Parser<SavedWiFiNetwork> PARSER = null;
        public static final int SECURITY_TYPE_FIELD_NUMBER = 3;
        public static final int SSID_FIELD_NUMBER = 2;
        private boolean connectionStatus_;
        private WiFiLastConnectionAttempt lastConnectionAttempt_;
        private int networkId_;
        private int securityType_;
        private ByteString ssid_ = ByteString.EMPTY;

        static {
            SavedWiFiNetwork savedWiFiNetwork = new SavedWiFiNetwork();
            DEFAULT_INSTANCE = savedWiFiNetwork;
            savedWiFiNetwork.makeImmutable();
        }

        private SavedWiFiNetwork() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionStatus() {
            this.connectionStatus_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastConnectionAttempt() {
            this.lastConnectionAttempt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkId() {
            this.networkId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecurityType() {
            this.securityType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        public static SavedWiFiNetwork getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastConnectionAttempt(WiFiLastConnectionAttempt wiFiLastConnectionAttempt) {
            WiFiLastConnectionAttempt wiFiLastConnectionAttempt2 = this.lastConnectionAttempt_;
            if (wiFiLastConnectionAttempt2 == null || wiFiLastConnectionAttempt2 == WiFiLastConnectionAttempt.getDefaultInstance()) {
                this.lastConnectionAttempt_ = wiFiLastConnectionAttempt;
            } else {
                this.lastConnectionAttempt_ = WiFiLastConnectionAttempt.newBuilder(this.lastConnectionAttempt_).mergeFrom((WiFiLastConnectionAttempt.Builder) wiFiLastConnectionAttempt).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SavedWiFiNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SavedWiFiNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SavedWiFiNetwork> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionStatus(boolean z) {
            this.connectionStatus_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastConnectionAttempt(WiFiLastConnectionAttempt.Builder builder) {
            this.lastConnectionAttempt_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkId(int i) {
            this.networkId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecurityType(SecurityType securityType) {
            securityType.getClass();
            this.securityType_ = securityType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecurityTypeValue(int i) {
            this.securityType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsid(ByteString byteString) {
            byteString.getClass();
            this.ssid_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SavedWiFiNetwork();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SavedWiFiNetwork savedWiFiNetwork = (SavedWiFiNetwork) obj2;
                    int i = this.networkId_;
                    boolean z = i != 0;
                    int i2 = savedWiFiNetwork.networkId_;
                    this.networkId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    ByteString byteString = this.ssid_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = savedWiFiNetwork.ssid_;
                    this.ssid_ = visitor.visitByteString(z2, byteString, byteString3 != byteString2, byteString3);
                    int i3 = this.securityType_;
                    boolean z3 = i3 != 0;
                    int i4 = savedWiFiNetwork.securityType_;
                    this.securityType_ = visitor.visitInt(z3, i3, i4 != 0, i4);
                    boolean z4 = this.connectionStatus_;
                    boolean z5 = savedWiFiNetwork.connectionStatus_;
                    this.connectionStatus_ = visitor.visitBoolean(z4, z4, z5, z5);
                    this.lastConnectionAttempt_ = (WiFiLastConnectionAttempt) visitor.visitMessage(this.lastConnectionAttempt_, savedWiFiNetwork.lastConnectionAttempt_);
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
                                    this.networkId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    this.ssid_ = codedInputStream.readBytes();
                                } else if (readTag == 24) {
                                    this.securityType_ = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    this.connectionStatus_ = codedInputStream.readBool();
                                } else if (readTag == 42) {
                                    WiFiLastConnectionAttempt wiFiLastConnectionAttempt = this.lastConnectionAttempt_;
                                    WiFiLastConnectionAttempt.Builder builder = wiFiLastConnectionAttempt != null ? wiFiLastConnectionAttempt.toBuilder() : null;
                                    WiFiLastConnectionAttempt wiFiLastConnectionAttempt2 = (WiFiLastConnectionAttempt) codedInputStream.readMessage(WiFiLastConnectionAttempt.parser(), extensionRegistryLite);
                                    this.lastConnectionAttempt_ = wiFiLastConnectionAttempt2;
                                    if (builder != null) {
                                        builder.mergeFrom((WiFiLastConnectionAttempt.Builder) wiFiLastConnectionAttempt2);
                                        this.lastConnectionAttempt_ = builder.buildPartial();
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
                        synchronized (SavedWiFiNetwork.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public boolean getConnectionStatus() {
            return this.connectionStatus_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public WiFiLastConnectionAttempt getLastConnectionAttempt() {
            WiFiLastConnectionAttempt wiFiLastConnectionAttempt = this.lastConnectionAttempt_;
            return wiFiLastConnectionAttempt == null ? WiFiLastConnectionAttempt.getDefaultInstance() : wiFiLastConnectionAttempt;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public int getNetworkId() {
            return this.networkId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public SecurityType getSecurityType() {
            SecurityType forNumber = SecurityType.forNumber(this.securityType_);
            return forNumber == null ? SecurityType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public int getSecurityTypeValue() {
            return this.securityType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.networkId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!this.ssid_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeBytesSize(2, this.ssid_);
            }
            if (this.securityType_ != SecurityType.SECURITY_UNKNOWN.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(3, this.securityType_);
            }
            boolean z = this.connectionStatus_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(4, z);
            }
            if (this.lastConnectionAttempt_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(5, getLastConnectionAttempt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public ByteString getSsid() {
            return this.ssid_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
        public boolean hasLastConnectionAttempt() {
            return this.lastConnectionAttempt_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.networkId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!this.ssid_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.ssid_);
            }
            if (this.securityType_ != SecurityType.SECURITY_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.securityType_);
            }
            boolean z = this.connectionStatus_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            if (this.lastConnectionAttempt_ != null) {
                codedOutputStream.writeMessage(5, getLastConnectionAttempt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SavedWiFiNetwork, Builder> implements SavedWiFiNetworkOrBuilder {
            private Builder() {
                super(SavedWiFiNetwork.DEFAULT_INSTANCE);
            }

            public Builder clearConnectionStatus() {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).clearConnectionStatus();
                return this;
            }

            public Builder clearLastConnectionAttempt() {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).clearLastConnectionAttempt();
                return this;
            }

            public Builder clearNetworkId() {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).clearNetworkId();
                return this;
            }

            public Builder clearSecurityType() {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).clearSecurityType();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).clearSsid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public boolean getConnectionStatus() {
                return ((SavedWiFiNetwork) this.instance).getConnectionStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public WiFiLastConnectionAttempt getLastConnectionAttempt() {
                return ((SavedWiFiNetwork) this.instance).getLastConnectionAttempt();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public int getNetworkId() {
                return ((SavedWiFiNetwork) this.instance).getNetworkId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public SecurityType getSecurityType() {
                return ((SavedWiFiNetwork) this.instance).getSecurityType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public int getSecurityTypeValue() {
                return ((SavedWiFiNetwork) this.instance).getSecurityTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public ByteString getSsid() {
                return ((SavedWiFiNetwork) this.instance).getSsid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.SavedWiFiNetworkOrBuilder
            public boolean hasLastConnectionAttempt() {
                return ((SavedWiFiNetwork) this.instance).hasLastConnectionAttempt();
            }

            public Builder mergeLastConnectionAttempt(WiFiLastConnectionAttempt wiFiLastConnectionAttempt) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).mergeLastConnectionAttempt(wiFiLastConnectionAttempt);
                return this;
            }

            public Builder setConnectionStatus(boolean z) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setConnectionStatus(z);
                return this;
            }

            public Builder setLastConnectionAttempt(WiFiLastConnectionAttempt wiFiLastConnectionAttempt) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setLastConnectionAttempt(wiFiLastConnectionAttempt);
                return this;
            }

            public Builder setNetworkId(int i) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setNetworkId(i);
                return this;
            }

            public Builder setSecurityType(SecurityType securityType) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setSecurityType(securityType);
                return this;
            }

            public Builder setSecurityTypeValue(int i) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setSecurityTypeValue(i);
                return this;
            }

            public Builder setSsid(ByteString byteString) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setSsid(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLastConnectionAttempt(WiFiLastConnectionAttempt.Builder builder) {
                copyOnWrite();
                ((SavedWiFiNetwork) this.instance).setLastConnectionAttempt(builder);
                return this;
            }
        }

        public static Builder newBuilder(SavedWiFiNetwork savedWiFiNetwork) {
            return DEFAULT_INSTANCE.createBuilder(savedWiFiNetwork);
        }

        public static SavedWiFiNetwork parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SavedWiFiNetwork parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastConnectionAttempt(WiFiLastConnectionAttempt wiFiLastConnectionAttempt) {
            wiFiLastConnectionAttempt.getClass();
            this.lastConnectionAttempt_ = wiFiLastConnectionAttempt;
        }

        public static SavedWiFiNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SavedWiFiNetwork parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SavedWiFiNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SavedWiFiNetwork parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SavedWiFiNetwork parseFrom(InputStream inputStream) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SavedWiFiNetwork parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SavedWiFiNetwork parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SavedWiFiNetwork parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SavedWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartWiFiConfigAP extends GeneratedMessageLite<StartWiFiConfigAP, Builder> implements StartWiFiConfigAPOrBuilder {
        private static final StartWiFiConfigAP DEFAULT_INSTANCE;
        private static volatile Parser<StartWiFiConfigAP> PARSER = null;
        public static final int SETTING_FIELD_NUMBER = 1;
        private WiFiConfigAPSetting setting_;

        static {
            StartWiFiConfigAP startWiFiConfigAP = new StartWiFiConfigAP();
            DEFAULT_INSTANCE = startWiFiConfigAP;
            startWiFiConfigAP.makeImmutable();
        }

        private StartWiFiConfigAP() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetting() {
            this.setting_ = null;
        }

        public static StartWiFiConfigAP getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSetting(WiFiConfigAPSetting wiFiConfigAPSetting) {
            WiFiConfigAPSetting wiFiConfigAPSetting2 = this.setting_;
            if (wiFiConfigAPSetting2 == null || wiFiConfigAPSetting2 == WiFiConfigAPSetting.getDefaultInstance()) {
                this.setting_ = wiFiConfigAPSetting;
            } else {
                this.setting_ = WiFiConfigAPSetting.newBuilder(this.setting_).mergeFrom((WiFiConfigAPSetting.Builder) wiFiConfigAPSetting).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartWiFiConfigAP parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartWiFiConfigAP parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartWiFiConfigAP> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetting(WiFiConfigAPSetting.Builder builder) {
            this.setting_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartWiFiConfigAP();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.setting_ = (WiFiConfigAPSetting) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.setting_, ((StartWiFiConfigAP) obj2).setting_);
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
                                    WiFiConfigAPSetting wiFiConfigAPSetting = this.setting_;
                                    WiFiConfigAPSetting.Builder builder = wiFiConfigAPSetting != null ? wiFiConfigAPSetting.toBuilder() : null;
                                    WiFiConfigAPSetting wiFiConfigAPSetting2 = (WiFiConfigAPSetting) codedInputStream.readMessage(WiFiConfigAPSetting.parser(), extensionRegistryLite);
                                    this.setting_ = wiFiConfigAPSetting2;
                                    if (builder != null) {
                                        builder.mergeFrom((WiFiConfigAPSetting.Builder) wiFiConfigAPSetting2);
                                        this.setting_ = builder.buildPartial();
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
                        synchronized (StartWiFiConfigAP.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.setting_ != null ? CodedOutputStream.computeMessageSize(1, getSetting()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPOrBuilder
        public WiFiConfigAPSetting getSetting() {
            WiFiConfigAPSetting wiFiConfigAPSetting = this.setting_;
            return wiFiConfigAPSetting == null ? WiFiConfigAPSetting.getDefaultInstance() : wiFiConfigAPSetting;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPOrBuilder
        public boolean hasSetting() {
            return this.setting_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.setting_ != null) {
                codedOutputStream.writeMessage(1, getSetting());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartWiFiConfigAP, Builder> implements StartWiFiConfigAPOrBuilder {
            private Builder() {
                super(StartWiFiConfigAP.DEFAULT_INSTANCE);
            }

            public Builder clearSetting() {
                copyOnWrite();
                ((StartWiFiConfigAP) this.instance).clearSetting();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPOrBuilder
            public WiFiConfigAPSetting getSetting() {
                return ((StartWiFiConfigAP) this.instance).getSetting();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPOrBuilder
            public boolean hasSetting() {
                return ((StartWiFiConfigAP) this.instance).hasSetting();
            }

            public Builder mergeSetting(WiFiConfigAPSetting wiFiConfigAPSetting) {
                copyOnWrite();
                ((StartWiFiConfigAP) this.instance).mergeSetting(wiFiConfigAPSetting);
                return this;
            }

            public Builder setSetting(WiFiConfigAPSetting wiFiConfigAPSetting) {
                copyOnWrite();
                ((StartWiFiConfigAP) this.instance).setSetting(wiFiConfigAPSetting);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setSetting(WiFiConfigAPSetting.Builder builder) {
                copyOnWrite();
                ((StartWiFiConfigAP) this.instance).setSetting(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartWiFiConfigAP startWiFiConfigAP) {
            return DEFAULT_INSTANCE.createBuilder(startWiFiConfigAP);
        }

        public static StartWiFiConfigAP parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartWiFiConfigAP parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetting(WiFiConfigAPSetting wiFiConfigAPSetting) {
            wiFiConfigAPSetting.getClass();
            this.setting_ = wiFiConfigAPSetting;
        }

        public static StartWiFiConfigAP parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartWiFiConfigAP parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartWiFiConfigAP parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartWiFiConfigAP parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartWiFiConfigAP parseFrom(InputStream inputStream) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartWiFiConfigAP parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartWiFiConfigAP parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartWiFiConfigAP parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartWiFiConfigAPResponse extends GeneratedMessageLite<StartWiFiConfigAPResponse, Builder> implements StartWiFiConfigAPResponseOrBuilder {
        private static final StartWiFiConfigAPResponse DEFAULT_INSTANCE;
        private static volatile Parser<StartWiFiConfigAPResponse> PARSER = null;
        public static final int TLS_CERT_INFO_FIELD_NUMBER = 2;
        public static final int WIFI_AP_INFO_FIELD_NUMBER = 1;
        private Wificommon.TLSCertInfo tlsCertInfo_;
        private WiFiConfigAPInfo wifiApInfo_;

        static {
            StartWiFiConfigAPResponse startWiFiConfigAPResponse = new StartWiFiConfigAPResponse();
            DEFAULT_INSTANCE = startWiFiConfigAPResponse;
            startWiFiConfigAPResponse.makeImmutable();
        }

        private StartWiFiConfigAPResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTlsCertInfo() {
            this.tlsCertInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiApInfo() {
            this.wifiApInfo_ = null;
        }

        public static StartWiFiConfigAPResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
            Wificommon.TLSCertInfo tLSCertInfo2 = this.tlsCertInfo_;
            if (tLSCertInfo2 == null || tLSCertInfo2 == Wificommon.TLSCertInfo.getDefaultInstance()) {
                this.tlsCertInfo_ = tLSCertInfo;
            } else {
                this.tlsCertInfo_ = Wificommon.TLSCertInfo.newBuilder(this.tlsCertInfo_).mergeFrom((Wificommon.TLSCertInfo.Builder) tLSCertInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
            WiFiConfigAPInfo wiFiConfigAPInfo2 = this.wifiApInfo_;
            if (wiFiConfigAPInfo2 == null || wiFiConfigAPInfo2 == WiFiConfigAPInfo.getDefaultInstance()) {
                this.wifiApInfo_ = wiFiConfigAPInfo;
            } else {
                this.wifiApInfo_ = WiFiConfigAPInfo.newBuilder(this.wifiApInfo_).mergeFrom((WiFiConfigAPInfo.Builder) wiFiConfigAPInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartWiFiConfigAPResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartWiFiConfigAPResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartWiFiConfigAPResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTlsCertInfo(Wificommon.TLSCertInfo.Builder builder) {
            this.tlsCertInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiApInfo(WiFiConfigAPInfo.Builder builder) {
            this.wifiApInfo_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartWiFiConfigAPResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartWiFiConfigAPResponse startWiFiConfigAPResponse = (StartWiFiConfigAPResponse) obj2;
                    this.wifiApInfo_ = (WiFiConfigAPInfo) visitor.visitMessage(this.wifiApInfo_, startWiFiConfigAPResponse.wifiApInfo_);
                    this.tlsCertInfo_ = (Wificommon.TLSCertInfo) visitor.visitMessage(this.tlsCertInfo_, startWiFiConfigAPResponse.tlsCertInfo_);
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
                                    WiFiConfigAPInfo wiFiConfigAPInfo = this.wifiApInfo_;
                                    WiFiConfigAPInfo.Builder builder = wiFiConfigAPInfo != null ? wiFiConfigAPInfo.toBuilder() : null;
                                    WiFiConfigAPInfo wiFiConfigAPInfo2 = (WiFiConfigAPInfo) codedInputStream.readMessage(WiFiConfigAPInfo.parser(), extensionRegistryLite);
                                    this.wifiApInfo_ = wiFiConfigAPInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom((WiFiConfigAPInfo.Builder) wiFiConfigAPInfo2);
                                        this.wifiApInfo_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Wificommon.TLSCertInfo tLSCertInfo = this.tlsCertInfo_;
                                    Wificommon.TLSCertInfo.Builder builder2 = tLSCertInfo != null ? tLSCertInfo.toBuilder() : null;
                                    Wificommon.TLSCertInfo tLSCertInfo2 = (Wificommon.TLSCertInfo) codedInputStream.readMessage(Wificommon.TLSCertInfo.parser(), extensionRegistryLite);
                                    this.tlsCertInfo_ = tLSCertInfo2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Wificommon.TLSCertInfo.Builder) tLSCertInfo2);
                                        this.tlsCertInfo_ = builder2.buildPartial();
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
                        synchronized (StartWiFiConfigAPResponse.class) {
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
            int computeMessageSize = this.wifiApInfo_ != null ? CodedOutputStream.computeMessageSize(1, getWifiApInfo()) : 0;
            if (this.tlsCertInfo_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getTlsCertInfo());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
        public Wificommon.TLSCertInfo getTlsCertInfo() {
            Wificommon.TLSCertInfo tLSCertInfo = this.tlsCertInfo_;
            return tLSCertInfo == null ? Wificommon.TLSCertInfo.getDefaultInstance() : tLSCertInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
        public WiFiConfigAPInfo getWifiApInfo() {
            WiFiConfigAPInfo wiFiConfigAPInfo = this.wifiApInfo_;
            return wiFiConfigAPInfo == null ? WiFiConfigAPInfo.getDefaultInstance() : wiFiConfigAPInfo;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
        public boolean hasTlsCertInfo() {
            return this.tlsCertInfo_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
        public boolean hasWifiApInfo() {
            return this.wifiApInfo_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.wifiApInfo_ != null) {
                codedOutputStream.writeMessage(1, getWifiApInfo());
            }
            if (this.tlsCertInfo_ != null) {
                codedOutputStream.writeMessage(2, getTlsCertInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartWiFiConfigAPResponse, Builder> implements StartWiFiConfigAPResponseOrBuilder {
            private Builder() {
                super(StartWiFiConfigAPResponse.DEFAULT_INSTANCE);
            }

            public Builder clearTlsCertInfo() {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).clearTlsCertInfo();
                return this;
            }

            public Builder clearWifiApInfo() {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).clearWifiApInfo();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
            public Wificommon.TLSCertInfo getTlsCertInfo() {
                return ((StartWiFiConfigAPResponse) this.instance).getTlsCertInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
            public WiFiConfigAPInfo getWifiApInfo() {
                return ((StartWiFiConfigAPResponse) this.instance).getWifiApInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
            public boolean hasTlsCertInfo() {
                return ((StartWiFiConfigAPResponse) this.instance).hasTlsCertInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.StartWiFiConfigAPResponseOrBuilder
            public boolean hasWifiApInfo() {
                return ((StartWiFiConfigAPResponse) this.instance).hasWifiApInfo();
            }

            public Builder mergeTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).mergeTlsCertInfo(tLSCertInfo);
                return this;
            }

            public Builder mergeWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).mergeWifiApInfo(wiFiConfigAPInfo);
                return this;
            }

            public Builder setTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).setTlsCertInfo(tLSCertInfo);
                return this;
            }

            public Builder setWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).setWifiApInfo(wiFiConfigAPInfo);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setTlsCertInfo(Wificommon.TLSCertInfo.Builder builder) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).setTlsCertInfo(builder);
                return this;
            }

            public Builder setWifiApInfo(WiFiConfigAPInfo.Builder builder) {
                copyOnWrite();
                ((StartWiFiConfigAPResponse) this.instance).setWifiApInfo(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartWiFiConfigAPResponse startWiFiConfigAPResponse) {
            return DEFAULT_INSTANCE.createBuilder(startWiFiConfigAPResponse);
        }

        public static StartWiFiConfigAPResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartWiFiConfigAPResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTlsCertInfo(Wificommon.TLSCertInfo tLSCertInfo) {
            tLSCertInfo.getClass();
            this.tlsCertInfo_ = tLSCertInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiApInfo(WiFiConfigAPInfo wiFiConfigAPInfo) {
            wiFiConfigAPInfo.getClass();
            this.wifiApInfo_ = wiFiConfigAPInfo;
        }

        public static StartWiFiConfigAPResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartWiFiConfigAPResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartWiFiConfigAPResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartWiFiConfigAPResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartWiFiConfigAPResponse parseFrom(InputStream inputStream) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartWiFiConfigAPResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartWiFiConfigAPResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartWiFiConfigAPResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartWiFiConfigAPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ForgetWiFiNetwork extends GeneratedMessageLite<ForgetWiFiNetwork, Builder> implements ForgetWiFiNetworkOrBuilder {
        private static final ForgetWiFiNetwork DEFAULT_INSTANCE;
        public static final int NETWORK_ID_FIELD_NUMBER = 1;
        private static volatile Parser<ForgetWiFiNetwork> PARSER = null;
        public static final int SSID_FIELD_NUMBER = 2;
        private int networkId_;
        private ByteString ssid_ = ByteString.EMPTY;

        static {
            ForgetWiFiNetwork forgetWiFiNetwork = new ForgetWiFiNetwork();
            DEFAULT_INSTANCE = forgetWiFiNetwork;
            forgetWiFiNetwork.makeImmutable();
        }

        private ForgetWiFiNetwork() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkId() {
            this.networkId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        public static ForgetWiFiNetwork getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ForgetWiFiNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ForgetWiFiNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ForgetWiFiNetwork> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkId(int i) {
            this.networkId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsid(ByteString byteString) {
            byteString.getClass();
            this.ssid_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ForgetWiFiNetwork();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ForgetWiFiNetwork forgetWiFiNetwork = (ForgetWiFiNetwork) obj2;
                    int i = this.networkId_;
                    boolean z = i != 0;
                    int i2 = forgetWiFiNetwork.networkId_;
                    this.networkId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    ByteString byteString = this.ssid_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = forgetWiFiNetwork.ssid_;
                    this.ssid_ = visitor.visitByteString(z2, byteString, byteString3 != byteString2, byteString3);
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
                                    this.networkId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    this.ssid_ = codedInputStream.readBytes();
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
                        synchronized (ForgetWiFiNetwork.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.ForgetWiFiNetworkOrBuilder
        public int getNetworkId() {
            return this.networkId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.networkId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!this.ssid_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeBytesSize(2, this.ssid_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.ForgetWiFiNetworkOrBuilder
        public ByteString getSsid() {
            return this.ssid_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.networkId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!this.ssid_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.ssid_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ForgetWiFiNetwork, Builder> implements ForgetWiFiNetworkOrBuilder {
            private Builder() {
                super(ForgetWiFiNetwork.DEFAULT_INSTANCE);
            }

            public Builder clearNetworkId() {
                copyOnWrite();
                ((ForgetWiFiNetwork) this.instance).clearNetworkId();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((ForgetWiFiNetwork) this.instance).clearSsid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.ForgetWiFiNetworkOrBuilder
            public int getNetworkId() {
                return ((ForgetWiFiNetwork) this.instance).getNetworkId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.ForgetWiFiNetworkOrBuilder
            public ByteString getSsid() {
                return ((ForgetWiFiNetwork) this.instance).getSsid();
            }

            public Builder setNetworkId(int i) {
                copyOnWrite();
                ((ForgetWiFiNetwork) this.instance).setNetworkId(i);
                return this;
            }

            public Builder setSsid(ByteString byteString) {
                copyOnWrite();
                ((ForgetWiFiNetwork) this.instance).setSsid(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ForgetWiFiNetwork forgetWiFiNetwork) {
            return DEFAULT_INSTANCE.createBuilder(forgetWiFiNetwork);
        }

        public static ForgetWiFiNetwork parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ForgetWiFiNetwork parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ForgetWiFiNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ForgetWiFiNetwork parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ForgetWiFiNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ForgetWiFiNetwork parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ForgetWiFiNetwork parseFrom(InputStream inputStream) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ForgetWiFiNetwork parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ForgetWiFiNetwork parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ForgetWiFiNetwork parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ForgetWiFiNetwork) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetSavedWiFiNetworks extends GeneratedMessageLite<GetSavedWiFiNetworks, Builder> implements GetSavedWiFiNetworksOrBuilder {
        private static final GetSavedWiFiNetworks DEFAULT_INSTANCE;
        private static volatile Parser<GetSavedWiFiNetworks> PARSER;

        static {
            GetSavedWiFiNetworks getSavedWiFiNetworks = new GetSavedWiFiNetworks();
            DEFAULT_INSTANCE = getSavedWiFiNetworks;
            getSavedWiFiNetworks.makeImmutable();
        }

        private GetSavedWiFiNetworks() {
        }

        public static GetSavedWiFiNetworks getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetSavedWiFiNetworks parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetSavedWiFiNetworks parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetSavedWiFiNetworks> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetSavedWiFiNetworks();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !parseUnknownField(readTag, codedInputStream)) {
                                i = 1;
                            }
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
                        synchronized (GetSavedWiFiNetworks.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetSavedWiFiNetworks, Builder> implements GetSavedWiFiNetworksOrBuilder {
            private Builder() {
                super(GetSavedWiFiNetworks.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetSavedWiFiNetworks getSavedWiFiNetworks) {
            return DEFAULT_INSTANCE.createBuilder(getSavedWiFiNetworks);
        }

        public static GetSavedWiFiNetworks parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworks parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworks parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetSavedWiFiNetworks parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworks parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetSavedWiFiNetworks parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworks parseFrom(InputStream inputStream) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetSavedWiFiNetworks parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetSavedWiFiNetworks parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetSavedWiFiNetworks parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetSavedWiFiNetworks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetWiFiConfigAPDetails extends GeneratedMessageLite<GetWiFiConfigAPDetails, Builder> implements GetWiFiConfigAPDetailsOrBuilder {
        private static final GetWiFiConfigAPDetails DEFAULT_INSTANCE;
        private static volatile Parser<GetWiFiConfigAPDetails> PARSER;

        static {
            GetWiFiConfigAPDetails getWiFiConfigAPDetails = new GetWiFiConfigAPDetails();
            DEFAULT_INSTANCE = getWiFiConfigAPDetails;
            getWiFiConfigAPDetails.makeImmutable();
        }

        private GetWiFiConfigAPDetails() {
        }

        public static GetWiFiConfigAPDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetWiFiConfigAPDetails parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWiFiConfigAPDetails parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetWiFiConfigAPDetails> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetWiFiConfigAPDetails();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !parseUnknownField(readTag, codedInputStream)) {
                                i = 1;
                            }
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
                        synchronized (GetWiFiConfigAPDetails.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetWiFiConfigAPDetails, Builder> implements GetWiFiConfigAPDetailsOrBuilder {
            private Builder() {
                super(GetWiFiConfigAPDetails.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetWiFiConfigAPDetails getWiFiConfigAPDetails) {
            return DEFAULT_INSTANCE.createBuilder(getWiFiConfigAPDetails);
        }

        public static GetWiFiConfigAPDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetails parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetWiFiConfigAPDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetails parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetWiFiConfigAPDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetails parseFrom(InputStream inputStream) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWiFiConfigAPDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWiFiConfigAPDetails parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetWiFiConfigAPDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWiFiConfigAPDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopWiFiConfigAP extends GeneratedMessageLite<StopWiFiConfigAP, Builder> implements StopWiFiConfigAPOrBuilder {
        private static final StopWiFiConfigAP DEFAULT_INSTANCE;
        private static volatile Parser<StopWiFiConfigAP> PARSER;

        static {
            StopWiFiConfigAP stopWiFiConfigAP = new StopWiFiConfigAP();
            DEFAULT_INSTANCE = stopWiFiConfigAP;
            stopWiFiConfigAP.makeImmutable();
        }

        private StopWiFiConfigAP() {
        }

        public static StopWiFiConfigAP getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopWiFiConfigAP parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopWiFiConfigAP parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopWiFiConfigAP> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopWiFiConfigAP();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !parseUnknownField(readTag, codedInputStream)) {
                                i = 1;
                            }
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
                        synchronized (StopWiFiConfigAP.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopWiFiConfigAP, Builder> implements StopWiFiConfigAPOrBuilder {
            private Builder() {
                super(StopWiFiConfigAP.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StopWiFiConfigAP stopWiFiConfigAP) {
            return DEFAULT_INSTANCE.createBuilder(stopWiFiConfigAP);
        }

        public static StopWiFiConfigAP parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopWiFiConfigAP parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopWiFiConfigAP parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopWiFiConfigAP parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopWiFiConfigAP parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopWiFiConfigAP parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopWiFiConfigAP parseFrom(InputStream inputStream) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopWiFiConfigAP parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopWiFiConfigAP parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopWiFiConfigAP parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopWiFiConfigAP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WiFiConfigAPInfo extends GeneratedMessageLite<WiFiConfigAPInfo, Builder> implements WiFiConfigAPInfoOrBuilder {
        public static final int ADDITIONAL_INFO_FIELD_NUMBER = 10;
        public static final int BROADCAST_SSID_FIELD_NUMBER = 4;
        public static final int CHANNEL_BANDWIDTH_FIELD_NUMBER = 8;
        public static final int CHANNEL_FREQUENCY_MHZ_FIELD_NUMBER = 7;
        private static final WiFiConfigAPInfo DEFAULT_INSTANCE;
        public static final int HOSTNAME_FIELD_NUMBER = 6;
        public static final int IP_ADDRESS_FIELD_NUMBER = 5;
        private static volatile Parser<WiFiConfigAPInfo> PARSER = null;
        public static final int PASSPHRASE_FIELD_NUMBER = 2;
        public static final int SECURITY_TYPE_FIELD_NUMBER = 3;
        public static final int SSID_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 9;
        private boolean broadcastSsid_;
        private int channelBandwidth_;
        private int channelFrequencyMhz_;
        private int securityType_;
        private int type_;
        private ByteString ssid_ = ByteString.EMPTY;
        private String passphrase_ = "";
        private String ipAddress_ = "";
        private String hostname_ = "";
        private String additionalInfo_ = "";

        static {
            WiFiConfigAPInfo wiFiConfigAPInfo = new WiFiConfigAPInfo();
            DEFAULT_INSTANCE = wiFiConfigAPInfo;
            wiFiConfigAPInfo.makeImmutable();
        }

        private WiFiConfigAPInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalInfo() {
            this.additionalInfo_ = getDefaultInstance().getAdditionalInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastSsid() {
            this.broadcastSsid_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelBandwidth() {
            this.channelBandwidth_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelFrequencyMhz() {
            this.channelFrequencyMhz_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostname() {
            this.hostname_ = getDefaultInstance().getHostname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpAddress() {
            this.ipAddress_ = getDefaultInstance().getIpAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPassphrase() {
            this.passphrase_ = getDefaultInstance().getPassphrase();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecurityType() {
            this.securityType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static WiFiConfigAPInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WiFiConfigAPInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiConfigAPInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WiFiConfigAPInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalInfo(String str) {
            str.getClass();
            this.additionalInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalInfoBytes(ByteString byteString) {
            this.additionalInfo_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastSsid(boolean z) {
            this.broadcastSsid_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelBandwidth(ChannelBandwidth channelBandwidth) {
            channelBandwidth.getClass();
            this.channelBandwidth_ = channelBandwidth.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelBandwidthValue(int i) {
            this.channelBandwidth_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelFrequencyMhz(int i) {
            this.channelFrequencyMhz_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostname(String str) {
            str.getClass();
            this.hostname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostnameBytes(ByteString byteString) {
            this.hostname_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpAddress(String str) {
            str.getClass();
            this.ipAddress_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpAddressBytes(ByteString byteString) {
            this.ipAddress_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassphrase(String str) {
            str.getClass();
            this.passphrase_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassphraseBytes(ByteString byteString) {
            this.passphrase_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecurityType(SecurityType securityType) {
            securityType.getClass();
            this.securityType_ = securityType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecurityTypeValue(int i) {
            this.securityType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsid(ByteString byteString) {
            byteString.getClass();
            this.ssid_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(WiFiConfigAPType wiFiConfigAPType) {
            wiFiConfigAPType.getClass();
            this.type_ = wiFiConfigAPType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WiFiConfigAPInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    WiFiConfigAPInfo wiFiConfigAPInfo = (WiFiConfigAPInfo) obj2;
                    ByteString byteString = this.ssid_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = wiFiConfigAPInfo.ssid_;
                    this.ssid_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
                    this.passphrase_ = visitor.visitString(!this.passphrase_.isEmpty(), this.passphrase_, !wiFiConfigAPInfo.passphrase_.isEmpty(), wiFiConfigAPInfo.passphrase_);
                    int i = this.securityType_;
                    boolean z2 = i != 0;
                    int i2 = wiFiConfigAPInfo.securityType_;
                    this.securityType_ = visitor.visitInt(z2, i, i2 != 0, i2);
                    boolean z3 = this.broadcastSsid_;
                    boolean z4 = wiFiConfigAPInfo.broadcastSsid_;
                    this.broadcastSsid_ = visitor.visitBoolean(z3, z3, z4, z4);
                    this.ipAddress_ = visitor.visitString(!this.ipAddress_.isEmpty(), this.ipAddress_, !wiFiConfigAPInfo.ipAddress_.isEmpty(), wiFiConfigAPInfo.ipAddress_);
                    this.hostname_ = visitor.visitString(!this.hostname_.isEmpty(), this.hostname_, !wiFiConfigAPInfo.hostname_.isEmpty(), wiFiConfigAPInfo.hostname_);
                    int i3 = this.channelFrequencyMhz_;
                    boolean z5 = i3 != 0;
                    int i4 = wiFiConfigAPInfo.channelFrequencyMhz_;
                    this.channelFrequencyMhz_ = visitor.visitInt(z5, i3, i4 != 0, i4);
                    int i5 = this.channelBandwidth_;
                    boolean z6 = i5 != 0;
                    int i6 = wiFiConfigAPInfo.channelBandwidth_;
                    this.channelBandwidth_ = visitor.visitInt(z6, i5, i6 != 0, i6);
                    int i7 = this.type_;
                    boolean z7 = i7 != 0;
                    int i8 = wiFiConfigAPInfo.type_;
                    this.type_ = visitor.visitInt(z7, i7, i8 != 0, i8);
                    this.additionalInfo_ = visitor.visitString(!this.additionalInfo_.isEmpty(), this.additionalInfo_, !wiFiConfigAPInfo.additionalInfo_.isEmpty(), wiFiConfigAPInfo.additionalInfo_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    objArr = 1;
                                case 10:
                                    this.ssid_ = codedInputStream.readBytes();
                                case 18:
                                    this.passphrase_ = codedInputStream.readStringRequireUtf8();
                                case 24:
                                    this.securityType_ = codedInputStream.readEnum();
                                case 32:
                                    this.broadcastSsid_ = codedInputStream.readBool();
                                case 42:
                                    this.ipAddress_ = codedInputStream.readStringRequireUtf8();
                                case 50:
                                    this.hostname_ = codedInputStream.readStringRequireUtf8();
                                case 56:
                                    this.channelFrequencyMhz_ = codedInputStream.readUInt32();
                                case 64:
                                    this.channelBandwidth_ = codedInputStream.readEnum();
                                case 72:
                                    this.type_ = codedInputStream.readEnum();
                                case 82:
                                    this.additionalInfo_ = codedInputStream.readStringRequireUtf8();
                                default:
                                    if (!parseUnknownField(readTag, codedInputStream)) {
                                        objArr = 1;
                                    }
                            }
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
                        synchronized (WiFiConfigAPInfo.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public String getAdditionalInfo() {
            return this.additionalInfo_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ByteString getAdditionalInfoBytes() {
            return ByteString.copyFromUtf8(this.additionalInfo_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public boolean getBroadcastSsid() {
            return this.broadcastSsid_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ChannelBandwidth getChannelBandwidth() {
            ChannelBandwidth forNumber = ChannelBandwidth.forNumber(this.channelBandwidth_);
            return forNumber == null ? ChannelBandwidth.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public int getChannelBandwidthValue() {
            return this.channelBandwidth_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public int getChannelFrequencyMhz() {
            return this.channelFrequencyMhz_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public String getHostname() {
            return this.hostname_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ByteString getHostnameBytes() {
            return ByteString.copyFromUtf8(this.hostname_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public String getIpAddress() {
            return this.ipAddress_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ByteString getIpAddressBytes() {
            return ByteString.copyFromUtf8(this.ipAddress_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public String getPassphrase() {
            return this.passphrase_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ByteString getPassphraseBytes() {
            return ByteString.copyFromUtf8(this.passphrase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public SecurityType getSecurityType() {
            SecurityType forNumber = SecurityType.forNumber(this.securityType_);
            return forNumber == null ? SecurityType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public int getSecurityTypeValue() {
            return this.securityType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeBytesSize = !this.ssid_.isEmpty() ? CodedOutputStream.computeBytesSize(1, this.ssid_) : 0;
            if (!this.passphrase_.isEmpty()) {
                computeBytesSize += CodedOutputStream.computeStringSize(2, getPassphrase());
            }
            if (this.securityType_ != SecurityType.SECURITY_UNKNOWN.getNumber()) {
                computeBytesSize += CodedOutputStream.computeEnumSize(3, this.securityType_);
            }
            boolean z = this.broadcastSsid_;
            if (z) {
                computeBytesSize += CodedOutputStream.computeBoolSize(4, z);
            }
            if (!this.ipAddress_.isEmpty()) {
                computeBytesSize += CodedOutputStream.computeStringSize(5, getIpAddress());
            }
            if (!this.hostname_.isEmpty()) {
                computeBytesSize += CodedOutputStream.computeStringSize(6, getHostname());
            }
            int i2 = this.channelFrequencyMhz_;
            if (i2 != 0) {
                computeBytesSize += CodedOutputStream.computeUInt32Size(7, i2);
            }
            if (this.channelBandwidth_ != ChannelBandwidth.BANDWIDTH_UNKNOWN.getNumber()) {
                computeBytesSize += CodedOutputStream.computeEnumSize(8, this.channelBandwidth_);
            }
            if (this.type_ != WiFiConfigAPType.WIFI_AP.getNumber()) {
                computeBytesSize += CodedOutputStream.computeEnumSize(9, this.type_);
            }
            if (!this.additionalInfo_.isEmpty()) {
                computeBytesSize += CodedOutputStream.computeStringSize(10, getAdditionalInfo());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeBytesSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public ByteString getSsid() {
            return this.ssid_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public WiFiConfigAPType getType() {
            WiFiConfigAPType forNumber = WiFiConfigAPType.forNumber(this.type_);
            return forNumber == null ? WiFiConfigAPType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.ssid_.isEmpty()) {
                codedOutputStream.writeBytes(1, this.ssid_);
            }
            if (!this.passphrase_.isEmpty()) {
                codedOutputStream.writeString(2, getPassphrase());
            }
            if (this.securityType_ != SecurityType.SECURITY_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.securityType_);
            }
            boolean z = this.broadcastSsid_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            if (!this.ipAddress_.isEmpty()) {
                codedOutputStream.writeString(5, getIpAddress());
            }
            if (!this.hostname_.isEmpty()) {
                codedOutputStream.writeString(6, getHostname());
            }
            int i = this.channelFrequencyMhz_;
            if (i != 0) {
                codedOutputStream.writeUInt32(7, i);
            }
            if (this.channelBandwidth_ != ChannelBandwidth.BANDWIDTH_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(8, this.channelBandwidth_);
            }
            if (this.type_ != WiFiConfigAPType.WIFI_AP.getNumber()) {
                codedOutputStream.writeEnum(9, this.type_);
            }
            if (!this.additionalInfo_.isEmpty()) {
                codedOutputStream.writeString(10, getAdditionalInfo());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<WiFiConfigAPInfo, Builder> implements WiFiConfigAPInfoOrBuilder {
            private Builder() {
                super(WiFiConfigAPInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAdditionalInfo() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearAdditionalInfo();
                return this;
            }

            public Builder clearBroadcastSsid() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearBroadcastSsid();
                return this;
            }

            public Builder clearChannelBandwidth() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearChannelBandwidth();
                return this;
            }

            public Builder clearChannelFrequencyMhz() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearChannelFrequencyMhz();
                return this;
            }

            public Builder clearHostname() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearHostname();
                return this;
            }

            public Builder clearIpAddress() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearIpAddress();
                return this;
            }

            public Builder clearPassphrase() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearPassphrase();
                return this;
            }

            public Builder clearSecurityType() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearSecurityType();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearSsid();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public String getAdditionalInfo() {
                return ((WiFiConfigAPInfo) this.instance).getAdditionalInfo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ByteString getAdditionalInfoBytes() {
                return ((WiFiConfigAPInfo) this.instance).getAdditionalInfoBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public boolean getBroadcastSsid() {
                return ((WiFiConfigAPInfo) this.instance).getBroadcastSsid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ChannelBandwidth getChannelBandwidth() {
                return ((WiFiConfigAPInfo) this.instance).getChannelBandwidth();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public int getChannelBandwidthValue() {
                return ((WiFiConfigAPInfo) this.instance).getChannelBandwidthValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public int getChannelFrequencyMhz() {
                return ((WiFiConfigAPInfo) this.instance).getChannelFrequencyMhz();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public String getHostname() {
                return ((WiFiConfigAPInfo) this.instance).getHostname();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ByteString getHostnameBytes() {
                return ((WiFiConfigAPInfo) this.instance).getHostnameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public String getIpAddress() {
                return ((WiFiConfigAPInfo) this.instance).getIpAddress();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ByteString getIpAddressBytes() {
                return ((WiFiConfigAPInfo) this.instance).getIpAddressBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public String getPassphrase() {
                return ((WiFiConfigAPInfo) this.instance).getPassphrase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ByteString getPassphraseBytes() {
                return ((WiFiConfigAPInfo) this.instance).getPassphraseBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public SecurityType getSecurityType() {
                return ((WiFiConfigAPInfo) this.instance).getSecurityType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public int getSecurityTypeValue() {
                return ((WiFiConfigAPInfo) this.instance).getSecurityTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public ByteString getSsid() {
                return ((WiFiConfigAPInfo) this.instance).getSsid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public WiFiConfigAPType getType() {
                return ((WiFiConfigAPInfo) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPInfoOrBuilder
            public int getTypeValue() {
                return ((WiFiConfigAPInfo) this.instance).getTypeValue();
            }

            public Builder setAdditionalInfo(String str) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setAdditionalInfo(str);
                return this;
            }

            public Builder setAdditionalInfoBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setAdditionalInfoBytes(byteString);
                return this;
            }

            public Builder setBroadcastSsid(boolean z) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setBroadcastSsid(z);
                return this;
            }

            public Builder setChannelBandwidth(ChannelBandwidth channelBandwidth) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setChannelBandwidth(channelBandwidth);
                return this;
            }

            public Builder setChannelBandwidthValue(int i) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setChannelBandwidthValue(i);
                return this;
            }

            public Builder setChannelFrequencyMhz(int i) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setChannelFrequencyMhz(i);
                return this;
            }

            public Builder setHostname(String str) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setHostname(str);
                return this;
            }

            public Builder setHostnameBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setHostnameBytes(byteString);
                return this;
            }

            public Builder setIpAddress(String str) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setIpAddress(str);
                return this;
            }

            public Builder setIpAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setIpAddressBytes(byteString);
                return this;
            }

            public Builder setPassphrase(String str) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setPassphrase(str);
                return this;
            }

            public Builder setPassphraseBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setPassphraseBytes(byteString);
                return this;
            }

            public Builder setSecurityType(SecurityType securityType) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setSecurityType(securityType);
                return this;
            }

            public Builder setSecurityTypeValue(int i) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setSecurityTypeValue(i);
                return this;
            }

            public Builder setSsid(ByteString byteString) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setSsid(byteString);
                return this;
            }

            public Builder setType(WiFiConfigAPType wiFiConfigAPType) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setType(wiFiConfigAPType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((WiFiConfigAPInfo) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(WiFiConfigAPInfo wiFiConfigAPInfo) {
            return DEFAULT_INSTANCE.createBuilder(wiFiConfigAPInfo);
        }

        public static WiFiConfigAPInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiConfigAPInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WiFiConfigAPInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WiFiConfigAPInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WiFiConfigAPInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WiFiConfigAPInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WiFiConfigAPInfo parseFrom(InputStream inputStream) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiConfigAPInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiConfigAPInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WiFiConfigAPInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WiFiConfigAPSetting extends GeneratedMessageLite<WiFiConfigAPSetting, Builder> implements WiFiConfigAPSettingOrBuilder {
        public static final int BROADCAST_SSID_FIELD_NUMBER = 2;
        private static final WiFiConfigAPSetting DEFAULT_INSTANCE;
        private static volatile Parser<WiFiConfigAPSetting> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private boolean broadcastSsid_;
        private int type_;

        static {
            WiFiConfigAPSetting wiFiConfigAPSetting = new WiFiConfigAPSetting();
            DEFAULT_INSTANCE = wiFiConfigAPSetting;
            wiFiConfigAPSetting.makeImmutable();
        }

        private WiFiConfigAPSetting() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastSsid() {
            this.broadcastSsid_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static WiFiConfigAPSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WiFiConfigAPSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiConfigAPSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WiFiConfigAPSetting> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastSsid(boolean z) {
            this.broadcastSsid_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(WiFiConfigAPType wiFiConfigAPType) {
            wiFiConfigAPType.getClass();
            this.type_ = wiFiConfigAPType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WiFiConfigAPSetting();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    WiFiConfigAPSetting wiFiConfigAPSetting = (WiFiConfigAPSetting) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = wiFiConfigAPSetting.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
                    boolean z2 = this.broadcastSsid_;
                    boolean z3 = wiFiConfigAPSetting.broadcastSsid_;
                    this.broadcastSsid_ = visitor.visitBoolean(z2, z2, z3, z3);
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
                                    this.type_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.broadcastSsid_ = codedInputStream.readBool();
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
                        synchronized (WiFiConfigAPSetting.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
        public boolean getBroadcastSsid() {
            return this.broadcastSsid_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != WiFiConfigAPType.WIFI_AP.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            boolean z = this.broadcastSsid_;
            if (z) {
                computeEnumSize += CodedOutputStream.computeBoolSize(2, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
        public WiFiConfigAPType getType() {
            WiFiConfigAPType forNumber = WiFiConfigAPType.forNumber(this.type_);
            return forNumber == null ? WiFiConfigAPType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != WiFiConfigAPType.WIFI_AP.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            boolean z = this.broadcastSsid_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<WiFiConfigAPSetting, Builder> implements WiFiConfigAPSettingOrBuilder {
            private Builder() {
                super(WiFiConfigAPSetting.DEFAULT_INSTANCE);
            }

            public Builder clearBroadcastSsid() {
                copyOnWrite();
                ((WiFiConfigAPSetting) this.instance).clearBroadcastSsid();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((WiFiConfigAPSetting) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
            public boolean getBroadcastSsid() {
                return ((WiFiConfigAPSetting) this.instance).getBroadcastSsid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
            public WiFiConfigAPType getType() {
                return ((WiFiConfigAPSetting) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPSettingOrBuilder
            public int getTypeValue() {
                return ((WiFiConfigAPSetting) this.instance).getTypeValue();
            }

            public Builder setBroadcastSsid(boolean z) {
                copyOnWrite();
                ((WiFiConfigAPSetting) this.instance).setBroadcastSsid(z);
                return this;
            }

            public Builder setType(WiFiConfigAPType wiFiConfigAPType) {
                copyOnWrite();
                ((WiFiConfigAPSetting) this.instance).setType(wiFiConfigAPType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((WiFiConfigAPSetting) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(WiFiConfigAPSetting wiFiConfigAPSetting) {
            return DEFAULT_INSTANCE.createBuilder(wiFiConfigAPSetting);
        }

        public static WiFiConfigAPSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiConfigAPSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WiFiConfigAPSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WiFiConfigAPSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WiFiConfigAPSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WiFiConfigAPSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WiFiConfigAPSetting parseFrom(InputStream inputStream) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiConfigAPSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiConfigAPSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WiFiConfigAPSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiConfigAPSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WiFiLastConnectionAttempt extends GeneratedMessageLite<WiFiLastConnectionAttempt, Builder> implements WiFiLastConnectionAttemptOrBuilder {
        public static final int CONNECTION_ATTEMPT_TIMESTAMP_EPOCH_FIELD_NUMBER = 1;
        public static final int CONNECTION_FAILED_REASON_FIELD_NUMBER = 3;
        public static final int CONNECTION_STATUS_FIELD_NUMBER = 2;
        private static final WiFiLastConnectionAttempt DEFAULT_INSTANCE;
        private static volatile Parser<WiFiLastConnectionAttempt> PARSER;
        private String connectionAttemptTimestampEpoch_ = "";
        private String connectionFailedReason_ = "";
        private int connectionStatus_;

        static {
            WiFiLastConnectionAttempt wiFiLastConnectionAttempt = new WiFiLastConnectionAttempt();
            DEFAULT_INSTANCE = wiFiLastConnectionAttempt;
            wiFiLastConnectionAttempt.makeImmutable();
        }

        private WiFiLastConnectionAttempt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionAttemptTimestampEpoch() {
            this.connectionAttemptTimestampEpoch_ = getDefaultInstance().getConnectionAttemptTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionFailedReason() {
            this.connectionFailedReason_ = getDefaultInstance().getConnectionFailedReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionStatus() {
            this.connectionStatus_ = 0;
        }

        public static WiFiLastConnectionAttempt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WiFiLastConnectionAttempt parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiLastConnectionAttempt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WiFiLastConnectionAttempt> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionAttemptTimestampEpoch(String str) {
            str.getClass();
            this.connectionAttemptTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionAttemptTimestampEpochBytes(ByteString byteString) {
            this.connectionAttemptTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionFailedReason(String str) {
            str.getClass();
            this.connectionFailedReason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionFailedReasonBytes(ByteString byteString) {
            this.connectionFailedReason_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionStatus(WiFiLastConnectionStatus wiFiLastConnectionStatus) {
            wiFiLastConnectionStatus.getClass();
            this.connectionStatus_ = wiFiLastConnectionStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionStatusValue(int i) {
            this.connectionStatus_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WiFiLastConnectionAttempt();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    WiFiLastConnectionAttempt wiFiLastConnectionAttempt = (WiFiLastConnectionAttempt) obj2;
                    this.connectionAttemptTimestampEpoch_ = visitor.visitString(!this.connectionAttemptTimestampEpoch_.isEmpty(), this.connectionAttemptTimestampEpoch_, !wiFiLastConnectionAttempt.connectionAttemptTimestampEpoch_.isEmpty(), wiFiLastConnectionAttempt.connectionAttemptTimestampEpoch_);
                    int i = this.connectionStatus_;
                    boolean z = i != 0;
                    int i2 = wiFiLastConnectionAttempt.connectionStatus_;
                    this.connectionStatus_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.connectionFailedReason_ = visitor.visitString(!this.connectionFailedReason_.isEmpty(), this.connectionFailedReason_, !wiFiLastConnectionAttempt.connectionFailedReason_.isEmpty(), wiFiLastConnectionAttempt.connectionFailedReason_);
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
                                    this.connectionAttemptTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.connectionStatus_ = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    this.connectionFailedReason_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (WiFiLastConnectionAttempt.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public String getConnectionAttemptTimestampEpoch() {
            return this.connectionAttemptTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public ByteString getConnectionAttemptTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.connectionAttemptTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public String getConnectionFailedReason() {
            return this.connectionFailedReason_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public ByteString getConnectionFailedReasonBytes() {
            return ByteString.copyFromUtf8(this.connectionFailedReason_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public WiFiLastConnectionStatus getConnectionStatus() {
            WiFiLastConnectionStatus forNumber = WiFiLastConnectionStatus.forNumber(this.connectionStatus_);
            return forNumber == null ? WiFiLastConnectionStatus.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
        public int getConnectionStatusValue() {
            return this.connectionStatus_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.connectionAttemptTimestampEpoch_.isEmpty() ? CodedOutputStream.computeStringSize(1, getConnectionAttemptTimestampEpoch()) : 0;
            if (this.connectionStatus_ != WiFiLastConnectionStatus.WIFI_LAST_CONNECTION_STATUS_UNKNOWN.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.connectionStatus_);
            }
            if (!this.connectionFailedReason_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getConnectionFailedReason());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.connectionAttemptTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(1, getConnectionAttemptTimestampEpoch());
            }
            if (this.connectionStatus_ != WiFiLastConnectionStatus.WIFI_LAST_CONNECTION_STATUS_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.connectionStatus_);
            }
            if (!this.connectionFailedReason_.isEmpty()) {
                codedOutputStream.writeString(3, getConnectionFailedReason());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<WiFiLastConnectionAttempt, Builder> implements WiFiLastConnectionAttemptOrBuilder {
            private Builder() {
                super(WiFiLastConnectionAttempt.DEFAULT_INSTANCE);
            }

            public Builder clearConnectionAttemptTimestampEpoch() {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).clearConnectionAttemptTimestampEpoch();
                return this;
            }

            public Builder clearConnectionFailedReason() {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).clearConnectionFailedReason();
                return this;
            }

            public Builder clearConnectionStatus() {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).clearConnectionStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public String getConnectionAttemptTimestampEpoch() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionAttemptTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public ByteString getConnectionAttemptTimestampEpochBytes() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionAttemptTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public String getConnectionFailedReason() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionFailedReason();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public ByteString getConnectionFailedReasonBytes() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionFailedReasonBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public WiFiLastConnectionStatus getConnectionStatus() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionAttemptOrBuilder
            public int getConnectionStatusValue() {
                return ((WiFiLastConnectionAttempt) this.instance).getConnectionStatusValue();
            }

            public Builder setConnectionAttemptTimestampEpoch(String str) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionAttemptTimestampEpoch(str);
                return this;
            }

            public Builder setConnectionAttemptTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionAttemptTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setConnectionFailedReason(String str) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionFailedReason(str);
                return this;
            }

            public Builder setConnectionFailedReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionFailedReasonBytes(byteString);
                return this;
            }

            public Builder setConnectionStatus(WiFiLastConnectionStatus wiFiLastConnectionStatus) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionStatus(wiFiLastConnectionStatus);
                return this;
            }

            public Builder setConnectionStatusValue(int i) {
                copyOnWrite();
                ((WiFiLastConnectionAttempt) this.instance).setConnectionStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(WiFiLastConnectionAttempt wiFiLastConnectionAttempt) {
            return DEFAULT_INSTANCE.createBuilder(wiFiLastConnectionAttempt);
        }

        public static WiFiLastConnectionAttempt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiLastConnectionAttempt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WiFiLastConnectionAttempt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WiFiLastConnectionAttempt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WiFiLastConnectionAttempt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WiFiLastConnectionAttempt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WiFiLastConnectionAttempt parseFrom(InputStream inputStream) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WiFiLastConnectionAttempt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WiFiLastConnectionAttempt parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WiFiLastConnectionAttempt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WiFiLastConnectionAttempt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ChannelBandwidth implements Internal.EnumLite {
        BANDWIDTH_UNKNOWN(0),
        BANDWIDTH_20MHZ(1),
        BANDWIDTH_40MHZ(2),
        BANDWIDTH_80MHZ(3),
        BANDWIDTH_160MHZ(4),
        BANDWIDTH_320MHZ(5),
        UNRECOGNIZED(-1);

        public static final int BANDWIDTH_160MHZ_VALUE = 4;
        public static final int BANDWIDTH_20MHZ_VALUE = 1;
        public static final int BANDWIDTH_320MHZ_VALUE = 5;
        public static final int BANDWIDTH_40MHZ_VALUE = 2;
        public static final int BANDWIDTH_80MHZ_VALUE = 3;
        public static final int BANDWIDTH_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ChannelBandwidth> internalValueMap = new Internal.EnumLiteMap<ChannelBandwidth>() { // from class: com.amazon.alexa.accessory.protocol.Wificonfig.ChannelBandwidth.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ChannelBandwidth findValueByNumber(int i) {
                return ChannelBandwidth.forNumber(i);
            }
        };
        private final int value;

        ChannelBandwidth(int i) {
            this.value = i;
        }

        public static ChannelBandwidth forNumber(int i) {
            if (i == 0) {
                return BANDWIDTH_UNKNOWN;
            }
            if (i == 1) {
                return BANDWIDTH_20MHZ;
            }
            if (i == 2) {
                return BANDWIDTH_40MHZ;
            }
            if (i == 3) {
                return BANDWIDTH_80MHZ;
            }
            if (i == 4) {
                return BANDWIDTH_160MHZ;
            }
            if (i != 5) {
                return null;
            }
            return BANDWIDTH_320MHZ;
        }

        public static Internal.EnumLiteMap<ChannelBandwidth> internalGetValueMap() {
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
        public static ChannelBandwidth valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SecurityType implements Internal.EnumLite {
        SECURITY_UNKNOWN(0),
        SECURITY_NONE(1),
        SECURITY_WEP(2),
        SECURITY_WPA(3),
        SECURITY_WPA2(4),
        SECURITY_WPA3(5),
        SECURITY_ENTERPRISE(6),
        UNRECOGNIZED(-1);

        public static final int SECURITY_ENTERPRISE_VALUE = 6;
        public static final int SECURITY_NONE_VALUE = 1;
        public static final int SECURITY_UNKNOWN_VALUE = 0;
        public static final int SECURITY_WEP_VALUE = 2;
        public static final int SECURITY_WPA2_VALUE = 4;
        public static final int SECURITY_WPA3_VALUE = 5;
        public static final int SECURITY_WPA_VALUE = 3;
        private static final Internal.EnumLiteMap<SecurityType> internalValueMap = new Internal.EnumLiteMap<SecurityType>() { // from class: com.amazon.alexa.accessory.protocol.Wificonfig.SecurityType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SecurityType findValueByNumber(int i) {
                return SecurityType.forNumber(i);
            }
        };
        private final int value;

        SecurityType(int i) {
            this.value = i;
        }

        public static SecurityType forNumber(int i) {
            switch (i) {
                case 0:
                    return SECURITY_UNKNOWN;
                case 1:
                    return SECURITY_NONE;
                case 2:
                    return SECURITY_WEP;
                case 3:
                    return SECURITY_WPA;
                case 4:
                    return SECURITY_WPA2;
                case 5:
                    return SECURITY_WPA3;
                case 6:
                    return SECURITY_ENTERPRISE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<SecurityType> internalGetValueMap() {
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
        public static SecurityType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WiFiConfigAPType implements Internal.EnumLite {
        WIFI_AP(0),
        WIFI_P2P_GO(1),
        UNRECOGNIZED(-1);

        public static final int WIFI_AP_VALUE = 0;
        public static final int WIFI_P2P_GO_VALUE = 1;
        private static final Internal.EnumLiteMap<WiFiConfigAPType> internalValueMap = new Internal.EnumLiteMap<WiFiConfigAPType>() { // from class: com.amazon.alexa.accessory.protocol.Wificonfig.WiFiConfigAPType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WiFiConfigAPType findValueByNumber(int i) {
                return WiFiConfigAPType.forNumber(i);
            }
        };
        private final int value;

        WiFiConfigAPType(int i) {
            this.value = i;
        }

        public static WiFiConfigAPType forNumber(int i) {
            if (i == 0) {
                return WIFI_AP;
            }
            if (i != 1) {
                return null;
            }
            return WIFI_P2P_GO;
        }

        public static Internal.EnumLiteMap<WiFiConfigAPType> internalGetValueMap() {
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
        public static WiFiConfigAPType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WiFiLastConnectionStatus implements Internal.EnumLite {
        WIFI_LAST_CONNECTION_STATUS_UNKNOWN(0),
        WIFI_LAST_CONNECTION_STATUS_SUCCESS(1),
        WIFI_LAST_CONNECTION_STATUS_ERROR_PASSWORD_INCORRECT(2),
        WIFI_LAST_CONNECTION_STATUS_ERROR_GENERIC(3),
        UNRECOGNIZED(-1);

        public static final int WIFI_LAST_CONNECTION_STATUS_ERROR_GENERIC_VALUE = 3;
        public static final int WIFI_LAST_CONNECTION_STATUS_ERROR_PASSWORD_INCORRECT_VALUE = 2;
        public static final int WIFI_LAST_CONNECTION_STATUS_SUCCESS_VALUE = 1;
        public static final int WIFI_LAST_CONNECTION_STATUS_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<WiFiLastConnectionStatus> internalValueMap = new Internal.EnumLiteMap<WiFiLastConnectionStatus>() { // from class: com.amazon.alexa.accessory.protocol.Wificonfig.WiFiLastConnectionStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WiFiLastConnectionStatus findValueByNumber(int i) {
                return WiFiLastConnectionStatus.forNumber(i);
            }
        };
        private final int value;

        WiFiLastConnectionStatus(int i) {
            this.value = i;
        }

        public static WiFiLastConnectionStatus forNumber(int i) {
            if (i == 0) {
                return WIFI_LAST_CONNECTION_STATUS_UNKNOWN;
            }
            if (i == 1) {
                return WIFI_LAST_CONNECTION_STATUS_SUCCESS;
            }
            if (i == 2) {
                return WIFI_LAST_CONNECTION_STATUS_ERROR_PASSWORD_INCORRECT;
            }
            if (i != 3) {
                return null;
            }
            return WIFI_LAST_CONNECTION_STATUS_ERROR_GENERIC;
        }

        public static Internal.EnumLiteMap<WiFiLastConnectionStatus> internalGetValueMap() {
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
        public static WiFiLastConnectionStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
