package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Aamb {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Aamb$1, reason: invalid class name */
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
    public interface NotifyMobileBridgeStatusOrBuilder extends MessageLiteOrBuilder {
        boolean getRequiresMobileBridge();

        int getVersion();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateMobileDeviceInformationOrBuilder extends MessageLiteOrBuilder {
        String getConsentToken();

        ByteString getConsentTokenBytes();

        String getFriendlyName();

        ByteString getFriendlyNameBytes();
    }

    private Aamb() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyMobileBridgeStatus extends GeneratedMessageLite<NotifyMobileBridgeStatus, Builder> implements NotifyMobileBridgeStatusOrBuilder {
        private static final NotifyMobileBridgeStatus DEFAULT_INSTANCE;
        private static volatile Parser<NotifyMobileBridgeStatus> PARSER = null;
        public static final int REQUIRES_MOBILE_BRIDGE_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 1;
        private boolean requiresMobileBridge_;
        private int version_;

        static {
            NotifyMobileBridgeStatus notifyMobileBridgeStatus = new NotifyMobileBridgeStatus();
            DEFAULT_INSTANCE = notifyMobileBridgeStatus;
            notifyMobileBridgeStatus.makeImmutable();
        }

        private NotifyMobileBridgeStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequiresMobileBridge() {
            this.requiresMobileBridge_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static NotifyMobileBridgeStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyMobileBridgeStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyMobileBridgeStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyMobileBridgeStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequiresMobileBridge(boolean z) {
            this.requiresMobileBridge_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyMobileBridgeStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyMobileBridgeStatus notifyMobileBridgeStatus = (NotifyMobileBridgeStatus) obj2;
                    int i = this.version_;
                    boolean z = i != 0;
                    int i2 = notifyMobileBridgeStatus.version_;
                    this.version_ = visitor.visitInt(z, i, i2 != 0, i2);
                    boolean z2 = this.requiresMobileBridge_;
                    boolean z3 = notifyMobileBridgeStatus.requiresMobileBridge_;
                    this.requiresMobileBridge_ = visitor.visitBoolean(z2, z2, z3, z3);
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
                                    this.version_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.requiresMobileBridge_ = codedInputStream.readBool();
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
                        synchronized (NotifyMobileBridgeStatus.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Aamb.NotifyMobileBridgeStatusOrBuilder
        public boolean getRequiresMobileBridge() {
            return this.requiresMobileBridge_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.version_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            boolean z = this.requiresMobileBridge_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(2, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Aamb.NotifyMobileBridgeStatusOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            boolean z = this.requiresMobileBridge_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyMobileBridgeStatus, Builder> implements NotifyMobileBridgeStatusOrBuilder {
            private Builder() {
                super(NotifyMobileBridgeStatus.DEFAULT_INSTANCE);
            }

            public Builder clearRequiresMobileBridge() {
                copyOnWrite();
                ((NotifyMobileBridgeStatus) this.instance).clearRequiresMobileBridge();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((NotifyMobileBridgeStatus) this.instance).clearVersion();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.NotifyMobileBridgeStatusOrBuilder
            public boolean getRequiresMobileBridge() {
                return ((NotifyMobileBridgeStatus) this.instance).getRequiresMobileBridge();
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.NotifyMobileBridgeStatusOrBuilder
            public int getVersion() {
                return ((NotifyMobileBridgeStatus) this.instance).getVersion();
            }

            public Builder setRequiresMobileBridge(boolean z) {
                copyOnWrite();
                ((NotifyMobileBridgeStatus) this.instance).setRequiresMobileBridge(z);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((NotifyMobileBridgeStatus) this.instance).setVersion(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyMobileBridgeStatus notifyMobileBridgeStatus) {
            return DEFAULT_INSTANCE.createBuilder(notifyMobileBridgeStatus);
        }

        public static NotifyMobileBridgeStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyMobileBridgeStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyMobileBridgeStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyMobileBridgeStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyMobileBridgeStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyMobileBridgeStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyMobileBridgeStatus parseFrom(InputStream inputStream) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyMobileBridgeStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyMobileBridgeStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyMobileBridgeStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyMobileBridgeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UpdateMobileDeviceInformation extends GeneratedMessageLite<UpdateMobileDeviceInformation, Builder> implements UpdateMobileDeviceInformationOrBuilder {
        public static final int CONSENT_TOKEN_FIELD_NUMBER = 2;
        private static final UpdateMobileDeviceInformation DEFAULT_INSTANCE;
        public static final int FRIENDLY_NAME_FIELD_NUMBER = 1;
        private static volatile Parser<UpdateMobileDeviceInformation> PARSER;
        private String friendlyName_ = "";
        private String consentToken_ = "";

        static {
            UpdateMobileDeviceInformation updateMobileDeviceInformation = new UpdateMobileDeviceInformation();
            DEFAULT_INSTANCE = updateMobileDeviceInformation;
            updateMobileDeviceInformation.makeImmutable();
        }

        private UpdateMobileDeviceInformation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentToken() {
            this.consentToken_ = getDefaultInstance().getConsentToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFriendlyName() {
            this.friendlyName_ = getDefaultInstance().getFriendlyName();
        }

        public static UpdateMobileDeviceInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateMobileDeviceInformation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateMobileDeviceInformation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateMobileDeviceInformation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentToken(String str) {
            str.getClass();
            this.consentToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentTokenBytes(ByteString byteString) {
            this.consentToken_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFriendlyName(String str) {
            str.getClass();
            this.friendlyName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFriendlyNameBytes(ByteString byteString) {
            this.friendlyName_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UpdateMobileDeviceInformation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    UpdateMobileDeviceInformation updateMobileDeviceInformation = (UpdateMobileDeviceInformation) obj2;
                    this.friendlyName_ = visitor.visitString(!this.friendlyName_.isEmpty(), this.friendlyName_, !updateMobileDeviceInformation.friendlyName_.isEmpty(), updateMobileDeviceInformation.friendlyName_);
                    this.consentToken_ = visitor.visitString(!this.consentToken_.isEmpty(), this.consentToken_, !updateMobileDeviceInformation.consentToken_.isEmpty(), updateMobileDeviceInformation.consentToken_);
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
                                    this.friendlyName_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.consentToken_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (UpdateMobileDeviceInformation.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
        public String getConsentToken() {
            return this.consentToken_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
        public ByteString getConsentTokenBytes() {
            return ByteString.copyFromUtf8(this.consentToken_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
        public String getFriendlyName() {
            return this.friendlyName_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
        public ByteString getFriendlyNameBytes() {
            return ByteString.copyFromUtf8(this.friendlyName_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.friendlyName_.isEmpty() ? CodedOutputStream.computeStringSize(1, getFriendlyName()) : 0;
            if (!this.consentToken_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getConsentToken());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.friendlyName_.isEmpty()) {
                codedOutputStream.writeString(1, getFriendlyName());
            }
            if (!this.consentToken_.isEmpty()) {
                codedOutputStream.writeString(2, getConsentToken());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UpdateMobileDeviceInformation, Builder> implements UpdateMobileDeviceInformationOrBuilder {
            private Builder() {
                super(UpdateMobileDeviceInformation.DEFAULT_INSTANCE);
            }

            public Builder clearConsentToken() {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).clearConsentToken();
                return this;
            }

            public Builder clearFriendlyName() {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).clearFriendlyName();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
            public String getConsentToken() {
                return ((UpdateMobileDeviceInformation) this.instance).getConsentToken();
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
            public ByteString getConsentTokenBytes() {
                return ((UpdateMobileDeviceInformation) this.instance).getConsentTokenBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
            public String getFriendlyName() {
                return ((UpdateMobileDeviceInformation) this.instance).getFriendlyName();
            }

            @Override // com.amazon.alexa.accessory.protocol.Aamb.UpdateMobileDeviceInformationOrBuilder
            public ByteString getFriendlyNameBytes() {
                return ((UpdateMobileDeviceInformation) this.instance).getFriendlyNameBytes();
            }

            public Builder setConsentToken(String str) {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).setConsentToken(str);
                return this;
            }

            public Builder setConsentTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).setConsentTokenBytes(byteString);
                return this;
            }

            public Builder setFriendlyName(String str) {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).setFriendlyName(str);
                return this;
            }

            public Builder setFriendlyNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UpdateMobileDeviceInformation) this.instance).setFriendlyNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(UpdateMobileDeviceInformation updateMobileDeviceInformation) {
            return DEFAULT_INSTANCE.createBuilder(updateMobileDeviceInformation);
        }

        public static UpdateMobileDeviceInformation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateMobileDeviceInformation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UpdateMobileDeviceInformation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateMobileDeviceInformation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateMobileDeviceInformation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateMobileDeviceInformation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateMobileDeviceInformation parseFrom(InputStream inputStream) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateMobileDeviceInformation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateMobileDeviceInformation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateMobileDeviceInformation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateMobileDeviceInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
