package com.amazon.alexa.handsfree.settings.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface HandsFreeSetupMetricMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ActionType {
        INTENTION,
        DISCOVERY
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Component {
        SETTINGS_TILE,
        HANDSFREE_SETUP,
        SETTINGS_MENU,
        NOTIFICATION
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EventType {
        CLICK,
        ALLOW,
        DENY,
        DENY_NEVER_ASK_AGAIN,
        EXIT,
        SETUP_COMPLETE,
        NONE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PageType {
        QUICK_SETTINGS,
        DISABLED_STATE_NOTIFICATION,
        ANDROID_SETTINGS,
        RECORD_AUDIO_PERMISSIONS,
        ALEXA_APP_UPDATE,
        ALEXA_APP,
        SETUP_NOTIFICATION,
        PROFILE_SETTINGS,
        NONE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SubPageType {
        NONE,
        ALLOW_BUTTON,
        LATER_BUTTON,
        CREATE_BUTTON
    }
}
