package com.amazon.alexa.accessory.protocol;

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
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Wificommon {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Wificommon$1, reason: invalid class name */
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
    public interface TLSCertInfoOrBuilder extends MessageLiteOrBuilder {
        ByteString getFingerprintSha256();
    }

    private Wificommon() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TLSCertInfo extends GeneratedMessageLite<TLSCertInfo, Builder> implements TLSCertInfoOrBuilder {
        private static final TLSCertInfo DEFAULT_INSTANCE;
        public static final int FINGERPRINT_SHA256_FIELD_NUMBER = 1;
        private static volatile Parser<TLSCertInfo> PARSER;
        private ByteString fingerprintSha256_ = ByteString.EMPTY;

        static {
            TLSCertInfo tLSCertInfo = new TLSCertInfo();
            DEFAULT_INSTANCE = tLSCertInfo;
            tLSCertInfo.makeImmutable();
        }

        private TLSCertInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFingerprintSha256() {
            this.fingerprintSha256_ = getDefaultInstance().getFingerprintSha256();
        }

        public static TLSCertInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TLSCertInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TLSCertInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TLSCertInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFingerprintSha256(ByteString byteString) {
            byteString.getClass();
            this.fingerprintSha256_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TLSCertInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    TLSCertInfo tLSCertInfo = (TLSCertInfo) obj2;
                    ByteString byteString = this.fingerprintSha256_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = tLSCertInfo.fingerprintSha256_;
                    this.fingerprintSha256_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
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
                                    this.fingerprintSha256_ = codedInputStream.readBytes();
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
                        synchronized (TLSCertInfo.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Wificommon.TLSCertInfoOrBuilder
        public ByteString getFingerprintSha256() {
            return this.fingerprintSha256_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.fingerprintSha256_.isEmpty() ? CodedOutputStream.computeBytesSize(1, this.fingerprintSha256_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.fingerprintSha256_.isEmpty()) {
                codedOutputStream.writeBytes(1, this.fingerprintSha256_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<TLSCertInfo, Builder> implements TLSCertInfoOrBuilder {
            private Builder() {
                super(TLSCertInfo.DEFAULT_INSTANCE);
            }

            public Builder clearFingerprintSha256() {
                copyOnWrite();
                ((TLSCertInfo) this.instance).clearFingerprintSha256();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Wificommon.TLSCertInfoOrBuilder
            public ByteString getFingerprintSha256() {
                return ((TLSCertInfo) this.instance).getFingerprintSha256();
            }

            public Builder setFingerprintSha256(ByteString byteString) {
                copyOnWrite();
                ((TLSCertInfo) this.instance).setFingerprintSha256(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(TLSCertInfo tLSCertInfo) {
            return DEFAULT_INSTANCE.createBuilder(tLSCertInfo);
        }

        public static TLSCertInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TLSCertInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TLSCertInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TLSCertInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TLSCertInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TLSCertInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TLSCertInfo parseFrom(InputStream inputStream) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TLSCertInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TLSCertInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TLSCertInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TLSCertInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WiFiCredentialType implements Internal.EnumLite {
        WIFI_CREDENTIAL_TYPE_UNSPECIFIED(0),
        WIFI_CREDENTIAL_TYPE_PIN_CODE(1),
        WIFI_CREDENTIAL_TYPE_PASSPHRASE(2),
        WIFI_CREDENTIAL_TYPE_QR_CODE(3),
        WIFI_CREDENTIAL_TYPE_NFC(4),
        WIFI_CREDENTIAL_TYPE_SERVICE_MANAGED(5),
        WIFI_CREDENTIAL_TYPE_RESERVED(6),
        UNRECOGNIZED(-1);

        public static final int WIFI_CREDENTIAL_TYPE_NFC_VALUE = 4;
        public static final int WIFI_CREDENTIAL_TYPE_PASSPHRASE_VALUE = 2;
        public static final int WIFI_CREDENTIAL_TYPE_PIN_CODE_VALUE = 1;
        public static final int WIFI_CREDENTIAL_TYPE_QR_CODE_VALUE = 3;
        public static final int WIFI_CREDENTIAL_TYPE_RESERVED_VALUE = 6;
        public static final int WIFI_CREDENTIAL_TYPE_SERVICE_MANAGED_VALUE = 5;
        public static final int WIFI_CREDENTIAL_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<WiFiCredentialType> internalValueMap = new Internal.EnumLiteMap<WiFiCredentialType>() { // from class: com.amazon.alexa.accessory.protocol.Wificommon.WiFiCredentialType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WiFiCredentialType findValueByNumber(int i) {
                return WiFiCredentialType.forNumber(i);
            }
        };
        private final int value;

        WiFiCredentialType(int i) {
            this.value = i;
        }

        public static WiFiCredentialType forNumber(int i) {
            switch (i) {
                case 0:
                    return WIFI_CREDENTIAL_TYPE_UNSPECIFIED;
                case 1:
                    return WIFI_CREDENTIAL_TYPE_PIN_CODE;
                case 2:
                    return WIFI_CREDENTIAL_TYPE_PASSPHRASE;
                case 3:
                    return WIFI_CREDENTIAL_TYPE_QR_CODE;
                case 4:
                    return WIFI_CREDENTIAL_TYPE_NFC;
                case 5:
                    return WIFI_CREDENTIAL_TYPE_SERVICE_MANAGED;
                case 6:
                    return WIFI_CREDENTIAL_TYPE_RESERVED;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<WiFiCredentialType> internalGetValueMap() {
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
        public static WiFiCredentialType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
