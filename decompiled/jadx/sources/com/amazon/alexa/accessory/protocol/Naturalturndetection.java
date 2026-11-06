package com.amazon.alexa.accessory.protocol;

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
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Naturalturndetection {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Naturalturndetection$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$NaturalTurnDetectionConfiguration$ModeConfigCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$SetNaturalTurnDetectionState$StateParamsCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[SetNaturalTurnDetectionState.StateParamsCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$SetNaturalTurnDetectionState$StateParamsCase = iArr;
            try {
                iArr[SetNaturalTurnDetectionState.StateParamsCase.START_PARAMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$SetNaturalTurnDetectionState$StateParamsCase[SetNaturalTurnDetectionState.StateParamsCase.STATEPARAMS_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NaturalTurnDetectionConfiguration.ModeConfigCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$NaturalTurnDetectionConfiguration$ModeConfigCase = iArr2;
            try {
                iArr2[NaturalTurnDetectionConfiguration.ModeConfigCase.VAD_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$NaturalTurnDetectionConfiguration$ModeConfigCase[NaturalTurnDetectionConfiguration.ModeConfigCase.MODECONFIG_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr3;
            try {
                iArr3[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NaturalTurnDetectionConfigurationOrBuilder extends MessageLiteOrBuilder {
        NaturalTurnDetectionMode getDetectionMode();

        int getDetectionModeValue();

        NaturalTurnDetectionConfiguration.ModeConfigCase getModeConfigCase();

        int getSessionTimeoutSeconds();

        VadConfiguration getVadConfig();

        boolean hasVadConfig();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NaturalTurnDetectionStartParamsOrBuilder extends MessageLiteOrBuilder {
        NaturalTurnDetectionConfiguration getConfiguration();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyNaturalTurnDetectionStateOrBuilder extends MessageLiteOrBuilder {
        NaturalTurnDetectionState getState();

        int getStateValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetNaturalTurnDetectionStateOrBuilder extends MessageLiteOrBuilder {
        NaturalTurnDetectionState getDesiredState();

        int getDesiredStateValue();

        NaturalTurnDetectionStartParams getStartParams();

        SetNaturalTurnDetectionState.StateParamsCase getStateParamsCase();

        boolean hasStartParams();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetNaturalTurnDetectionStateResponseOrBuilder extends MessageLiteOrBuilder {
        NaturalTurnDetectionState getCurrentState();

        int getCurrentStateValue();

        SetNaturalTurnDetectionStateResponse.Status getStatus();

        int getStatusValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VadConfigurationOrBuilder extends MessageLiteOrBuilder {
        boolean getSecondaryVadEnabled();
    }

    private Naturalturndetection() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NaturalTurnDetectionConfiguration extends GeneratedMessageLite<NaturalTurnDetectionConfiguration, Builder> implements NaturalTurnDetectionConfigurationOrBuilder {
        private static final NaturalTurnDetectionConfiguration DEFAULT_INSTANCE;
        public static final int DETECTION_MODE_FIELD_NUMBER = 1;
        private static volatile Parser<NaturalTurnDetectionConfiguration> PARSER = null;
        public static final int SESSION_TIMEOUT_SECONDS_FIELD_NUMBER = 2;
        public static final int VAD_CONFIG_FIELD_NUMBER = 3;
        private int detectionMode_;
        private int modeConfigCase_ = 0;
        private Object modeConfig_;
        private int sessionTimeoutSeconds_;

        static {
            NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration = new NaturalTurnDetectionConfiguration();
            DEFAULT_INSTANCE = naturalTurnDetectionConfiguration;
            naturalTurnDetectionConfiguration.makeImmutable();
        }

        private NaturalTurnDetectionConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetectionMode() {
            this.detectionMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModeConfig() {
            this.modeConfigCase_ = 0;
            this.modeConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionTimeoutSeconds() {
            this.sessionTimeoutSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVadConfig() {
            if (this.modeConfigCase_ == 3) {
                this.modeConfigCase_ = 0;
                this.modeConfig_ = null;
            }
        }

        public static NaturalTurnDetectionConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVadConfig(VadConfiguration vadConfiguration) {
            if (this.modeConfigCase_ != 3 || this.modeConfig_ == VadConfiguration.getDefaultInstance()) {
                this.modeConfig_ = vadConfiguration;
            } else {
                this.modeConfig_ = VadConfiguration.newBuilder((VadConfiguration) this.modeConfig_).mergeFrom((VadConfiguration.Builder) vadConfiguration).buildPartial();
            }
            this.modeConfigCase_ = 3;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NaturalTurnDetectionConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NaturalTurnDetectionConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetectionMode(NaturalTurnDetectionMode naturalTurnDetectionMode) {
            naturalTurnDetectionMode.getClass();
            this.detectionMode_ = naturalTurnDetectionMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetectionModeValue(int i) {
            this.detectionMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionTimeoutSeconds(int i) {
            this.sessionTimeoutSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVadConfig(VadConfiguration.Builder builder) {
            this.modeConfig_ = builder.build();
            this.modeConfigCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NaturalTurnDetectionConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration = (NaturalTurnDetectionConfiguration) obj2;
                    int i2 = this.detectionMode_;
                    boolean z = i2 != 0;
                    int i3 = naturalTurnDetectionConfiguration.detectionMode_;
                    this.detectionMode_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    int i4 = this.sessionTimeoutSeconds_;
                    boolean z2 = i4 != 0;
                    int i5 = naturalTurnDetectionConfiguration.sessionTimeoutSeconds_;
                    this.sessionTimeoutSeconds_ = visitor.visitInt(z2, i4, i5 != 0, i5);
                    int i6 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$NaturalTurnDetectionConfiguration$ModeConfigCase[naturalTurnDetectionConfiguration.getModeConfigCase().ordinal()];
                    if (i6 == 1) {
                        this.modeConfig_ = visitor.visitOneofMessage(this.modeConfigCase_ == 3, this.modeConfig_, naturalTurnDetectionConfiguration.modeConfig_);
                    } else if (i6 == 2) {
                        visitor.visitOneofNotSet(this.modeConfigCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = naturalTurnDetectionConfiguration.modeConfigCase_) != 0) {
                        this.modeConfigCase_ = i;
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
                                if (readTag == 8) {
                                    this.detectionMode_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.sessionTimeoutSeconds_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    VadConfiguration.Builder builder = this.modeConfigCase_ == 3 ? ((VadConfiguration) this.modeConfig_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(VadConfiguration.parser(), extensionRegistryLite);
                                    this.modeConfig_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((VadConfiguration.Builder) readMessage);
                                        this.modeConfig_ = builder.buildPartial();
                                    }
                                    this.modeConfigCase_ = 3;
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
                        synchronized (NaturalTurnDetectionConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public NaturalTurnDetectionMode getDetectionMode() {
            NaturalTurnDetectionMode forNumber = NaturalTurnDetectionMode.forNumber(this.detectionMode_);
            return forNumber == null ? NaturalTurnDetectionMode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public int getDetectionModeValue() {
            return this.detectionMode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public ModeConfigCase getModeConfigCase() {
            return ModeConfigCase.forNumber(this.modeConfigCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.detectionMode_ != NaturalTurnDetectionMode.NTD_MODE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.detectionMode_) : 0;
            int i2 = this.sessionTimeoutSeconds_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            if (this.modeConfigCase_ == 3) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, (VadConfiguration) this.modeConfig_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public int getSessionTimeoutSeconds() {
            return this.sessionTimeoutSeconds_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public VadConfiguration getVadConfig() {
            return this.modeConfigCase_ == 3 ? (VadConfiguration) this.modeConfig_ : VadConfiguration.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
        public boolean hasVadConfig() {
            return this.modeConfigCase_ == 3;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.detectionMode_ != NaturalTurnDetectionMode.NTD_MODE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.detectionMode_);
            }
            int i = this.sessionTimeoutSeconds_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            if (this.modeConfigCase_ == 3) {
                codedOutputStream.writeMessage(3, (VadConfiguration) this.modeConfig_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NaturalTurnDetectionConfiguration, Builder> implements NaturalTurnDetectionConfigurationOrBuilder {
            private Builder() {
                super(NaturalTurnDetectionConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearDetectionMode() {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).clearDetectionMode();
                return this;
            }

            public Builder clearModeConfig() {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).clearModeConfig();
                return this;
            }

            public Builder clearSessionTimeoutSeconds() {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).clearSessionTimeoutSeconds();
                return this;
            }

            public Builder clearVadConfig() {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).clearVadConfig();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public NaturalTurnDetectionMode getDetectionMode() {
                return ((NaturalTurnDetectionConfiguration) this.instance).getDetectionMode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public int getDetectionModeValue() {
                return ((NaturalTurnDetectionConfiguration) this.instance).getDetectionModeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public ModeConfigCase getModeConfigCase() {
                return ((NaturalTurnDetectionConfiguration) this.instance).getModeConfigCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public int getSessionTimeoutSeconds() {
                return ((NaturalTurnDetectionConfiguration) this.instance).getSessionTimeoutSeconds();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public VadConfiguration getVadConfig() {
                return ((NaturalTurnDetectionConfiguration) this.instance).getVadConfig();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionConfigurationOrBuilder
            public boolean hasVadConfig() {
                return ((NaturalTurnDetectionConfiguration) this.instance).hasVadConfig();
            }

            public Builder mergeVadConfig(VadConfiguration vadConfiguration) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).mergeVadConfig(vadConfiguration);
                return this;
            }

            public Builder setDetectionMode(NaturalTurnDetectionMode naturalTurnDetectionMode) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).setDetectionMode(naturalTurnDetectionMode);
                return this;
            }

            public Builder setDetectionModeValue(int i) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).setDetectionModeValue(i);
                return this;
            }

            public Builder setSessionTimeoutSeconds(int i) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).setSessionTimeoutSeconds(i);
                return this;
            }

            public Builder setVadConfig(VadConfiguration vadConfiguration) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).setVadConfig(vadConfiguration);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setVadConfig(VadConfiguration.Builder builder) {
                copyOnWrite();
                ((NaturalTurnDetectionConfiguration) this.instance).setVadConfig(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ModeConfigCase implements Internal.EnumLite {
            VAD_CONFIG(3),
            MODECONFIG_NOT_SET(0);

            private final int value;

            ModeConfigCase(int i) {
                this.value = i;
            }

            public static ModeConfigCase forNumber(int i) {
                if (i == 0) {
                    return MODECONFIG_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return VAD_CONFIG;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ModeConfigCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(naturalTurnDetectionConfiguration);
        }

        public static NaturalTurnDetectionConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVadConfig(VadConfiguration vadConfiguration) {
            vadConfiguration.getClass();
            this.modeConfig_ = vadConfiguration;
            this.modeConfigCase_ = 3;
        }

        public static NaturalTurnDetectionConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NaturalTurnDetectionConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NaturalTurnDetectionStartParams extends GeneratedMessageLite<NaturalTurnDetectionStartParams, Builder> implements NaturalTurnDetectionStartParamsOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 1;
        private static final NaturalTurnDetectionStartParams DEFAULT_INSTANCE;
        private static volatile Parser<NaturalTurnDetectionStartParams> PARSER;
        private NaturalTurnDetectionConfiguration configuration_;

        static {
            NaturalTurnDetectionStartParams naturalTurnDetectionStartParams = new NaturalTurnDetectionStartParams();
            DEFAULT_INSTANCE = naturalTurnDetectionStartParams;
            naturalTurnDetectionStartParams.makeImmutable();
        }

        private NaturalTurnDetectionStartParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        public static NaturalTurnDetectionStartParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration) {
            NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration2 = this.configuration_;
            if (naturalTurnDetectionConfiguration2 == null || naturalTurnDetectionConfiguration2 == NaturalTurnDetectionConfiguration.getDefaultInstance()) {
                this.configuration_ = naturalTurnDetectionConfiguration;
            } else {
                this.configuration_ = NaturalTurnDetectionConfiguration.newBuilder(this.configuration_).mergeFrom((NaturalTurnDetectionConfiguration.Builder) naturalTurnDetectionConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NaturalTurnDetectionStartParams parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NaturalTurnDetectionStartParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NaturalTurnDetectionStartParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(NaturalTurnDetectionConfiguration.Builder builder) {
            this.configuration_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NaturalTurnDetectionStartParams();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.configuration_ = (NaturalTurnDetectionConfiguration) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.configuration_, ((NaturalTurnDetectionStartParams) obj2).configuration_);
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
                                    NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration = this.configuration_;
                                    NaturalTurnDetectionConfiguration.Builder builder = naturalTurnDetectionConfiguration != null ? naturalTurnDetectionConfiguration.toBuilder() : null;
                                    NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration2 = (NaturalTurnDetectionConfiguration) codedInputStream.readMessage(NaturalTurnDetectionConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = naturalTurnDetectionConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((NaturalTurnDetectionConfiguration.Builder) naturalTurnDetectionConfiguration2);
                                        this.configuration_ = builder.buildPartial();
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
                        synchronized (NaturalTurnDetectionStartParams.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionStartParamsOrBuilder
        public NaturalTurnDetectionConfiguration getConfiguration() {
            NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration = this.configuration_;
            return naturalTurnDetectionConfiguration == null ? NaturalTurnDetectionConfiguration.getDefaultInstance() : naturalTurnDetectionConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.configuration_ != null ? CodedOutputStream.computeMessageSize(1, getConfiguration()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionStartParamsOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(1, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NaturalTurnDetectionStartParams, Builder> implements NaturalTurnDetectionStartParamsOrBuilder {
            private Builder() {
                super(NaturalTurnDetectionStartParams.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((NaturalTurnDetectionStartParams) this.instance).clearConfiguration();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionStartParamsOrBuilder
            public NaturalTurnDetectionConfiguration getConfiguration() {
                return ((NaturalTurnDetectionStartParams) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionStartParamsOrBuilder
            public boolean hasConfiguration() {
                return ((NaturalTurnDetectionStartParams) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration) {
                copyOnWrite();
                ((NaturalTurnDetectionStartParams) this.instance).mergeConfiguration(naturalTurnDetectionConfiguration);
                return this;
            }

            public Builder setConfiguration(NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration) {
                copyOnWrite();
                ((NaturalTurnDetectionStartParams) this.instance).setConfiguration(naturalTurnDetectionConfiguration);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(NaturalTurnDetectionConfiguration.Builder builder) {
                copyOnWrite();
                ((NaturalTurnDetectionStartParams) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(NaturalTurnDetectionStartParams naturalTurnDetectionStartParams) {
            return DEFAULT_INSTANCE.createBuilder(naturalTurnDetectionStartParams);
        }

        public static NaturalTurnDetectionStartParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NaturalTurnDetectionStartParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(NaturalTurnDetectionConfiguration naturalTurnDetectionConfiguration) {
            naturalTurnDetectionConfiguration.getClass();
            this.configuration_ = naturalTurnDetectionConfiguration;
        }

        public static NaturalTurnDetectionStartParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NaturalTurnDetectionStartParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NaturalTurnDetectionStartParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NaturalTurnDetectionStartParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NaturalTurnDetectionStartParams parseFrom(InputStream inputStream) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NaturalTurnDetectionStartParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NaturalTurnDetectionStartParams parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NaturalTurnDetectionStartParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NaturalTurnDetectionStartParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetNaturalTurnDetectionState extends GeneratedMessageLite<SetNaturalTurnDetectionState, Builder> implements SetNaturalTurnDetectionStateOrBuilder {
        private static final SetNaturalTurnDetectionState DEFAULT_INSTANCE;
        public static final int DESIRED_STATE_FIELD_NUMBER = 1;
        private static volatile Parser<SetNaturalTurnDetectionState> PARSER = null;
        public static final int START_PARAMS_FIELD_NUMBER = 2;
        private int desiredState_;
        private int stateParamsCase_ = 0;
        private Object stateParams_;

        static {
            SetNaturalTurnDetectionState setNaturalTurnDetectionState = new SetNaturalTurnDetectionState();
            DEFAULT_INSTANCE = setNaturalTurnDetectionState;
            setNaturalTurnDetectionState.makeImmutable();
        }

        private SetNaturalTurnDetectionState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesiredState() {
            this.desiredState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartParams() {
            if (this.stateParamsCase_ == 2) {
                this.stateParamsCase_ = 0;
                this.stateParams_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStateParams() {
            this.stateParamsCase_ = 0;
            this.stateParams_ = null;
        }

        public static SetNaturalTurnDetectionState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartParams(NaturalTurnDetectionStartParams naturalTurnDetectionStartParams) {
            if (this.stateParamsCase_ != 2 || this.stateParams_ == NaturalTurnDetectionStartParams.getDefaultInstance()) {
                this.stateParams_ = naturalTurnDetectionStartParams;
            } else {
                this.stateParams_ = NaturalTurnDetectionStartParams.newBuilder((NaturalTurnDetectionStartParams) this.stateParams_).mergeFrom((NaturalTurnDetectionStartParams.Builder) naturalTurnDetectionStartParams).buildPartial();
            }
            this.stateParamsCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetNaturalTurnDetectionState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetNaturalTurnDetectionState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetNaturalTurnDetectionState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesiredState(NaturalTurnDetectionState naturalTurnDetectionState) {
            naturalTurnDetectionState.getClass();
            this.desiredState_ = naturalTurnDetectionState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesiredStateValue(int i) {
            this.desiredState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartParams(NaturalTurnDetectionStartParams.Builder builder) {
            this.stateParams_ = builder.build();
            this.stateParamsCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetNaturalTurnDetectionState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SetNaturalTurnDetectionState setNaturalTurnDetectionState = (SetNaturalTurnDetectionState) obj2;
                    int i2 = this.desiredState_;
                    boolean z = i2 != 0;
                    int i3 = setNaturalTurnDetectionState.desiredState_;
                    this.desiredState_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    int i4 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Naturalturndetection$SetNaturalTurnDetectionState$StateParamsCase[setNaturalTurnDetectionState.getStateParamsCase().ordinal()];
                    if (i4 == 1) {
                        this.stateParams_ = visitor.visitOneofMessage(this.stateParamsCase_ == 2, this.stateParams_, setNaturalTurnDetectionState.stateParams_);
                    } else if (i4 == 2) {
                        visitor.visitOneofNotSet(this.stateParamsCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = setNaturalTurnDetectionState.stateParamsCase_) != 0) {
                        this.stateParamsCase_ = i;
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
                                if (readTag == 8) {
                                    this.desiredState_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    NaturalTurnDetectionStartParams.Builder builder = this.stateParamsCase_ == 2 ? ((NaturalTurnDetectionStartParams) this.stateParams_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(NaturalTurnDetectionStartParams.parser(), extensionRegistryLite);
                                    this.stateParams_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((NaturalTurnDetectionStartParams.Builder) readMessage);
                                        this.stateParams_ = builder.buildPartial();
                                    }
                                    this.stateParamsCase_ = 2;
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
                        synchronized (SetNaturalTurnDetectionState.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
        public NaturalTurnDetectionState getDesiredState() {
            NaturalTurnDetectionState forNumber = NaturalTurnDetectionState.forNumber(this.desiredState_);
            return forNumber == null ? NaturalTurnDetectionState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
        public int getDesiredStateValue() {
            return this.desiredState_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.desiredState_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.desiredState_) : 0;
            if (this.stateParamsCase_ == 2) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, (NaturalTurnDetectionStartParams) this.stateParams_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
        public NaturalTurnDetectionStartParams getStartParams() {
            return this.stateParamsCase_ == 2 ? (NaturalTurnDetectionStartParams) this.stateParams_ : NaturalTurnDetectionStartParams.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
        public StateParamsCase getStateParamsCase() {
            return StateParamsCase.forNumber(this.stateParamsCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
        public boolean hasStartParams() {
            return this.stateParamsCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.desiredState_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.desiredState_);
            }
            if (this.stateParamsCase_ == 2) {
                codedOutputStream.writeMessage(2, (NaturalTurnDetectionStartParams) this.stateParams_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetNaturalTurnDetectionState, Builder> implements SetNaturalTurnDetectionStateOrBuilder {
            private Builder() {
                super(SetNaturalTurnDetectionState.DEFAULT_INSTANCE);
            }

            public Builder clearDesiredState() {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).clearDesiredState();
                return this;
            }

            public Builder clearStartParams() {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).clearStartParams();
                return this;
            }

            public Builder clearStateParams() {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).clearStateParams();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
            public NaturalTurnDetectionState getDesiredState() {
                return ((SetNaturalTurnDetectionState) this.instance).getDesiredState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
            public int getDesiredStateValue() {
                return ((SetNaturalTurnDetectionState) this.instance).getDesiredStateValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
            public NaturalTurnDetectionStartParams getStartParams() {
                return ((SetNaturalTurnDetectionState) this.instance).getStartParams();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
            public StateParamsCase getStateParamsCase() {
                return ((SetNaturalTurnDetectionState) this.instance).getStateParamsCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateOrBuilder
            public boolean hasStartParams() {
                return ((SetNaturalTurnDetectionState) this.instance).hasStartParams();
            }

            public Builder mergeStartParams(NaturalTurnDetectionStartParams naturalTurnDetectionStartParams) {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).mergeStartParams(naturalTurnDetectionStartParams);
                return this;
            }

            public Builder setDesiredState(NaturalTurnDetectionState naturalTurnDetectionState) {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).setDesiredState(naturalTurnDetectionState);
                return this;
            }

            public Builder setDesiredStateValue(int i) {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).setDesiredStateValue(i);
                return this;
            }

            public Builder setStartParams(NaturalTurnDetectionStartParams naturalTurnDetectionStartParams) {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).setStartParams(naturalTurnDetectionStartParams);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setStartParams(NaturalTurnDetectionStartParams.Builder builder) {
                copyOnWrite();
                ((SetNaturalTurnDetectionState) this.instance).setStartParams(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum StateParamsCase implements Internal.EnumLite {
            START_PARAMS(2),
            STATEPARAMS_NOT_SET(0);

            private final int value;

            StateParamsCase(int i) {
                this.value = i;
            }

            public static StateParamsCase forNumber(int i) {
                if (i == 0) {
                    return STATEPARAMS_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return START_PARAMS;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static StateParamsCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(SetNaturalTurnDetectionState setNaturalTurnDetectionState) {
            return DEFAULT_INSTANCE.createBuilder(setNaturalTurnDetectionState);
        }

        public static SetNaturalTurnDetectionState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartParams(NaturalTurnDetectionStartParams naturalTurnDetectionStartParams) {
            naturalTurnDetectionStartParams.getClass();
            this.stateParams_ = naturalTurnDetectionStartParams;
            this.stateParamsCase_ = 2;
        }

        public static SetNaturalTurnDetectionState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetNaturalTurnDetectionState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionState parseFrom(InputStream inputStream) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetNaturalTurnDetectionState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetNaturalTurnDetectionState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyNaturalTurnDetectionState extends GeneratedMessageLite<NotifyNaturalTurnDetectionState, Builder> implements NotifyNaturalTurnDetectionStateOrBuilder {
        private static final NotifyNaturalTurnDetectionState DEFAULT_INSTANCE;
        private static volatile Parser<NotifyNaturalTurnDetectionState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private int state_;

        static {
            NotifyNaturalTurnDetectionState notifyNaturalTurnDetectionState = new NotifyNaturalTurnDetectionState();
            DEFAULT_INSTANCE = notifyNaturalTurnDetectionState;
            notifyNaturalTurnDetectionState.makeImmutable();
        }

        private NotifyNaturalTurnDetectionState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static NotifyNaturalTurnDetectionState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyNaturalTurnDetectionState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyNaturalTurnDetectionState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(NaturalTurnDetectionState naturalTurnDetectionState) {
            naturalTurnDetectionState.getClass();
            this.state_ = naturalTurnDetectionState.getNumber();
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
                    return new NotifyNaturalTurnDetectionState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyNaturalTurnDetectionState notifyNaturalTurnDetectionState = (NotifyNaturalTurnDetectionState) obj2;
                    int i = this.state_;
                    boolean z = i != 0;
                    int i2 = notifyNaturalTurnDetectionState.state_;
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
                        synchronized (NotifyNaturalTurnDetectionState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.state_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NotifyNaturalTurnDetectionStateOrBuilder
        public NaturalTurnDetectionState getState() {
            NaturalTurnDetectionState forNumber = NaturalTurnDetectionState.forNumber(this.state_);
            return forNumber == null ? NaturalTurnDetectionState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NotifyNaturalTurnDetectionStateOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.state_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyNaturalTurnDetectionState, Builder> implements NotifyNaturalTurnDetectionStateOrBuilder {
            private Builder() {
                super(NotifyNaturalTurnDetectionState.DEFAULT_INSTANCE);
            }

            public Builder clearState() {
                copyOnWrite();
                ((NotifyNaturalTurnDetectionState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NotifyNaturalTurnDetectionStateOrBuilder
            public NaturalTurnDetectionState getState() {
                return ((NotifyNaturalTurnDetectionState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.NotifyNaturalTurnDetectionStateOrBuilder
            public int getStateValue() {
                return ((NotifyNaturalTurnDetectionState) this.instance).getStateValue();
            }

            public Builder setState(NaturalTurnDetectionState naturalTurnDetectionState) {
                copyOnWrite();
                ((NotifyNaturalTurnDetectionState) this.instance).setState(naturalTurnDetectionState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((NotifyNaturalTurnDetectionState) this.instance).setStateValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyNaturalTurnDetectionState notifyNaturalTurnDetectionState) {
            return DEFAULT_INSTANCE.createBuilder(notifyNaturalTurnDetectionState);
        }

        public static NotifyNaturalTurnDetectionState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(InputStream inputStream) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyNaturalTurnDetectionState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyNaturalTurnDetectionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetNaturalTurnDetectionStateResponse extends GeneratedMessageLite<SetNaturalTurnDetectionStateResponse, Builder> implements SetNaturalTurnDetectionStateResponseOrBuilder {
        public static final int CURRENT_STATE_FIELD_NUMBER = 2;
        private static final SetNaturalTurnDetectionStateResponse DEFAULT_INSTANCE;
        private static volatile Parser<SetNaturalTurnDetectionStateResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int currentState_;
        private int status_;

        static {
            SetNaturalTurnDetectionStateResponse setNaturalTurnDetectionStateResponse = new SetNaturalTurnDetectionStateResponse();
            DEFAULT_INSTANCE = setNaturalTurnDetectionStateResponse;
            setNaturalTurnDetectionStateResponse.makeImmutable();
        }

        private SetNaturalTurnDetectionStateResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentState() {
            this.currentState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static SetNaturalTurnDetectionStateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetNaturalTurnDetectionStateResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetNaturalTurnDetectionStateResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentState(NaturalTurnDetectionState naturalTurnDetectionState) {
            naturalTurnDetectionState.getClass();
            this.currentState_ = naturalTurnDetectionState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentStateValue(int i) {
            this.currentState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status status) {
            status.getClass();
            this.status_ = status.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetNaturalTurnDetectionStateResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SetNaturalTurnDetectionStateResponse setNaturalTurnDetectionStateResponse = (SetNaturalTurnDetectionStateResponse) obj2;
                    int i = this.status_;
                    boolean z = i != 0;
                    int i2 = setNaturalTurnDetectionStateResponse.status_;
                    this.status_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.currentState_;
                    boolean z2 = i3 != 0;
                    int i4 = setNaturalTurnDetectionStateResponse.currentState_;
                    this.currentState_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.status_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.currentState_ = codedInputStream.readEnum();
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
                        synchronized (SetNaturalTurnDetectionStateResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
        public NaturalTurnDetectionState getCurrentState() {
            NaturalTurnDetectionState forNumber = NaturalTurnDetectionState.forNumber(this.currentState_);
            return forNumber == null ? NaturalTurnDetectionState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
        public int getCurrentStateValue() {
            return this.currentState_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.status_ != Status.SET_STATE_SUCCESS.getNumber() ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if (this.currentState_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.currentState_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
        public Status getStatus() {
            Status forNumber = Status.forNumber(this.status_);
            return forNumber == null ? Status.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != Status.SET_STATE_SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if (this.currentState_ != NaturalTurnDetectionState.NTD_STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.currentState_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetNaturalTurnDetectionStateResponse, Builder> implements SetNaturalTurnDetectionStateResponseOrBuilder {
            private Builder() {
                super(SetNaturalTurnDetectionStateResponse.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentState() {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).clearCurrentState();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).clearStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
            public NaturalTurnDetectionState getCurrentState() {
                return ((SetNaturalTurnDetectionStateResponse) this.instance).getCurrentState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
            public int getCurrentStateValue() {
                return ((SetNaturalTurnDetectionStateResponse) this.instance).getCurrentStateValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
            public Status getStatus() {
                return ((SetNaturalTurnDetectionStateResponse) this.instance).getStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponseOrBuilder
            public int getStatusValue() {
                return ((SetNaturalTurnDetectionStateResponse) this.instance).getStatusValue();
            }

            public Builder setCurrentState(NaturalTurnDetectionState naturalTurnDetectionState) {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).setCurrentState(naturalTurnDetectionState);
                return this;
            }

            public Builder setCurrentStateValue(int i) {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).setCurrentStateValue(i);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((SetNaturalTurnDetectionStateResponse) this.instance).setStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Status implements Internal.EnumLite {
            SET_STATE_SUCCESS(0),
            SET_STATE_FAILED_INVALID_STATE(1),
            SET_STATE_FAILED_UNSUPPORTED_CONFIG(2),
            SET_STATE_FAILED_INSUFFICIENT_RESOURCES(3),
            SET_STATE_FAILED_MIC_UNAVAILABLE(4),
            UNRECOGNIZED(-1);

            public static final int SET_STATE_FAILED_INSUFFICIENT_RESOURCES_VALUE = 3;
            public static final int SET_STATE_FAILED_INVALID_STATE_VALUE = 1;
            public static final int SET_STATE_FAILED_MIC_UNAVAILABLE_VALUE = 4;
            public static final int SET_STATE_FAILED_UNSUPPORTED_CONFIG_VALUE = 2;
            public static final int SET_STATE_SUCCESS_VALUE = 0;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.amazon.alexa.accessory.protocol.Naturalturndetection.SetNaturalTurnDetectionStateResponse.Status.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i) {
                    return Status.forNumber(i);
                }
            };
            private final int value;

            Status(int i) {
                this.value = i;
            }

            public static Status forNumber(int i) {
                if (i == 0) {
                    return SET_STATE_SUCCESS;
                }
                if (i == 1) {
                    return SET_STATE_FAILED_INVALID_STATE;
                }
                if (i == 2) {
                    return SET_STATE_FAILED_UNSUPPORTED_CONFIG;
                }
                if (i == 3) {
                    return SET_STATE_FAILED_INSUFFICIENT_RESOURCES;
                }
                if (i != 4) {
                    return null;
                }
                return SET_STATE_FAILED_MIC_UNAVAILABLE;
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
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
            public static Status valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(SetNaturalTurnDetectionStateResponse setNaturalTurnDetectionStateResponse) {
            return DEFAULT_INSTANCE.createBuilder(setNaturalTurnDetectionStateResponse);
        }

        public static SetNaturalTurnDetectionStateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(InputStream inputStream) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetNaturalTurnDetectionStateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetNaturalTurnDetectionStateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VadConfiguration extends GeneratedMessageLite<VadConfiguration, Builder> implements VadConfigurationOrBuilder {
        private static final VadConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<VadConfiguration> PARSER = null;
        public static final int SECONDARY_VAD_ENABLED_FIELD_NUMBER = 1;
        private boolean secondaryVadEnabled_;

        static {
            VadConfiguration vadConfiguration = new VadConfiguration();
            DEFAULT_INSTANCE = vadConfiguration;
            vadConfiguration.makeImmutable();
        }

        private VadConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryVadEnabled() {
            this.secondaryVadEnabled_ = false;
        }

        public static VadConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VadConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VadConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VadConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryVadEnabled(boolean z) {
            this.secondaryVadEnabled_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VadConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    boolean z = this.secondaryVadEnabled_;
                    boolean z2 = ((VadConfiguration) obj2).secondaryVadEnabled_;
                    this.secondaryVadEnabled_ = ((GeneratedMessageLite.Visitor) obj).visitBoolean(z, z, z2, z2);
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
                                    this.secondaryVadEnabled_ = codedInputStream.readBool();
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
                        synchronized (VadConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.VadConfigurationOrBuilder
        public boolean getSecondaryVadEnabled() {
            return this.secondaryVadEnabled_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.secondaryVadEnabled_;
            int serializedSize = this.unknownFields.getSerializedSize() + (z ? CodedOutputStream.computeBoolSize(1, z) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.secondaryVadEnabled_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VadConfiguration, Builder> implements VadConfigurationOrBuilder {
            private Builder() {
                super(VadConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearSecondaryVadEnabled() {
                copyOnWrite();
                ((VadConfiguration) this.instance).clearSecondaryVadEnabled();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Naturalturndetection.VadConfigurationOrBuilder
            public boolean getSecondaryVadEnabled() {
                return ((VadConfiguration) this.instance).getSecondaryVadEnabled();
            }

            public Builder setSecondaryVadEnabled(boolean z) {
                copyOnWrite();
                ((VadConfiguration) this.instance).setSecondaryVadEnabled(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VadConfiguration vadConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(vadConfiguration);
        }

        public static VadConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VadConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VadConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VadConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VadConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VadConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VadConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VadConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VadConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VadConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VadConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NaturalTurnDetectionMode implements Internal.EnumLite {
        NTD_MODE_UNKNOWN(0),
        NTD_MODE_VAD(1),
        UNRECOGNIZED(-1);

        public static final int NTD_MODE_UNKNOWN_VALUE = 0;
        public static final int NTD_MODE_VAD_VALUE = 1;
        private static final Internal.EnumLiteMap<NaturalTurnDetectionMode> internalValueMap = new Internal.EnumLiteMap<NaturalTurnDetectionMode>() { // from class: com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NaturalTurnDetectionMode findValueByNumber(int i) {
                return NaturalTurnDetectionMode.forNumber(i);
            }
        };
        private final int value;

        NaturalTurnDetectionMode(int i) {
            this.value = i;
        }

        public static NaturalTurnDetectionMode forNumber(int i) {
            if (i == 0) {
                return NTD_MODE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return NTD_MODE_VAD;
        }

        public static Internal.EnumLiteMap<NaturalTurnDetectionMode> internalGetValueMap() {
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
        public static NaturalTurnDetectionMode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NaturalTurnDetectionState implements Internal.EnumLite {
        NTD_STATE_UNKNOWN(0),
        NTD_STATE_STARTED(1),
        NTD_STATE_TURN_IN_PROGRESS(2),
        NTD_STATE_PAUSED(3),
        NTD_STATE_STOPPED(4),
        UNRECOGNIZED(-1);

        public static final int NTD_STATE_PAUSED_VALUE = 3;
        public static final int NTD_STATE_STARTED_VALUE = 1;
        public static final int NTD_STATE_STOPPED_VALUE = 4;
        public static final int NTD_STATE_TURN_IN_PROGRESS_VALUE = 2;
        public static final int NTD_STATE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<NaturalTurnDetectionState> internalValueMap = new Internal.EnumLiteMap<NaturalTurnDetectionState>() { // from class: com.amazon.alexa.accessory.protocol.Naturalturndetection.NaturalTurnDetectionState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NaturalTurnDetectionState findValueByNumber(int i) {
                return NaturalTurnDetectionState.forNumber(i);
            }
        };
        private final int value;

        NaturalTurnDetectionState(int i) {
            this.value = i;
        }

        public static NaturalTurnDetectionState forNumber(int i) {
            if (i == 0) {
                return NTD_STATE_UNKNOWN;
            }
            if (i == 1) {
                return NTD_STATE_STARTED;
            }
            if (i == 2) {
                return NTD_STATE_TURN_IN_PROGRESS;
            }
            if (i == 3) {
                return NTD_STATE_PAUSED;
            }
            if (i != 4) {
                return null;
            }
            return NTD_STATE_STOPPED;
        }

        public static Internal.EnumLiteMap<NaturalTurnDetectionState> internalGetValueMap() {
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
        public static NaturalTurnDetectionState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
