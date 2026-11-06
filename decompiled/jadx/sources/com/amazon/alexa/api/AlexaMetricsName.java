package com.amazon.alexa.api;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.ui.conversation.metrics.PreambleUserPerceivedLatencyMetricsProcessor;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.mobile.assistant.capabilities.external.ExternalCapabilityAgentMetrics;
import com.amazon.alexa.mobile.assistant.client.metrics.MetricsDelegateAdapter;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMetricsName {
    private static final String SEPARATOR = ".";
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AccountManager {
        public static final AlexaMetricsName IS_LOGGED_IN_TIME_OUT = AlexaMetricsName.create("ACCOUNT_MANAGER_IS_LOGGED_IN_TIME_OUT");
        public static final AlexaMetricsName IS_LOGGED_IN_ERROR = AlexaMetricsName.create("ACCOUNT_MANAGER_IS_LOGGED_IN_ERROR");
        public static final AlexaMetricsName GET_TOKEN_TIME_OUT = AlexaMetricsName.create("ACCOUNT_MANAGER_GET_TOKEN_TIME_OUT");
        public static final AlexaMetricsName LOGGED_OUT_WHEN_SENDING_EVENT = AlexaMetricsName.create("ACCOUNT_MANAGER_LOGGED_OUT_WHEN_SENDING_EVENT");
        public static final AlexaMetricsName LOGOUT_API_ATTEMPT = AlexaMetricsName.create("LOGOUT_API_ATTEMPTED");
        public static final AlexaMetricsName LOGOUT_API_SUCCESS = AlexaMetricsName.create("LOGOUT_API_SUCCESS");
        public static final AlexaMetricsName LOGOUT_API_FAILURE = AlexaMetricsName.create("LOGOUT_API_FAILURE");
        public static final AlexaMetricsName LOGOUT_API_TIMED_OUT = AlexaMetricsName.create("LOGOUT_API_TIMED_OUT");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Android {
        public static final AlexaMetricsName LOUDNESS_ENHANCER_UNSUPPORTED = AlexaMetricsName.create("LOUDNESS_ENHANCER_UNSUPPORTED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AplEvents {
        public static final AlexaMetricsName PUBLISH_APL_METRICS = AlexaMetricsName.create("PUBLISH_APL_METRICS");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioPlayer {
        public static final AlexaMetricsName AUDIO_PLAYER_PLAYBACK_IS_SLOW;
        public static final AlexaMetricsName AUDIO_PLAYER_UNKNOWN_AUDIO_FORMAT;
        public static final AlexaMetricsName DRM_LICENSE_KEY_LOADED;
        public static final AlexaMetricsName DRM_LICENSE_KEY_LOADED_FROM_CACHE;
        public static final AlexaMetricsName DRM_MANIFEST_LOAD_ERROR;
        public static final AlexaMetricsName PLAY_DRM_CRYPTO_FAILURE;
        public static final AlexaMetricsName PLAY_DRM_FAILURE;
        public static final AlexaMetricsName PLAY_DRM_LOAD_FAILURE;
        public static final AlexaMetricsName PLAY_FAILURE;
        public static final AlexaMetricsName PLAY_FAILURE_CONNECTIVITY;
        public static final AlexaMetricsName BUFFERING_TIME = AlexaMetricsName.create("AUDIO_PLAYER_BUFFERING_TIME");
        public static final AlexaMetricsName BUFFERING_COUNT = AlexaMetricsName.create("AUDIO_PLAYER_BUFFERING_COUNT");
        public static final AlexaMetricsName BUFFERING_TIMEOUT = AlexaMetricsName.create("AUDIO_PLAYER_BUFFERING_TIMEOUT");
        public static final AlexaMetricsName CONNECTIVITY_FAILURE_RESUME_SUCCESS = AlexaMetricsName.create("AUDIO_PLAYER_CONNECTIVITY_FAILURE_RESUME_SUCCESS");
        public static final AlexaMetricsName CONNECTIVITY_FAILURE_RESUME_TIMEOUT = AlexaMetricsName.create("AUDIO_PLAYER_CONNECTIVITY_FAILURE_RESUME_TIMEOUT");
        public static final AlexaMetricsName PLAY_ATTEMPT = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_ATTEMPT");
        public static final AlexaMetricsName PLAY_DRM_ATTEMPT = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_DRM_ATTEMPT");

        static {
            AlexaMetricsName create = AlexaMetricsName.create("AUDIO_PLAYER_DRM_LICENSE_KEY_LOADED");
            DRM_LICENSE_KEY_LOADED = create;
            DRM_LICENSE_KEY_LOADED_FROM_CACHE = create.appendToAlexaMetricsName("RESTORED_FROM_CACHE");
            PLAY_FAILURE = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_FAILURE");
            DRM_MANIFEST_LOAD_ERROR = AlexaMetricsName.create("AUDIO_PLAYER_DRM_MANIFEST_LOAD_ERROR");
            PLAY_DRM_FAILURE = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_DRM_FAILURE");
            PLAY_DRM_LOAD_FAILURE = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_DRM_FAILURE").appendToAlexaMetricsName("LOAD");
            PLAY_DRM_CRYPTO_FAILURE = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_DRM_FAILURE").appendToAlexaMetricsName("CRYPTO");
            PLAY_FAILURE_CONNECTIVITY = AlexaMetricsName.create("AUDIO_PLAYER_PLAY_FAILURE.CONNECTIVITY");
            AUDIO_PLAYER_PLAYBACK_IS_SLOW = AlexaMetricsName.create("AUDIO_PLAYER_PLAYBACK_IS_SLOW");
            AUDIO_PLAYER_UNKNOWN_AUDIO_FORMAT = AlexaMetricsName.create("AUDIO_PLAYER_UNKNOWN_AUDIO_FORMAT");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioPlayerTime {
        public static final AlexaMetricsName BETWEEN_PLAYBACK_STARTING_AND_PLAYBACK_STARTED = AlexaMetricsName.create("AUDIO_PLAYER_TIME_BETWEEN_PLAYBACK_STARTING_AND_PLAYBACK_STARTED");
        public static final AlexaMetricsName BETWEEN_PLAYBACK_RESUMING_AND_PLAYBACK_RESUMED = AlexaMetricsName.create("AUDIO_PLAYER_TIME_BETWEEN_PLAYBACK_RESUMING_AND_PLAYBACK_RESUMED");
        public static final AlexaMetricsName BETWEEN_LAST_PLAY_ITEM_FINISHED_AND_PLAYBACK_STARTED = AlexaMetricsName.create("AUDIO_PLAYER_TIME_BETWEEN_LAST_PLAY_ITEM_FINISHED_AND_PLAYBACK_STARTED");
        public static final AlexaMetricsName BETWEEN_DRM_MANIFEST_LOADING_AND_LOADED = AlexaMetricsName.create("AUDIO_PLAYER_TIME_BETWEEN_DRM_MANIFEST_LOADING_AND_LOADED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BottomSheetUiEvents {
        public static final AlexaMetricsName BS_SHOWN = AlexaMetricsName.create("BS_SHOWN");
        public static final AlexaMetricsName BS_COLLAPSED = AlexaMetricsName.create("BS_COLLAPSED");
        public static final AlexaMetricsName BS_TYPE_REQUEST_SENT = AlexaMetricsName.create("BS_TYPE_REQUEST_SENT");
        public static final AlexaMetricsName BS_TYPE_IN_APP_REQUEST_SENT = AlexaMetricsName.create("BS_TYPE_IN_APP_REQUEST_SENT");
        public static final AlexaMetricsName BS_VOICE_IN_APP_REQUEST_SENT = AlexaMetricsName.create("BS_VOICE_IN_APP_REQUEST_SENT");
        public static final AlexaMetricsName BS_OVERFLOW_TAPPED = AlexaMetricsName.create("BS_OVERFLOW_TAPPED");
        public static final AlexaMetricsName BS_OVERFLOW_ACTIVITY_TAPPED = AlexaMetricsName.create("BS_OVERFLOW_ACTIVITY_TAPPED");
        public static final AlexaMetricsName BS_OVERFLOW_VOICE_RESPONSES_TAPPED = AlexaMetricsName.create("BS_OVERFLOW_VOICE_RESPONSES_TAPPED");
        public static final AlexaMetricsName BS_OVERFLOW_ALEXA_PRIVACY_TAPPED = AlexaMetricsName.create("BS_OVERFLOW_ALEXA_PRIVACY_TAPPED");
        public static final AlexaMetricsName BS_STATIC_PILL_TAPPED = AlexaMetricsName.create("BS_STATIC_PILL_TAPPED");
        public static final AlexaMetricsName BS_IN_APP_SUGGESTION_TAPPED = AlexaMetricsName.create("BS_IN_APP_SUGGESTION_TAPPED");
        public static final AlexaMetricsName BS_IN_CHAT_LINK_TAPPED = AlexaMetricsName.create("BS_IN_CHAT_LINK_TAPPED");
        public static final AlexaMetricsName BS_MICROPHONE_TAPPED = AlexaMetricsName.create("BS_MICROPHONE_TAPPED");
        public static final AlexaMetricsName BS_MICROPHONE_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("BS_MICROPHONE_CHROME_LISTENING_SHOWN");
        public static final AlexaMetricsName BS_WAKEWORD_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("BS_WAKEWORD_CHROME_LISTENING_SHOWN");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BottomSheetUiEventsLatency {
        public static final AlexaMetricsName BS_TYPE_LATENCY = AlexaMetricsName.create("BS_TYPE_LATENCY");
        public static final AlexaMetricsName BS_TAP_LATENCY = AlexaMetricsName.create("BS_TAP_LATENCY");
        public static final AlexaMetricsName BS_MICROPHONE_TO_CHROME_LATENCY = AlexaMetricsName.create("BS_MICROPHONE_TO_CHROME_LATENCY");
        public static final AlexaMetricsName NAV_MIC_TAP_TO_BS_SHOWN_LATENCY = AlexaMetricsName.create("BottomNavMicToBottomSheetTTA");
        public static final AlexaMetricsName NAV_SEARCHBAR_TAP_TO_BS_SHOWN_LATENCY = AlexaMetricsName.create("BottomNavSearchToBottomSheetTTA");
        public static final AlexaMetricsName NAV_MIC_TAP_TO_BS_SHOWN_LATENCY_HOTSTART = AlexaMetricsName.create("BottomNavMicToBottomSheetTTAHotStart");
        public static final AlexaMetricsName NAV_SEARCHBAR_TAP_TO_BS_SHOWN_LATENCY_HOTSTART = AlexaMetricsName.create("BottomNavSearchToBottomSheetTTAHotStart");
        public static final AlexaMetricsName NAV_MIC_TAP_TO_BS_SHOWN_LATENCY_COMBINED = AlexaMetricsName.create("BottomNavMicToBottomSheetTTACombined");
        public static final AlexaMetricsName NAV_SEARCHBAR_TAP_TO_BS_SHOWN_LATENCY_COMBINED = AlexaMetricsName.create("BottomNavSearchToBottomSheetTTACombined");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Business {
        public static final AlexaMetricsName ALEXA_SESSION_LENGTH = AlexaMetricsName.create("ALEXA_SESSION_LENGTH");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CapabilityAgentInteraction {
        public static final AlexaMetricsName DIRECTIVE_DELIVERY = AlexaMetricsName.create("CAPABILITY_AGENT_INTERACTION.DIRECTIVE_DELIVERY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ContextProviderGet {
        public static final AlexaMetricsName SUCCESS_PREFIX = AlexaMetricsName.create("CONTEXT_PROVIDER_GET_SUCCESS_");
        public static final AlexaMetricsName FAILURE_PREFIX = AlexaMetricsName.create("CONTEXT_PROVIDER_GET_FAILURE_");
        public static final AlexaMetricsName LATENCY_PREFIX = AlexaMetricsName.create("CONTEXT_PROVIDER_GET_LATENCY_");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Conversations {
        public static final AlexaMetricsName GET_CONVERSATIONS_SUCCESS = AlexaMetricsName.create("GET_CONVERSATIONS_SUCCESS");
        public static final AlexaMetricsName GET_CONVERSATIONS_FAILURE = AlexaMetricsName.create("GET_CONVERSATIONS_FAILURE");
        public static final AlexaMetricsName GET_CONVERSATION_SUCCESS = AlexaMetricsName.create("GET_CONVERSATION_SUCCESS");
        public static final AlexaMetricsName GET_CONVERSATION_FAILURE = AlexaMetricsName.create("GET_CONVERSATION_FAILURE");
        public static final AlexaMetricsName GET_FRAGMENTS_SUCCESS = AlexaMetricsName.create("GET_FRAGMENTS_SUCCESS");
        public static final AlexaMetricsName GET_FRAGMENTS_FAILURE = AlexaMetricsName.create("GET_FRAGMENTS_FAILURE");
        public static final AlexaMetricsName DELETE_FRAGMENTS_SUCCESS = AlexaMetricsName.create("DELETE_FRAGMENTS_SUCCESS");
        public static final AlexaMetricsName DELETE_FRAGMENTS_FAILURE = AlexaMetricsName.create("DELETE_FRAGMENTS_FAILURE");
        public static final AlexaMetricsName GET_FRAGMENTS_SUCCESS_RATE = AlexaMetricsName.create("GET_FRAGMENTS_SUCCESS_RATE");
        public static final AlexaMetricsName CARD_TRANSCRIPT_ATTEMPTS = AlexaMetricsName.create("CARD_TRANSCRIPT_ATTEMPTS");
        public static final AlexaMetricsName CARD_TRANSCRIPT_FAILURES = AlexaMetricsName.create("CARD_TRANSCRIPT_FAILURES");
        public static final AlexaMetricsName CARD_TRANSCRIPT_NO_FRAGMENTS_FOUND = AlexaMetricsName.create("CARD_TRANSCRIPT_NO_FRAGMENTS_FOUND");
        public static final AlexaMetricsName DELETE_CONVERSATIONS_SUCCESS = AlexaMetricsName.create("DELETE_CONVERSATIONS_SUCCESS");
        public static final AlexaMetricsName DELETE_CONVERSATIONS_FAILURE = AlexaMetricsName.create("DELETE_CONVERSATIONS_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DomainSecurity {
        public static final AlexaMetricsName UNSAFE_DOMAIN_URL_DETECTED = AlexaMetricsName.create("DOMAIN_SECURITY.UNSAFE_DOMAIN_URL_DETECTED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Downchannel {
        public static final AlexaMetricsName AVAILABLE_LATENCY = AlexaMetricsName.create("DOWNCHANNEL_AVAILABLE_LATENCY");
        public static final AlexaMetricsName CONNECTION_LATENCY = AlexaMetricsName.create("DOWNCHANNEL_CONNECTION_LATENCY");
        public static final AlexaMetricsName FALSE_AUTHORIZATION_FAILURE = AlexaMetricsName.create("DOWNCHANNEL_FALSE_AUTHORIZATION_FAILURE");
        public static final AlexaMetricsName REAL_AUTHORIZATION_FAILURE = AlexaMetricsName.create("DOWNCHANNEL_REAL_AUTHORIZATION_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DownchannelEstablishmentFailure {
        public static final AlexaMetricsName IO_EXCEPTION = AlexaMetricsName.create("DOWNCHANNEL_ESTABLISHMENT_FAILURE_IO_EXCEPTION");
        public static final AlexaMetricsName NO_NETWORK = AlexaMetricsName.create("DOWNCHANNEL_ESTABLISHMENT_FAILURE_NO_NETWORK");
        public static final AlexaMetricsName AVS_FAILURE = AlexaMetricsName.create("DOWNCHANNEL_ESTABLISHMENT_FAILURE_AVS_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EndpointChange {
        public static AlexaMetricsName getMetricsName(String str) {
            return AlexaMetricsName.create("ENDPOINT_CHANGE_" + str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Enterprise {
        public static final AlexaMetricsName CREATE_ENTERPRISE_SESSION_SUCCESS = AlexaMetricsName.create("CREATE_ENTERPRISE_SESSION_SUCCESS");
        public static final AlexaMetricsName CREATE_ENTERPRISE_SESSION_FAILURE = AlexaMetricsName.create("CREATE_ENTERPRISE_SESSION_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExceptionEncountered {
        public static final AlexaMetricsName AVS = AlexaMetricsName.create("AVS_EXCEPTION_ENCOUNTERED");
        public static final AlexaMetricsName SDK = AlexaMetricsName.create("SDK_EXCEPTION_ENCOUNTERED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExecutionTime {
        public static AlexaMetricsName getMetricsName(String str) {
            return AlexaMetricsName.create(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExternalCapabilityAgents {
        public static final AlexaMetricsName MISSED_EXTERNAL_CAPABILITY = AlexaMetricsName.create("MISSED_EXTERNAL_CAPABILITY");
        public static final AlexaMetricsName ECA_SCAN_SUCCESS = AlexaMetricsName.create("ECA_SCAN_SUCCESS");
        public static final AlexaMetricsName ECA_SCAN_FAILURE = AlexaMetricsName.create("ECA_SCAN_FAILURE");
        public static final AlexaMetricsName ECA_MULTIPLE_REGISTERED_ERROR = AlexaMetricsName.create("ECA_MULTIPLE_REGISTERED_ERROR");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExternalComponentState {
        public static final AlexaMetricsName INSERT_LATENCY = AlexaMetricsName.create("EXTERNAL_COMPONENT_STATE_INSERT_LATENCY");
        public static final AlexaMetricsName QUERY_LATENCY = AlexaMetricsName.create("EXTERNAL_COMPONENT_STATE_QUERY_LATENCY");
        public static final AlexaMetricsName DELETE_LATENCY = AlexaMetricsName.create("EXTERNAL_COMPONENT_STATE_DELETE_LATENCY");
        public static final AlexaMetricsName GATHERING_LATENCY = AlexaMetricsName.create("EXTERNAL_COMPONENT_STATES_GATHERING_LATENCY");
        public static final AlexaMetricsName COUNT_EXCEEDED = AlexaMetricsName.create("EXTERNAL_COMPONENT_STATE_PROVIDERS_COUNT_EXCEEDED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExternalMediaPlayer {
        public static final AlexaMetricsName PLAYER_ERROR = AlexaMetricsName.create("EXTERNAL_MEDIA_PLAYER_ERROR");
        public static final AlexaMetricsName ACTION_START_SERVICE_FOR_MSP = AlexaMetricsName.create("ACTION_START_SERVICE_FOR_MSP");
        public static final AlexaMetricsName MEDIA_BROWSER_CONNECTION_STATUS = AlexaMetricsName.create("MEDIA_BROWSER_CONNECTION_STATUS");
        public static final AlexaMetricsName SAVE_SHARED_PREF_EMP_ERROR = AlexaMetricsName.create("SAVE_SHARED_PREFS_EMP_ERROR");
        public static final AlexaMetricsName LOAD_SHARED_PREF_EMP_ERROR = AlexaMetricsName.create("LOAD_SHARED_PREFS_EMP_ERROR");
        public static final AlexaMetricsName SAVE_ENCRYPTED_SHARED_PREF_EMP_ATTEMPT = AlexaMetricsName.create("SAVE_ENCRYPTED_SHARED_PREFS_EMP_ATTEMPT");
        public static final AlexaMetricsName LOAD_ENCRYPTED_SHARED_PREF_EMP_ATTEMPT = AlexaMetricsName.create("LOAD_ENCRYPTED_SHARED_PREFS_EMP_ATTEMPT");
        public static final AlexaMetricsName SAVE_PLAINTEXT_SHARED_PREF_EMP_ATTEMPT = AlexaMetricsName.create("SAVE_PLAINTEXT_SHARED_PREFS_EMP_ATTEMPT");
        public static final AlexaMetricsName LOAD_PLAINTEXT_SHARED_PREF_EMP_ATTEMPT = AlexaMetricsName.create("LOAD_PLAINTEXT_SHARED_PREFS_EMP_ATTEMPT");
        public static final AlexaMetricsName SET_EMP_PLAYBACK_SESSION_ENDED_TIMER = AlexaMetricsName.create("SET_EMP_PLAYBACK_SESSION_ENDED_TIMER");
        public static final AlexaMetricsName CANCEL_EMP_PLAYBACK_SESSION_ENDED_TIMER = AlexaMetricsName.create("CANCEL_EMP_PLAYBACK_SESSION_ENDED_TIMER");
        public static final AlexaMetricsName ELAPSED_EMP_PLAYBACK_SESSION_ENDED_TIMER = AlexaMetricsName.create("ELAPSED_EMP_PLAYBACK_SESSION_ENDED_TIMER");
        public static final AlexaMetricsName NO_PLAYBACK_SESSION_ID = AlexaMetricsName.create("NO_PLAYBACK_SESSION_ID");
        public static final AlexaMetricsName SEARCH_QUERY_PRESENT = AlexaMetricsName.create("SEARCH_QUERY_PRESENT");
        public static final AlexaMetricsName SEARCH_QUERY_NULL = AlexaMetricsName.create("SEARCH_QUERY_NULL");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InteractionSchedulerFailure {
        public static final AlexaMetricsName SCHEDULE_FAILED_NOT_CONNECTED = AlexaMetricsName.create("INTERACTION_SCHEDULER.SCHEDULE_FAILED.NOT_CONNECTED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Latency {
        public static final AlexaMetricsName SDK_INITIALIZATION_TIME = AlexaMetricsName.create("SDK_INITIALIZATION_TIME_LATENCY");
        public static final AlexaMetricsName VUI_USER_PERCEIVED = AlexaMetricsName.create("VUI_USER_PERCEIVED_LATENCY");
        public static final AlexaMetricsName USER_PERCEIVED_LATENCY = AlexaMetricsName.create("UserPerceivedLatency");
        public static final AlexaMetricsName USER_PERCEIVED_LATENCY_VISUAL_TEXT = AlexaMetricsName.create("UserPerceivedLatency.Visual.Text");
        public static final AlexaMetricsName USER_PERCEIVED_LATENCY_VISUAL_TAP = AlexaMetricsName.create("UserPerceivedLatency.Visual.Tap");
        public static final AlexaMetricsName USER_PERCEIVED_LATENCY_VISUAL_SERVER_PREAMBLE = AlexaMetricsName.create(PreambleUserPerceivedLatencyMetricsProcessor.METRIC_SERVER_PREAMBLE);
        public static final AlexaMetricsName USER_PERCEIVED_LATENCY_VISUAL_CLIENT_PREAMBLE = AlexaMetricsName.create(PreambleUserPerceivedLatencyMetricsProcessor.METRIC_CLIENT_PREAMBLE);
        public static final AlexaMetricsName GUI_DATA_RECEIVED = AlexaMetricsName.create("GUI_DATA_RECEIVED_LATENCY");
        public static final AlexaMetricsName GUI_USER_PERCEIVED = AlexaMetricsName.create("GUI_USER_PERCEIVED_LATENCY");
        public static final AlexaMetricsName ATTENTION_SYSTEM = AlexaMetricsName.create("ATTENTION_SYSTEM_LATENCY");
        public static final AlexaMetricsName REFRESH_EXTERNAL_CAPABILITY_SUCCEEDED = AlexaMetricsName.create(ExternalCapabilityAgentMetrics.REFRESH_SUCCEEDED);
        public static final AlexaMetricsName REFRESH_EXTERNAL_CAPABILITY_TIMEDOUT = AlexaMetricsName.create(ExternalCapabilityAgentMetrics.REFRESH_TIMED_OUT);
        public static final AlexaMetricsName REFRESH_EXTERNAL_CAPABILITY_PERCENTAGE_FOUND = AlexaMetricsName.create(ExternalCapabilityAgentMetrics.REFRESH_PERCENTAGE);
        public static final AlexaMetricsName REFRESH_EXTERNAL_CAPABILITY_SERVICE_CONNECT_CALL_SUCCEEDED = AlexaMetricsName.create(ExternalCapabilityAgentMetrics.SERVICE_CONNECT_SUCCEEDED);
        public static final AlexaMetricsName REFRESH_EXTERNAL_CAPABILITY_SERVICE_CONNECT_CALL_FAILED = AlexaMetricsName.create(ExternalCapabilityAgentMetrics.SERVICE_CONNECT_FAILED);
        public static final AlexaMetricsName GOOGLE_API_CLIENT_CONNECT_CALL = AlexaMetricsName.create("GOOGLE_API_CLIENT_CONNECT_CALL");
        public static final AlexaMetricsName FEATURE_FLAG_LOAD_LATENCY = AlexaMetricsName.create("FEATURE_FLAG_LOAD_LATENCY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LeaderSelection {
        public static final AlexaMetricsName ATTEMPTED = AlexaMetricsName.create("LEADER_SELECTION_ATTEMPTED");
        public static final AlexaMetricsName MISSING_PACKAGENAME = AlexaMetricsName.create("VERIFICATION_FAILED_MISSING_PACKAGENAME");
        public static final AlexaMetricsName INCORRECT_SIGNATURE = AlexaMetricsName.create("VERIFICATION_FAILED_INCORRECT_SIGNATURE");
        public static final AlexaMetricsName TIMEOUT = AlexaMetricsName.create("VERIFICATION_FAILED_TIMEOUT");
        public static final AlexaMetricsName DISABLED = AlexaMetricsName.create("VERIFICATION_FAILED_DISABLED");
        public static final AlexaMetricsName UNKNOWN_LEADER = AlexaMetricsName.create("VERIFICATION_FAILED_UNKNOWN_LEADER");
        public static final AlexaMetricsName UNKNOWN_ERROR = AlexaMetricsName.create("VERIFICATION_FAILED_UNKNOWN_ERROR");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MediaSuppression {
        public static final AlexaMetricsName MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_SUCCESS = AlexaMetricsName.create("MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_SUCCESS");
        public static final AlexaMetricsName MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_INTERRUPTED = AlexaMetricsName.create("MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_INTERRUPTED");
        public static final AlexaMetricsName MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_FAILURE = AlexaMetricsName.create("MEDIA_SUPPRESSION_ARTIFACT_DOWNLOAD_FAILURE");
        public static final AlexaMetricsName MEDIA_SUPPRESSION_ARTIFACT_READ_SUCCESS = AlexaMetricsName.create("MEDIA_SUPPRESSION_ARTIFACT_READ_SUCCESS");
        public static final AlexaMetricsName MEDIA_SUPPRESSION_ARTIFACT_READ_FAILURE = AlexaMetricsName.create("MEDIA_SUPPRESSION_ARTIFACT_READ_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MetricEvents {
        public static final AlexaMetricsName VOX_OFFLINE_VUI_ALEXA_DOWN = AlexaMetricsName.create(AlexaMetricsConstants.MetricEvents.VOX_OFFLINE_VUI_ALEXA_DOWN);
        public static final AlexaMetricsName VOX_OFFLINE_VUI_NOT_CONNECTED = AlexaMetricsName.create(AlexaMetricsConstants.MetricEvents.VOX_OFFLINE_VUI_NOT_CONNECTED);
        public static final AlexaMetricsName VOX_OFFLINE_VUI_LOST_CONNECTION = AlexaMetricsName.create(AlexaMetricsConstants.MetricEvents.VOX_OFFLINE_VUI_LOST_CONNECTION);
        public static final AlexaMetricsName VOX_OFFLINE_VUI_NETWORK_LOW_BANDWIDTH = AlexaMetricsName.create("VOX_OFFLINE_VUI_NETWORK_LOW_BANDWIDTH");
        public static final AlexaMetricsName VOX_OFFLINE_VUI_NETWORK_TRANSITION_AUTO = AlexaMetricsName.create("VOX_OFFLINE_VUI_NETWORK_TRANSITION_AUTO");
        public static final AlexaMetricsName VOX_OFFLINE_VUI_NETWORK_TRANSITION_NON_AUTO = AlexaMetricsName.create("VOX_OFFLINE_VUI_NETWORK_TRANSITION_NON_AUTO");
        public static final AlexaMetricsName VOX_OFFLINE_VUI_CONNECTIVITY_ISSUE_AUTO = AlexaMetricsName.create("VOX_OFFLINE_VUI_CONNECTIVITY_ISSUE_AUTO");
        public static final AlexaMetricsName VOX_OFFLINE_VUI_CONNECTIVITY_ISSUE_NON_AUTO = AlexaMetricsName.create("VOX_OFFLINE_VUI_CONNECTIVITY_ISSUE_NON_AUTO");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MicInitialization {
        public static final AlexaMetricsName SUCCESS = AlexaMetricsName.create("MIC_INITIALIZATION_SUCCESS");
        public static final AlexaMetricsName FAILURE = AlexaMetricsName.create("MIC_INITIALIZATION_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Network {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Failure {
            public static final AlexaMetricsName CALL_FAILED = AlexaMetricsName.create("NETWORK.FAILURE.CALL_FAILED");
            public static final AlexaMetricsName CONNECT_FAILED = AlexaMetricsName.create("NETWORK.FAILURE.CONNECT_FAILED");
            public static final AlexaMetricsName REQUEST_FAILED = AlexaMetricsName.create("NETWORK.FAILURE.REQUEST_FAILED");
            public static final AlexaMetricsName RESPONSE_FAILED = AlexaMetricsName.create("NETWORK.FAILURE.RESPONSE_FAILED");
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Latency {
            public static final AlexaMetricsName DNS_TIME = AlexaMetricsName.create("NETWORK.LATENCY.DNS_TIME");
            public static final AlexaMetricsName SSL_TIME = AlexaMetricsName.create("NETWORK.LATENCY.SSL_TIME");
            public static final AlexaMetricsName OVERALL_TIME = AlexaMetricsName.create("NETWORK.LATENCY.OVERALL_TIME");
            public static final AlexaMetricsName CONNECTION_RELEASED_TIME = AlexaMetricsName.create("NETWORK.LATENCY.CONNECTION_RELEASED_TIME");
            public static final AlexaMetricsName REQUEST_BODY_TIME = AlexaMetricsName.create("NETWORK.LATENCY.REQUEST_BODY_TIME");
            public static final AlexaMetricsName RESPONSE_BODY_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RESPONSE_BODY_TIME");

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Relative {
                public static final AlexaMetricsName DNS_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.DNS_TIME");
                public static final AlexaMetricsName SSL_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.SSL_TIME");
                public static final AlexaMetricsName OVERALL_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.OVERALL_TIME");
                public static final AlexaMetricsName CONNECTION_RELEASED_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.CONNECTION_RELEASED_TIME");
                public static final AlexaMetricsName REQUEST_BODY_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.REQUEST_BODY_TIME");
                public static final AlexaMetricsName RESPONSE_BODY_TIME = AlexaMetricsName.create("NETWORK.LATENCY.RELATIVE.RESPONSE_BODY_TIME");
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OfflinePromptPlayed {
        public static final AlexaMetricsName ALEXA_IS_DOWN = AlexaMetricsName.create("ALEXA_IS_DOWN_PROMPT_PLAYED");
        public static final AlexaMetricsName NO_INTERNET_CONNECTION = AlexaMetricsName.create("NO_INTERNET_CONNECTION_PROMPT_PLAYED");
        public static final AlexaMetricsName INTERNET_CONNECTION_LOST = AlexaMetricsName.create("INTERNET_CONNECTION_LOST_PROMPT_PLAYED");
        public static final AlexaMetricsName NETWORK_LOW_BANDWIDTH = AlexaMetricsName.create("NETWORK_LOW_BANDWIDTH_PROMPT_PLAYED");
        public static final AlexaMetricsName NETWORK_TRANSITION_AUTO = AlexaMetricsName.create("NETWORK_TRANSITION_AUTO_PROMPT_PLAYED");
        public static final AlexaMetricsName NETWORK_TRANSITION_NON_AUTO = AlexaMetricsName.create("NETWORK_TRANSITION_NON_AUTO_PROMPT_PLAYED");
        public static final AlexaMetricsName CONNECTIVITY_ISSUE_AUTO = AlexaMetricsName.create("CONNECTIVITY_ISSUE_AUTO_PROMPT_PLAYED");
        public static final AlexaMetricsName CONNECTIVITY_ISSUE_NON_AUTO = AlexaMetricsName.create("CONNECTIVITY_ISSUE_NON_AUTO_NON_AUTO_PROMPT_PLAYED");
        public static final AlexaMetricsName LOW_BANDWIDTH_VALUE = AlexaMetricsName.create("LOW_BANDWIDTH_VALUE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OfflinePrompts {
        public static final AlexaMetricsName OFFLINE_PROMPT_DOWNLOAD_SUCCESS = AlexaMetricsName.create("OFFLINE_PROMPT_DOWNLOAD_SUCCESS");
        public static final AlexaMetricsName OFFLINE_PROMPT_DOWNLOAD_INTERRUPTED = AlexaMetricsName.create("OFFLINE_PROMPT_DOWNLOAD_INTERRUPTED");
        public static final AlexaMetricsName OFFLINE_PROMPT_DOWNLOAD_FAILURE = AlexaMetricsName.create("OFFLINE_PROMPT_DOWNLOAD_FAILURE");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Operational {
        public static final AlexaMetricsName UNSUPPORTED_DIRECTIVE_RECEIVED = AlexaMetricsName.create("UNSUPPORTED_DIRECTIVE_RECEIVED");
        public static final AlexaMetricsName UPDATE_SETTINGS_DIRECTIVE_RECEIVED = AlexaMetricsName.create("UPDATE_SETTINGS_DIRECTIVE_RECEIVED");
        public static final AlexaMetricsName SEND_ATTACHMENT_FAILURE = AlexaMetricsName.create("SEND_ATTACHMENT_FAILURE");
        public static final AlexaMetricsName AVS_REQUEST_ERROR = AlexaMetricsName.create("AVS_REQUEST_ERROR");
        public static final AlexaMetricsName DEPRECATED_API_USE = AlexaMetricsName.create("DEPRECATED_API_");
        public static final AlexaMetricsName ATTACHMENT_SIZE = AlexaMetricsName.create("ATTACHMENT_SIZE");
        public static final AlexaMetricsName DOWNCHANNEL_RECOVERY = AlexaMetricsName.create("DOWNCHANNEL_RECOVERY_");
        public static final AlexaMetricsName RESPONSE_TRUNCATED_AFTER_COMPLETION = AlexaMetricsName.create("RESPONSE_TRUNCATED_AFTER_COMPLETION");
        public static final AlexaMetricsName DOWNCHANNEL_DNS_RETRY = AlexaMetricsName.create("DOWNCHANNEL_DNS_RETRY_");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Pryon {
        public static final AlexaMetricsName PRYON_ERROR_EVENT;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_ALREADY_INITIALIZED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_AUDIO_BUFFER_ALLOCATION_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_CLASS_PROPERTIES_QUERY_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_GLOBAL_REFERENCE_CREATION_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_INVALID_CONFIG_PARAMETER;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_JAVA_CONFIG_PARAMETER_IMPORT_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_JNI_MEMORY_ALLOCATION_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_JNI_MEMORY_POINTER_SAVING_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_FAILURE_NATIVE_MEMORY_ALLOCATION_FAILED;
        public static final AlexaMetricsName PRYON_INITIALIZATION_SUCCESS = AlexaMetricsName.create("PRYON_INITIALIZATION_SUCCESS");
        public static final AlexaMetricsName PRYON_RESET = AlexaMetricsName.create("PRYON_RESET");

        static {
            AlexaMetricsName create = AlexaMetricsName.create("PRYON_INITIALIZATION_FAILURE");
            PRYON_INITIALIZATION_FAILURE = create;
            PRYON_INITIALIZATION_FAILURE_INVALID_CONFIG_PARAMETER = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".INVALID_CONFIG_PARAMETER");
            PRYON_INITIALIZATION_FAILURE_ALREADY_INITIALIZED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".ALREADY_INITIALIZED");
            PRYON_INITIALIZATION_FAILURE_JNI_MEMORY_ALLOCATION_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".JNI_MEMORY_ALLOCATION_FAILED");
            PRYON_INITIALIZATION_FAILURE_GLOBAL_REFERENCE_CREATION_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".GLOBAL_REFERENCE_CREATION_FAILED");
            PRYON_INITIALIZATION_FAILURE_CLASS_PROPERTIES_QUERY_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CLASS_PROPERTIES_QUERY_FAILED");
            PRYON_INITIALIZATION_FAILURE_JAVA_CONFIG_PARAMETER_IMPORT_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".JAVA_CONFIG_PARAMETER_IMPORT_FAILED");
            PRYON_INITIALIZATION_FAILURE_NATIVE_MEMORY_ALLOCATION_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".NATIVE_MEMORY_ALLOCATION_FAILED");
            PRYON_INITIALIZATION_FAILURE_AUDIO_BUFFER_ALLOCATION_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".AUDIO_BUFFER_ALLOCATION_FAILED");
            PRYON_INITIALIZATION_FAILURE_JNI_MEMORY_POINTER_SAVING_FAILED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".JNI_MEMORY_POINTER_SAVING_FAILED");
            PRYON_ERROR_EVENT = AlexaMetricsName.create("PRYON_ERROR_EVENT");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PublishCapabilityCacheRate {
        public static final AlexaMetricsName PUBLISH_CAPABILITY_CACHE_SUCCESS_RATE = AlexaMetricsName.create("PUBLISH_CAPABILITY_CACHE_SUCCESS_RATE");
        public static final AlexaMetricsName CAPABILITY_UPDATE_IN_PROGRESS = AlexaMetricsName.create("CAPABILITY_UPDATE_IN_PROGRESS");
        public static final AlexaMetricsName WAITING_FOR_CAPABILITY_PUBLISH = AlexaMetricsName.create("WAITING_FOR_CAPABILITY_PUBLISH");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReadinessTime {
        public static final AlexaMetricsName NOT_READY_TO_QUICK_READY = AlexaMetricsName.create("NOT_READY_TO_QUICK_READY");
        public static final AlexaMetricsName NOT_READY_TO_READY = AlexaMetricsName.create("NOT_READY_TO_READY");
        public static final AlexaMetricsName QUICK_READY_TO_READY = AlexaMetricsName.create("QUICK_READY_TO_READY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemarkableAlexaSoundEvents {
        public static final AlexaMetricsName SOUND_POOL_PLAYER_LOAD_TRACK_SUCCESS = AlexaMetricsName.create("SOUND_POOL_PLAYER_LOAD_TRACK_SUCCESS");
        public static final AlexaMetricsName SOUND_POOL_PLAYER_PLAY_TRACK_SUCCESS = AlexaMetricsName.create("SOUND_POOL_PLAYER_PLAY_TRACK_SUCCESS");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemarkableAlexaUiEvents {
        public static final AlexaMetricsName RA_COLLAPSED = AlexaMetricsName.create("RA_COLLAPSED");
        public static final AlexaMetricsName RA_INGRESS_ENTER = AlexaMetricsName.create("RA_INGRESS_ENTER");
        public static final AlexaMetricsName RA_EGRESS_EXIT = AlexaMetricsName.create("RA_EGRESS_EXIT");
        public static final AlexaMetricsName RA_EGRESS_BACK_TAPPED = AlexaMetricsName.create("RA_EGRESS_BACK_TAPPED");
        public static final AlexaMetricsName RA_PREVIEW_LANDING_SHOWN = AlexaMetricsName.create("RA_PREVIEW_LANDING_SHOWN");
        public static final AlexaMetricsName RA_MICROPHONE_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("RA_MICROPHONE_CHROME_LISTENING_SHOWN");
        public static final AlexaMetricsName RA_WAKEWORD_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("RA_WAKEWORD_CHROME_LISTENING_SHOWN");
        public static final AlexaMetricsName RA_PILL_SHOWN = AlexaMetricsName.create("RA_PILL_SHOWN");
        public static final AlexaMetricsName RA_PILL_TAPPED = AlexaMetricsName.create("RA_PILL_TAPPED");
        public static final AlexaMetricsName RA_MICROPHONE_TAPPED = AlexaMetricsName.create("RA_MICROPHONE_TAPPED");
        public static final AlexaMetricsName RA_CARD_LINK_TAPPED = AlexaMetricsName.create("RA_CARD_LINK_TAPPED");
        public static final AlexaMetricsName RA_BACKGROUND_MINI_CARD_LONG_PRESS = AlexaMetricsName.create("RA_BACKGROUND_MINI_CARD_LONG_PRESS");
        public static final AlexaMetricsName RA_BACKGROUND_MINI_CARD_DEEP_BROWSE = AlexaMetricsName.create("RA_BACKGROUND_MINI_CARD_DEEP_BROWSE");
        public static final AlexaMetricsName RA_CAROUSEL_MINI_CARD_LONG_PRESS = AlexaMetricsName.create("RA_CAROUSEL_MINI_CARD_LONG_PRESS");
        public static final AlexaMetricsName RA_CAROUSEL_MINI_CARD_DEEP_BROWSE = AlexaMetricsName.create("RA_CAROUSEL_MINI_CARD_DEEP_BROWSE");
        public static final AlexaMetricsName RA_DETAIL_MINI_CARD_LONG_PRESS = AlexaMetricsName.create("RA_DETAIL_MINI_CARD_LONG_PRESS");
        public static final AlexaMetricsName RA_DETAIL_MINI_CARD_DEEP_BROWSE = AlexaMetricsName.create("RA_DETAIL_MINI_CARD_DEEP_BROWSE");
        public static final AlexaMetricsName RA_MINI_CARDS_RENDER = AlexaMetricsName.create("RA_MINI_CARDS_RENDER");
        public static final AlexaMetricsName RA_MINI_CARD_RECEIVED = AlexaMetricsName.create("RA_MINI_CARD_RECEIVED");
        public static final AlexaMetricsName RA_MINI_CARD_RENDERED = AlexaMetricsName.create("RA_MINI_CARD_RENDERED");
        public static final AlexaMetricsName RA_RESPONSE_MESSAGE_RENDER = AlexaMetricsName.create("RA_RESPONSE_MESSAGE_RENDER");
        public static final AlexaMetricsName RA_REQUEST_LONG_PRESS = AlexaMetricsName.create("RA_REQUEST_LONG_PRESS");
        public static final AlexaMetricsName RA_REQUEST_COPIED = AlexaMetricsName.create("RA_REQUEST_COPIED");
        public static final AlexaMetricsName RA_RESPONSE_LONG_PRESS = AlexaMetricsName.create("RA_RESPONSE_LONG_PRESS");
        public static final AlexaMetricsName RA_RESPONSE_LIKED = AlexaMetricsName.create("RA_RESPONSE_LIKED");
        public static final AlexaMetricsName RA_RESPONSE_DISLIKED = AlexaMetricsName.create("RA_RESPONSE_DISLIKED");
        public static final AlexaMetricsName RA_RESPONSE_SHARED = AlexaMetricsName.create("RA_RESPONSE_SHARED");
        public static final AlexaMetricsName RA_RESPONSE_COPIED = AlexaMetricsName.create("RA_RESPONSE_COPIED");
        public static final AlexaMetricsName RA_SETTINGS_TAPPED = AlexaMetricsName.create("RA_SETTINGS_TAPPED");
        public static final AlexaMetricsName RA_SETTINGS_ACTIVITY_TAPPED = AlexaMetricsName.create("RA_SETTINGS_ACTIVITY_TAPPED");
        public static final AlexaMetricsName RA_SETTINGS_VOICE_RESPONSES_TAPPED = AlexaMetricsName.create("RA_SETTINGS_VOICE_RESPONSES_TAPPED");
        public static final AlexaMetricsName RA_SETTINGS_ALEXA_PRIVACY_TAPPED = AlexaMetricsName.create("RA_SETTINGS_ALEXA_PRIVACY_TAPPED");
        public static final AlexaMetricsName RA_SETTINGS_ABOUT_TAPPED = AlexaMetricsName.create("RA_SETTINGS_ABOUT_TAPPED");
        public static final AlexaMetricsName RA_REQUEST_UNSUPPORTED = AlexaMetricsName.create("RA_REQUEST_UNSUPPORTED");
        public static final AlexaMetricsName RA_TYPE_REQUEST_SENT = AlexaMetricsName.create("RA_TYPE_REQUEST_SENT");
        public static final AlexaMetricsName RA_TYPE_IN_APP_REQUEST_SENT = AlexaMetricsName.create("RA_TYPE_IN_APP_REQUEST_SENT");
        public static final AlexaMetricsName RA_APP_UPDATE = AlexaMetricsName.create("RA_APP_UPDATE");
        public static final AlexaMetricsName CAM_FILE_SEND_WITH_UTTERANCE = AlexaMetricsName.create("CAM_FILE_SEND_WITH_UTTERANCE");
        public static final AlexaMetricsName CAM_FILE_SEND_WITHOUT_UTTERANCE = AlexaMetricsName.create("CAM_FILE_SEND_WITHOUT_UTTERANCE");
        public static final AlexaMetricsName CAM_FILE_DELETED_BEFORE_SEND = AlexaMetricsName.create("CAM_FILE_DELETED_BEFORE_SEND");
        public static final AlexaMetricsName CAM_FILE_UPLOAD_STOPPED_BUTTON_TAP = AlexaMetricsName.create("CAM_FILE_UPLOAD_STOPPED_BUTTON_TAP");
        public static final AlexaMetricsName CAM_FILE_UPLOAD_STOPPED_WAKEWORD = AlexaMetricsName.create("CAM_FILE_UPLOAD_STOPPED_WAKEWORD");
        public static final AlexaMetricsName CAM_FILE_UPLOAD_STOPPED_NEGLECT_NAVIGATE_AWAY = AlexaMetricsName.create("CAM_FILE_UPLOAD_STOPPED_NEGLECT_NAVIGATE_AWAY");
        public static final AlexaMetricsName CAM_PLUS_BUTTON_TAP = AlexaMetricsName.create("CAM_PLUS_BUTTON_TAP");
        public static final AlexaMetricsName CAM_FILE_BROWSING_INGRESS_TAP = AlexaMetricsName.create("CAM_FILE_BROWSING_INGRESS_TAP");
        public static final AlexaMetricsName CAM_PHOTOS_BROWSING_INGRESS_TAP = AlexaMetricsName.create("CAM_PHOTOS_BROWSING_INGRESS_TAP");
        public static final AlexaMetricsName CAM_CAMERA_BROWSING_INGRESS_TAP = AlexaMetricsName.create("CAM_CAMERA_BROWSING_INGRESS_TAP");
        public static final AlexaMetricsName CAM_SHARE_SHEET_FILE_INGRESS = AlexaMetricsName.create("CAM_SHARE_SHEET_FILE_INGRESS");
        public static final AlexaMetricsName CAM_EXPAND_CLICK = AlexaMetricsName.create("CAM_EXPAND_CLICK");
        public static final AlexaMetricsName CAM_USER_CANCELLED_RESPONSE = AlexaMetricsName.create("CAM_USER_CANCELLED_RESPONSE");
        public static final AlexaMetricsName CAM_STATUS_API_FAILED = AlexaMetricsName.create("CAM_STATUS_API_FAILED");
        public static final AlexaMetricsName CAM_UPLOAD_API_FAILED = AlexaMetricsName.create("CAM_UPLOAD_API_FAILED");
        public static final AlexaMetricsName CAM_STATUS_API_SUCCESS = AlexaMetricsName.create("CAM_STATUS_API_SUCCESS");
        public static final AlexaMetricsName CAM_UPLOAD_API_SUCCESS = AlexaMetricsName.create("CAM_UPLOAD_API_SUCCESS");
        public static final AlexaMetricsName CAM_SUCCESS_EVENT = AlexaMetricsName.create("CAM_SUCCESS_EVENT");
        public static final AlexaMetricsName CAM_CAMERA_PERMISSION_PRIMER = AlexaMetricsName.create("CAM_CAMERA_PERMISSION_PRIMER");
        public static final AlexaMetricsName CAM_SUCCESSFUL_RESPONSE = AlexaMetricsName.create("CAM_SUCCESSFUL_RESPONSE");
        public static final AlexaMetricsName CAM_UPLOAD_API_LATENCY = AlexaMetricsName.create("CAM_UPLOAD_API_LATENCY");
        public static final AlexaMetricsName CAM_STATUS_API_POLL_LATENCY = AlexaMetricsName.create("CAM_STATUS_API_POLL_LATENCY");
        public static final AlexaMetricsName CAM_TTA = AlexaMetricsName.create("CAM_TTA");
        public static final AlexaMetricsName CAM_UPL = AlexaMetricsName.create("UserPerceivedLatency.Visual.Cam");
        public static final AlexaMetricsName CAM_RESOURCE_ATTACHED_TO_SEND_TAP_LATENCY = AlexaMetricsName.create("CAM_RESOURCE_ATTACHED_TO_SEND_TAP_LATENCY");
        public static final AlexaMetricsName CAM_DOWNLOAD_TAPPED_IMAGE = AlexaMetricsName.create("CAM_DOWNLOAD_TAPPED_IMAGE");
        public static final AlexaMetricsName CAM_DOWNLOAD_TAPPED_DOCUMENT = AlexaMetricsName.create("CAM_DOWNLOAD_TAPPED_DOCUMENT");
        public static final AlexaMetricsName CAM_DOWNLOAD_FAILED = AlexaMetricsName.create("CAM_DOWNLOAD_FAILED");
        public static final AlexaMetricsName CAM_DOWNLOAD_SUCCESS = AlexaMetricsName.create("CAM_DOWNLOAD_SUCCESS");
        public static final AlexaMetricsName CAM_LIGHTBOX_EXPAND_SUCCESS = AlexaMetricsName.create("CAM_LIGHTBOX_EXPAND_SUCCESS");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_INGRESS_COUNT = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_INGRESS_COUNT");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_EGRESS_COUNT_UI_BACK_BUTTON = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_EGRESS_COUNT:UI_BACK_BUTTON");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_FILTER_SELECTED_COUNT = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_FILTER_SELECTED_COUNT");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_ENTER_SELECTED_CONVERSATION_COUNT = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_ENTER_SELECTED_CONVERSATION_COUNT");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_TTA = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_TTA");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_TTS = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_TTS");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_REQUEST = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_REQUEST");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_RESPONSE = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_RESPONSE");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_DISPLAYED = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_DISPLAYED");
        public static final AlexaMetricsName CDCC_TIMELINE_VIEW_STATE_ERROR = AlexaMetricsName.create("CDCC_TIMELINE_VIEW_STATE_ERROR");
        public static final AlexaMetricsName CONVERSATION_SEND_BUTTON_TAP_COUNT = AlexaMetricsName.create("CONVERSATION_SEND_BUTTON_TAP_COUNT");
        public static final AlexaMetricsName CONVERSATION_MIC_BUTTON_TAP_COUNT = AlexaMetricsName.create("CONVERSATION_MIC_BUTTON_TAP_COUNT");
        public static final AlexaMetricsName CONVERSATION_PILL_TAP_COUNT = AlexaMetricsName.create("CONVERSATION_PILL_TAP_COUNT");
        public static final AlexaMetricsName CONVERSATION_TAP_COUNT_ATTEMPT = AlexaMetricsName.create("CONVERSATION_TAP_COUNT_ATTEMPT");
        public static final AlexaMetricsName CONVERSATION_TAP_COUNT_SUCCESS = AlexaMetricsName.create("CONVERSATION_TAP_COUNT_SUCCESS");
        public static final AlexaMetricsName CONVERSATION_TAP_COUNT_FAILURE = AlexaMetricsName.create("CONVERSATION_TAP_COUNT_FAILURE");
        public static final AlexaMetricsName CONVERSATION_TAP_COUNT_CANCEL = AlexaMetricsName.create("CONVERSATION_TAP_COUNT_CANCEL");
        public static final AlexaMetricsName QUICKACTION_LIKE_TAPPED = AlexaMetricsName.create("QUICKACTION_LIKE_TAPPED");
        public static final AlexaMetricsName QUICKACTION_DISLIKE_TAPPED = AlexaMetricsName.create("QUICKACTION_DISLIKE_TAPPED");
        public static final AlexaMetricsName FEEDBACK_API_FAILED = AlexaMetricsName.create("FEEDBACK_API_FAILED");
        public static final AlexaMetricsName QUICKACTION_SHAREOUT_TAPPED = AlexaMetricsName.create("QUICKACTION_SHAREOUT_TAPPED");
        public static final AlexaMetricsName QUICKACTION_REGENERATE_RESPONSE_TAPPED = AlexaMetricsName.create("QUICKACTION_REGENERATE_RESPONSE_TAPPED");
        public static final AlexaMetricsName QUICKACTION_COPY_TAPPED = AlexaMetricsName.create("QUICKACTION_COPY_TAPPED");
        public static final AlexaMetricsName QUICKACTION_SHOWN_USER_REQUEST = AlexaMetricsName.create("QUICKACTION_SHOWN:USER_REQUEST");
        public static final AlexaMetricsName QUICKACTION_SHOWN_AGENT_RESPONSE = AlexaMetricsName.create("QUICKACTION_SHOWN:AGENT_RESPONSE");
        public static final AlexaMetricsName CONVERSATION_SUGGESTION_DISPLAYED = AlexaMetricsName.create("CONVERSATION_SUGGESTION_DISPLAYED");
        public static final AlexaMetricsName DYNAMIC_CONVERSATION_STARTERS_DISPLAYED = AlexaMetricsName.create("DYNAMIC_CONVERSATION_STARTERS_DISPLAYED");
        public static final AlexaMetricsName DYNAMIC_CONVERSATION_STARTERS_TAPPED = AlexaMetricsName.create("DYNAMIC_CONVERSATION_STARTERS_TAPPED");
        public static final AlexaMetricsName STATIC_CONVERSATION_STARTERS_DISPLAYED = AlexaMetricsName.create("STATIC_CONVERSATION_STARTERS_DISPLAYED");
        public static final AlexaMetricsName STATIC_CONVERSATION_STARTERS_TAPPED = AlexaMetricsName.create("STATIC_CONVERSATION_STARTERS_TAPPED");
        public static final AlexaMetricsName RECENT_CHATS_STARTER_PILL_TAPPED = AlexaMetricsName.create("RECENT_CHATS_STARTER_PILL_TAPPED");
        public static final AlexaMetricsName TABLET_SMART_ACTIONS_STARTER_PILL_TAPPED = AlexaMetricsName.create("TABLET_SMART_ACTIONS_STARTER_PILL_TAPPED");
        public static final AlexaMetricsName TABLET_SMART_ACTIONS_STARTER_PILL_DISPLAYED = AlexaMetricsName.create("TABLET_SMART_ACTIONS_STARTER_PILL_DISPLAYED");
        public static final AlexaMetricsName TABLET_SMART_ACTIONS_FEEDBACK_SUBMITTED = AlexaMetricsName.create("TABLET_SMART_ACTIONS_FEEDBACK_SUBMITTED");
        public static final AlexaMetricsName TABLET_ALEXA_SHARE_MY_SCREEN_BTN_TAPPED = AlexaMetricsName.create("TABLET_ALEXA_SHARE_MY_SCREEN_BTN_TAPPED");
        public static final AlexaMetricsName SILK_PAGE_CONTENT_PILL_TAPPED = AlexaMetricsName.create("SILK_PAGE_CONTENT_PILL_TAPPED");
        public static final AlexaMetricsName SILK_PAGE_CONTENT_QUERY_SUCCESS = AlexaMetricsName.create("SILK_PAGE_CONTENT_QUERY_SUCCESS");
        public static final AlexaMetricsName SILK_PAGE_CONTENT_QUERY_EMPTY = AlexaMetricsName.create("SILK_PAGE_CONTENT_QUERY_EMPTY");
        public static final AlexaMetricsName SILK_PAGE_CONTENT_QUERY_FAILED = AlexaMetricsName.create("SILK_PAGE_CONTENT_QUERY_FAILED");
        public static final AlexaMetricsName SILK_PAGE_CONTENT_FALLBACK_TO_SCREENSHOT = AlexaMetricsName.create("SILK_PAGE_CONTENT_FALLBACK_TO_SCREENSHOT");
        public static final AlexaMetricsName SILK_PAGE_CONTEXT_ATTACHED = AlexaMetricsName.create("SILK_PAGE_CONTEXT_ATTACHED");
        public static final AlexaMetricsName SILK_PAGE_CONTEXT_STAGED_HIT = AlexaMetricsName.create("SILK_PAGE_CONTEXT_STAGED_HIT");
        public static final AlexaMetricsName SILK_PAGE_CONTEXT_SEND_TIME_UPLOAD = AlexaMetricsName.create("SILK_PAGE_CONTEXT_SEND_TIME_UPLOAD");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_DISPLAY_RECEIVED = AlexaMetricsName.create("CONVERSATION_PERSONALITY_DISPLAY_RECEIVED");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_DISPLAY_UNKNOWN = AlexaMetricsName.create("CONVERSATION_PERSONALITY_DISPLAY_UNKNOWN");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_UNKNOWN_NAME = AlexaMetricsName.create("CONVERSATION_PERSONALITY_UNKNOWN_NAME");
        public static final AlexaMetricsName CONVERSATION_MICROPHONE_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("CONVERSATION_MICROPHONE_CHROME_LISTENING_SHOWN");
        public static final AlexaMetricsName CONVERSATION_WAKE_WORD_CHROME_LISTENING_SHOWN = AlexaMetricsName.create("CONVERSATION_WAKE_WORD_CHROME_LISTENING_SHOWN");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_RENDERED = AlexaMetricsName.create("CONVERSATION_PERSONALITY_RENDERED");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_IGNORED = AlexaMetricsName.create("CONVERSATION_PERSONALITY_IGNORED");
        public static final AlexaMetricsName PERSONALITY_RENDERED_EVENT = AlexaMetricsName.create("PERSONALITY_RENDERED_EVENT");
        public static final AlexaMetricsName PERSONALITY_CACHE_HIT_DISK = AlexaMetricsName.create("PERSONALITY_CACHE_HIT_DISK");
        public static final AlexaMetricsName PERSONALITY_CACHE_HIT_URLCACHE = AlexaMetricsName.create("PERSONALITY_CACHE_HIT_URLCACHE");
        public static final AlexaMetricsName PERSONALITY_CACHE_MISS = AlexaMetricsName.create("PERSONALITY_CACHE_MISS");
        public static final AlexaMetricsName PERSONALITY_ASSET_SUCCESS = AlexaMetricsName.create("PERSONALITY_ASSET_SUCCESS");
        public static final AlexaMetricsName PERSONALITY_ASSET_FAILURE_NETWORK_ERROR = AlexaMetricsName.create("PERSONALITY_ASSET_FAILURE_NETWORK_ERROR");
        public static final AlexaMetricsName PERSONALITY_ASSET_FAILURE_EMPTY_DATA = AlexaMetricsName.create("PERSONALITY_ASSET_FAILURE_EMPTY_DATA");
        public static final AlexaMetricsName PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_FAILED = AlexaMetricsName.create("PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_FAILED");
        public static final AlexaMetricsName PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_ERROR = AlexaMetricsName.create("PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_ERROR");
        public static final AlexaMetricsName CONVERSATION_SUGGESTION_TAPPED = AlexaMetricsName.create("CONVERSATION_SUGGESTION_TAPPED");
        public static final AlexaMetricsName TARGET_FRAGMENT_FETCHED_SUCCESS_RATE = AlexaMetricsName.create("TARGET_FRAGMENT_FETCHED_SUCCESS_RATE");
        public static final AlexaMetricsName RA_TEXTFIELD_FOCUS_FAILURE = AlexaMetricsName.create("RA_TEXTFIELD_FOCUS_FAILURE");
        public static final AlexaMetricsName CAM_FILE_ATTACH_FILE_TO_UPLOAD_ACTION_TTA = AlexaMetricsName.create("CAM_FILE_ATTACH_FILE_TO_UPLOAD_ACTION_TTA");
        public static final AlexaMetricsName RA_LIVE_MODE_BUTTON_CLICKED = AlexaMetricsName.create("RA_LIVE_MODE_BUTTON_CLICKED");
        public static final AlexaMetricsName RA_LIVE_MODE_TAP_TO_TALK_BUTTON_TAPPED = AlexaMetricsName.create("RA_LIVE_MODE_TAP_TO_TALK_BUTTON_TAPPED");
        public static final AlexaMetricsName RA_LIVE_MODE_MUTE_BUTTON_TAPPED = AlexaMetricsName.create("RA_LIVE_MODE_MUTE_BUTTON_TAPPED");
        public static final AlexaMetricsName RA_LIVE_MODE_MUTE_BUTTON_TAPPED_ERROR = AlexaMetricsName.create("RA_LIVE_MODE_MUTE_BUTTON_TAPPED_ERROR");
        public static final AlexaMetricsName RA_LIVE_MODE_DISMISS_BUTTON_TAPPED = AlexaMetricsName.create("RA_LIVE_MODE_DISMISS_BUTTON_TAPPED");
        public static final AlexaMetricsName RA_LIVE_MODE_SETTINGS_ENABLED = AlexaMetricsName.create("RA_LIVE_MODE_SETTINGS_ENABLED");
        public static final AlexaMetricsName LIVE_MODE_INGRESS_TAPPED = AlexaMetricsName.create("LIVE_MODE_INGRESS_TAPPED");
        public static final AlexaMetricsName LIVE_MODE_EGRESS_TAPPED = AlexaMetricsName.create("LIVE_MODE_EGRESS_TAPPED");
        public static final AlexaMetricsName LIVE_MODE_ONBOARDING_CONTINUE = AlexaMetricsName.create("LIVE_MODE_ONBOARDING_CONTINUE");
        public static final AlexaMetricsName LIVE_MODE_ONBOARDING_LEARN_MORE = AlexaMetricsName.create("LIVE_MODE_ONBOARDING_LEARN_MORE");
        public static final AlexaMetricsName LIVE_MODE_FTUE_PRESENTED = AlexaMetricsName.create("LIVE_MODE_FTUE_PRESENTED");
        public static final AlexaMetricsName LIVE_MODE_FTUE_PERMISSION_GRANTED_POST_FTUE = AlexaMetricsName.create("LIVE_MODE_FTUE_PERMISSION_GRANTED_POST_FTUE");
        public static final AlexaMetricsName LIVE_MODE_FTUE_PERMISSION_DENIED_POST_FTUE = AlexaMetricsName.create("LIVE_MODE_FTUE_PERMISSION_DENIED_POST_FTUE");
        public static final AlexaMetricsName LIVE_MODE_FTUE_PERMISSION_ALREADY_DENIED = AlexaMetricsName.create("LIVE_MODE_FTUE_PERMISSION_ALREADY_DENIED");
        public static final AlexaMetricsName LIVE_MODE_FTUE_DISMISSED = AlexaMetricsName.create("LIVE_MODE_FTUE_DISMISSED");
        public static final AlexaMetricsName LIVE_MODE_FTUE_LEARN_MORE_PRESENTED = AlexaMetricsName.create("LIVE_MODE_FTUE_LEARN_MORE_PRESENTED");
        public static final AlexaMetricsName LIVE_MODE_FTUE_SETTINGS_LINK_TAPPED = AlexaMetricsName.create("LIVE_MODE_FTUE_SETTINGS_LINK_TAPPED");
        public static final AlexaMetricsName LIVE_MODE_FTUE_REPRESENTED_FROM_SETTINGS = AlexaMetricsName.create("LIVE_MODE_FTUE_REPRESENTED_FROM_SETTINGS");
        public static final AlexaMetricsName LIVE_MODE_FTUE_DEEPLINK_ERROR = AlexaMetricsName.create("LIVE_MODE_FTUE_DEEPLINK_ERROR");
        public static final AlexaMetricsName LIVE_MODE_MUTE_TAPPED = AlexaMetricsName.create("LIVE_MODE_MUTE_TAPPED");
        public static final AlexaMetricsName LIVE_MODE_USER_UNMUTED = AlexaMetricsName.create("LIVE_MODE_USER_UNMUTED");
        public static final AlexaMetricsName LIVE_MODE_BACKGROUND_CONVERSATIONS_DISABLED = AlexaMetricsName.create("LIVE_MODE_BACKGROUND_CONVERSATIONS_DISABLED");
        public static final AlexaMetricsName LIVE_MODE_BACKGROUND_CONVERSATIONS_ENABLED = AlexaMetricsName.create("LIVE_MODE_BACKGROUND_CONVERSATIONS_ENABLED");
        public static final AlexaMetricsName LIVE_MODE_CONVERSATION_TURNS = AlexaMetricsName.create("LIVE_MODE_CONVERSATION_TURNS");
        public static final AlexaMetricsName LIVE_MODE_APP_BACKGROUNDED = AlexaMetricsName.create("LIVE_MODE_APP_BACKGROUNDED");
        public static final AlexaMetricsName LIVE_MODE_SESSION_STARTED = AlexaMetricsName.create("LIVE_MODE_SESSION_STARTED");
        public static final AlexaMetricsName LIVE_MODE_SESSION_ENDED = AlexaMetricsName.create("LIVE_MODE_SESSION_ENDED");
        public static final AlexaMetricsName LIVE_MODE_SESSION_END_ERROR = AlexaMetricsName.create("LIVE_MODE_SESSION_END_ERROR");
        public static final AlexaMetricsName LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK = AlexaMetricsName.create("LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK");
        public static final AlexaMetricsName LIVE_MODE_AUTO_MUTE_TRIGGERED = AlexaMetricsName.create("LIVE_MODE_AUTO_MUTE_TRIGGERED");
        public static final AlexaMetricsName VAD_INITIALIZATION_ERROR = AlexaMetricsName.create("VAD_INITIALIZATION_ERROR");
        public static final AlexaMetricsName VAD_PROCESSOR_ERROR = AlexaMetricsName.create("VAD_PROCESSOR_ERROR");
        public static final AlexaMetricsName VAD_AUDIO_FOCUS_INTERRUPTION = AlexaMetricsName.create("VAD_AUDIO_FOCUS_INTERRUPTION");
        public static final AlexaMetricsName VAD_USER_EXIT_INTENT = AlexaMetricsName.create("VAD_USER_EXIT_INTENT");
        public static final AlexaMetricsName VAD_DIALOG_REQUEST_DENIED = AlexaMetricsName.create("VAD_DIALOG_REQUEST_DENIED");
        public static final AlexaMetricsName VAD_SPEECH_PROVIDER_NOT_REGISTERED = AlexaMetricsName.create("VAD_SPEECH_PROVIDER_NOT_REGISTERED");
        public static final AlexaMetricsName VAD_NO_DATA_ON_DIALOG_REQUEST = AlexaMetricsName.create("VAD_NO_DATA_ON_DIALOG_REQUEST");
        public static final AlexaMetricsName VAD_INVALID_STATE_TRANSITION = AlexaMetricsName.create("VAD_INVALID_STATE_TRANSITION");
        public static final AlexaMetricsName VAD_BARGE_IN = AlexaMetricsName.create("VAD_BARGE_IN");
        public static final AlexaMetricsName VAD_DIALOG_STARTED = AlexaMetricsName.create("VAD_DIALOG_STARTED");
        public static final AlexaMetricsName VAD_BUFFER_READ_TIMEOUT = AlexaMetricsName.create("VAD_BUFFER_READ_TIMEOUT");
        public static final AlexaMetricsName VAD_BUFFER_READ_FAILED = AlexaMetricsName.create("VAD_BUFFER_READ_FAILED");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_INVOKED = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_INVOKED");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_NONE = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_NONE");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_MUTE = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_MUTE");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_INFERENCE_FAILED = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_INFERENCE_FAILED");
        public static final AlexaMetricsName VAD_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE = AlexaMetricsName.create("VAD_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE");
        public static final AlexaMetricsName VAD_MODEL_FILE_NOT_FOUND = AlexaMetricsName.create("VAD_MODEL_FILE_NOT_FOUND");
        public static final AlexaMetricsName VAD_FAILED_TO_LOAD_MODEL = AlexaMetricsName.create("VAD_FAILED_TO_LOAD_MODEL");
        public static final AlexaMetricsName VAD_SELF_BARGE_IN_DETECTED = AlexaMetricsName.create("VAD_SELF_BARGE_IN_DETECTED");
        public static final AlexaMetricsName VAD_SELF_BARGE_IN_PLAYBACK_CONTEXT = AlexaMetricsName.create("VAD_SELF_BARGE_IN_PLAYBACK_CONTEXT");
        public static final AlexaMetricsName VAD_SUSPECTED_NO_TRANSCRIPT_BARGE_IN = AlexaMetricsName.create("VAD_SUSPECTED_NO_TRANSCRIPT_BARGE_IN");
        public static final AlexaMetricsName VISUAL_RESPONSE_RENDERED_SUCCESS_RATE = AlexaMetricsName.create("VISUAL_RESPONSE_RENDERED_SUCCESS_RATE");
        public static final AlexaMetricsName CAM_MULTI_FILE_UPLOAD_INITIATED = AlexaMetricsName.create("CAM_MULTI_FILE_UPLOAD_INITIATED");
        public static final AlexaMetricsName CAM_MULTI_FILE_REMOVED_FROM_CAROUSEL = AlexaMetricsName.create("CAM_MULTI_FILE_REMOVED_FROM_CAROUSEL");
        public static final AlexaMetricsName CAM_BATCH_COMMIT_INITIATED = AlexaMetricsName.create("CAM_BATCH_COMMIT_INITIATED");
        public static final AlexaMetricsName CAM_BATCH_COMMIT_SUCCESS = AlexaMetricsName.create("CAM_BATCH_COMMIT_SUCCESS");
        public static final AlexaMetricsName CAM_BATCH_COMMIT_FAILED = AlexaMetricsName.create("CAM_BATCH_COMMIT_FAILED");
        public static final AlexaMetricsName CAM_BATCH_COMMIT_TIMEOUT = AlexaMetricsName.create("CAM_BATCH_COMMIT_TIMEOUT");
        public static final AlexaMetricsName CAM_MULTI_FILE_RETRY_ALL_INITIATED = AlexaMetricsName.create("CAM_MULTI_FILE_RETRY_ALL_INITIATED");
        public static final AlexaMetricsName CAM_MULTI_FILE_MAX_FILES_EXCEEDED = AlexaMetricsName.create("CAM_MULTI_FILE_MAX_FILES_EXCEEDED");
        public static final AlexaMetricsName CAM_BATCH_POLL_CYCLE_COUNT = AlexaMetricsName.create("CAM_BATCH_POLL_CYCLE_COUNT");
        public static final AlexaMetricsName RA_NEW_CHAT_ICON_TAPPED = AlexaMetricsName.create("RA_NEW_CHAT_ICON_TAPPED");
        public static final AlexaMetricsName TEXT_SELECTION_STARTED = AlexaMetricsName.create("TEXT_SELECTION_STARTED");
        public static final AlexaMetricsName TEXT_SELECTION_COPY = AlexaMetricsName.create("TEXT_SELECTION_COPY");
        public static final AlexaMetricsName OVERFLOW_SETTINGS_TAPPED = AlexaMetricsName.create("OVERFLOW_SETTINGS_TAPPED");
        public static final AlexaMetricsName OVERFLOW_PRIVACY_TAPPED = AlexaMetricsName.create("OVERFLOW_PRIVACY_TAPPED");
        public static final AlexaMetricsName OVERFLOW_PRIVACY_DASHBOARD_OPENED_WEBVIEW = AlexaMetricsName.create("OVERFLOW_PRIVACY_DASHBOARD_OPENED_WEBVIEW");
        public static final AlexaMetricsName OVERFLOW_PRIVACY_DASHBOARD_OPENED_BROWSER = AlexaMetricsName.create("OVERFLOW_PRIVACY_DASHBOARD_OPENED_BROWSER");
        public static final AlexaMetricsName OVERFLOW_PRIVACY_DASHBOARD_COOKIE_FETCH_FAILED = AlexaMetricsName.create("OVERFLOW_PRIVACY_DASHBOARD_COOKIE_FETCH_FAILED");
        public static final AlexaMetricsName RA_SEARCH_SHOWN = AlexaMetricsName.create("RA_SEARCH_SHOWN");
        public static final AlexaMetricsName RA_SEARCH_PILL_TAPPED = AlexaMetricsName.create("RA_SEARCH_PILL_TAPPED");
        public static final AlexaMetricsName RA_SEARCH_DISMISSED = AlexaMetricsName.create("RA_SEARCH_DISMISSED");
        public static final AlexaMetricsName RA_SEARCH_SOURCE_ERROR = AlexaMetricsName.create("RA_SEARCH_SOURCE_ERROR");
        public static final AlexaMetricsName RA_SEARCH_EMPTY_RESULTS = AlexaMetricsName.create("RA_SEARCH_EMPTY_RESULTS");
        public static final AlexaMetricsName INLINE_CITATION_PILL_TAPPED = AlexaMetricsName.create("INLINE_CITATION_PILL_TAPPED");
        public static final AlexaMetricsName GLOBAL_SOURCES_BUTTON_TAPPED = AlexaMetricsName.create("GLOBAL_SOURCES_BUTTON_TAPPED");
        public static final AlexaMetricsName CITATION_SOURCE_TAPPED = AlexaMetricsName.create("CITATION_SOURCE_TAPPED");
        public static final AlexaMetricsName ALEXA_PLUS_UPSELL_BANNER_SHOWN = AlexaMetricsName.create("ALEXA_PLUS_UPSELL_BANNER_SHOWN");
        public static final AlexaMetricsName ALEXA_PLUS_UPSELL_BANNER_TAPPED = AlexaMetricsName.create("ALEXA_PLUS_UPSELL_BANNER_TAPPED");
        public static final AlexaMetricsName ALEXA_PLUS_UPSELL_BANNER_DISMISSED = AlexaMetricsName.create("ALEXA_PLUS_UPSELL_BANNER_DISMISSED");
        public static final AlexaMetricsName VISUAL_SHARE_START_TAPPED = AlexaMetricsName.create("VISUAL_SHARE_START_TAPPED");
        public static final AlexaMetricsName VISUAL_SHARE_STARTED = AlexaMetricsName.create("VISUAL_SHARE_STARTED");
        public static final AlexaMetricsName VISUAL_SHARE_START_FAILED = AlexaMetricsName.create("VISUAL_SHARE_START_FAILED");
        public static final AlexaMetricsName VISUAL_SHARE_STOPPED = AlexaMetricsName.create("VISUAL_SHARE_STOPPED");
        public static final AlexaMetricsName VISUAL_SHARE_CAMERA_FLIPPED = AlexaMetricsName.create("VISUAL_SHARE_CAMERA_FLIPPED");
        public static final AlexaMetricsName VISUAL_SHARE_SWAP = AlexaMetricsName.create("VISUAL_SHARE_SWAP");
        public static final AlexaMetricsName VISUAL_SHARE_CONSENT_PROMPT_SHOWN = AlexaMetricsName.create("VISUAL_SHARE_CONSENT_PROMPT_SHOWN");
        public static final AlexaMetricsName VISUAL_SHARE_CONSENT_GRANTED = AlexaMetricsName.create("VISUAL_SHARE_CONSENT_GRANTED");
        public static final AlexaMetricsName VISUAL_SHARE_CONSENT_DENIED = AlexaMetricsName.create("VISUAL_SHARE_CONSENT_DENIED");
        public static final AlexaMetricsName VISUAL_SHARE_FRAME_CAPTURED = AlexaMetricsName.create("VISUAL_SHARE_FRAME_CAPTURED");
        public static final AlexaMetricsName VISUAL_SHARE_FRAME_CAPTURE_FAILED = AlexaMetricsName.create("VISUAL_SHARE_FRAME_CAPTURE_FAILED");
        public static final AlexaMetricsName VISUAL_SHARE_FRAME_UPLOAD_FAILED = AlexaMetricsName.create("VISUAL_SHARE_FRAME_UPLOAD_FAILED");
        public static final AlexaMetricsName VISUAL_SHARE_FRAME_DROPPED = AlexaMetricsName.create("VISUAL_SHARE_FRAME_DROPPED");
        public static final AlexaMetricsName VISUAL_SHARE_ERROR = AlexaMetricsName.create("VISUAL_SHARE_ERROR");
        public static final AlexaMetricsName CONVOCX_BAR_MOUNT_OUTCOME = AlexaMetricsName.create("CONVOCX_BAR_MOUNT_OUTCOME");
        public static final AlexaMetricsName CONVOCX_BAR_RAISE_OUTCOME = AlexaMetricsName.create("CONVOCX_BAR_RAISE_OUTCOME");
        public static final AlexaMetricsName CONVOCX_DISPATCH_OUTCOME = AlexaMetricsName.create("CONVOCX_DISPATCH_OUTCOME");
        public static final AlexaMetricsName CONVOCX_INVARIANT_ACTIVE_HOST_DEAD = AlexaMetricsName.create("CONVOCX_INVARIANT_ACTIVE_HOST_DEAD");
        public static final AlexaMetricsName DICTATION_INGRESS_TAPPED = AlexaMetricsName.create("DICTATION_INGRESS_TAPPED");
        public static final AlexaMetricsName DICTATION_SESSION_REQUESTED = AlexaMetricsName.create("DICTATION_SESSION_REQUESTED");
        public static final AlexaMetricsName DICTATION_ERROR = AlexaMetricsName.create("DICTATION_ERROR");
        public static final AlexaMetricsName DICTATION_SIGN_URL_FAILURE = AlexaMetricsName.create("DICTATION_SIGN_URL_FAILURE");
        public static final AlexaMetricsName DICTATION_SOCKET_FAILURE = AlexaMetricsName.create("DICTATION_SOCKET_FAILURE");
        public static final AlexaMetricsName DICTATION_SERVICE_EXCEPTION = AlexaMetricsName.create("DICTATION_SERVICE_EXCEPTION");
        public static final AlexaMetricsName LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC = AlexaMetricsName.create("LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC");
        public static final AlexaMetricsName CONVERSATION_TOPIC_OPEN_LOAD_SUCCEEDED = AlexaMetricsName.create("CONVERSATION_TOPIC_OPEN_LOAD_SUCCEEDED");
        public static final AlexaMetricsName LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC_FAILURE = AlexaMetricsName.create("LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC_FAILURE");
        public static final AlexaMetricsName CONVERSATION_TOPIC_OPEN_SUPERSEDED = AlexaMetricsName.create("CONVERSATION_TOPIC_OPEN_SUPERSEDED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemarkableAlexaUiEventsLatency {
        public static final AlexaMetricsName RA_INGRESS_TO_UI_LATENCY = AlexaMetricsName.create("RA_INGRESS_TO_UI_LATENCY");
        public static final AlexaMetricsName RA_TYPE_LATENCY = AlexaMetricsName.create("RA_TYPE_LATENCY");
        public static final AlexaMetricsName RA_TAP_LATENCY = AlexaMetricsName.create("RA_TAP_LATENCY");
        public static final AlexaMetricsName RA_MICROPHONE_TO_CHROME_LATENCY = AlexaMetricsName.create("RA_MICROPHONE_TO_CHROME_LATENCY");
        public static final AlexaMetricsName RA_LATENCY_MINI_CARD_RENDER = AlexaMetricsName.create("RA_LATENCY_MINI_CARD_RENDER");
        public static AlexaMetricsName CONVERSATION_INGRESS_TO_UI_TTA = AlexaMetricsName.create("CONVERSATION_INGRESS_TO_UI_TTA");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_LATENCY = AlexaMetricsName.create("CONVERSATION_PERSONALITY_LATENCY");
        public static final AlexaMetricsName CONVERSATION_PERSONALITY_VUPL = AlexaMetricsName.create("CONVERSATION_PERSONALITY_VUPL");
        public static final AlexaMetricsName PERSONALITY_NETWORK_LATENCY = AlexaMetricsName.create("PERSONALITY_NETWORK_LATENCY");
        public static final AlexaMetricsName CONVERSATION_MICROPHONE_TO_CHROME_LATENCY = AlexaMetricsName.create("CONVERSATION_MICROPHONE_TO_CHROME_LATENCY");
        public static final AlexaMetricsName CONVERSATION_WAKE_WORD_TO_CHROME_LATENCY = AlexaMetricsName.create("CONVERSATION_WAKE_WORD_TO_CHROME_LATENCY");
        public static final AlexaMetricsName DYNAMIC_CONVERSATION_STARTERS_LATENCY = AlexaMetricsName.create("DYNAMIC_CONVERSATION_STARTERS_LATENCY");
        public static final AlexaMetricsName STATIC_CONVERSATION_STARTERS_LATENCY = AlexaMetricsName.create("STATIC_CONVERSATION_STARTERS_LATENCY");
        public static final AlexaMetricsName TABLET_SMART_ACTIONS_STARTER_PILL_LATENCY = AlexaMetricsName.create("TABLET_SMART_ACTIONS_STARTER_PILL_LATENCY");
        public static final AlexaMetricsName SILK_PAGE_CONTEXT_SEND_LATENCY = AlexaMetricsName.create("SILK_PAGE_CONTEXT_SEND_LATENCY");
        public static final AlexaMetricsName RA_LIVE_MODE_SESSION_DURATION = AlexaMetricsName.create("RA_LIVE_MODE_SESSION_DURATION");
        public static final AlexaMetricsName LIVE_MODE_CONVERSATION_DURATION = AlexaMetricsName.create("LIVE_MODE_CONVERSATION_DURATION");
        public static final AlexaMetricsName VAD_INITIALIZATION_LATENCY = AlexaMetricsName.create("VAD_INITIALIZATION_LATENCY");
        public static final AlexaMetricsName RA_LIVE_MODE_TTS = AlexaMetricsName.create("RA_LIVE_MODE_TTS");
        public static final AlexaMetricsName RA_LIVE_MODE_TTA = AlexaMetricsName.create("RA_LIVE_MODE_TTA");
        public static final AlexaMetricsName CAM_BATCH_COMMIT_LATENCY = AlexaMetricsName.create("CAM_BATCH_COMMIT_LATENCY");
        public static final AlexaMetricsName CAM_MULTI_FILE_TOTAL_UPLOAD_LATENCY = AlexaMetricsName.create("CAM_MULTI_FILE_TOTAL_UPLOAD_LATENCY");
        public static final AlexaMetricsName CAM_MULTI_FILE_UPL = AlexaMetricsName.create("CAM_MULTI_FILE_UPL");
        public static final AlexaMetricsName CAM_BATCH_POLL_TOTAL_LATENCY = AlexaMetricsName.create("CAM_BATCH_POLL_TOTAL_LATENCY");
        public static final AlexaMetricsName CAM_MULTI_FILE_TTA = AlexaMetricsName.create("CAM_MULTI_FILE_TTA");
        public static final AlexaMetricsName RA_SEARCH_QUERY_LATENCY = AlexaMetricsName.create("RA_SEARCH_QUERY_LATENCY");
        public static final AlexaMetricsName VISUAL_SHARE_SESSION_DURATION = AlexaMetricsName.create("VISUAL_SHARE_SESSION_DURATION");
        public static final AlexaMetricsName VISUAL_SHARE_FRAME_UPLOAD_LATENCY = AlexaMetricsName.create("VISUAL_SHARE_FRAME_UPLOAD_LATENCY");
        public static final AlexaMetricsName VISUAL_SHARE_UPL = AlexaMetricsName.create("VISUAL_SHARE_UPL");
        public static final AlexaMetricsName CONVOCX_BAR_TAP_TO_IME_SHOWN_LATENCY = AlexaMetricsName.create("CONVOCX_BAR_TAP_TO_IME_SHOWN_LATENCY");
        public static final AlexaMetricsName CONVOCX_OPEN_TAP_TO_SURFACE_VISIBLE_LATENCY = AlexaMetricsName.create("CONVOCX_OPEN_TAP_TO_SURFACE_VISIBLE_LATENCY");
        public static final AlexaMetricsName CONVOCX_OPEN_INGRESS_TO_SURFACE_VISIBLE_LATENCY = AlexaMetricsName.create("CONVOCX_OPEN_INGRESS_TO_SURFACE_VISIBLE_LATENCY");
        public static final AlexaMetricsName DICTATION_START_LATENCY = AlexaMetricsName.create("DICTATION_START_LATENCY");
        public static final AlexaMetricsName DICTATION_SESSION_DURATION = AlexaMetricsName.create("DICTATION_SESSION_DURATION");
        public static final AlexaMetricsName DICTATION_SIGN_URL_LATENCY = AlexaMetricsName.create("DICTATION_SIGN_URL_LATENCY");
        public static final AlexaMetricsName DICTATION_SOCKET_CONNECT_LATENCY = AlexaMetricsName.create("DICTATION_SOCKET_CONNECT_LATENCY");
        public static final AlexaMetricsName CONVERSATION_TOPIC_OPEN_LOAD_LATENCY = AlexaMetricsName.create("CONVERSATION_TOPIC_OPEN_LOAD_LATENCY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResponseCoordinationEvents {
        public static final AlexaMetricsName EXTERNAL_RESPONSE_RESERVATION_SHALLOW_AGREED_COUNT = AlexaMetricsName.create("EXTERNAL_RESPONSE_RESERVATION_SHALLOW_AGREED_COUNT");
        public static final AlexaMetricsName EXTERNAL_RESPONSE_RESERVATION_SHALLOW_DISPUTE_COUNT = AlexaMetricsName.create("EXTERNAL_RESPONSE_RESERVATION_SHALLOW_DISPUTE_COUNT");
        public static final AlexaMetricsName EXTERNAL_RESPONSE_RESERVATION_SHALLOW_REQUEST_LATENCY = AlexaMetricsName.create("EXTERNAL_RESPONSE_RESERVATION_SHALLOW_REQUEST_LATENCY");
        public static final AlexaMetricsName EXTERNAL_RESPONSE_RESERVATION_SHALLOW_RESPONSE_DELTA_LATENCY = AlexaMetricsName.create("EXTERNAL_RESPONSE_RESERVATION_SHALLOW_RESPONSE_DELTA_LATENCY");
        public static final AlexaMetricsName INTERNAL_RESPONSE_RESERVATION_SHALLOW_AGREED_COUNT = AlexaMetricsName.create("INTERNAL_RESPONSE_RESERVATION_SHALLOW_AGREED_COUNT");
        public static final AlexaMetricsName INTERNAL_RESPONSE_RESERVATION_SHALLOW_DISPUTE_COUNT = AlexaMetricsName.create("INTERNAL_RESPONSE_RESERVATION_SHALLOW_DISPUTE_COUNT");
        public static final AlexaMetricsName INTERNAL_RESPONSE_RESERVATION_SHALLOW_REQUEST_LATENCY = AlexaMetricsName.create("INTERNAL_RESPONSE_RESERVATION_SHALLOW_REQUEST_LATENCY");
        public static final AlexaMetricsName INTERNAL_RESPONSE_RESERVATION_SHALLOW_RESULT_LATENCY = AlexaMetricsName.create("INTERNAL_RESPONSE_RESERVATION_SHALLOW_RESULT_LATENCY");
        public static final AlexaMetricsName RESPONSE_COORDINATION_RACE_CONDITION_SHALLOW_DOUBLE_DISPUTE = AlexaMetricsName.create("RESPONSE_COORDINATION_RACE_CONDITION_SHALLOW_DOUBLE_DISPUTE");
        public static final AlexaMetricsName EXTERNAL_RESERVED_RESPONSE_STARTED_LATENCY = AlexaMetricsName.create("EXTERNAL_RESERVED_RESPONSE_STARTED_LATENCY");
        public static final AlexaMetricsName RESPONSE_COORDINATION_REQUIRED_COUNT = AlexaMetricsName.create("RESPONSE_COORDINATION_REQUIRED_COUNT");
        public static final AlexaMetricsName INTERNAL_RESERVED_COUNT = AlexaMetricsName.create("INTERNAL_RESERVED_COUNT");
        public static final AlexaMetricsName EXTERNAL_RESERVED_COUNT = AlexaMetricsName.create("EXTERNAL_RESERVED_COUNT");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SdkUsage {
        public static final AlexaMetricsName BIND_SERVICE_FAILED = AlexaMetricsName.create("BIND_SERVICE_FAILED");
        public static final AlexaMetricsName CLIENT_CONNECTED = AlexaMetricsName.create("CLIENT_CONNECTED");
        public static final AlexaMetricsName CLIENT_DISCONNECTED = AlexaMetricsName.create("CLIENT_DISCONNECTED");
        public static final AlexaMetricsName CLIENT_CONNECTION_LATENCY = AlexaMetricsName.create("CLIENT_CONNECTION_LATENCY");
        public static final AlexaMetricsName UNBIND_SERVICE_FAILED = AlexaMetricsName.create("UNBIND_SERVICE_FAILED");
        public static final AlexaMetricsName FOREGROUND_START_NOT_ALLOWED = AlexaMetricsName.create("FOREGROUND_START_NOT_ALLOWED");
        public static final AlexaMetricsName SERVICE_START_FAILED_REASON_PREFIX = AlexaMetricsName.create("SERVICE_START_FAILED_REASON_");
        public static final AlexaMetricsName API_USAGE_BEFORE_SETTING_LOCALE_PREFIX = AlexaMetricsName.create("API_CALLED_BEFORE_SETTING_LOCALE");

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ApiCalls {
            private static final AlexaMetricsName API_CALL = AlexaMetricsName.create("API_CALL").appendInjectable();

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Client {
                public static final AlexaMetricsName ATTEMPT;
                private static final AlexaMetricsName CLIENT;
                public static final AlexaMetricsName FAILURE;
                public static final AlexaMetricsName FAULT;

                static {
                    AlexaMetricsName appendToAlexaMetricsName = ApiCalls.API_CALL.appendToAlexaMetricsName("CLIENT");
                    CLIENT = appendToAlexaMetricsName;
                    ATTEMPT = appendToAlexaMetricsName.appendToAlexaMetricsName("ATTEMPT");
                    FAILURE = appendToAlexaMetricsName.appendToAlexaMetricsName("FAILURE");
                    FAULT = appendToAlexaMetricsName.appendToAlexaMetricsName("FAULT");
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Service {
                public static final AlexaMetricsName ATTEMPT;
                public static final AlexaMetricsName FAILURE;
                private static final AlexaMetricsName SERVICE;
                public static final AlexaMetricsName SUCCESS;
                public static final AlexaMetricsName TEARDOWN;

                static {
                    AlexaMetricsName appendToAlexaMetricsName = ApiCalls.API_CALL.appendToAlexaMetricsName("SERVICE");
                    SERVICE = appendToAlexaMetricsName;
                    ATTEMPT = appendToAlexaMetricsName.appendToAlexaMetricsName("ATTEMPT");
                    SUCCESS = appendToAlexaMetricsName.appendToAlexaMetricsName("SUCCESS");
                    FAILURE = appendToAlexaMetricsName.appendToAlexaMetricsName("FAILURE");
                    TEARDOWN = appendToAlexaMetricsName.appendToAlexaMetricsName("TEARDOWN");
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SearchUiEvents {
        public static final AlexaMetricsName VOX_SIMBA_ITEM_SELECTED = AlexaMetricsName.create("VOX_SIMBA_ITEM_SELECTED");
        public static final AlexaMetricsName VOX_SIMBA_PILL_SHOWN = AlexaMetricsName.create("VOX_SIMBA_PILL_SHOWN");
        public static final AlexaMetricsName VOX_TTA_LOCAL_PILL_SHOWN = AlexaMetricsName.create("VOX_TTA_LOCAL_PILL_SHOWN");
        public static final AlexaMetricsName VOX_TTA_LOCAL_PILL_SELECTED = AlexaMetricsName.create("VOX_TTA_LOCAL_PILL_SELECTED");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API");
        public static final AlexaMetricsName VOX_SIMBA_AVS_SPEAK_DIRECTIVE_RECEIVED = AlexaMetricsName.create("VOX_SIMBA_AVS_SPEAK_DIRECTIVE_RECEIVED");
        public static final AlexaMetricsName VOX_SIMBA_FRICTIVE_PROMPTS_API = AlexaMetricsName.create("VOX_SIMBA_FRICTIVE_PROMPTS_API");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API_CALL_COUNT = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API_CALL_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API_FAIL_COUNT = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API_FAIL_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API_SUCCESS_COUNT = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API_SUCCESS_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_UPDATE_INTERACTION_API = AlexaMetricsName.create("VOX_SIMBA_UPDATE_INTERACTION_API");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTIONS_CALL_COUNT = AlexaMetricsName.create("VOX_SIMBA_SUGGESTIONS_CALL_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTIONS_FAIL_COUNT = AlexaMetricsName.create("VOX_SIMBA_SUGGESTIONS_FAIL_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTIONS_SUCCESS_COUNT = AlexaMetricsName.create("VOX_SIMBA_SUGGESTIONS_SUCCESS_COUNT");
        public static final AlexaMetricsName VOX_SIMBA_SWITCH_TO_VOICE = AlexaMetricsName.create("VOX_SIMBA_SWITCH_TO_VOICE");
        public static final AlexaMetricsName VOX_SIMBA_SHOW_MORE_TAPPED = AlexaMetricsName.create("VOX_SIMBA_SHOW_MORE_TAPPED");
        public static final AlexaMetricsName VOX_SIMBA_SHOW_MORE_DISPLAYED = AlexaMetricsName.create("VOX_SIMBA_SHOW_MORE_DISPLAYED");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTION_NOT_SELECTED = AlexaMetricsName.create("VOX_SIMBA_SUGGESTION_NOT_SELECTED");
        public static final AlexaMetricsName VOX_SIMBA_FRICTIVE_UTTERANCE = AlexaMetricsName.create("VOX_SIMBA_FRICTIVE_UTTERANCE");
        public static final AlexaMetricsName VOX_SIMBA_INCHAT_SHOWN = AlexaMetricsName.create("VOX_SIMBA_INCHAT_SHOWN");
        public static final AlexaMetricsName VOX_SIMBA_RESULT_SHOWN = AlexaMetricsName.create("VOX_SIMBA_RESULT_SHOWN");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTION_SHOWN = AlexaMetricsName.create("VOX_SIMBA_SUGGESTION_SHOWN");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTIONS_DISABLED_AND_CLEARED = AlexaMetricsName.create("VOX_SIMBA_SUGGESTIONS_DISABLED_AND_CLEARED");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API_CANCELLED = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API_CANCELLED");
        public static final AlexaMetricsName VOX_CHARS_BEFORE_SUGGESTIONS = AlexaMetricsName.create("VOX_CHARS_BEFORE_SUGGESTIONS");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTION_SELECTED_INDEX = AlexaMetricsName.create("VOX_SIMBA_SUGGESTION_SELECTED_INDEX");
        public static final AlexaMetricsName VOX_SIMBA_RESULT_SELECTED_INDEX = AlexaMetricsName.create("VOX_SIMBA_RESULT_SELECTED_INDEX");
        public static final AlexaMetricsName VOX_SIMBA_SEARCH_API_LATENCY = AlexaMetricsName.create("VOX_SIMBA_SEARCH_API_LATENCY");
        public static final AlexaMetricsName VOX_SIMBA_SUGGESTIONS_API_LATENCY = AlexaMetricsName.create("VOX_SIMBA_SUGGESTIONS_API_LATENCY");
        public static final AlexaMetricsName VOX_SIMBA_FRICTIVE_PROMPTS_API_LATENCY = AlexaMetricsName.create("VOX_SIMBA_FRICTIVE_PROMPTS_API_LATENCY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SettingsUpdate {
        public static final AlexaMetricsName SEND_SUPPORTS_MOBILE_DOWNCHANNEL_SUCCEEDED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_SUPPORTS_MOBILE_DOWNCHANNEL_SUCCEEDED");
        public static final AlexaMetricsName SEND_SUPPORTS_MOBILE_DOWNCHANNEL_FAILED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_SUPPORTS_MOBILE_DOWNCHANNEL_FAILED");
        public static final AlexaMetricsName SEND_TIMEZONE_SUCCEEDED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_TIMEZONE_SUCCEEDED");
        public static final AlexaMetricsName SEND_TIMEZONE_FAILED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_TIMEZONE_FAILED");
        public static final AlexaMetricsName SEND_LOCALE_SUCCEEDED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_LOCALE_SUCCEEDED");
        public static final AlexaMetricsName SEND_LOCALE_FAILED = AlexaMetricsName.create("SETTINGS_UPDATE_SEND_LOCALE_FAILED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SmartFragmentEvents {
        public static final AlexaMetricsName SF_EXPAND_EVENT = AlexaMetricsName.create("SF_EXPAND_EVENT");
        public static final AlexaMetricsName SF_CHANGE_DISPLAY_EVENT = AlexaMetricsName.create("SF_CHANGE_DISPLAY_EVENT");
        public static final AlexaMetricsName SF_INVOKE_OPERATION_EVENT = AlexaMetricsName.create("SF_INVOKE_OPERATION_EVENT");
        public static final AlexaMetricsName SF_TEXT_MESSAGE_EVENT = AlexaMetricsName.create("SF_TEXT_MESSAGE_EVENT");
        public static final AlexaMetricsName SF_SEND_EVENT = AlexaMetricsName.create("SF_SEND_EVENT");
        public static final AlexaMetricsName SF_FRAGMENT_PRESSED = AlexaMetricsName.create("SF_FRAGMENT_PRESSED");
        public static final AlexaMetricsName SF_EXPANDED_VIEW_RENDERED = AlexaMetricsName.create("SF_EXPANDED_VIEW_RENDERED");
        public static final AlexaMetricsName SF_EXPANDED_VIEW_DISMISSED = AlexaMetricsName.create("SF_EXPANDED_VIEW_DISMISSED");
        public static final AlexaMetricsName FRAGMENT_OPEN_URL_EVENT = AlexaMetricsName.create("FRAGMENT_OPEN_URL_EVENT");
        public static final AlexaMetricsName PUBLISH_SMART_FRAGMENT_METRICS = AlexaMetricsName.create("PUBLISH_SMART_FRAGMENT_METRICS");
        public static final AlexaMetricsName SMART_FRAGMENT_DISPLAYED = AlexaMetricsName.create("SMART_FRAGMENT_DISPLAYED");
        public static final AlexaMetricsName SF_PAYLOAD_RECEIVED = AlexaMetricsName.create("SF_PAYLOAD_RECEIVED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechMarks {
        public static final AlexaMetricsName TTS_UNSUPPORTED_MP3_FRAME = AlexaMetricsName.create("TTS_UNSUPPORTED_MP3_FRAME");
        public static final AlexaMetricsName TTS_PARSING_EXCEPTION = AlexaMetricsName.create("TTS_PARSING_EXCEPTION");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SynchronizeState {
        public static final AlexaMetricsName SYNCHRONIZE_STATE_FAILED = AlexaMetricsName.create("SYNCHRONIZE_STATE_FAILED");
        public static final AlexaMetricsName SYNCHRONIZE_STATE_FAILED_ON_DOWNCHANNEL_ESTABLISHMENT = AlexaMetricsName.create("SYNCHRONIZE_STATE_FAILED_ON_DOWNCHANNEL_ESTABLISHMENT");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TextInteraction {
        public static final AlexaMetricsName ATTEMPT = AlexaMetricsName.create("TEXT_INTERACTION_ATTEMPT");
        public static final AlexaMetricsName SUCCESS = AlexaMetricsName.create("TEXT_INTERACTION_SUCCESS");
        public static final AlexaMetricsName FAILURE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE");
        public static final AlexaMetricsName ABANDONED = AlexaMetricsName.create("TEXT_INTERACTION_ABANDONED");
        public static final AlexaMetricsName STREAMING_PARTIAL_TO_COMPLETE = AlexaMetricsName.create("TEXT_INTERACTION_STREAMING_PARTIAL_TO_COMPLETE");
        public static final AlexaMetricsName STREAMING_PARTIAL_SENT = AlexaMetricsName.create("TEXT_INTERACTION_STREAMING_PARTIAL_SENT");

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Abandoned {
            public static final AlexaMetricsName OUT_OF_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_CANNOT_REQUEST_DIALOG;
            public static final AlexaMetricsName OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_CONTINUE_INVALID_DIALOG;
            public static final AlexaMetricsName OUT_OF_TURN_DIALOG_NOT_CURRENT;
            public static final AlexaMetricsName OUT_OF_TURN_DIALOG_NOT_STARTED;
            public static final AlexaMetricsName OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN;
            public static final AlexaMetricsName OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_START_DIALOG_NOT_ALLOWED;
            public static final AlexaMetricsName OUT_OF_TURN_UNEXPECTED_NEXT_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_UNEXPECTED_TURN;
            public static final AlexaMetricsName SCREEN_LOCKED = AlexaMetricsName.create("TEXT_INTERACTION_ABANDONED.SCREEN_LOCKED");
            public static final AlexaMetricsName SOURCE_ARBITRATION = AlexaMetricsName.create("TEXT_INTERACTION_ABANDONED.SOURCE_ARBITRATION");
            public static final AlexaMetricsName TEXT_TRANSFORMATION_FAILURE = AlexaMetricsName.create("TEXT_INTERACTION_ABANDONED.TEXT_TRANSFORMATION_FAILURE");

            static {
                AlexaMetricsName create = AlexaMetricsName.create("TEXT_INTERACTION_ABANDONED.OUT_OF_TURN");
                OUT_OF_TURN = create;
                OUT_OF_TURN_CANNOT_REQUEST_DIALOG = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CANNOT_REQUEST_DIALOG");
                OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CANNOT_REQUEST_FIRST_TURN");
                OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".REQUEST_NOT_ALLOWED_TO_BARGE_IN");
                OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN");
                OUT_OF_TURN_DIALOG_NOT_STARTED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".DIALOG_NOT_STARTED");
                OUT_OF_TURN_DIALOG_NOT_CURRENT = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".DIALOG_NOT_CURRENT");
                OUT_OF_TURN_UNEXPECTED_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".UNEXPECTED_TURN");
                OUT_OF_TURN_UNEXPECTED_NEXT_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".UNEXPECTED_NEXT_TURN");
                OUT_OF_TURN_START_DIALOG_NOT_ALLOWED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".START_DIALOG_NOT_ALLOWED");
                OUT_OF_TURN_CONTINUE_INVALID_DIALOG = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CONTINUE_INVALID_DIALOG");
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Failure {
            public static final AlexaMetricsName BINDING_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.BINDING_ERROR");
            public static final AlexaMetricsName LOCAL_SERVICE_DISCONNECTED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.LOCAL_SERVICE_DISCONNECTED");
            public static final AlexaMetricsName LEADER_SELECTION_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.LEADER_SELECTION_ERROR");
            public static final AlexaMetricsName LEADER_DISABLED_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.LEADER_DISABLED");
            public static final AlexaMetricsName NETWORK_UNAVAILABLE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.NETWORK_UNAVAILABLE");
            public static final AlexaMetricsName AVS_UNAVAILABLE_MISSING = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_UNAVAILABLE.MISSING");
            public static final AlexaMetricsName AVS_UNAVAILABLE_DOWNCHANNEL = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_UNAVAILABLE.DOWNCHANNEL");
            public static final AlexaMetricsName AVS_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_ERROR");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_UNINITIALIZED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.UNINITIALIZED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_UNAUTHORIZED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.UNAUTHORIZED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_NETWORK = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.NETWORK");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CONNECTION_NOT_ESTABLISHED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CONNECTION_NOT_CONNECTED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.DOWNCHANNEL_AVAILABLE");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CAPABILITY_PUBLISH");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.SYNCHRONIZE_STATE");
            public static final AlexaMetricsName TURN_TIMEOUT = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.TURN_TIMEOUT");
            public static final AlexaMetricsName NETWORK_REQUEST_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.NETWORK_REQUEST_ERROR");
            public static final AlexaMetricsName RESPONSE_PARSING_ERROR_MULTIPART = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RESPONSE_PARSING_ERROR_MULTIPART");
            public static final AlexaMetricsName RESPONSE_PARSING_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RESPONSE_PARSING_ERROR");
            public static final AlexaMetricsName REQUEST_PARSING_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.REQUEST_PARSING_ERROR");
            public static final AlexaMetricsName AUTHORIZATION_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AUTHORIZATION_ERROR");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_MESSAGING = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_MESSAGING");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.CLIENT_TIMEOUT_EXCEEDED");
            public static final AlexaMetricsName INVOCATION_CANCELLED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INVOCATION_CANCELLED");
            public static final AlexaMetricsName ATTACHMENT_READ_FAILURE = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.ATTACHMENT_READ_FAILURE");
            public static final AlexaMetricsName NETWORK_LOST = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.NETWORK_LOST");
            public static final AlexaMetricsName NETWORK_SWITCHED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.NETWORK_SWITCHED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY");
            public static final AlexaMetricsName CANNOT_EXPECT_SPEECH = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.CANNOT_EXPECT_SPEECH");
            public static final AlexaMetricsName START_RECORDING_ERROR = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.START_RECORDING_ERROR");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED");
            public static final AlexaMetricsName RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_START_RECORDING = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_START_RECORDING");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC");
            public static final AlexaMetricsName RECORDING_ERROR_START_TIMEOUT = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_START_TIMEOUT");
            public static final AlexaMetricsName RECORDING_ERROR_STOP_TIMEOUT = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_STOP_TIMEOUT");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD");
            public static final AlexaMetricsName RECORDING_ERROR_IO_EXCEPTION = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_IO_EXCEPTION");
            public static final AlexaMetricsName RECORDING_ERROR_INITIALIZATION_EXCEPTION = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_INITIALIZATION_EXCEPTION");
            public static final AlexaMetricsName RECORDING_ERROR_STOPPED_THREAD = AlexaMetricsName.create("TEXT_INTERACTION_FAILURE.RECORDING_ERROR_STOPPED_THREAD");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TextUiEvents {
        public static final AlexaMetricsName VOX_TTA_LAUNCHED = AlexaMetricsName.create("VOX_TTA_LAUNCHED");
        public static final AlexaMetricsName VOX_TTA_CLOSED = AlexaMetricsName.create("VOX_TTA_CLOSED");
        public static final AlexaMetricsName VOX_TTA_MESSAGE_WELCOME_SHOWN = AlexaMetricsName.create("VOX_TTA_MESSAGE_WELCOME_SHOWN");
        public static final AlexaMetricsName VOX_TTA_MESSAGE_RETURNING_SHOWN = AlexaMetricsName.create("VOX_TTA_MESSAGE_RETURNING_SHOWN");
        public static final AlexaMetricsName VOX_TTA_MESSAGE_HISTORY_SHOWN = AlexaMetricsName.create("VOX_TTA_MESSAGE_HISTORY_SHOWN");
        public static final AlexaMetricsName VOX_TTA_MESSAGE_REFRESH_SHOWN = AlexaMetricsName.create("VOX_TTA_MESSAGE_REFRESH_SHOWN");
        public static final AlexaMetricsName VOX_TTA_DIALOG_SESSION_ENDED = AlexaMetricsName.create("VOX_TTA_DIALOG_SESSION_ENDED");
        public static final AlexaMetricsName VOX_TTA_CLEAR_SCREEN_ON_VOICE = AlexaMetricsName.create("VOX_TTA_CLEAR_SCREEN_ON_VOICE");
        public static final AlexaMetricsName VOX_TTA_IN_CHAT_LINK_GENERATED = AlexaMetricsName.create("VOX_TTA_IN_CHAT_LINK_GENERATED");
        public static final AlexaMetricsName VOX_TTA_IN_CHAT_LINK_TAPPED = AlexaMetricsName.create("VOX_TTA_IN_CHAT_LINK_TAPPED");
        public static final AlexaMetricsName VOX_TTA_SWITCHED_TO_SCRIM = AlexaMetricsName.create("VOX_TTA_SWITCHED_TO_SCRIM");
        public static final AlexaMetricsName VOX_TTA_MESSAGE_HANDLER_INTERACTOR_MISSING = AlexaMetricsName.create("VOX_TTA_MESSAGE_HANDLER_INTERACTOR_MISSING");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TextUiEventsLatency {
        public static final AlexaMetricsName VOX_TTA_VISIBLE_LATENCY = AlexaMetricsName.create("VOX_TTA_VISIBLE_LATENCY");
        public static final AlexaMetricsName VOX_TTA_RESPONSE_MESSAGE_RENDERED_LATENCY = AlexaMetricsName.create("VOX_TTA_RESPONSE_MESSAGE_RENDERED_LATENCY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TouchInteraction {
        public static final AlexaMetricsName ATTEMPT = AlexaMetricsName.create("TOUCH_INTERACTION_ATTEMPT");
        public static final AlexaMetricsName SUCCESS = AlexaMetricsName.create("TOUCH_INTERACTION_SUCCESS");
        public static final AlexaMetricsName FAILURE = AlexaMetricsName.create("TOUCH_INTERACTION_FAILURE");
        public static final AlexaMetricsName ABANDONED = AlexaMetricsName.create("TOUCH_INTERACTION_ABANDONED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UiEvents {
        public static final AlexaMetricsName ATTENTION_SYSTEM_DISMISSED = AlexaMetricsName.create("ATTENTION_SYSTEM_DISMISSED");
        public static final AlexaMetricsName CARD_INGRESS_TAPPED = AlexaMetricsName.create("CARD_INGRESS_TAPPED");
        public static final AlexaMetricsName CARD_SHOWN = AlexaMetricsName.create("CARD_SHOWN");
        public static final AlexaMetricsName CARD_INTERACTED = AlexaMetricsName.create("CARD_INTERACTED");
        public static final AlexaMetricsName NAVIGATION_TO_EXTERNAL_LINK = AlexaMetricsName.create("NAVIGATION_TO_EXTERNAL_LINK");
        public static final AlexaMetricsName NAVIGATION_TO_INTERNAL_CARD = AlexaMetricsName.create("NAVIGATION_TO_INTERNAL_CARD");
        public static final AlexaMetricsName CARD_MATCHING_SUCCESS = AlexaMetricsName.create("CARD_MATCHING_SUCCESS");
        public static final AlexaMetricsName CARD_CONTROLLER_CREATION_ERROR = AlexaMetricsName.create("CARD_CONTROLLER_CREATION_ERROR");
        public static final AlexaMetricsName CARD_CREATION_ERROR = AlexaMetricsName.create("CARD_CREATION_ERROR");
        public static final AlexaMetricsName JSON_PARSING_VALID_JSON = AlexaMetricsName.create("JSON_PARSING_VALID_JSON");
        public static final AlexaMetricsName JSON_PARSING_ERROR = AlexaMetricsName.create("JSON_PARSING_ERROR");
        public static final AlexaMetricsName CARD_RENDER_SUCCESSFUL = AlexaMetricsName.create("CARD_RENDER_SUCCESSFUL");
        public static final AlexaMetricsName VUPL_RENDERING_STARTED = AlexaMetricsName.create("UserPerceivedLatency.Visual.RenderStart");
        public static final AlexaMetricsName VUPL_RENDERED = AlexaMetricsName.create("UserPerceivedLatency.Visual");
        public static final AlexaMetricsName VISUAL_RESPONSE_RENDERED = AlexaMetricsName.create(MetricsDelegateAdapter.VRR_METRIC_NAME);
        public static final AlexaMetricsName REMOTE_VISUAL_PREAMBLE_RENDER_STARTED = AlexaMetricsName.create("REMOTE_VISUAL_PREAMBLE_RENDER_STARTED");
        public static final AlexaMetricsName REMOTE_VISUAL_PREAMBLE_RENDERED = AlexaMetricsName.create("REMOTE_VISUAL_PREAMBLE_RENDERED");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RENDER_STARTED = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RENDER_STARTED");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RENDERED = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RENDERED");
        public static final AlexaMetricsName REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION = AlexaMetricsName.create("REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION");
        public static final AlexaMetricsName REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION = AlexaMetricsName.create("REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RENDERED_POST_IDLE = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RENDERED_POST_IDLE");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING");
        public static final AlexaMetricsName REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE = AlexaMetricsName.create("REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE");
        public static final AlexaMetricsName LOCAL_VISUAL_ERROR_RENDERED = AlexaMetricsName.create("LOCAL_VISUAL_ERROR_RENDERED");
        public static final AlexaMetricsName LOCAL_VISUAL_RESPONSE_RENDERED = AlexaMetricsName.create("LOCAL_VISUAL_RESPONSE_RENDERED");
        public static final AlexaMetricsName USER_REQUEST_RENDERED = AlexaMetricsName.create("USER_REQUEST_RENDERED");
        public static final AlexaMetricsName SUGGESTION_CONTAINER_FRAGMENT_RECEIVED = AlexaMetricsName.create("SUGGESTION_CONTAINER_FRAGMENT_RECEIVED");
        public static final AlexaMetricsName SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED = AlexaMetricsName.create("SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED");
        public static final AlexaMetricsName REMOTE_VISUAL_AGENT_FRAGMENT_PARSED = AlexaMetricsName.create("REMOTE_VISUAL_AGENT_FRAGMENT_PARSED");
        public static final AlexaMetricsName REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED = AlexaMetricsName.create("REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED");
        public static final AlexaMetricsName REMOTE_VISUAL_FRAGMENT_ADDED_TO_MODEL = AlexaMetricsName.create("REMOTE_VISUAL_FRAGMENT_ADDED_TO_MODEL");
        public static final AlexaMetricsName REMOTE_VISUAL_FRAGMENT_STATE_UPDATED = AlexaMetricsName.create("REMOTE_VISUAL_FRAGMENT_STATE_UPDATED");
        public static final AlexaMetricsName REMOTE_VISUAL_COMPOSE_RENDER_INVOKED = AlexaMetricsName.create("REMOTE_VISUAL_COMPOSE_RENDER_INVOKED");
        public static final AlexaMetricsName REMOTE_VISUAL_FRAGMENT_PRECONDITION_MET = AlexaMetricsName.create("REMOTE_VISUAL_FRAGMENT_PRECONDITION_MET");
        public static final AlexaMetricsName REMOTE_VISUAL_VIEWMODEL_EVENT_DISPATCHED = AlexaMetricsName.create("REMOTE_VISUAL_VIEWMODEL_EVENT_DISPATCHED");
        public static final AlexaMetricsName ADD_FRAGMENTS_IPC_PAYLOAD_SENT = AlexaMetricsName.create("ADD_FRAGMENTS_IPC_PAYLOAD_SENT");
        public static final AlexaMetricsName ADD_FRAGMENTS_IPC_PAYLOAD_RECEIVED = AlexaMetricsName.create("ADD_FRAGMENTS_IPC_PAYLOAD_RECEIVED");
        public static final AlexaMetricsName ADD_FRAGMENTS_PARSING_FAILED = AlexaMetricsName.create("ADD_FRAGMENTS_PARSING_FAILED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DIRECTIVE_PARSED_FROM_HTTP = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DIRECTIVE_PARSED_FROM_HTTP");
        public static final AlexaMetricsName ADDFRAGMENTS_HTTP_RESPONSE_PARSE_FAILED = AlexaMetricsName.create("ADDFRAGMENTS_HTTP_RESPONSE_PARSE_FAILED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DIRECTIVE_DISPATCHED_TO_CAPABILITY_AGENT = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DIRECTIVE_DISPATCHED_TO_CAPABILITY_AGENT");
        public static final AlexaMetricsName ADDFRAGMENTS_PENDING_DIRECTIVES_CANCELLED = AlexaMetricsName.create("ADDFRAGMENTS_PENDING_DIRECTIVES_CANCELLED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DIRECTIVE_DROPPED_RESPONSE_ALREADY_RESERVED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DIRECTIVE_DROPPED_RESPONSE_ALREADY_RESERVED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DIRECTIVE_SENT_VIA_BINDER_IPC = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DIRECTIVE_SENT_VIA_BINDER_IPC");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DIRECTIVE_BINDER_IPC_FAILED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DIRECTIVE_BINDER_IPC_FAILED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZED_IN_UI = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZED_IN_UI");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZATION_FAILED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZATION_FAILED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_BROADCAST_DELIVERED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_BROADCAST_DELIVERED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_BROADCAST_NO_RECEIVER = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_BROADCAST_NO_RECEIVER");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_EXTRACTED_FROM_INTENT = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_EXTRACTED_FROM_INTENT");
        public static final AlexaMetricsName ADDFRAGMENTS_BROADCAST_MISSING_REQUIRED_FIELD = AlexaMetricsName.create("ADDFRAGMENTS_BROADCAST_MISSING_REQUIRED_FIELD");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_DROPPED_WRONG_CONVERSATION = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_DROPPED_WRONG_CONVERSATION");
        public static final AlexaMetricsName ADDFRAGMENTS_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC = AlexaMetricsName.create("ADDFRAGMENTS_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC");
        public static final AlexaMetricsName ADDFRAGMENTS_CONVERSATION_CHANGED_FRAGMENTS_CLEARED = AlexaMetricsName.create("ADDFRAGMENTS_CONVERSATION_CHANGED_FRAGMENTS_CLEARED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_PARSING_STARTED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_PARSING_STARTED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENTS_IDENTIFIED_IN_DIRECTIVE = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENTS_IDENTIFIED_IN_DIRECTIVE");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_ADDED_TO_TREE = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_ADDED_TO_TREE");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_UPDATED_HIGHER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_UPDATED_HIGHER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_EXPIRED = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_EXPIRED");
        public static final AlexaMetricsName ADDFRAGMENTS_FRAGMENT_TREE_EMITTED_VIA_SHAREDFLOW = AlexaMetricsName.create("ADDFRAGMENTS_FRAGMENT_TREE_EMITTED_VIA_SHAREDFLOW");
        public static final AlexaMetricsName ADDFRAGMENTS_FRAGMENT_TREE_UNCHANGED_NO_EMISSION = AlexaMetricsName.create("ADDFRAGMENTS_FRAGMENT_TREE_UNCHANGED_NO_EMISSION");
        public static final AlexaMetricsName ADDFRAGMENTS_VIEWMODEL_COLLECTED_FRAGMENT_TREE = AlexaMetricsName.create("ADDFRAGMENTS_VIEWMODEL_COLLECTED_FRAGMENT_TREE");
        public static final AlexaMetricsName ADDFRAGMENTS_COMPOSE_STATE_UPDATED_RECOMPOSITION_TRIGGERED = AlexaMetricsName.create("ADDFRAGMENTS_COMPOSE_STATE_UPDATED_RECOMPOSITION_TRIGGERED");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_FRAGMENT_FILTERED_BEFORE_RENDER = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_FRAGMENT_FILTERED_BEFORE_RENDER");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_TEXT_DISPATCHED_TO_LAZYCOLUMN = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_TEXT_DISPATCHED_TO_LAZYCOLUMN");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_TEXT_ENTERED_RESPONSE_COMPOSABLE = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_TEXT_ENTERED_RESPONSE_COMPOSABLE");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_COMPOSING = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_COMPOSING");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE");
        public static final AlexaMetricsName ADDFRAGMENTS_AGENT_TEXT_DISPOSED_WHILE_STREAMING = AlexaMetricsName.create("ADDFRAGMENTS_AGENT_TEXT_DISPOSED_WHILE_STREAMING");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_PAYLOAD_DESERIALIZED_IN_UI = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_PAYLOAD_DESERIALIZED_IN_UI");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_BROADCAST_DELIVERED = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_BROADCAST_DELIVERED");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_BROADCAST_NO_RECEIVER = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_BROADCAST_NO_RECEIVER");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_EXTRACTED_FROM_INTENT = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_EXTRACTED_FROM_INTENT");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_DROPPED_WRONG_CONVERSATION = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_DROPPED_WRONG_CONVERSATION");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_CONVERSATION_CHANGED_FRAGMENTS_CLEARED = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_CONVERSATION_CHANGED_FRAGMENTS_CLEARED");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_PARSING_STARTED = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_PARSING_STARTED");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_ADDED_TO_TREE = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_ADDED_TO_TREE");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_UPDATED_HIGHER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_UPDATED_HIGHER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_EXPIRED = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_EXPIRED");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_FRAGMENT_FILTERED_BEFORE_RENDER = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_FRAGMENT_FILTERED_BEFORE_RENDER");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_TEXT_DISPATCHED_TO_LAZYCOLUMN = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_TEXT_DISPATCHED_TO_LAZYCOLUMN");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_TEXT_ENTERED_RESPONSE_COMPOSABLE = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_TEXT_ENTERED_RESPONSE_COMPOSABLE");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_COMPOSING = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_COMPOSING");
        public static final AlexaMetricsName ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_ANIMATION_COMPLETE = AlexaMetricsName.create("ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_ANIMATION_COMPLETE");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_PAYLOAD_DESERIALIZED_IN_UI = AlexaMetricsName.create("ADDFRAGMENTS_USER_PAYLOAD_DESERIALIZED_IN_UI");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_BROADCAST_DELIVERED = AlexaMetricsName.create("ADDFRAGMENTS_USER_BROADCAST_DELIVERED");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_BROADCAST_NO_RECEIVER = AlexaMetricsName.create("ADDFRAGMENTS_USER_BROADCAST_NO_RECEIVER");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_EXTRACTED_FROM_INTENT = AlexaMetricsName.create("ADDFRAGMENTS_USER_EXTRACTED_FROM_INTENT");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_DROPPED_WRONG_CONVERSATION = AlexaMetricsName.create("ADDFRAGMENTS_USER_DROPPED_WRONG_CONVERSATION");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC = AlexaMetricsName.create("ADDFRAGMENTS_USER_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_CONVERSATION_CHANGED_FRAGMENTS_CLEARED = AlexaMetricsName.create("ADDFRAGMENTS_USER_CONVERSATION_CHANGED_FRAGMENTS_CLEARED");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_PARSING_STARTED = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_PARSING_STARTED");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_ADDED_TO_TREE = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_ADDED_TO_TREE");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_UPDATED_HIGHER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_UPDATED_HIGHER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION");
        public static final AlexaMetricsName ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_EXPIRED = AlexaMetricsName.create("ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_EXPIRED");
        public static final AlexaMetricsName UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZED_IN_UI = AlexaMetricsName.create("UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZED_IN_UI");
        public static final AlexaMetricsName UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZATION_FAILED = AlexaMetricsName.create("UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZATION_FAILED");
        public static final AlexaMetricsName UPDATEFRAGMENTDATA_PAYLOAD_INVALID = AlexaMetricsName.create("UPDATEFRAGMENTDATA_PAYLOAD_INVALID");
        public static final AlexaMetricsName UPDATEFRAGMENTDATA_BROADCAST_NO_RECEIVER = AlexaMetricsName.create("UPDATEFRAGMENTDATA_BROADCAST_NO_RECEIVER");
        public static final AlexaMetricsName SENDFRAGMENTCOMMAND_PAYLOAD_DESERIALIZED_IN_UI = AlexaMetricsName.create("SENDFRAGMENTCOMMAND_PAYLOAD_DESERIALIZED_IN_UI");
        public static final AlexaMetricsName SENDFRAGMENTCOMMAND_PAYLOAD_DESERIALIZATION_FAILED = AlexaMetricsName.create("SENDFRAGMENTCOMMAND_PAYLOAD_DESERIALIZATION_FAILED");
        public static final AlexaMetricsName SENDFRAGMENTCOMMAND_PAYLOAD_INVALID = AlexaMetricsName.create("SENDFRAGMENTCOMMAND_PAYLOAD_INVALID");
        public static final AlexaMetricsName SENDFRAGMENTCOMMAND_BROADCAST_NO_RECEIVER = AlexaMetricsName.create("SENDFRAGMENTCOMMAND_BROADCAST_NO_RECEIVER");
        public static final AlexaMetricsName DEEPLINK_LAUNCHED_FROM_CONVERSATION = AlexaMetricsName.create("DEEPLINK_LAUNCHED_FROM_CONVERSATION");
        public static final AlexaMetricsName USER_NAVIGATED_AWAY = AlexaMetricsName.create("USER_NAVIGATED_AWAY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UiEventsLatency {
        public static final AlexaMetricsName CARD_CREATION = AlexaMetricsName.create("CARD_CREATION_LATENCY");
        public static final AlexaMetricsName JSON_PARSING = AlexaMetricsName.create("JSON_PARSING_LATENCY");
        public static final AlexaMetricsName CARD_VIEWS_CREATED = AlexaMetricsName.create("CARD_VIEWS_CREATED_LATENCY");
        public static final AlexaMetricsName CARD_RENDER = AlexaMetricsName.create("CARD_RENDER_LATENCY");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UserInitiatedSpeechRequest {
        public static final AlexaMetricsName STARTED = AlexaMetricsName.create("USER_INITIATED_SPEECH_REQUEST_STARTED");
        public static final AlexaMetricsName FAILED = AlexaMetricsName.create("USER_INITIATED_SPEECH_REQUEST_FAILED");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VoiceInteraction {
        public static final AlexaMetricsName ATTEMPT = AlexaMetricsName.create("VOICE_INTERACTION_ATTEMPT");
        public static final AlexaMetricsName SUCCESS = AlexaMetricsName.create("VOICE_INTERACTION_SUCCESS");
        public static final AlexaMetricsName FAILURE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE");
        public static final AlexaMetricsName ABANDONED = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED");
        public static final AlexaMetricsName CANCELLED = AlexaMetricsName.create("VOICE_INTERACTION_CANCELLED");
        public static final AlexaMetricsName PROGRESS = AlexaMetricsName.create("VOICE_INTERACTION_PROGRESS");

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Abandoned {
            public static final AlexaMetricsName NATURAL_TURN_NO_SPEECH;
            public static final AlexaMetricsName OUT_OF_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_CANNOT_REQUEST_DIALOG;
            public static final AlexaMetricsName OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_CONTINUE_INVALID_DIALOG;
            public static final AlexaMetricsName OUT_OF_TURN_DIALOG_NOT_CURRENT;
            public static final AlexaMetricsName OUT_OF_TURN_DIALOG_NOT_STARTED;
            public static final AlexaMetricsName OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN;
            public static final AlexaMetricsName OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_START_DIALOG_NOT_ALLOWED;
            public static final AlexaMetricsName OUT_OF_TURN_UNEXPECTED_NEXT_TURN;
            public static final AlexaMetricsName OUT_OF_TURN_UNEXPECTED_TURN;
            public static final AlexaMetricsName WAKE_WORD_AUDIO_INCOMPLETE;
            public static final AlexaMetricsName WAKE_WORD_ENGINE_NOT_READY;
            public static final AlexaMetricsName INVALID_AUDIO_METADATA = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.INVALID_AUDIO_METADATA");
            public static final AlexaMetricsName INVALID_WAKE_WORD = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.INVALID_WAKE_WORD");
            public static final AlexaMetricsName SCREEN_LOCKED = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.SCREEN_LOCKED");
            public static final AlexaMetricsName SOURCE_ARBITRATION = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.SOURCE_ARBITRATION");
            public static final AlexaMetricsName SPEECH_PROVIDER_NOT_REGISTERED = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.SPEECH_PROVIDER_NOT_REGISTERED");

            static {
                AlexaMetricsName create = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.OUT_OF_TURN");
                OUT_OF_TURN = create;
                OUT_OF_TURN_CANNOT_REQUEST_DIALOG = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CANNOT_REQUEST_DIALOG");
                OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CANNOT_REQUEST_FIRST_TURN");
                OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".REQUEST_NOT_ALLOWED_TO_BARGE_IN");
                OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN");
                OUT_OF_TURN_DIALOG_NOT_STARTED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".DIALOG_NOT_STARTED");
                OUT_OF_TURN_DIALOG_NOT_CURRENT = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".DIALOG_NOT_CURRENT");
                OUT_OF_TURN_UNEXPECTED_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".UNEXPECTED_TURN");
                OUT_OF_TURN_UNEXPECTED_NEXT_TURN = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".UNEXPECTED_NEXT_TURN");
                OUT_OF_TURN_START_DIALOG_NOT_ALLOWED = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".START_DIALOG_NOT_ALLOWED");
                OUT_OF_TURN_CONTINUE_INVALID_DIALOG = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(create, new StringBuilder(), ".CONTINUE_INVALID_DIALOG");
                WAKE_WORD_ENGINE_NOT_READY = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.WAKE_WORD_ENGINE_NOT_READY");
                WAKE_WORD_AUDIO_INCOMPLETE = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.WAKE_WORD_AUDIO_INCOMPLETE");
                NATURAL_TURN_NO_SPEECH = AlexaMetricsName.create("VOICE_INTERACTION_ABANDONED.NATURAL_TURN_NO_SPEECH");
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Cancelled {
            public static final AlexaMetricsName PAUSE_CONTROL = AlexaMetricsName.create("VOICE_INTERACTION_CANCELLED.PAUSE_CONTROL");
            public static final AlexaMetricsName CANCEL_USER_INTERACTION = AlexaMetricsName.create("VOICE_INTERACTION_CANCELLED.CANCEL_USER_INTERACTION");
            public static final AlexaMetricsName NATURAL_TURN_SESSION_STOPPED = AlexaMetricsName.create("VOICE_INTERACTION_CANCELLED.NATURAL_TURN_SESSION_STOPPED");
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Failure {
            public static final AlexaMetricsName ATTACHMENT_READ_FAILURE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.ATTACHMENT_READ_FAILURE");
            public static final AlexaMetricsName BINDING_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.BINDING_ERROR");
            public static final AlexaMetricsName LOCAL_SERVICE_DISCONNECTED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.LOCAL_SERVICE_DISCONNECTED");
            public static final AlexaMetricsName LEADER_SELECTION_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.LEADER_SELECTION_ERROR");
            public static final AlexaMetricsName LEADER_DISABLED_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.LEADER_DISABLED");
            public static final AlexaMetricsName NETWORK_UNAVAILABLE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.NETWORK_UNAVAILABLE");
            public static final AlexaMetricsName NETWORK_LOST = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.NETWORK_LOST");
            public static final AlexaMetricsName NETWORK_SWITCHED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.NETWORK_SWITCHED");
            public static final AlexaMetricsName AVS_UNAVAILABLE_MISSING = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_UNAVAILABLE.MISSING");
            public static final AlexaMetricsName AVS_UNAVAILABLE_DOWNCHANNEL = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_UNAVAILABLE.DOWNCHANNEL");
            public static final AlexaMetricsName AVS_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_ERROR");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_UNINITIALIZED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.UNINITIALIZED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_UNAUTHORIZED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.UNAUTHORIZED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_NETWORK = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.NETWORK");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CONNECTION_NOT_ESTABLISHED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CONNECTION_NOT_CONNECTED");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.DOWNCHANNEL_AVAILABLE");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.CAPABILITY_PUBLISH");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.SYNCHRONIZE_STATE");
            public static final AlexaMetricsName AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AVS_CONNECTION_TIMEOUT.VERIFY_ALEXA_GATEWAY");
            public static final AlexaMetricsName TURN_TIMEOUT = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.TURN_TIMEOUT");
            public static final AlexaMetricsName NETWORK_REQUEST_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.NETWORK_REQUEST_ERROR");
            public static final AlexaMetricsName START_RECORDING_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.START_RECORDING_ERROR");
            public static final AlexaMetricsName RESPONSE_PARSING_ERROR_MULTIPART = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RESPONSE_PARSING_ERROR_MULTIPART");
            public static final AlexaMetricsName RESPONSE_PARSING_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RESPONSE_PARSING_ERROR");
            public static final AlexaMetricsName REQUEST_PARSING_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.REQUEST_PARSING_ERROR");
            public static final AlexaMetricsName AUTHORIZATION_ERROR = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AUTHORIZATION_ERROR");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_MESSAGING = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_MESSAGING");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED");
            public static final AlexaMetricsName RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_START_RECORDING = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_START_RECORDING");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC");
            public static final AlexaMetricsName RECORDING_ERROR_START_TIMEOUT = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_START_TIMEOUT");
            public static final AlexaMetricsName RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD");
            public static final AlexaMetricsName RECORDING_ERROR_IO_EXCEPTION = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_IO_EXCEPTION");
            public static final AlexaMetricsName RECORDING_ERROR_STOP_TIMEOUT = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_STOP_TIMEOUT");
            public static final AlexaMetricsName RECORDING_ERROR_STOPPED_THREAD = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_STOPPED_THREAD");
            public static final AlexaMetricsName RECORDING_ERROR_INITIALIZATION_EXCEPTION = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.RECORDING_ERROR_INITIALIZATION_EXCEPTION");
            public static final AlexaMetricsName INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.CLIENT_TIMEOUT_EXCEEDED");
            public static final AlexaMetricsName CANNOT_EXPECT_SPEECH = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.CANNOT_EXPECT_SPEECH");
            public static final AlexaMetricsName AUDIO_FOCUS_REQUEST_FAILED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.AUDIO_FOCUS_REQUEST_FAILED");
            public static final AlexaMetricsName INVOCATION_CANCELLED = AlexaMetricsName.create("VOICE_INTERACTION_FAILURE.INVOCATION_CANCELLED");
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Recoverable {
            public static final AlexaMetricsName DOWNCHANNEL_CONNECTED = AlexaMetricsName.create("VOICE_INTERACTION_RECOVERABLE.DOWNCHANNEL_CONNECTED");
            public static final AlexaMetricsName DOWNCHANNEL_AVAILABLE = AlexaMetricsName.create("VOICE_INTERACTION_RECOVERABLE.DOWNCHANNEL_AVAILABLE");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WakeWordModel {
        public static final AlexaMetricsName WAKE_WORD_MODEL_DOWNLOAD_SUCCESS = AlexaMetricsName.create("WAKE_WORD_MODEL_DOWNLOAD_SUCCESS");
        public static final AlexaMetricsName WAKE_WORD_MODEL_DOWNLOAD_INTERRUPTED = AlexaMetricsName.create("WAKE_WORD_MODEL_DOWNLOAD_INTERRUPTED");
        public static final AlexaMetricsName WAKE_WORD_MODEL_DOWNLOAD_FAILURE = AlexaMetricsName.create("WAKE_WORD_MODEL_DOWNLOAD_FAILURE");
        public static final AlexaMetricsName WAKE_WORD_MODEL_LOCALE_MISMATCH = AlexaMetricsName.create("WAKE_WORD_MODEL_LOCALE_MISMATCH");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WakeWordValidation {
        public static final AlexaMetricsName WAKE_WORD_VALIDATION_TIMEOUT = AlexaMetricsName.create("WAKE_WORD_VALIDATION_TIMEOUT");
        public static final AlexaMetricsName WAKE_WORD_VALIDATION_LATENCY = AlexaMetricsName.create("WAKE_WORD_VALIDATION_LATENCY");
        public static final AlexaMetricsName WAKE_WORD_VALIDATION_SPEECH_OFFSET = AlexaMetricsName.create("WAKE_WORD_VALIDATION_SPEECH_OFFSET");
    }

    private AlexaMetricsName(String str) {
        this.value = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AlexaMetricsName create(String str) {
        return new AlexaMetricsName(str);
    }

    public AlexaMetricsName appendInjectable() {
        return appendToAlexaMetricsName("%s");
    }

    public AlexaMetricsName appendToAlexaMetricsName(@Nullable String str) {
        return create(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), this.value, ".", str));
    }

    public String appendWith(@Nullable String str) {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), this.value, ".", str);
    }

    public String getValue() {
        return this.value;
    }

    public AlexaMetricsName injectWith(@NonNull String str) {
        return create(String.format(java.util.Locale.US, this.value, str));
    }

    public String postfix(@Nullable String str) {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.value, str);
    }

    public String toString() {
        return getValue();
    }
}
