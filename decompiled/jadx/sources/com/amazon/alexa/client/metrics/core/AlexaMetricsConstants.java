package com.amazon.alexa.client.metrics.core;

import com.amazon.alexa.client.alexaservice.features.launcher.AlexaLauncherMetricNames;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AlexaMetricsConstants {
    public static final String SERVICE_NAME = "alexaservice";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class A4ASdkCustom {
        public static final String AUDIO_INFO = "audioInfo";
        public static final String ENDPOINT_INFO = "endpointInfo";
        public static final String EVENT_CONTENT = "eventContent";
        public static final String EXCEPTION_INFO = "exceptionInfo";
        public static final String EXTERNAL_VALUES = "externalValues";
        public static final String UI_MESSAGE = "uiMessage";
        public static final String VOICE_INTERACTION_INFO = "voiceInteractionInfo";

        private A4ASdkCustom() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssistantSdkDimensions {
        public static final String ACTION = "action";
        public static final String ADD_FRAGMENT_STATE = "addFragmentState";
        public static final String AVS_ENDPOINT = "avsEndpoint";
        public static final String DIALOG_REQUEST_ID = "dialogRequestId";
        public static final String DIALOG_STATUS = "dialogStatus";
        public static final String ERROR_CODE = "errorCode";
        public static final String ERROR_TYPE = "errorType";
        public static final String FAILURE_CATEGORY = "failureCategory";
        public static final String FAILURE_REASON = "failureReason";
        public static final String INITIATOR = "initiator";
        public static final String INTERACTION_LABEL = "interactionLabel";
        public static final String INTERACTION_MODEL_STATE = "interactionModelState";
        public static final String INTERACTION_SOURCE = "interactionSource";
        public static final String NDD_IS_ENABLED = "nddIsEnabled";
        public static final String RENDER_FAILURE_CATEGORY = "renderFailureCategory";
        public static final String RESPONSE_TYPE = "responseType";
        public static final String VISUAL_THEME = "visualTheme";

        private AssistantSdkDimensions() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssistantSdkFaultContext {
        public static final String AUTH_TOKEN_AGE_BUCKET = "authTokenAgeBucket";
        public static final String AUTH_TOKEN_PRESENT = "authTokenPresent";
        public static final String CONNECTED_BUCKET = "connectedBucket";
        public static final String EXCEPTION_CLASS_NAME = "exceptionClassName";
        public static final String FOREGROUND_BUCKET = "foregroundBucket";
        public static final String NETWORK_CHANGE_BUCKET = "networkChangeBucket";
        public static final String NETWORK_TRANSPORT_TYPE = "networkTransportType";
        public static final String NETWORK_VALIDATED = "networkValidated";
        public static final String TRANSPORT_STATE = "transportState";
        public static final String UPTIME_BUCKET = "uptimeBucket";

        private AssistantSdkFaultContext() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class CardMode {
        public static final String CARD_MODE = "cardMode";
        public static final String DRIVE_MODE = "DRIVE_MODE";
        public static final String STANDARD_MODE = "STANDARD";

        private CardMode() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class DriveModeMetrics {
        public static final String APP_COMPONENT_NAME = "DriveMode";
        public static final String CARD_SHOWN_POSTFIX = "Displayed";
        public static final String NAVIGATE_TO_LINK_POSTFIX = "Selected";

        private DriveModeMetrics() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class EventConstants {
        public static final String ANDROID_ID = "androidId";
        public static final String APP_COMPONENT = "AppComponent";
        public static final String APP_VERSION_COUNTRY_CODE = "AppVersion:CountryCode";
        public static final String APP_VERSION_COUNTRY_CODE_MARKETPLACE_ID = "AppVersion:CountryCode:MarketplaceID";
        public static final String APP_VERSION_COUNTRY_CODE_MARKETPLACE_ID_CODE = "AppVersion:CountryCode:MarketplaceIDCode";
        public static final String APP_VERSION_MARKETPLACE_ID = "AppVersion:MarketplaceID";
        public static final String APP_VERSION_MARKETPLACE_ID_CODE = "AppVersion:MarketplaceIDCode";
        public static final String APP_VERSION_OS_TYPE = "AppVersion:OSType";
        public static final String ATTRIBUTION_TAG = "attributionTag";
        public static final String BACKGROUND = "Background";
        public static final String CATEGORY = "CATEGORY";
        public static final String CLICK_INTERACTION_TYPE = "click";
        public static final String CONTENT_PROVIDER = "contentProvider";
        public static final String COUNTER_VALUE = "CounterValue";
        public static final String COUNTRY_CODE = "CountryCode";
        public static final String COUNTRY_CODE_MARKETPLACE_ID = "CountryCode:MarketplaceID";
        public static final String COUNTRY_CODE_MARKETPLACE_ID_CODE = "CountryCode:MarketplaceIDCode";
        public static final String DIALOG_REQUEST_ID = "dialogId";
        public static final String DIRECTED_ID = "DirectedID";
        public static final String EVENT_NAME = "EventName";
        public static final String EVENT_NUMERIC_VALUE = "EventNumericValue";
        public static final String EVENT_TIMESTAMP = "EventTimestamp";
        public static final String EVENT_TYPE = "EventType";
        public static final String EVENT_VALUE = "EventValue";
        public static final String FILE_EXTENSION = "FILE_EXTENSION";
        public static final String FILE_SIZE = "FILE_SIZE";
        public static final String FIRST_LAUNCH = "FirstLaunch";
        public static final String FOREGROUND = "Foreground";
        public static final String INPUT_TYPE = "inputType";
        public static final String INTERACTION_TYPE = "interactionType";
        public static final String INVOCATION_TYPE_EXPECT_SPEECH = "AlexaService.ExpectSpeech";
        public static final String INVOCATION_TYPE_NEW_DIALOG_REQUEST = "AlexaService.NewDialogRequest";
        public static final String INVOCATION_TYPE_NOTIFICATION = "AlexaService.Notification";
        public static final String INVOCATION_TYPE_WAKE_WORD = "AlexaService.WakeWord";
        public static final String LIVE_MODE = "LiveMode";
        public static final String LOCALE = "locale";
        public static final String LOCAL_TIMEZONE = "localTimezone";
        public static final String LOCATION_ENABLED = "locationEnabled";
        public static final String MARKETPLACE_ID = "MarketplaceID";
        public static final String MARKETPLACE_ID_CODE = "MarketplaceIDCode";
        public static final String MOBILYTICS_SESSION_ID = "mobilyticsSessionId";
        public static final String OS_TYPE = "OSType";
        public static final String OVERALL = "Overall";
        public static final String OWNER_IDENTIFIER = "ownerIdentifier";
        public static final String PFM = "pfm";
        public static final String RECORD_TIMER_END = "RecordTimerEnd";
        public static final String SEND_PRIORITY = "sendPriority";
        public static final String SEPARATOR = ":";
        public static final String SEPARATOR_DASH = "-";
        public static final String SERVICE_NAME = "ServiceName";
        public static final String SERVICE_VERSION = "AppVersion";
        public static final String SOURCE = "source";
        public static final String SOURCE_BARGE_IN = "BargeIn";
        public static final String SOURCE_CONVERSATION = "Conversation";
        public static final String SOURCE_FOLLOWUP = "FollowUp";
        public static final String SOURCE_HOME = "Home";
        public static final String SOURCE_NOTIFICATION = "Notification";
        public static final String SOURCE_OVERLAY = "Overlay";
        public static final String SOURCE_TAP_TO_TALK = "TapToTalk";
        public static final String SOURCE_WAKE_WORD = "Wakeword";
        public static final String STATUS_CODE = "statusCode";
        public static final String TAP_TO_TALK = "tapToTalk";
        public static final String TIMER_VALUE = "TimerValue";
        public static final String TITLE = "title";
        public static final String USER_SPEECH_INGRESS_TYPE = "ingressType";
        public static final String USER_SPEECH_INVOCATION_TYPE = "invocationType";
        public static final String VIEW_INTERACTION_TYPE = "view";
        public static final String WAKE_WORD = "wakeWord";

        private EventConstants() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class EventTypes {
        public static final String EVENT_TYPE_COUNTER = "Counter";
        public static final String EVENT_TYPE_DATA = "Data";
        public static final String EVENT_TYPE_ENGAGEMENT = "Engagement";
        public static final String EVENT_TYPE_ERROR = "Error";
        public static final String EVENT_TYPE_GENERAL = "General";
        public static final String EVENT_TYPE_IMPRESSION = "Impression";
        public static final String EVENT_TYPE_MONITIZATION = "Monitization";
        public static final String EVENT_TYPE_NOTIFICATION = "Notification";
        public static final String EVENT_TYPE_NOTIFICATION_CLICK = "NotificationClick";
        public static final String EVENT_TYPE_OCCURRENCE = "Occurence";
        public static final String EVENT_TYPE_RECORD_TIMER = "RecordTimer";
        public static final String EVENT_TYPE_START_TIMER = "StartTimer";
        public static final String EVENT_TYPE_TIMER = "Timer";

        private EventTypes() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Launcher {
        public static final List<String> EVENT_PREFIX_LIST = Arrays.asList("Alexa.Launcher.", AlexaLauncherMetricNames.LAUNCHER_DIRECTIVE_PREFIX, AlexaLauncherMetricNames.LAUNCH_EVENT_TYPE_PREFIX);
        public static final String OUTCOME = "launcherOutcome";
        public static final String REASONS = "launcherReasons";
        public static final String TARGET = "launcherTarget";
        public static final String TOKEN = "launcherToken";

        private Launcher() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MetricDimensions {
        public static final String ACTION = "Action";
        public static final String ADD_FRAGMENT_STATE = "AddFragmentState";
        public static final String AVS_ENDPOINT = "AVSEndpoint";
        public static final String CONTEXT_SOURCE = "ContextSource";
        public static final String DIALOG_STATUS = "DialogStatus";
        public static final String ERROR_TYPE = "errorType";
        public static final String INITIATOR = "Initiator";
        public static final String INTERACTION_LABEL = "InteractionLabel";
        public static final String INTERACTION_MODEL_STATE = "InteractionModelState";
        public static final String INTERACTION_SOURCE = "InteractionSource";
        public static final String NDD_IS_ENABLED = "NddIsEnabled";
        public static final String RENDER_FAILURE_CATEGORY = "RenderFailureCategory";
        public static final String RESPONSE_TYPE = "ResponseType";
        public static final String VISUAL_THEME = "VisualTheme";

        private MetricDimensions() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class MetricEvents {
        public static final String APP_CRASH = "APP_CRASH";
        public static final String APP_CRASH_COUNT = "APP_CRASH_COUNT";
        public static final String BEGIN_SESSION = "BEGIN_SESSION";
        public static final String CARD_SHOWN = "CardShown";
        public static final String DOZE_MODE_CHANGED = "DOZE_MODE_CHANGED";
        public static final String DOZE_MODE_CHANGE_SUCCESSFUL = "DOZE_MODE_CHANGE_SUCCESSFUL";
        public static final String DOZE_MODE_CHANGE_TIMEOUT = "DOZE_MODE_CHANGE_TIMEOUT";
        public static final String END_SESSION = "END_SESSION";
        public static final String ESTIMATED_USER_PERCEIVED_LATENCY = "EstimatedUserPerceivedLatency";
        public static final String LOCATION_ENABLED = "LocationEnabled";
        public static final String LOCATION_PERMISSION_INITIAL_CONVERSION = "LocationInitialConversion";
        public static final String SERVICE_INSTALL = "SERVICE_INSTALL";
        public static final String SERVICE_UPDATE = "SERVICE_UPDATE";
        public static final String USER_PERCEIVED_LATENCY = "UserPerceivedLatency";
        public static final String VOX_CANCELLED = "VOX_ASK_ALEXA_CANCELLED";
        public static final String VOX_FAILURE = "VOX_ASK_ALEXA_FAILED";
        public static final String VOX_FAILURE_AVS_ERROR_PREFIX = "VOX_FAILURE_AVS_ERROR_";
        public static final String VOX_OFFLINE_VUI_ALEXA_DOWN = "VOX_OFFLINE_VUI_ALEXA_DOWN";
        public static final String VOX_OFFLINE_VUI_LOST_CONNECTION = "VOX_OFFLINE_VUI_LOST_CONNECTION";
        public static final String VOX_OFFLINE_VUI_NOT_CONNECTED = "VOX_OFFLINE_VUI_NOT_CONNECTED";
        public static final String VOX_SERVICE_CREATION_TIME = "ServiceCreationTime";
        public static final String VOX_START = "VOX_ASK_ALEXA";
        public static final String VOX_UNSUPPORTED_DIRECTIVE = "VOX_UNSUPPORTED_DIRECTIVE";

        private MetricEvents() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class MetricsComponents {
        public static final String ALEXA_VOICE_SERVICE = "vox_speech_v2";
        public static final String APP_COMPONENT_NAME = "vox_speech";
        public static final String CARD_INGRESS_COMPONENT_NAME = "CardIngress";
        public static final String METRICS_DATA = "service.metrics.alexaservice";
        public static final String RA_COMPONENT_NAME = "vox_conversation";

        private MetricsComponents() {
        }
    }

    private AlexaMetricsConstants() {
    }
}
