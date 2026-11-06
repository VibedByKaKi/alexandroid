package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Camera;
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
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Vision {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Vision$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$NotifyVisionCaptureStopped$CaptureResultCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StartVisionCaptureResponse$CaptureStatusCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StopVisionCaptureResponse$CaptureResultCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[EnrichmentData.EnrichmentContentCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase = iArr;
            try {
                iArr[EnrichmentData.EnrichmentContentCase.OCR_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase[EnrichmentData.EnrichmentContentCase.FACE_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase[EnrichmentData.EnrichmentContentCase.GESTURE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase[EnrichmentData.EnrichmentContentCase.OPTICAL_CODE_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase[EnrichmentData.EnrichmentContentCase.ENRICHMENTCONTENT_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[StopVisionCaptureResponse.CaptureResultCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StopVisionCaptureResponse$CaptureResultCase = iArr2;
            try {
                iArr2[StopVisionCaptureResponse.CaptureResultCase.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StopVisionCaptureResponse$CaptureResultCase[StopVisionCaptureResponse.CaptureResultCase.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StopVisionCaptureResponse$CaptureResultCase[StopVisionCaptureResponse.CaptureResultCase.CAPTURERESULT_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[StartVisionCaptureResponse.CaptureStatusCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StartVisionCaptureResponse$CaptureStatusCase = iArr3;
            try {
                iArr3[StartVisionCaptureResponse.CaptureStatusCase.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StartVisionCaptureResponse$CaptureStatusCase[StartVisionCaptureResponse.CaptureStatusCase.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StartVisionCaptureResponse$CaptureStatusCase[StartVisionCaptureResponse.CaptureStatusCase.CAPTURESTATUS_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[NotifyVisionCaptureStopped.CaptureResultCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$NotifyVisionCaptureStopped$CaptureResultCase = iArr4;
            try {
                iArr4[NotifyVisionCaptureStopped.CaptureResultCase.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$NotifyVisionCaptureStopped$CaptureResultCase[NotifyVisionCaptureStopped.CaptureResultCase.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Vision$NotifyVisionCaptureStopped$CaptureResultCase[NotifyVisionCaptureStopped.CaptureResultCase.CAPTURERESULT_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr5;
            try {
                iArr5[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CaptureConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();

        CaptureMode getCaptureMode();

        int getCaptureModeValue();

        EnrichmentType getEnrichmentsEnabled(int i);

        int getEnrichmentsEnabledCount();

        List<EnrichmentType> getEnrichmentsEnabledList();

        int getEnrichmentsEnabledValue(int i);

        List<Integer> getEnrichmentsEnabledValueList();

        float getFrameRate();

        String getImageFormat();

        ByteString getImageFormatBytes();

        int getMaxFrameBytes();

        int getMaxFrameCount();

        Camera.Resolution getResolution();

        boolean hasResolution();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface EnrichmentDataOrBuilder extends MessageLiteOrBuilder {
        EnrichmentData.EnrichmentContentCase getEnrichmentContentCase();

        FaceDetectionEnrichmentData getFaceData();

        String getFrameCaptureTimestamp();

        ByteString getFrameCaptureTimestampBytes();

        GestureDetectionEnrichmentData getGestureData();

        OCREnrichmentData getOcrData();

        OpticalCodeDetectionEnrichmentData getOpticalCodeData();

        String getProcessingTimestamp();

        ByteString getProcessingTimestampBytes();

        EnrichmentType getType();

        int getTypeValue();

        boolean hasFaceData();

        boolean hasGestureData();

        boolean hasOcrData();

        boolean hasOpticalCodeData();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FaceDetectionEnrichmentDataOrBuilder extends MessageLiteOrBuilder {
        FaceDetection getDetections(int i);

        int getDetectionsCount();

        List<FaceDetection> getDetectionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FaceDetectionOrBuilder extends MessageLiteOrBuilder {
        float getConfidenceScore();

        Location getLocation();

        boolean hasLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GestureDetectionEnrichmentDataOrBuilder extends MessageLiteOrBuilder {
        GestureDetection getDetections(int i);

        int getDetectionsCount();

        List<GestureDetection> getDetectionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GestureDetectionOrBuilder extends MessageLiteOrBuilder {
        float getConfidenceScore();

        String getDescription();

        ByteString getDescriptionBytes();

        String getGestureType();

        ByteString getGestureTypeBytes();

        Location getLocation();

        boolean hasLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetVisionCaptureConfigurationsOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetVisionCaptureConfigurationsResponseOrBuilder extends MessageLiteOrBuilder {
        String getErrorMessage();

        ByteString getErrorMessageBytes();

        VisionCaptureConfigurations getSupportedConfigurations(int i);

        int getSupportedConfigurationsCount();

        List<VisionCaptureConfigurations> getSupportedConfigurationsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ImageDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getImageData();

        String getImageFormat();

        ByteString getImageFormatBytes();

        Camera.Resolution getResolution();

        boolean hasResolution();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LocationOrBuilder extends MessageLiteOrBuilder {
        Point getBoundingPolygon(int i);

        int getBoundingPolygonCount();

        List<Point> getBoundingPolygonList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyFrameOrBuilder extends MessageLiteOrBuilder {
        String getFrameId();

        ByteString getFrameIdBytes();

        FrameType getFrameType();

        int getFrameTypeValue();

        String getSessionId();

        ByteString getSessionIdBytes();

        int getSizeInBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyVisionCapturePausedOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();

        int getTimeoutInMillis();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyVisionCaptureResumedOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getResumedConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasResumedConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyVisionCaptureStartedOrBuilder extends MessageLiteOrBuilder {
        float getConfidenceScore();

        String getSessionId();

        ByteString getSessionIdBytes();

        VisionCaptureStarted getStarted();

        int getTimeoutInMillis();

        boolean hasStarted();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyVisionCaptureStoppedOrBuilder extends MessageLiteOrBuilder {
        NotifyVisionCaptureStopped.CaptureResultCase getCaptureResultCase();

        VisionCaptureFailure getFailed();

        String getSessionId();

        ByteString getSessionIdBytes();

        VisionCaptureStopped getStopped();

        boolean hasFailed();

        boolean hasStopped();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OCREnrichmentDataOrBuilder extends MessageLiteOrBuilder {
        TextDetection getDetections(int i);

        int getDetectionsCount();

        List<TextDetection> getDetectionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OpticalCodeDetectionEnrichmentDataOrBuilder extends MessageLiteOrBuilder {
        OpticalCodeDetection getDetections(int i);

        int getDetectionsCount();

        List<OpticalCodeDetection> getDetectionsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OpticalCodeDetectionOrBuilder extends MessageLiteOrBuilder {
        String getCodeType();

        ByteString getCodeTypeBytes();

        float getConfidenceScore();

        String getContent();

        ByteString getContentBytes();

        Location getLocation();

        boolean hasLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PauseVisionCaptureOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();

        int getTimeoutInMillis();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PauseVisionCaptureResponseOrBuilder extends MessageLiteOrBuilder {
        VisionCaptureFailure getFailure();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasFailure();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PointOrBuilder extends MessageLiteOrBuilder {
        float getX();

        float getY();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResumeVisionCaptureOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResumeVisionCaptureResponseOrBuilder extends MessageLiteOrBuilder {
        VisionCaptureFailure getFailure();

        CaptureConfiguration getResumedConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasFailure();

        boolean hasResumedConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SendVisionCaptureStateOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();

        CaptureState getState();

        int getStateValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartVisionCaptureOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        int getTimeoutInMillis();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartVisionCaptureResponseOrBuilder extends MessageLiteOrBuilder {
        StartVisionCaptureResponse.CaptureStatusCase getCaptureStatusCase();

        VisionCaptureFailure getFailed();

        String getSessionId();

        ByteString getSessionIdBytes();

        VisionCaptureStarted getStarted();

        boolean hasFailed();

        boolean hasStarted();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopVisionCaptureOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopVisionCaptureResponseOrBuilder extends MessageLiteOrBuilder {
        StopVisionCaptureResponse.CaptureResultCase getCaptureResultCase();

        VisionCaptureFailure getFailed();

        String getSessionId();

        ByteString getSessionIdBytes();

        VisionCaptureStopped getStopped();

        boolean hasFailed();

        boolean hasStopped();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SubframeDataOrBuilder extends MessageLiteOrBuilder {
        ImageData getImageData();

        Location getImageLocation();

        String getProcessingTimestamp();

        ByteString getProcessingTimestampBytes();

        boolean hasImageData();

        boolean hasImageLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TextDetectionOrBuilder extends MessageLiteOrBuilder {
        float getConfidenceScore();

        Location getLocation();

        String getText();

        ByteString getTextBytes();

        boolean hasLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateVisionCaptureConfigOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getConfiguration();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateVisionCaptureConfigResponseOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getAppliedConfiguration();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppliedConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionCaptureConfigurationsOrBuilder extends MessageLiteOrBuilder {
        int getCameraId();

        CaptureMode getCaptureMode();

        int getCaptureModeValue();

        int getFrameRates(int i);

        int getFrameRatesCount();

        List<Integer> getFrameRatesList();

        String getImageFormats(int i);

        ByteString getImageFormatsBytes(int i);

        int getImageFormatsCount();

        List<String> getImageFormatsList();

        int getMaxFrameBytes();

        int getMaxFrameCount();

        Camera.Resolution getResolutions(int i);

        int getResolutionsCount();

        List<Camera.Resolution> getResolutionsList();

        EnrichmentType getSupportedEnrichments(int i);

        int getSupportedEnrichmentsCount();

        List<EnrichmentType> getSupportedEnrichmentsList();

        int getSupportedEnrichmentsValue(int i);

        List<Integer> getSupportedEnrichmentsValueList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionCaptureFailureOrBuilder extends MessageLiteOrBuilder {
        String getErrorDetails();

        ByteString getErrorDetailsBytes();

        String getFailureReason();

        ByteString getFailureReasonBytes();

        String getFailureTimestamp();

        ByteString getFailureTimestampBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionCaptureStartedOrBuilder extends MessageLiteOrBuilder {
        CaptureConfiguration getConfiguration();

        String getStartTimestamp();

        ByteString getStartTimestampBytes();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionCaptureStoppedOrBuilder extends MessageLiteOrBuilder {
        StopReason getReason();

        int getReasonValue();

        String getStopTimestamp();

        ByteString getStopTimestampBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionFrameDataOrBuilder extends MessageLiteOrBuilder {
        String getCaptureTimestamp();

        ByteString getCaptureTimestampBytes();

        int getDialogId();

        String getFrameId();

        ByteString getFrameIdBytes();

        ImageData getImageData();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasImageData();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisionFrameMetadataOrBuilder extends MessageLiteOrBuilder {
        EnrichmentData getEnrichments(int i);

        int getEnrichmentsCount();

        List<EnrichmentData> getEnrichmentsList();

        String getFrameId();

        ByteString getFrameIdBytes();

        FrameSequence getSequence();

        int getSequenceValue();

        String getSessionId();

        ByteString getSessionIdBytes();

        SubframeData getSubframes(int i);

        int getSubframesCount();

        List<SubframeData> getSubframesList();
    }

    private Vision() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CaptureConfiguration extends GeneratedMessageLite<CaptureConfiguration, Builder> implements CaptureConfigurationOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        public static final int CAPTURE_MODE_FIELD_NUMBER = 2;
        private static final CaptureConfiguration DEFAULT_INSTANCE;
        public static final int ENRICHMENTS_ENABLED_FIELD_NUMBER = 8;
        public static final int FRAME_RATE_FIELD_NUMBER = 4;
        public static final int IMAGE_FORMAT_FIELD_NUMBER = 5;
        public static final int MAX_FRAME_BYTES_FIELD_NUMBER = 6;
        public static final int MAX_FRAME_COUNT_FIELD_NUMBER = 7;
        private static volatile Parser<CaptureConfiguration> PARSER = null;
        public static final int RESOLUTION_FIELD_NUMBER = 3;
        private static final Internal.ListAdapter.Converter<Integer, EnrichmentType> enrichmentsEnabled_converter_ = new Internal.ListAdapter.Converter<Integer, EnrichmentType>() { // from class: com.amazon.alexa.accessory.protocol.Vision.CaptureConfiguration.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public EnrichmentType convert(Integer num) {
                EnrichmentType forNumber = EnrichmentType.forNumber(num.intValue());
                return forNumber == null ? EnrichmentType.UNRECOGNIZED : forNumber;
            }
        };
        private int bitField0_;
        private int cameraId_;
        private int captureMode_;
        private int enrichmentsEnabledMemoizedSerializedSize;
        private float frameRate_;
        private int maxFrameBytes_;
        private int maxFrameCount_;
        private Camera.Resolution resolution_;
        private String imageFormat_ = "";
        private Internal.IntList enrichmentsEnabled_ = GeneratedMessageLite.emptyIntList();

        static {
            CaptureConfiguration captureConfiguration = new CaptureConfiguration();
            DEFAULT_INSTANCE = captureConfiguration;
            captureConfiguration.makeImmutable();
        }

        private CaptureConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnrichmentsEnabled(Iterable<? extends EnrichmentType> iterable) {
            ensureEnrichmentsEnabledIsMutable();
            Iterator<? extends EnrichmentType> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.enrichmentsEnabled_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnrichmentsEnabledValue(Iterable<Integer> iterable) {
            ensureEnrichmentsEnabledIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.enrichmentsEnabled_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichmentsEnabled(EnrichmentType enrichmentType) {
            enrichmentType.getClass();
            ensureEnrichmentsEnabledIsMutable();
            this.enrichmentsEnabled_.addInt(enrichmentType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichmentsEnabledValue(int i) {
            ensureEnrichmentsEnabledIsMutable();
            this.enrichmentsEnabled_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureMode() {
            this.captureMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnrichmentsEnabled() {
            this.enrichmentsEnabled_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRate() {
            this.frameRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageFormat() {
            this.imageFormat_ = getDefaultInstance().getImageFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxFrameBytes() {
            this.maxFrameBytes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxFrameCount() {
            this.maxFrameCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolution() {
            this.resolution_ = null;
        }

        private void ensureEnrichmentsEnabledIsMutable() {
            if (this.enrichmentsEnabled_.isModifiable()) {
                return;
            }
            this.enrichmentsEnabled_ = GeneratedMessageLite.mutableCopy(this.enrichmentsEnabled_);
        }

        public static CaptureConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResolution(Camera.Resolution resolution) {
            Camera.Resolution resolution2 = this.resolution_;
            if (resolution2 == null || resolution2 == Camera.Resolution.getDefaultInstance()) {
                this.resolution_ = resolution;
            } else {
                this.resolution_ = Camera.Resolution.newBuilder(this.resolution_).mergeFrom((Camera.Resolution.Builder) resolution).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CaptureConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CaptureConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureMode(CaptureMode captureMode) {
            captureMode.getClass();
            this.captureMode_ = captureMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureModeValue(int i) {
            this.captureMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnrichmentsEnabled(int i, EnrichmentType enrichmentType) {
            enrichmentType.getClass();
            ensureEnrichmentsEnabledIsMutable();
            this.enrichmentsEnabled_.setInt(i, enrichmentType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnrichmentsEnabledValue(int i, int i2) {
            ensureEnrichmentsEnabledIsMutable();
            this.enrichmentsEnabled_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRate(float f) {
            this.frameRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageFormat(String str) {
            str.getClass();
            this.imageFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageFormatBytes(ByteString byteString) {
            this.imageFormat_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxFrameBytes(int i) {
            this.maxFrameBytes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxFrameCount(int i) {
            this.maxFrameCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Camera.Resolution.Builder builder) {
            this.resolution_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CaptureConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.enrichmentsEnabled_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CaptureConfiguration captureConfiguration = (CaptureConfiguration) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = captureConfiguration.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.captureMode_;
                    boolean z2 = i3 != 0;
                    int i4 = captureConfiguration.captureMode_;
                    this.captureMode_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.resolution_ = (Camera.Resolution) visitor.visitMessage(this.resolution_, captureConfiguration.resolution_);
                    float f = this.frameRate_;
                    boolean z3 = f != 0.0f;
                    float f2 = captureConfiguration.frameRate_;
                    this.frameRate_ = visitor.visitFloat(z3, f, f2 != 0.0f, f2);
                    this.imageFormat_ = visitor.visitString(!this.imageFormat_.isEmpty(), this.imageFormat_, !captureConfiguration.imageFormat_.isEmpty(), captureConfiguration.imageFormat_);
                    int i5 = this.maxFrameBytes_;
                    boolean z4 = i5 != 0;
                    int i6 = captureConfiguration.maxFrameBytes_;
                    this.maxFrameBytes_ = visitor.visitInt(z4, i5, i6 != 0, i6);
                    int i7 = this.maxFrameCount_;
                    boolean z5 = i7 != 0;
                    int i8 = captureConfiguration.maxFrameCount_;
                    this.maxFrameCount_ = visitor.visitInt(z5, i7, i8 != 0, i8);
                    this.enrichmentsEnabled_ = visitor.visitIntList(this.enrichmentsEnabled_, captureConfiguration.enrichmentsEnabled_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= captureConfiguration.bitField0_;
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
                                    this.cameraId_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.captureMode_ = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    Camera.Resolution resolution = this.resolution_;
                                    Camera.Resolution.Builder builder = resolution != null ? resolution.toBuilder() : null;
                                    Camera.Resolution resolution2 = (Camera.Resolution) codedInputStream.readMessage(Camera.Resolution.parser(), extensionRegistryLite);
                                    this.resolution_ = resolution2;
                                    if (builder != null) {
                                        builder.mergeFrom((Camera.Resolution.Builder) resolution2);
                                        this.resolution_ = builder.buildPartial();
                                    }
                                } else if (readTag == 37) {
                                    this.frameRate_ = codedInputStream.readFloat();
                                } else if (readTag == 42) {
                                    this.imageFormat_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 48) {
                                    this.maxFrameBytes_ = codedInputStream.readUInt32();
                                } else if (readTag == 56) {
                                    this.maxFrameCount_ = codedInputStream.readUInt32();
                                } else if (readTag == 64) {
                                    if (!this.enrichmentsEnabled_.isModifiable()) {
                                        this.enrichmentsEnabled_ = GeneratedMessageLite.mutableCopy(this.enrichmentsEnabled_);
                                    }
                                    this.enrichmentsEnabled_.addInt(codedInputStream.readEnum());
                                } else if (readTag == 66) {
                                    if (!this.enrichmentsEnabled_.isModifiable()) {
                                        this.enrichmentsEnabled_ = GeneratedMessageLite.mutableCopy(this.enrichmentsEnabled_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.enrichmentsEnabled_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                        synchronized (CaptureConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public CaptureMode getCaptureMode() {
            CaptureMode forNumber = CaptureMode.forNumber(this.captureMode_);
            return forNumber == null ? CaptureMode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getCaptureModeValue() {
            return this.captureMode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public EnrichmentType getEnrichmentsEnabled(int i) {
            return enrichmentsEnabled_converter_.convert(Integer.valueOf(this.enrichmentsEnabled_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getEnrichmentsEnabledCount() {
            return this.enrichmentsEnabled_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public List<EnrichmentType> getEnrichmentsEnabledList() {
            return new Internal.ListAdapter(this.enrichmentsEnabled_, enrichmentsEnabled_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getEnrichmentsEnabledValue(int i) {
            return this.enrichmentsEnabled_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public List<Integer> getEnrichmentsEnabledValueList() {
            return this.enrichmentsEnabled_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public float getFrameRate() {
            return this.frameRate_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public String getImageFormat() {
            return this.imageFormat_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public ByteString getImageFormatBytes() {
            return ByteString.copyFromUtf8(this.imageFormat_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getMaxFrameBytes() {
            return this.maxFrameBytes_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public int getMaxFrameCount() {
            return this.maxFrameCount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public Camera.Resolution getResolution() {
            Camera.Resolution resolution = this.resolution_;
            return resolution == null ? Camera.Resolution.getDefaultInstance() : resolution;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.captureMode_ != CaptureMode.CAPTURE_MODE_UNSPECIFIED.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(2, this.captureMode_);
            }
            if (this.resolution_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, getResolution());
            }
            float f = this.frameRate_;
            if (f != 0.0f) {
                computeUInt32Size += CodedOutputStream.computeFloatSize(4, f);
            }
            if (!this.imageFormat_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(5, getImageFormat());
            }
            int i3 = this.maxFrameBytes_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(6, i3);
            }
            int i4 = this.maxFrameCount_;
            if (i4 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(7, i4);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.enrichmentsEnabled_.size(); i6++) {
                i5 += CodedOutputStream.computeEnumSizeNoTag(this.enrichmentsEnabled_.getInt(i6));
            }
            int i7 = computeUInt32Size + i5;
            if (!getEnrichmentsEnabledList().isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i5);
            }
            this.enrichmentsEnabledMemoizedSerializedSize = i5;
            int serializedSize = this.unknownFields.getSerializedSize() + i7;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
        public boolean hasResolution() {
            return this.resolution_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.captureMode_ != CaptureMode.CAPTURE_MODE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.captureMode_);
            }
            if (this.resolution_ != null) {
                codedOutputStream.writeMessage(3, getResolution());
            }
            float f = this.frameRate_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(4, f);
            }
            if (!this.imageFormat_.isEmpty()) {
                codedOutputStream.writeString(5, getImageFormat());
            }
            int i2 = this.maxFrameBytes_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(6, i2);
            }
            int i3 = this.maxFrameCount_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(7, i3);
            }
            if (getEnrichmentsEnabledList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(66);
                codedOutputStream.writeUInt32NoTag(this.enrichmentsEnabledMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.enrichmentsEnabled_.size(); i4++) {
                codedOutputStream.writeEnumNoTag(this.enrichmentsEnabled_.getInt(i4));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CaptureConfiguration, Builder> implements CaptureConfigurationOrBuilder {
            private Builder() {
                super(CaptureConfiguration.DEFAULT_INSTANCE);
            }

            public Builder addAllEnrichmentsEnabled(Iterable<? extends EnrichmentType> iterable) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).addAllEnrichmentsEnabled(iterable);
                return this;
            }

            public Builder addAllEnrichmentsEnabledValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).addAllEnrichmentsEnabledValue(iterable);
                return this;
            }

            public Builder addEnrichmentsEnabled(EnrichmentType enrichmentType) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).addEnrichmentsEnabled(enrichmentType);
                return this;
            }

            public Builder addEnrichmentsEnabledValue(int i) {
                ((CaptureConfiguration) this.instance).addEnrichmentsEnabledValue(i);
                return this;
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearCameraId();
                return this;
            }

            public Builder clearCaptureMode() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearCaptureMode();
                return this;
            }

            public Builder clearEnrichmentsEnabled() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearEnrichmentsEnabled();
                return this;
            }

            public Builder clearFrameRate() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearFrameRate();
                return this;
            }

            public Builder clearImageFormat() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearImageFormat();
                return this;
            }

            public Builder clearMaxFrameBytes() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearMaxFrameBytes();
                return this;
            }

            public Builder clearMaxFrameCount() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearMaxFrameCount();
                return this;
            }

            public Builder clearResolution() {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).clearResolution();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getCameraId() {
                return ((CaptureConfiguration) this.instance).getCameraId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public CaptureMode getCaptureMode() {
                return ((CaptureConfiguration) this.instance).getCaptureMode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getCaptureModeValue() {
                return ((CaptureConfiguration) this.instance).getCaptureModeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public EnrichmentType getEnrichmentsEnabled(int i) {
                return ((CaptureConfiguration) this.instance).getEnrichmentsEnabled(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getEnrichmentsEnabledCount() {
                return ((CaptureConfiguration) this.instance).getEnrichmentsEnabledCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public List<EnrichmentType> getEnrichmentsEnabledList() {
                return ((CaptureConfiguration) this.instance).getEnrichmentsEnabledList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getEnrichmentsEnabledValue(int i) {
                return ((CaptureConfiguration) this.instance).getEnrichmentsEnabledValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public List<Integer> getEnrichmentsEnabledValueList() {
                return Collections.unmodifiableList(((CaptureConfiguration) this.instance).getEnrichmentsEnabledValueList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public float getFrameRate() {
                return ((CaptureConfiguration) this.instance).getFrameRate();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public String getImageFormat() {
                return ((CaptureConfiguration) this.instance).getImageFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public ByteString getImageFormatBytes() {
                return ((CaptureConfiguration) this.instance).getImageFormatBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getMaxFrameBytes() {
                return ((CaptureConfiguration) this.instance).getMaxFrameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public int getMaxFrameCount() {
                return ((CaptureConfiguration) this.instance).getMaxFrameCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public Camera.Resolution getResolution() {
                return ((CaptureConfiguration) this.instance).getResolution();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.CaptureConfigurationOrBuilder
            public boolean hasResolution() {
                return ((CaptureConfiguration) this.instance).hasResolution();
            }

            public Builder mergeResolution(Camera.Resolution resolution) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).mergeResolution(resolution);
                return this;
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setCameraId(i);
                return this;
            }

            public Builder setCaptureMode(CaptureMode captureMode) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setCaptureMode(captureMode);
                return this;
            }

            public Builder setCaptureModeValue(int i) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setCaptureModeValue(i);
                return this;
            }

            public Builder setEnrichmentsEnabled(int i, EnrichmentType enrichmentType) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setEnrichmentsEnabled(i, enrichmentType);
                return this;
            }

            public Builder setEnrichmentsEnabledValue(int i, int i2) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setEnrichmentsEnabledValue(i, i2);
                return this;
            }

            public Builder setFrameRate(float f) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setFrameRate(f);
                return this;
            }

            public Builder setImageFormat(String str) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setImageFormat(str);
                return this;
            }

            public Builder setImageFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setImageFormatBytes(byteString);
                return this;
            }

            public Builder setMaxFrameBytes(int i) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setMaxFrameBytes(i);
                return this;
            }

            public Builder setMaxFrameCount(int i) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setMaxFrameCount(i);
                return this;
            }

            public Builder setResolution(Camera.Resolution resolution) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setResolution(resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setResolution(Camera.Resolution.Builder builder) {
                copyOnWrite();
                ((CaptureConfiguration) this.instance).setResolution(builder);
                return this;
            }
        }

        public static Builder newBuilder(CaptureConfiguration captureConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(captureConfiguration);
        }

        public static CaptureConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Camera.Resolution resolution) {
            resolution.getClass();
            this.resolution_ = resolution;
        }

        public static CaptureConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CaptureConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CaptureConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CaptureConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CaptureConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaptureConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CaptureConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CaptureConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CaptureConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EnrichmentData extends GeneratedMessageLite<EnrichmentData, Builder> implements EnrichmentDataOrBuilder {
        private static final EnrichmentData DEFAULT_INSTANCE;
        public static final int FACE_DATA_FIELD_NUMBER = 5;
        public static final int FRAME_CAPTURE_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int GESTURE_DATA_FIELD_NUMBER = 6;
        public static final int OCR_DATA_FIELD_NUMBER = 4;
        public static final int OPTICAL_CODE_DATA_FIELD_NUMBER = 7;
        private static volatile Parser<EnrichmentData> PARSER = null;
        public static final int PROCESSING_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private Object enrichmentContent_;
        private int type_;
        private int enrichmentContentCase_ = 0;
        private String frameCaptureTimestamp_ = "";
        private String processingTimestamp_ = "";

        static {
            EnrichmentData enrichmentData = new EnrichmentData();
            DEFAULT_INSTANCE = enrichmentData;
            enrichmentData.makeImmutable();
        }

        private EnrichmentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnrichmentContent() {
            this.enrichmentContentCase_ = 0;
            this.enrichmentContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaceData() {
            if (this.enrichmentContentCase_ == 5) {
                this.enrichmentContentCase_ = 0;
                this.enrichmentContent_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameCaptureTimestamp() {
            this.frameCaptureTimestamp_ = getDefaultInstance().getFrameCaptureTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGestureData() {
            if (this.enrichmentContentCase_ == 6) {
                this.enrichmentContentCase_ = 0;
                this.enrichmentContent_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOcrData() {
            if (this.enrichmentContentCase_ == 4) {
                this.enrichmentContentCase_ = 0;
                this.enrichmentContent_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpticalCodeData() {
            if (this.enrichmentContentCase_ == 7) {
                this.enrichmentContentCase_ = 0;
                this.enrichmentContent_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProcessingTimestamp() {
            this.processingTimestamp_ = getDefaultInstance().getProcessingTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static EnrichmentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFaceData(FaceDetectionEnrichmentData faceDetectionEnrichmentData) {
            if (this.enrichmentContentCase_ != 5 || this.enrichmentContent_ == FaceDetectionEnrichmentData.getDefaultInstance()) {
                this.enrichmentContent_ = faceDetectionEnrichmentData;
            } else {
                this.enrichmentContent_ = FaceDetectionEnrichmentData.newBuilder((FaceDetectionEnrichmentData) this.enrichmentContent_).mergeFrom((FaceDetectionEnrichmentData.Builder) faceDetectionEnrichmentData).buildPartial();
            }
            this.enrichmentContentCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGestureData(GestureDetectionEnrichmentData gestureDetectionEnrichmentData) {
            if (this.enrichmentContentCase_ != 6 || this.enrichmentContent_ == GestureDetectionEnrichmentData.getDefaultInstance()) {
                this.enrichmentContent_ = gestureDetectionEnrichmentData;
            } else {
                this.enrichmentContent_ = GestureDetectionEnrichmentData.newBuilder((GestureDetectionEnrichmentData) this.enrichmentContent_).mergeFrom((GestureDetectionEnrichmentData.Builder) gestureDetectionEnrichmentData).buildPartial();
            }
            this.enrichmentContentCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOcrData(OCREnrichmentData oCREnrichmentData) {
            if (this.enrichmentContentCase_ != 4 || this.enrichmentContent_ == OCREnrichmentData.getDefaultInstance()) {
                this.enrichmentContent_ = oCREnrichmentData;
            } else {
                this.enrichmentContent_ = OCREnrichmentData.newBuilder((OCREnrichmentData) this.enrichmentContent_).mergeFrom((OCREnrichmentData.Builder) oCREnrichmentData).buildPartial();
            }
            this.enrichmentContentCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOpticalCodeData(OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData) {
            if (this.enrichmentContentCase_ != 7 || this.enrichmentContent_ == OpticalCodeDetectionEnrichmentData.getDefaultInstance()) {
                this.enrichmentContent_ = opticalCodeDetectionEnrichmentData;
            } else {
                this.enrichmentContent_ = OpticalCodeDetectionEnrichmentData.newBuilder((OpticalCodeDetectionEnrichmentData) this.enrichmentContent_).mergeFrom((OpticalCodeDetectionEnrichmentData.Builder) opticalCodeDetectionEnrichmentData).buildPartial();
            }
            this.enrichmentContentCase_ = 7;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnrichmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrichmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnrichmentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaceData(FaceDetectionEnrichmentData.Builder builder) {
            this.enrichmentContent_ = builder.build();
            this.enrichmentContentCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameCaptureTimestamp(String str) {
            str.getClass();
            this.frameCaptureTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameCaptureTimestampBytes(ByteString byteString) {
            this.frameCaptureTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGestureData(GestureDetectionEnrichmentData.Builder builder) {
            this.enrichmentContent_ = builder.build();
            this.enrichmentContentCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOcrData(OCREnrichmentData.Builder builder) {
            this.enrichmentContent_ = builder.build();
            this.enrichmentContentCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpticalCodeData(OpticalCodeDetectionEnrichmentData.Builder builder) {
            this.enrichmentContent_ = builder.build();
            this.enrichmentContentCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessingTimestamp(String str) {
            str.getClass();
            this.processingTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessingTimestampBytes(ByteString byteString) {
            this.processingTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(EnrichmentType enrichmentType) {
            enrichmentType.getClass();
            this.type_ = enrichmentType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnrichmentData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    EnrichmentData enrichmentData = (EnrichmentData) obj2;
                    int i2 = this.type_;
                    boolean z = i2 != 0;
                    int i3 = enrichmentData.type_;
                    this.type_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    this.frameCaptureTimestamp_ = visitor.visitString(!this.frameCaptureTimestamp_.isEmpty(), this.frameCaptureTimestamp_, !enrichmentData.frameCaptureTimestamp_.isEmpty(), enrichmentData.frameCaptureTimestamp_);
                    this.processingTimestamp_ = visitor.visitString(!this.processingTimestamp_.isEmpty(), this.processingTimestamp_, !enrichmentData.processingTimestamp_.isEmpty(), enrichmentData.processingTimestamp_);
                    int i4 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Vision$EnrichmentData$EnrichmentContentCase[enrichmentData.getEnrichmentContentCase().ordinal()];
                    if (i4 == 1) {
                        this.enrichmentContent_ = visitor.visitOneofMessage(this.enrichmentContentCase_ == 4, this.enrichmentContent_, enrichmentData.enrichmentContent_);
                    } else if (i4 == 2) {
                        this.enrichmentContent_ = visitor.visitOneofMessage(this.enrichmentContentCase_ == 5, this.enrichmentContent_, enrichmentData.enrichmentContent_);
                    } else if (i4 == 3) {
                        this.enrichmentContent_ = visitor.visitOneofMessage(this.enrichmentContentCase_ == 6, this.enrichmentContent_, enrichmentData.enrichmentContent_);
                    } else if (i4 == 4) {
                        this.enrichmentContent_ = visitor.visitOneofMessage(this.enrichmentContentCase_ == 7, this.enrichmentContent_, enrichmentData.enrichmentContent_);
                    } else if (i4 == 5) {
                        visitor.visitOneofNotSet(this.enrichmentContentCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = enrichmentData.enrichmentContentCase_) != 0) {
                        this.enrichmentContentCase_ = i;
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
                                    this.type_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.frameCaptureTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.processingTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    OCREnrichmentData.Builder builder = this.enrichmentContentCase_ == 4 ? ((OCREnrichmentData) this.enrichmentContent_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(OCREnrichmentData.parser(), extensionRegistryLite);
                                    this.enrichmentContent_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((OCREnrichmentData.Builder) readMessage);
                                        this.enrichmentContent_ = builder.buildPartial();
                                    }
                                    this.enrichmentContentCase_ = 4;
                                } else if (readTag == 42) {
                                    FaceDetectionEnrichmentData.Builder builder2 = this.enrichmentContentCase_ == 5 ? ((FaceDetectionEnrichmentData) this.enrichmentContent_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(FaceDetectionEnrichmentData.parser(), extensionRegistryLite);
                                    this.enrichmentContent_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((FaceDetectionEnrichmentData.Builder) readMessage2);
                                        this.enrichmentContent_ = builder2.buildPartial();
                                    }
                                    this.enrichmentContentCase_ = 5;
                                } else if (readTag == 50) {
                                    GestureDetectionEnrichmentData.Builder builder3 = this.enrichmentContentCase_ == 6 ? ((GestureDetectionEnrichmentData) this.enrichmentContent_).toBuilder() : null;
                                    MessageLite readMessage3 = codedInputStream.readMessage(GestureDetectionEnrichmentData.parser(), extensionRegistryLite);
                                    this.enrichmentContent_ = readMessage3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((GestureDetectionEnrichmentData.Builder) readMessage3);
                                        this.enrichmentContent_ = builder3.buildPartial();
                                    }
                                    this.enrichmentContentCase_ = 6;
                                } else if (readTag == 58) {
                                    OpticalCodeDetectionEnrichmentData.Builder builder4 = this.enrichmentContentCase_ == 7 ? ((OpticalCodeDetectionEnrichmentData) this.enrichmentContent_).toBuilder() : null;
                                    MessageLite readMessage4 = codedInputStream.readMessage(OpticalCodeDetectionEnrichmentData.parser(), extensionRegistryLite);
                                    this.enrichmentContent_ = readMessage4;
                                    if (builder4 != null) {
                                        builder4.mergeFrom((OpticalCodeDetectionEnrichmentData.Builder) readMessage4);
                                        this.enrichmentContent_ = builder4.buildPartial();
                                    }
                                    this.enrichmentContentCase_ = 7;
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
                        synchronized (EnrichmentData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public EnrichmentContentCase getEnrichmentContentCase() {
            return EnrichmentContentCase.forNumber(this.enrichmentContentCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public FaceDetectionEnrichmentData getFaceData() {
            return this.enrichmentContentCase_ == 5 ? (FaceDetectionEnrichmentData) this.enrichmentContent_ : FaceDetectionEnrichmentData.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public String getFrameCaptureTimestamp() {
            return this.frameCaptureTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public ByteString getFrameCaptureTimestampBytes() {
            return ByteString.copyFromUtf8(this.frameCaptureTimestamp_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public GestureDetectionEnrichmentData getGestureData() {
            return this.enrichmentContentCase_ == 6 ? (GestureDetectionEnrichmentData) this.enrichmentContent_ : GestureDetectionEnrichmentData.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public OCREnrichmentData getOcrData() {
            return this.enrichmentContentCase_ == 4 ? (OCREnrichmentData) this.enrichmentContent_ : OCREnrichmentData.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public OpticalCodeDetectionEnrichmentData getOpticalCodeData() {
            return this.enrichmentContentCase_ == 7 ? (OpticalCodeDetectionEnrichmentData) this.enrichmentContent_ : OpticalCodeDetectionEnrichmentData.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public String getProcessingTimestamp() {
            return this.processingTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public ByteString getProcessingTimestampBytes() {
            return ByteString.copyFromUtf8(this.processingTimestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != EnrichmentType.ENRICHMENT_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (!this.frameCaptureTimestamp_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getFrameCaptureTimestamp());
            }
            if (!this.processingTimestamp_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(3, getProcessingTimestamp());
            }
            if (this.enrichmentContentCase_ == 4) {
                computeEnumSize += CodedOutputStream.computeMessageSize(4, (OCREnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 5) {
                computeEnumSize += CodedOutputStream.computeMessageSize(5, (FaceDetectionEnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 6) {
                computeEnumSize += CodedOutputStream.computeMessageSize(6, (GestureDetectionEnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 7) {
                computeEnumSize += CodedOutputStream.computeMessageSize(7, (OpticalCodeDetectionEnrichmentData) this.enrichmentContent_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public EnrichmentType getType() {
            EnrichmentType forNumber = EnrichmentType.forNumber(this.type_);
            return forNumber == null ? EnrichmentType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public boolean hasFaceData() {
            return this.enrichmentContentCase_ == 5;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public boolean hasGestureData() {
            return this.enrichmentContentCase_ == 6;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public boolean hasOcrData() {
            return this.enrichmentContentCase_ == 4;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
        public boolean hasOpticalCodeData() {
            return this.enrichmentContentCase_ == 7;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != EnrichmentType.ENRICHMENT_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (!this.frameCaptureTimestamp_.isEmpty()) {
                codedOutputStream.writeString(2, getFrameCaptureTimestamp());
            }
            if (!this.processingTimestamp_.isEmpty()) {
                codedOutputStream.writeString(3, getProcessingTimestamp());
            }
            if (this.enrichmentContentCase_ == 4) {
                codedOutputStream.writeMessage(4, (OCREnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 5) {
                codedOutputStream.writeMessage(5, (FaceDetectionEnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 6) {
                codedOutputStream.writeMessage(6, (GestureDetectionEnrichmentData) this.enrichmentContent_);
            }
            if (this.enrichmentContentCase_ == 7) {
                codedOutputStream.writeMessage(7, (OpticalCodeDetectionEnrichmentData) this.enrichmentContent_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<EnrichmentData, Builder> implements EnrichmentDataOrBuilder {
            private Builder() {
                super(EnrichmentData.DEFAULT_INSTANCE);
            }

            public Builder clearEnrichmentContent() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearEnrichmentContent();
                return this;
            }

            public Builder clearFaceData() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearFaceData();
                return this;
            }

            public Builder clearFrameCaptureTimestamp() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearFrameCaptureTimestamp();
                return this;
            }

            public Builder clearGestureData() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearGestureData();
                return this;
            }

            public Builder clearOcrData() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearOcrData();
                return this;
            }

            public Builder clearOpticalCodeData() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearOpticalCodeData();
                return this;
            }

            public Builder clearProcessingTimestamp() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearProcessingTimestamp();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((EnrichmentData) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public EnrichmentContentCase getEnrichmentContentCase() {
                return ((EnrichmentData) this.instance).getEnrichmentContentCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public FaceDetectionEnrichmentData getFaceData() {
                return ((EnrichmentData) this.instance).getFaceData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public String getFrameCaptureTimestamp() {
                return ((EnrichmentData) this.instance).getFrameCaptureTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public ByteString getFrameCaptureTimestampBytes() {
                return ((EnrichmentData) this.instance).getFrameCaptureTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public GestureDetectionEnrichmentData getGestureData() {
                return ((EnrichmentData) this.instance).getGestureData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public OCREnrichmentData getOcrData() {
                return ((EnrichmentData) this.instance).getOcrData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public OpticalCodeDetectionEnrichmentData getOpticalCodeData() {
                return ((EnrichmentData) this.instance).getOpticalCodeData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public String getProcessingTimestamp() {
                return ((EnrichmentData) this.instance).getProcessingTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public ByteString getProcessingTimestampBytes() {
                return ((EnrichmentData) this.instance).getProcessingTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public EnrichmentType getType() {
                return ((EnrichmentData) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public int getTypeValue() {
                return ((EnrichmentData) this.instance).getTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public boolean hasFaceData() {
                return ((EnrichmentData) this.instance).hasFaceData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public boolean hasGestureData() {
                return ((EnrichmentData) this.instance).hasGestureData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public boolean hasOcrData() {
                return ((EnrichmentData) this.instance).hasOcrData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.EnrichmentDataOrBuilder
            public boolean hasOpticalCodeData() {
                return ((EnrichmentData) this.instance).hasOpticalCodeData();
            }

            public Builder mergeFaceData(FaceDetectionEnrichmentData faceDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).mergeFaceData(faceDetectionEnrichmentData);
                return this;
            }

            public Builder mergeGestureData(GestureDetectionEnrichmentData gestureDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).mergeGestureData(gestureDetectionEnrichmentData);
                return this;
            }

            public Builder mergeOcrData(OCREnrichmentData oCREnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).mergeOcrData(oCREnrichmentData);
                return this;
            }

            public Builder mergeOpticalCodeData(OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).mergeOpticalCodeData(opticalCodeDetectionEnrichmentData);
                return this;
            }

            public Builder setFaceData(FaceDetectionEnrichmentData faceDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setFaceData(faceDetectionEnrichmentData);
                return this;
            }

            public Builder setFrameCaptureTimestamp(String str) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setFrameCaptureTimestamp(str);
                return this;
            }

            public Builder setFrameCaptureTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setFrameCaptureTimestampBytes(byteString);
                return this;
            }

            public Builder setGestureData(GestureDetectionEnrichmentData gestureDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setGestureData(gestureDetectionEnrichmentData);
                return this;
            }

            public Builder setOcrData(OCREnrichmentData oCREnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setOcrData(oCREnrichmentData);
                return this;
            }

            public Builder setOpticalCodeData(OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setOpticalCodeData(opticalCodeDetectionEnrichmentData);
                return this;
            }

            public Builder setProcessingTimestamp(String str) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setProcessingTimestamp(str);
                return this;
            }

            public Builder setProcessingTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setProcessingTimestampBytes(byteString);
                return this;
            }

            public Builder setType(EnrichmentType enrichmentType) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setType(enrichmentType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFaceData(FaceDetectionEnrichmentData.Builder builder) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setFaceData(builder);
                return this;
            }

            public Builder setGestureData(GestureDetectionEnrichmentData.Builder builder) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setGestureData(builder);
                return this;
            }

            public Builder setOcrData(OCREnrichmentData.Builder builder) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setOcrData(builder);
                return this;
            }

            public Builder setOpticalCodeData(OpticalCodeDetectionEnrichmentData.Builder builder) {
                copyOnWrite();
                ((EnrichmentData) this.instance).setOpticalCodeData(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum EnrichmentContentCase implements Internal.EnumLite {
            OCR_DATA(4),
            FACE_DATA(5),
            GESTURE_DATA(6),
            OPTICAL_CODE_DATA(7),
            ENRICHMENTCONTENT_NOT_SET(0);

            private final int value;

            EnrichmentContentCase(int i) {
                this.value = i;
            }

            public static EnrichmentContentCase forNumber(int i) {
                if (i == 0) {
                    return ENRICHMENTCONTENT_NOT_SET;
                }
                if (i == 4) {
                    return OCR_DATA;
                }
                if (i == 5) {
                    return FACE_DATA;
                }
                if (i == 6) {
                    return GESTURE_DATA;
                }
                if (i != 7) {
                    return null;
                }
                return OPTICAL_CODE_DATA;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EnrichmentContentCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(EnrichmentData enrichmentData) {
            return DEFAULT_INSTANCE.createBuilder(enrichmentData);
        }

        public static EnrichmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrichmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnrichmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaceData(FaceDetectionEnrichmentData faceDetectionEnrichmentData) {
            faceDetectionEnrichmentData.getClass();
            this.enrichmentContent_ = faceDetectionEnrichmentData;
            this.enrichmentContentCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGestureData(GestureDetectionEnrichmentData gestureDetectionEnrichmentData) {
            gestureDetectionEnrichmentData.getClass();
            this.enrichmentContent_ = gestureDetectionEnrichmentData;
            this.enrichmentContentCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOcrData(OCREnrichmentData oCREnrichmentData) {
            oCREnrichmentData.getClass();
            this.enrichmentContent_ = oCREnrichmentData;
            this.enrichmentContentCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpticalCodeData(OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData) {
            opticalCodeDetectionEnrichmentData.getClass();
            this.enrichmentContent_ = opticalCodeDetectionEnrichmentData;
            this.enrichmentContentCase_ = 7;
        }

        public static EnrichmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnrichmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnrichmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnrichmentData parseFrom(InputStream inputStream) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrichmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrichmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnrichmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FaceDetection extends GeneratedMessageLite<FaceDetection, Builder> implements FaceDetectionOrBuilder {
        public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 1;
        private static final FaceDetection DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 2;
        private static volatile Parser<FaceDetection> PARSER;
        private float confidenceScore_;
        private Location location_;

        static {
            FaceDetection faceDetection = new FaceDetection();
            DEFAULT_INSTANCE = faceDetection;
            faceDetection.makeImmutable();
        }

        private FaceDetection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfidenceScore() {
            this.confidenceScore_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = null;
        }

        public static FaceDetection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLocation(Location location) {
            Location location2 = this.location_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.location_ = location;
            } else {
                this.location_ = Location.newBuilder(this.location_).mergeFrom((Location.Builder) location).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FaceDetection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceDetection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FaceDetection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfidenceScore(float f) {
            this.confidenceScore_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location.Builder builder) {
            this.location_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FaceDetection();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    FaceDetection faceDetection = (FaceDetection) obj2;
                    float f = this.confidenceScore_;
                    boolean z = f != 0.0f;
                    float f2 = faceDetection.confidenceScore_;
                    this.confidenceScore_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    this.location_ = (Location) visitor.visitMessage(this.location_, faceDetection.location_);
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
                                if (readTag == 13) {
                                    this.confidenceScore_ = codedInputStream.readFloat();
                                } else if (readTag == 18) {
                                    Location location = this.location_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) codedInputStream.readMessage(Location.parser(), extensionRegistryLite);
                                    this.location_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom((Location.Builder) location2);
                                        this.location_ = builder.buildPartial();
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
                        synchronized (FaceDetection.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
        public float getConfidenceScore() {
            return this.confidenceScore_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            float f = this.confidenceScore_;
            int computeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
            if (this.location_ != null) {
                computeFloatSize += CodedOutputStream.computeMessageSize(2, getLocation());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeFloatSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
        public boolean hasLocation() {
            return this.location_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            if (this.location_ != null) {
                codedOutputStream.writeMessage(2, getLocation());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<FaceDetection, Builder> implements FaceDetectionOrBuilder {
            private Builder() {
                super(FaceDetection.DEFAULT_INSTANCE);
            }

            public Builder clearConfidenceScore() {
                copyOnWrite();
                ((FaceDetection) this.instance).clearConfidenceScore();
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((FaceDetection) this.instance).clearLocation();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
            public float getConfidenceScore() {
                return ((FaceDetection) this.instance).getConfidenceScore();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
            public Location getLocation() {
                return ((FaceDetection) this.instance).getLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionOrBuilder
            public boolean hasLocation() {
                return ((FaceDetection) this.instance).hasLocation();
            }

            public Builder mergeLocation(Location location) {
                copyOnWrite();
                ((FaceDetection) this.instance).mergeLocation(location);
                return this;
            }

            public Builder setConfidenceScore(float f) {
                copyOnWrite();
                ((FaceDetection) this.instance).setConfidenceScore(f);
                return this;
            }

            public Builder setLocation(Location location) {
                copyOnWrite();
                ((FaceDetection) this.instance).setLocation(location);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLocation(Location.Builder builder) {
                copyOnWrite();
                ((FaceDetection) this.instance).setLocation(builder);
                return this;
            }
        }

        public static Builder newBuilder(FaceDetection faceDetection) {
            return DEFAULT_INSTANCE.createBuilder(faceDetection);
        }

        public static FaceDetection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FaceDetection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location location) {
            location.getClass();
            this.location_ = location;
        }

        public static FaceDetection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FaceDetection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FaceDetection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FaceDetection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FaceDetection parseFrom(InputStream inputStream) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceDetection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FaceDetection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FaceDetection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FaceDetectionEnrichmentData extends GeneratedMessageLite<FaceDetectionEnrichmentData, Builder> implements FaceDetectionEnrichmentDataOrBuilder {
        private static final FaceDetectionEnrichmentData DEFAULT_INSTANCE;
        public static final int DETECTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<FaceDetectionEnrichmentData> PARSER;
        private Internal.ProtobufList<FaceDetection> detections_ = GeneratedMessageLite.emptyProtobufList();

        static {
            FaceDetectionEnrichmentData faceDetectionEnrichmentData = new FaceDetectionEnrichmentData();
            DEFAULT_INSTANCE = faceDetectionEnrichmentData;
            faceDetectionEnrichmentData.makeImmutable();
        }

        private FaceDetectionEnrichmentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDetections(Iterable<? extends FaceDetection> iterable) {
            ensureDetectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.detections_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(FaceDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetections() {
            this.detections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDetectionsIsMutable() {
            if (this.detections_.isModifiable()) {
                return;
            }
            this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
        }

        public static FaceDetectionEnrichmentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FaceDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FaceDetectionEnrichmentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDetections(int i) {
            ensureDetectionsIsMutable();
            this.detections_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, FaceDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FaceDetectionEnrichmentData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.detections_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.detections_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.detections_, ((FaceDetectionEnrichmentData) obj2).detections_);
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
                                    if (!this.detections_.isModifiable()) {
                                        this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
                                    }
                                    this.detections_.add((FaceDetection) codedInputStream.readMessage(FaceDetection.parser(), extensionRegistryLite));
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
                        synchronized (FaceDetectionEnrichmentData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
        public FaceDetection getDetections(int i) {
            return this.detections_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
        public int getDetectionsCount() {
            return this.detections_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
        public List<FaceDetection> getDetectionsList() {
            return this.detections_;
        }

        public FaceDetectionOrBuilder getDetectionsOrBuilder(int i) {
            return this.detections_.get(i);
        }

        public List<? extends FaceDetectionOrBuilder> getDetectionsOrBuilderList() {
            return this.detections_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.detections_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.detections_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.detections_.size(); i++) {
                codedOutputStream.writeMessage(1, this.detections_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<FaceDetectionEnrichmentData, Builder> implements FaceDetectionEnrichmentDataOrBuilder {
            private Builder() {
                super(FaceDetectionEnrichmentData.DEFAULT_INSTANCE);
            }

            public Builder addAllDetections(Iterable<? extends FaceDetection> iterable) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).addAllDetections(iterable);
                return this;
            }

            public Builder addDetections(FaceDetection faceDetection) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).addDetections(faceDetection);
                return this;
            }

            public Builder clearDetections() {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).clearDetections();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
            public FaceDetection getDetections(int i) {
                return ((FaceDetectionEnrichmentData) this.instance).getDetections(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
            public int getDetectionsCount() {
                return ((FaceDetectionEnrichmentData) this.instance).getDetectionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.FaceDetectionEnrichmentDataOrBuilder
            public List<FaceDetection> getDetectionsList() {
                return Collections.unmodifiableList(((FaceDetectionEnrichmentData) this.instance).getDetectionsList());
            }

            public Builder removeDetections(int i) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).removeDetections(i);
                return this;
            }

            public Builder setDetections(int i, FaceDetection faceDetection) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).setDetections(i, faceDetection);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addDetections(int i, FaceDetection faceDetection) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).addDetections(i, faceDetection);
                return this;
            }

            public Builder setDetections(int i, FaceDetection.Builder builder) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).setDetections(i, builder);
                return this;
            }

            public Builder addDetections(FaceDetection.Builder builder) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).addDetections(builder);
                return this;
            }

            public Builder addDetections(int i, FaceDetection.Builder builder) {
                copyOnWrite();
                ((FaceDetectionEnrichmentData) this.instance).addDetections(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(FaceDetectionEnrichmentData faceDetectionEnrichmentData) {
            return DEFAULT_INSTANCE.createBuilder(faceDetectionEnrichmentData);
        }

        public static FaceDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FaceDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FaceDetectionEnrichmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FaceDetectionEnrichmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FaceDetectionEnrichmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FaceDetectionEnrichmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FaceDetectionEnrichmentData parseFrom(InputStream inputStream) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, FaceDetection faceDetection) {
            faceDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(i, faceDetection);
        }

        public static FaceDetectionEnrichmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, FaceDetection faceDetection) {
            faceDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.set(i, faceDetection);
        }

        public static FaceDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FaceDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FaceDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(FaceDetection faceDetection) {
            faceDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(faceDetection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, FaceDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GestureDetection extends GeneratedMessageLite<GestureDetection, Builder> implements GestureDetectionOrBuilder {
        public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 2;
        private static final GestureDetection DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int GESTURE_TYPE_FIELD_NUMBER = 1;
        public static final int LOCATION_FIELD_NUMBER = 4;
        private static volatile Parser<GestureDetection> PARSER;
        private float confidenceScore_;
        private Location location_;
        private String gestureType_ = "";
        private String description_ = "";

        static {
            GestureDetection gestureDetection = new GestureDetection();
            DEFAULT_INSTANCE = gestureDetection;
            gestureDetection.makeImmutable();
        }

        private GestureDetection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfidenceScore() {
            this.confidenceScore_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGestureType() {
            this.gestureType_ = getDefaultInstance().getGestureType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = null;
        }

        public static GestureDetection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLocation(Location location) {
            Location location2 = this.location_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.location_ = location;
            } else {
                this.location_ = Location.newBuilder(this.location_).mergeFrom((Location.Builder) location).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GestureDetection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GestureDetection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GestureDetection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfidenceScore(float f) {
            this.confidenceScore_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            this.description_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGestureType(String str) {
            str.getClass();
            this.gestureType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGestureTypeBytes(ByteString byteString) {
            this.gestureType_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location.Builder builder) {
            this.location_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GestureDetection();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GestureDetection gestureDetection = (GestureDetection) obj2;
                    this.gestureType_ = visitor.visitString(!this.gestureType_.isEmpty(), this.gestureType_, !gestureDetection.gestureType_.isEmpty(), gestureDetection.gestureType_);
                    float f = this.confidenceScore_;
                    boolean z = f != 0.0f;
                    float f2 = gestureDetection.confidenceScore_;
                    this.confidenceScore_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    this.description_ = visitor.visitString(!this.description_.isEmpty(), this.description_, !gestureDetection.description_.isEmpty(), gestureDetection.description_);
                    this.location_ = (Location) visitor.visitMessage(this.location_, gestureDetection.location_);
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
                                    this.gestureType_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 21) {
                                    this.confidenceScore_ = codedInputStream.readFloat();
                                } else if (readTag == 26) {
                                    this.description_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    Location location = this.location_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) codedInputStream.readMessage(Location.parser(), extensionRegistryLite);
                                    this.location_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom((Location.Builder) location2);
                                        this.location_ = builder.buildPartial();
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
                        synchronized (GestureDetection.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public float getConfidenceScore() {
            return this.confidenceScore_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public String getGestureType() {
            return this.gestureType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public ByteString getGestureTypeBytes() {
            return ByteString.copyFromUtf8(this.gestureType_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.gestureType_.isEmpty() ? CodedOutputStream.computeStringSize(1, getGestureType()) : 0;
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                computeStringSize += CodedOutputStream.computeFloatSize(2, f);
            }
            if (!this.description_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getDescription());
            }
            if (this.location_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, getLocation());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
        public boolean hasLocation() {
            return this.location_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.gestureType_.isEmpty()) {
                codedOutputStream.writeString(1, getGestureType());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            if (!this.description_.isEmpty()) {
                codedOutputStream.writeString(3, getDescription());
            }
            if (this.location_ != null) {
                codedOutputStream.writeMessage(4, getLocation());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GestureDetection, Builder> implements GestureDetectionOrBuilder {
            private Builder() {
                super(GestureDetection.DEFAULT_INSTANCE);
            }

            public Builder clearConfidenceScore() {
                copyOnWrite();
                ((GestureDetection) this.instance).clearConfidenceScore();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((GestureDetection) this.instance).clearDescription();
                return this;
            }

            public Builder clearGestureType() {
                copyOnWrite();
                ((GestureDetection) this.instance).clearGestureType();
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((GestureDetection) this.instance).clearLocation();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public float getConfidenceScore() {
                return ((GestureDetection) this.instance).getConfidenceScore();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public String getDescription() {
                return ((GestureDetection) this.instance).getDescription();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public ByteString getDescriptionBytes() {
                return ((GestureDetection) this.instance).getDescriptionBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public String getGestureType() {
                return ((GestureDetection) this.instance).getGestureType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public ByteString getGestureTypeBytes() {
                return ((GestureDetection) this.instance).getGestureTypeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public Location getLocation() {
                return ((GestureDetection) this.instance).getLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionOrBuilder
            public boolean hasLocation() {
                return ((GestureDetection) this.instance).hasLocation();
            }

            public Builder mergeLocation(Location location) {
                copyOnWrite();
                ((GestureDetection) this.instance).mergeLocation(location);
                return this;
            }

            public Builder setConfidenceScore(float f) {
                copyOnWrite();
                ((GestureDetection) this.instance).setConfidenceScore(f);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((GestureDetection) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((GestureDetection) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setGestureType(String str) {
                copyOnWrite();
                ((GestureDetection) this.instance).setGestureType(str);
                return this;
            }

            public Builder setGestureTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((GestureDetection) this.instance).setGestureTypeBytes(byteString);
                return this;
            }

            public Builder setLocation(Location location) {
                copyOnWrite();
                ((GestureDetection) this.instance).setLocation(location);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLocation(Location.Builder builder) {
                copyOnWrite();
                ((GestureDetection) this.instance).setLocation(builder);
                return this;
            }
        }

        public static Builder newBuilder(GestureDetection gestureDetection) {
            return DEFAULT_INSTANCE.createBuilder(gestureDetection);
        }

        public static GestureDetection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GestureDetection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location location) {
            location.getClass();
            this.location_ = location;
        }

        public static GestureDetection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GestureDetection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GestureDetection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GestureDetection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GestureDetection parseFrom(InputStream inputStream) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GestureDetection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GestureDetection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GestureDetection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GestureDetectionEnrichmentData extends GeneratedMessageLite<GestureDetectionEnrichmentData, Builder> implements GestureDetectionEnrichmentDataOrBuilder {
        private static final GestureDetectionEnrichmentData DEFAULT_INSTANCE;
        public static final int DETECTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<GestureDetectionEnrichmentData> PARSER;
        private Internal.ProtobufList<GestureDetection> detections_ = GeneratedMessageLite.emptyProtobufList();

        static {
            GestureDetectionEnrichmentData gestureDetectionEnrichmentData = new GestureDetectionEnrichmentData();
            DEFAULT_INSTANCE = gestureDetectionEnrichmentData;
            gestureDetectionEnrichmentData.makeImmutable();
        }

        private GestureDetectionEnrichmentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDetections(Iterable<? extends GestureDetection> iterable) {
            ensureDetectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.detections_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(GestureDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetections() {
            this.detections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDetectionsIsMutable() {
            if (this.detections_.isModifiable()) {
                return;
            }
            this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
        }

        public static GestureDetectionEnrichmentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GestureDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GestureDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GestureDetectionEnrichmentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDetections(int i) {
            ensureDetectionsIsMutable();
            this.detections_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, GestureDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GestureDetectionEnrichmentData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.detections_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.detections_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.detections_, ((GestureDetectionEnrichmentData) obj2).detections_);
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
                                    if (!this.detections_.isModifiable()) {
                                        this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
                                    }
                                    this.detections_.add((GestureDetection) codedInputStream.readMessage(GestureDetection.parser(), extensionRegistryLite));
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
                        synchronized (GestureDetectionEnrichmentData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
        public GestureDetection getDetections(int i) {
            return this.detections_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
        public int getDetectionsCount() {
            return this.detections_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
        public List<GestureDetection> getDetectionsList() {
            return this.detections_;
        }

        public GestureDetectionOrBuilder getDetectionsOrBuilder(int i) {
            return this.detections_.get(i);
        }

        public List<? extends GestureDetectionOrBuilder> getDetectionsOrBuilderList() {
            return this.detections_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.detections_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.detections_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.detections_.size(); i++) {
                codedOutputStream.writeMessage(1, this.detections_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GestureDetectionEnrichmentData, Builder> implements GestureDetectionEnrichmentDataOrBuilder {
            private Builder() {
                super(GestureDetectionEnrichmentData.DEFAULT_INSTANCE);
            }

            public Builder addAllDetections(Iterable<? extends GestureDetection> iterable) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).addAllDetections(iterable);
                return this;
            }

            public Builder addDetections(GestureDetection gestureDetection) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).addDetections(gestureDetection);
                return this;
            }

            public Builder clearDetections() {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).clearDetections();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
            public GestureDetection getDetections(int i) {
                return ((GestureDetectionEnrichmentData) this.instance).getDetections(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
            public int getDetectionsCount() {
                return ((GestureDetectionEnrichmentData) this.instance).getDetectionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GestureDetectionEnrichmentDataOrBuilder
            public List<GestureDetection> getDetectionsList() {
                return Collections.unmodifiableList(((GestureDetectionEnrichmentData) this.instance).getDetectionsList());
            }

            public Builder removeDetections(int i) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).removeDetections(i);
                return this;
            }

            public Builder setDetections(int i, GestureDetection gestureDetection) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).setDetections(i, gestureDetection);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addDetections(int i, GestureDetection gestureDetection) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).addDetections(i, gestureDetection);
                return this;
            }

            public Builder setDetections(int i, GestureDetection.Builder builder) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).setDetections(i, builder);
                return this;
            }

            public Builder addDetections(GestureDetection.Builder builder) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).addDetections(builder);
                return this;
            }

            public Builder addDetections(int i, GestureDetection.Builder builder) {
                copyOnWrite();
                ((GestureDetectionEnrichmentData) this.instance).addDetections(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(GestureDetectionEnrichmentData gestureDetectionEnrichmentData) {
            return DEFAULT_INSTANCE.createBuilder(gestureDetectionEnrichmentData);
        }

        public static GestureDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GestureDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GestureDetectionEnrichmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GestureDetectionEnrichmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GestureDetectionEnrichmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GestureDetectionEnrichmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GestureDetectionEnrichmentData parseFrom(InputStream inputStream) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, GestureDetection gestureDetection) {
            gestureDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(i, gestureDetection);
        }

        public static GestureDetectionEnrichmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, GestureDetection gestureDetection) {
            gestureDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.set(i, gestureDetection);
        }

        public static GestureDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GestureDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GestureDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(GestureDetection gestureDetection) {
            gestureDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(gestureDetection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, GestureDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetVisionCaptureConfigurationsResponse extends GeneratedMessageLite<GetVisionCaptureConfigurationsResponse, Builder> implements GetVisionCaptureConfigurationsResponseOrBuilder {
        private static final GetVisionCaptureConfigurationsResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        private static volatile Parser<GetVisionCaptureConfigurationsResponse> PARSER = null;
        public static final int SUPPORTED_CONFIGURATIONS_FIELD_NUMBER = 2;
        private int bitField0_;
        private String errorMessage_ = "";
        private Internal.ProtobufList<VisionCaptureConfigurations> supportedConfigurations_ = GeneratedMessageLite.emptyProtobufList();

        static {
            GetVisionCaptureConfigurationsResponse getVisionCaptureConfigurationsResponse = new GetVisionCaptureConfigurationsResponse();
            DEFAULT_INSTANCE = getVisionCaptureConfigurationsResponse;
            getVisionCaptureConfigurationsResponse.makeImmutable();
        }

        private GetVisionCaptureConfigurationsResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedConfigurations(Iterable<? extends VisionCaptureConfigurations> iterable) {
            ensureSupportedConfigurationsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.supportedConfigurations_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedConfigurations(VisionCaptureConfigurations.Builder builder) {
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedConfigurations() {
            this.supportedConfigurations_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSupportedConfigurationsIsMutable() {
            if (this.supportedConfigurations_.isModifiable()) {
                return;
            }
            this.supportedConfigurations_ = GeneratedMessageLite.mutableCopy(this.supportedConfigurations_);
        }

        public static GetVisionCaptureConfigurationsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetVisionCaptureConfigurationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetVisionCaptureConfigurationsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSupportedConfigurations(int i) {
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.remove(i);
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
        public void setSupportedConfigurations(int i, VisionCaptureConfigurations.Builder builder) {
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetVisionCaptureConfigurationsResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.supportedConfigurations_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetVisionCaptureConfigurationsResponse getVisionCaptureConfigurationsResponse = (GetVisionCaptureConfigurationsResponse) obj2;
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !getVisionCaptureConfigurationsResponse.errorMessage_.isEmpty(), getVisionCaptureConfigurationsResponse.errorMessage_);
                    this.supportedConfigurations_ = visitor.visitList(this.supportedConfigurations_, getVisionCaptureConfigurationsResponse.supportedConfigurations_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= getVisionCaptureConfigurationsResponse.bitField0_;
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
                                    this.errorMessage_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    if (!this.supportedConfigurations_.isModifiable()) {
                                        this.supportedConfigurations_ = GeneratedMessageLite.mutableCopy(this.supportedConfigurations_);
                                    }
                                    this.supportedConfigurations_.add((VisionCaptureConfigurations) codedInputStream.readMessage(VisionCaptureConfigurations.parser(), extensionRegistryLite));
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
                        synchronized (GetVisionCaptureConfigurationsResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.errorMessage_.isEmpty() ? CodedOutputStream.computeStringSize(1, getErrorMessage()) : 0;
            for (int i2 = 0; i2 < this.supportedConfigurations_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, this.supportedConfigurations_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
        public VisionCaptureConfigurations getSupportedConfigurations(int i) {
            return this.supportedConfigurations_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
        public int getSupportedConfigurationsCount() {
            return this.supportedConfigurations_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
        public List<VisionCaptureConfigurations> getSupportedConfigurationsList() {
            return this.supportedConfigurations_;
        }

        public VisionCaptureConfigurationsOrBuilder getSupportedConfigurationsOrBuilder(int i) {
            return this.supportedConfigurations_.get(i);
        }

        public List<? extends VisionCaptureConfigurationsOrBuilder> getSupportedConfigurationsOrBuilderList() {
            return this.supportedConfigurations_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(1, getErrorMessage());
            }
            for (int i = 0; i < this.supportedConfigurations_.size(); i++) {
                codedOutputStream.writeMessage(2, this.supportedConfigurations_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetVisionCaptureConfigurationsResponse, Builder> implements GetVisionCaptureConfigurationsResponseOrBuilder {
            private Builder() {
                super(GetVisionCaptureConfigurationsResponse.DEFAULT_INSTANCE);
            }

            public Builder addAllSupportedConfigurations(Iterable<? extends VisionCaptureConfigurations> iterable) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).addAllSupportedConfigurations(iterable);
                return this;
            }

            public Builder addSupportedConfigurations(VisionCaptureConfigurations visionCaptureConfigurations) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).addSupportedConfigurations(visionCaptureConfigurations);
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearSupportedConfigurations() {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).clearSupportedConfigurations();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
            public String getErrorMessage() {
                return ((GetVisionCaptureConfigurationsResponse) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((GetVisionCaptureConfigurationsResponse) this.instance).getErrorMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
            public VisionCaptureConfigurations getSupportedConfigurations(int i) {
                return ((GetVisionCaptureConfigurationsResponse) this.instance).getSupportedConfigurations(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
            public int getSupportedConfigurationsCount() {
                return ((GetVisionCaptureConfigurationsResponse) this.instance).getSupportedConfigurationsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsResponseOrBuilder
            public List<VisionCaptureConfigurations> getSupportedConfigurationsList() {
                return Collections.unmodifiableList(((GetVisionCaptureConfigurationsResponse) this.instance).getSupportedConfigurationsList());
            }

            public Builder removeSupportedConfigurations(int i) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).removeSupportedConfigurations(i);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setSupportedConfigurations(int i, VisionCaptureConfigurations visionCaptureConfigurations) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).setSupportedConfigurations(i, visionCaptureConfigurations);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSupportedConfigurations(int i, VisionCaptureConfigurations visionCaptureConfigurations) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).addSupportedConfigurations(i, visionCaptureConfigurations);
                return this;
            }

            public Builder setSupportedConfigurations(int i, VisionCaptureConfigurations.Builder builder) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).setSupportedConfigurations(i, builder);
                return this;
            }

            public Builder addSupportedConfigurations(VisionCaptureConfigurations.Builder builder) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).addSupportedConfigurations(builder);
                return this;
            }

            public Builder addSupportedConfigurations(int i, VisionCaptureConfigurations.Builder builder) {
                copyOnWrite();
                ((GetVisionCaptureConfigurationsResponse) this.instance).addSupportedConfigurations(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(GetVisionCaptureConfigurationsResponse getVisionCaptureConfigurationsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getVisionCaptureConfigurationsResponse);
        }

        public static GetVisionCaptureConfigurationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(InputStream inputStream) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedConfigurations(int i, VisionCaptureConfigurations visionCaptureConfigurations) {
            visionCaptureConfigurations.getClass();
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.add(i, visionCaptureConfigurations);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedConfigurations(int i, VisionCaptureConfigurations visionCaptureConfigurations) {
            visionCaptureConfigurations.getClass();
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.set(i, visionCaptureConfigurations);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetVisionCaptureConfigurationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedConfigurations(VisionCaptureConfigurations visionCaptureConfigurations) {
            visionCaptureConfigurations.getClass();
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.add(visionCaptureConfigurations);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedConfigurations(int i, VisionCaptureConfigurations.Builder builder) {
            ensureSupportedConfigurationsIsMutable();
            this.supportedConfigurations_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageData extends GeneratedMessageLite<ImageData, Builder> implements ImageDataOrBuilder {
        private static final ImageData DEFAULT_INSTANCE;
        public static final int IMAGE_DATA_FIELD_NUMBER = 3;
        public static final int IMAGE_FORMAT_FIELD_NUMBER = 2;
        private static volatile Parser<ImageData> PARSER = null;
        public static final int RESOLUTION_FIELD_NUMBER = 1;
        private Camera.Resolution resolution_;
        private String imageFormat_ = "";
        private ByteString imageData_ = ByteString.EMPTY;

        static {
            ImageData imageData = new ImageData();
            DEFAULT_INSTANCE = imageData;
            imageData.makeImmutable();
        }

        private ImageData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageData() {
            this.imageData_ = getDefaultInstance().getImageData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageFormat() {
            this.imageFormat_ = getDefaultInstance().getImageFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolution() {
            this.resolution_ = null;
        }

        public static ImageData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResolution(Camera.Resolution resolution) {
            Camera.Resolution resolution2 = this.resolution_;
            if (resolution2 == null || resolution2 == Camera.Resolution.getDefaultInstance()) {
                this.resolution_ = resolution;
            } else {
                this.resolution_ = Camera.Resolution.newBuilder(this.resolution_).mergeFrom((Camera.Resolution.Builder) resolution).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImageData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImageData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageData(ByteString byteString) {
            byteString.getClass();
            this.imageData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageFormat(String str) {
            str.getClass();
            this.imageFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageFormatBytes(ByteString byteString) {
            this.imageFormat_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Camera.Resolution.Builder builder) {
            this.resolution_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImageData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ImageData imageData = (ImageData) obj2;
                    this.resolution_ = (Camera.Resolution) visitor.visitMessage(this.resolution_, imageData.resolution_);
                    this.imageFormat_ = visitor.visitString(!this.imageFormat_.isEmpty(), this.imageFormat_, !imageData.imageFormat_.isEmpty(), imageData.imageFormat_);
                    ByteString byteString = this.imageData_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = imageData.imageData_;
                    this.imageData_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
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
                                    Camera.Resolution resolution = this.resolution_;
                                    Camera.Resolution.Builder builder = resolution != null ? resolution.toBuilder() : null;
                                    Camera.Resolution resolution2 = (Camera.Resolution) codedInputStream.readMessage(Camera.Resolution.parser(), extensionRegistryLite);
                                    this.resolution_ = resolution2;
                                    if (builder != null) {
                                        builder.mergeFrom((Camera.Resolution.Builder) resolution2);
                                        this.resolution_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.imageFormat_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.imageData_ = codedInputStream.readBytes();
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
                        synchronized (ImageData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
        public ByteString getImageData() {
            return this.imageData_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
        public String getImageFormat() {
            return this.imageFormat_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
        public ByteString getImageFormatBytes() {
            return ByteString.copyFromUtf8(this.imageFormat_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
        public Camera.Resolution getResolution() {
            Camera.Resolution resolution = this.resolution_;
            return resolution == null ? Camera.Resolution.getDefaultInstance() : resolution;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.resolution_ != null ? CodedOutputStream.computeMessageSize(1, getResolution()) : 0;
            if (!this.imageFormat_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getImageFormat());
            }
            if (!this.imageData_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeBytesSize(3, this.imageData_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
        public boolean hasResolution() {
            return this.resolution_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.resolution_ != null) {
                codedOutputStream.writeMessage(1, getResolution());
            }
            if (!this.imageFormat_.isEmpty()) {
                codedOutputStream.writeString(2, getImageFormat());
            }
            if (!this.imageData_.isEmpty()) {
                codedOutputStream.writeBytes(3, this.imageData_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ImageData, Builder> implements ImageDataOrBuilder {
            private Builder() {
                super(ImageData.DEFAULT_INSTANCE);
            }

            public Builder clearImageData() {
                copyOnWrite();
                ((ImageData) this.instance).clearImageData();
                return this;
            }

            public Builder clearImageFormat() {
                copyOnWrite();
                ((ImageData) this.instance).clearImageFormat();
                return this;
            }

            public Builder clearResolution() {
                copyOnWrite();
                ((ImageData) this.instance).clearResolution();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
            public ByteString getImageData() {
                return ((ImageData) this.instance).getImageData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
            public String getImageFormat() {
                return ((ImageData) this.instance).getImageFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
            public ByteString getImageFormatBytes() {
                return ((ImageData) this.instance).getImageFormatBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
            public Camera.Resolution getResolution() {
                return ((ImageData) this.instance).getResolution();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ImageDataOrBuilder
            public boolean hasResolution() {
                return ((ImageData) this.instance).hasResolution();
            }

            public Builder mergeResolution(Camera.Resolution resolution) {
                copyOnWrite();
                ((ImageData) this.instance).mergeResolution(resolution);
                return this;
            }

            public Builder setImageData(ByteString byteString) {
                copyOnWrite();
                ((ImageData) this.instance).setImageData(byteString);
                return this;
            }

            public Builder setImageFormat(String str) {
                copyOnWrite();
                ((ImageData) this.instance).setImageFormat(str);
                return this;
            }

            public Builder setImageFormatBytes(ByteString byteString) {
                copyOnWrite();
                ((ImageData) this.instance).setImageFormatBytes(byteString);
                return this;
            }

            public Builder setResolution(Camera.Resolution resolution) {
                copyOnWrite();
                ((ImageData) this.instance).setResolution(resolution);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setResolution(Camera.Resolution.Builder builder) {
                copyOnWrite();
                ((ImageData) this.instance).setResolution(builder);
                return this;
            }
        }

        public static Builder newBuilder(ImageData imageData) {
            return DEFAULT_INSTANCE.createBuilder(imageData);
        }

        public static ImageData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolution(Camera.Resolution resolution) {
            resolution.getClass();
            this.resolution_ = resolution;
        }

        public static ImageData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImageData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImageData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImageData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImageData parseFrom(InputStream inputStream) throws IOException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImageData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImageData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
        public static final int BOUNDING_POLYGON_FIELD_NUMBER = 1;
        private static final Location DEFAULT_INSTANCE;
        private static volatile Parser<Location> PARSER;
        private Internal.ProtobufList<Point> boundingPolygon_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            location.makeImmutable();
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBoundingPolygon(Iterable<? extends Point> iterable) {
            ensureBoundingPolygonIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.boundingPolygon_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoundingPolygon(Point.Builder builder) {
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoundingPolygon() {
            this.boundingPolygon_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBoundingPolygonIsMutable() {
            if (this.boundingPolygon_.isModifiable()) {
                return;
            }
            this.boundingPolygon_ = GeneratedMessageLite.mutableCopy(this.boundingPolygon_);
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Location> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBoundingPolygon(int i) {
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoundingPolygon(int i, Point.Builder builder) {
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.boundingPolygon_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.boundingPolygon_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.boundingPolygon_, ((Location) obj2).boundingPolygon_);
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
                                    if (!this.boundingPolygon_.isModifiable()) {
                                        this.boundingPolygon_ = GeneratedMessageLite.mutableCopy(this.boundingPolygon_);
                                    }
                                    this.boundingPolygon_.add((Point) codedInputStream.readMessage(Point.parser(), extensionRegistryLite));
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
                        synchronized (Location.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
        public Point getBoundingPolygon(int i) {
            return this.boundingPolygon_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
        public int getBoundingPolygonCount() {
            return this.boundingPolygon_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
        public List<Point> getBoundingPolygonList() {
            return this.boundingPolygon_;
        }

        public PointOrBuilder getBoundingPolygonOrBuilder(int i) {
            return this.boundingPolygon_.get(i);
        }

        public List<? extends PointOrBuilder> getBoundingPolygonOrBuilderList() {
            return this.boundingPolygon_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.boundingPolygon_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.boundingPolygon_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.boundingPolygon_.size(); i++) {
                codedOutputStream.writeMessage(1, this.boundingPolygon_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
            private Builder() {
                super(Location.DEFAULT_INSTANCE);
            }

            public Builder addAllBoundingPolygon(Iterable<? extends Point> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllBoundingPolygon(iterable);
                return this;
            }

            public Builder addBoundingPolygon(Point point) {
                copyOnWrite();
                ((Location) this.instance).addBoundingPolygon(point);
                return this;
            }

            public Builder clearBoundingPolygon() {
                copyOnWrite();
                ((Location) this.instance).clearBoundingPolygon();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
            public Point getBoundingPolygon(int i) {
                return ((Location) this.instance).getBoundingPolygon(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
            public int getBoundingPolygonCount() {
                return ((Location) this.instance).getBoundingPolygonCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.LocationOrBuilder
            public List<Point> getBoundingPolygonList() {
                return Collections.unmodifiableList(((Location) this.instance).getBoundingPolygonList());
            }

            public Builder removeBoundingPolygon(int i) {
                copyOnWrite();
                ((Location) this.instance).removeBoundingPolygon(i);
                return this;
            }

            public Builder setBoundingPolygon(int i, Point point) {
                copyOnWrite();
                ((Location) this.instance).setBoundingPolygon(i, point);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addBoundingPolygon(int i, Point point) {
                copyOnWrite();
                ((Location) this.instance).addBoundingPolygon(i, point);
                return this;
            }

            public Builder setBoundingPolygon(int i, Point.Builder builder) {
                copyOnWrite();
                ((Location) this.instance).setBoundingPolygon(i, builder);
                return this;
            }

            public Builder addBoundingPolygon(Point.Builder builder) {
                copyOnWrite();
                ((Location) this.instance).addBoundingPolygon(builder);
                return this;
            }

            public Builder addBoundingPolygon(int i, Point.Builder builder) {
                copyOnWrite();
                ((Location) this.instance).addBoundingPolygon(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(Location location) {
            return DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoundingPolygon(int i, Point point) {
            point.getClass();
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.add(i, point);
        }

        public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoundingPolygon(int i, Point point) {
            point.getClass();
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.set(i, point);
        }

        public static Location parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoundingPolygon(Point point) {
            point.getClass();
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.add(point);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoundingPolygon(int i, Point.Builder builder) {
            ensureBoundingPolygonIsMutable();
            this.boundingPolygon_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyVisionCaptureResumed extends GeneratedMessageLite<NotifyVisionCaptureResumed, Builder> implements NotifyVisionCaptureResumedOrBuilder {
        private static final NotifyVisionCaptureResumed DEFAULT_INSTANCE;
        private static volatile Parser<NotifyVisionCaptureResumed> PARSER = null;
        public static final int RESUMED_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private CaptureConfiguration resumedConfiguration_;
        private String sessionId_ = "";

        static {
            NotifyVisionCaptureResumed notifyVisionCaptureResumed = new NotifyVisionCaptureResumed();
            DEFAULT_INSTANCE = notifyVisionCaptureResumed;
            notifyVisionCaptureResumed.makeImmutable();
        }

        private NotifyVisionCaptureResumed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResumedConfiguration() {
            this.resumedConfiguration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static NotifyVisionCaptureResumed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResumedConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.resumedConfiguration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.resumedConfiguration_ = captureConfiguration;
            } else {
                this.resumedConfiguration_ = CaptureConfiguration.newBuilder(this.resumedConfiguration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyVisionCaptureResumed parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureResumed parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyVisionCaptureResumed> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumedConfiguration(CaptureConfiguration.Builder builder) {
            this.resumedConfiguration_ = builder.build();
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
                    return new NotifyVisionCaptureResumed();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyVisionCaptureResumed notifyVisionCaptureResumed = (NotifyVisionCaptureResumed) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyVisionCaptureResumed.sessionId_.isEmpty(), notifyVisionCaptureResumed.sessionId_);
                    this.resumedConfiguration_ = (CaptureConfiguration) visitor.visitMessage(this.resumedConfiguration_, notifyVisionCaptureResumed.resumedConfiguration_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.resumedConfiguration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.resumedConfiguration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
                                        this.resumedConfiguration_ = builder.buildPartial();
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
                        synchronized (NotifyVisionCaptureResumed.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
        public CaptureConfiguration getResumedConfiguration() {
            CaptureConfiguration captureConfiguration = this.resumedConfiguration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.resumedConfiguration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getResumedConfiguration());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
        public boolean hasResumedConfiguration() {
            return this.resumedConfiguration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.resumedConfiguration_ != null) {
                codedOutputStream.writeMessage(2, getResumedConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyVisionCaptureResumed, Builder> implements NotifyVisionCaptureResumedOrBuilder {
            private Builder() {
                super(NotifyVisionCaptureResumed.DEFAULT_INSTANCE);
            }

            public Builder clearResumedConfiguration() {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).clearResumedConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
            public CaptureConfiguration getResumedConfiguration() {
                return ((NotifyVisionCaptureResumed) this.instance).getResumedConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
            public String getSessionId() {
                return ((NotifyVisionCaptureResumed) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyVisionCaptureResumed) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureResumedOrBuilder
            public boolean hasResumedConfiguration() {
                return ((NotifyVisionCaptureResumed) this.instance).hasResumedConfiguration();
            }

            public Builder mergeResumedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).mergeResumedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setResumedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).setResumedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setResumedConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((NotifyVisionCaptureResumed) this.instance).setResumedConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyVisionCaptureResumed notifyVisionCaptureResumed) {
            return DEFAULT_INSTANCE.createBuilder(notifyVisionCaptureResumed);
        }

        public static NotifyVisionCaptureResumed parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureResumed parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumedConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.resumedConfiguration_ = captureConfiguration;
        }

        public static NotifyVisionCaptureResumed parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyVisionCaptureResumed parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyVisionCaptureResumed parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyVisionCaptureResumed parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyVisionCaptureResumed parseFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureResumed parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureResumed parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyVisionCaptureResumed parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureResumed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyVisionCaptureStarted extends GeneratedMessageLite<NotifyVisionCaptureStarted, Builder> implements NotifyVisionCaptureStartedOrBuilder {
        public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 3;
        private static final NotifyVisionCaptureStarted DEFAULT_INSTANCE;
        private static volatile Parser<NotifyVisionCaptureStarted> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int STARTED_FIELD_NUMBER = 2;
        public static final int TIMEOUT_IN_MILLIS_FIELD_NUMBER = 4;
        private float confidenceScore_;
        private String sessionId_ = "";
        private VisionCaptureStarted started_;
        private int timeoutInMillis_;

        static {
            NotifyVisionCaptureStarted notifyVisionCaptureStarted = new NotifyVisionCaptureStarted();
            DEFAULT_INSTANCE = notifyVisionCaptureStarted;
            notifyVisionCaptureStarted.makeImmutable();
        }

        private NotifyVisionCaptureStarted() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfidenceScore() {
            this.confidenceScore_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarted() {
            this.started_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutInMillis() {
            this.timeoutInMillis_ = 0;
        }

        public static NotifyVisionCaptureStarted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStarted(VisionCaptureStarted visionCaptureStarted) {
            VisionCaptureStarted visionCaptureStarted2 = this.started_;
            if (visionCaptureStarted2 == null || visionCaptureStarted2 == VisionCaptureStarted.getDefaultInstance()) {
                this.started_ = visionCaptureStarted;
            } else {
                this.started_ = VisionCaptureStarted.newBuilder(this.started_).mergeFrom((VisionCaptureStarted.Builder) visionCaptureStarted).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyVisionCaptureStarted parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureStarted parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyVisionCaptureStarted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfidenceScore(float f) {
            this.confidenceScore_ = f;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarted(VisionCaptureStarted.Builder builder) {
            this.started_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutInMillis(int i) {
            this.timeoutInMillis_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyVisionCaptureStarted();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyVisionCaptureStarted notifyVisionCaptureStarted = (NotifyVisionCaptureStarted) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyVisionCaptureStarted.sessionId_.isEmpty(), notifyVisionCaptureStarted.sessionId_);
                    this.started_ = (VisionCaptureStarted) visitor.visitMessage(this.started_, notifyVisionCaptureStarted.started_);
                    float f = this.confidenceScore_;
                    boolean z = f != 0.0f;
                    float f2 = notifyVisionCaptureStarted.confidenceScore_;
                    this.confidenceScore_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    int i = this.timeoutInMillis_;
                    boolean z2 = i != 0;
                    int i2 = notifyVisionCaptureStarted.timeoutInMillis_;
                    this.timeoutInMillis_ = visitor.visitInt(z2, i, i2 != 0, i2);
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
                                } else if (readTag == 18) {
                                    VisionCaptureStarted visionCaptureStarted = this.started_;
                                    VisionCaptureStarted.Builder builder = visionCaptureStarted != null ? visionCaptureStarted.toBuilder() : null;
                                    VisionCaptureStarted visionCaptureStarted2 = (VisionCaptureStarted) codedInputStream.readMessage(VisionCaptureStarted.parser(), extensionRegistryLite);
                                    this.started_ = visionCaptureStarted2;
                                    if (builder != null) {
                                        builder.mergeFrom((VisionCaptureStarted.Builder) visionCaptureStarted2);
                                        this.started_ = builder.buildPartial();
                                    }
                                } else if (readTag == 29) {
                                    this.confidenceScore_ = codedInputStream.readFloat();
                                } else if (readTag == 32) {
                                    this.timeoutInMillis_ = codedInputStream.readUInt32();
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
                        synchronized (NotifyVisionCaptureStarted.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public float getConfidenceScore() {
            return this.confidenceScore_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.started_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getStarted());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                computeStringSize += CodedOutputStream.computeFloatSize(3, f);
            }
            int i2 = this.timeoutInMillis_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(4, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public VisionCaptureStarted getStarted() {
            VisionCaptureStarted visionCaptureStarted = this.started_;
            return visionCaptureStarted == null ? VisionCaptureStarted.getDefaultInstance() : visionCaptureStarted;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public int getTimeoutInMillis() {
            return this.timeoutInMillis_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
        public boolean hasStarted() {
            return this.started_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.started_ != null) {
                codedOutputStream.writeMessage(2, getStarted());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
            int i = this.timeoutInMillis_;
            if (i != 0) {
                codedOutputStream.writeUInt32(4, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyVisionCaptureStarted, Builder> implements NotifyVisionCaptureStartedOrBuilder {
            private Builder() {
                super(NotifyVisionCaptureStarted.DEFAULT_INSTANCE);
            }

            public Builder clearConfidenceScore() {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).clearConfidenceScore();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStarted() {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).clearStarted();
                return this;
            }

            public Builder clearTimeoutInMillis() {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).clearTimeoutInMillis();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public float getConfidenceScore() {
                return ((NotifyVisionCaptureStarted) this.instance).getConfidenceScore();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public String getSessionId() {
                return ((NotifyVisionCaptureStarted) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyVisionCaptureStarted) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public VisionCaptureStarted getStarted() {
                return ((NotifyVisionCaptureStarted) this.instance).getStarted();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public int getTimeoutInMillis() {
                return ((NotifyVisionCaptureStarted) this.instance).getTimeoutInMillis();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStartedOrBuilder
            public boolean hasStarted() {
                return ((NotifyVisionCaptureStarted) this.instance).hasStarted();
            }

            public Builder mergeStarted(VisionCaptureStarted visionCaptureStarted) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).mergeStarted(visionCaptureStarted);
                return this;
            }

            public Builder setConfidenceScore(float f) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setConfidenceScore(f);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setStarted(VisionCaptureStarted visionCaptureStarted) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setStarted(visionCaptureStarted);
                return this;
            }

            public Builder setTimeoutInMillis(int i) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setTimeoutInMillis(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setStarted(VisionCaptureStarted.Builder builder) {
                copyOnWrite();
                ((NotifyVisionCaptureStarted) this.instance).setStarted(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyVisionCaptureStarted notifyVisionCaptureStarted) {
            return DEFAULT_INSTANCE.createBuilder(notifyVisionCaptureStarted);
        }

        public static NotifyVisionCaptureStarted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStarted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarted(VisionCaptureStarted visionCaptureStarted) {
            visionCaptureStarted.getClass();
            this.started_ = visionCaptureStarted;
        }

        public static NotifyVisionCaptureStarted parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyVisionCaptureStarted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStarted parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyVisionCaptureStarted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStarted parseFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureStarted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStarted parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyVisionCaptureStarted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyVisionCaptureStopped extends GeneratedMessageLite<NotifyVisionCaptureStopped, Builder> implements NotifyVisionCaptureStoppedOrBuilder {
        private static final NotifyVisionCaptureStopped DEFAULT_INSTANCE;
        public static final int FAILED_FIELD_NUMBER = 3;
        private static volatile Parser<NotifyVisionCaptureStopped> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int STOPPED_FIELD_NUMBER = 2;
        private Object captureResult_;
        private int captureResultCase_ = 0;
        private String sessionId_ = "";

        static {
            NotifyVisionCaptureStopped notifyVisionCaptureStopped = new NotifyVisionCaptureStopped();
            DEFAULT_INSTANCE = notifyVisionCaptureStopped;
            notifyVisionCaptureStopped.makeImmutable();
        }

        private NotifyVisionCaptureStopped() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureResult() {
            this.captureResultCase_ = 0;
            this.captureResult_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailed() {
            if (this.captureResultCase_ == 3) {
                this.captureResultCase_ = 0;
                this.captureResult_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopped() {
            if (this.captureResultCase_ == 2) {
                this.captureResultCase_ = 0;
                this.captureResult_ = null;
            }
        }

        public static NotifyVisionCaptureStopped getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailed(VisionCaptureFailure visionCaptureFailure) {
            if (this.captureResultCase_ != 3 || this.captureResult_ == VisionCaptureFailure.getDefaultInstance()) {
                this.captureResult_ = visionCaptureFailure;
            } else {
                this.captureResult_ = VisionCaptureFailure.newBuilder((VisionCaptureFailure) this.captureResult_).mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure).buildPartial();
            }
            this.captureResultCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStopped(VisionCaptureStopped visionCaptureStopped) {
            if (this.captureResultCase_ != 2 || this.captureResult_ == VisionCaptureStopped.getDefaultInstance()) {
                this.captureResult_ = visionCaptureStopped;
            } else {
                this.captureResult_ = VisionCaptureStopped.newBuilder((VisionCaptureStopped) this.captureResult_).mergeFrom((VisionCaptureStopped.Builder) visionCaptureStopped).buildPartial();
            }
            this.captureResultCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyVisionCaptureStopped parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureStopped parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyVisionCaptureStopped> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure.Builder builder) {
            this.captureResult_ = builder.build();
            this.captureResultCase_ = 3;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopped(VisionCaptureStopped.Builder builder) {
            this.captureResult_ = builder.build();
            this.captureResultCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyVisionCaptureStopped();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyVisionCaptureStopped notifyVisionCaptureStopped = (NotifyVisionCaptureStopped) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyVisionCaptureStopped.sessionId_.isEmpty(), notifyVisionCaptureStopped.sessionId_);
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Vision$NotifyVisionCaptureStopped$CaptureResultCase[notifyVisionCaptureStopped.getCaptureResultCase().ordinal()];
                    if (i2 == 1) {
                        this.captureResult_ = visitor.visitOneofMessage(this.captureResultCase_ == 2, this.captureResult_, notifyVisionCaptureStopped.captureResult_);
                    } else if (i2 == 2) {
                        this.captureResult_ = visitor.visitOneofMessage(this.captureResultCase_ == 3, this.captureResult_, notifyVisionCaptureStopped.captureResult_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.captureResultCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = notifyVisionCaptureStopped.captureResultCase_) != 0) {
                        this.captureResultCase_ = i;
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    VisionCaptureStopped.Builder builder = this.captureResultCase_ == 2 ? ((VisionCaptureStopped) this.captureResult_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(VisionCaptureStopped.parser(), extensionRegistryLite);
                                    this.captureResult_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((VisionCaptureStopped.Builder) readMessage);
                                        this.captureResult_ = builder.buildPartial();
                                    }
                                    this.captureResultCase_ = 2;
                                } else if (readTag == 26) {
                                    VisionCaptureFailure.Builder builder2 = this.captureResultCase_ == 3 ? ((VisionCaptureFailure) this.captureResult_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(VisionCaptureFailure.parser(), extensionRegistryLite);
                                    this.captureResult_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VisionCaptureFailure.Builder) readMessage2);
                                        this.captureResult_ = builder2.buildPartial();
                                    }
                                    this.captureResultCase_ = 3;
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
                        synchronized (NotifyVisionCaptureStopped.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public CaptureResultCase getCaptureResultCase() {
            return CaptureResultCase.forNumber(this.captureResultCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public VisionCaptureFailure getFailed() {
            return this.captureResultCase_ == 3 ? (VisionCaptureFailure) this.captureResult_ : VisionCaptureFailure.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.captureResultCase_ == 2) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (VisionCaptureStopped) this.captureResult_);
            }
            if (this.captureResultCase_ == 3) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (VisionCaptureFailure) this.captureResult_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public VisionCaptureStopped getStopped() {
            return this.captureResultCase_ == 2 ? (VisionCaptureStopped) this.captureResult_ : VisionCaptureStopped.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public boolean hasFailed() {
            return this.captureResultCase_ == 3;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
        public boolean hasStopped() {
            return this.captureResultCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.captureResultCase_ == 2) {
                codedOutputStream.writeMessage(2, (VisionCaptureStopped) this.captureResult_);
            }
            if (this.captureResultCase_ == 3) {
                codedOutputStream.writeMessage(3, (VisionCaptureFailure) this.captureResult_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyVisionCaptureStopped, Builder> implements NotifyVisionCaptureStoppedOrBuilder {
            private Builder() {
                super(NotifyVisionCaptureStopped.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureResult() {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).clearCaptureResult();
                return this;
            }

            public Builder clearFailed() {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).clearFailed();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStopped() {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).clearStopped();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public CaptureResultCase getCaptureResultCase() {
                return ((NotifyVisionCaptureStopped) this.instance).getCaptureResultCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public VisionCaptureFailure getFailed() {
                return ((NotifyVisionCaptureStopped) this.instance).getFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public String getSessionId() {
                return ((NotifyVisionCaptureStopped) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyVisionCaptureStopped) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public VisionCaptureStopped getStopped() {
                return ((NotifyVisionCaptureStopped) this.instance).getStopped();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public boolean hasFailed() {
                return ((NotifyVisionCaptureStopped) this.instance).hasFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCaptureStoppedOrBuilder
            public boolean hasStopped() {
                return ((NotifyVisionCaptureStopped) this.instance).hasStopped();
            }

            public Builder mergeFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).mergeFailed(visionCaptureFailure);
                return this;
            }

            public Builder mergeStopped(VisionCaptureStopped visionCaptureStopped) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).mergeStopped(visionCaptureStopped);
                return this;
            }

            public Builder setFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setFailed(visionCaptureFailure);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setStopped(VisionCaptureStopped visionCaptureStopped) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setStopped(visionCaptureStopped);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFailed(VisionCaptureFailure.Builder builder) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setFailed(builder);
                return this;
            }

            public Builder setStopped(VisionCaptureStopped.Builder builder) {
                copyOnWrite();
                ((NotifyVisionCaptureStopped) this.instance).setStopped(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CaptureResultCase implements Internal.EnumLite {
            STOPPED(2),
            FAILED(3),
            CAPTURERESULT_NOT_SET(0);

            private final int value;

            CaptureResultCase(int i) {
                this.value = i;
            }

            public static CaptureResultCase forNumber(int i) {
                if (i == 0) {
                    return CAPTURERESULT_NOT_SET;
                }
                if (i == 2) {
                    return STOPPED;
                }
                if (i != 3) {
                    return null;
                }
                return FAILED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CaptureResultCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NotifyVisionCaptureStopped notifyVisionCaptureStopped) {
            return DEFAULT_INSTANCE.createBuilder(notifyVisionCaptureStopped);
        }

        public static NotifyVisionCaptureStopped parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStopped parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStopped parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure visionCaptureFailure) {
            visionCaptureFailure.getClass();
            this.captureResult_ = visionCaptureFailure;
            this.captureResultCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopped(VisionCaptureStopped visionCaptureStopped) {
            visionCaptureStopped.getClass();
            this.captureResult_ = visionCaptureStopped;
            this.captureResultCase_ = 2;
        }

        public static NotifyVisionCaptureStopped parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStopped parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyVisionCaptureStopped parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStopped parseFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCaptureStopped parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCaptureStopped parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyVisionCaptureStopped parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OCREnrichmentData extends GeneratedMessageLite<OCREnrichmentData, Builder> implements OCREnrichmentDataOrBuilder {
        private static final OCREnrichmentData DEFAULT_INSTANCE;
        public static final int DETECTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<OCREnrichmentData> PARSER;
        private Internal.ProtobufList<TextDetection> detections_ = GeneratedMessageLite.emptyProtobufList();

        static {
            OCREnrichmentData oCREnrichmentData = new OCREnrichmentData();
            DEFAULT_INSTANCE = oCREnrichmentData;
            oCREnrichmentData.makeImmutable();
        }

        private OCREnrichmentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDetections(Iterable<? extends TextDetection> iterable) {
            ensureDetectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.detections_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(TextDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetections() {
            this.detections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDetectionsIsMutable() {
            if (this.detections_.isModifiable()) {
                return;
            }
            this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
        }

        public static OCREnrichmentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OCREnrichmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OCREnrichmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OCREnrichmentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDetections(int i) {
            ensureDetectionsIsMutable();
            this.detections_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, TextDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OCREnrichmentData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.detections_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.detections_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.detections_, ((OCREnrichmentData) obj2).detections_);
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
                                    if (!this.detections_.isModifiable()) {
                                        this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
                                    }
                                    this.detections_.add((TextDetection) codedInputStream.readMessage(TextDetection.parser(), extensionRegistryLite));
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
                        synchronized (OCREnrichmentData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
        public TextDetection getDetections(int i) {
            return this.detections_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
        public int getDetectionsCount() {
            return this.detections_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
        public List<TextDetection> getDetectionsList() {
            return this.detections_;
        }

        public TextDetectionOrBuilder getDetectionsOrBuilder(int i) {
            return this.detections_.get(i);
        }

        public List<? extends TextDetectionOrBuilder> getDetectionsOrBuilderList() {
            return this.detections_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.detections_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.detections_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.detections_.size(); i++) {
                codedOutputStream.writeMessage(1, this.detections_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<OCREnrichmentData, Builder> implements OCREnrichmentDataOrBuilder {
            private Builder() {
                super(OCREnrichmentData.DEFAULT_INSTANCE);
            }

            public Builder addAllDetections(Iterable<? extends TextDetection> iterable) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).addAllDetections(iterable);
                return this;
            }

            public Builder addDetections(TextDetection textDetection) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).addDetections(textDetection);
                return this;
            }

            public Builder clearDetections() {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).clearDetections();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
            public TextDetection getDetections(int i) {
                return ((OCREnrichmentData) this.instance).getDetections(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
            public int getDetectionsCount() {
                return ((OCREnrichmentData) this.instance).getDetectionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OCREnrichmentDataOrBuilder
            public List<TextDetection> getDetectionsList() {
                return Collections.unmodifiableList(((OCREnrichmentData) this.instance).getDetectionsList());
            }

            public Builder removeDetections(int i) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).removeDetections(i);
                return this;
            }

            public Builder setDetections(int i, TextDetection textDetection) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).setDetections(i, textDetection);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addDetections(int i, TextDetection textDetection) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).addDetections(i, textDetection);
                return this;
            }

            public Builder setDetections(int i, TextDetection.Builder builder) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).setDetections(i, builder);
                return this;
            }

            public Builder addDetections(TextDetection.Builder builder) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).addDetections(builder);
                return this;
            }

            public Builder addDetections(int i, TextDetection.Builder builder) {
                copyOnWrite();
                ((OCREnrichmentData) this.instance).addDetections(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(OCREnrichmentData oCREnrichmentData) {
            return DEFAULT_INSTANCE.createBuilder(oCREnrichmentData);
        }

        public static OCREnrichmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OCREnrichmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OCREnrichmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OCREnrichmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OCREnrichmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OCREnrichmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OCREnrichmentData parseFrom(InputStream inputStream) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, TextDetection textDetection) {
            textDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(i, textDetection);
        }

        public static OCREnrichmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, TextDetection textDetection) {
            textDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.set(i, textDetection);
        }

        public static OCREnrichmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OCREnrichmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OCREnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(TextDetection textDetection) {
            textDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(textDetection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, TextDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OpticalCodeDetection extends GeneratedMessageLite<OpticalCodeDetection, Builder> implements OpticalCodeDetectionOrBuilder {
        public static final int CODE_TYPE_FIELD_NUMBER = 1;
        public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 3;
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final OpticalCodeDetection DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 4;
        private static volatile Parser<OpticalCodeDetection> PARSER;
        private float confidenceScore_;
        private Location location_;
        private String codeType_ = "";
        private String content_ = "";

        static {
            OpticalCodeDetection opticalCodeDetection = new OpticalCodeDetection();
            DEFAULT_INSTANCE = opticalCodeDetection;
            opticalCodeDetection.makeImmutable();
        }

        private OpticalCodeDetection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodeType() {
            this.codeType_ = getDefaultInstance().getCodeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfidenceScore() {
            this.confidenceScore_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = null;
        }

        public static OpticalCodeDetection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLocation(Location location) {
            Location location2 = this.location_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.location_ = location;
            } else {
                this.location_ = Location.newBuilder(this.location_).mergeFrom((Location.Builder) location).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OpticalCodeDetection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpticalCodeDetection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OpticalCodeDetection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeType(String str) {
            str.getClass();
            this.codeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeTypeBytes(ByteString byteString) {
            this.codeType_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfidenceScore(float f) {
            this.confidenceScore_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            this.content_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location.Builder builder) {
            this.location_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OpticalCodeDetection();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    OpticalCodeDetection opticalCodeDetection = (OpticalCodeDetection) obj2;
                    this.codeType_ = visitor.visitString(!this.codeType_.isEmpty(), this.codeType_, !opticalCodeDetection.codeType_.isEmpty(), opticalCodeDetection.codeType_);
                    this.content_ = visitor.visitString(!this.content_.isEmpty(), this.content_, !opticalCodeDetection.content_.isEmpty(), opticalCodeDetection.content_);
                    float f = this.confidenceScore_;
                    boolean z = f != 0.0f;
                    float f2 = opticalCodeDetection.confidenceScore_;
                    this.confidenceScore_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    this.location_ = (Location) visitor.visitMessage(this.location_, opticalCodeDetection.location_);
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
                                    this.codeType_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.content_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 29) {
                                    this.confidenceScore_ = codedInputStream.readFloat();
                                } else if (readTag == 34) {
                                    Location location = this.location_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) codedInputStream.readMessage(Location.parser(), extensionRegistryLite);
                                    this.location_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom((Location.Builder) location2);
                                        this.location_ = builder.buildPartial();
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
                        synchronized (OpticalCodeDetection.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public String getCodeType() {
            return this.codeType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public ByteString getCodeTypeBytes() {
            return ByteString.copyFromUtf8(this.codeType_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public float getConfidenceScore() {
            return this.confidenceScore_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.codeType_.isEmpty() ? CodedOutputStream.computeStringSize(1, getCodeType()) : 0;
            if (!this.content_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getContent());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                computeStringSize += CodedOutputStream.computeFloatSize(3, f);
            }
            if (this.location_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, getLocation());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
        public boolean hasLocation() {
            return this.location_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.codeType_.isEmpty()) {
                codedOutputStream.writeString(1, getCodeType());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.writeString(2, getContent());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
            if (this.location_ != null) {
                codedOutputStream.writeMessage(4, getLocation());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<OpticalCodeDetection, Builder> implements OpticalCodeDetectionOrBuilder {
            private Builder() {
                super(OpticalCodeDetection.DEFAULT_INSTANCE);
            }

            public Builder clearCodeType() {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).clearCodeType();
                return this;
            }

            public Builder clearConfidenceScore() {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).clearConfidenceScore();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).clearContent();
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).clearLocation();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public String getCodeType() {
                return ((OpticalCodeDetection) this.instance).getCodeType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public ByteString getCodeTypeBytes() {
                return ((OpticalCodeDetection) this.instance).getCodeTypeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public float getConfidenceScore() {
                return ((OpticalCodeDetection) this.instance).getConfidenceScore();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public String getContent() {
                return ((OpticalCodeDetection) this.instance).getContent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public ByteString getContentBytes() {
                return ((OpticalCodeDetection) this.instance).getContentBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public Location getLocation() {
                return ((OpticalCodeDetection) this.instance).getLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionOrBuilder
            public boolean hasLocation() {
                return ((OpticalCodeDetection) this.instance).hasLocation();
            }

            public Builder mergeLocation(Location location) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).mergeLocation(location);
                return this;
            }

            public Builder setCodeType(String str) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setCodeType(str);
                return this;
            }

            public Builder setCodeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setCodeTypeBytes(byteString);
                return this;
            }

            public Builder setConfidenceScore(float f) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setConfidenceScore(f);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setLocation(Location location) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setLocation(location);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLocation(Location.Builder builder) {
                copyOnWrite();
                ((OpticalCodeDetection) this.instance).setLocation(builder);
                return this;
            }
        }

        public static Builder newBuilder(OpticalCodeDetection opticalCodeDetection) {
            return DEFAULT_INSTANCE.createBuilder(opticalCodeDetection);
        }

        public static OpticalCodeDetection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpticalCodeDetection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location location) {
            location.getClass();
            this.location_ = location;
        }

        public static OpticalCodeDetection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OpticalCodeDetection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OpticalCodeDetection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpticalCodeDetection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OpticalCodeDetection parseFrom(InputStream inputStream) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpticalCodeDetection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpticalCodeDetection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OpticalCodeDetection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OpticalCodeDetectionEnrichmentData extends GeneratedMessageLite<OpticalCodeDetectionEnrichmentData, Builder> implements OpticalCodeDetectionEnrichmentDataOrBuilder {
        private static final OpticalCodeDetectionEnrichmentData DEFAULT_INSTANCE;
        public static final int DETECTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<OpticalCodeDetectionEnrichmentData> PARSER;
        private Internal.ProtobufList<OpticalCodeDetection> detections_ = GeneratedMessageLite.emptyProtobufList();

        static {
            OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData = new OpticalCodeDetectionEnrichmentData();
            DEFAULT_INSTANCE = opticalCodeDetectionEnrichmentData;
            opticalCodeDetectionEnrichmentData.makeImmutable();
        }

        private OpticalCodeDetectionEnrichmentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDetections(Iterable<? extends OpticalCodeDetection> iterable) {
            ensureDetectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.detections_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(OpticalCodeDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetections() {
            this.detections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDetectionsIsMutable() {
            if (this.detections_.isModifiable()) {
                return;
            }
            this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
        }

        public static OpticalCodeDetectionEnrichmentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OpticalCodeDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OpticalCodeDetectionEnrichmentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDetections(int i) {
            ensureDetectionsIsMutable();
            this.detections_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, OpticalCodeDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OpticalCodeDetectionEnrichmentData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.detections_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.detections_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.detections_, ((OpticalCodeDetectionEnrichmentData) obj2).detections_);
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
                                    if (!this.detections_.isModifiable()) {
                                        this.detections_ = GeneratedMessageLite.mutableCopy(this.detections_);
                                    }
                                    this.detections_.add((OpticalCodeDetection) codedInputStream.readMessage(OpticalCodeDetection.parser(), extensionRegistryLite));
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
                        synchronized (OpticalCodeDetectionEnrichmentData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
        public OpticalCodeDetection getDetections(int i) {
            return this.detections_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
        public int getDetectionsCount() {
            return this.detections_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
        public List<OpticalCodeDetection> getDetectionsList() {
            return this.detections_;
        }

        public OpticalCodeDetectionOrBuilder getDetectionsOrBuilder(int i) {
            return this.detections_.get(i);
        }

        public List<? extends OpticalCodeDetectionOrBuilder> getDetectionsOrBuilderList() {
            return this.detections_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.detections_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.detections_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.detections_.size(); i++) {
                codedOutputStream.writeMessage(1, this.detections_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<OpticalCodeDetectionEnrichmentData, Builder> implements OpticalCodeDetectionEnrichmentDataOrBuilder {
            private Builder() {
                super(OpticalCodeDetectionEnrichmentData.DEFAULT_INSTANCE);
            }

            public Builder addAllDetections(Iterable<? extends OpticalCodeDetection> iterable) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).addAllDetections(iterable);
                return this;
            }

            public Builder addDetections(OpticalCodeDetection opticalCodeDetection) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).addDetections(opticalCodeDetection);
                return this;
            }

            public Builder clearDetections() {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).clearDetections();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
            public OpticalCodeDetection getDetections(int i) {
                return ((OpticalCodeDetectionEnrichmentData) this.instance).getDetections(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
            public int getDetectionsCount() {
                return ((OpticalCodeDetectionEnrichmentData) this.instance).getDetectionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.OpticalCodeDetectionEnrichmentDataOrBuilder
            public List<OpticalCodeDetection> getDetectionsList() {
                return Collections.unmodifiableList(((OpticalCodeDetectionEnrichmentData) this.instance).getDetectionsList());
            }

            public Builder removeDetections(int i) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).removeDetections(i);
                return this;
            }

            public Builder setDetections(int i, OpticalCodeDetection opticalCodeDetection) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).setDetections(i, opticalCodeDetection);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addDetections(int i, OpticalCodeDetection opticalCodeDetection) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).addDetections(i, opticalCodeDetection);
                return this;
            }

            public Builder setDetections(int i, OpticalCodeDetection.Builder builder) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).setDetections(i, builder);
                return this;
            }

            public Builder addDetections(OpticalCodeDetection.Builder builder) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).addDetections(builder);
                return this;
            }

            public Builder addDetections(int i, OpticalCodeDetection.Builder builder) {
                copyOnWrite();
                ((OpticalCodeDetectionEnrichmentData) this.instance).addDetections(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(OpticalCodeDetectionEnrichmentData opticalCodeDetectionEnrichmentData) {
            return DEFAULT_INSTANCE.createBuilder(opticalCodeDetectionEnrichmentData);
        }

        public static OpticalCodeDetectionEnrichmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(InputStream inputStream) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, OpticalCodeDetection opticalCodeDetection) {
            opticalCodeDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(i, opticalCodeDetection);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetections(int i, OpticalCodeDetection opticalCodeDetection) {
            opticalCodeDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.set(i, opticalCodeDetection);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OpticalCodeDetectionEnrichmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OpticalCodeDetectionEnrichmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(OpticalCodeDetection opticalCodeDetection) {
            opticalCodeDetection.getClass();
            ensureDetectionsIsMutable();
            this.detections_.add(opticalCodeDetection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDetections(int i, OpticalCodeDetection.Builder builder) {
            ensureDetectionsIsMutable();
            this.detections_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PauseVisionCaptureResponse extends GeneratedMessageLite<PauseVisionCaptureResponse, Builder> implements PauseVisionCaptureResponseOrBuilder {
        private static final PauseVisionCaptureResponse DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 2;
        private static volatile Parser<PauseVisionCaptureResponse> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private VisionCaptureFailure failure_;
        private String sessionId_ = "";

        static {
            PauseVisionCaptureResponse pauseVisionCaptureResponse = new PauseVisionCaptureResponse();
            DEFAULT_INSTANCE = pauseVisionCaptureResponse;
            pauseVisionCaptureResponse.makeImmutable();
        }

        private PauseVisionCaptureResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static PauseVisionCaptureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(VisionCaptureFailure visionCaptureFailure) {
            VisionCaptureFailure visionCaptureFailure2 = this.failure_;
            if (visionCaptureFailure2 == null || visionCaptureFailure2 == VisionCaptureFailure.getDefaultInstance()) {
                this.failure_ = visionCaptureFailure;
            } else {
                this.failure_ = VisionCaptureFailure.newBuilder(this.failure_).mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PauseVisionCaptureResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseVisionCaptureResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PauseVisionCaptureResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(VisionCaptureFailure.Builder builder) {
            this.failure_ = builder.build();
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
                    return new PauseVisionCaptureResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    PauseVisionCaptureResponse pauseVisionCaptureResponse = (PauseVisionCaptureResponse) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !pauseVisionCaptureResponse.sessionId_.isEmpty(), pauseVisionCaptureResponse.sessionId_);
                    this.failure_ = (VisionCaptureFailure) visitor.visitMessage(this.failure_, pauseVisionCaptureResponse.failure_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    VisionCaptureFailure visionCaptureFailure = this.failure_;
                                    VisionCaptureFailure.Builder builder = visionCaptureFailure != null ? visionCaptureFailure.toBuilder() : null;
                                    VisionCaptureFailure visionCaptureFailure2 = (VisionCaptureFailure) codedInputStream.readMessage(VisionCaptureFailure.parser(), extensionRegistryLite);
                                    this.failure_ = visionCaptureFailure2;
                                    if (builder != null) {
                                        builder.mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure2);
                                        this.failure_ = builder.buildPartial();
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
                        synchronized (PauseVisionCaptureResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
        public VisionCaptureFailure getFailure() {
            VisionCaptureFailure visionCaptureFailure = this.failure_;
            return visionCaptureFailure == null ? VisionCaptureFailure.getDefaultInstance() : visionCaptureFailure;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.failure_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getFailure());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
        public boolean hasFailure() {
            return this.failure_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.failure_ != null) {
                codedOutputStream.writeMessage(2, getFailure());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<PauseVisionCaptureResponse, Builder> implements PauseVisionCaptureResponseOrBuilder {
            private Builder() {
                super(PauseVisionCaptureResponse.DEFAULT_INSTANCE);
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).clearFailure();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
            public VisionCaptureFailure getFailure() {
                return ((PauseVisionCaptureResponse) this.instance).getFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
            public String getSessionId() {
                return ((PauseVisionCaptureResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((PauseVisionCaptureResponse) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureResponseOrBuilder
            public boolean hasFailure() {
                return ((PauseVisionCaptureResponse) this.instance).hasFailure();
            }

            public Builder mergeFailure(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).mergeFailure(visionCaptureFailure);
                return this;
            }

            public Builder setFailure(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).setFailure(visionCaptureFailure);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFailure(VisionCaptureFailure.Builder builder) {
                copyOnWrite();
                ((PauseVisionCaptureResponse) this.instance).setFailure(builder);
                return this;
            }
        }

        public static Builder newBuilder(PauseVisionCaptureResponse pauseVisionCaptureResponse) {
            return DEFAULT_INSTANCE.createBuilder(pauseVisionCaptureResponse);
        }

        public static PauseVisionCaptureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseVisionCaptureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(VisionCaptureFailure visionCaptureFailure) {
            visionCaptureFailure.getClass();
            this.failure_ = visionCaptureFailure;
        }

        public static PauseVisionCaptureResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PauseVisionCaptureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PauseVisionCaptureResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PauseVisionCaptureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PauseVisionCaptureResponse parseFrom(InputStream inputStream) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseVisionCaptureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseVisionCaptureResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PauseVisionCaptureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResumeVisionCapture extends GeneratedMessageLite<ResumeVisionCapture, Builder> implements ResumeVisionCaptureOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        private static final ResumeVisionCapture DEFAULT_INSTANCE;
        private static volatile Parser<ResumeVisionCapture> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private CaptureConfiguration configuration_;
        private String sessionId_ = "";

        static {
            ResumeVisionCapture resumeVisionCapture = new ResumeVisionCapture();
            DEFAULT_INSTANCE = resumeVisionCapture;
            resumeVisionCapture.makeImmutable();
        }

        private ResumeVisionCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static ResumeVisionCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.configuration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.configuration_ = captureConfiguration;
            } else {
                this.configuration_ = CaptureConfiguration.newBuilder(this.configuration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResumeVisionCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeVisionCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResumeVisionCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration.Builder builder) {
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
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResumeVisionCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResumeVisionCapture resumeVisionCapture = (ResumeVisionCapture) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !resumeVisionCapture.sessionId_.isEmpty(), resumeVisionCapture.sessionId_);
                    this.configuration_ = (CaptureConfiguration) visitor.visitMessage(this.configuration_, resumeVisionCapture.configuration_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.configuration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
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
                        synchronized (ResumeVisionCapture.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
        public CaptureConfiguration getConfiguration() {
            CaptureConfiguration captureConfiguration = this.configuration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.configuration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getConfiguration());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(2, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResumeVisionCapture, Builder> implements ResumeVisionCaptureOrBuilder {
            private Builder() {
                super(ResumeVisionCapture.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
            public CaptureConfiguration getConfiguration() {
                return ((ResumeVisionCapture) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
            public String getSessionId() {
                return ((ResumeVisionCapture) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
            public ByteString getSessionIdBytes() {
                return ((ResumeVisionCapture) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureOrBuilder
            public boolean hasConfiguration() {
                return ((ResumeVisionCapture) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).mergeConfiguration(captureConfiguration);
                return this;
            }

            public Builder setConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).setConfiguration(captureConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((ResumeVisionCapture) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(ResumeVisionCapture resumeVisionCapture) {
            return DEFAULT_INSTANCE.createBuilder(resumeVisionCapture);
        }

        public static ResumeVisionCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeVisionCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.configuration_ = captureConfiguration;
        }

        public static ResumeVisionCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResumeVisionCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResumeVisionCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResumeVisionCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResumeVisionCapture parseFrom(InputStream inputStream) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeVisionCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeVisionCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResumeVisionCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResumeVisionCaptureResponse extends GeneratedMessageLite<ResumeVisionCaptureResponse, Builder> implements ResumeVisionCaptureResponseOrBuilder {
        private static final ResumeVisionCaptureResponse DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 3;
        private static volatile Parser<ResumeVisionCaptureResponse> PARSER = null;
        public static final int RESUMED_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private VisionCaptureFailure failure_;
        private CaptureConfiguration resumedConfiguration_;
        private String sessionId_ = "";

        static {
            ResumeVisionCaptureResponse resumeVisionCaptureResponse = new ResumeVisionCaptureResponse();
            DEFAULT_INSTANCE = resumeVisionCaptureResponse;
            resumeVisionCaptureResponse.makeImmutable();
        }

        private ResumeVisionCaptureResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResumedConfiguration() {
            this.resumedConfiguration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static ResumeVisionCaptureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(VisionCaptureFailure visionCaptureFailure) {
            VisionCaptureFailure visionCaptureFailure2 = this.failure_;
            if (visionCaptureFailure2 == null || visionCaptureFailure2 == VisionCaptureFailure.getDefaultInstance()) {
                this.failure_ = visionCaptureFailure;
            } else {
                this.failure_ = VisionCaptureFailure.newBuilder(this.failure_).mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResumedConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.resumedConfiguration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.resumedConfiguration_ = captureConfiguration;
            } else {
                this.resumedConfiguration_ = CaptureConfiguration.newBuilder(this.resumedConfiguration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResumeVisionCaptureResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeVisionCaptureResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResumeVisionCaptureResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(VisionCaptureFailure.Builder builder) {
            this.failure_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumedConfiguration(CaptureConfiguration.Builder builder) {
            this.resumedConfiguration_ = builder.build();
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
                    return new ResumeVisionCaptureResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResumeVisionCaptureResponse resumeVisionCaptureResponse = (ResumeVisionCaptureResponse) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, true ^ resumeVisionCaptureResponse.sessionId_.isEmpty(), resumeVisionCaptureResponse.sessionId_);
                    this.resumedConfiguration_ = (CaptureConfiguration) visitor.visitMessage(this.resumedConfiguration_, resumeVisionCaptureResponse.resumedConfiguration_);
                    this.failure_ = (VisionCaptureFailure) visitor.visitMessage(this.failure_, resumeVisionCaptureResponse.failure_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.resumedConfiguration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.resumedConfiguration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
                                        this.resumedConfiguration_ = builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    VisionCaptureFailure visionCaptureFailure = this.failure_;
                                    VisionCaptureFailure.Builder builder2 = visionCaptureFailure != null ? visionCaptureFailure.toBuilder() : null;
                                    VisionCaptureFailure visionCaptureFailure2 = (VisionCaptureFailure) codedInputStream.readMessage(VisionCaptureFailure.parser(), extensionRegistryLite);
                                    this.failure_ = visionCaptureFailure2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure2);
                                        this.failure_ = builder2.buildPartial();
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
                        synchronized (ResumeVisionCaptureResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public VisionCaptureFailure getFailure() {
            VisionCaptureFailure visionCaptureFailure = this.failure_;
            return visionCaptureFailure == null ? VisionCaptureFailure.getDefaultInstance() : visionCaptureFailure;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public CaptureConfiguration getResumedConfiguration() {
            CaptureConfiguration captureConfiguration = this.resumedConfiguration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.resumedConfiguration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getResumedConfiguration());
            }
            if (this.failure_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getFailure());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public boolean hasFailure() {
            return this.failure_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
        public boolean hasResumedConfiguration() {
            return this.resumedConfiguration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.resumedConfiguration_ != null) {
                codedOutputStream.writeMessage(2, getResumedConfiguration());
            }
            if (this.failure_ != null) {
                codedOutputStream.writeMessage(3, getFailure());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResumeVisionCaptureResponse, Builder> implements ResumeVisionCaptureResponseOrBuilder {
            private Builder() {
                super(ResumeVisionCaptureResponse.DEFAULT_INSTANCE);
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).clearFailure();
                return this;
            }

            public Builder clearResumedConfiguration() {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).clearResumedConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public VisionCaptureFailure getFailure() {
                return ((ResumeVisionCaptureResponse) this.instance).getFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public CaptureConfiguration getResumedConfiguration() {
                return ((ResumeVisionCaptureResponse) this.instance).getResumedConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public String getSessionId() {
                return ((ResumeVisionCaptureResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((ResumeVisionCaptureResponse) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public boolean hasFailure() {
                return ((ResumeVisionCaptureResponse) this.instance).hasFailure();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.ResumeVisionCaptureResponseOrBuilder
            public boolean hasResumedConfiguration() {
                return ((ResumeVisionCaptureResponse) this.instance).hasResumedConfiguration();
            }

            public Builder mergeFailure(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).mergeFailure(visionCaptureFailure);
                return this;
            }

            public Builder mergeResumedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).mergeResumedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setFailure(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setFailure(visionCaptureFailure);
                return this;
            }

            public Builder setResumedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setResumedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFailure(VisionCaptureFailure.Builder builder) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setFailure(builder);
                return this;
            }

            public Builder setResumedConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((ResumeVisionCaptureResponse) this.instance).setResumedConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(ResumeVisionCaptureResponse resumeVisionCaptureResponse) {
            return DEFAULT_INSTANCE.createBuilder(resumeVisionCaptureResponse);
        }

        public static ResumeVisionCaptureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeVisionCaptureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(VisionCaptureFailure visionCaptureFailure) {
            visionCaptureFailure.getClass();
            this.failure_ = visionCaptureFailure;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumedConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.resumedConfiguration_ = captureConfiguration;
        }

        public static ResumeVisionCaptureResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResumeVisionCaptureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResumeVisionCaptureResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResumeVisionCaptureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResumeVisionCaptureResponse parseFrom(InputStream inputStream) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeVisionCaptureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeVisionCaptureResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResumeVisionCaptureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartVisionCapture extends GeneratedMessageLite<StartVisionCapture, Builder> implements StartVisionCaptureOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        private static final StartVisionCapture DEFAULT_INSTANCE;
        private static volatile Parser<StartVisionCapture> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int TIMEOUT_IN_MILLIS_FIELD_NUMBER = 3;
        private CaptureConfiguration configuration_;
        private String sessionId_ = "";
        private int timeoutInMillis_;

        static {
            StartVisionCapture startVisionCapture = new StartVisionCapture();
            DEFAULT_INSTANCE = startVisionCapture;
            startVisionCapture.makeImmutable();
        }

        private StartVisionCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutInMillis() {
            this.timeoutInMillis_ = 0;
        }

        public static StartVisionCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.configuration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.configuration_ = captureConfiguration;
            } else {
                this.configuration_ = CaptureConfiguration.newBuilder(this.configuration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartVisionCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVisionCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartVisionCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration.Builder builder) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutInMillis(int i) {
            this.timeoutInMillis_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartVisionCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartVisionCapture startVisionCapture = (StartVisionCapture) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !startVisionCapture.sessionId_.isEmpty(), startVisionCapture.sessionId_);
                    this.configuration_ = (CaptureConfiguration) visitor.visitMessage(this.configuration_, startVisionCapture.configuration_);
                    int i = this.timeoutInMillis_;
                    boolean z = i != 0;
                    int i2 = startVisionCapture.timeoutInMillis_;
                    this.timeoutInMillis_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.configuration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
                                        this.configuration_ = builder.buildPartial();
                                    }
                                } else if (readTag == 24) {
                                    this.timeoutInMillis_ = codedInputStream.readUInt32();
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
                        synchronized (StartVisionCapture.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
        public CaptureConfiguration getConfiguration() {
            CaptureConfiguration captureConfiguration = this.configuration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.configuration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getConfiguration());
            }
            int i2 = this.timeoutInMillis_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(3, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
        public int getTimeoutInMillis() {
            return this.timeoutInMillis_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(2, getConfiguration());
            }
            int i = this.timeoutInMillis_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartVisionCapture, Builder> implements StartVisionCaptureOrBuilder {
            private Builder() {
                super(StartVisionCapture.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((StartVisionCapture) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StartVisionCapture) this.instance).clearSessionId();
                return this;
            }

            public Builder clearTimeoutInMillis() {
                copyOnWrite();
                ((StartVisionCapture) this.instance).clearTimeoutInMillis();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
            public CaptureConfiguration getConfiguration() {
                return ((StartVisionCapture) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
            public String getSessionId() {
                return ((StartVisionCapture) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StartVisionCapture) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
            public int getTimeoutInMillis() {
                return ((StartVisionCapture) this.instance).getTimeoutInMillis();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureOrBuilder
            public boolean hasConfiguration() {
                return ((StartVisionCapture) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).mergeConfiguration(captureConfiguration);
                return this;
            }

            public Builder setConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).setConfiguration(captureConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setTimeoutInMillis(int i) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).setTimeoutInMillis(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((StartVisionCapture) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartVisionCapture startVisionCapture) {
            return DEFAULT_INSTANCE.createBuilder(startVisionCapture);
        }

        public static StartVisionCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVisionCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.configuration_ = captureConfiguration;
        }

        public static StartVisionCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartVisionCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartVisionCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartVisionCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartVisionCapture parseFrom(InputStream inputStream) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVisionCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVisionCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartVisionCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartVisionCaptureResponse extends GeneratedMessageLite<StartVisionCaptureResponse, Builder> implements StartVisionCaptureResponseOrBuilder {
        private static final StartVisionCaptureResponse DEFAULT_INSTANCE;
        public static final int FAILED_FIELD_NUMBER = 3;
        private static volatile Parser<StartVisionCaptureResponse> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int STARTED_FIELD_NUMBER = 2;
        private Object captureStatus_;
        private int captureStatusCase_ = 0;
        private String sessionId_ = "";

        static {
            StartVisionCaptureResponse startVisionCaptureResponse = new StartVisionCaptureResponse();
            DEFAULT_INSTANCE = startVisionCaptureResponse;
            startVisionCaptureResponse.makeImmutable();
        }

        private StartVisionCaptureResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureStatus() {
            this.captureStatusCase_ = 0;
            this.captureStatus_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailed() {
            if (this.captureStatusCase_ == 3) {
                this.captureStatusCase_ = 0;
                this.captureStatus_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarted() {
            if (this.captureStatusCase_ == 2) {
                this.captureStatusCase_ = 0;
                this.captureStatus_ = null;
            }
        }

        public static StartVisionCaptureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailed(VisionCaptureFailure visionCaptureFailure) {
            if (this.captureStatusCase_ != 3 || this.captureStatus_ == VisionCaptureFailure.getDefaultInstance()) {
                this.captureStatus_ = visionCaptureFailure;
            } else {
                this.captureStatus_ = VisionCaptureFailure.newBuilder((VisionCaptureFailure) this.captureStatus_).mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure).buildPartial();
            }
            this.captureStatusCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStarted(VisionCaptureStarted visionCaptureStarted) {
            if (this.captureStatusCase_ != 2 || this.captureStatus_ == VisionCaptureStarted.getDefaultInstance()) {
                this.captureStatus_ = visionCaptureStarted;
            } else {
                this.captureStatus_ = VisionCaptureStarted.newBuilder((VisionCaptureStarted) this.captureStatus_).mergeFrom((VisionCaptureStarted.Builder) visionCaptureStarted).buildPartial();
            }
            this.captureStatusCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartVisionCaptureResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVisionCaptureResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartVisionCaptureResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure.Builder builder) {
            this.captureStatus_ = builder.build();
            this.captureStatusCase_ = 3;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarted(VisionCaptureStarted.Builder builder) {
            this.captureStatus_ = builder.build();
            this.captureStatusCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartVisionCaptureResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartVisionCaptureResponse startVisionCaptureResponse = (StartVisionCaptureResponse) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !startVisionCaptureResponse.sessionId_.isEmpty(), startVisionCaptureResponse.sessionId_);
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StartVisionCaptureResponse$CaptureStatusCase[startVisionCaptureResponse.getCaptureStatusCase().ordinal()];
                    if (i2 == 1) {
                        this.captureStatus_ = visitor.visitOneofMessage(this.captureStatusCase_ == 2, this.captureStatus_, startVisionCaptureResponse.captureStatus_);
                    } else if (i2 == 2) {
                        this.captureStatus_ = visitor.visitOneofMessage(this.captureStatusCase_ == 3, this.captureStatus_, startVisionCaptureResponse.captureStatus_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.captureStatusCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = startVisionCaptureResponse.captureStatusCase_) != 0) {
                        this.captureStatusCase_ = i;
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    VisionCaptureStarted.Builder builder = this.captureStatusCase_ == 2 ? ((VisionCaptureStarted) this.captureStatus_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(VisionCaptureStarted.parser(), extensionRegistryLite);
                                    this.captureStatus_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((VisionCaptureStarted.Builder) readMessage);
                                        this.captureStatus_ = builder.buildPartial();
                                    }
                                    this.captureStatusCase_ = 2;
                                } else if (readTag == 26) {
                                    VisionCaptureFailure.Builder builder2 = this.captureStatusCase_ == 3 ? ((VisionCaptureFailure) this.captureStatus_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(VisionCaptureFailure.parser(), extensionRegistryLite);
                                    this.captureStatus_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VisionCaptureFailure.Builder) readMessage2);
                                        this.captureStatus_ = builder2.buildPartial();
                                    }
                                    this.captureStatusCase_ = 3;
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
                        synchronized (StartVisionCaptureResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public CaptureStatusCase getCaptureStatusCase() {
            return CaptureStatusCase.forNumber(this.captureStatusCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public VisionCaptureFailure getFailed() {
            return this.captureStatusCase_ == 3 ? (VisionCaptureFailure) this.captureStatus_ : VisionCaptureFailure.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.captureStatusCase_ == 2) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (VisionCaptureStarted) this.captureStatus_);
            }
            if (this.captureStatusCase_ == 3) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (VisionCaptureFailure) this.captureStatus_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public VisionCaptureStarted getStarted() {
            return this.captureStatusCase_ == 2 ? (VisionCaptureStarted) this.captureStatus_ : VisionCaptureStarted.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public boolean hasFailed() {
            return this.captureStatusCase_ == 3;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
        public boolean hasStarted() {
            return this.captureStatusCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.captureStatusCase_ == 2) {
                codedOutputStream.writeMessage(2, (VisionCaptureStarted) this.captureStatus_);
            }
            if (this.captureStatusCase_ == 3) {
                codedOutputStream.writeMessage(3, (VisionCaptureFailure) this.captureStatus_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartVisionCaptureResponse, Builder> implements StartVisionCaptureResponseOrBuilder {
            private Builder() {
                super(StartVisionCaptureResponse.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureStatus() {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).clearCaptureStatus();
                return this;
            }

            public Builder clearFailed() {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).clearFailed();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStarted() {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).clearStarted();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public CaptureStatusCase getCaptureStatusCase() {
                return ((StartVisionCaptureResponse) this.instance).getCaptureStatusCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public VisionCaptureFailure getFailed() {
                return ((StartVisionCaptureResponse) this.instance).getFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public String getSessionId() {
                return ((StartVisionCaptureResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StartVisionCaptureResponse) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public VisionCaptureStarted getStarted() {
                return ((StartVisionCaptureResponse) this.instance).getStarted();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public boolean hasFailed() {
                return ((StartVisionCaptureResponse) this.instance).hasFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StartVisionCaptureResponseOrBuilder
            public boolean hasStarted() {
                return ((StartVisionCaptureResponse) this.instance).hasStarted();
            }

            public Builder mergeFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).mergeFailed(visionCaptureFailure);
                return this;
            }

            public Builder mergeStarted(VisionCaptureStarted visionCaptureStarted) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).mergeStarted(visionCaptureStarted);
                return this;
            }

            public Builder setFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setFailed(visionCaptureFailure);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setStarted(VisionCaptureStarted visionCaptureStarted) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setStarted(visionCaptureStarted);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFailed(VisionCaptureFailure.Builder builder) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setFailed(builder);
                return this;
            }

            public Builder setStarted(VisionCaptureStarted.Builder builder) {
                copyOnWrite();
                ((StartVisionCaptureResponse) this.instance).setStarted(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CaptureStatusCase implements Internal.EnumLite {
            STARTED(2),
            FAILED(3),
            CAPTURESTATUS_NOT_SET(0);

            private final int value;

            CaptureStatusCase(int i) {
                this.value = i;
            }

            public static CaptureStatusCase forNumber(int i) {
                if (i == 0) {
                    return CAPTURESTATUS_NOT_SET;
                }
                if (i == 2) {
                    return STARTED;
                }
                if (i != 3) {
                    return null;
                }
                return FAILED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CaptureStatusCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(StartVisionCaptureResponse startVisionCaptureResponse) {
            return DEFAULT_INSTANCE.createBuilder(startVisionCaptureResponse);
        }

        public static StartVisionCaptureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVisionCaptureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartVisionCaptureResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure visionCaptureFailure) {
            visionCaptureFailure.getClass();
            this.captureStatus_ = visionCaptureFailure;
            this.captureStatusCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarted(VisionCaptureStarted visionCaptureStarted) {
            visionCaptureStarted.getClass();
            this.captureStatus_ = visionCaptureStarted;
            this.captureStatusCase_ = 2;
        }

        public static StartVisionCaptureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartVisionCaptureResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartVisionCaptureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartVisionCaptureResponse parseFrom(InputStream inputStream) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartVisionCaptureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartVisionCaptureResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartVisionCaptureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopVisionCaptureResponse extends GeneratedMessageLite<StopVisionCaptureResponse, Builder> implements StopVisionCaptureResponseOrBuilder {
        private static final StopVisionCaptureResponse DEFAULT_INSTANCE;
        public static final int FAILED_FIELD_NUMBER = 3;
        private static volatile Parser<StopVisionCaptureResponse> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int STOPPED_FIELD_NUMBER = 2;
        private Object captureResult_;
        private int captureResultCase_ = 0;
        private String sessionId_ = "";

        static {
            StopVisionCaptureResponse stopVisionCaptureResponse = new StopVisionCaptureResponse();
            DEFAULT_INSTANCE = stopVisionCaptureResponse;
            stopVisionCaptureResponse.makeImmutable();
        }

        private StopVisionCaptureResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureResult() {
            this.captureResultCase_ = 0;
            this.captureResult_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailed() {
            if (this.captureResultCase_ == 3) {
                this.captureResultCase_ = 0;
                this.captureResult_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopped() {
            if (this.captureResultCase_ == 2) {
                this.captureResultCase_ = 0;
                this.captureResult_ = null;
            }
        }

        public static StopVisionCaptureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailed(VisionCaptureFailure visionCaptureFailure) {
            if (this.captureResultCase_ != 3 || this.captureResult_ == VisionCaptureFailure.getDefaultInstance()) {
                this.captureResult_ = visionCaptureFailure;
            } else {
                this.captureResult_ = VisionCaptureFailure.newBuilder((VisionCaptureFailure) this.captureResult_).mergeFrom((VisionCaptureFailure.Builder) visionCaptureFailure).buildPartial();
            }
            this.captureResultCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStopped(VisionCaptureStopped visionCaptureStopped) {
            if (this.captureResultCase_ != 2 || this.captureResult_ == VisionCaptureStopped.getDefaultInstance()) {
                this.captureResult_ = visionCaptureStopped;
            } else {
                this.captureResult_ = VisionCaptureStopped.newBuilder((VisionCaptureStopped) this.captureResult_).mergeFrom((VisionCaptureStopped.Builder) visionCaptureStopped).buildPartial();
            }
            this.captureResultCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopVisionCaptureResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVisionCaptureResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopVisionCaptureResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure.Builder builder) {
            this.captureResult_ = builder.build();
            this.captureResultCase_ = 3;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopped(VisionCaptureStopped.Builder builder) {
            this.captureResult_ = builder.build();
            this.captureResultCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopVisionCaptureResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StopVisionCaptureResponse stopVisionCaptureResponse = (StopVisionCaptureResponse) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !stopVisionCaptureResponse.sessionId_.isEmpty(), stopVisionCaptureResponse.sessionId_);
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Vision$StopVisionCaptureResponse$CaptureResultCase[stopVisionCaptureResponse.getCaptureResultCase().ordinal()];
                    if (i2 == 1) {
                        this.captureResult_ = visitor.visitOneofMessage(this.captureResultCase_ == 2, this.captureResult_, stopVisionCaptureResponse.captureResult_);
                    } else if (i2 == 2) {
                        this.captureResult_ = visitor.visitOneofMessage(this.captureResultCase_ == 3, this.captureResult_, stopVisionCaptureResponse.captureResult_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.captureResultCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = stopVisionCaptureResponse.captureResultCase_) != 0) {
                        this.captureResultCase_ = i;
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    VisionCaptureStopped.Builder builder = this.captureResultCase_ == 2 ? ((VisionCaptureStopped) this.captureResult_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(VisionCaptureStopped.parser(), extensionRegistryLite);
                                    this.captureResult_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((VisionCaptureStopped.Builder) readMessage);
                                        this.captureResult_ = builder.buildPartial();
                                    }
                                    this.captureResultCase_ = 2;
                                } else if (readTag == 26) {
                                    VisionCaptureFailure.Builder builder2 = this.captureResultCase_ == 3 ? ((VisionCaptureFailure) this.captureResult_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(VisionCaptureFailure.parser(), extensionRegistryLite);
                                    this.captureResult_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((VisionCaptureFailure.Builder) readMessage2);
                                        this.captureResult_ = builder2.buildPartial();
                                    }
                                    this.captureResultCase_ = 3;
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
                        synchronized (StopVisionCaptureResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public CaptureResultCase getCaptureResultCase() {
            return CaptureResultCase.forNumber(this.captureResultCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public VisionCaptureFailure getFailed() {
            return this.captureResultCase_ == 3 ? (VisionCaptureFailure) this.captureResult_ : VisionCaptureFailure.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.captureResultCase_ == 2) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (VisionCaptureStopped) this.captureResult_);
            }
            if (this.captureResultCase_ == 3) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (VisionCaptureFailure) this.captureResult_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public VisionCaptureStopped getStopped() {
            return this.captureResultCase_ == 2 ? (VisionCaptureStopped) this.captureResult_ : VisionCaptureStopped.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public boolean hasFailed() {
            return this.captureResultCase_ == 3;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
        public boolean hasStopped() {
            return this.captureResultCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.captureResultCase_ == 2) {
                codedOutputStream.writeMessage(2, (VisionCaptureStopped) this.captureResult_);
            }
            if (this.captureResultCase_ == 3) {
                codedOutputStream.writeMessage(3, (VisionCaptureFailure) this.captureResult_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopVisionCaptureResponse, Builder> implements StopVisionCaptureResponseOrBuilder {
            private Builder() {
                super(StopVisionCaptureResponse.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureResult() {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).clearCaptureResult();
                return this;
            }

            public Builder clearFailed() {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).clearFailed();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStopped() {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).clearStopped();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public CaptureResultCase getCaptureResultCase() {
                return ((StopVisionCaptureResponse) this.instance).getCaptureResultCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public VisionCaptureFailure getFailed() {
                return ((StopVisionCaptureResponse) this.instance).getFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public String getSessionId() {
                return ((StopVisionCaptureResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StopVisionCaptureResponse) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public VisionCaptureStopped getStopped() {
                return ((StopVisionCaptureResponse) this.instance).getStopped();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public boolean hasFailed() {
                return ((StopVisionCaptureResponse) this.instance).hasFailed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureResponseOrBuilder
            public boolean hasStopped() {
                return ((StopVisionCaptureResponse) this.instance).hasStopped();
            }

            public Builder mergeFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).mergeFailed(visionCaptureFailure);
                return this;
            }

            public Builder mergeStopped(VisionCaptureStopped visionCaptureStopped) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).mergeStopped(visionCaptureStopped);
                return this;
            }

            public Builder setFailed(VisionCaptureFailure visionCaptureFailure) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setFailed(visionCaptureFailure);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setStopped(VisionCaptureStopped visionCaptureStopped) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setStopped(visionCaptureStopped);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setFailed(VisionCaptureFailure.Builder builder) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setFailed(builder);
                return this;
            }

            public Builder setStopped(VisionCaptureStopped.Builder builder) {
                copyOnWrite();
                ((StopVisionCaptureResponse) this.instance).setStopped(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CaptureResultCase implements Internal.EnumLite {
            STOPPED(2),
            FAILED(3),
            CAPTURERESULT_NOT_SET(0);

            private final int value;

            CaptureResultCase(int i) {
                this.value = i;
            }

            public static CaptureResultCase forNumber(int i) {
                if (i == 0) {
                    return CAPTURERESULT_NOT_SET;
                }
                if (i == 2) {
                    return STOPPED;
                }
                if (i != 3) {
                    return null;
                }
                return FAILED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CaptureResultCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(StopVisionCaptureResponse stopVisionCaptureResponse) {
            return DEFAULT_INSTANCE.createBuilder(stopVisionCaptureResponse);
        }

        public static StopVisionCaptureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVisionCaptureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopVisionCaptureResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailed(VisionCaptureFailure visionCaptureFailure) {
            visionCaptureFailure.getClass();
            this.captureResult_ = visionCaptureFailure;
            this.captureResultCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopped(VisionCaptureStopped visionCaptureStopped) {
            visionCaptureStopped.getClass();
            this.captureResult_ = visionCaptureStopped;
            this.captureResultCase_ = 2;
        }

        public static StopVisionCaptureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopVisionCaptureResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopVisionCaptureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopVisionCaptureResponse parseFrom(InputStream inputStream) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVisionCaptureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVisionCaptureResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopVisionCaptureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCaptureResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubframeData extends GeneratedMessageLite<SubframeData, Builder> implements SubframeDataOrBuilder {
        private static final SubframeData DEFAULT_INSTANCE;
        public static final int IMAGE_DATA_FIELD_NUMBER = 3;
        public static final int IMAGE_LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser<SubframeData> PARSER = null;
        public static final int PROCESSING_TIMESTAMP_FIELD_NUMBER = 2;
        private ImageData imageData_;
        private Location imageLocation_;
        private String processingTimestamp_ = "";

        static {
            SubframeData subframeData = new SubframeData();
            DEFAULT_INSTANCE = subframeData;
            subframeData.makeImmutable();
        }

        private SubframeData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageData() {
            this.imageData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageLocation() {
            this.imageLocation_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProcessingTimestamp() {
            this.processingTimestamp_ = getDefaultInstance().getProcessingTimestamp();
        }

        public static SubframeData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageData(ImageData imageData) {
            ImageData imageData2 = this.imageData_;
            if (imageData2 == null || imageData2 == ImageData.getDefaultInstance()) {
                this.imageData_ = imageData;
            } else {
                this.imageData_ = ImageData.newBuilder(this.imageData_).mergeFrom((ImageData.Builder) imageData).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageLocation(Location location) {
            Location location2 = this.imageLocation_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.imageLocation_ = location;
            } else {
                this.imageLocation_ = Location.newBuilder(this.imageLocation_).mergeFrom((Location.Builder) location).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SubframeData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubframeData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SubframeData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageData(ImageData.Builder builder) {
            this.imageData_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageLocation(Location.Builder builder) {
            this.imageLocation_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessingTimestamp(String str) {
            str.getClass();
            this.processingTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessingTimestampBytes(ByteString byteString) {
            this.processingTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SubframeData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SubframeData subframeData = (SubframeData) obj2;
                    this.imageLocation_ = (Location) visitor.visitMessage(this.imageLocation_, subframeData.imageLocation_);
                    this.processingTimestamp_ = visitor.visitString(!this.processingTimestamp_.isEmpty(), this.processingTimestamp_, true ^ subframeData.processingTimestamp_.isEmpty(), subframeData.processingTimestamp_);
                    this.imageData_ = (ImageData) visitor.visitMessage(this.imageData_, subframeData.imageData_);
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
                                    Location location = this.imageLocation_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) codedInputStream.readMessage(Location.parser(), extensionRegistryLite);
                                    this.imageLocation_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom((Location.Builder) location2);
                                        this.imageLocation_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.processingTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    ImageData imageData = this.imageData_;
                                    ImageData.Builder builder2 = imageData != null ? imageData.toBuilder() : null;
                                    ImageData imageData2 = (ImageData) codedInputStream.readMessage(ImageData.parser(), extensionRegistryLite);
                                    this.imageData_ = imageData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((ImageData.Builder) imageData2);
                                        this.imageData_ = builder2.buildPartial();
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
                        synchronized (SubframeData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public ImageData getImageData() {
            ImageData imageData = this.imageData_;
            return imageData == null ? ImageData.getDefaultInstance() : imageData;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public Location getImageLocation() {
            Location location = this.imageLocation_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public String getProcessingTimestamp() {
            return this.processingTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public ByteString getProcessingTimestampBytes() {
            return ByteString.copyFromUtf8(this.processingTimestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.imageLocation_ != null ? CodedOutputStream.computeMessageSize(1, getImageLocation()) : 0;
            if (!this.processingTimestamp_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getProcessingTimestamp());
            }
            if (this.imageData_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getImageData());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public boolean hasImageData() {
            return this.imageData_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
        public boolean hasImageLocation() {
            return this.imageLocation_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.imageLocation_ != null) {
                codedOutputStream.writeMessage(1, getImageLocation());
            }
            if (!this.processingTimestamp_.isEmpty()) {
                codedOutputStream.writeString(2, getProcessingTimestamp());
            }
            if (this.imageData_ != null) {
                codedOutputStream.writeMessage(3, getImageData());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SubframeData, Builder> implements SubframeDataOrBuilder {
            private Builder() {
                super(SubframeData.DEFAULT_INSTANCE);
            }

            public Builder clearImageData() {
                copyOnWrite();
                ((SubframeData) this.instance).clearImageData();
                return this;
            }

            public Builder clearImageLocation() {
                copyOnWrite();
                ((SubframeData) this.instance).clearImageLocation();
                return this;
            }

            public Builder clearProcessingTimestamp() {
                copyOnWrite();
                ((SubframeData) this.instance).clearProcessingTimestamp();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public ImageData getImageData() {
                return ((SubframeData) this.instance).getImageData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public Location getImageLocation() {
                return ((SubframeData) this.instance).getImageLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public String getProcessingTimestamp() {
                return ((SubframeData) this.instance).getProcessingTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public ByteString getProcessingTimestampBytes() {
                return ((SubframeData) this.instance).getProcessingTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public boolean hasImageData() {
                return ((SubframeData) this.instance).hasImageData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SubframeDataOrBuilder
            public boolean hasImageLocation() {
                return ((SubframeData) this.instance).hasImageLocation();
            }

            public Builder mergeImageData(ImageData imageData) {
                copyOnWrite();
                ((SubframeData) this.instance).mergeImageData(imageData);
                return this;
            }

            public Builder mergeImageLocation(Location location) {
                copyOnWrite();
                ((SubframeData) this.instance).mergeImageLocation(location);
                return this;
            }

            public Builder setImageData(ImageData imageData) {
                copyOnWrite();
                ((SubframeData) this.instance).setImageData(imageData);
                return this;
            }

            public Builder setImageLocation(Location location) {
                copyOnWrite();
                ((SubframeData) this.instance).setImageLocation(location);
                return this;
            }

            public Builder setProcessingTimestamp(String str) {
                copyOnWrite();
                ((SubframeData) this.instance).setProcessingTimestamp(str);
                return this;
            }

            public Builder setProcessingTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((SubframeData) this.instance).setProcessingTimestampBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setImageData(ImageData.Builder builder) {
                copyOnWrite();
                ((SubframeData) this.instance).setImageData(builder);
                return this;
            }

            public Builder setImageLocation(Location.Builder builder) {
                copyOnWrite();
                ((SubframeData) this.instance).setImageLocation(builder);
                return this;
            }
        }

        public static Builder newBuilder(SubframeData subframeData) {
            return DEFAULT_INSTANCE.createBuilder(subframeData);
        }

        public static SubframeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SubframeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageData(ImageData imageData) {
            imageData.getClass();
            this.imageData_ = imageData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageLocation(Location location) {
            location.getClass();
            this.imageLocation_ = location;
        }

        public static SubframeData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SubframeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SubframeData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SubframeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SubframeData parseFrom(InputStream inputStream) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubframeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SubframeData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SubframeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubframeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TextDetection extends GeneratedMessageLite<TextDetection, Builder> implements TextDetectionOrBuilder {
        public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 2;
        private static final TextDetection DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 3;
        private static volatile Parser<TextDetection> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private float confidenceScore_;
        private Location location_;
        private String text_ = "";

        static {
            TextDetection textDetection = new TextDetection();
            DEFAULT_INSTANCE = textDetection;
            textDetection.makeImmutable();
        }

        private TextDetection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfidenceScore() {
            this.confidenceScore_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static TextDetection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLocation(Location location) {
            Location location2 = this.location_;
            if (location2 == null || location2 == Location.getDefaultInstance()) {
                this.location_ = location;
            } else {
                this.location_ = Location.newBuilder(this.location_).mergeFrom((Location.Builder) location).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TextDetection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDetection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TextDetection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfidenceScore(float f) {
            this.confidenceScore_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location.Builder builder) {
            this.location_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            this.text_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextDetection();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    TextDetection textDetection = (TextDetection) obj2;
                    this.text_ = visitor.visitString(!this.text_.isEmpty(), this.text_, !textDetection.text_.isEmpty(), textDetection.text_);
                    float f = this.confidenceScore_;
                    boolean z = f != 0.0f;
                    float f2 = textDetection.confidenceScore_;
                    this.confidenceScore_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    this.location_ = (Location) visitor.visitMessage(this.location_, textDetection.location_);
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
                                    this.text_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 21) {
                                    this.confidenceScore_ = codedInputStream.readFloat();
                                } else if (readTag == 26) {
                                    Location location = this.location_;
                                    Location.Builder builder = location != null ? location.toBuilder() : null;
                                    Location location2 = (Location) codedInputStream.readMessage(Location.parser(), extensionRegistryLite);
                                    this.location_ = location2;
                                    if (builder != null) {
                                        builder.mergeFrom((Location.Builder) location2);
                                        this.location_ = builder.buildPartial();
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
                        synchronized (TextDetection.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
        public float getConfidenceScore() {
            return this.confidenceScore_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.text_.isEmpty() ? CodedOutputStream.computeStringSize(1, getText()) : 0;
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                computeStringSize += CodedOutputStream.computeFloatSize(2, f);
            }
            if (this.location_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getLocation());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
        public boolean hasLocation() {
            return this.location_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.writeString(1, getText());
            }
            float f = this.confidenceScore_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            if (this.location_ != null) {
                codedOutputStream.writeMessage(3, getLocation());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<TextDetection, Builder> implements TextDetectionOrBuilder {
            private Builder() {
                super(TextDetection.DEFAULT_INSTANCE);
            }

            public Builder clearConfidenceScore() {
                copyOnWrite();
                ((TextDetection) this.instance).clearConfidenceScore();
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((TextDetection) this.instance).clearLocation();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((TextDetection) this.instance).clearText();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
            public float getConfidenceScore() {
                return ((TextDetection) this.instance).getConfidenceScore();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
            public Location getLocation() {
                return ((TextDetection) this.instance).getLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
            public String getText() {
                return ((TextDetection) this.instance).getText();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
            public ByteString getTextBytes() {
                return ((TextDetection) this.instance).getTextBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.TextDetectionOrBuilder
            public boolean hasLocation() {
                return ((TextDetection) this.instance).hasLocation();
            }

            public Builder mergeLocation(Location location) {
                copyOnWrite();
                ((TextDetection) this.instance).mergeLocation(location);
                return this;
            }

            public Builder setConfidenceScore(float f) {
                copyOnWrite();
                ((TextDetection) this.instance).setConfidenceScore(f);
                return this;
            }

            public Builder setLocation(Location location) {
                copyOnWrite();
                ((TextDetection) this.instance).setLocation(location);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((TextDetection) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((TextDetection) this.instance).setTextBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLocation(Location.Builder builder) {
                copyOnWrite();
                ((TextDetection) this.instance).setLocation(builder);
                return this;
            }
        }

        public static Builder newBuilder(TextDetection textDetection) {
            return DEFAULT_INSTANCE.createBuilder(textDetection);
        }

        public static TextDetection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TextDetection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(Location location) {
            location.getClass();
            this.location_ = location;
        }

        public static TextDetection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TextDetection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TextDetection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextDetection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TextDetection parseFrom(InputStream inputStream) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextDetection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TextDetection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TextDetection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextDetection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UpdateVisionCaptureConfig extends GeneratedMessageLite<UpdateVisionCaptureConfig, Builder> implements UpdateVisionCaptureConfigOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        private static final UpdateVisionCaptureConfig DEFAULT_INSTANCE;
        private static volatile Parser<UpdateVisionCaptureConfig> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private CaptureConfiguration configuration_;
        private String sessionId_ = "";

        static {
            UpdateVisionCaptureConfig updateVisionCaptureConfig = new UpdateVisionCaptureConfig();
            DEFAULT_INSTANCE = updateVisionCaptureConfig;
            updateVisionCaptureConfig.makeImmutable();
        }

        private UpdateVisionCaptureConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static UpdateVisionCaptureConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.configuration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.configuration_ = captureConfiguration;
            } else {
                this.configuration_ = CaptureConfiguration.newBuilder(this.configuration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateVisionCaptureConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateVisionCaptureConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateVisionCaptureConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration.Builder builder) {
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
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UpdateVisionCaptureConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    UpdateVisionCaptureConfig updateVisionCaptureConfig = (UpdateVisionCaptureConfig) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !updateVisionCaptureConfig.sessionId_.isEmpty(), updateVisionCaptureConfig.sessionId_);
                    this.configuration_ = (CaptureConfiguration) visitor.visitMessage(this.configuration_, updateVisionCaptureConfig.configuration_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.configuration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
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
                        synchronized (UpdateVisionCaptureConfig.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
        public CaptureConfiguration getConfiguration() {
            CaptureConfiguration captureConfiguration = this.configuration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.configuration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getConfiguration());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(2, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UpdateVisionCaptureConfig, Builder> implements UpdateVisionCaptureConfigOrBuilder {
            private Builder() {
                super(UpdateVisionCaptureConfig.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
            public CaptureConfiguration getConfiguration() {
                return ((UpdateVisionCaptureConfig) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
            public String getSessionId() {
                return ((UpdateVisionCaptureConfig) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
            public ByteString getSessionIdBytes() {
                return ((UpdateVisionCaptureConfig) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigOrBuilder
            public boolean hasConfiguration() {
                return ((UpdateVisionCaptureConfig) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).mergeConfiguration(captureConfiguration);
                return this;
            }

            public Builder setConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).setConfiguration(captureConfiguration);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((UpdateVisionCaptureConfig) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(UpdateVisionCaptureConfig updateVisionCaptureConfig) {
            return DEFAULT_INSTANCE.createBuilder(updateVisionCaptureConfig);
        }

        public static UpdateVisionCaptureConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.configuration_ = captureConfiguration;
        }

        public static UpdateVisionCaptureConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateVisionCaptureConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateVisionCaptureConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfig parseFrom(InputStream inputStream) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateVisionCaptureConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateVisionCaptureConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UpdateVisionCaptureConfigResponse extends GeneratedMessageLite<UpdateVisionCaptureConfigResponse, Builder> implements UpdateVisionCaptureConfigResponseOrBuilder {
        public static final int APPLIED_CONFIGURATION_FIELD_NUMBER = 2;
        private static final UpdateVisionCaptureConfigResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        private static volatile Parser<UpdateVisionCaptureConfigResponse> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private CaptureConfiguration appliedConfiguration_;
        private String sessionId_ = "";
        private String errorMessage_ = "";

        static {
            UpdateVisionCaptureConfigResponse updateVisionCaptureConfigResponse = new UpdateVisionCaptureConfigResponse();
            DEFAULT_INSTANCE = updateVisionCaptureConfigResponse;
            updateVisionCaptureConfigResponse.makeImmutable();
        }

        private UpdateVisionCaptureConfigResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppliedConfiguration() {
            this.appliedConfiguration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static UpdateVisionCaptureConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppliedConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.appliedConfiguration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.appliedConfiguration_ = captureConfiguration;
            } else {
                this.appliedConfiguration_ = CaptureConfiguration.newBuilder(this.appliedConfiguration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateVisionCaptureConfigResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateVisionCaptureConfigResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppliedConfiguration(CaptureConfiguration.Builder builder) {
            this.appliedConfiguration_ = builder.build();
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
                    return new UpdateVisionCaptureConfigResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    UpdateVisionCaptureConfigResponse updateVisionCaptureConfigResponse = (UpdateVisionCaptureConfigResponse) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !updateVisionCaptureConfigResponse.sessionId_.isEmpty(), updateVisionCaptureConfigResponse.sessionId_);
                    this.appliedConfiguration_ = (CaptureConfiguration) visitor.visitMessage(this.appliedConfiguration_, updateVisionCaptureConfigResponse.appliedConfiguration_);
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !updateVisionCaptureConfigResponse.errorMessage_.isEmpty(), updateVisionCaptureConfigResponse.errorMessage_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    CaptureConfiguration captureConfiguration = this.appliedConfiguration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.appliedConfiguration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
                                        this.appliedConfiguration_ = builder.buildPartial();
                                    }
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
                        synchronized (UpdateVisionCaptureConfigResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public CaptureConfiguration getAppliedConfiguration() {
            CaptureConfiguration captureConfiguration = this.appliedConfiguration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.appliedConfiguration_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getAppliedConfiguration());
            }
            if (!this.errorMessage_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getErrorMessage());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
        public boolean hasAppliedConfiguration() {
            return this.appliedConfiguration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.appliedConfiguration_ != null) {
                codedOutputStream.writeMessage(2, getAppliedConfiguration());
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(3, getErrorMessage());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UpdateVisionCaptureConfigResponse, Builder> implements UpdateVisionCaptureConfigResponseOrBuilder {
            private Builder() {
                super(UpdateVisionCaptureConfigResponse.DEFAULT_INSTANCE);
            }

            public Builder clearAppliedConfiguration() {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).clearAppliedConfiguration();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public CaptureConfiguration getAppliedConfiguration() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).getAppliedConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public String getErrorMessage() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).getErrorMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public String getSessionId() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public ByteString getSessionIdBytes() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.UpdateVisionCaptureConfigResponseOrBuilder
            public boolean hasAppliedConfiguration() {
                return ((UpdateVisionCaptureConfigResponse) this.instance).hasAppliedConfiguration();
            }

            public Builder mergeAppliedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).mergeAppliedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setAppliedConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setAppliedConfiguration(captureConfiguration);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAppliedConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((UpdateVisionCaptureConfigResponse) this.instance).setAppliedConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(UpdateVisionCaptureConfigResponse updateVisionCaptureConfigResponse) {
            return DEFAULT_INSTANCE.createBuilder(updateVisionCaptureConfigResponse);
        }

        public static UpdateVisionCaptureConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppliedConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.appliedConfiguration_ = captureConfiguration;
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(InputStream inputStream) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateVisionCaptureConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateVisionCaptureConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionCaptureConfigurations extends GeneratedMessageLite<VisionCaptureConfigurations, Builder> implements VisionCaptureConfigurationsOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        public static final int CAPTURE_MODE_FIELD_NUMBER = 2;
        private static final VisionCaptureConfigurations DEFAULT_INSTANCE;
        public static final int FRAME_RATES_FIELD_NUMBER = 4;
        public static final int IMAGE_FORMATS_FIELD_NUMBER = 5;
        public static final int MAX_FRAME_BYTES_FIELD_NUMBER = 6;
        public static final int MAX_FRAME_COUNT_FIELD_NUMBER = 7;
        private static volatile Parser<VisionCaptureConfigurations> PARSER = null;
        public static final int RESOLUTIONS_FIELD_NUMBER = 3;
        public static final int SUPPORTED_ENRICHMENTS_FIELD_NUMBER = 8;
        private static final Internal.ListAdapter.Converter<Integer, EnrichmentType> supportedEnrichments_converter_ = new Internal.ListAdapter.Converter<Integer, EnrichmentType>() { // from class: com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurations.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public EnrichmentType convert(Integer num) {
                EnrichmentType forNumber = EnrichmentType.forNumber(num.intValue());
                return forNumber == null ? EnrichmentType.UNRECOGNIZED : forNumber;
            }
        };
        private int bitField0_;
        private int cameraId_;
        private int captureMode_;
        private int maxFrameBytes_;
        private int maxFrameCount_;
        private int supportedEnrichmentsMemoizedSerializedSize;
        private int frameRatesMemoizedSerializedSize = -1;
        private Internal.ProtobufList<Camera.Resolution> resolutions_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList frameRates_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<String> imageFormats_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList supportedEnrichments_ = GeneratedMessageLite.emptyIntList();

        static {
            VisionCaptureConfigurations visionCaptureConfigurations = new VisionCaptureConfigurations();
            DEFAULT_INSTANCE = visionCaptureConfigurations;
            visionCaptureConfigurations.makeImmutable();
        }

        private VisionCaptureConfigurations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFrameRates(Iterable<? extends Integer> iterable) {
            ensureFrameRatesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.frameRates_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllImageFormats(Iterable<String> iterable) {
            ensureImageFormatsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.imageFormats_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResolutions(Iterable<? extends Camera.Resolution> iterable) {
            ensureResolutionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.resolutions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedEnrichments(Iterable<? extends EnrichmentType> iterable) {
            ensureSupportedEnrichmentsIsMutable();
            Iterator<? extends EnrichmentType> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.supportedEnrichments_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedEnrichmentsValue(Iterable<Integer> iterable) {
            ensureSupportedEnrichmentsIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.supportedEnrichments_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFrameRates(int i) {
            ensureFrameRatesIsMutable();
            this.frameRates_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addImageFormats(String str) {
            str.getClass();
            ensureImageFormatsIsMutable();
            this.imageFormats_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addImageFormatsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureImageFormatsIsMutable();
            this.imageFormats_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Camera.Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedEnrichments(EnrichmentType enrichmentType) {
            enrichmentType.getClass();
            ensureSupportedEnrichmentsIsMutable();
            this.supportedEnrichments_.addInt(enrichmentType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedEnrichmentsValue(int i) {
            ensureSupportedEnrichmentsIsMutable();
            this.supportedEnrichments_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureMode() {
            this.captureMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRates() {
            this.frameRates_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageFormats() {
            this.imageFormats_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxFrameBytes() {
            this.maxFrameBytes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxFrameCount() {
            this.maxFrameCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolutions() {
            this.resolutions_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedEnrichments() {
            this.supportedEnrichments_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureFrameRatesIsMutable() {
            if (this.frameRates_.isModifiable()) {
                return;
            }
            this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
        }

        private void ensureImageFormatsIsMutable() {
            if (this.imageFormats_.isModifiable()) {
                return;
            }
            this.imageFormats_ = GeneratedMessageLite.mutableCopy(this.imageFormats_);
        }

        private void ensureResolutionsIsMutable() {
            if (this.resolutions_.isModifiable()) {
                return;
            }
            this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
        }

        private void ensureSupportedEnrichmentsIsMutable() {
            if (this.supportedEnrichments_.isModifiable()) {
                return;
            }
            this.supportedEnrichments_ = GeneratedMessageLite.mutableCopy(this.supportedEnrichments_);
        }

        public static VisionCaptureConfigurations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionCaptureConfigurations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureConfigurations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionCaptureConfigurations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResolutions(int i) {
            ensureResolutionsIsMutable();
            this.resolutions_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraId(int i) {
            this.cameraId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureMode(CaptureMode captureMode) {
            captureMode.getClass();
            this.captureMode_ = captureMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureModeValue(int i) {
            this.captureMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRates(int i, int i2) {
            ensureFrameRatesIsMutable();
            this.frameRates_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageFormats(int i, String str) {
            str.getClass();
            ensureImageFormatsIsMutable();
            this.imageFormats_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxFrameBytes(int i) {
            this.maxFrameBytes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxFrameCount(int i) {
            this.maxFrameCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Camera.Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedEnrichments(int i, EnrichmentType enrichmentType) {
            enrichmentType.getClass();
            ensureSupportedEnrichmentsIsMutable();
            this.supportedEnrichments_.setInt(i, enrichmentType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedEnrichmentsValue(int i, int i2) {
            ensureSupportedEnrichmentsIsMutable();
            this.supportedEnrichments_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisionCaptureConfigurations();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.resolutions_.makeImmutable();
                    this.frameRates_.makeImmutable();
                    this.imageFormats_.makeImmutable();
                    this.supportedEnrichments_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionCaptureConfigurations visionCaptureConfigurations = (VisionCaptureConfigurations) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = visionCaptureConfigurations.cameraId_;
                    this.cameraId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.captureMode_;
                    boolean z2 = i3 != 0;
                    int i4 = visionCaptureConfigurations.captureMode_;
                    this.captureMode_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.resolutions_ = visitor.visitList(this.resolutions_, visionCaptureConfigurations.resolutions_);
                    this.frameRates_ = visitor.visitIntList(this.frameRates_, visionCaptureConfigurations.frameRates_);
                    this.imageFormats_ = visitor.visitList(this.imageFormats_, visionCaptureConfigurations.imageFormats_);
                    int i5 = this.maxFrameBytes_;
                    boolean z3 = i5 != 0;
                    int i6 = visionCaptureConfigurations.maxFrameBytes_;
                    this.maxFrameBytes_ = visitor.visitInt(z3, i5, i6 != 0, i6);
                    int i7 = this.maxFrameCount_;
                    boolean z4 = i7 != 0;
                    int i8 = visionCaptureConfigurations.maxFrameCount_;
                    this.maxFrameCount_ = visitor.visitInt(z4, i7, i8 != 0, i8);
                    this.supportedEnrichments_ = visitor.visitIntList(this.supportedEnrichments_, visionCaptureConfigurations.supportedEnrichments_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= visionCaptureConfigurations.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    objArr = 1;
                                case 8:
                                    this.cameraId_ = codedInputStream.readUInt32();
                                case 16:
                                    this.captureMode_ = codedInputStream.readEnum();
                                case 26:
                                    if (!this.resolutions_.isModifiable()) {
                                        this.resolutions_ = GeneratedMessageLite.mutableCopy(this.resolutions_);
                                    }
                                    this.resolutions_.add((Camera.Resolution) codedInputStream.readMessage(Camera.Resolution.parser(), extensionRegistryLite));
                                case 32:
                                    if (!this.frameRates_.isModifiable()) {
                                        this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
                                    }
                                    this.frameRates_.addInt(codedInputStream.readUInt32());
                                case 34:
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.frameRates_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.frameRates_ = GeneratedMessageLite.mutableCopy(this.frameRates_);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.frameRates_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    break;
                                case 42:
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.imageFormats_.isModifiable()) {
                                        this.imageFormats_ = GeneratedMessageLite.mutableCopy(this.imageFormats_);
                                    }
                                    this.imageFormats_.add(readStringRequireUtf8);
                                case 48:
                                    this.maxFrameBytes_ = codedInputStream.readUInt32();
                                case 56:
                                    this.maxFrameCount_ = codedInputStream.readUInt32();
                                case 64:
                                    if (!this.supportedEnrichments_.isModifiable()) {
                                        this.supportedEnrichments_ = GeneratedMessageLite.mutableCopy(this.supportedEnrichments_);
                                    }
                                    this.supportedEnrichments_.addInt(codedInputStream.readEnum());
                                case 66:
                                    if (!this.supportedEnrichments_.isModifiable()) {
                                        this.supportedEnrichments_ = GeneratedMessageLite.mutableCopy(this.supportedEnrichments_);
                                    }
                                    int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.supportedEnrichments_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit2);
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
                        synchronized (VisionCaptureConfigurations.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getCameraId() {
            return this.cameraId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public CaptureMode getCaptureMode() {
            CaptureMode forNumber = CaptureMode.forNumber(this.captureMode_);
            return forNumber == null ? CaptureMode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getCaptureModeValue() {
            return this.captureMode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getFrameRates(int i) {
            return this.frameRates_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getFrameRatesCount() {
            return this.frameRates_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public List<Integer> getFrameRatesList() {
            return this.frameRates_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public String getImageFormats(int i) {
            return this.imageFormats_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public ByteString getImageFormatsBytes(int i) {
            return ByteString.copyFromUtf8(this.imageFormats_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getImageFormatsCount() {
            return this.imageFormats_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public List<String> getImageFormatsList() {
            return this.imageFormats_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getMaxFrameBytes() {
            return this.maxFrameBytes_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getMaxFrameCount() {
            return this.maxFrameCount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public Camera.Resolution getResolutions(int i) {
            return this.resolutions_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getResolutionsCount() {
            return this.resolutions_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public List<Camera.Resolution> getResolutionsList() {
            return this.resolutions_;
        }

        public Camera.ResolutionOrBuilder getResolutionsOrBuilder(int i) {
            return this.resolutions_.get(i);
        }

        public List<? extends Camera.ResolutionOrBuilder> getResolutionsOrBuilderList() {
            return this.resolutions_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cameraId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.captureMode_ != CaptureMode.CAPTURE_MODE_UNSPECIFIED.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(2, this.captureMode_);
            }
            for (int i3 = 0; i3 < this.resolutions_.size(); i3++) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, this.resolutions_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.frameRates_.size(); i5++) {
                i4 += CodedOutputStream.computeUInt32SizeNoTag(this.frameRates_.getInt(i5));
            }
            int i6 = computeUInt32Size + i4;
            if (!getFrameRatesList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.frameRatesMemoizedSerializedSize = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.imageFormats_.size(); i8++) {
                i7 += CodedOutputStream.computeStringSizeNoTag(this.imageFormats_.get(i8));
            }
            int size = getImageFormatsList().size() + i6 + i7;
            int i9 = this.maxFrameBytes_;
            if (i9 != 0) {
                size += CodedOutputStream.computeUInt32Size(6, i9);
            }
            int i10 = this.maxFrameCount_;
            if (i10 != 0) {
                size += CodedOutputStream.computeUInt32Size(7, i10);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.supportedEnrichments_.size(); i12++) {
                i11 += CodedOutputStream.computeEnumSizeNoTag(this.supportedEnrichments_.getInt(i12));
            }
            int i13 = size + i11;
            if (!getSupportedEnrichmentsList().isEmpty()) {
                i13 = i13 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i11);
            }
            this.supportedEnrichmentsMemoizedSerializedSize = i11;
            int serializedSize = this.unknownFields.getSerializedSize() + i13;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public EnrichmentType getSupportedEnrichments(int i) {
            return supportedEnrichments_converter_.convert(Integer.valueOf(this.supportedEnrichments_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getSupportedEnrichmentsCount() {
            return this.supportedEnrichments_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public List<EnrichmentType> getSupportedEnrichmentsList() {
            return new Internal.ListAdapter(this.supportedEnrichments_, supportedEnrichments_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public int getSupportedEnrichmentsValue(int i) {
            return this.supportedEnrichments_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
        public List<Integer> getSupportedEnrichmentsValueList() {
            return this.supportedEnrichments_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = this.cameraId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.captureMode_ != CaptureMode.CAPTURE_MODE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.captureMode_);
            }
            for (int i2 = 0; i2 < this.resolutions_.size(); i2++) {
                codedOutputStream.writeMessage(3, this.resolutions_.get(i2));
            }
            if (getFrameRatesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(34);
                codedOutputStream.writeUInt32NoTag(this.frameRatesMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.frameRates_.size(); i3++) {
                codedOutputStream.writeUInt32NoTag(this.frameRates_.getInt(i3));
            }
            for (int i4 = 0; i4 < this.imageFormats_.size(); i4++) {
                codedOutputStream.writeString(5, this.imageFormats_.get(i4));
            }
            int i5 = this.maxFrameBytes_;
            if (i5 != 0) {
                codedOutputStream.writeUInt32(6, i5);
            }
            int i6 = this.maxFrameCount_;
            if (i6 != 0) {
                codedOutputStream.writeUInt32(7, i6);
            }
            if (getSupportedEnrichmentsList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(66);
                codedOutputStream.writeUInt32NoTag(this.supportedEnrichmentsMemoizedSerializedSize);
            }
            for (int i7 = 0; i7 < this.supportedEnrichments_.size(); i7++) {
                codedOutputStream.writeEnumNoTag(this.supportedEnrichments_.getInt(i7));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionCaptureConfigurations, Builder> implements VisionCaptureConfigurationsOrBuilder {
            private Builder() {
                super(VisionCaptureConfigurations.DEFAULT_INSTANCE);
            }

            public Builder addAllFrameRates(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addAllFrameRates(iterable);
                return this;
            }

            public Builder addAllImageFormats(Iterable<String> iterable) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addAllImageFormats(iterable);
                return this;
            }

            public Builder addAllResolutions(Iterable<? extends Camera.Resolution> iterable) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addAllResolutions(iterable);
                return this;
            }

            public Builder addAllSupportedEnrichments(Iterable<? extends EnrichmentType> iterable) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addAllSupportedEnrichments(iterable);
                return this;
            }

            public Builder addAllSupportedEnrichmentsValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addAllSupportedEnrichmentsValue(iterable);
                return this;
            }

            public Builder addFrameRates(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addFrameRates(i);
                return this;
            }

            public Builder addImageFormats(String str) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addImageFormats(str);
                return this;
            }

            public Builder addImageFormatsBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addImageFormatsBytes(byteString);
                return this;
            }

            public Builder addResolutions(Camera.Resolution resolution) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addResolutions(resolution);
                return this;
            }

            public Builder addSupportedEnrichments(EnrichmentType enrichmentType) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addSupportedEnrichments(enrichmentType);
                return this;
            }

            public Builder addSupportedEnrichmentsValue(int i) {
                ((VisionCaptureConfigurations) this.instance).addSupportedEnrichmentsValue(i);
                return this;
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearCameraId();
                return this;
            }

            public Builder clearCaptureMode() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearCaptureMode();
                return this;
            }

            public Builder clearFrameRates() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearFrameRates();
                return this;
            }

            public Builder clearImageFormats() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearImageFormats();
                return this;
            }

            public Builder clearMaxFrameBytes() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearMaxFrameBytes();
                return this;
            }

            public Builder clearMaxFrameCount() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearMaxFrameCount();
                return this;
            }

            public Builder clearResolutions() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearResolutions();
                return this;
            }

            public Builder clearSupportedEnrichments() {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).clearSupportedEnrichments();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getCameraId() {
                return ((VisionCaptureConfigurations) this.instance).getCameraId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public CaptureMode getCaptureMode() {
                return ((VisionCaptureConfigurations) this.instance).getCaptureMode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getCaptureModeValue() {
                return ((VisionCaptureConfigurations) this.instance).getCaptureModeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getFrameRates(int i) {
                return ((VisionCaptureConfigurations) this.instance).getFrameRates(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getFrameRatesCount() {
                return ((VisionCaptureConfigurations) this.instance).getFrameRatesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public List<Integer> getFrameRatesList() {
                return Collections.unmodifiableList(((VisionCaptureConfigurations) this.instance).getFrameRatesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public String getImageFormats(int i) {
                return ((VisionCaptureConfigurations) this.instance).getImageFormats(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public ByteString getImageFormatsBytes(int i) {
                return ((VisionCaptureConfigurations) this.instance).getImageFormatsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getImageFormatsCount() {
                return ((VisionCaptureConfigurations) this.instance).getImageFormatsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public List<String> getImageFormatsList() {
                return Collections.unmodifiableList(((VisionCaptureConfigurations) this.instance).getImageFormatsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getMaxFrameBytes() {
                return ((VisionCaptureConfigurations) this.instance).getMaxFrameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getMaxFrameCount() {
                return ((VisionCaptureConfigurations) this.instance).getMaxFrameCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public Camera.Resolution getResolutions(int i) {
                return ((VisionCaptureConfigurations) this.instance).getResolutions(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getResolutionsCount() {
                return ((VisionCaptureConfigurations) this.instance).getResolutionsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public List<Camera.Resolution> getResolutionsList() {
                return Collections.unmodifiableList(((VisionCaptureConfigurations) this.instance).getResolutionsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public EnrichmentType getSupportedEnrichments(int i) {
                return ((VisionCaptureConfigurations) this.instance).getSupportedEnrichments(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getSupportedEnrichmentsCount() {
                return ((VisionCaptureConfigurations) this.instance).getSupportedEnrichmentsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public List<EnrichmentType> getSupportedEnrichmentsList() {
                return ((VisionCaptureConfigurations) this.instance).getSupportedEnrichmentsList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public int getSupportedEnrichmentsValue(int i) {
                return ((VisionCaptureConfigurations) this.instance).getSupportedEnrichmentsValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureConfigurationsOrBuilder
            public List<Integer> getSupportedEnrichmentsValueList() {
                return Collections.unmodifiableList(((VisionCaptureConfigurations) this.instance).getSupportedEnrichmentsValueList());
            }

            public Builder removeResolutions(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).removeResolutions(i);
                return this;
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setCameraId(i);
                return this;
            }

            public Builder setCaptureMode(CaptureMode captureMode) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setCaptureMode(captureMode);
                return this;
            }

            public Builder setCaptureModeValue(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setCaptureModeValue(i);
                return this;
            }

            public Builder setFrameRates(int i, int i2) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setFrameRates(i, i2);
                return this;
            }

            public Builder setImageFormats(int i, String str) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setImageFormats(i, str);
                return this;
            }

            public Builder setMaxFrameBytes(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setMaxFrameBytes(i);
                return this;
            }

            public Builder setMaxFrameCount(int i) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setMaxFrameCount(i);
                return this;
            }

            public Builder setResolutions(int i, Camera.Resolution resolution) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setResolutions(i, resolution);
                return this;
            }

            public Builder setSupportedEnrichments(int i, EnrichmentType enrichmentType) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setSupportedEnrichments(i, enrichmentType);
                return this;
            }

            public Builder setSupportedEnrichmentsValue(int i, int i2) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setSupportedEnrichmentsValue(i, i2);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addResolutions(int i, Camera.Resolution resolution) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addResolutions(i, resolution);
                return this;
            }

            public Builder setResolutions(int i, Camera.Resolution.Builder builder) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).setResolutions(i, builder);
                return this;
            }

            public Builder addResolutions(Camera.Resolution.Builder builder) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addResolutions(builder);
                return this;
            }

            public Builder addResolutions(int i, Camera.Resolution.Builder builder) {
                copyOnWrite();
                ((VisionCaptureConfigurations) this.instance).addResolutions(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(VisionCaptureConfigurations visionCaptureConfigurations) {
            return DEFAULT_INSTANCE.createBuilder(visionCaptureConfigurations);
        }

        public static VisionCaptureConfigurations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureConfigurations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisionCaptureConfigurations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionCaptureConfigurations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionCaptureConfigurations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionCaptureConfigurations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionCaptureConfigurations parseFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Camera.Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, resolution);
        }

        public static VisionCaptureConfigurations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolutions(int i, Camera.Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.set(i, resolution);
        }

        public static VisionCaptureConfigurations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionCaptureConfigurations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(Camera.Resolution resolution) {
            resolution.getClass();
            ensureResolutionsIsMutable();
            this.resolutions_.add(resolution);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolutions(int i, Camera.Resolution.Builder builder) {
            ensureResolutionsIsMutable();
            this.resolutions_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionCaptureStarted extends GeneratedMessageLite<VisionCaptureStarted, Builder> implements VisionCaptureStartedOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 1;
        private static final VisionCaptureStarted DEFAULT_INSTANCE;
        private static volatile Parser<VisionCaptureStarted> PARSER = null;
        public static final int START_TIMESTAMP_FIELD_NUMBER = 2;
        private CaptureConfiguration configuration_;
        private String startTimestamp_ = "";

        static {
            VisionCaptureStarted visionCaptureStarted = new VisionCaptureStarted();
            DEFAULT_INSTANCE = visionCaptureStarted;
            visionCaptureStarted.makeImmutable();
        }

        private VisionCaptureStarted() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimestamp() {
            this.startTimestamp_ = getDefaultInstance().getStartTimestamp();
        }

        public static VisionCaptureStarted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(CaptureConfiguration captureConfiguration) {
            CaptureConfiguration captureConfiguration2 = this.configuration_;
            if (captureConfiguration2 == null || captureConfiguration2 == CaptureConfiguration.getDefaultInstance()) {
                this.configuration_ = captureConfiguration;
            } else {
                this.configuration_ = CaptureConfiguration.newBuilder(this.configuration_).mergeFrom((CaptureConfiguration.Builder) captureConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionCaptureStarted parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureStarted parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionCaptureStarted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration.Builder builder) {
            this.configuration_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimestamp(String str) {
            str.getClass();
            this.startTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimestampBytes(ByteString byteString) {
            this.startTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisionCaptureStarted();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionCaptureStarted visionCaptureStarted = (VisionCaptureStarted) obj2;
                    this.configuration_ = (CaptureConfiguration) visitor.visitMessage(this.configuration_, visionCaptureStarted.configuration_);
                    this.startTimestamp_ = visitor.visitString(!this.startTimestamp_.isEmpty(), this.startTimestamp_, !visionCaptureStarted.startTimestamp_.isEmpty(), visionCaptureStarted.startTimestamp_);
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
                                    CaptureConfiguration captureConfiguration = this.configuration_;
                                    CaptureConfiguration.Builder builder = captureConfiguration != null ? captureConfiguration.toBuilder() : null;
                                    CaptureConfiguration captureConfiguration2 = (CaptureConfiguration) codedInputStream.readMessage(CaptureConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = captureConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((CaptureConfiguration.Builder) captureConfiguration2);
                                        this.configuration_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.startTimestamp_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (VisionCaptureStarted.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
        public CaptureConfiguration getConfiguration() {
            CaptureConfiguration captureConfiguration = this.configuration_;
            return captureConfiguration == null ? CaptureConfiguration.getDefaultInstance() : captureConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.configuration_ != null ? CodedOutputStream.computeMessageSize(1, getConfiguration()) : 0;
            if (!this.startTimestamp_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getStartTimestamp());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
        public String getStartTimestamp() {
            return this.startTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
        public ByteString getStartTimestampBytes() {
            return ByteString.copyFromUtf8(this.startTimestamp_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(1, getConfiguration());
            }
            if (!this.startTimestamp_.isEmpty()) {
                codedOutputStream.writeString(2, getStartTimestamp());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionCaptureStarted, Builder> implements VisionCaptureStartedOrBuilder {
            private Builder() {
                super(VisionCaptureStarted.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearStartTimestamp() {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).clearStartTimestamp();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
            public CaptureConfiguration getConfiguration() {
                return ((VisionCaptureStarted) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
            public String getStartTimestamp() {
                return ((VisionCaptureStarted) this.instance).getStartTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
            public ByteString getStartTimestampBytes() {
                return ((VisionCaptureStarted) this.instance).getStartTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStartedOrBuilder
            public boolean hasConfiguration() {
                return ((VisionCaptureStarted) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).mergeConfiguration(captureConfiguration);
                return this;
            }

            public Builder setConfiguration(CaptureConfiguration captureConfiguration) {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).setConfiguration(captureConfiguration);
                return this;
            }

            public Builder setStartTimestamp(String str) {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).setStartTimestamp(str);
                return this;
            }

            public Builder setStartTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).setStartTimestampBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(CaptureConfiguration.Builder builder) {
                copyOnWrite();
                ((VisionCaptureStarted) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(VisionCaptureStarted visionCaptureStarted) {
            return DEFAULT_INSTANCE.createBuilder(visionCaptureStarted);
        }

        public static VisionCaptureStarted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureStarted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(CaptureConfiguration captureConfiguration) {
            captureConfiguration.getClass();
            this.configuration_ = captureConfiguration;
        }

        public static VisionCaptureStarted parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionCaptureStarted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionCaptureStarted parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionCaptureStarted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionCaptureStarted parseFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureStarted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureStarted parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionCaptureStarted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionFrameData extends GeneratedMessageLite<VisionFrameData, Builder> implements VisionFrameDataOrBuilder {
        public static final int CAPTURE_TIMESTAMP_FIELD_NUMBER = 4;
        private static final VisionFrameData DEFAULT_INSTANCE;
        public static final int DIALOG_ID_FIELD_NUMBER = 2;
        public static final int FRAME_ID_FIELD_NUMBER = 3;
        public static final int IMAGE_DATA_FIELD_NUMBER = 5;
        private static volatile Parser<VisionFrameData> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int dialogId_;
        private ImageData imageData_;
        private String sessionId_ = "";
        private String frameId_ = "";
        private String captureTimestamp_ = "";

        static {
            VisionFrameData visionFrameData = new VisionFrameData();
            DEFAULT_INSTANCE = visionFrameData;
            visionFrameData.makeImmutable();
        }

        private VisionFrameData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaptureTimestamp() {
            this.captureTimestamp_ = getDefaultInstance().getCaptureTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialogId() {
            this.dialogId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameId() {
            this.frameId_ = getDefaultInstance().getFrameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageData() {
            this.imageData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static VisionFrameData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageData(ImageData imageData) {
            ImageData imageData2 = this.imageData_;
            if (imageData2 == null || imageData2 == ImageData.getDefaultInstance()) {
                this.imageData_ = imageData;
            } else {
                this.imageData_ = ImageData.newBuilder(this.imageData_).mergeFrom((ImageData.Builder) imageData).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionFrameData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionFrameData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionFrameData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureTimestamp(String str) {
            str.getClass();
            this.captureTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptureTimestampBytes(ByteString byteString) {
            this.captureTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialogId(int i) {
            this.dialogId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameId(String str) {
            str.getClass();
            this.frameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameIdBytes(ByteString byteString) {
            this.frameId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageData(ImageData.Builder builder) {
            this.imageData_ = builder.build();
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
                    return new VisionFrameData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionFrameData visionFrameData = (VisionFrameData) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !visionFrameData.sessionId_.isEmpty(), visionFrameData.sessionId_);
                    int i = this.dialogId_;
                    boolean z = i != 0;
                    int i2 = visionFrameData.dialogId_;
                    this.dialogId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.frameId_ = visitor.visitString(!this.frameId_.isEmpty(), this.frameId_, !visionFrameData.frameId_.isEmpty(), visionFrameData.frameId_);
                    this.captureTimestamp_ = visitor.visitString(!this.captureTimestamp_.isEmpty(), this.captureTimestamp_, !visionFrameData.captureTimestamp_.isEmpty(), visionFrameData.captureTimestamp_);
                    this.imageData_ = (ImageData) visitor.visitMessage(this.imageData_, visionFrameData.imageData_);
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
                                    this.dialogId_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    this.frameId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.captureTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 42) {
                                    ImageData imageData = this.imageData_;
                                    ImageData.Builder builder = imageData != null ? imageData.toBuilder() : null;
                                    ImageData imageData2 = (ImageData) codedInputStream.readMessage(ImageData.parser(), extensionRegistryLite);
                                    this.imageData_ = imageData2;
                                    if (builder != null) {
                                        builder.mergeFrom((ImageData.Builder) imageData2);
                                        this.imageData_ = builder.buildPartial();
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
                        synchronized (VisionFrameData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public String getCaptureTimestamp() {
            return this.captureTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public ByteString getCaptureTimestampBytes() {
            return ByteString.copyFromUtf8(this.captureTimestamp_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public int getDialogId() {
            return this.dialogId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public String getFrameId() {
            return this.frameId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public ByteString getFrameIdBytes() {
            return ByteString.copyFromUtf8(this.frameId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public ImageData getImageData() {
            ImageData imageData = this.imageData_;
            return imageData == null ? ImageData.getDefaultInstance() : imageData;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            int i2 = this.dialogId_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            if (!this.frameId_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getFrameId());
            }
            if (!this.captureTimestamp_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(4, getCaptureTimestamp());
            }
            if (this.imageData_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, getImageData());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
        public boolean hasImageData() {
            return this.imageData_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            int i = this.dialogId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            if (!this.frameId_.isEmpty()) {
                codedOutputStream.writeString(3, getFrameId());
            }
            if (!this.captureTimestamp_.isEmpty()) {
                codedOutputStream.writeString(4, getCaptureTimestamp());
            }
            if (this.imageData_ != null) {
                codedOutputStream.writeMessage(5, getImageData());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionFrameData, Builder> implements VisionFrameDataOrBuilder {
            private Builder() {
                super(VisionFrameData.DEFAULT_INSTANCE);
            }

            public Builder clearCaptureTimestamp() {
                copyOnWrite();
                ((VisionFrameData) this.instance).clearCaptureTimestamp();
                return this;
            }

            public Builder clearDialogId() {
                copyOnWrite();
                ((VisionFrameData) this.instance).clearDialogId();
                return this;
            }

            public Builder clearFrameId() {
                copyOnWrite();
                ((VisionFrameData) this.instance).clearFrameId();
                return this;
            }

            public Builder clearImageData() {
                copyOnWrite();
                ((VisionFrameData) this.instance).clearImageData();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((VisionFrameData) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public String getCaptureTimestamp() {
                return ((VisionFrameData) this.instance).getCaptureTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public ByteString getCaptureTimestampBytes() {
                return ((VisionFrameData) this.instance).getCaptureTimestampBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public int getDialogId() {
                return ((VisionFrameData) this.instance).getDialogId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public String getFrameId() {
                return ((VisionFrameData) this.instance).getFrameId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public ByteString getFrameIdBytes() {
                return ((VisionFrameData) this.instance).getFrameIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public ImageData getImageData() {
                return ((VisionFrameData) this.instance).getImageData();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public String getSessionId() {
                return ((VisionFrameData) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public ByteString getSessionIdBytes() {
                return ((VisionFrameData) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameDataOrBuilder
            public boolean hasImageData() {
                return ((VisionFrameData) this.instance).hasImageData();
            }

            public Builder mergeImageData(ImageData imageData) {
                copyOnWrite();
                ((VisionFrameData) this.instance).mergeImageData(imageData);
                return this;
            }

            public Builder setCaptureTimestamp(String str) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setCaptureTimestamp(str);
                return this;
            }

            public Builder setCaptureTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setCaptureTimestampBytes(byteString);
                return this;
            }

            public Builder setDialogId(int i) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setDialogId(i);
                return this;
            }

            public Builder setFrameId(String str) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setFrameId(str);
                return this;
            }

            public Builder setFrameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setFrameIdBytes(byteString);
                return this;
            }

            public Builder setImageData(ImageData imageData) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setImageData(imageData);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setImageData(ImageData.Builder builder) {
                copyOnWrite();
                ((VisionFrameData) this.instance).setImageData(builder);
                return this;
            }
        }

        public static Builder newBuilder(VisionFrameData visionFrameData) {
            return DEFAULT_INSTANCE.createBuilder(visionFrameData);
        }

        public static VisionFrameData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionFrameData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageData(ImageData imageData) {
            imageData.getClass();
            this.imageData_ = imageData;
        }

        public static VisionFrameData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionFrameData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionFrameData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionFrameData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionFrameData parseFrom(InputStream inputStream) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionFrameData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionFrameData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionFrameData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionFrameMetadata extends GeneratedMessageLite<VisionFrameMetadata, Builder> implements VisionFrameMetadataOrBuilder {
        private static final VisionFrameMetadata DEFAULT_INSTANCE;
        public static final int ENRICHMENTS_FIELD_NUMBER = 4;
        public static final int FRAME_ID_FIELD_NUMBER = 2;
        private static volatile Parser<VisionFrameMetadata> PARSER = null;
        public static final int SEQUENCE_FIELD_NUMBER = 5;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SUBFRAMES_FIELD_NUMBER = 3;
        private int bitField0_;
        private int sequence_;
        private String sessionId_ = "";
        private String frameId_ = "";
        private Internal.ProtobufList<SubframeData> subframes_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnrichmentData> enrichments_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VisionFrameMetadata visionFrameMetadata = new VisionFrameMetadata();
            DEFAULT_INSTANCE = visionFrameMetadata;
            visionFrameMetadata.makeImmutable();
        }

        private VisionFrameMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnrichments(Iterable<? extends EnrichmentData> iterable) {
            ensureEnrichmentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.enrichments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSubframes(Iterable<? extends SubframeData> iterable) {
            ensureSubframesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.subframes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichments(EnrichmentData.Builder builder) {
            ensureEnrichmentsIsMutable();
            this.enrichments_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubframes(SubframeData.Builder builder) {
            ensureSubframesIsMutable();
            this.subframes_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnrichments() {
            this.enrichments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameId() {
            this.frameId_ = getDefaultInstance().getFrameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubframes() {
            this.subframes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureEnrichmentsIsMutable() {
            if (this.enrichments_.isModifiable()) {
                return;
            }
            this.enrichments_ = GeneratedMessageLite.mutableCopy(this.enrichments_);
        }

        private void ensureSubframesIsMutable() {
            if (this.subframes_.isModifiable()) {
                return;
            }
            this.subframes_ = GeneratedMessageLite.mutableCopy(this.subframes_);
        }

        public static VisionFrameMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionFrameMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionFrameMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionFrameMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnrichments(int i) {
            ensureEnrichmentsIsMutable();
            this.enrichments_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSubframes(int i) {
            ensureSubframesIsMutable();
            this.subframes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnrichments(int i, EnrichmentData.Builder builder) {
            ensureEnrichmentsIsMutable();
            this.enrichments_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameId(String str) {
            str.getClass();
            this.frameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameIdBytes(ByteString byteString) {
            this.frameId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequence(FrameSequence frameSequence) {
            frameSequence.getClass();
            this.sequence_ = frameSequence.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequenceValue(int i) {
            this.sequence_ = i;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubframes(int i, SubframeData.Builder builder) {
            ensureSubframesIsMutable();
            this.subframes_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisionFrameMetadata();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.subframes_.makeImmutable();
                    this.enrichments_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionFrameMetadata visionFrameMetadata = (VisionFrameMetadata) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !visionFrameMetadata.sessionId_.isEmpty(), visionFrameMetadata.sessionId_);
                    this.frameId_ = visitor.visitString(!this.frameId_.isEmpty(), this.frameId_, !visionFrameMetadata.frameId_.isEmpty(), visionFrameMetadata.frameId_);
                    this.subframes_ = visitor.visitList(this.subframes_, visionFrameMetadata.subframes_);
                    this.enrichments_ = visitor.visitList(this.enrichments_, visionFrameMetadata.enrichments_);
                    int i = this.sequence_;
                    boolean z = i != 0;
                    int i2 = visionFrameMetadata.sequence_;
                    this.sequence_ = visitor.visitInt(z, i, i2 != 0, i2);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= visionFrameMetadata.bitField0_;
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.frameId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!this.subframes_.isModifiable()) {
                                        this.subframes_ = GeneratedMessageLite.mutableCopy(this.subframes_);
                                    }
                                    this.subframes_.add((SubframeData) codedInputStream.readMessage(SubframeData.parser(), extensionRegistryLite));
                                } else if (readTag == 34) {
                                    if (!this.enrichments_.isModifiable()) {
                                        this.enrichments_ = GeneratedMessageLite.mutableCopy(this.enrichments_);
                                    }
                                    this.enrichments_.add((EnrichmentData) codedInputStream.readMessage(EnrichmentData.parser(), extensionRegistryLite));
                                } else if (readTag == 40) {
                                    this.sequence_ = codedInputStream.readEnum();
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
                        synchronized (VisionFrameMetadata.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public EnrichmentData getEnrichments(int i) {
            return this.enrichments_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public int getEnrichmentsCount() {
            return this.enrichments_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public List<EnrichmentData> getEnrichmentsList() {
            return this.enrichments_;
        }

        public EnrichmentDataOrBuilder getEnrichmentsOrBuilder(int i) {
            return this.enrichments_.get(i);
        }

        public List<? extends EnrichmentDataOrBuilder> getEnrichmentsOrBuilderList() {
            return this.enrichments_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public String getFrameId() {
            return this.frameId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public ByteString getFrameIdBytes() {
            return ByteString.copyFromUtf8(this.frameId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public FrameSequence getSequence() {
            FrameSequence forNumber = FrameSequence.forNumber(this.sequence_);
            return forNumber == null ? FrameSequence.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public int getSequenceValue() {
            return this.sequence_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (!this.frameId_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getFrameId());
            }
            for (int i2 = 0; i2 < this.subframes_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, this.subframes_.get(i2));
            }
            for (int i3 = 0; i3 < this.enrichments_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, this.enrichments_.get(i3));
            }
            if (this.sequence_ != FrameSequence.FRAME_SEQUENCE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(5, this.sequence_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public SubframeData getSubframes(int i) {
            return this.subframes_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public int getSubframesCount() {
            return this.subframes_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
        public List<SubframeData> getSubframesList() {
            return this.subframes_;
        }

        public SubframeDataOrBuilder getSubframesOrBuilder(int i) {
            return this.subframes_.get(i);
        }

        public List<? extends SubframeDataOrBuilder> getSubframesOrBuilderList() {
            return this.subframes_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (!this.frameId_.isEmpty()) {
                codedOutputStream.writeString(2, getFrameId());
            }
            for (int i = 0; i < this.subframes_.size(); i++) {
                codedOutputStream.writeMessage(3, this.subframes_.get(i));
            }
            for (int i2 = 0; i2 < this.enrichments_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.enrichments_.get(i2));
            }
            if (this.sequence_ != FrameSequence.FRAME_SEQUENCE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(5, this.sequence_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionFrameMetadata, Builder> implements VisionFrameMetadataOrBuilder {
            private Builder() {
                super(VisionFrameMetadata.DEFAULT_INSTANCE);
            }

            public Builder addAllEnrichments(Iterable<? extends EnrichmentData> iterable) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addAllEnrichments(iterable);
                return this;
            }

            public Builder addAllSubframes(Iterable<? extends SubframeData> iterable) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addAllSubframes(iterable);
                return this;
            }

            public Builder addEnrichments(EnrichmentData enrichmentData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addEnrichments(enrichmentData);
                return this;
            }

            public Builder addSubframes(SubframeData subframeData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addSubframes(subframeData);
                return this;
            }

            public Builder clearEnrichments() {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).clearEnrichments();
                return this;
            }

            public Builder clearFrameId() {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).clearFrameId();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).clearSequence();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).clearSessionId();
                return this;
            }

            public Builder clearSubframes() {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).clearSubframes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public EnrichmentData getEnrichments(int i) {
                return ((VisionFrameMetadata) this.instance).getEnrichments(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public int getEnrichmentsCount() {
                return ((VisionFrameMetadata) this.instance).getEnrichmentsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public List<EnrichmentData> getEnrichmentsList() {
                return Collections.unmodifiableList(((VisionFrameMetadata) this.instance).getEnrichmentsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public String getFrameId() {
                return ((VisionFrameMetadata) this.instance).getFrameId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public ByteString getFrameIdBytes() {
                return ((VisionFrameMetadata) this.instance).getFrameIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public FrameSequence getSequence() {
                return ((VisionFrameMetadata) this.instance).getSequence();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public int getSequenceValue() {
                return ((VisionFrameMetadata) this.instance).getSequenceValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public String getSessionId() {
                return ((VisionFrameMetadata) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public ByteString getSessionIdBytes() {
                return ((VisionFrameMetadata) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public SubframeData getSubframes(int i) {
                return ((VisionFrameMetadata) this.instance).getSubframes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public int getSubframesCount() {
                return ((VisionFrameMetadata) this.instance).getSubframesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionFrameMetadataOrBuilder
            public List<SubframeData> getSubframesList() {
                return Collections.unmodifiableList(((VisionFrameMetadata) this.instance).getSubframesList());
            }

            public Builder removeEnrichments(int i) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).removeEnrichments(i);
                return this;
            }

            public Builder removeSubframes(int i) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).removeSubframes(i);
                return this;
            }

            public Builder setEnrichments(int i, EnrichmentData enrichmentData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setEnrichments(i, enrichmentData);
                return this;
            }

            public Builder setFrameId(String str) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setFrameId(str);
                return this;
            }

            public Builder setFrameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setFrameIdBytes(byteString);
                return this;
            }

            public Builder setSequence(FrameSequence frameSequence) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSequence(frameSequence);
                return this;
            }

            public Builder setSequenceValue(int i) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSequenceValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setSubframes(int i, SubframeData subframeData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSubframes(i, subframeData);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addEnrichments(int i, EnrichmentData enrichmentData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addEnrichments(i, enrichmentData);
                return this;
            }

            public Builder addSubframes(int i, SubframeData subframeData) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addSubframes(i, subframeData);
                return this;
            }

            public Builder setEnrichments(int i, EnrichmentData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setEnrichments(i, builder);
                return this;
            }

            public Builder setSubframes(int i, SubframeData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).setSubframes(i, builder);
                return this;
            }

            public Builder addEnrichments(EnrichmentData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addEnrichments(builder);
                return this;
            }

            public Builder addSubframes(SubframeData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addSubframes(builder);
                return this;
            }

            public Builder addEnrichments(int i, EnrichmentData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addEnrichments(i, builder);
                return this;
            }

            public Builder addSubframes(int i, SubframeData.Builder builder) {
                copyOnWrite();
                ((VisionFrameMetadata) this.instance).addSubframes(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(VisionFrameMetadata visionFrameMetadata) {
            return DEFAULT_INSTANCE.createBuilder(visionFrameMetadata);
        }

        public static VisionFrameMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionFrameMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisionFrameMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionFrameMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionFrameMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionFrameMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionFrameMetadata parseFrom(InputStream inputStream) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichments(int i, EnrichmentData enrichmentData) {
            enrichmentData.getClass();
            ensureEnrichmentsIsMutable();
            this.enrichments_.add(i, enrichmentData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubframes(int i, SubframeData subframeData) {
            subframeData.getClass();
            ensureSubframesIsMutable();
            this.subframes_.add(i, subframeData);
        }

        public static VisionFrameMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnrichments(int i, EnrichmentData enrichmentData) {
            enrichmentData.getClass();
            ensureEnrichmentsIsMutable();
            this.enrichments_.set(i, enrichmentData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubframes(int i, SubframeData subframeData) {
            subframeData.getClass();
            ensureSubframesIsMutable();
            this.subframes_.set(i, subframeData);
        }

        public static VisionFrameMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionFrameMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionFrameMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichments(EnrichmentData enrichmentData) {
            enrichmentData.getClass();
            ensureEnrichmentsIsMutable();
            this.enrichments_.add(enrichmentData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubframes(SubframeData subframeData) {
            subframeData.getClass();
            ensureSubframesIsMutable();
            this.subframes_.add(subframeData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnrichments(int i, EnrichmentData.Builder builder) {
            ensureEnrichmentsIsMutable();
            this.enrichments_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubframes(int i, SubframeData.Builder builder) {
            ensureSubframesIsMutable();
            this.subframes_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetVisionCaptureConfigurations extends GeneratedMessageLite<GetVisionCaptureConfigurations, Builder> implements GetVisionCaptureConfigurationsOrBuilder {
        public static final int CAMERA_ID_FIELD_NUMBER = 1;
        private static final GetVisionCaptureConfigurations DEFAULT_INSTANCE;
        private static volatile Parser<GetVisionCaptureConfigurations> PARSER;
        private int cameraId_;

        static {
            GetVisionCaptureConfigurations getVisionCaptureConfigurations = new GetVisionCaptureConfigurations();
            DEFAULT_INSTANCE = getVisionCaptureConfigurations;
            getVisionCaptureConfigurations.makeImmutable();
        }

        private GetVisionCaptureConfigurations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraId() {
            this.cameraId_ = 0;
        }

        public static GetVisionCaptureConfigurations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetVisionCaptureConfigurations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetVisionCaptureConfigurations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetVisionCaptureConfigurations> parser() {
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
                    return new GetVisionCaptureConfigurations();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetVisionCaptureConfigurations getVisionCaptureConfigurations = (GetVisionCaptureConfigurations) obj2;
                    int i = this.cameraId_;
                    boolean z = i != 0;
                    int i2 = getVisionCaptureConfigurations.cameraId_;
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
                        synchronized (GetVisionCaptureConfigurations.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsOrBuilder
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetVisionCaptureConfigurations, Builder> implements GetVisionCaptureConfigurationsOrBuilder {
            private Builder() {
                super(GetVisionCaptureConfigurations.DEFAULT_INSTANCE);
            }

            public Builder clearCameraId() {
                copyOnWrite();
                ((GetVisionCaptureConfigurations) this.instance).clearCameraId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.GetVisionCaptureConfigurationsOrBuilder
            public int getCameraId() {
                return ((GetVisionCaptureConfigurations) this.instance).getCameraId();
            }

            public Builder setCameraId(int i) {
                copyOnWrite();
                ((GetVisionCaptureConfigurations) this.instance).setCameraId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetVisionCaptureConfigurations getVisionCaptureConfigurations) {
            return DEFAULT_INSTANCE.createBuilder(getVisionCaptureConfigurations);
        }

        public static GetVisionCaptureConfigurations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetVisionCaptureConfigurations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetVisionCaptureConfigurations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurations parseFrom(InputStream inputStream) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetVisionCaptureConfigurations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetVisionCaptureConfigurations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetVisionCaptureConfigurations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetVisionCaptureConfigurations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyFrame extends GeneratedMessageLite<NotifyFrame, Builder> implements NotifyFrameOrBuilder {
        private static final NotifyFrame DEFAULT_INSTANCE;
        public static final int FRAME_ID_FIELD_NUMBER = 3;
        public static final int FRAME_TYPE_FIELD_NUMBER = 1;
        private static volatile Parser<NotifyFrame> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        public static final int SIZE_IN_BYTES_FIELD_NUMBER = 4;
        private int frameType_;
        private int sizeInBytes_;
        private String sessionId_ = "";
        private String frameId_ = "";

        static {
            NotifyFrame notifyFrame = new NotifyFrame();
            DEFAULT_INSTANCE = notifyFrame;
            notifyFrame.makeImmutable();
        }

        private NotifyFrame() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameId() {
            this.frameId_ = getDefaultInstance().getFrameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameType() {
            this.frameType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSizeInBytes() {
            this.sizeInBytes_ = 0;
        }

        public static NotifyFrame getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyFrame> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameId(String str) {
            str.getClass();
            this.frameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameIdBytes(ByteString byteString) {
            this.frameId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameType(FrameType frameType) {
            frameType.getClass();
            this.frameType_ = frameType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameTypeValue(int i) {
            this.frameType_ = i;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setSizeInBytes(int i) {
            this.sizeInBytes_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyFrame();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyFrame notifyFrame = (NotifyFrame) obj2;
                    int i = this.frameType_;
                    boolean z = i != 0;
                    int i2 = notifyFrame.frameType_;
                    this.frameType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyFrame.sessionId_.isEmpty(), notifyFrame.sessionId_);
                    this.frameId_ = visitor.visitString(!this.frameId_.isEmpty(), this.frameId_, !notifyFrame.frameId_.isEmpty(), notifyFrame.frameId_);
                    int i3 = this.sizeInBytes_;
                    boolean z2 = i3 != 0;
                    int i4 = notifyFrame.sizeInBytes_;
                    this.sizeInBytes_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.frameType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.frameId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 32) {
                                    this.sizeInBytes_ = codedInputStream.readUInt32();
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
                        synchronized (NotifyFrame.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public String getFrameId() {
            return this.frameId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public ByteString getFrameIdBytes() {
            return ByteString.copyFromUtf8(this.frameId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public FrameType getFrameType() {
            FrameType forNumber = FrameType.forNumber(this.frameType_);
            return forNumber == null ? FrameType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public int getFrameTypeValue() {
            return this.frameType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.frameType_ != FrameType.FRAME_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.frameType_) : 0;
            if (!this.sessionId_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getSessionId());
            }
            if (!this.frameId_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(3, getFrameId());
            }
            int i2 = this.sizeInBytes_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(4, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
        public int getSizeInBytes() {
            return this.sizeInBytes_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.frameType_ != FrameType.FRAME_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.frameType_);
            }
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(2, getSessionId());
            }
            if (!this.frameId_.isEmpty()) {
                codedOutputStream.writeString(3, getFrameId());
            }
            int i = this.sizeInBytes_;
            if (i != 0) {
                codedOutputStream.writeUInt32(4, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyFrame, Builder> implements NotifyFrameOrBuilder {
            private Builder() {
                super(NotifyFrame.DEFAULT_INSTANCE);
            }

            public Builder clearFrameId() {
                copyOnWrite();
                ((NotifyFrame) this.instance).clearFrameId();
                return this;
            }

            public Builder clearFrameType() {
                copyOnWrite();
                ((NotifyFrame) this.instance).clearFrameType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyFrame) this.instance).clearSessionId();
                return this;
            }

            public Builder clearSizeInBytes() {
                copyOnWrite();
                ((NotifyFrame) this.instance).clearSizeInBytes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public String getFrameId() {
                return ((NotifyFrame) this.instance).getFrameId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public ByteString getFrameIdBytes() {
                return ((NotifyFrame) this.instance).getFrameIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public FrameType getFrameType() {
                return ((NotifyFrame) this.instance).getFrameType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public int getFrameTypeValue() {
                return ((NotifyFrame) this.instance).getFrameTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public String getSessionId() {
                return ((NotifyFrame) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyFrame) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyFrameOrBuilder
            public int getSizeInBytes() {
                return ((NotifyFrame) this.instance).getSizeInBytes();
            }

            public Builder setFrameId(String str) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setFrameId(str);
                return this;
            }

            public Builder setFrameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setFrameIdBytes(byteString);
                return this;
            }

            public Builder setFrameType(FrameType frameType) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setFrameType(frameType);
                return this;
            }

            public Builder setFrameTypeValue(int i) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setFrameTypeValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setSizeInBytes(int i) {
                copyOnWrite();
                ((NotifyFrame) this.instance).setSizeInBytes(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyFrame notifyFrame) {
            return DEFAULT_INSTANCE.createBuilder(notifyFrame);
        }

        public static NotifyFrame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyFrame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyFrame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyFrame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyFrame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyFrame parseFrom(InputStream inputStream) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyFrame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyFrame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyVisionCapturePaused extends GeneratedMessageLite<NotifyVisionCapturePaused, Builder> implements NotifyVisionCapturePausedOrBuilder {
        private static final NotifyVisionCapturePaused DEFAULT_INSTANCE;
        private static volatile Parser<NotifyVisionCapturePaused> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int TIMEOUT_IN_MILLIS_FIELD_NUMBER = 2;
        private String sessionId_ = "";
        private int timeoutInMillis_;

        static {
            NotifyVisionCapturePaused notifyVisionCapturePaused = new NotifyVisionCapturePaused();
            DEFAULT_INSTANCE = notifyVisionCapturePaused;
            notifyVisionCapturePaused.makeImmutable();
        }

        private NotifyVisionCapturePaused() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutInMillis() {
            this.timeoutInMillis_ = 0;
        }

        public static NotifyVisionCapturePaused getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyVisionCapturePaused parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCapturePaused parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyVisionCapturePaused> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutInMillis(int i) {
            this.timeoutInMillis_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyVisionCapturePaused();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyVisionCapturePaused notifyVisionCapturePaused = (NotifyVisionCapturePaused) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !notifyVisionCapturePaused.sessionId_.isEmpty(), notifyVisionCapturePaused.sessionId_);
                    int i = this.timeoutInMillis_;
                    boolean z = i != 0;
                    int i2 = notifyVisionCapturePaused.timeoutInMillis_;
                    this.timeoutInMillis_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.timeoutInMillis_ = codedInputStream.readUInt32();
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
                        synchronized (NotifyVisionCapturePaused.class) {
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
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            int i2 = this.timeoutInMillis_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
        public int getTimeoutInMillis() {
            return this.timeoutInMillis_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            int i = this.timeoutInMillis_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyVisionCapturePaused, Builder> implements NotifyVisionCapturePausedOrBuilder {
            private Builder() {
                super(NotifyVisionCapturePaused.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((NotifyVisionCapturePaused) this.instance).clearSessionId();
                return this;
            }

            public Builder clearTimeoutInMillis() {
                copyOnWrite();
                ((NotifyVisionCapturePaused) this.instance).clearTimeoutInMillis();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
            public String getSessionId() {
                return ((NotifyVisionCapturePaused) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
            public ByteString getSessionIdBytes() {
                return ((NotifyVisionCapturePaused) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.NotifyVisionCapturePausedOrBuilder
            public int getTimeoutInMillis() {
                return ((NotifyVisionCapturePaused) this.instance).getTimeoutInMillis();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((NotifyVisionCapturePaused) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyVisionCapturePaused) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setTimeoutInMillis(int i) {
                copyOnWrite();
                ((NotifyVisionCapturePaused) this.instance).setTimeoutInMillis(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyVisionCapturePaused notifyVisionCapturePaused) {
            return DEFAULT_INSTANCE.createBuilder(notifyVisionCapturePaused);
        }

        public static NotifyVisionCapturePaused parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCapturePaused parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyVisionCapturePaused parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyVisionCapturePaused parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyVisionCapturePaused parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyVisionCapturePaused parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyVisionCapturePaused parseFrom(InputStream inputStream) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyVisionCapturePaused parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyVisionCapturePaused parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyVisionCapturePaused parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyVisionCapturePaused) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PauseVisionCapture extends GeneratedMessageLite<PauseVisionCapture, Builder> implements PauseVisionCaptureOrBuilder {
        private static final PauseVisionCapture DEFAULT_INSTANCE;
        private static volatile Parser<PauseVisionCapture> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int TIMEOUT_IN_MILLIS_FIELD_NUMBER = 2;
        private String sessionId_ = "";
        private int timeoutInMillis_;

        static {
            PauseVisionCapture pauseVisionCapture = new PauseVisionCapture();
            DEFAULT_INSTANCE = pauseVisionCapture;
            pauseVisionCapture.makeImmutable();
        }

        private PauseVisionCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutInMillis() {
            this.timeoutInMillis_ = 0;
        }

        public static PauseVisionCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PauseVisionCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseVisionCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PauseVisionCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutInMillis(int i) {
            this.timeoutInMillis_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PauseVisionCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    PauseVisionCapture pauseVisionCapture = (PauseVisionCapture) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !pauseVisionCapture.sessionId_.isEmpty(), pauseVisionCapture.sessionId_);
                    int i = this.timeoutInMillis_;
                    boolean z = i != 0;
                    int i2 = pauseVisionCapture.timeoutInMillis_;
                    this.timeoutInMillis_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.timeoutInMillis_ = codedInputStream.readUInt32();
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
                        synchronized (PauseVisionCapture.class) {
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
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            int i2 = this.timeoutInMillis_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
        public int getTimeoutInMillis() {
            return this.timeoutInMillis_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            int i = this.timeoutInMillis_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<PauseVisionCapture, Builder> implements PauseVisionCaptureOrBuilder {
            private Builder() {
                super(PauseVisionCapture.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((PauseVisionCapture) this.instance).clearSessionId();
                return this;
            }

            public Builder clearTimeoutInMillis() {
                copyOnWrite();
                ((PauseVisionCapture) this.instance).clearTimeoutInMillis();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
            public String getSessionId() {
                return ((PauseVisionCapture) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
            public ByteString getSessionIdBytes() {
                return ((PauseVisionCapture) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PauseVisionCaptureOrBuilder
            public int getTimeoutInMillis() {
                return ((PauseVisionCapture) this.instance).getTimeoutInMillis();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((PauseVisionCapture) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PauseVisionCapture) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setTimeoutInMillis(int i) {
                copyOnWrite();
                ((PauseVisionCapture) this.instance).setTimeoutInMillis(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(PauseVisionCapture pauseVisionCapture) {
            return DEFAULT_INSTANCE.createBuilder(pauseVisionCapture);
        }

        public static PauseVisionCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseVisionCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PauseVisionCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PauseVisionCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PauseVisionCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PauseVisionCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PauseVisionCapture parseFrom(InputStream inputStream) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseVisionCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseVisionCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PauseVisionCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Point extends GeneratedMessageLite<Point, Builder> implements PointOrBuilder {
        private static final Point DEFAULT_INSTANCE;
        private static volatile Parser<Point> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private float x_;
        private float y_;

        static {
            Point point = new Point();
            DEFAULT_INSTANCE = point;
            point.makeImmutable();
        }

        private Point() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX() {
            this.x_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY() {
            this.y_ = 0.0f;
        }

        public static Point getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Point parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Point) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Point parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Point> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX(float f) {
            this.x_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY(float f) {
            this.y_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Point();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Point point = (Point) obj2;
                    float f = this.x_;
                    boolean z = f != 0.0f;
                    float f2 = point.x_;
                    this.x_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    float f3 = this.y_;
                    boolean z2 = f3 != 0.0f;
                    float f4 = point.y_;
                    this.y_ = visitor.visitFloat(z2, f3, f4 != 0.0f, f4);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 13) {
                                    this.x_ = codedInputStream.readFloat();
                                } else if (readTag == 21) {
                                    this.y_ = codedInputStream.readFloat();
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
                        synchronized (Point.class) {
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
            float f = this.x_;
            int computeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
            float f2 = this.y_;
            if (f2 != 0.0f) {
                computeFloatSize += CodedOutputStream.computeFloatSize(2, f2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeFloatSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PointOrBuilder
        public float getX() {
            return this.x_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.PointOrBuilder
        public float getY() {
            return this.y_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.x_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            float f2 = this.y_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(2, f2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Point, Builder> implements PointOrBuilder {
            private Builder() {
                super(Point.DEFAULT_INSTANCE);
            }

            public Builder clearX() {
                copyOnWrite();
                ((Point) this.instance).clearX();
                return this;
            }

            public Builder clearY() {
                copyOnWrite();
                ((Point) this.instance).clearY();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PointOrBuilder
            public float getX() {
                return ((Point) this.instance).getX();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.PointOrBuilder
            public float getY() {
                return ((Point) this.instance).getY();
            }

            public Builder setX(float f) {
                copyOnWrite();
                ((Point) this.instance).setX(f);
                return this;
            }

            public Builder setY(float f) {
                copyOnWrite();
                ((Point) this.instance).setY(f);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Point point) {
            return DEFAULT_INSTANCE.createBuilder(point);
        }

        public static Point parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Point) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Point parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Point parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Point parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Point parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Point parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Point parseFrom(InputStream inputStream) throws IOException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Point parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Point parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Point parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SendVisionCaptureState extends GeneratedMessageLite<SendVisionCaptureState, Builder> implements SendVisionCaptureStateOrBuilder {
        private static final SendVisionCaptureState DEFAULT_INSTANCE;
        private static volatile Parser<SendVisionCaptureState> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int STATE_FIELD_NUMBER = 2;
        private String sessionId_ = "";
        private int state_;

        static {
            SendVisionCaptureState sendVisionCaptureState = new SendVisionCaptureState();
            DEFAULT_INSTANCE = sendVisionCaptureState;
            sendVisionCaptureState.makeImmutable();
        }

        private SendVisionCaptureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static SendVisionCaptureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendVisionCaptureState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendVisionCaptureState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendVisionCaptureState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(CaptureState captureState) {
            captureState.getClass();
            this.state_ = captureState.getNumber();
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
                    return new SendVisionCaptureState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SendVisionCaptureState sendVisionCaptureState = (SendVisionCaptureState) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !sendVisionCaptureState.sessionId_.isEmpty(), sendVisionCaptureState.sessionId_);
                    int i = this.state_;
                    boolean z = i != 0;
                    int i2 = sendVisionCaptureState.state_;
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
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
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
                        synchronized (SendVisionCaptureState.class) {
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
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.state_ != CaptureState.CAPTURE_STATE_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.state_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
        public CaptureState getState() {
            CaptureState forNumber = CaptureState.forNumber(this.state_);
            return forNumber == null ? CaptureState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.state_ != CaptureState.CAPTURE_STATE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.state_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SendVisionCaptureState, Builder> implements SendVisionCaptureStateOrBuilder {
            private Builder() {
                super(SendVisionCaptureState.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).clearSessionId();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
            public String getSessionId() {
                return ((SendVisionCaptureState) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
            public ByteString getSessionIdBytes() {
                return ((SendVisionCaptureState) this.instance).getSessionIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
            public CaptureState getState() {
                return ((SendVisionCaptureState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.SendVisionCaptureStateOrBuilder
            public int getStateValue() {
                return ((SendVisionCaptureState) this.instance).getStateValue();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setState(CaptureState captureState) {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).setState(captureState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((SendVisionCaptureState) this.instance).setStateValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SendVisionCaptureState sendVisionCaptureState) {
            return DEFAULT_INSTANCE.createBuilder(sendVisionCaptureState);
        }

        public static SendVisionCaptureState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendVisionCaptureState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendVisionCaptureState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendVisionCaptureState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendVisionCaptureState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendVisionCaptureState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendVisionCaptureState parseFrom(InputStream inputStream) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendVisionCaptureState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendVisionCaptureState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendVisionCaptureState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendVisionCaptureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopVisionCapture extends GeneratedMessageLite<StopVisionCapture, Builder> implements StopVisionCaptureOrBuilder {
        private static final StopVisionCapture DEFAULT_INSTANCE;
        private static volatile Parser<StopVisionCapture> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";

        static {
            StopVisionCapture stopVisionCapture = new StopVisionCapture();
            DEFAULT_INSTANCE = stopVisionCapture;
            stopVisionCapture.makeImmutable();
        }

        private StopVisionCapture() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static StopVisionCapture getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopVisionCapture parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVisionCapture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopVisionCapture> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
                    return new StopVisionCapture();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.sessionId_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.sessionId_.isEmpty(), this.sessionId_, !r6.sessionId_.isEmpty(), ((StopVisionCapture) obj2).sessionId_);
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
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (StopVisionCapture.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopVisionCapture, Builder> implements StopVisionCaptureOrBuilder {
            private Builder() {
                super(StopVisionCapture.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StopVisionCapture) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureOrBuilder
            public String getSessionId() {
                return ((StopVisionCapture) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.StopVisionCaptureOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StopVisionCapture) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StopVisionCapture) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StopVisionCapture) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StopVisionCapture stopVisionCapture) {
            return DEFAULT_INSTANCE.createBuilder(stopVisionCapture);
        }

        public static StopVisionCapture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVisionCapture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopVisionCapture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopVisionCapture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopVisionCapture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopVisionCapture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopVisionCapture parseFrom(InputStream inputStream) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopVisionCapture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopVisionCapture parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopVisionCapture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopVisionCapture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionCaptureFailure extends GeneratedMessageLite<VisionCaptureFailure, Builder> implements VisionCaptureFailureOrBuilder {
        private static final VisionCaptureFailure DEFAULT_INSTANCE;
        public static final int ERROR_DETAILS_FIELD_NUMBER = 2;
        public static final int FAILURE_REASON_FIELD_NUMBER = 1;
        public static final int FAILURE_TIMESTAMP_FIELD_NUMBER = 3;
        private static volatile Parser<VisionCaptureFailure> PARSER;
        private String failureReason_ = "";
        private String errorDetails_ = "";
        private String failureTimestamp_ = "";

        static {
            VisionCaptureFailure visionCaptureFailure = new VisionCaptureFailure();
            DEFAULT_INSTANCE = visionCaptureFailure;
            visionCaptureFailure.makeImmutable();
        }

        private VisionCaptureFailure() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorDetails() {
            this.errorDetails_ = getDefaultInstance().getErrorDetails();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailureReason() {
            this.failureReason_ = getDefaultInstance().getFailureReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailureTimestamp() {
            this.failureTimestamp_ = getDefaultInstance().getFailureTimestamp();
        }

        public static VisionCaptureFailure getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionCaptureFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionCaptureFailure> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorDetails(String str) {
            str.getClass();
            this.errorDetails_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorDetailsBytes(ByteString byteString) {
            this.errorDetails_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailureReason(String str) {
            str.getClass();
            this.failureReason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailureReasonBytes(ByteString byteString) {
            this.failureReason_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailureTimestamp(String str) {
            str.getClass();
            this.failureTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailureTimestampBytes(ByteString byteString) {
            this.failureTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisionCaptureFailure();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionCaptureFailure visionCaptureFailure = (VisionCaptureFailure) obj2;
                    this.failureReason_ = visitor.visitString(!this.failureReason_.isEmpty(), this.failureReason_, !visionCaptureFailure.failureReason_.isEmpty(), visionCaptureFailure.failureReason_);
                    this.errorDetails_ = visitor.visitString(!this.errorDetails_.isEmpty(), this.errorDetails_, !visionCaptureFailure.errorDetails_.isEmpty(), visionCaptureFailure.errorDetails_);
                    this.failureTimestamp_ = visitor.visitString(!this.failureTimestamp_.isEmpty(), this.failureTimestamp_, !visionCaptureFailure.failureTimestamp_.isEmpty(), visionCaptureFailure.failureTimestamp_);
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
                                    this.failureReason_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.errorDetails_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.failureTimestamp_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (VisionCaptureFailure.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public String getErrorDetails() {
            return this.errorDetails_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public ByteString getErrorDetailsBytes() {
            return ByteString.copyFromUtf8(this.errorDetails_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public String getFailureReason() {
            return this.failureReason_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public ByteString getFailureReasonBytes() {
            return ByteString.copyFromUtf8(this.failureReason_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public String getFailureTimestamp() {
            return this.failureTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
        public ByteString getFailureTimestampBytes() {
            return ByteString.copyFromUtf8(this.failureTimestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.failureReason_.isEmpty() ? CodedOutputStream.computeStringSize(1, getFailureReason()) : 0;
            if (!this.errorDetails_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getErrorDetails());
            }
            if (!this.failureTimestamp_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getFailureTimestamp());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.failureReason_.isEmpty()) {
                codedOutputStream.writeString(1, getFailureReason());
            }
            if (!this.errorDetails_.isEmpty()) {
                codedOutputStream.writeString(2, getErrorDetails());
            }
            if (!this.failureTimestamp_.isEmpty()) {
                codedOutputStream.writeString(3, getFailureTimestamp());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionCaptureFailure, Builder> implements VisionCaptureFailureOrBuilder {
            private Builder() {
                super(VisionCaptureFailure.DEFAULT_INSTANCE);
            }

            public Builder clearErrorDetails() {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).clearErrorDetails();
                return this;
            }

            public Builder clearFailureReason() {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).clearFailureReason();
                return this;
            }

            public Builder clearFailureTimestamp() {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).clearFailureTimestamp();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public String getErrorDetails() {
                return ((VisionCaptureFailure) this.instance).getErrorDetails();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public ByteString getErrorDetailsBytes() {
                return ((VisionCaptureFailure) this.instance).getErrorDetailsBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public String getFailureReason() {
                return ((VisionCaptureFailure) this.instance).getFailureReason();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public ByteString getFailureReasonBytes() {
                return ((VisionCaptureFailure) this.instance).getFailureReasonBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public String getFailureTimestamp() {
                return ((VisionCaptureFailure) this.instance).getFailureTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureFailureOrBuilder
            public ByteString getFailureTimestampBytes() {
                return ((VisionCaptureFailure) this.instance).getFailureTimestampBytes();
            }

            public Builder setErrorDetails(String str) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setErrorDetails(str);
                return this;
            }

            public Builder setErrorDetailsBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setErrorDetailsBytes(byteString);
                return this;
            }

            public Builder setFailureReason(String str) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setFailureReason(str);
                return this;
            }

            public Builder setFailureReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setFailureReasonBytes(byteString);
                return this;
            }

            public Builder setFailureTimestamp(String str) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setFailureTimestamp(str);
                return this;
            }

            public Builder setFailureTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureFailure) this.instance).setFailureTimestampBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VisionCaptureFailure visionCaptureFailure) {
            return DEFAULT_INSTANCE.createBuilder(visionCaptureFailure);
        }

        public static VisionCaptureFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisionCaptureFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionCaptureFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionCaptureFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionCaptureFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionCaptureFailure parseFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionCaptureFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisionCaptureStopped extends GeneratedMessageLite<VisionCaptureStopped, Builder> implements VisionCaptureStoppedOrBuilder {
        private static final VisionCaptureStopped DEFAULT_INSTANCE;
        private static volatile Parser<VisionCaptureStopped> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int STOP_TIMESTAMP_FIELD_NUMBER = 1;
        private int reason_;
        private String stopTimestamp_ = "";

        static {
            VisionCaptureStopped visionCaptureStopped = new VisionCaptureStopped();
            DEFAULT_INSTANCE = visionCaptureStopped;
            visionCaptureStopped.makeImmutable();
        }

        private VisionCaptureStopped() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopTimestamp() {
            this.stopTimestamp_ = getDefaultInstance().getStopTimestamp();
        }

        public static VisionCaptureStopped getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VisionCaptureStopped parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureStopped parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VisionCaptureStopped> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(StopReason stopReason) {
            stopReason.getClass();
            this.reason_ = stopReason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonValue(int i) {
            this.reason_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopTimestamp(String str) {
            str.getClass();
            this.stopTimestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopTimestampBytes(ByteString byteString) {
            this.stopTimestamp_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VisionCaptureStopped();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VisionCaptureStopped visionCaptureStopped = (VisionCaptureStopped) obj2;
                    this.stopTimestamp_ = visitor.visitString(!this.stopTimestamp_.isEmpty(), this.stopTimestamp_, !visionCaptureStopped.stopTimestamp_.isEmpty(), visionCaptureStopped.stopTimestamp_);
                    int i = this.reason_;
                    boolean z = i != 0;
                    int i2 = visionCaptureStopped.reason_;
                    this.reason_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.stopTimestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.reason_ = codedInputStream.readEnum();
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
                        synchronized (VisionCaptureStopped.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
        public StopReason getReason() {
            StopReason forNumber = StopReason.forNumber(this.reason_);
            return forNumber == null ? StopReason.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
        public int getReasonValue() {
            return this.reason_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.stopTimestamp_.isEmpty() ? CodedOutputStream.computeStringSize(1, getStopTimestamp()) : 0;
            if (this.reason_ != StopReason.STOP_REASON_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.reason_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
        public String getStopTimestamp() {
            return this.stopTimestamp_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
        public ByteString getStopTimestampBytes() {
            return ByteString.copyFromUtf8(this.stopTimestamp_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.stopTimestamp_.isEmpty()) {
                codedOutputStream.writeString(1, getStopTimestamp());
            }
            if (this.reason_ != StopReason.STOP_REASON_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.reason_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VisionCaptureStopped, Builder> implements VisionCaptureStoppedOrBuilder {
            private Builder() {
                super(VisionCaptureStopped.DEFAULT_INSTANCE);
            }

            public Builder clearReason() {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).clearReason();
                return this;
            }

            public Builder clearStopTimestamp() {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).clearStopTimestamp();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
            public StopReason getReason() {
                return ((VisionCaptureStopped) this.instance).getReason();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
            public int getReasonValue() {
                return ((VisionCaptureStopped) this.instance).getReasonValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
            public String getStopTimestamp() {
                return ((VisionCaptureStopped) this.instance).getStopTimestamp();
            }

            @Override // com.amazon.alexa.accessory.protocol.Vision.VisionCaptureStoppedOrBuilder
            public ByteString getStopTimestampBytes() {
                return ((VisionCaptureStopped) this.instance).getStopTimestampBytes();
            }

            public Builder setReason(StopReason stopReason) {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).setReason(stopReason);
                return this;
            }

            public Builder setReasonValue(int i) {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).setReasonValue(i);
                return this;
            }

            public Builder setStopTimestamp(String str) {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).setStopTimestamp(str);
                return this;
            }

            public Builder setStopTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((VisionCaptureStopped) this.instance).setStopTimestampBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VisionCaptureStopped visionCaptureStopped) {
            return DEFAULT_INSTANCE.createBuilder(visionCaptureStopped);
        }

        public static VisionCaptureStopped parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureStopped parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VisionCaptureStopped parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisionCaptureStopped parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VisionCaptureStopped parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisionCaptureStopped parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VisionCaptureStopped parseFrom(InputStream inputStream) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisionCaptureStopped parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VisionCaptureStopped parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisionCaptureStopped parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VisionCaptureStopped) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CaptureMode implements Internal.EnumLite {
        CAPTURE_MODE_UNSPECIFIED(0),
        CAPTURE_MODE_DETAIL(1),
        CAPTURE_MODE_TEMPORAL(2),
        UNRECOGNIZED(-1);

        public static final int CAPTURE_MODE_DETAIL_VALUE = 1;
        public static final int CAPTURE_MODE_TEMPORAL_VALUE = 2;
        public static final int CAPTURE_MODE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<CaptureMode> internalValueMap = new Internal.EnumLiteMap<CaptureMode>() { // from class: com.amazon.alexa.accessory.protocol.Vision.CaptureMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CaptureMode findValueByNumber(int i) {
                return CaptureMode.forNumber(i);
            }
        };
        private final int value;

        CaptureMode(int i) {
            this.value = i;
        }

        public static CaptureMode forNumber(int i) {
            if (i == 0) {
                return CAPTURE_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return CAPTURE_MODE_DETAIL;
            }
            if (i != 2) {
                return null;
            }
            return CAPTURE_MODE_TEMPORAL;
        }

        public static Internal.EnumLiteMap<CaptureMode> internalGetValueMap() {
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
        public static CaptureMode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CaptureState implements Internal.EnumLite {
        CAPTURE_STATE_UNSPECIFIED(0),
        CAPTURE_STATE_IDLE(1),
        CAPTURE_STATE_STARTED(2),
        CAPTURE_STATE_FRAME_DATA_NOTIFIED(3),
        CAPTURE_STATE_FRAME_DATA_RECEIVED(4),
        CAPTURE_STATE_FRAME_METADATA_NOTIFIED(5),
        CAPTURE_STATE_FRAME_METADATA_RECEIVED(6),
        CAPTURE_STATE_PAUSED(7),
        CAPTURE_STATE_RESUMED(8),
        UNRECOGNIZED(-1);

        public static final int CAPTURE_STATE_FRAME_DATA_NOTIFIED_VALUE = 3;
        public static final int CAPTURE_STATE_FRAME_DATA_RECEIVED_VALUE = 4;
        public static final int CAPTURE_STATE_FRAME_METADATA_NOTIFIED_VALUE = 5;
        public static final int CAPTURE_STATE_FRAME_METADATA_RECEIVED_VALUE = 6;
        public static final int CAPTURE_STATE_IDLE_VALUE = 1;
        public static final int CAPTURE_STATE_PAUSED_VALUE = 7;
        public static final int CAPTURE_STATE_RESUMED_VALUE = 8;
        public static final int CAPTURE_STATE_STARTED_VALUE = 2;
        public static final int CAPTURE_STATE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<CaptureState> internalValueMap = new Internal.EnumLiteMap<CaptureState>() { // from class: com.amazon.alexa.accessory.protocol.Vision.CaptureState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CaptureState findValueByNumber(int i) {
                return CaptureState.forNumber(i);
            }
        };
        private final int value;

        CaptureState(int i) {
            this.value = i;
        }

        public static CaptureState forNumber(int i) {
            switch (i) {
                case 0:
                    return CAPTURE_STATE_UNSPECIFIED;
                case 1:
                    return CAPTURE_STATE_IDLE;
                case 2:
                    return CAPTURE_STATE_STARTED;
                case 3:
                    return CAPTURE_STATE_FRAME_DATA_NOTIFIED;
                case 4:
                    return CAPTURE_STATE_FRAME_DATA_RECEIVED;
                case 5:
                    return CAPTURE_STATE_FRAME_METADATA_NOTIFIED;
                case 6:
                    return CAPTURE_STATE_FRAME_METADATA_RECEIVED;
                case 7:
                    return CAPTURE_STATE_PAUSED;
                case 8:
                    return CAPTURE_STATE_RESUMED;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<CaptureState> internalGetValueMap() {
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
        public static CaptureState valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EnrichmentType implements Internal.EnumLite {
        ENRICHMENT_TYPE_UNSPECIFIED(0),
        ENRICHMENT_TYPE_OCR_TEXT_RECOGNITION(1),
        ENRICHMENT_TYPE_FACE_DETECTION(2),
        ENRICHMENT_TYPE_GESTURE_DETECTION(3),
        ENRICHMENT_TYPE_OPTICAL_CODE_DETECTION(4),
        UNRECOGNIZED(-1);

        public static final int ENRICHMENT_TYPE_FACE_DETECTION_VALUE = 2;
        public static final int ENRICHMENT_TYPE_GESTURE_DETECTION_VALUE = 3;
        public static final int ENRICHMENT_TYPE_OCR_TEXT_RECOGNITION_VALUE = 1;
        public static final int ENRICHMENT_TYPE_OPTICAL_CODE_DETECTION_VALUE = 4;
        public static final int ENRICHMENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<EnrichmentType> internalValueMap = new Internal.EnumLiteMap<EnrichmentType>() { // from class: com.amazon.alexa.accessory.protocol.Vision.EnrichmentType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public EnrichmentType findValueByNumber(int i) {
                return EnrichmentType.forNumber(i);
            }
        };
        private final int value;

        EnrichmentType(int i) {
            this.value = i;
        }

        public static EnrichmentType forNumber(int i) {
            if (i == 0) {
                return ENRICHMENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ENRICHMENT_TYPE_OCR_TEXT_RECOGNITION;
            }
            if (i == 2) {
                return ENRICHMENT_TYPE_FACE_DETECTION;
            }
            if (i == 3) {
                return ENRICHMENT_TYPE_GESTURE_DETECTION;
            }
            if (i != 4) {
                return null;
            }
            return ENRICHMENT_TYPE_OPTICAL_CODE_DETECTION;
        }

        public static Internal.EnumLiteMap<EnrichmentType> internalGetValueMap() {
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
        public static EnrichmentType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FrameSequence implements Internal.EnumLite {
        FRAME_SEQUENCE_UNSPECIFIED(0),
        FRAME_SEQUENCE_INTERMEDIATE(1),
        FRAME_SEQUENCE_LAST(2),
        UNRECOGNIZED(-1);

        public static final int FRAME_SEQUENCE_INTERMEDIATE_VALUE = 1;
        public static final int FRAME_SEQUENCE_LAST_VALUE = 2;
        public static final int FRAME_SEQUENCE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<FrameSequence> internalValueMap = new Internal.EnumLiteMap<FrameSequence>() { // from class: com.amazon.alexa.accessory.protocol.Vision.FrameSequence.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FrameSequence findValueByNumber(int i) {
                return FrameSequence.forNumber(i);
            }
        };
        private final int value;

        FrameSequence(int i) {
            this.value = i;
        }

        public static FrameSequence forNumber(int i) {
            if (i == 0) {
                return FRAME_SEQUENCE_UNSPECIFIED;
            }
            if (i == 1) {
                return FRAME_SEQUENCE_INTERMEDIATE;
            }
            if (i != 2) {
                return null;
            }
            return FRAME_SEQUENCE_LAST;
        }

        public static Internal.EnumLiteMap<FrameSequence> internalGetValueMap() {
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
        public static FrameSequence valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FrameType implements Internal.EnumLite {
        FRAME_TYPE_UNSPECIFIED(0),
        FRAME_TYPE_VISION_FRAME_DATA(1),
        FRAME_TYPE_VISION_FRAME_METADATA(2),
        FRAME_TYPE_IMAGE_THUMBNAIL(3),
        FRAME_TYPE_IMAGE_FULL(4),
        UNRECOGNIZED(-1);

        public static final int FRAME_TYPE_IMAGE_FULL_VALUE = 4;
        public static final int FRAME_TYPE_IMAGE_THUMBNAIL_VALUE = 3;
        public static final int FRAME_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int FRAME_TYPE_VISION_FRAME_DATA_VALUE = 1;
        public static final int FRAME_TYPE_VISION_FRAME_METADATA_VALUE = 2;
        private static final Internal.EnumLiteMap<FrameType> internalValueMap = new Internal.EnumLiteMap<FrameType>() { // from class: com.amazon.alexa.accessory.protocol.Vision.FrameType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FrameType findValueByNumber(int i) {
                return FrameType.forNumber(i);
            }
        };
        private final int value;

        FrameType(int i) {
            this.value = i;
        }

        public static FrameType forNumber(int i) {
            if (i == 0) {
                return FRAME_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return FRAME_TYPE_VISION_FRAME_DATA;
            }
            if (i == 2) {
                return FRAME_TYPE_VISION_FRAME_METADATA;
            }
            if (i == 3) {
                return FRAME_TYPE_IMAGE_THUMBNAIL;
            }
            if (i != 4) {
                return null;
            }
            return FRAME_TYPE_IMAGE_FULL;
        }

        public static Internal.EnumLiteMap<FrameType> internalGetValueMap() {
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
        public static FrameType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StopReason implements Internal.EnumLite {
        STOP_REASON_UNSPECIFIED(0),
        STOP_REASON_CLOUD_DIRECTIVE(1),
        STOP_REASON_TIMEOUT(2),
        STOP_REASON_USER_REQUEST(3),
        STOP_REASON_RESOURCE_CONSTRAINT(4),
        STOP_REASON_ERROR(5),
        STOP_REASON_COMPLETE(6),
        UNRECOGNIZED(-1);

        public static final int STOP_REASON_CLOUD_DIRECTIVE_VALUE = 1;
        public static final int STOP_REASON_COMPLETE_VALUE = 6;
        public static final int STOP_REASON_ERROR_VALUE = 5;
        public static final int STOP_REASON_RESOURCE_CONSTRAINT_VALUE = 4;
        public static final int STOP_REASON_TIMEOUT_VALUE = 2;
        public static final int STOP_REASON_UNSPECIFIED_VALUE = 0;
        public static final int STOP_REASON_USER_REQUEST_VALUE = 3;
        private static final Internal.EnumLiteMap<StopReason> internalValueMap = new Internal.EnumLiteMap<StopReason>() { // from class: com.amazon.alexa.accessory.protocol.Vision.StopReason.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StopReason findValueByNumber(int i) {
                return StopReason.forNumber(i);
            }
        };
        private final int value;

        StopReason(int i) {
            this.value = i;
        }

        public static StopReason forNumber(int i) {
            switch (i) {
                case 0:
                    return STOP_REASON_UNSPECIFIED;
                case 1:
                    return STOP_REASON_CLOUD_DIRECTIVE;
                case 2:
                    return STOP_REASON_TIMEOUT;
                case 3:
                    return STOP_REASON_USER_REQUEST;
                case 4:
                    return STOP_REASON_RESOURCE_CONSTRAINT;
                case 5:
                    return STOP_REASON_ERROR;
                case 6:
                    return STOP_REASON_COMPLETE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<StopReason> internalGetValueMap() {
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
        public static StopReason valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
