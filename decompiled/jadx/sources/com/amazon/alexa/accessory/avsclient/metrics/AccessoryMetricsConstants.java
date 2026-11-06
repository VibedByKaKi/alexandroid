package com.amazon.alexa.accessory.avsclient.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryMetricsConstants {
    public static final String COMPONENT_NAME = "alexa_accessories";
    public static final String UNKNOWN = "Unknown";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActivityDetection {
        public static final String EVENT_PUBLISHED = "ActivityDetectionEventPublished";
        public static final String GET_CURRENT_SIGNALS = "ActivityDetectionGetCurrentSignalsSucceeded";
        public static final String SESSION_CONNECTED = "ActivityDetectionSessionConnected";
        public static final String SIGNAL_SUBSCRIBED = "ActivityDetectionSignalSubscribed";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Audio {
        public static final String UNKNOWN_AUDIO_TYPE = "UnknownAudioType";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Camera {
        public static final String ACCESSORY_INITIATED_AUTO_CAPTURE_START = "AccessoryInitiatedAutoCaptureStart";
        public static final String ACCESSORY_INITIATED_AUTO_CAPTURE_STOP = "AccessoryInitiatedAutoCaptureStop";
        public static final String ACCESSORY_INITIATED_PHOTO_CAPTURE = "AccessoryInitiatedPhotoCapture";
        public static final String ACCESSORY_INITIATED_VIDEO_START = "AccessoryInitiatedVideoStart";
        public static final String ACCESSORY_INITIATED_VIDEO_STOP = "AccessoryInitiatedVideoStop";
        public static final String CLOUD_INITIATED_AUTO_CAPTURE_START = "CloudInitiatedAutoCaptureStart";
        public static final String CLOUD_INITIATED_AUTO_CAPTURE_STOP = "CloudInitiatedAutoCaptureStop";
        public static final String CLOUD_INITIATED_PHOTO_CAPTURE = "CloudInitiatedPhotoCapture";
        public static final String CLOUD_INITIATED_VIDEO_START = "CloudInitiatedVideoStart";
        public static final String CLOUD_INITIATED_VIDEO_STOP = "CloudInitiatedVideoStop";
        public static final String FAILURE_MISSING_CAPTURE_ID = "MISSING_CAPTURE_ID";
        public static final String FAILURE_NO_ACTIVE_SESSION = "NO_ACTIVE_SESSION";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CustomAttribute {
        public static final String BOOT_NUMBER = "bootNumber";
        public static final String COMBINED_VALUES = "COMBINED_VALUES";
        public static final String DELIMITER = "|";
        public static final String DEVICE_ID = "deviceId_accessory";
        public static final String DEVICE_TYPE = "deviceType_accessory";
        public static final String DIALOG_ID = "dialogId";
        public static final String DIALOG_TURN_ID = "dialogTurnId";
        public static final String EVENT_NUMERIC_VALUE = "EventNumericValue";
        public static final String FIRMWARE_VERSION = "firmware_accessory";
        public static final String FIRMWARE_VERSION_0 = "firmware_accessory_0";
        public static final String FIRMWARE_VERSION_1 = "firmware_accessory_1";
        public static final String FIRMWARE_VERSION_2 = "firmware_accessory_2";
        public static final String FIRMWARE_VERSION_3 = "firmware_accessory_3";
        public static final String OTA_GROUP_NAME = "otaGroupName";
        public static final String SEQUENCE_NUMBER = "sequenceNumber";
        public static final String TIMER_VALUE = "TimerValue";
        public static final String TIMESTAMP = "timestamp_accessory";
        public static final String UNDERSCORE = "_";
        public static final String VALUE_PREFIX = "VALUE_";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IOComponent {
        public static final String IO_COMPONENTS_PRESENT = "IOComponentsPresent";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResponseCoordination {
        public static final String ACCESSORY_RESERVATION_GATEWAY_ACCEPTED = "AccessoryReservationGatewayAccepted";
        public static final String ACCESSORY_RESERVATION_GATEWAY_DISPUTED = "AccessoryReservationGatewayDisputed";
        public static final String GATEWAY_RESERVATION_ACCESSORY_ACCEPTED = "GatewayReservationAccessoryAccepted";
        public static final String GATEWAY_RESERVATION_ACCESSORY_DISPUTED = "GatewayReservationAccessoryDisputed";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Sco {
        public static final String SCOPRIORITIZER_IS_NULL = "ScoPrioritizerIsNull";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Speech {
        public static final String ACCESSORY_SPEECH_CAPABILITY = "AccessorySpeechCapability";
        public static final String DIALOG_DENIED = "dialogDenied";
        public static final String NULL_DIALOG_DENIED_REASON = "DialogDeniedReasonIsNull";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StateChange {
        public static final String STATE_CHANGE_DATA_LOOKUP_ERROR = "AccessoryStateChangeDataLookupError";
        public static final String STATE_CHANGE_EVENT_PUBLISH_STATUS = "AccessoryStateChangeEventPublishStatus";
        public static final String STATE_CHANGE_PAYLOAD_CONVERSION_ERROR = "AccessoryStateChangePayloadConversionError";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StateReport {
        public static final String STATE_REPORT_EVENT = "AccessoryStateReportEvent";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Upl {
        public static final String USER_PERCEIVED_LATENCY_AUDIO = "UserPerceivedLatency.Audio";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Vision {
        public static final String ACCESSORY_INITIATED_START_CAPTURE = "AccessoryInitiatedStartCapture";
        public static final String ACCESSORY_INITIATED_STOP_CAPTURE = "AccessoryInitiatedStopCapture";
        public static final String CLOUD_INITIATED_START_CAPTURE = "CloudInitiatedStartCapture";
        public static final String CLOUD_INITIATED_STOP_CAPTURE = "CloudInitiatedStopCapture";
        public static final String FRAME_DATA_HANDLING = "FrameDataHandling";
    }
}
