package com.amazon.alexa.handsfree.notification.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface NotificationEventMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Component {
        HANDSFREE_SETUP,
        UVR_SETUP,
        DLS_SETUP
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConnectionFailureReason {
        ALEXA_LEADER_IS_MISSED,
        AUTHORIZATION_IS_MISSED,
        UNKNOWN_REASON
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NotificationType {
        TIME_BASED,
        UTTERANCE_BASED,
        DISABLED_STATE,
        VOICE_PROFILE,
        VOICE_PROFILE_ON_LOCK_SCREEN,
        SHOW_ON_LOCK_SCREEN,
        QUICK_SETTINGS,
        PERMISSION_REQUEST,
        ENABLE_HANDS_FREE,
        LANGUAGE_SWITCHING
    }
}
