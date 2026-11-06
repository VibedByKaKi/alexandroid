package com.amazon.alexa.handsfree.notification.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface NotificationClickMetricMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Component {
        NOTIFICATION
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PageType {
        TIME_BASED_NOTIFICATION,
        UTTERANCE_BASED_NOTIFICATION,
        DISABLED_STATE_NOTIFICATION,
        VOICE_PROFILE_NOTIFICATION,
        VOICE_PROFILE_ON_LOCK_SCREEN_NOTIFICATION,
        SHOW_ON_LOCK_SCREEN_NOTIFICATION,
        QUICK_SETTINGS_NOTIFICATION,
        PARTNER_VOICE_APP_DOWNLOAD_NOTIFICATION,
        ENABLE_HANDS_FREE_NOTIFICATION,
        LANGUAGE_SWITCHING_NOTIFICATION
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SubPageType {
        NONE,
        QS_TILE_IN_EDIT_MENU,
        QS_TILE_IN_MAIN_MENU,
        ENABLE_HANDS_FREE_CONFIRM_BUTTON,
        ENABLE_HANDS_FREE_LATER_BUTTON
    }
}
