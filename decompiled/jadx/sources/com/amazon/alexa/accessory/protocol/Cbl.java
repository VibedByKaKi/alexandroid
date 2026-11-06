package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
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
public final class Cbl {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Cbl$1, reason: invalid class name */
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
    public interface CblInformationOrBuilder extends MessageLiteOrBuilder {
        int getExpiresInSec();

        String getUserCode();

        ByteString getUserCodeBytes();

        String getVerificationUri();

        ByteString getVerificationUriBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CblLoginStateOrBuilder extends MessageLiteOrBuilder {
        CblLoginState.State getState();

        int getStateValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCblInformationOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCblLoginStateOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyCblLoginStateOrBuilder extends MessageLiteOrBuilder {
        CblLoginState getLoginState();

        boolean hasLoginState();
    }

    private Cbl() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyCblLoginState extends GeneratedMessageLite<NotifyCblLoginState, Builder> implements NotifyCblLoginStateOrBuilder {
        private static final NotifyCblLoginState DEFAULT_INSTANCE;
        public static final int LOGIN_STATE_FIELD_NUMBER = 1;
        private static volatile Parser<NotifyCblLoginState> PARSER;
        private CblLoginState loginState_;

        static {
            NotifyCblLoginState notifyCblLoginState = new NotifyCblLoginState();
            DEFAULT_INSTANCE = notifyCblLoginState;
            notifyCblLoginState.makeImmutable();
        }

        private NotifyCblLoginState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginState() {
            this.loginState_ = null;
        }

        public static NotifyCblLoginState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginState(CblLoginState cblLoginState) {
            CblLoginState cblLoginState2 = this.loginState_;
            if (cblLoginState2 == null || cblLoginState2 == CblLoginState.getDefaultInstance()) {
                this.loginState_ = cblLoginState;
            } else {
                this.loginState_ = CblLoginState.newBuilder(this.loginState_).mergeFrom((CblLoginState.Builder) cblLoginState).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyCblLoginState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCblLoginState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyCblLoginState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginState(CblLoginState.Builder builder) {
            this.loginState_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyCblLoginState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.loginState_ = (CblLoginState) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.loginState_, ((NotifyCblLoginState) obj2).loginState_);
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
                                    CblLoginState cblLoginState = this.loginState_;
                                    CblLoginState.Builder builder = cblLoginState != null ? cblLoginState.toBuilder() : null;
                                    CblLoginState cblLoginState2 = (CblLoginState) codedInputStream.readMessage(CblLoginState.parser(), extensionRegistryLite);
                                    this.loginState_ = cblLoginState2;
                                    if (builder != null) {
                                        builder.mergeFrom((CblLoginState.Builder) cblLoginState2);
                                        this.loginState_ = builder.buildPartial();
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
                        synchronized (NotifyCblLoginState.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cbl.NotifyCblLoginStateOrBuilder
        public CblLoginState getLoginState() {
            CblLoginState cblLoginState = this.loginState_;
            return cblLoginState == null ? CblLoginState.getDefaultInstance() : cblLoginState;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.loginState_ != null ? CodedOutputStream.computeMessageSize(1, getLoginState()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.NotifyCblLoginStateOrBuilder
        public boolean hasLoginState() {
            return this.loginState_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.loginState_ != null) {
                codedOutputStream.writeMessage(1, getLoginState());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyCblLoginState, Builder> implements NotifyCblLoginStateOrBuilder {
            private Builder() {
                super(NotifyCblLoginState.DEFAULT_INSTANCE);
            }

            public Builder clearLoginState() {
                copyOnWrite();
                ((NotifyCblLoginState) this.instance).clearLoginState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.NotifyCblLoginStateOrBuilder
            public CblLoginState getLoginState() {
                return ((NotifyCblLoginState) this.instance).getLoginState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.NotifyCblLoginStateOrBuilder
            public boolean hasLoginState() {
                return ((NotifyCblLoginState) this.instance).hasLoginState();
            }

            public Builder mergeLoginState(CblLoginState cblLoginState) {
                copyOnWrite();
                ((NotifyCblLoginState) this.instance).mergeLoginState(cblLoginState);
                return this;
            }

            public Builder setLoginState(CblLoginState cblLoginState) {
                copyOnWrite();
                ((NotifyCblLoginState) this.instance).setLoginState(cblLoginState);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLoginState(CblLoginState.Builder builder) {
                copyOnWrite();
                ((NotifyCblLoginState) this.instance).setLoginState(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyCblLoginState notifyCblLoginState) {
            return DEFAULT_INSTANCE.createBuilder(notifyCblLoginState);
        }

        public static NotifyCblLoginState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyCblLoginState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginState(CblLoginState cblLoginState) {
            cblLoginState.getClass();
            this.loginState_ = cblLoginState;
        }

        public static NotifyCblLoginState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyCblLoginState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyCblLoginState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyCblLoginState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyCblLoginState parseFrom(InputStream inputStream) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCblLoginState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyCblLoginState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyCblLoginState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CblInformation extends GeneratedMessageLite<CblInformation, Builder> implements CblInformationOrBuilder {
        private static final CblInformation DEFAULT_INSTANCE;
        public static final int EXPIRES_IN_SEC_FIELD_NUMBER = 3;
        private static volatile Parser<CblInformation> PARSER = null;
        public static final int USER_CODE_FIELD_NUMBER = 1;
        public static final int VERIFICATION_URI_FIELD_NUMBER = 2;
        private int expiresInSec_;
        private String userCode_ = "";
        private String verificationUri_ = "";

        static {
            CblInformation cblInformation = new CblInformation();
            DEFAULT_INSTANCE = cblInformation;
            cblInformation.makeImmutable();
        }

        private CblInformation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpiresInSec() {
            this.expiresInSec_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserCode() {
            this.userCode_ = getDefaultInstance().getUserCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerificationUri() {
            this.verificationUri_ = getDefaultInstance().getVerificationUri();
        }

        public static CblInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CblInformation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CblInformation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CblInformation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpiresInSec(int i) {
            this.expiresInSec_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserCode(String str) {
            str.getClass();
            this.userCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserCodeBytes(ByteString byteString) {
            this.userCode_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerificationUri(String str) {
            str.getClass();
            this.verificationUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerificationUriBytes(ByteString byteString) {
            this.verificationUri_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CblInformation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CblInformation cblInformation = (CblInformation) obj2;
                    this.userCode_ = visitor.visitString(!this.userCode_.isEmpty(), this.userCode_, !cblInformation.userCode_.isEmpty(), cblInformation.userCode_);
                    this.verificationUri_ = visitor.visitString(!this.verificationUri_.isEmpty(), this.verificationUri_, !cblInformation.verificationUri_.isEmpty(), cblInformation.verificationUri_);
                    int i = this.expiresInSec_;
                    boolean z = i != 0;
                    int i2 = cblInformation.expiresInSec_;
                    this.expiresInSec_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.userCode_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.verificationUri_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.expiresInSec_ = codedInputStream.readUInt32();
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
                        synchronized (CblInformation.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
        public int getExpiresInSec() {
            return this.expiresInSec_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.userCode_.isEmpty() ? CodedOutputStream.computeStringSize(1, getUserCode()) : 0;
            if (!this.verificationUri_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getVerificationUri());
            }
            int i2 = this.expiresInSec_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(3, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
        public String getUserCode() {
            return this.userCode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
        public ByteString getUserCodeBytes() {
            return ByteString.copyFromUtf8(this.userCode_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
        public String getVerificationUri() {
            return this.verificationUri_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
        public ByteString getVerificationUriBytes() {
            return ByteString.copyFromUtf8(this.verificationUri_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userCode_.isEmpty()) {
                codedOutputStream.writeString(1, getUserCode());
            }
            if (!this.verificationUri_.isEmpty()) {
                codedOutputStream.writeString(2, getVerificationUri());
            }
            int i = this.expiresInSec_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CblInformation, Builder> implements CblInformationOrBuilder {
            private Builder() {
                super(CblInformation.DEFAULT_INSTANCE);
            }

            public Builder clearExpiresInSec() {
                copyOnWrite();
                ((CblInformation) this.instance).clearExpiresInSec();
                return this;
            }

            public Builder clearUserCode() {
                copyOnWrite();
                ((CblInformation) this.instance).clearUserCode();
                return this;
            }

            public Builder clearVerificationUri() {
                copyOnWrite();
                ((CblInformation) this.instance).clearVerificationUri();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
            public int getExpiresInSec() {
                return ((CblInformation) this.instance).getExpiresInSec();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
            public String getUserCode() {
                return ((CblInformation) this.instance).getUserCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
            public ByteString getUserCodeBytes() {
                return ((CblInformation) this.instance).getUserCodeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
            public String getVerificationUri() {
                return ((CblInformation) this.instance).getVerificationUri();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblInformationOrBuilder
            public ByteString getVerificationUriBytes() {
                return ((CblInformation) this.instance).getVerificationUriBytes();
            }

            public Builder setExpiresInSec(int i) {
                copyOnWrite();
                ((CblInformation) this.instance).setExpiresInSec(i);
                return this;
            }

            public Builder setUserCode(String str) {
                copyOnWrite();
                ((CblInformation) this.instance).setUserCode(str);
                return this;
            }

            public Builder setUserCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((CblInformation) this.instance).setUserCodeBytes(byteString);
                return this;
            }

            public Builder setVerificationUri(String str) {
                copyOnWrite();
                ((CblInformation) this.instance).setVerificationUri(str);
                return this;
            }

            public Builder setVerificationUriBytes(ByteString byteString) {
                copyOnWrite();
                ((CblInformation) this.instance).setVerificationUriBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CblInformation cblInformation) {
            return DEFAULT_INSTANCE.createBuilder(cblInformation);
        }

        public static CblInformation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CblInformation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CblInformation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CblInformation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CblInformation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CblInformation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CblInformation parseFrom(InputStream inputStream) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CblInformation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CblInformation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CblInformation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CblLoginState extends GeneratedMessageLite<CblLoginState, Builder> implements CblLoginStateOrBuilder {
        private static final CblLoginState DEFAULT_INSTANCE;
        private static volatile Parser<CblLoginState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private int state_;

        static {
            CblLoginState cblLoginState = new CblLoginState();
            DEFAULT_INSTANCE = cblLoginState;
            cblLoginState.makeImmutable();
        }

        private CblLoginState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static CblLoginState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CblLoginState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CblLoginState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CblLoginState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State state) {
            state.getClass();
            this.state_ = state.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CblLoginState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CblLoginState cblLoginState = (CblLoginState) obj2;
                    int i = this.state_;
                    boolean z = i != 0;
                    int i2 = cblLoginState.state_;
                    this.state_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.state_ = codedInputStream.readEnum();
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
                        synchronized (CblLoginState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.state_ != State.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblLoginStateOrBuilder
        public State getState() {
            State forNumber = State.forNumber(this.state_);
            return forNumber == null ? State.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cbl.CblLoginStateOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.state_ != State.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CblLoginState, Builder> implements CblLoginStateOrBuilder {
            private Builder() {
                super(CblLoginState.DEFAULT_INSTANCE);
            }

            public Builder clearState() {
                copyOnWrite();
                ((CblLoginState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblLoginStateOrBuilder
            public State getState() {
                return ((CblLoginState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cbl.CblLoginStateOrBuilder
            public int getStateValue() {
                return ((CblLoginState) this.instance).getStateValue();
            }

            public Builder setState(State state) {
                copyOnWrite();
                ((CblLoginState) this.instance).setState(state);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((CblLoginState) this.instance).setStateValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum State implements Internal.EnumLite {
            UNKNOWN(0),
            LOGGED_OUT(1),
            LOGGED_IN(2),
            UNRECOGNIZED(-1);

            public static final int LOGGED_IN_VALUE = 2;
            public static final int LOGGED_OUT_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.amazon.alexa.accessory.protocol.Cbl.CblLoginState.State.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i) {
                    return State.forNumber(i);
                }
            };
            private final int value;

            State(int i) {
                this.value = i;
            }

            public static State forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return LOGGED_OUT;
                }
                if (i != 2) {
                    return null;
                }
                return LOGGED_IN;
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
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
            public static State valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CblLoginState cblLoginState) {
            return DEFAULT_INSTANCE.createBuilder(cblLoginState);
        }

        public static CblLoginState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CblLoginState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CblLoginState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CblLoginState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CblLoginState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CblLoginState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CblLoginState parseFrom(InputStream inputStream) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CblLoginState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CblLoginState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CblLoginState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCblInformation extends GeneratedMessageLite<GetCblInformation, Builder> implements GetCblInformationOrBuilder {
        private static final GetCblInformation DEFAULT_INSTANCE;
        private static volatile Parser<GetCblInformation> PARSER;

        static {
            GetCblInformation getCblInformation = new GetCblInformation();
            DEFAULT_INSTANCE = getCblInformation;
            getCblInformation.makeImmutable();
        }

        private GetCblInformation() {
        }

        public static GetCblInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCblInformation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCblInformation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCblInformation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCblInformation();
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
                        synchronized (GetCblInformation.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetCblInformation, Builder> implements GetCblInformationOrBuilder {
            private Builder() {
                super(GetCblInformation.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCblInformation getCblInformation) {
            return DEFAULT_INSTANCE.createBuilder(getCblInformation);
        }

        public static GetCblInformation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCblInformation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCblInformation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCblInformation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCblInformation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCblInformation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCblInformation parseFrom(InputStream inputStream) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCblInformation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCblInformation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCblInformation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCblLoginState extends GeneratedMessageLite<GetCblLoginState, Builder> implements GetCblLoginStateOrBuilder {
        private static final GetCblLoginState DEFAULT_INSTANCE;
        private static volatile Parser<GetCblLoginState> PARSER;

        static {
            GetCblLoginState getCblLoginState = new GetCblLoginState();
            DEFAULT_INSTANCE = getCblLoginState;
            getCblLoginState.makeImmutable();
        }

        private GetCblLoginState() {
        }

        public static GetCblLoginState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCblLoginState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCblLoginState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCblLoginState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCblLoginState();
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
                        synchronized (GetCblLoginState.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetCblLoginState, Builder> implements GetCblLoginStateOrBuilder {
            private Builder() {
                super(GetCblLoginState.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCblLoginState getCblLoginState) {
            return DEFAULT_INSTANCE.createBuilder(getCblLoginState);
        }

        public static GetCblLoginState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCblLoginState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCblLoginState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCblLoginState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCblLoginState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCblLoginState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCblLoginState parseFrom(InputStream inputStream) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCblLoginState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCblLoginState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCblLoginState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCblLoginState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
