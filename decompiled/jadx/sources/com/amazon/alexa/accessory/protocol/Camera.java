package com.amazon.alexa.accessory.protocol;

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
public final class Camera {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Camera$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$CameraActionResponse$MessageTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$NotifyCameraAction$MessageTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[CameraActionResponse.MessageTypeCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$CameraActionResponse$MessageTypeCase = iArr;
            try {
                iArr[CameraActionResponse.MessageTypeCase.ACTION_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$CameraActionResponse$MessageTypeCase[CameraActionResponse.MessageTypeCase.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$CameraActionResponse$MessageTypeCase[CameraActionResponse.MessageTypeCase.MESSAGETYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[NotifyCameraAction.MessageTypeCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$NotifyCameraAction$MessageTypeCase = iArr2;
            try {
                iArr2[NotifyCameraAction.MessageTypeCase.ACTION_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$NotifyCameraAction$MessageTypeCase[NotifyCameraAction.MessageTypeCase.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Camera$NotifyCameraAction$MessageTypeCase[NotifyCameraAction.MessageTypeCase.MESSAGETYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr3;
            try {
                iArr3[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AutoCaptureSettingsOrBuilder extends MessageLiteOrBuilder {
        int getSessionDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraActionFailureOrBuilder extends MessageLiteOrBuilder {
        CameraAction getAction();

        int getActionValue();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        CameraActionFailure.FailureType getFailureType();

        int getFailureTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraActionInitiatorOrBuilder extends MessageLiteOrBuilder {
        CameraActionInitiator.Type getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraActionMessageOrBuilder extends MessageLiteOrBuilder {
        CameraAction getAction();

        int getActionValue();

        CaptureEntry getCaptures(int i);

        int getCapturesCount();

        List<CaptureEntry> getCapturesList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraActionResponseOrBuilder extends MessageLiteOrBuilder {
        CameraActionMessage getActionMessage();

        CameraActionFailure getFailure();

        CameraActionResponse.MessageTypeCase getMessageTypeCase();

        boolean hasActionMessage();

        boolean hasFailure();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();

        ImageConfigurations getImageConfigurations();

        VideoConfigurations getVideoConfigurations();

        boolean hasImageConfigurations();

        boolean hasVideoConfigurations();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraSettingsOrBuilder extends MessageLiteOrBuilder {
        AutoCaptureSettings getAutoCaptureSettings();

        int getCameraId();

        ImageSettings getImageSettings();

        VideoSettings getVideoSettings();

        boolean hasAutoCaptureSettings();

        boolean hasImageSettings();

        boolean hasVideoSettings();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CaptureEntryOrBuilder extends MessageLiteOrBuilder {
        String getCaptureId();

        ByteString getCaptureIdBytes();

        String getTimestamp();

        ByteString getTimestampBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CaptureImageOrBuilder extends MessageLiteOrBuilder {
        CameraActionInitiator getInitiator();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCameraConfigurationsOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCameraConfigurationsResponseOrBuilder extends MessageLiteOrBuilder {
        CameraConfiguration getConfigurations(int i);

        int getConfigurationsCount();

        List<CameraConfiguration> getConfigurationsList();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        GetCameraConfigurationsResponse.Status getStatus();

        int getStatusValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCameraSettingsOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCameraSettingsResponseOrBuilder extends MessageLiteOrBuilder {
        CameraSettings getSettings(int i);

        int getSettingsCount();

        List<CameraSettings> getSettingsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ImageConfigurationsOrBuilder extends MessageLiteOrBuilder {
        String getFormats(int i);

        ByteString getFormatsBytes(int i);

        int getFormatsCount();

        List<String> getFormatsList();

        Resolution getResolutions(int i);

        int getResolutionsCount();

        List<Resolution> getResolutionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ImageSettingsOrBuilder extends MessageLiteOrBuilder {
        String getFormat();

        ByteString getFormatBytes();

        Resolution getResolution();

        boolean hasResolution();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyCameraActionOrBuilder extends MessageLiteOrBuilder {
        CameraActionMessage getActionMessage();

        CameraActionFailure getFailure();

        CameraActionInitiator getInitiator();

        NotifyCameraAction.MessageTypeCase getMessageTypeCase();

        boolean hasActionMessage();

        boolean hasFailure();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResolutionOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        int getWidth();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetCameraSettingsOrBuilder extends MessageLiteOrBuilder {
        CameraSettings getSettings(int i);

        int getSettingsCount();

        List<CameraSettings> getSettingsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetCameraSettingsResponseOrBuilder extends MessageLiteOrBuilder {
        String getErrorMessage();

        ByteString getErrorMessageBytes();

        SetCameraSettingsResponse.Status getStatus();

        int getStatusValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartAutoCaptureSessionOrBuilder extends MessageLiteOrBuilder {
        AutoCaptureType getCaptureType();

        int getCaptureTypeValue();

        CameraActionInitiator getInitiator();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartVideoCaptureOrBuilder extends MessageLiteOrBuilder {
        CameraActionInitiator getInitiator();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopAutoCaptureSessionOrBuilder extends MessageLiteOrBuilder {
        CameraActionInitiator getInitiator();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopVideoCaptureOrBuilder extends MessageLiteOrBuilder {
        String getCaptureId();

        ByteString getCaptureIdBytes();

        CameraActionInitiator getInitiator();

        boolean hasInitiator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoConfigurationsOrBuilder extends MessageLiteOrBuilder {
        int getBitRates(int i);

        int getBitRatesCount();

        List<Integer> getBitRatesList();

        String getContainerFormats(int i);

        ByteString getContainerFormatsBytes(int i);

        int getContainerFormatsCount();

        List<String> getContainerFormatsList();

        String getFormats(int i);

        ByteString getFormatsBytes(int i);

        int getFormatsCount();

        List<String> getFormatsList();

        int getFrameRates(int i);

        int getFrameRatesCount();

        List<Integer> getFrameRatesList();

        int getMaxLength();

        Resolution getResolutions(int i);

        int getResolutionsCount();

        List<Resolution> getResolutionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoSettingsOrBuilder extends MessageLiteOrBuilder {
        int getBitRate();

        String getContainerFormat();

        ByteString getContainerFormatBytes();

        String getFormat();

        ByteString getFormatBytes();

        int getFrameRate();

        int getMaxLength();

        Resolution getResolution();

        boolean hasResolution();
    }

    private Camera() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraActionMessage extends GeneratedMessageLite<CameraActionMessage, Builder> implements CameraActionMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int CAPTURES_FIELD_NUMBER = 2;
        private static final CameraActionMessage DEFAULT_INSTANCE;
        private static volatile Parser<CameraActionMessage> PARSER;
        private int action_;
        private int bitField0_;
        private Internal.ProtobufList<CaptureEntry> captures_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CameraActionMessage cameraActionMessage = new CameraActionMessage();
            DEFAULT_INSTANCE = cameraActionMessage;
            cameraActionMessage.makeImmutable();
        }

        private CameraActionMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCaptures(Iterable<? extends CaptureEntry> iterable) {
            ensureCapturesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.captures_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCaptures(CaptureEntry.Builder builder) {
            ensureCapturesIsMutable();
            this.captures_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptures() {
            this.captures_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCapturesIsMutable() {
            if (this.captures_.isModifiable()) {
                return;
            }
            this.captures_ = GeneratedMessageLite.mutableCopy(this.captures_);
        }

        public static CameraActionMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraActionMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraActionMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCaptures(int i) {
            ensureCapturesIsMutable();
            this.captures_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(CameraAction cameraAction) {
            cameraAction.getClass();
            this.action_ = cameraAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptures(int i, CaptureEntry.Builder builder) {
            ensureCapturesIsMutable();
            this.captures_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CameraActionMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.captures_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraActionMessage cameraActionMessage = (CameraActionMessage) obj2;
                    int i = this.action_;
                    boolean z = i != 0;
                    int i2 = cameraActionMessage.action_;
                    this.action_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.captures_ = visitor.visitList(this.captures_, cameraActionMessage.captures_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= cameraActionMessage.bitField0_;
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
                                    this.action_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    if (!this.captures_.isModifiable()) {
                                        this.captures_ = GeneratedMessageLite.mutableCopy(this.captures_);
                                    }
                                    this.captures_.add((CaptureEntry) codedInputStream.readMessage(CaptureEntry.parser(), extensionRegistryLite));
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
                        synchronized (CameraActionMessage.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
        public CameraAction getAction() {
            CameraAction forNumber = CameraAction.forNumber(this.action_);
            return forNumber == null ? CameraAction.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
        public CaptureEntry getCaptures(int i) {
            return this.captures_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
        public int getCapturesCount() {
            return this.captures_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
        public List<CaptureEntry> getCapturesList() {
            return this.captures_;
        }

        public CaptureEntryOrBuilder getCapturesOrBuilder(int i) {
            return this.captures_.get(i);
        }

        public List<? extends CaptureEntryOrBuilder> getCapturesOrBuilderList() {
            return this.captures_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.action_ != CameraAction.CAMERA_ACTION_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.action_) : 0;
            for (int i2 = 0; i2 < this.captures_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, this.captures_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != CameraAction.CAMERA_ACTION_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.action_);
            }
            for (int i = 0; i < this.captures_.size(); i++) {
                codedOutputStream.writeMessage(2, this.captures_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraActionMessage, Builder> implements CameraActionMessageOrBuilder {
            private Builder() {
                super(CameraActionMessage.DEFAULT_INSTANCE);
            }

            public Builder addAllCaptures(Iterable<? extends CaptureEntry> iterable) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).addAllCaptures(iterable);
                return this;
            }

            public Builder addCaptures(CaptureEntry captureEntry) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).addCaptures(captureEntry);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((CameraActionMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearCaptures() {
                copyOnWrite();
                ((CameraActionMessage) this.instance).clearCaptures();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
            public CameraAction getAction() {
                return ((CameraActionMessage) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
            public int getActionValue() {
                return ((CameraActionMessage) this.instance).getActionValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
            public CaptureEntry getCaptures(int i) {
                return ((CameraActionMessage) this.instance).getCaptures(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
            public int getCapturesCount() {
                return ((CameraActionMessage) this.instance).getCapturesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionMessageOrBuilder
            public List<CaptureEntry> getCapturesList() {
                return Collections.unmodifiableList(((CameraActionMessage) this.instance).getCapturesList());
            }

            public Builder removeCaptures(int i) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).removeCaptures(i);
                return this;
            }

            public Builder setAction(CameraAction cameraAction) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).setAction(cameraAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).setActionValue(i);
                return this;
            }

            public Builder setCaptures(int i, CaptureEntry captureEntry) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).setCaptures(i, captureEntry);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addCaptures(int i, CaptureEntry captureEntry) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).addCaptures(i, captureEntry);
                return this;
            }

            public Builder setCaptures(int i, CaptureEntry.Builder builder) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).setCaptures(i, builder);
                return this;
            }

            public Builder addCaptures(CaptureEntry.Builder builder) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).addCaptures(builder);
                return this;
            }

            public Builder addCaptures(int i, CaptureEntry.Builder builder) {
                copyOnWrite();
                ((CameraActionMessage) this.instance).addCaptures(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(CameraActionMessage cameraActionMessage) {
            return DEFAULT_INSTANCE.createBuilder(cameraActionMessage);
        }

        public static CameraActionMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CameraActionMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CameraActionMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraActionMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraActionMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraActionMessage parseFrom(InputStream inputStream) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCaptures(int i, CaptureEntry captureEntry) {
            captureEntry.getClass();
            ensureCapturesIsMutable();
            this.captures_.add(i, captureEntry);
        }

        public static CameraActionMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptures(int i, CaptureEntry captureEntry) {
            captureEntry.getClass();
            ensureCapturesIsMutable();
            this.captures_.set(i, captureEntry);
        }

        public static CameraActionMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraActionMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCaptures(CaptureEntry captureEntry) {
            captureEntry.getClass();
            ensureCapturesIsMutable();
            this.captures_.add(captureEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCaptures(int i, CaptureEntry.Builder builder) {
            ensureCapturesIsMutable();
            this.captures_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraActionResponse extends GeneratedMessageLite<CameraActionResponse, Builder> implements CameraActionResponseOrBuilder {
        public static final int ACTION_MESSAGE_FIELD_NUMBER = 1;
        private static final CameraActionResponse DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 2;
        private static volatile Parser<CameraActionResponse> PARSER;
        private int messageTypeCase_ = 0;
        private Object messageType_;

        static {
            CameraActionResponse cameraActionResponse = new CameraActionResponse();
            DEFAULT_INSTANCE = cameraActionResponse;
            cameraActionResponse.makeImmutable();
        }

        private CameraActionResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionMessage() {
            if (this.messageTypeCase_ == 1) {
                this.messageTypeCase_ = 0;
                this.messageType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            if (this.messageTypeCase_ == 2) {
                this.messageTypeCase_ = 0;
                this.messageType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageTypeCase_ = 0;
            this.messageType_ = null;
        }

        public static CameraActionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeActionMessage(CameraActionMessage cameraActionMessage) {
            if (this.messageTypeCase_ != 1 || this.messageType_ == CameraActionMessage.getDefaultInstance()) {
                this.messageType_ = cameraActionMessage;
            } else {
                this.messageType_ = CameraActionMessage.newBuilder((CameraActionMessage) this.messageType_).mergeFrom((CameraActionMessage.Builder) cameraActionMessage).buildPartial();
            }
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(CameraActionFailure cameraActionFailure) {
            if (this.messageTypeCase_ != 2 || this.messageType_ == CameraActionFailure.getDefaultInstance()) {
                this.messageType_ = cameraActionFailure;
            } else {
                this.messageType_ = CameraActionFailure.newBuilder((CameraActionFailure) this.messageType_).mergeFrom((CameraActionFailure.Builder) cameraActionFailure).buildPartial();
            }
            this.messageTypeCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraActionResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraActionResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionMessage(CameraActionMessage.Builder builder) {
            this.messageType_ = builder.build();
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(CameraActionFailure.Builder builder) {
            this.messageType_ = builder.build();
            this.messageTypeCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CameraActionResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraActionResponse cameraActionResponse = (CameraActionResponse) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Camera$CameraActionResponse$MessageTypeCase[cameraActionResponse.getMessageTypeCase().ordinal()];
                    if (i2 == 1) {
                        this.messageType_ = visitor.visitOneofMessage(this.messageTypeCase_ == 1, this.messageType_, cameraActionResponse.messageType_);
                    } else if (i2 == 2) {
                        this.messageType_ = visitor.visitOneofMessage(this.messageTypeCase_ == 2, this.messageType_, cameraActionResponse.messageType_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.messageTypeCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = cameraActionResponse.messageTypeCase_) != 0) {
                        this.messageTypeCase_ = i;
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
                                    CameraActionMessage.Builder builder = this.messageTypeCase_ == 1 ? ((CameraActionMessage) this.messageType_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(CameraActionMessage.parser(), extensionRegistryLite);
                                    this.messageType_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionMessage.Builder) readMessage);
                                        this.messageType_ = builder.buildPartial();
                                    }
                                    this.messageTypeCase_ = 1;
                                } else if (readTag == 18) {
                                    CameraActionFailure.Builder builder2 = this.messageTypeCase_ == 2 ? ((CameraActionFailure) this.messageType_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(CameraActionFailure.parser(), extensionRegistryLite);
                                    this.messageType_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((CameraActionFailure.Builder) readMessage2);
                                        this.messageType_ = builder2.buildPartial();
                                    }
                                    this.messageTypeCase_ = 2;
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
                        synchronized (CameraActionResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
        public CameraActionMessage getActionMessage() {
            return this.messageTypeCase_ == 1 ? (CameraActionMessage) this.messageType_ : CameraActionMessage.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
        public CameraActionFailure getFailure() {
            return this.messageTypeCase_ == 2 ? (CameraActionFailure) this.messageType_ : CameraActionFailure.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
        public MessageTypeCase getMessageTypeCase() {
            return MessageTypeCase.forNumber(this.messageTypeCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.messageTypeCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (CameraActionMessage) this.messageType_) : 0;
            if (this.messageTypeCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (CameraActionFailure) this.messageType_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
        public boolean hasActionMessage() {
            return this.messageTypeCase_ == 1;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
        public boolean hasFailure() {
            return this.messageTypeCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.messageTypeCase_ == 1) {
                codedOutputStream.writeMessage(1, (CameraActionMessage) this.messageType_);
            }
            if (this.messageTypeCase_ == 2) {
                codedOutputStream.writeMessage(2, (CameraActionFailure) this.messageType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraActionResponse, Builder> implements CameraActionResponseOrBuilder {
            private Builder() {
                super(CameraActionResponse.DEFAULT_INSTANCE);
            }

            public Builder clearActionMessage() {
                copyOnWrite();
                ((CameraActionResponse) this.instance).clearActionMessage();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((CameraActionResponse) this.instance).clearFailure();
                return this;
            }

            public Builder clearMessageType() {
                copyOnWrite();
                ((CameraActionResponse) this.instance).clearMessageType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
            public CameraActionMessage getActionMessage() {
                return ((CameraActionResponse) this.instance).getActionMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
            public CameraActionFailure getFailure() {
                return ((CameraActionResponse) this.instance).getFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
            public MessageTypeCase getMessageTypeCase() {
                return ((CameraActionResponse) this.instance).getMessageTypeCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
            public boolean hasActionMessage() {
                return ((CameraActionResponse) this.instance).hasActionMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionResponseOrBuilder
            public boolean hasFailure() {
                return ((CameraActionResponse) this.instance).hasFailure();
            }

            public Builder mergeActionMessage(CameraActionMessage cameraActionMessage) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).mergeActionMessage(cameraActionMessage);
                return this;
            }

            public Builder mergeFailure(CameraActionFailure cameraActionFailure) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).mergeFailure(cameraActionFailure);
                return this;
            }

            public Builder setActionMessage(CameraActionMessage cameraActionMessage) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).setActionMessage(cameraActionMessage);
                return this;
            }

            public Builder setFailure(CameraActionFailure cameraActionFailure) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).setFailure(cameraActionFailure);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setActionMessage(CameraActionMessage.Builder builder) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).setActionMessage(builder);
                return this;
            }

            public Builder setFailure(CameraActionFailure.Builder builder) {
                copyOnWrite();
                ((CameraActionResponse) this.instance).setFailure(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MessageTypeCase implements Internal.EnumLite {
            ACTION_MESSAGE(1),
            FAILURE(2),
            MESSAGETYPE_NOT_SET(0);

            private final int value;

            MessageTypeCase(int i) {
                this.value = i;
            }

            public static MessageTypeCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGETYPE_NOT_SET;
                }
                if (i == 1) {
                    return ACTION_MESSAGE;
                }
                if (i != 2) {
                    return null;
                }
                return FAILURE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageTypeCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CameraActionResponse cameraActionResponse) {
            return DEFAULT_INSTANCE.createBuilder(cameraActionResponse);
        }

        public static CameraActionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CameraActionResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionMessage(CameraActionMessage cameraActionMessage) {
            cameraActionMessage.getClass();
            this.messageType_ = cameraActionMessage;
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(CameraActionFailure cameraActionFailure) {
            cameraActionFailure.getClass();
            this.messageType_ = cameraActionFailure;
            this.messageTypeCase_ = 2;
        }

        public static CameraActionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraActionResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraActionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraActionResponse parseFrom(InputStream inputStream) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraActionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraConfiguration extends GeneratedMessageLite<CameraConfiguration, Builder> implements CameraConfigurationOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        private static final CameraConfiguration DEFAULT_INSTANCE;
        public static final int IMAGE_CONFIGURATIONS_FIELD_NUMBER = 2;
        private static volatile Parser<CameraConfiguration> PARSER = null;
        public static final int VIDEO_CONFIGURATIONS_FIELD_NUMBER = 3;
        private int cameraId_;
        private ImageConfigurations imageConfigurations_;
        private VideoConfigurations videoConfigurations_;

        static {
            CameraConfiguration cameraConfiguration = new CameraConfiguration();
            DEFAULT_INSTANCE = cameraConfiguration;
            cameraConfiguration.makeImmutable();
        }

        private CameraConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageConfigurations() {
            this.imageConfigurations_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoConfigurations() {
            this.videoConfigurations_ = null;
        }

        public static CameraConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageConfigurations(ImageConfigurations imageConfigurations) {
            ImageConfigurations imageConfigurations2 = this.imageConfigurations_;
            if (imageConfigurations2 == null || imageConfigurations2 == ImageConfigurations.getDefaultInstance()) {
                this.imageConfigurations_ = imageConfigurations;
            } else {
                this.imageConfigurations_ = ImageConfigurations.newBuilder(this.imageConfigurations_).mergeFrom((ImageConfigurations.Builder) imageConfigurations).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoConfigurations(VideoConfigurations videoConfigurations) {
            VideoConfigurations videoConfigurations2 = this.videoConfigurations_;
            if (videoConfigurations2 == null || videoConfigurations2 == VideoConfigurations.getDefaultInstance()) {
                this.videoConfigurations_ = videoConfigurations;
            } else {
                this.videoConfigurations_ = VideoConfigurations.newBuilder(this.videoConfigurations_).mergeFrom((VideoConfigurations.Builder) videoConfigurations).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageConfigurations(ImageConfigurations.Builder builder) {
            this.imageConfigurations_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoConfigurations(VideoConfigurations.Builder builder) {
            this.videoConfigurations_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CameraConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraConfiguration cameraConfiguration = (CameraConfiguration) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = cameraConfiguration.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.imageConfigurations_ = (ImageConfigurations) visitor.visitMessage(this.imageConfigurations_, cameraConfiguration.imageConfigurations_);
                    this.videoConfigurations_ = (VideoConfigurations) visitor.visitMessage(this.videoConfigurations_, cameraConfiguration.videoConfigurations_);
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
                                    this.cameraId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    ImageConfigurations imageConfigurations = this.imageConfigurations_;
                                    ImageConfigurations.Builder builder = imageConfigurations != null ? imageConfigurations.toBuilder() : null;
                                    ImageConfigurations imageConfigurations2 = (ImageConfigurations) codedInputStream.readMessage(ImageConfigurations.parser(), extensionRegistryLite);
                                    this.imageConfigurations_ = imageConfigurations2;
                                    if (builder != null) {
                                        builder.mergeFrom((ImageConfigurations.Builder) imageConfigurations2);
                                        this.imageConfigurations_ = builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    VideoConfigurations videoConfigurations = this.videoConfigurations_;
                                    VideoConfigurations.Builder builder2 = videoConfigurations != null ? videoConfigurations.toBuilder() : null;
                                    VideoConfigurations videoConfigurations2 = (VideoConfigurations) codedInputStream.readMessage(VideoConfigurations.parser(), extensionRegistryLite);
                                    this.videoConfigurations_ = videoConfigurations2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VideoConfigurations.Builder) videoConfigurations2);
                                        this.videoConfigurations_ = builder2.buildPartial();
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
                        synchronized (CameraConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
        public ImageConfigurations getImageConfigurations() {
            ImageConfigurations imageConfigurations = this.imageConfigurations_;
            return imageConfigurations == null ? ImageConfigurations.getDefaultInstance() : imageConfigurations;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.imageConfigurations_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getImageConfigurations());
            }
            if (this.videoConfigurations_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, getVideoConfigurations());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
        public VideoConfigurations getVideoConfigurations() {
            VideoConfigurations videoConfigurations = this.videoConfigurations_;
            return videoConfigurations == null ? VideoConfigurations.getDefaultInstance() : videoConfigurations;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
        public boolean hasImageConfigurations() {
            return this.imageConfigurations_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
        public boolean hasVideoConfigurations() {
            return this.videoConfigurations_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.imageConfigurations_ != null) {
                codedOutputStream.writeMessage(2, getImageConfigurations());
            }
            if (this.videoConfigurations_ != null) {
                codedOutputStream.writeMessage(3, getVideoConfigurations());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraConfiguration, Builder> implements CameraConfigurationOrBuilder {
            private Builder() {
                super(CameraConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((CameraConfiguration) this.instance).clearCameraId();
                return this;
            }

            public Builder clearImageConfigurations() {
                copyOnWrite();
                ((CameraConfiguration) this.instance).clearImageConfigurations();
                return this;
            }

            public Builder clearVideoConfigurations() {
                copyOnWrite();
                ((CameraConfiguration) this.instance).clearVideoConfigurations();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
            public int getCameraId() {
                return ((CameraConfiguration) this.instance).getCameraId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
            public ImageConfigurations getImageConfigurations() {
                return ((CameraConfiguration) this.instance).getImageConfigurations();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
            public VideoConfigurations getVideoConfigurations() {
                return ((CameraConfiguration) this.instance).getVideoConfigurations();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
            public boolean hasImageConfigurations() {
                return ((CameraConfiguration) this.instance).hasImageConfigurations();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraConfigurationOrBuilder
            public boolean hasVideoConfigurations() {
                return ((CameraConfiguration) this.instance).hasVideoConfigurations();
            }

            public Builder mergeImageConfigurations(ImageConfigurations imageConfigurations) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).mergeImageConfigurations(imageConfigurations);
                return this;
            }

            public Builder mergeVideoConfigurations(VideoConfigurations videoConfigurations) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).mergeVideoConfigurations(videoConfigurations);
                return this;
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setCameraId(i);
                return this;
            }

            public Builder setImageConfigurations(ImageConfigurations imageConfigurations) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setImageConfigurations(imageConfigurations);
                return this;
            }

            public Builder setVideoConfigurations(VideoConfigurations videoConfigurations) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setVideoConfigurations(videoConfigurations);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setImageConfigurations(ImageConfigurations.Builder builder) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setImageConfigurations(builder);
                return this;
            }

            public Builder setVideoConfigurations(VideoConfigurations.Builder builder) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setVideoConfigurations(builder);
                return this;
            }
        }

        public static Builder newBuilder(CameraConfiguration cameraConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(cameraConfiguration);
        }

        public static CameraConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageConfigurations(ImageConfigurations imageConfigurations) {
            imageConfigurations.getClass();
            this.imageConfigurations_ = imageConfigurations;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoConfigurations(VideoConfigurations videoConfigurations) {
            videoConfigurations.getClass();
            this.videoConfigurations_ = videoConfigurations;
        }

        public static CameraConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CameraConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraSettings extends GeneratedMessageLite<CameraSettings, Builder> implements CameraSettingsOrBuilder {
        public static final int AUTO_CAPTURE_SETTINGS_FIELD_NUMBER = 4;
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        private static final CameraSettings DEFAULT_INSTANCE;
        public static final int IMAGE_SETTINGS_FIELD_NUMBER = 2;
        private static volatile Parser<CameraSettings> PARSER = null;
        public static final int VIDEO_SETTINGS_FIELD_NUMBER = 3;
        private AutoCaptureSettings autoCaptureSettings_;
        private int cameraId_;
        private ImageSettings imageSettings_;
        private VideoSettings videoSettings_;

        static {
            CameraSettings cameraSettings = new CameraSettings();
            DEFAULT_INSTANCE = cameraSettings;
            cameraSettings.makeImmutable();
        }

        private CameraSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoCaptureSettings() {
            this.autoCaptureSettings_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageSettings() {
            this.imageSettings_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoSettings() {
            this.videoSettings_ = null;
        }

        public static CameraSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAutoCaptureSettings(AutoCaptureSettings autoCaptureSettings) {
            AutoCaptureSettings autoCaptureSettings2 = this.autoCaptureSettings_;
            if (autoCaptureSettings2 == null || autoCaptureSettings2 == AutoCaptureSettings.getDefaultInstance()) {
                this.autoCaptureSettings_ = autoCaptureSettings;
            } else {
                this.autoCaptureSettings_ = AutoCaptureSettings.newBuilder(this.autoCaptureSettings_).mergeFrom((AutoCaptureSettings.Builder) autoCaptureSettings).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageSettings(ImageSettings imageSettings) {
            ImageSettings imageSettings2 = this.imageSettings_;
            if (imageSettings2 == null || imageSettings2 == ImageSettings.getDefaultInstance()) {
                this.imageSettings_ = imageSettings;
            } else {
                this.imageSettings_ = ImageSettings.newBuilder(this.imageSettings_).mergeFrom((ImageSettings.Builder) imageSettings).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoSettings(VideoSettings videoSettings) {
            VideoSettings videoSettings2 = this.videoSettings_;
            if (videoSettings2 == null || videoSettings2 == VideoSettings.getDefaultInstance()) {
                this.videoSettings_ = videoSettings;
            } else {
                this.videoSettings_ = VideoSettings.newBuilder(this.videoSettings_).mergeFrom((VideoSettings.Builder) videoSettings).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoCaptureSettings(AutoCaptureSettings.Builder builder) {
            this.autoCaptureSettings_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageSettings(ImageSettings.Builder builder) {
            this.imageSettings_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoSettings(VideoSettings.Builder builder) {
            this.videoSettings_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CameraSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraSettings cameraSettings = (CameraSettings) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = cameraSettings.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.imageSettings_ = (ImageSettings) visitor.visitMessage(this.imageSettings_, cameraSettings.imageSettings_);
                    this.videoSettings_ = (VideoSettings) visitor.visitMessage(this.videoSettings_, cameraSettings.videoSettings_);
                    this.autoCaptureSettings_ = (AutoCaptureSettings) visitor.visitMessage(this.autoCaptureSettings_, cameraSettings.autoCaptureSettings_);
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
                                    this.cameraId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    ImageSettings imageSettings = this.imageSettings_;
                                    ImageSettings.Builder builder = imageSettings != null ? imageSettings.toBuilder() : null;
                                    ImageSettings imageSettings2 = (ImageSettings) codedInputStream.readMessage(ImageSettings.parser(), extensionRegistryLite);
                                    this.imageSettings_ = imageSettings2;
                                    if (builder != null) {
                                        builder.mergeFrom((ImageSettings.Builder) imageSettings2);
                                        this.imageSettings_ = builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    VideoSettings videoSettings = this.videoSettings_;
                                    VideoSettings.Builder builder2 = videoSettings != null ? videoSettings.toBuilder() : null;
                                    VideoSettings videoSettings2 = (VideoSettings) codedInputStream.readMessage(VideoSettings.parser(), extensionRegistryLite);
                                    this.videoSettings_ = videoSettings2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VideoSettings.Builder) videoSettings2);
                                        this.videoSettings_ = builder2.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    AutoCaptureSettings autoCaptureSettings = this.autoCaptureSettings_;
                                    AutoCaptureSettings.Builder builder3 = autoCaptureSettings != null ? autoCaptureSettings.toBuilder() : null;
                                    AutoCaptureSettings autoCaptureSettings2 = (AutoCaptureSettings) codedInputStream.readMessage(AutoCaptureSettings.parser(), extensionRegistryLite);
                                    this.autoCaptureSettings_ = autoCaptureSettings2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((AutoCaptureSettings.Builder) autoCaptureSettings2);
                                        this.autoCaptureSettings_ = builder3.buildPartial();
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
                        synchronized (CameraSettings.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public AutoCaptureSettings getAutoCaptureSettings() {
            AutoCaptureSettings autoCaptureSettings = this.autoCaptureSettings_;
            return autoCaptureSettings == null ? AutoCaptureSettings.getDefaultInstance() : autoCaptureSettings;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public ImageSettings getImageSettings() {
            ImageSettings imageSettings = this.imageSettings_;
            return imageSettings == null ? ImageSettings.getDefaultInstance() : imageSettings;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.imageSettings_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getImageSettings());
            }
            if (this.videoSettings_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, getVideoSettings());
            }
            if (this.autoCaptureSettings_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(4, getAutoCaptureSettings());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public VideoSettings getVideoSettings() {
            VideoSettings videoSettings = this.videoSettings_;
            return videoSettings == null ? VideoSettings.getDefaultInstance() : videoSettings;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public boolean hasAutoCaptureSettings() {
            return this.autoCaptureSettings_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public boolean hasImageSettings() {
            return this.imageSettings_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
        public boolean hasVideoSettings() {
            return this.videoSettings_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.imageSettings_ != null) {
                codedOutputStream.writeMessage(2, getImageSettings());
            }
            if (this.videoSettings_ != null) {
                codedOutputStream.writeMessage(3, getVideoSettings());
            }
            if (this.autoCaptureSettings_ != null) {
                codedOutputStream.writeMessage(4, getAutoCaptureSettings());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraSettings, Builder> implements CameraSettingsOrBuilder {
            private Builder() {
                super(CameraSettings.DEFAULT_INSTANCE);
            }

            public Builder clearAutoCaptureSettings() {
                copyOnWrite();
                ((CameraSettings) this.instance).clearAutoCaptureSettings();
                return this;
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((CameraSettings) this.instance).clearCameraId();
                return this;
            }

            public Builder clearImageSettings() {
                copyOnWrite();
                ((CameraSettings) this.instance).clearImageSettings();
                return this;
            }

            public Builder clearVideoSettings() {
                copyOnWrite();
                ((CameraSettings) this.instance).clearVideoSettings();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public AutoCaptureSettings getAutoCaptureSettings() {
                return ((CameraSettings) this.instance).getAutoCaptureSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public int getCameraId() {
                return ((CameraSettings) this.instance).getCameraId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public ImageSettings getImageSettings() {
                return ((CameraSettings) this.instance).getImageSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public VideoSettings getVideoSettings() {
                return ((CameraSettings) this.instance).getVideoSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public boolean hasAutoCaptureSettings() {
                return ((CameraSettings) this.instance).hasAutoCaptureSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public boolean hasImageSettings() {
                return ((CameraSettings) this.instance).hasImageSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraSettingsOrBuilder
            public boolean hasVideoSettings() {
                return ((CameraSettings) this.instance).hasVideoSettings();
            }

            public Builder mergeAutoCaptureSettings(AutoCaptureSettings autoCaptureSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).mergeAutoCaptureSettings(autoCaptureSettings);
                return this;
            }

            public Builder mergeImageSettings(ImageSettings imageSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).mergeImageSettings(imageSettings);
                return this;
            }

            public Builder mergeVideoSettings(VideoSettings videoSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).mergeVideoSettings(videoSettings);
                return this;
            }

            public Builder setAutoCaptureSettings(AutoCaptureSettings autoCaptureSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).setAutoCaptureSettings(autoCaptureSettings);
                return this;
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((CameraSettings) this.instance).setCameraId(i);
                return this;
            }

            public Builder setImageSettings(ImageSettings imageSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).setImageSettings(imageSettings);
                return this;
            }

            public Builder setVideoSettings(VideoSettings videoSettings) {
                copyOnWrite();
                ((CameraSettings) this.instance).setVideoSettings(videoSettings);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAutoCaptureSettings(AutoCaptureSettings.Builder builder) {
                copyOnWrite();
                ((CameraSettings) this.instance).setAutoCaptureSettings(builder);
                return this;
            }

            public Builder setImageSettings(ImageSettings.Builder builder) {
                copyOnWrite();
                ((CameraSettings) this.instance).setImageSettings(builder);
                return this;
            }

            public Builder setVideoSettings(VideoSettings.Builder builder) {
                copyOnWrite();
                ((CameraSettings) this.instance).setVideoSettings(builder);
                return this;
            }
        }

        public static Builder newBuilder(CameraSettings cameraSettings) {
            return DEFAULT_INSTANCE.createBuilder(cameraSettings);
        }

        public static CameraSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoCaptureSettings(AutoCaptureSettings autoCaptureSettings) {
            autoCaptureSettings.getClass();
            this.autoCaptureSettings_ = autoCaptureSettings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageSettings(ImageSettings imageSettings) {
            imageSettings.getClass();
            this.imageSettings_ = imageSettings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoSettings(VideoSettings videoSettings) {
            videoSettings.getClass();
            this.videoSettings_ = videoSettings;
        }

        public static CameraSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CameraSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraSettings parseFrom(InputStream inputStream) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CaptureImage extends GeneratedMessageLite<CaptureImage, Builder> implements CaptureImageOrBuilder {
        private static final CaptureImage DEFAULT_INSTANCE;
        public static final int INITIATOR_FIELD_NUMBER = 1;
        private static volatile Parser<CaptureImage> PARSER;
        private CameraActionInitiator initiator_;

        static {
            CaptureImage captureImage = new CaptureImage();
            DEFAULT_INSTANCE = captureImage;
            captureImage.makeImmutable();
        }

        private CaptureImage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        public static CaptureImage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CaptureImage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureImage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CaptureImage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CaptureImage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.initiator_ = (CameraActionInitiator) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.initiator_, ((CaptureImage) obj2).initiator_);
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
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder.buildPartial();
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
                        synchronized (CaptureImage.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureImageOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.initiator_ != null ? CodedOutputStream.computeMessageSize(1, getInitiator()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureImageOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(1, getInitiator());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CaptureImage, Builder> implements CaptureImageOrBuilder {
            private Builder() {
                super(CaptureImage.DEFAULT_INSTANCE);
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((CaptureImage) this.instance).clearInitiator();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureImageOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((CaptureImage) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureImageOrBuilder
            public boolean hasInitiator() {
                return ((CaptureImage) this.instance).hasInitiator();
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((CaptureImage) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((CaptureImage) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((CaptureImage) this.instance).setInitiator(builder);
                return this;
            }
        }

        public static Builder newBuilder(CaptureImage captureImage) {
            return DEFAULT_INSTANCE.createBuilder(captureImage);
        }

        public static CaptureImage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureImage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static CaptureImage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CaptureImage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CaptureImage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CaptureImage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CaptureImage parseFrom(InputStream inputStream) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureImage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureImage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CaptureImage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCameraConfigurationsResponse extends GeneratedMessageLite<GetCameraConfigurationsResponse, Builder> implements GetCameraConfigurationsResponseOrBuilder {
        public static final int CONFIGURATIONS_FIELD_NUMBER = 3;
        private static final GetCameraConfigurationsResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<GetCameraConfigurationsResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int status_;
        private String errorMessage_ = "";
        private Internal.ProtobufList<CameraConfiguration> configurations_ = GeneratedMessageLite.emptyProtobufList();

        static {
            GetCameraConfigurationsResponse getCameraConfigurationsResponse = new GetCameraConfigurationsResponse();
            DEFAULT_INSTANCE = getCameraConfigurationsResponse;
            getCameraConfigurationsResponse.makeImmutable();
        }

        private GetCameraConfigurationsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConfigurations(Iterable<? extends CameraConfiguration> iterable) {
            ensureConfigurationsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.configurations_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(CameraConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurations() {
            this.configurations_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        private void ensureConfigurationsIsMutable() {
            if (this.configurations_.isModifiable()) {
                return;
            }
            this.configurations_ = GeneratedMessageLite.mutableCopy(this.configurations_);
        }

        public static GetCameraConfigurationsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCameraConfigurationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraConfigurationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCameraConfigurationsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConfigurations(int i) {
            ensureConfigurationsIsMutable();
            this.configurations_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurations(int i, CameraConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.set(i, builder.build());
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
                    return new GetCameraConfigurationsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.configurations_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetCameraConfigurationsResponse getCameraConfigurationsResponse = (GetCameraConfigurationsResponse) obj2;
                    int i = this.status_;
                    boolean z = i != 0;
                    int i2 = getCameraConfigurationsResponse.status_;
                    this.status_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !getCameraConfigurationsResponse.errorMessage_.isEmpty(), getCameraConfigurationsResponse.errorMessage_);
                    this.configurations_ = visitor.visitList(this.configurations_, getCameraConfigurationsResponse.configurations_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= getCameraConfigurationsResponse.bitField0_;
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
                                    this.status_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.errorMessage_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!this.configurations_.isModifiable()) {
                                        this.configurations_ = GeneratedMessageLite.mutableCopy(this.configurations_);
                                    }
                                    this.configurations_.add((CameraConfiguration) codedInputStream.readMessage(CameraConfiguration.parser(), extensionRegistryLite));
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
                        synchronized (GetCameraConfigurationsResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public CameraConfiguration getConfigurations(int i) {
            return this.configurations_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public int getConfigurationsCount() {
            return this.configurations_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public List<CameraConfiguration> getConfigurationsList() {
            return this.configurations_;
        }

        public CameraConfigurationOrBuilder getConfigurationsOrBuilder(int i) {
            return this.configurations_.get(i);
        }

        public List<? extends CameraConfigurationOrBuilder> getConfigurationsOrBuilderList() {
            return this.configurations_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.status_ != Status.CONFIG_STATUS_SUCCESS.getNumber() ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if (!this.errorMessage_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getErrorMessage());
            }
            for (int i2 = 0; i2 < this.configurations_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, this.configurations_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public Status getStatus() {
            Status forNumber = Status.forNumber(this.status_);
            return forNumber == null ? Status.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != Status.CONFIG_STATUS_SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(2, getErrorMessage());
            }
            for (int i = 0; i < this.configurations_.size(); i++) {
                codedOutputStream.writeMessage(3, this.configurations_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCameraConfigurationsResponse, Builder> implements GetCameraConfigurationsResponseOrBuilder {
            private Builder() {
                super(GetCameraConfigurationsResponse.DEFAULT_INSTANCE);
            }

            public Builder addAllConfigurations(Iterable<? extends CameraConfiguration> iterable) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).addAllConfigurations(iterable);
                return this;
            }

            public Builder addConfigurations(CameraConfiguration cameraConfiguration) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).addConfigurations(cameraConfiguration);
                return this;
            }

            public Builder clearConfigurations() {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).clearConfigurations();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).clearStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public CameraConfiguration getConfigurations(int i) {
                return ((GetCameraConfigurationsResponse) this.instance).getConfigurations(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public int getConfigurationsCount() {
                return ((GetCameraConfigurationsResponse) this.instance).getConfigurationsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public List<CameraConfiguration> getConfigurationsList() {
                return Collections.unmodifiableList(((GetCameraConfigurationsResponse) this.instance).getConfigurationsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public String getErrorMessage() {
                return ((GetCameraConfigurationsResponse) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((GetCameraConfigurationsResponse) this.instance).getErrorMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public Status getStatus() {
                return ((GetCameraConfigurationsResponse) this.instance).getStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponseOrBuilder
            public int getStatusValue() {
                return ((GetCameraConfigurationsResponse) this.instance).getStatusValue();
            }

            public Builder removeConfigurations(int i) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).removeConfigurations(i);
                return this;
            }

            public Builder setConfigurations(int i, CameraConfiguration cameraConfiguration) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setConfigurations(i, cameraConfiguration);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addConfigurations(int i, CameraConfiguration cameraConfiguration) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).addConfigurations(i, cameraConfiguration);
                return this;
            }

            public Builder setConfigurations(int i, CameraConfiguration.Builder builder) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).setConfigurations(i, builder);
                return this;
            }

            public Builder addConfigurations(CameraConfiguration.Builder builder) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).addConfigurations(builder);
                return this;
            }

            public Builder addConfigurations(int i, CameraConfiguration.Builder builder) {
                copyOnWrite();
                ((GetCameraConfigurationsResponse) this.instance).addConfigurations(i, builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Status implements Internal.EnumLite {
            CONFIG_STATUS_SUCCESS(0),
            CONFIG_STATUS_CAMERA_NOT_FOUND(1),
            CONFIG_STATUS_SYSTEM_NOT_READY(2),
            CONFIG_STATUS_FAILED(3),
            UNRECOGNIZED(-1);

            public static final int CONFIG_STATUS_CAMERA_NOT_FOUND_VALUE = 1;
            public static final int CONFIG_STATUS_FAILED_VALUE = 3;
            public static final int CONFIG_STATUS_SUCCESS_VALUE = 0;
            public static final int CONFIG_STATUS_SYSTEM_NOT_READY_VALUE = 2;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsResponse.Status.1
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
                    return CONFIG_STATUS_SUCCESS;
                }
                if (i == 1) {
                    return CONFIG_STATUS_CAMERA_NOT_FOUND;
                }
                if (i == 2) {
                    return CONFIG_STATUS_SYSTEM_NOT_READY;
                }
                if (i != 3) {
                    return null;
                }
                return CONFIG_STATUS_FAILED;
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

        public static Builder newBuilder(GetCameraConfigurationsResponse getCameraConfigurationsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getCameraConfigurationsResponse);
        }

        public static GetCameraConfigurationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraConfigurationsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCameraConfigurationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCameraConfigurationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCameraConfigurationsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCameraConfigurationsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCameraConfigurationsResponse parseFrom(InputStream inputStream) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(int i, CameraConfiguration cameraConfiguration) {
            cameraConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.add(i, cameraConfiguration);
        }

        public static GetCameraConfigurationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurations(int i, CameraConfiguration cameraConfiguration) {
            cameraConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.set(i, cameraConfiguration);
        }

        public static GetCameraConfigurationsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCameraConfigurationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(CameraConfiguration cameraConfiguration) {
            cameraConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.add(cameraConfiguration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(int i, CameraConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCameraSettingsResponse extends GeneratedMessageLite<GetCameraSettingsResponse, Builder> implements GetCameraSettingsResponseOrBuilder {
        private static final GetCameraSettingsResponse DEFAULT_INSTANCE;
        private static volatile Parser<GetCameraSettingsResponse> PARSER = null;
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<CameraSettings> settings_ = GeneratedMessageLite.emptyProtobufList();

        static {
            GetCameraSettingsResponse getCameraSettingsResponse = new GetCameraSettingsResponse();
            DEFAULT_INSTANCE = getCameraSettingsResponse;
            getCameraSettingsResponse.makeImmutable();
        }

        private GetCameraSettingsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSettings(Iterable<? extends CameraSettings> iterable) {
            ensureSettingsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.settings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettings() {
            this.settings_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSettingsIsMutable() {
            if (this.settings_.isModifiable()) {
                return;
            }
            this.settings_ = GeneratedMessageLite.mutableCopy(this.settings_);
        }

        public static GetCameraSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCameraSettingsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraSettingsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCameraSettingsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSettings(int i) {
            ensureSettingsIsMutable();
            this.settings_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(int i, CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCameraSettingsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.settings_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.settings_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.settings_, ((GetCameraSettingsResponse) obj2).settings_);
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
                                    if (!this.settings_.isModifiable()) {
                                        this.settings_ = GeneratedMessageLite.mutableCopy(this.settings_);
                                    }
                                    this.settings_.add((CameraSettings) codedInputStream.readMessage(CameraSettings.parser(), extensionRegistryLite));
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
                        synchronized (GetCameraSettingsResponse.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.settings_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.settings_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
        public CameraSettings getSettings(int i) {
            return this.settings_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
        public int getSettingsCount() {
            return this.settings_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
        public List<CameraSettings> getSettingsList() {
            return this.settings_;
        }

        public CameraSettingsOrBuilder getSettingsOrBuilder(int i) {
            return this.settings_.get(i);
        }

        public List<? extends CameraSettingsOrBuilder> getSettingsOrBuilderList() {
            return this.settings_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.settings_.size(); i++) {
                codedOutputStream.writeMessage(1, this.settings_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCameraSettingsResponse, Builder> implements GetCameraSettingsResponseOrBuilder {
            private Builder() {
                super(GetCameraSettingsResponse.DEFAULT_INSTANCE);
            }

            public Builder addAllSettings(Iterable<? extends CameraSettings> iterable) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).addAllSettings(iterable);
                return this;
            }

            public Builder addSettings(CameraSettings cameraSettings) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).addSettings(cameraSettings);
                return this;
            }

            public Builder clearSettings() {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).clearSettings();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
            public CameraSettings getSettings(int i) {
                return ((GetCameraSettingsResponse) this.instance).getSettings(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
            public int getSettingsCount() {
                return ((GetCameraSettingsResponse) this.instance).getSettingsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsResponseOrBuilder
            public List<CameraSettings> getSettingsList() {
                return Collections.unmodifiableList(((GetCameraSettingsResponse) this.instance).getSettingsList());
            }

            public Builder removeSettings(int i) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).removeSettings(i);
                return this;
            }

            public Builder setSettings(int i, CameraSettings cameraSettings) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).setSettings(i, cameraSettings);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSettings(int i, CameraSettings cameraSettings) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).addSettings(i, cameraSettings);
                return this;
            }

            public Builder setSettings(int i, CameraSettings.Builder builder) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).setSettings(i, builder);
                return this;
            }

            public Builder addSettings(CameraSettings.Builder builder) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).addSettings(builder);
                return this;
            }

            public Builder addSettings(int i, CameraSettings.Builder builder) {
                copyOnWrite();
                ((GetCameraSettingsResponse) this.instance).addSettings(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(GetCameraSettingsResponse getCameraSettingsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getCameraSettingsResponse);
        }

        public static GetCameraSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCameraSettingsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCameraSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCameraSettingsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCameraSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCameraSettingsResponse parseFrom(InputStream inputStream) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(int i, CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.add(i, cameraSettings);
        }

        public static GetCameraSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(int i, CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.set(i, cameraSettings);
        }

        public static GetCameraSettingsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCameraSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.add(cameraSettings);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(int i, CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageConfigurations extends GeneratedMessageLite<ImageConfigurations, Builder> implements ImageConfigurationsOrBuilder {
        private static final ImageConfigurations DEFAULT_INSTANCE;
        public static final int FORMATS_FIELD_NUMBER = 1;
        private static volatile Parser<ImageConfigurations> PARSER = null;
        public static final int RESOLUTIONS_FIELD_NUMBER = 2;
        private Internal.ProtobufList<String> formats_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Resolution> resolutions_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ImageConfigurations imageConfigurations = new ImageConfigurations();
            DEFAULT_INSTANCE = imageConfigurations;
            imageConfigurations.makeImmutable();
        }

        private ImageConfigurations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFormats(Iterable<String> iterable) {
            ensureFormatsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.formats_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResolutions(Iterable<? extends Resolution> iterable) {
            ensureResolutionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.resolutions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormats(String str) {
            str.getClass();
            ensureFormatsIsMutable();
            this.formats_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureFormatsIsMutable();
            this.formats_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormats() {
            this.formats_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolutions() {
            this.resolutions_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureFormatsIsMutable() {
            if (this.formats_.isModifiable()) {
                return;
            }
            this.formats_ = GeneratedMessageLite.mutableCopy(this.formats_);
        }

        private void ensureResolutionsIsMutable() {
            if (this.resolutions_.isModifiable()) {
                return;
            }
            this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
        }

        public static ImageConfigurations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImageConfigurations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageConfigurations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImageConfigurations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResolutions(int i) {
            ensureResolutionsIsMutable();
            this.resolutions_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormats(int i, String str) {
            str.getClass();
            ensureFormatsIsMutable();
            this.formats_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImageConfigurations();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.formats_.makeImmutable();
                    this.resolutions_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ImageConfigurations imageConfigurations = (ImageConfigurations) obj2;
                    this.formats_ = visitor.visitList(this.formats_, imageConfigurations.formats_);
                    this.resolutions_ = visitor.visitList(this.resolutions_, imageConfigurations.resolutions_);
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.formats_.isModifiable()) {
                                        this.formats_ = GeneratedMessageLite.mutableCopy(this.formats_);
                                    }
                                    this.formats_.add(readStringRequireUtf8);
                                } else if (readTag == 18) {
                                    if (!this.resolutions_.isModifiable()) {
                                        this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
                                    }
                                    this.resolutions_.add((Resolution) codedInputStream.readMessage(Resolution.parser(), extensionRegistryLite));
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
                        synchronized (ImageConfigurations.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public String getFormats(int i) {
            return this.formats_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public ByteString getFormatsBytes(int i) {
            return ByteString.copyFromUtf8(this.formats_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public int getFormatsCount() {
            return this.formats_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public List<String> getFormatsList() {
            return this.formats_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public Resolution getResolutions(int i) {
            return this.resolutions_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public int getResolutionsCount() {
            return this.resolutions_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
        public List<Resolution> getResolutionsList() {
            return this.resolutions_;
        }

        public ResolutionOrBuilder getResolutionsOrBuilder(int i) {
            return this.resolutions_.get(i);
        }

        public List<? extends ResolutionOrBuilder> getResolutionsOrBuilderList() {
            return this.resolutions_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.formats_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.formats_.get(i3));
            }
            int size = getFormatsList().size() + i2;
            for (int i4 = 0; i4 < this.resolutions_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(2, this.resolutions_.get(i4));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.formats_.size(); i++) {
                codedOutputStream.writeString(1, this.formats_.get(i));
            }
            for (int i2 = 0; i2 < this.resolutions_.size(); i2++) {
                codedOutputStream.writeMessage(2, this.resolutions_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ImageConfigurations, Builder> implements ImageConfigurationsOrBuilder {
            private Builder() {
                super(ImageConfigurations.DEFAULT_INSTANCE);
            }

            public Builder addAllFormats(Iterable<String> iterable) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addAllFormats(iterable);
                return this;
            }

            public Builder addAllResolutions(Iterable<? extends Resolution> iterable) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addAllResolutions(iterable);
                return this;
            }

            public Builder addFormats(String str) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addFormats(str);
                return this;
            }

            public Builder addFormatsBytes(ByteString byteString) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addFormatsBytes(byteString);
                return this;
            }

            public Builder addResolutions(Resolution resolution) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addResolutions(resolution);
                return this;
            }

            public Builder clearFormats() {
                copyOnWrite();
                ((ImageConfigurations) this.instance).clearFormats();
                return this;
            }

            public Builder clearResolutions() {
                copyOnWrite();
                ((ImageConfigurations) this.instance).clearResolutions();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public String getFormats(int i) {
                return ((ImageConfigurations) this.instance).getFormats(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public ByteString getFormatsBytes(int i) {
                return ((ImageConfigurations) this.instance).getFormatsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public int getFormatsCount() {
                return ((ImageConfigurations) this.instance).getFormatsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public List<String> getFormatsList() {
                return Collections.unmodifiableList(((ImageConfigurations) this.instance).getFormatsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public Resolution getResolutions(int i) {
                return ((ImageConfigurations) this.instance).getResolutions(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public int getResolutionsCount() {
                return ((ImageConfigurations) this.instance).getResolutionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageConfigurationsOrBuilder
            public List<Resolution> getResolutionsList() {
                return Collections.unmodifiableList(((ImageConfigurations) this.instance).getResolutionsList());
            }

            public Builder removeResolutions(int i) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).removeResolutions(i);
                return this;
            }

            public Builder setFormats(int i, String str) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).setFormats(i, str);
                return this;
            }

            public Builder setResolutions(int i, Resolution resolution) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).setResolutions(i, resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addResolutions(int i, Resolution resolution) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addResolutions(i, resolution);
                return this;
            }

            public Builder setResolutions(int i, Resolution.Builder builder) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).setResolutions(i, builder);
                return this;
            }

            public Builder addResolutions(Resolution.Builder builder) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addResolutions(builder);
                return this;
            }

            public Builder addResolutions(int i, Resolution.Builder builder) {
                copyOnWrite();
                ((ImageConfigurations) this.instance).addResolutions(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(ImageConfigurations imageConfigurations) {
            return DEFAULT_INSTANCE.createBuilder(imageConfigurations);
        }

        public static ImageConfigurations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageConfigurations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ImageConfigurations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImageConfigurations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImageConfigurations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImageConfigurations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImageConfigurations parseFrom(InputStream inputStream) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, resolution);
        }

        public static ImageConfigurations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, resolution);
        }

        public static ImageConfigurations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImageConfigurations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(resolution);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageSettings extends GeneratedMessageLite<ImageSettings, Builder> implements ImageSettingsOrBuilder {
        private static final ImageSettings DEFAULT_INSTANCE;
        public static final int FORMAT_FIELD_NUMBER = 1;
        private static volatile Parser<ImageSettings> PARSER = null;
        public static final int RESOLUTION_FIELD_NUMBER = 2;
        private String format_ = "";
        private Resolution resolution_;

        static {
            ImageSettings imageSettings = new ImageSettings();
            DEFAULT_INSTANCE = imageSettings;
            imageSettings.makeImmutable();
        }

        private ImageSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormat() {
            this.format_ = getDefaultInstance().getFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolution() {
            this.resolution_ = null;
        }

        public static ImageSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResolution(Resolution resolution) {
            Resolution resolution2 = this.resolution_;
            if (resolution2 == null || resolution2 == Resolution.getDefaultInstance()) {
                this.resolution_ = resolution;
            } else {
                this.resolution_ = Resolution.newBuilder(this.resolution_).mergeFrom((Resolution.Builder) resolution).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImageSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImageSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormat(String str) {
            str.getClass();
            this.format_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormatBytes(ByteString byteString) {
            this.format_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Resolution.Builder builder) {
            this.resolution_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImageSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ImageSettings imageSettings = (ImageSettings) obj2;
                    this.format_ = visitor.visitString(!this.format_.isEmpty(), this.format_, !imageSettings.format_.isEmpty(), imageSettings.format_);
                    this.resolution_ = (Resolution) visitor.visitMessage(this.resolution_, imageSettings.resolution_);
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
                                    this.format_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    Resolution resolution = this.resolution_;
                                    Resolution.Builder builder = resolution != null ? resolution.toBuilder() : null;
                                    Resolution resolution2 = (Resolution) codedInputStream.readMessage(Resolution.parser(), extensionRegistryLite);
                                    this.resolution_ = resolution2;
                                    if (builder != null) {
                                        builder.mergeFrom((Resolution.Builder) resolution2);
                                        this.resolution_ = builder.buildPartial();
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
                        synchronized (ImageSettings.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
        public String getFormat() {
            return this.format_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
        public ByteString getFormatBytes() {
            return ByteString.copyFromUtf8(this.format_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
        public Resolution getResolution() {
            Resolution resolution = this.resolution_;
            return resolution == null ? Resolution.getDefaultInstance() : resolution;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.format_.isEmpty() ? CodedOutputStream.computeStringSize(1, getFormat()) : 0;
            if (this.resolution_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getResolution());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
        public boolean hasResolution() {
            return this.resolution_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.format_.isEmpty()) {
                codedOutputStream.writeString(1, getFormat());
            }
            if (this.resolution_ != null) {
                codedOutputStream.writeMessage(2, getResolution());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ImageSettings, Builder> implements ImageSettingsOrBuilder {
            private Builder() {
                super(ImageSettings.DEFAULT_INSTANCE);
            }

            public Builder clearFormat() {
                copyOnWrite();
                ((ImageSettings) this.instance).clearFormat();
                return this;
            }

            public Builder clearResolution() {
                copyOnWrite();
                ((ImageSettings) this.instance).clearResolution();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
            public String getFormat() {
                return ((ImageSettings) this.instance).getFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
            public ByteString getFormatBytes() {
                return ((ImageSettings) this.instance).getFormatBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
            public Resolution getResolution() {
                return ((ImageSettings) this.instance).getResolution();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ImageSettingsOrBuilder
            public boolean hasResolution() {
                return ((ImageSettings) this.instance).hasResolution();
            }

            public Builder mergeResolution(Resolution resolution) {
                copyOnWrite();
                ((ImageSettings) this.instance).mergeResolution(resolution);
                return this;
            }

            public Builder setFormat(String str) {
                copyOnWrite();
                ((ImageSettings) this.instance).setFormat(str);
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((ImageSettings) this.instance).setFormatBytes(byteString);
                return this;
            }

            public Builder setResolution(Resolution resolution) {
                copyOnWrite();
                ((ImageSettings) this.instance).setResolution(resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setResolution(Resolution.Builder builder) {
                copyOnWrite();
                ((ImageSettings) this.instance).setResolution(builder);
                return this;
            }
        }

        public static Builder newBuilder(ImageSettings imageSettings) {
            return DEFAULT_INSTANCE.createBuilder(imageSettings);
        }

        public static ImageSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Resolution resolution) {
            resolution.getClass();
            this.resolution_ = resolution;
        }

        public static ImageSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImageSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImageSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImageSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImageSettings parseFrom(InputStream inputStream) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImageSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyCameraAction extends GeneratedMessageLite<NotifyCameraAction, Builder> implements NotifyCameraActionOrBuilder {
        public static final int ACTION_MESSAGE_FIELD_NUMBER = 1;
        private static final NotifyCameraAction DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 2;
        public static final int INITIATOR_FIELD_NUMBER = 3;
        private static volatile Parser<NotifyCameraAction> PARSER;
        private CameraActionInitiator initiator_;
        private int messageTypeCase_ = 0;
        private Object messageType_;

        static {
            NotifyCameraAction notifyCameraAction = new NotifyCameraAction();
            DEFAULT_INSTANCE = notifyCameraAction;
            notifyCameraAction.makeImmutable();
        }

        private NotifyCameraAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionMessage() {
            if (this.messageTypeCase_ == 1) {
                this.messageTypeCase_ = 0;
                this.messageType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            if (this.messageTypeCase_ == 2) {
                this.messageTypeCase_ = 0;
                this.messageType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageTypeCase_ = 0;
            this.messageType_ = null;
        }

        public static NotifyCameraAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeActionMessage(CameraActionMessage cameraActionMessage) {
            if (this.messageTypeCase_ != 1 || this.messageType_ == CameraActionMessage.getDefaultInstance()) {
                this.messageType_ = cameraActionMessage;
            } else {
                this.messageType_ = CameraActionMessage.newBuilder((CameraActionMessage) this.messageType_).mergeFrom((CameraActionMessage.Builder) cameraActionMessage).buildPartial();
            }
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(CameraActionFailure cameraActionFailure) {
            if (this.messageTypeCase_ != 2 || this.messageType_ == CameraActionFailure.getDefaultInstance()) {
                this.messageType_ = cameraActionFailure;
            } else {
                this.messageType_ = CameraActionFailure.newBuilder((CameraActionFailure) this.messageType_).mergeFrom((CameraActionFailure.Builder) cameraActionFailure).buildPartial();
            }
            this.messageTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyCameraAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCameraAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyCameraAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionMessage(CameraActionMessage.Builder builder) {
            this.messageType_ = builder.build();
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(CameraActionFailure.Builder builder) {
            this.messageType_ = builder.build();
            this.messageTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyCameraAction();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyCameraAction notifyCameraAction = (NotifyCameraAction) obj2;
                    this.initiator_ = (CameraActionInitiator) visitor.visitMessage(this.initiator_, notifyCameraAction.initiator_);
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Camera$NotifyCameraAction$MessageTypeCase[notifyCameraAction.getMessageTypeCase().ordinal()];
                    if (i2 == 1) {
                        this.messageType_ = visitor.visitOneofMessage(this.messageTypeCase_ == 1, this.messageType_, notifyCameraAction.messageType_);
                    } else if (i2 == 2) {
                        this.messageType_ = visitor.visitOneofMessage(this.messageTypeCase_ == 2, this.messageType_, notifyCameraAction.messageType_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.messageTypeCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = notifyCameraAction.messageTypeCase_) != 0) {
                        this.messageTypeCase_ = i;
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
                                    CameraActionMessage.Builder builder = this.messageTypeCase_ == 1 ? ((CameraActionMessage) this.messageType_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(CameraActionMessage.parser(), extensionRegistryLite);
                                    this.messageType_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionMessage.Builder) readMessage);
                                        this.messageType_ = builder.buildPartial();
                                    }
                                    this.messageTypeCase_ = 1;
                                } else if (readTag == 18) {
                                    CameraActionFailure.Builder builder2 = this.messageTypeCase_ == 2 ? ((CameraActionFailure) this.messageType_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(CameraActionFailure.parser(), extensionRegistryLite);
                                    this.messageType_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((CameraActionFailure.Builder) readMessage2);
                                        this.messageType_ = builder2.buildPartial();
                                    }
                                    this.messageTypeCase_ = 2;
                                } else if (readTag == 26) {
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder3 = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder3.buildPartial();
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
                        synchronized (NotifyCameraAction.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public CameraActionMessage getActionMessage() {
            return this.messageTypeCase_ == 1 ? (CameraActionMessage) this.messageType_ : CameraActionMessage.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public CameraActionFailure getFailure() {
            return this.messageTypeCase_ == 2 ? (CameraActionFailure) this.messageType_ : CameraActionFailure.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public MessageTypeCase getMessageTypeCase() {
            return MessageTypeCase.forNumber(this.messageTypeCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.messageTypeCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (CameraActionMessage) this.messageType_) : 0;
            if (this.messageTypeCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (CameraActionFailure) this.messageType_);
            }
            if (this.initiator_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getInitiator());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public boolean hasActionMessage() {
            return this.messageTypeCase_ == 1;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public boolean hasFailure() {
            return this.messageTypeCase_ == 2;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.messageTypeCase_ == 1) {
                codedOutputStream.writeMessage(1, (CameraActionMessage) this.messageType_);
            }
            if (this.messageTypeCase_ == 2) {
                codedOutputStream.writeMessage(2, (CameraActionFailure) this.messageType_);
            }
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(3, getInitiator());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyCameraAction, Builder> implements NotifyCameraActionOrBuilder {
            private Builder() {
                super(NotifyCameraAction.DEFAULT_INSTANCE);
            }

            public Builder clearActionMessage() {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).clearActionMessage();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).clearFailure();
                return this;
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).clearInitiator();
                return this;
            }

            public Builder clearMessageType() {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).clearMessageType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public CameraActionMessage getActionMessage() {
                return ((NotifyCameraAction) this.instance).getActionMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public CameraActionFailure getFailure() {
                return ((NotifyCameraAction) this.instance).getFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((NotifyCameraAction) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public MessageTypeCase getMessageTypeCase() {
                return ((NotifyCameraAction) this.instance).getMessageTypeCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public boolean hasActionMessage() {
                return ((NotifyCameraAction) this.instance).hasActionMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public boolean hasFailure() {
                return ((NotifyCameraAction) this.instance).hasFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.NotifyCameraActionOrBuilder
            public boolean hasInitiator() {
                return ((NotifyCameraAction) this.instance).hasInitiator();
            }

            public Builder mergeActionMessage(CameraActionMessage cameraActionMessage) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).mergeActionMessage(cameraActionMessage);
                return this;
            }

            public Builder mergeFailure(CameraActionFailure cameraActionFailure) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).mergeFailure(cameraActionFailure);
                return this;
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setActionMessage(CameraActionMessage cameraActionMessage) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setActionMessage(cameraActionMessage);
                return this;
            }

            public Builder setFailure(CameraActionFailure cameraActionFailure) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setFailure(cameraActionFailure);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setActionMessage(CameraActionMessage.Builder builder) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setActionMessage(builder);
                return this;
            }

            public Builder setFailure(CameraActionFailure.Builder builder) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setFailure(builder);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((NotifyCameraAction) this.instance).setInitiator(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MessageTypeCase implements Internal.EnumLite {
            ACTION_MESSAGE(1),
            FAILURE(2),
            MESSAGETYPE_NOT_SET(0);

            private final int value;

            MessageTypeCase(int i) {
                this.value = i;
            }

            public static MessageTypeCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGETYPE_NOT_SET;
                }
                if (i == 1) {
                    return ACTION_MESSAGE;
                }
                if (i != 2) {
                    return null;
                }
                return FAILURE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageTypeCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NotifyCameraAction notifyCameraAction) {
            return DEFAULT_INSTANCE.createBuilder(notifyCameraAction);
        }

        public static NotifyCameraAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyCameraAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static NotifyCameraAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionMessage(CameraActionMessage cameraActionMessage) {
            cameraActionMessage.getClass();
            this.messageType_ = cameraActionMessage;
            this.messageTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(CameraActionFailure cameraActionFailure) {
            cameraActionFailure.getClass();
            this.messageType_ = cameraActionFailure;
            this.messageTypeCase_ = 2;
        }

        public static NotifyCameraAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyCameraAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyCameraAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyCameraAction parseFrom(InputStream inputStream) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCameraAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyCameraAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyCameraAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyCameraAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetCameraSettings extends GeneratedMessageLite<SetCameraSettings, Builder> implements SetCameraSettingsOrBuilder {
        private static final SetCameraSettings DEFAULT_INSTANCE;
        private static volatile Parser<SetCameraSettings> PARSER = null;
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<CameraSettings> settings_ = GeneratedMessageLite.emptyProtobufList();

        static {
            SetCameraSettings setCameraSettings = new SetCameraSettings();
            DEFAULT_INSTANCE = setCameraSettings;
            setCameraSettings.makeImmutable();
        }

        private SetCameraSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSettings(Iterable<? extends CameraSettings> iterable) {
            ensureSettingsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.settings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettings() {
            this.settings_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSettingsIsMutable() {
            if (this.settings_.isModifiable()) {
                return;
            }
            this.settings_ = GeneratedMessageLite.mutableCopy(this.settings_);
        }

        public static SetCameraSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetCameraSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetCameraSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetCameraSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSettings(int i) {
            ensureSettingsIsMutable();
            this.settings_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(int i, CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetCameraSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.settings_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.settings_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.settings_, ((SetCameraSettings) obj2).settings_);
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
                                    if (!this.settings_.isModifiable()) {
                                        this.settings_ = GeneratedMessageLite.mutableCopy(this.settings_);
                                    }
                                    this.settings_.add((CameraSettings) codedInputStream.readMessage(CameraSettings.parser(), extensionRegistryLite));
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
                        synchronized (SetCameraSettings.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.settings_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.settings_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
        public CameraSettings getSettings(int i) {
            return this.settings_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
        public int getSettingsCount() {
            return this.settings_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
        public List<CameraSettings> getSettingsList() {
            return this.settings_;
        }

        public CameraSettingsOrBuilder getSettingsOrBuilder(int i) {
            return this.settings_.get(i);
        }

        public List<? extends CameraSettingsOrBuilder> getSettingsOrBuilderList() {
            return this.settings_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.settings_.size(); i++) {
                codedOutputStream.writeMessage(1, this.settings_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetCameraSettings, Builder> implements SetCameraSettingsOrBuilder {
            private Builder() {
                super(SetCameraSettings.DEFAULT_INSTANCE);
            }

            public Builder addAllSettings(Iterable<? extends CameraSettings> iterable) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).addAllSettings(iterable);
                return this;
            }

            public Builder addSettings(CameraSettings cameraSettings) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).addSettings(cameraSettings);
                return this;
            }

            public Builder clearSettings() {
                copyOnWrite();
                ((SetCameraSettings) this.instance).clearSettings();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
            public CameraSettings getSettings(int i) {
                return ((SetCameraSettings) this.instance).getSettings(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
            public int getSettingsCount() {
                return ((SetCameraSettings) this.instance).getSettingsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsOrBuilder
            public List<CameraSettings> getSettingsList() {
                return Collections.unmodifiableList(((SetCameraSettings) this.instance).getSettingsList());
            }

            public Builder removeSettings(int i) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).removeSettings(i);
                return this;
            }

            public Builder setSettings(int i, CameraSettings cameraSettings) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).setSettings(i, cameraSettings);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSettings(int i, CameraSettings cameraSettings) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).addSettings(i, cameraSettings);
                return this;
            }

            public Builder setSettings(int i, CameraSettings.Builder builder) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).setSettings(i, builder);
                return this;
            }

            public Builder addSettings(CameraSettings.Builder builder) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).addSettings(builder);
                return this;
            }

            public Builder addSettings(int i, CameraSettings.Builder builder) {
                copyOnWrite();
                ((SetCameraSettings) this.instance).addSettings(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(SetCameraSettings setCameraSettings) {
            return DEFAULT_INSTANCE.createBuilder(setCameraSettings);
        }

        public static SetCameraSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetCameraSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetCameraSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetCameraSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetCameraSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetCameraSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetCameraSettings parseFrom(InputStream inputStream) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(int i, CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.add(i, cameraSettings);
        }

        public static SetCameraSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(int i, CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.set(i, cameraSettings);
        }

        public static SetCameraSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetCameraSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(CameraSettings cameraSettings) {
            cameraSettings.getClass();
            ensureSettingsIsMutable();
            this.settings_.add(cameraSettings);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSettings(int i, CameraSettings.Builder builder) {
            ensureSettingsIsMutable();
            this.settings_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartAutoCaptureSession extends GeneratedMessageLite<StartAutoCaptureSession, Builder> implements StartAutoCaptureSessionOrBuilder {
        public static final int CAPTURE_TYPE_FIELD_NUMBER = 2;
        private static final StartAutoCaptureSession DEFAULT_INSTANCE;
        public static final int INITIATOR_FIELD_NUMBER = 1;
        private static volatile Parser<StartAutoCaptureSession> PARSER;
        private int captureType_;
        private CameraActionInitiator initiator_;

        static {
            StartAutoCaptureSession startAutoCaptureSession = new StartAutoCaptureSession();
            DEFAULT_INSTANCE = startAutoCaptureSession;
            startAutoCaptureSession.makeImmutable();
        }

        private StartAutoCaptureSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureType() {
            this.captureType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        public static StartAutoCaptureSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartAutoCaptureSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAutoCaptureSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartAutoCaptureSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureType(AutoCaptureType autoCaptureType) {
            autoCaptureType.getClass();
            this.captureType_ = autoCaptureType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureTypeValue(int i) {
            this.captureType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartAutoCaptureSession();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartAutoCaptureSession startAutoCaptureSession = (StartAutoCaptureSession) obj2;
                    this.initiator_ = (CameraActionInitiator) visitor.visitMessage(this.initiator_, startAutoCaptureSession.initiator_);
                    int i = this.captureType_;
                    boolean z = i != 0;
                    int i2 = startAutoCaptureSession.captureType_;
                    this.captureType_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder.buildPartial();
                                    }
                                } else if (readTag == 16) {
                                    this.captureType_ = codedInputStream.readEnum();
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
                        synchronized (StartAutoCaptureSession.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
        public AutoCaptureType getCaptureType() {
            AutoCaptureType forNumber = AutoCaptureType.forNumber(this.captureType_);
            return forNumber == null ? AutoCaptureType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
        public int getCaptureTypeValue() {
            return this.captureType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.initiator_ != null ? CodedOutputStream.computeMessageSize(1, getInitiator()) : 0;
            if (this.captureType_ != AutoCaptureType.AUTO_CAPTURE_TYPE_UNKNOWN.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(2, this.captureType_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(1, getInitiator());
            }
            if (this.captureType_ != AutoCaptureType.AUTO_CAPTURE_TYPE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.captureType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartAutoCaptureSession, Builder> implements StartAutoCaptureSessionOrBuilder {
            private Builder() {
                super(StartAutoCaptureSession.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureType() {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).clearCaptureType();
                return this;
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).clearInitiator();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
            public AutoCaptureType getCaptureType() {
                return ((StartAutoCaptureSession) this.instance).getCaptureType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
            public int getCaptureTypeValue() {
                return ((StartAutoCaptureSession) this.instance).getCaptureTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((StartAutoCaptureSession) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartAutoCaptureSessionOrBuilder
            public boolean hasInitiator() {
                return ((StartAutoCaptureSession) this.instance).hasInitiator();
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setCaptureType(AutoCaptureType autoCaptureType) {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).setCaptureType(autoCaptureType);
                return this;
            }

            public Builder setCaptureTypeValue(int i) {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).setCaptureTypeValue(i);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((StartAutoCaptureSession) this.instance).setInitiator(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartAutoCaptureSession startAutoCaptureSession) {
            return DEFAULT_INSTANCE.createBuilder(startAutoCaptureSession);
        }

        public static StartAutoCaptureSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAutoCaptureSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static StartAutoCaptureSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartAutoCaptureSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartAutoCaptureSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartAutoCaptureSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartAutoCaptureSession parseFrom(InputStream inputStream) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAutoCaptureSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAutoCaptureSession parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartAutoCaptureSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartVideoCapture extends GeneratedMessageLite<StartVideoCapture, Builder> implements StartVideoCaptureOrBuilder {
        private static final StartVideoCapture DEFAULT_INSTANCE;
        public static final int INITIATOR_FIELD_NUMBER = 1;
        private static volatile Parser<StartVideoCapture> PARSER;
        private CameraActionInitiator initiator_;

        static {
            StartVideoCapture startVideoCapture = new StartVideoCapture();
            DEFAULT_INSTANCE = startVideoCapture;
            startVideoCapture.makeImmutable();
        }

        private StartVideoCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        public static StartVideoCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartVideoCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVideoCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartVideoCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartVideoCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.initiator_ = (CameraActionInitiator) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.initiator_, ((StartVideoCapture) obj2).initiator_);
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
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder.buildPartial();
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
                        synchronized (StartVideoCapture.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartVideoCaptureOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.initiator_ != null ? CodedOutputStream.computeMessageSize(1, getInitiator()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StartVideoCaptureOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(1, getInitiator());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartVideoCapture, Builder> implements StartVideoCaptureOrBuilder {
            private Builder() {
                super(StartVideoCapture.DEFAULT_INSTANCE);
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((StartVideoCapture) this.instance).clearInitiator();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartVideoCaptureOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((StartVideoCapture) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StartVideoCaptureOrBuilder
            public boolean hasInitiator() {
                return ((StartVideoCapture) this.instance).hasInitiator();
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StartVideoCapture) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StartVideoCapture) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((StartVideoCapture) this.instance).setInitiator(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartVideoCapture startVideoCapture) {
            return DEFAULT_INSTANCE.createBuilder(startVideoCapture);
        }

        public static StartVideoCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVideoCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static StartVideoCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartVideoCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartVideoCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartVideoCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartVideoCapture parseFrom(InputStream inputStream) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVideoCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVideoCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartVideoCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopAutoCaptureSession extends GeneratedMessageLite<StopAutoCaptureSession, Builder> implements StopAutoCaptureSessionOrBuilder {
        private static final StopAutoCaptureSession DEFAULT_INSTANCE;
        public static final int INITIATOR_FIELD_NUMBER = 1;
        private static volatile Parser<StopAutoCaptureSession> PARSER;
        private CameraActionInitiator initiator_;

        static {
            StopAutoCaptureSession stopAutoCaptureSession = new StopAutoCaptureSession();
            DEFAULT_INSTANCE = stopAutoCaptureSession;
            stopAutoCaptureSession.makeImmutable();
        }

        private StopAutoCaptureSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        public static StopAutoCaptureSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopAutoCaptureSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopAutoCaptureSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopAutoCaptureSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopAutoCaptureSession();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.initiator_ = (CameraActionInitiator) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.initiator_, ((StopAutoCaptureSession) obj2).initiator_);
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
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder.buildPartial();
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
                        synchronized (StopAutoCaptureSession.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopAutoCaptureSessionOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.initiator_ != null ? CodedOutputStream.computeMessageSize(1, getInitiator()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopAutoCaptureSessionOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(1, getInitiator());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopAutoCaptureSession, Builder> implements StopAutoCaptureSessionOrBuilder {
            private Builder() {
                super(StopAutoCaptureSession.DEFAULT_INSTANCE);
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((StopAutoCaptureSession) this.instance).clearInitiator();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopAutoCaptureSessionOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((StopAutoCaptureSession) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopAutoCaptureSessionOrBuilder
            public boolean hasInitiator() {
                return ((StopAutoCaptureSession) this.instance).hasInitiator();
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StopAutoCaptureSession) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StopAutoCaptureSession) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((StopAutoCaptureSession) this.instance).setInitiator(builder);
                return this;
            }
        }

        public static Builder newBuilder(StopAutoCaptureSession stopAutoCaptureSession) {
            return DEFAULT_INSTANCE.createBuilder(stopAutoCaptureSession);
        }

        public static StopAutoCaptureSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopAutoCaptureSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static StopAutoCaptureSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopAutoCaptureSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopAutoCaptureSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopAutoCaptureSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopAutoCaptureSession parseFrom(InputStream inputStream) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopAutoCaptureSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopAutoCaptureSession parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopAutoCaptureSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopAutoCaptureSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopVideoCapture extends GeneratedMessageLite<StopVideoCapture, Builder> implements StopVideoCaptureOrBuilder {
        public static final int CAPTURE_ID_FIELD_NUMBER = 2;
        private static final StopVideoCapture DEFAULT_INSTANCE;
        public static final int INITIATOR_FIELD_NUMBER = 1;
        private static volatile Parser<StopVideoCapture> PARSER;
        private String captureId_ = "";
        private CameraActionInitiator initiator_;

        static {
            StopVideoCapture stopVideoCapture = new StopVideoCapture();
            DEFAULT_INSTANCE = stopVideoCapture;
            stopVideoCapture.makeImmutable();
        }

        private StopVideoCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureId() {
            this.captureId_ = getDefaultInstance().getCaptureId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        public static StopVideoCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(CameraActionInitiator cameraActionInitiator) {
            CameraActionInitiator cameraActionInitiator2 = this.initiator_;
            if (cameraActionInitiator2 == null || cameraActionInitiator2 == CameraActionInitiator.getDefaultInstance()) {
                this.initiator_ = cameraActionInitiator;
            } else {
                this.initiator_ = CameraActionInitiator.newBuilder(this.initiator_).mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopVideoCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVideoCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopVideoCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureId(String str) {
            str.getClass();
            this.captureId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureIdBytes(ByteString byteString) {
            this.captureId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopVideoCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StopVideoCapture stopVideoCapture = (StopVideoCapture) obj2;
                    this.initiator_ = (CameraActionInitiator) visitor.visitMessage(this.initiator_, stopVideoCapture.initiator_);
                    this.captureId_ = visitor.visitString(!this.captureId_.isEmpty(), this.captureId_, !stopVideoCapture.captureId_.isEmpty(), stopVideoCapture.captureId_);
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
                                    CameraActionInitiator cameraActionInitiator = this.initiator_;
                                    CameraActionInitiator.Builder builder = cameraActionInitiator != null ? cameraActionInitiator.toBuilder() : null;
                                    CameraActionInitiator cameraActionInitiator2 = (CameraActionInitiator) codedInputStream.readMessage(CameraActionInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = cameraActionInitiator2;
                                    if (builder != null) {
                                        builder.mergeFrom((CameraActionInitiator.Builder) cameraActionInitiator2);
                                        this.initiator_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.captureId_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (StopVideoCapture.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
        public String getCaptureId() {
            return this.captureId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
        public ByteString getCaptureIdBytes() {
            return ByteString.copyFromUtf8(this.captureId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
        public CameraActionInitiator getInitiator() {
            CameraActionInitiator cameraActionInitiator = this.initiator_;
            return cameraActionInitiator == null ? CameraActionInitiator.getDefaultInstance() : cameraActionInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.initiator_ != null ? CodedOutputStream.computeMessageSize(1, getInitiator()) : 0;
            if (!this.captureId_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getCaptureId());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(1, getInitiator());
            }
            if (!this.captureId_.isEmpty()) {
                codedOutputStream.writeString(2, getCaptureId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopVideoCapture, Builder> implements StopVideoCaptureOrBuilder {
            private Builder() {
                super(StopVideoCapture.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureId() {
                copyOnWrite();
                ((StopVideoCapture) this.instance).clearCaptureId();
                return this;
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((StopVideoCapture) this.instance).clearInitiator();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
            public String getCaptureId() {
                return ((StopVideoCapture) this.instance).getCaptureId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
            public ByteString getCaptureIdBytes() {
                return ((StopVideoCapture) this.instance).getCaptureIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
            public CameraActionInitiator getInitiator() {
                return ((StopVideoCapture) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.StopVideoCaptureOrBuilder
            public boolean hasInitiator() {
                return ((StopVideoCapture) this.instance).hasInitiator();
            }

            public Builder mergeInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StopVideoCapture) this.instance).mergeInitiator(cameraActionInitiator);
                return this;
            }

            public Builder setCaptureId(String str) {
                copyOnWrite();
                ((StopVideoCapture) this.instance).setCaptureId(str);
                return this;
            }

            public Builder setCaptureIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StopVideoCapture) this.instance).setCaptureIdBytes(byteString);
                return this;
            }

            public Builder setInitiator(CameraActionInitiator cameraActionInitiator) {
                copyOnWrite();
                ((StopVideoCapture) this.instance).setInitiator(cameraActionInitiator);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setInitiator(CameraActionInitiator.Builder builder) {
                copyOnWrite();
                ((StopVideoCapture) this.instance).setInitiator(builder);
                return this;
            }
        }

        public static Builder newBuilder(StopVideoCapture stopVideoCapture) {
            return DEFAULT_INSTANCE.createBuilder(stopVideoCapture);
        }

        public static StopVideoCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVideoCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(CameraActionInitiator cameraActionInitiator) {
            cameraActionInitiator.getClass();
            this.initiator_ = cameraActionInitiator;
        }

        public static StopVideoCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopVideoCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopVideoCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopVideoCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopVideoCapture parseFrom(InputStream inputStream) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVideoCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVideoCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopVideoCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVideoCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VideoConfigurations extends GeneratedMessageLite<VideoConfigurations, Builder> implements VideoConfigurationsOrBuilder {
        public static final int BIT_RATES_FIELD_NUMBER = 5;
        public static final int CONTAINER_FORMATS_FIELD_NUMBER = 2;
        private static final VideoConfigurations DEFAULT_INSTANCE;
        public static final int FORMATS_FIELD_NUMBER = 1;
        public static final int FRAME_RATES_FIELD_NUMBER = 4;
        public static final int MAX_LENGTH_FIELD_NUMBER = 6;
        private static volatile Parser<VideoConfigurations> PARSER = null;
        public static final int RESOLUTIONS_FIELD_NUMBER = 3;
        private int bitField0_;
        private int maxLength_;
        private int frameRatesMemoizedSerializedSize = -1;
        private int bitRatesMemoizedSerializedSize = -1;
        private Internal.ProtobufList<String> formats_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> containerFormats_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Resolution> resolutions_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList frameRates_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList bitRates_ = GeneratedMessageLite.emptyIntList();

        static {
            VideoConfigurations videoConfigurations = new VideoConfigurations();
            DEFAULT_INSTANCE = videoConfigurations;
            videoConfigurations.makeImmutable();
        }

        private VideoConfigurations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBitRates(Iterable<? extends Integer> iterable) {
            ensureBitRatesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.bitRates_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContainerFormats(Iterable<String> iterable) {
            ensureContainerFormatsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.containerFormats_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFormats(Iterable<String> iterable) {
            ensureFormatsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.formats_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFrameRates(Iterable<? extends Integer> iterable) {
            ensureFrameRatesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.frameRates_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResolutions(Iterable<? extends Resolution> iterable) {
            ensureResolutionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.resolutions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBitRates(int i) {
            ensureBitRatesIsMutable();
            this.bitRates_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContainerFormats(String str) {
            str.getClass();
            ensureContainerFormatsIsMutable();
            this.containerFormats_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContainerFormatsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureContainerFormatsIsMutable();
            this.containerFormats_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormats(String str) {
            str.getClass();
            ensureFormatsIsMutable();
            this.formats_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureFormatsIsMutable();
            this.formats_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFrameRates(int i) {
            ensureFrameRatesIsMutable();
            this.frameRates_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitRates() {
            this.bitRates_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContainerFormats() {
            this.containerFormats_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormats() {
            this.formats_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRates() {
            this.frameRates_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLength() {
            this.maxLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolutions() {
            this.resolutions_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBitRatesIsMutable() {
            if (this.bitRates_.isModifiable()) {
                return;
            }
            this.bitRates_ = GeneratedMessageLite.mutableCopy(this.bitRates_);
        }

        private void ensureContainerFormatsIsMutable() {
            if (this.containerFormats_.isModifiable()) {
                return;
            }
            this.containerFormats_ = GeneratedMessageLite.mutableCopy(this.containerFormats_);
        }

        private void ensureFormatsIsMutable() {
            if (this.formats_.isModifiable()) {
                return;
            }
            this.formats_ = GeneratedMessageLite.mutableCopy(this.formats_);
        }

        private void ensureFrameRatesIsMutable() {
            if (this.frameRates_.isModifiable()) {
                return;
            }
            this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
        }

        private void ensureResolutionsIsMutable() {
            if (this.resolutions_.isModifiable()) {
                return;
            }
            this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
        }

        public static VideoConfigurations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VideoConfigurations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoConfigurations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VideoConfigurations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResolutions(int i) {
            ensureResolutionsIsMutable();
            this.resolutions_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitRates(int i, int i2) {
            ensureBitRatesIsMutable();
            this.bitRates_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContainerFormats(int i, String str) {
            str.getClass();
            ensureContainerFormatsIsMutable();
            this.containerFormats_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormats(int i, String str) {
            str.getClass();
            ensureFormatsIsMutable();
            this.formats_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRates(int i, int i2) {
            ensureFrameRatesIsMutable();
            this.frameRates_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLength(int i) {
            this.maxLength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoConfigurations();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.formats_.makeImmutable();
                    this.containerFormats_.makeImmutable();
                    this.resolutions_.makeImmutable();
                    this.frameRates_.makeImmutable();
                    this.bitRates_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VideoConfigurations videoConfigurations = (VideoConfigurations) obj2;
                    this.formats_ = visitor.visitList(this.formats_, videoConfigurations.formats_);
                    this.containerFormats_ = visitor.visitList(this.containerFormats_, videoConfigurations.containerFormats_);
                    this.resolutions_ = visitor.visitList(this.resolutions_, videoConfigurations.resolutions_);
                    this.frameRates_ = visitor.visitIntList(this.frameRates_, videoConfigurations.frameRates_);
                    this.bitRates_ = visitor.visitIntList(this.bitRates_, videoConfigurations.bitRates_);
                    int i = this.maxLength_;
                    boolean z = i != 0;
                    int i2 = videoConfigurations.maxLength_;
                    this.maxLength_ = visitor.visitInt(z, i, i2 != 0, i2);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= videoConfigurations.bitField0_;
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.formats_.isModifiable()) {
                                        this.formats_ = GeneratedMessageLite.mutableCopy(this.formats_);
                                    }
                                    this.formats_.add(readStringRequireUtf8);
                                } else if (readTag == 18) {
                                    String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                    if (!this.containerFormats_.isModifiable()) {
                                        this.containerFormats_ = GeneratedMessageLite.mutableCopy(this.containerFormats_);
                                    }
                                    this.containerFormats_.add(readStringRequireUtf82);
                                } else if (readTag == 26) {
                                    if (!this.resolutions_.isModifiable()) {
                                        this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
                                    }
                                    this.resolutions_.add((Resolution) codedInputStream.readMessage(Resolution.parser(), extensionRegistryLite));
                                } else if (readTag == 32) {
                                    if (!this.frameRates_.isModifiable()) {
                                        this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
                                    }
                                    this.frameRates_.addInt(codedInputStream.readUInt32());
                                } else if (readTag == 34) {
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.frameRates_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.frameRates_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                } else if (readTag == 40) {
                                    if (!this.bitRates_.isModifiable()) {
                                        this.bitRates_ = GeneratedMessageLite.mutableCopy(this.bitRates_);
                                    }
                                    this.bitRates_.addInt(codedInputStream.readUInt32());
                                } else if (readTag == 42) {
                                    int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.bitRates_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.bitRates_ = GeneratedMessageLite.mutableCopy(this.bitRates_);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.bitRates_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit2);
                                } else if (readTag == 48) {
                                    this.maxLength_ = codedInputStream.readUInt32();
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
                        synchronized (VideoConfigurations.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getBitRates(int i) {
            return this.bitRates_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getBitRatesCount() {
            return this.bitRates_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public List<Integer> getBitRatesList() {
            return this.bitRates_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public String getContainerFormats(int i) {
            return this.containerFormats_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public ByteString getContainerFormatsBytes(int i) {
            return ByteString.copyFromUtf8(this.containerFormats_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getContainerFormatsCount() {
            return this.containerFormats_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public List<String> getContainerFormatsList() {
            return this.containerFormats_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public String getFormats(int i) {
            return this.formats_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public ByteString getFormatsBytes(int i) {
            return ByteString.copyFromUtf8(this.formats_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getFormatsCount() {
            return this.formats_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public List<String> getFormatsList() {
            return this.formats_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getFrameRates(int i) {
            return this.frameRates_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getFrameRatesCount() {
            return this.frameRates_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public List<Integer> getFrameRatesList() {
            return this.frameRates_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getMaxLength() {
            return this.maxLength_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public Resolution getResolutions(int i) {
            return this.resolutions_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public int getResolutionsCount() {
            return this.resolutions_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
        public List<Resolution> getResolutionsList() {
            return this.resolutions_;
        }

        public ResolutionOrBuilder getResolutionsOrBuilder(int i) {
            return this.resolutions_.get(i);
        }

        public List<? extends ResolutionOrBuilder> getResolutionsOrBuilderList() {
            return this.resolutions_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.formats_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.formats_.get(i3));
            }
            int size = getFormatsList().size() + i2;
            int i4 = 0;
            for (int i5 = 0; i5 < this.containerFormats_.size(); i5++) {
                i4 += CodedOutputStream.computeStringSizeNoTag(this.containerFormats_.get(i5));
            }
            int size2 = getContainerFormatsList().size() + size + i4;
            for (int i6 = 0; i6 < this.resolutions_.size(); i6++) {
                size2 += CodedOutputStream.computeMessageSize(3, this.resolutions_.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.frameRates_.size(); i8++) {
                i7 += CodedOutputStream.computeUInt32SizeNoTag(this.frameRates_.getInt(i8));
            }
            int i9 = size2 + i7;
            if (!getFrameRatesList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeInt32SizeNoTag(i7);
            }
            this.frameRatesMemoizedSerializedSize = i7;
            int i10 = 0;
            for (int i11 = 0; i11 < this.bitRates_.size(); i11++) {
                i10 += CodedOutputStream.computeUInt32SizeNoTag(this.bitRates_.getInt(i11));
            }
            int i12 = i9 + i10;
            if (!getBitRatesList().isEmpty()) {
                i12 = i12 + 1 + CodedOutputStream.computeInt32SizeNoTag(i10);
            }
            this.bitRatesMemoizedSerializedSize = i10;
            int i13 = this.maxLength_;
            if (i13 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(6, i13);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i12;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.formats_.size(); i++) {
                codedOutputStream.writeString(1, this.formats_.get(i));
            }
            for (int i2 = 0; i2 < this.containerFormats_.size(); i2++) {
                codedOutputStream.writeString(2, this.containerFormats_.get(i2));
            }
            for (int i3 = 0; i3 < this.resolutions_.size(); i3++) {
                codedOutputStream.writeMessage(3, this.resolutions_.get(i3));
            }
            if (getFrameRatesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(34);
                codedOutputStream.writeUInt32NoTag(this.frameRatesMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.frameRates_.size(); i4++) {
                codedOutputStream.writeUInt32NoTag(this.frameRates_.getInt(i4));
            }
            if (getBitRatesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(42);
                codedOutputStream.writeUInt32NoTag(this.bitRatesMemoizedSerializedSize);
            }
            for (int i5 = 0; i5 < this.bitRates_.size(); i5++) {
                codedOutputStream.writeUInt32NoTag(this.bitRates_.getInt(i5));
            }
            int i6 = this.maxLength_;
            if (i6 != 0) {
                codedOutputStream.writeUInt32(6, i6);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VideoConfigurations, Builder> implements VideoConfigurationsOrBuilder {
            private Builder() {
                super(VideoConfigurations.DEFAULT_INSTANCE);
            }

            public Builder addAllBitRates(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addAllBitRates(iterable);
                return this;
            }

            public Builder addAllContainerFormats(Iterable<String> iterable) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addAllContainerFormats(iterable);
                return this;
            }

            public Builder addAllFormats(Iterable<String> iterable) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addAllFormats(iterable);
                return this;
            }

            public Builder addAllFrameRates(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addAllFrameRates(iterable);
                return this;
            }

            public Builder addAllResolutions(Iterable<? extends Resolution> iterable) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addAllResolutions(iterable);
                return this;
            }

            public Builder addBitRates(int i) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addBitRates(i);
                return this;
            }

            public Builder addContainerFormats(String str) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addContainerFormats(str);
                return this;
            }

            public Builder addContainerFormatsBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addContainerFormatsBytes(byteString);
                return this;
            }

            public Builder addFormats(String str) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addFormats(str);
                return this;
            }

            public Builder addFormatsBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addFormatsBytes(byteString);
                return this;
            }

            public Builder addFrameRates(int i) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addFrameRates(i);
                return this;
            }

            public Builder addResolutions(Resolution resolution) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addResolutions(resolution);
                return this;
            }

            public Builder clearBitRates() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearBitRates();
                return this;
            }

            public Builder clearContainerFormats() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearContainerFormats();
                return this;
            }

            public Builder clearFormats() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearFormats();
                return this;
            }

            public Builder clearFrameRates() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearFrameRates();
                return this;
            }

            public Builder clearMaxLength() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearMaxLength();
                return this;
            }

            public Builder clearResolutions() {
                copyOnWrite();
                ((VideoConfigurations) this.instance).clearResolutions();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getBitRates(int i) {
                return ((VideoConfigurations) this.instance).getBitRates(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getBitRatesCount() {
                return ((VideoConfigurations) this.instance).getBitRatesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public List<Integer> getBitRatesList() {
                return Collections.unmodifiableList(((VideoConfigurations) this.instance).getBitRatesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public String getContainerFormats(int i) {
                return ((VideoConfigurations) this.instance).getContainerFormats(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public ByteString getContainerFormatsBytes(int i) {
                return ((VideoConfigurations) this.instance).getContainerFormatsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getContainerFormatsCount() {
                return ((VideoConfigurations) this.instance).getContainerFormatsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public List<String> getContainerFormatsList() {
                return Collections.unmodifiableList(((VideoConfigurations) this.instance).getContainerFormatsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public String getFormats(int i) {
                return ((VideoConfigurations) this.instance).getFormats(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public ByteString getFormatsBytes(int i) {
                return ((VideoConfigurations) this.instance).getFormatsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getFormatsCount() {
                return ((VideoConfigurations) this.instance).getFormatsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public List<String> getFormatsList() {
                return Collections.unmodifiableList(((VideoConfigurations) this.instance).getFormatsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getFrameRates(int i) {
                return ((VideoConfigurations) this.instance).getFrameRates(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getFrameRatesCount() {
                return ((VideoConfigurations) this.instance).getFrameRatesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public List<Integer> getFrameRatesList() {
                return Collections.unmodifiableList(((VideoConfigurations) this.instance).getFrameRatesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getMaxLength() {
                return ((VideoConfigurations) this.instance).getMaxLength();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public Resolution getResolutions(int i) {
                return ((VideoConfigurations) this.instance).getResolutions(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public int getResolutionsCount() {
                return ((VideoConfigurations) this.instance).getResolutionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoConfigurationsOrBuilder
            public List<Resolution> getResolutionsList() {
                return Collections.unmodifiableList(((VideoConfigurations) this.instance).getResolutionsList());
            }

            public Builder removeResolutions(int i) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).removeResolutions(i);
                return this;
            }

            public Builder setBitRates(int i, int i2) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setBitRates(i, i2);
                return this;
            }

            public Builder setContainerFormats(int i, String str) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setContainerFormats(i, str);
                return this;
            }

            public Builder setFormats(int i, String str) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setFormats(i, str);
                return this;
            }

            public Builder setFrameRates(int i, int i2) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setFrameRates(i, i2);
                return this;
            }

            public Builder setMaxLength(int i) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setMaxLength(i);
                return this;
            }

            public Builder setResolutions(int i, Resolution resolution) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setResolutions(i, resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addResolutions(int i, Resolution resolution) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addResolutions(i, resolution);
                return this;
            }

            public Builder setResolutions(int i, Resolution.Builder builder) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).setResolutions(i, builder);
                return this;
            }

            public Builder addResolutions(Resolution.Builder builder) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addResolutions(builder);
                return this;
            }

            public Builder addResolutions(int i, Resolution.Builder builder) {
                copyOnWrite();
                ((VideoConfigurations) this.instance).addResolutions(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(VideoConfigurations videoConfigurations) {
            return DEFAULT_INSTANCE.createBuilder(videoConfigurations);
        }

        public static VideoConfigurations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoConfigurations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VideoConfigurations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VideoConfigurations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VideoConfigurations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoConfigurations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VideoConfigurations parseFrom(InputStream inputStream) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, resolution);
        }

        public static VideoConfigurations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, resolution);
        }

        public static VideoConfigurations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VideoConfigurations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(resolution);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VideoSettings extends GeneratedMessageLite<VideoSettings, Builder> implements VideoSettingsOrBuilder {
        public static final int BIT_RATE_FIELD_NUMBER = 5;
        public static final int CONTAINER_FORMAT_FIELD_NUMBER = 2;
        private static final VideoSettings DEFAULT_INSTANCE;
        public static final int FORMAT_FIELD_NUMBER = 1;
        public static final int FRAME_RATE_FIELD_NUMBER = 4;
        public static final int MAX_LENGTH_FIELD_NUMBER = 6;
        private static volatile Parser<VideoSettings> PARSER = null;
        public static final int RESOLUTION_FIELD_NUMBER = 3;
        private int bitRate_;
        private int frameRate_;
        private int maxLength_;
        private Resolution resolution_;
        private String format_ = "";
        private String containerFormat_ = "";

        static {
            VideoSettings videoSettings = new VideoSettings();
            DEFAULT_INSTANCE = videoSettings;
            videoSettings.makeImmutable();
        }

        private VideoSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitRate() {
            this.bitRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContainerFormat() {
            this.containerFormat_ = getDefaultInstance().getContainerFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormat() {
            this.format_ = getDefaultInstance().getFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRate() {
            this.frameRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLength() {
            this.maxLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolution() {
            this.resolution_ = null;
        }

        public static VideoSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResolution(Resolution resolution) {
            Resolution resolution2 = this.resolution_;
            if (resolution2 == null || resolution2 == Resolution.getDefaultInstance()) {
                this.resolution_ = resolution;
            } else {
                this.resolution_ = Resolution.newBuilder(this.resolution_).mergeFrom((Resolution.Builder) resolution).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VideoSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VideoSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitRate(int i) {
            this.bitRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContainerFormat(String str) {
            str.getClass();
            this.containerFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContainerFormatBytes(ByteString byteString) {
            this.containerFormat_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormat(String str) {
            str.getClass();
            this.format_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormatBytes(ByteString byteString) {
            this.format_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRate(int i) {
            this.frameRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLength(int i) {
            this.maxLength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Resolution.Builder builder) {
            this.resolution_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VideoSettings videoSettings = (VideoSettings) obj2;
                    this.format_ = visitor.visitString(!this.format_.isEmpty(), this.format_, !videoSettings.format_.isEmpty(), videoSettings.format_);
                    this.containerFormat_ = visitor.visitString(!this.containerFormat_.isEmpty(), this.containerFormat_, !videoSettings.containerFormat_.isEmpty(), videoSettings.containerFormat_);
                    this.resolution_ = (Resolution) visitor.visitMessage(this.resolution_, videoSettings.resolution_);
                    int i = this.frameRate_;
                    boolean z = i != 0;
                    int i2 = videoSettings.frameRate_;
                    this.frameRate_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.bitRate_;
                    boolean z2 = i3 != 0;
                    int i4 = videoSettings.bitRate_;
                    this.bitRate_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.maxLength_;
                    boolean z3 = i5 != 0;
                    int i6 = videoSettings.maxLength_;
                    this.maxLength_ = visitor.visitInt(z3, i5, i6 != 0, i6);
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
                                    this.format_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.containerFormat_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    Resolution resolution = this.resolution_;
                                    Resolution.Builder builder = resolution != null ? resolution.toBuilder() : null;
                                    Resolution resolution2 = (Resolution) codedInputStream.readMessage(Resolution.parser(), extensionRegistryLite);
                                    this.resolution_ = resolution2;
                                    if (builder != null) {
                                        builder.mergeFrom((Resolution.Builder) resolution2);
                                        this.resolution_ = builder.buildPartial();
                                    }
                                } else if (readTag == 32) {
                                    this.frameRate_ = codedInputStream.readUInt32();
                                } else if (readTag == 40) {
                                    this.bitRate_ = codedInputStream.readUInt32();
                                } else if (readTag == 48) {
                                    this.maxLength_ = codedInputStream.readUInt32();
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
                        synchronized (VideoSettings.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public int getBitRate() {
            return this.bitRate_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public String getContainerFormat() {
            return this.containerFormat_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public ByteString getContainerFormatBytes() {
            return ByteString.copyFromUtf8(this.containerFormat_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public String getFormat() {
            return this.format_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public ByteString getFormatBytes() {
            return ByteString.copyFromUtf8(this.format_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public int getFrameRate() {
            return this.frameRate_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public int getMaxLength() {
            return this.maxLength_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public Resolution getResolution() {
            Resolution resolution = this.resolution_;
            return resolution == null ? Resolution.getDefaultInstance() : resolution;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.format_.isEmpty() ? CodedOutputStream.computeStringSize(1, getFormat()) : 0;
            if (!this.containerFormat_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getContainerFormat());
            }
            if (this.resolution_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getResolution());
            }
            int i2 = this.frameRate_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(4, i2);
            }
            int i3 = this.bitRate_;
            if (i3 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(5, i3);
            }
            int i4 = this.maxLength_;
            if (i4 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(6, i4);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
        public boolean hasResolution() {
            return this.resolution_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.format_.isEmpty()) {
                codedOutputStream.writeString(1, getFormat());
            }
            if (!this.containerFormat_.isEmpty()) {
                codedOutputStream.writeString(2, getContainerFormat());
            }
            if (this.resolution_ != null) {
                codedOutputStream.writeMessage(3, getResolution());
            }
            int i = this.frameRate_;
            if (i != 0) {
                codedOutputStream.writeUInt32(4, i);
            }
            int i2 = this.bitRate_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(5, i2);
            }
            int i3 = this.maxLength_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(6, i3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VideoSettings, Builder> implements VideoSettingsOrBuilder {
            private Builder() {
                super(VideoSettings.DEFAULT_INSTANCE);
            }

            public Builder clearBitRate() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearBitRate();
                return this;
            }

            public Builder clearContainerFormat() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearContainerFormat();
                return this;
            }

            public Builder clearFormat() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearFormat();
                return this;
            }

            public Builder clearFrameRate() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearFrameRate();
                return this;
            }

            public Builder clearMaxLength() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearMaxLength();
                return this;
            }

            public Builder clearResolution() {
                copyOnWrite();
                ((VideoSettings) this.instance).clearResolution();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public int getBitRate() {
                return ((VideoSettings) this.instance).getBitRate();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public String getContainerFormat() {
                return ((VideoSettings) this.instance).getContainerFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public ByteString getContainerFormatBytes() {
                return ((VideoSettings) this.instance).getContainerFormatBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public String getFormat() {
                return ((VideoSettings) this.instance).getFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public ByteString getFormatBytes() {
                return ((VideoSettings) this.instance).getFormatBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public int getFrameRate() {
                return ((VideoSettings) this.instance).getFrameRate();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public int getMaxLength() {
                return ((VideoSettings) this.instance).getMaxLength();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public Resolution getResolution() {
                return ((VideoSettings) this.instance).getResolution();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.VideoSettingsOrBuilder
            public boolean hasResolution() {
                return ((VideoSettings) this.instance).hasResolution();
            }

            public Builder mergeResolution(Resolution resolution) {
                copyOnWrite();
                ((VideoSettings) this.instance).mergeResolution(resolution);
                return this;
            }

            public Builder setBitRate(int i) {
                copyOnWrite();
                ((VideoSettings) this.instance).setBitRate(i);
                return this;
            }

            public Builder setContainerFormat(String str) {
                copyOnWrite();
                ((VideoSettings) this.instance).setContainerFormat(str);
                return this;
            }

            public Builder setContainerFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoSettings) this.instance).setContainerFormatBytes(byteString);
                return this;
            }

            public Builder setFormat(String str) {
                copyOnWrite();
                ((VideoSettings) this.instance).setFormat(str);
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoSettings) this.instance).setFormatBytes(byteString);
                return this;
            }

            public Builder setFrameRate(int i) {
                copyOnWrite();
                ((VideoSettings) this.instance).setFrameRate(i);
                return this;
            }

            public Builder setMaxLength(int i) {
                copyOnWrite();
                ((VideoSettings) this.instance).setMaxLength(i);
                return this;
            }

            public Builder setResolution(Resolution resolution) {
                copyOnWrite();
                ((VideoSettings) this.instance).setResolution(resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setResolution(Resolution.Builder builder) {
                copyOnWrite();
                ((VideoSettings) this.instance).setResolution(builder);
                return this;
            }
        }

        public static Builder newBuilder(VideoSettings videoSettings) {
            return DEFAULT_INSTANCE.createBuilder(videoSettings);
        }

        public static VideoSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Resolution resolution) {
            resolution.getClass();
            this.resolution_ = resolution;
        }

        public static VideoSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VideoSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VideoSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VideoSettings parseFrom(InputStream inputStream) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VideoSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AutoCaptureSettings extends GeneratedMessageLite<AutoCaptureSettings, Builder> implements AutoCaptureSettingsOrBuilder {
        private static final AutoCaptureSettings DEFAULT_INSTANCE;
        private static volatile Parser<AutoCaptureSettings> PARSER = null;
        public static final int SESSION_DURATION_FIELD_NUMBER = 1;
        private int sessionDuration_;

        static {
            AutoCaptureSettings autoCaptureSettings = new AutoCaptureSettings();
            DEFAULT_INSTANCE = autoCaptureSettings;
            autoCaptureSettings.makeImmutable();
        }

        private AutoCaptureSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionDuration() {
            this.sessionDuration_ = 0;
        }

        public static AutoCaptureSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AutoCaptureSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoCaptureSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AutoCaptureSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionDuration(int i) {
            this.sessionDuration_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AutoCaptureSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AutoCaptureSettings autoCaptureSettings = (AutoCaptureSettings) obj2;
                    int i = this.sessionDuration_;
                    boolean z = i != 0;
                    int i2 = autoCaptureSettings.sessionDuration_;
                    this.sessionDuration_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.sessionDuration_ = codedInputStream.readUInt32();
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
                        synchronized (AutoCaptureSettings.class) {
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
            int i2 = this.sessionDuration_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.AutoCaptureSettingsOrBuilder
        public int getSessionDuration() {
            return this.sessionDuration_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.sessionDuration_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AutoCaptureSettings, Builder> implements AutoCaptureSettingsOrBuilder {
            private Builder() {
                super(AutoCaptureSettings.DEFAULT_INSTANCE);
            }

            public Builder clearSessionDuration() {
                copyOnWrite();
                ((AutoCaptureSettings) this.instance).clearSessionDuration();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.AutoCaptureSettingsOrBuilder
            public int getSessionDuration() {
                return ((AutoCaptureSettings) this.instance).getSessionDuration();
            }

            public Builder setSessionDuration(int i) {
                copyOnWrite();
                ((AutoCaptureSettings) this.instance).setSessionDuration(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AutoCaptureSettings autoCaptureSettings) {
            return DEFAULT_INSTANCE.createBuilder(autoCaptureSettings);
        }

        public static AutoCaptureSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AutoCaptureSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AutoCaptureSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AutoCaptureSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AutoCaptureSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AutoCaptureSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AutoCaptureSettings parseFrom(InputStream inputStream) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoCaptureSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AutoCaptureSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AutoCaptureSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoCaptureSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraActionFailure extends GeneratedMessageLite<CameraActionFailure, Builder> implements CameraActionFailureOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        private static final CameraActionFailure DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        public static final int FAILURE_TYPE_FIELD_NUMBER = 1;
        private static volatile Parser<CameraActionFailure> PARSER;
        private int action_;
        private String errorMessage_ = "";
        private int failureType_;

        static {
            CameraActionFailure cameraActionFailure = new CameraActionFailure();
            DEFAULT_INSTANCE = cameraActionFailure;
            cameraActionFailure.makeImmutable();
        }

        private CameraActionFailure() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailureType() {
            this.failureType_ = 0;
        }

        public static CameraActionFailure getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraActionFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraActionFailure> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(CameraAction cameraAction) {
            cameraAction.getClass();
            this.action_ = cameraAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
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
        public void setFailureType(FailureType failureType) {
            failureType.getClass();
            this.failureType_ = failureType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailureTypeValue(int i) {
            this.failureType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CameraActionFailure();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraActionFailure cameraActionFailure = (CameraActionFailure) obj2;
                    int i = this.failureType_;
                    boolean z = i != 0;
                    int i2 = cameraActionFailure.failureType_;
                    this.failureType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !cameraActionFailure.errorMessage_.isEmpty(), cameraActionFailure.errorMessage_);
                    int i3 = this.action_;
                    boolean z2 = i3 != 0;
                    int i4 = cameraActionFailure.action_;
                    this.action_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.failureType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.errorMessage_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.action_ = codedInputStream.readEnum();
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
                        synchronized (CameraActionFailure.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public CameraAction getAction() {
            CameraAction forNumber = CameraAction.forNumber(this.action_);
            return forNumber == null ? CameraAction.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public FailureType getFailureType() {
            FailureType forNumber = FailureType.forNumber(this.failureType_);
            return forNumber == null ? FailureType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
        public int getFailureTypeValue() {
            return this.failureType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.failureType_ != FailureType.FAILURE_TYPE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.failureType_) : 0;
            if (!this.errorMessage_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getErrorMessage());
            }
            if (this.action_ != CameraAction.CAMERA_ACTION_UNKNOWN.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, this.action_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.failureType_ != FailureType.FAILURE_TYPE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.failureType_);
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(2, getErrorMessage());
            }
            if (this.action_ != CameraAction.CAMERA_ACTION_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.action_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraActionFailure, Builder> implements CameraActionFailureOrBuilder {
            private Builder() {
                super(CameraActionFailure.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((CameraActionFailure) this.instance).clearAction();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((CameraActionFailure) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearFailureType() {
                copyOnWrite();
                ((CameraActionFailure) this.instance).clearFailureType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public CameraAction getAction() {
                return ((CameraActionFailure) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public int getActionValue() {
                return ((CameraActionFailure) this.instance).getActionValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public String getErrorMessage() {
                return ((CameraActionFailure) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((CameraActionFailure) this.instance).getErrorMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public FailureType getFailureType() {
                return ((CameraActionFailure) this.instance).getFailureType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionFailureOrBuilder
            public int getFailureTypeValue() {
                return ((CameraActionFailure) this.instance).getFailureTypeValue();
            }

            public Builder setAction(CameraAction cameraAction) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setAction(cameraAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setActionValue(i);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setFailureType(FailureType failureType) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setFailureType(failureType);
                return this;
            }

            public Builder setFailureTypeValue(int i) {
                copyOnWrite();
                ((CameraActionFailure) this.instance).setFailureTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum FailureType implements Internal.EnumLite {
            FAILURE_TYPE_UNKNOWN(0),
            FAILURE_TYPE_CAMERA_UNAVAILABLE(1),
            FAILURE_TYPE_PERMISSION_DENIED(2),
            FAILURE_TYPE_TIMEOUT(3),
            FAILURE_TYPE_DEVICE_TOO_HOT(4),
            FAILURE_TYPE_CAMERA_OCCLUDED(5),
            FAILURE_TYPE_INSUFFICIENT_STORAGE(6),
            FAILURE_TYPE_INSUFFICIENT_RESOURCES(7),
            UNRECOGNIZED(-1);

            public static final int FAILURE_TYPE_CAMERA_OCCLUDED_VALUE = 5;
            public static final int FAILURE_TYPE_CAMERA_UNAVAILABLE_VALUE = 1;
            public static final int FAILURE_TYPE_DEVICE_TOO_HOT_VALUE = 4;
            public static final int FAILURE_TYPE_INSUFFICIENT_RESOURCES_VALUE = 7;
            public static final int FAILURE_TYPE_INSUFFICIENT_STORAGE_VALUE = 6;
            public static final int FAILURE_TYPE_PERMISSION_DENIED_VALUE = 2;
            public static final int FAILURE_TYPE_TIMEOUT_VALUE = 3;
            public static final int FAILURE_TYPE_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<FailureType> internalValueMap = new Internal.EnumLiteMap<FailureType>() { // from class: com.amazon.alexa.accessory.protocol.Camera.CameraActionFailure.FailureType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FailureType findValueByNumber(int i) {
                    return FailureType.forNumber(i);
                }
            };
            private final int value;

            FailureType(int i) {
                this.value = i;
            }

            public static FailureType forNumber(int i) {
                switch (i) {
                    case 0:
                        return FAILURE_TYPE_UNKNOWN;
                    case 1:
                        return FAILURE_TYPE_CAMERA_UNAVAILABLE;
                    case 2:
                        return FAILURE_TYPE_PERMISSION_DENIED;
                    case 3:
                        return FAILURE_TYPE_TIMEOUT;
                    case 4:
                        return FAILURE_TYPE_DEVICE_TOO_HOT;
                    case 5:
                        return FAILURE_TYPE_CAMERA_OCCLUDED;
                    case 6:
                        return FAILURE_TYPE_INSUFFICIENT_STORAGE;
                    case 7:
                        return FAILURE_TYPE_INSUFFICIENT_RESOURCES;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<FailureType> internalGetValueMap() {
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
            public static FailureType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CameraActionFailure cameraActionFailure) {
            return DEFAULT_INSTANCE.createBuilder(cameraActionFailure);
        }

        public static CameraActionFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CameraActionFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CameraActionFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraActionFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraActionFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraActionFailure parseFrom(InputStream inputStream) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraActionFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CameraActionInitiator extends GeneratedMessageLite<CameraActionInitiator, Builder> implements CameraActionInitiatorOrBuilder {
        private static final CameraActionInitiator DEFAULT_INSTANCE;
        private static volatile Parser<CameraActionInitiator> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        static {
            CameraActionInitiator cameraActionInitiator = new CameraActionInitiator();
            DEFAULT_INSTANCE = cameraActionInitiator;
            cameraActionInitiator.makeImmutable();
        }

        private CameraActionInitiator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static CameraActionInitiator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraActionInitiator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionInitiator parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CameraActionInitiator> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
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
                    return new CameraActionInitiator();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CameraActionInitiator cameraActionInitiator = (CameraActionInitiator) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = cameraActionInitiator.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                        synchronized (CameraActionInitiator.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.type_ != Type.ACTION_TYPE_NONE.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionInitiatorOrBuilder
        public Type getType() {
            Type forNumber = Type.forNumber(this.type_);
            return forNumber == null ? Type.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionInitiatorOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.ACTION_TYPE_NONE.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CameraActionInitiator, Builder> implements CameraActionInitiatorOrBuilder {
            private Builder() {
                super(CameraActionInitiator.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((CameraActionInitiator) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionInitiatorOrBuilder
            public Type getType() {
                return ((CameraActionInitiator) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CameraActionInitiatorOrBuilder
            public int getTypeValue() {
                return ((CameraActionInitiator) this.instance).getTypeValue();
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((CameraActionInitiator) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((CameraActionInitiator) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Type implements Internal.EnumLite {
            ACTION_TYPE_NONE(0),
            ACTION_TYPE_ACCESSORY_TAP(1),
            ACTION_TYPE_ACCESSORY_WAKEWORD(2),
            ACTION_TYPE_GATEWAY_TRIGGER(3),
            ACTION_TYPE_ACCESSORY_TRIGGER(4),
            ACTION_TYPE_AUTO_CAPTURE(5),
            UNRECOGNIZED(-1);

            public static final int ACTION_TYPE_ACCESSORY_TAP_VALUE = 1;
            public static final int ACTION_TYPE_ACCESSORY_TRIGGER_VALUE = 4;
            public static final int ACTION_TYPE_ACCESSORY_WAKEWORD_VALUE = 2;
            public static final int ACTION_TYPE_AUTO_CAPTURE_VALUE = 5;
            public static final int ACTION_TYPE_GATEWAY_TRIGGER_VALUE = 3;
            public static final int ACTION_TYPE_NONE_VALUE = 0;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.amazon.alexa.accessory.protocol.Camera.CameraActionInitiator.Type.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return ACTION_TYPE_NONE;
                }
                if (i == 1) {
                    return ACTION_TYPE_ACCESSORY_TAP;
                }
                if (i == 2) {
                    return ACTION_TYPE_ACCESSORY_WAKEWORD;
                }
                if (i == 3) {
                    return ACTION_TYPE_GATEWAY_TRIGGER;
                }
                if (i == 4) {
                    return ACTION_TYPE_ACCESSORY_TRIGGER;
                }
                if (i != 5) {
                    return null;
                }
                return ACTION_TYPE_AUTO_CAPTURE;
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CameraActionInitiator cameraActionInitiator) {
            return DEFAULT_INSTANCE.createBuilder(cameraActionInitiator);
        }

        public static CameraActionInitiator parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionInitiator parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CameraActionInitiator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CameraActionInitiator parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CameraActionInitiator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraActionInitiator parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CameraActionInitiator parseFrom(InputStream inputStream) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraActionInitiator parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CameraActionInitiator parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CameraActionInitiator parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CameraActionInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CaptureEntry extends GeneratedMessageLite<CaptureEntry, Builder> implements CaptureEntryOrBuilder {
        public static final int CAPTURE_ID_FIELD_NUMBER = 1;
        private static final CaptureEntry DEFAULT_INSTANCE;
        private static volatile Parser<CaptureEntry> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private String captureId_ = "";
        private String timestamp_ = "";

        static {
            CaptureEntry captureEntry = new CaptureEntry();
            DEFAULT_INSTANCE = captureEntry;
            captureEntry.makeImmutable();
        }

        private CaptureEntry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureId() {
            this.captureId_ = getDefaultInstance().getCaptureId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        public static CaptureEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CaptureEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CaptureEntry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureId(String str) {
            str.getClass();
            this.captureId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureIdBytes(ByteString byteString) {
            this.captureId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(ByteString byteString) {
            this.timestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CaptureEntry();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CaptureEntry captureEntry = (CaptureEntry) obj2;
                    this.captureId_ = visitor.visitString(!this.captureId_.isEmpty(), this.captureId_, !captureEntry.captureId_.isEmpty(), captureEntry.captureId_);
                    this.timestamp_ = visitor.visitString(!this.timestamp_.isEmpty(), this.timestamp_, !captureEntry.timestamp_.isEmpty(), captureEntry.timestamp_);
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
                                    this.captureId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.timestamp_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (CaptureEntry.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
        public String getCaptureId() {
            return this.captureId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
        public ByteString getCaptureIdBytes() {
            return ByteString.copyFromUtf8(this.captureId_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.captureId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getCaptureId()) : 0;
            if (!this.timestamp_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getTimestamp());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
        public String getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
        public ByteString getTimestampBytes() {
            return ByteString.copyFromUtf8(this.timestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.captureId_.isEmpty()) {
                codedOutputStream.writeString(1, getCaptureId());
            }
            if (!this.timestamp_.isEmpty()) {
                codedOutputStream.writeString(2, getTimestamp());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CaptureEntry, Builder> implements CaptureEntryOrBuilder {
            private Builder() {
                super(CaptureEntry.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureId() {
                copyOnWrite();
                ((CaptureEntry) this.instance).clearCaptureId();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((CaptureEntry) this.instance).clearTimestamp();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
            public String getCaptureId() {
                return ((CaptureEntry) this.instance).getCaptureId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
            public ByteString getCaptureIdBytes() {
                return ((CaptureEntry) this.instance).getCaptureIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
            public String getTimestamp() {
                return ((CaptureEntry) this.instance).getTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.CaptureEntryOrBuilder
            public ByteString getTimestampBytes() {
                return ((CaptureEntry) this.instance).getTimestampBytes();
            }

            public Builder setCaptureId(String str) {
                copyOnWrite();
                ((CaptureEntry) this.instance).setCaptureId(str);
                return this;
            }

            public Builder setCaptureIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CaptureEntry) this.instance).setCaptureIdBytes(byteString);
                return this;
            }

            public Builder setTimestamp(String str) {
                copyOnWrite();
                ((CaptureEntry) this.instance).setTimestamp(str);
                return this;
            }

            public Builder setTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((CaptureEntry) this.instance).setTimestampBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CaptureEntry captureEntry) {
            return DEFAULT_INSTANCE.createBuilder(captureEntry);
        }

        public static CaptureEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CaptureEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CaptureEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CaptureEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CaptureEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CaptureEntry parseFrom(InputStream inputStream) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CaptureEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCameraConfigurations extends GeneratedMessageLite<GetCameraConfigurations, Builder> implements GetCameraConfigurationsOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        private static final GetCameraConfigurations DEFAULT_INSTANCE;
        private static volatile Parser<GetCameraConfigurations> PARSER;
        private int cameraId_;

        static {
            GetCameraConfigurations getCameraConfigurations = new GetCameraConfigurations();
            DEFAULT_INSTANCE = getCameraConfigurations;
            getCameraConfigurations.makeImmutable();
        }

        private GetCameraConfigurations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        public static GetCameraConfigurations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCameraConfigurations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraConfigurations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCameraConfigurations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCameraConfigurations();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetCameraConfigurations getCameraConfigurations = (GetCameraConfigurations) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = getCameraConfigurations.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.cameraId_ = codedInputStream.readUInt32();
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
                        synchronized (GetCameraConfigurations.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCameraConfigurations, Builder> implements GetCameraConfigurationsOrBuilder {
            private Builder() {
                super(GetCameraConfigurations.DEFAULT_INSTANCE);
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((GetCameraConfigurations) this.instance).clearCameraId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraConfigurationsOrBuilder
            public int getCameraId() {
                return ((GetCameraConfigurations) this.instance).getCameraId();
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((GetCameraConfigurations) this.instance).setCameraId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCameraConfigurations getCameraConfigurations) {
            return DEFAULT_INSTANCE.createBuilder(getCameraConfigurations);
        }

        public static GetCameraConfigurations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraConfigurations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCameraConfigurations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCameraConfigurations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCameraConfigurations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCameraConfigurations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCameraConfigurations parseFrom(InputStream inputStream) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraConfigurations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraConfigurations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCameraConfigurations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCameraSettings extends GeneratedMessageLite<GetCameraSettings, Builder> implements GetCameraSettingsOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        private static final GetCameraSettings DEFAULT_INSTANCE;
        private static volatile Parser<GetCameraSettings> PARSER;
        private int cameraId_;

        static {
            GetCameraSettings getCameraSettings = new GetCameraSettings();
            DEFAULT_INSTANCE = getCameraSettings;
            getCameraSettings.makeImmutable();
        }

        private GetCameraSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        public static GetCameraSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCameraSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCameraSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCameraSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetCameraSettings getCameraSettings = (GetCameraSettings) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = getCameraSettings.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.cameraId_ = codedInputStream.readUInt32();
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
                        synchronized (GetCameraSettings.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCameraSettings, Builder> implements GetCameraSettingsOrBuilder {
            private Builder() {
                super(GetCameraSettings.DEFAULT_INSTANCE);
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((GetCameraSettings) this.instance).clearCameraId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.GetCameraSettingsOrBuilder
            public int getCameraId() {
                return ((GetCameraSettings) this.instance).getCameraId();
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((GetCameraSettings) this.instance).setCameraId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCameraSettings getCameraSettings) {
            return DEFAULT_INSTANCE.createBuilder(getCameraSettings);
        }

        public static GetCameraSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCameraSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCameraSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCameraSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCameraSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCameraSettings parseFrom(InputStream inputStream) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCameraSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCameraSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCameraSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCameraSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Resolution extends GeneratedMessageLite<Resolution, Builder> implements ResolutionOrBuilder {
        private static final Resolution DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser<Resolution> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        static {
            Resolution resolution = new Resolution();
            DEFAULT_INSTANCE = resolution;
            resolution.makeImmutable();
        }

        private Resolution() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        public static Resolution getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Resolution parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resolution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resolution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Resolution> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i) {
            this.width_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Resolution();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Resolution resolution = (Resolution) obj2;
                    int i = this.width_;
                    boolean z = i != 0;
                    int i2 = resolution.width_;
                    this.width_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.height_;
                    boolean z2 = i3 != 0;
                    int i4 = resolution.height_;
                    this.height_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.width_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.height_ = codedInputStream.readUInt32();
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
                        synchronized (Resolution.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.ResolutionOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.width_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.height_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.ResolutionOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.width_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.height_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Resolution, Builder> implements ResolutionOrBuilder {
            private Builder() {
                super(Resolution.DEFAULT_INSTANCE);
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((Resolution) this.instance).clearHeight();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((Resolution) this.instance).clearWidth();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ResolutionOrBuilder
            public int getHeight() {
                return ((Resolution) this.instance).getHeight();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.ResolutionOrBuilder
            public int getWidth() {
                return ((Resolution) this.instance).getWidth();
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((Resolution) this.instance).setHeight(i);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((Resolution) this.instance).setWidth(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Resolution resolution) {
            return DEFAULT_INSTANCE.createBuilder(resolution);
        }

        public static Resolution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resolution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Resolution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Resolution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Resolution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Resolution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resolution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Resolution parseFrom(InputStream inputStream) throws IOException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resolution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Resolution parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Resolution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetCameraSettingsResponse extends GeneratedMessageLite<SetCameraSettingsResponse, Builder> implements SetCameraSettingsResponseOrBuilder {
        private static final SetCameraSettingsResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<SetCameraSettingsResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private String errorMessage_ = "";
        private int status_;

        static {
            SetCameraSettingsResponse setCameraSettingsResponse = new SetCameraSettingsResponse();
            DEFAULT_INSTANCE = setCameraSettingsResponse;
            setCameraSettingsResponse.makeImmutable();
        }

        private SetCameraSettingsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static SetCameraSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetCameraSettingsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetCameraSettingsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetCameraSettingsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
                    return new SetCameraSettingsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SetCameraSettingsResponse setCameraSettingsResponse = (SetCameraSettingsResponse) obj2;
                    int i = this.status_;
                    boolean z = i != 0;
                    int i2 = setCameraSettingsResponse.status_;
                    this.status_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !setCameraSettingsResponse.errorMessage_.isEmpty(), setCameraSettingsResponse.errorMessage_);
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
                                } else if (readTag == 18) {
                                    this.errorMessage_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (SetCameraSettingsResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.status_ != Status.SETTINGS_STATUS_SUCCESS.getNumber() ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if (!this.errorMessage_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getErrorMessage());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
        public Status getStatus() {
            Status forNumber = Status.forNumber(this.status_);
            return forNumber == null ? Status.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != Status.SETTINGS_STATUS_SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(2, getErrorMessage());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetCameraSettingsResponse, Builder> implements SetCameraSettingsResponseOrBuilder {
            private Builder() {
                super(SetCameraSettingsResponse.DEFAULT_INSTANCE);
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).clearStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
            public String getErrorMessage() {
                return ((SetCameraSettingsResponse) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((SetCameraSettingsResponse) this.instance).getErrorMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
            public Status getStatus() {
                return ((SetCameraSettingsResponse) this.instance).getStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponseOrBuilder
            public int getStatusValue() {
                return ((SetCameraSettingsResponse) this.instance).getStatusValue();
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((SetCameraSettingsResponse) this.instance).setStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Status implements Internal.EnumLite {
            SETTINGS_STATUS_SUCCESS(0),
            SETTINGS_STATUS_INVALID_SETTINGS(1),
            SETTINGS_STATUS_CAMERA_BUSY(2),
            SETTINGS_STATUS_CAMERA_NOT_FOUND(3),
            SETTINGS_STATUS_FAILED(4),
            UNRECOGNIZED(-1);

            public static final int SETTINGS_STATUS_CAMERA_BUSY_VALUE = 2;
            public static final int SETTINGS_STATUS_CAMERA_NOT_FOUND_VALUE = 3;
            public static final int SETTINGS_STATUS_FAILED_VALUE = 4;
            public static final int SETTINGS_STATUS_INVALID_SETTINGS_VALUE = 1;
            public static final int SETTINGS_STATUS_SUCCESS_VALUE = 0;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.amazon.alexa.accessory.protocol.Camera.SetCameraSettingsResponse.Status.1
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
                    return SETTINGS_STATUS_SUCCESS;
                }
                if (i == 1) {
                    return SETTINGS_STATUS_INVALID_SETTINGS;
                }
                if (i == 2) {
                    return SETTINGS_STATUS_CAMERA_BUSY;
                }
                if (i == 3) {
                    return SETTINGS_STATUS_CAMERA_NOT_FOUND;
                }
                if (i != 4) {
                    return null;
                }
                return SETTINGS_STATUS_FAILED;
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

        public static Builder newBuilder(SetCameraSettingsResponse setCameraSettingsResponse) {
            return DEFAULT_INSTANCE.createBuilder(setCameraSettingsResponse);
        }

        public static SetCameraSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetCameraSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetCameraSettingsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetCameraSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetCameraSettingsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetCameraSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetCameraSettingsResponse parseFrom(InputStream inputStream) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetCameraSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetCameraSettingsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetCameraSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCameraSettingsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AutoCaptureType implements Internal.EnumLite {
        AUTO_CAPTURE_TYPE_UNKNOWN(0),
        AUTO_CAPTURE_TYPE_IMAGE(1),
        AUTO_CAPTURE_TYPE_VIDEO(2),
        UNRECOGNIZED(-1);

        public static final int AUTO_CAPTURE_TYPE_IMAGE_VALUE = 1;
        public static final int AUTO_CAPTURE_TYPE_UNKNOWN_VALUE = 0;
        public static final int AUTO_CAPTURE_TYPE_VIDEO_VALUE = 2;
        private static final Internal.EnumLiteMap<AutoCaptureType> internalValueMap = new Internal.EnumLiteMap<AutoCaptureType>() { // from class: com.amazon.alexa.accessory.protocol.Camera.AutoCaptureType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AutoCaptureType findValueByNumber(int i) {
                return AutoCaptureType.forNumber(i);
            }
        };
        private final int value;

        AutoCaptureType(int i) {
            this.value = i;
        }

        public static AutoCaptureType forNumber(int i) {
            if (i == 0) {
                return AUTO_CAPTURE_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return AUTO_CAPTURE_TYPE_IMAGE;
            }
            if (i != 2) {
                return null;
            }
            return AUTO_CAPTURE_TYPE_VIDEO;
        }

        public static Internal.EnumLiteMap<AutoCaptureType> internalGetValueMap() {
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
        public static AutoCaptureType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CameraAction implements Internal.EnumLite {
        CAMERA_ACTION_UNKNOWN(0),
        CAMERA_ACTION_IMAGE_CAPTURE(1),
        CAMERA_ACTION_VIDEO_START(2),
        CAMERA_ACTION_VIDEO_STOP(3),
        CAMERA_ACTION_AUTO_CAPTURE_START(4),
        CAMERA_ACTION_AUTO_CAPTURE_STOP(5),
        UNRECOGNIZED(-1);

        public static final int CAMERA_ACTION_AUTO_CAPTURE_START_VALUE = 4;
        public static final int CAMERA_ACTION_AUTO_CAPTURE_STOP_VALUE = 5;
        public static final int CAMERA_ACTION_IMAGE_CAPTURE_VALUE = 1;
        public static final int CAMERA_ACTION_UNKNOWN_VALUE = 0;
        public static final int CAMERA_ACTION_VIDEO_START_VALUE = 2;
        public static final int CAMERA_ACTION_VIDEO_STOP_VALUE = 3;
        private static final Internal.EnumLiteMap<CameraAction> internalValueMap = new Internal.EnumLiteMap<CameraAction>() { // from class: com.amazon.alexa.accessory.protocol.Camera.CameraAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CameraAction findValueByNumber(int i) {
                return CameraAction.forNumber(i);
            }
        };
        private final int value;

        CameraAction(int i) {
            this.value = i;
        }

        public static CameraAction forNumber(int i) {
            if (i == 0) {
                return CAMERA_ACTION_UNKNOWN;
            }
            if (i == 1) {
                return CAMERA_ACTION_IMAGE_CAPTURE;
            }
            if (i == 2) {
                return CAMERA_ACTION_VIDEO_START;
            }
            if (i == 3) {
                return CAMERA_ACTION_VIDEO_STOP;
            }
            if (i == 4) {
                return CAMERA_ACTION_AUTO_CAPTURE_START;
            }
            if (i != 5) {
                return null;
            }
            return CAMERA_ACTION_AUTO_CAPTURE_STOP;
        }

        public static Internal.EnumLiteMap<CameraAction> internalGetValueMap() {
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
        public static CameraAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
