package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.voice.metrics.service.MetricsService;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class VoiceMetricsConstants {
    public static final String COMPONENT_VOICE_INGRESS = "VoiceIngress";
    public static final String COMPONENT_VOICE_SETTINGS = "HandsFreeSettings";
    public static final String COMPONENT_VOX_SPEECH = "vox_speech";
    public static final String CONVERSATION_CX_COMPONENT = "vox_conversation";
    public static final String CORE_STARTUP_DEPENDENCY_POST_INIT = "core_startup.dependency_post_init";
    public static final String LAUNCHER_WIDGET = "LAUNCHER_WIDGET";
    public static final String NEW_ROUTE_FETCH_FAILED = "NEW_ROUTE_FETCH_FAILED";
    public static final String NEW_ROUTE_FETCH_LATENCY = "NEW_ROUTE_FETCH_LATENCY";
    public static final String NEW_ROUTE_FETCH_SUCCESS = "NEW_ROUTE_FETCH_SUCCESS";
    public static final String NEW_ROUTE_NAVIGATION_SUCCESS = "NEW_ROUTE_NAVIGATION_SUCCESS";
    public static final String NEW_ROUTE_TOTAL_LATENCY = "NEW_ROUTE_TOTAL_LATENCY";
    public static final String NEW_ROUTE_TRIGGERED = "NEW_ROUTE_TRIGGERED";
    public static final String NOWPLAYING_ICON_TAPPED = "NOWPLAYING_ICON_TAPPED";
    public static final String OCCURRENCE_START_VOICE_SUCCESS = "occurrence_start_voice_success";
    public static final String OWNER_IDENTIFIER = "8eb5778d-5d99-45c4-b507-55fa502bbb43";
    public static final String QUICK_ACTIONS_WIDGET_ASK_ALEXA_LATENCY = "QUICK_ACTIONS_WIDGET_ASK_ALEXA_LATENCY";
    public static final String SDK_STARTUP_INVALID_START_TIME = "a4a_sdk_latency_invalid_start_time";
    public static final String SDK_STARTUP_LATENCY = "a4a_sdk_ready_latency";
    public static final String SDK_STARTUP_NEGATIVE_LATENCY = "a4a_sdk_latency_negative";
    public static final String SDK_STARTUP_RESULT = "a4a_sdk_failed";
    public static final String UTTERANCE_API_CALL_FAILED = "UTTERANCE_API_CALL_FAILED";
    public static final String VOX_LAUNCH_DELAYED_NOT_CONNECTED_YET = "VOX_DELAYED_NOT_CONNECTED";
    public static final String VOX_LAUNCH_FAILURE_AUDIO_NOT_AVAILABLE = "VOX_FAILURE_NO_AUDIO";
    public static final String VOX_LAUNCH_FAILURE_DOWNCHANNEL_CONNECTION_FAILED = "VOX_FAILED_DOWNCHANNEL_CONNECTION_FAILED";
    public static final String VOX_LAUNCH_FAILURE_NO_PERMISSIONS = "VOX_FAILED_NO_PERMISSIONS";
    public static final String VOX_MIC_CAN_START_RECORDING = "VOX_MIC_CAN_START_RECORDING";
    public static final String VOX_PERMISSIONS_REQUESTED = "VOX_PERMISSIONS_REQUESTED";
    public static final String VOX_PERMISSION_GRANT_RATE = "VOX_PERMISSION_GRANT_RATE";
    public static final String VOX_TAP_TO_SCRIM = "VOX_TAP_TO_SCRIM_VISIBLE_LATENCY";
    public static final String VOX_TAP_TO_VOICE_RECORD_START = "VOX_TAP_TO_VOICE_RECORD_START";
    public static final String WAKE_NOTIFICATION_LATENCY = "WAKE_NOTIFICATION_LATENCY";
    public static final String WAKE_UP_FAILED = "WAKE_UP_FAILED";
    public static final String WAKE_UP_SUCCESS = "WAKE_UP_SUCCESS";

    private VoiceMetricsConstants() {
        throw new RuntimeException("Attempt to create an instance of this class, crashing it!");
    }

    public static void recordPermissionsMetrics(String[] strArr, int[] iArr, MetricsService metricsService, String str) {
        metricsService.recordEvent(VOX_PERMISSIONS_REQUESTED, str, null);
        for (int i = 0; i < strArr.length; i++) {
            Locale.getDefault();
            metricsService.recordPercentOccurrence(a$$ExternalSyntheticOutline0.m("VOX_PERMISSION_GRANT_RATE:", strArr[i]), str, iArr[i] == 0, null);
        }
    }
}
