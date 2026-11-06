package com.amazon.alexa.voice.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface VoxMetricEventName {
    public static final String BY_SYSTEM_LOCALE = "SYSTEM_LOCALE";
    public static final String BY_USER_FTUE = "USER_FTUE";
    public static final String BY_USER_SETTINGS = "USER_SETTINGS";
    public static final String DLS_VOX_LOCALE_UPDATED = "VOX_LOCALE_UPDATED_DLS";
    public static final String FTUE_COMPLETED = "FTUE_COMPLETED";
    public static final String FTUE_STARTED = "FTUE_STARTED";
    public static final String INGRESS_IN_APP_WAKEWORD_OCCUR = "INGRESS_IN_APP_WAKEWORD_OCCUR";
    public static final String LIVE_MODE_ROUTE_INGRESS = "LIVE_MODE_ROUTE_INGRESS";
    public static final String REQUEST_ABORTED = "REQUEST_ABORTED";
    public static final String SCRIM_SHOWN = "SCRIM_SHOWN";
    public static final String SDK_CONNECTION_ATTEMPTED = "SDK_CONNECTION_ATTEMPTED";
    public static final String SDK_CONNECTION_ESTABLISHED = "SDK_CONNECTION_ESTABLISHED";
    public static final String SDK_CONNECTION_FAILED = "SDK_CONNECTION_FAILED";
    public static final String VOX_CHECKING_ACCESSIBILITY_STREAM_FAILED = "VOX_CHECKING_ACCESSIBILITY_STREAM_FAILED";
    public static final String VOX_EARCON_ENDPOINT_SOUND_DISABLED = "VOX_EARCON_EOR_CHANGED:DISABLED";
    public static final String VOX_EARCON_ENDPOINT_SOUND_ENABLED = "VOX_EARCON_EOR_CHANGED:ENABLED";
    public static final String VOX_EARCON_WAKE_SOUND_DISABLED = "VOX_EARCON_SOR_CHANGED:DISABLED";
    public static final String VOX_EARCON_WAKE_SOUND_ENABLED = "VOX_EARCON_SOR_CHANGED:ENABLED";
    public static final String VOX_HANDSFREE_SETTINGS_DISABLED = "VOX_HANDSFREE_SETTINGS_DISABLED";
    public static final String VOX_HANDSFREE_SETTINGS_ENABLED = "VOX_HANDSFREE_SETTINGS_ENABLED";
    public static final String VOX_LOCALE_UPDATED_FAILED = "VOX_LOCALE_UPDATED_FAILED";
    public static final String VOX_LOCALE_UPDATED_SUCCESS = "VOX_LOCALE_UPDATED_SUCCESS";
    public static final String VOX_WW_DISABLED_LIVE_MODE = "VOX_WW_DISABLED_LIVE_MODE";
    public static final String VOX_WW_DISABLED_NEW_SIGNUP = "VOX_WW_DISABLED_NEW_SIGNUP";
    public static final String VOX_WW_DISABLED_S2_INACTIVE = "VOX_WW_DISABLED_S2_INACTIVE";

    default void doNothing() {
    }
}
