package com.amazon.alexa.handsfree.settings.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ClickMetricMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Action {
        ENABLE,
        DISABLE,
        DELETE,
        DELETE_CONFIRM,
        DELETE_CANCEL,
        TILE_ADDED,
        TILE_REMOVED,
        START_VOICE_TRAINING,
        BLOCK_ALL,
        BLOCK_PERSONAL,
        BLOCK_NONE,
        ALERT_DIALOG_DENY
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Component {
        SETTINGS_TILE,
        SETTINGS_MENU
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PageType {
        RESPOND_ON_LOCK_SCREEN,
        ANDROID_SETTINGS,
        QUICK_SETTINGS,
        VOICE_PROFILE
    }
}
