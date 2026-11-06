package com.amazon.alexa.handsfree.settings.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum MetricType {
    DECIDER_NOT_ACTIVE("DeciderNotActive:%s"),
    SETTINGS_NOT_ACTIVE("SettingsNotActive:%s"),
    HANDSFREE_NOT_ACTIVE("HandsFreeNotActive:%s"),
    HANDSFREE_INACTIVE_WW_REQ_UNMET("HandsFreeInactiveWakeWordRequirementsNotMet"),
    HANDSFREE_REMOTELY_DISABLED("HandsFreeRemotelyDisabled"),
    HANDSFREE_MANAGER_SYNC_FAILED("HandsFreeManagerSyncFailed"),
    HANDSFREE_MANAGER_SYNC_SUCCESS("HandsFreeManagerSyncSuccess"),
    HANDSFREE_MANAGER_QUICK_SETTINGS_TILE_UPDATE_SUCCESS("HandsFreeManagerQuickSettingsTileSuccess"),
    HANDSFREE_MANAGER_TOGGLE_SUCCESS("HandsFreeManagerToggleSuccess"),
    WAKEWORD_DETECTION_TOGGLE_SUCCESS("WakeWordDetectionTurnOffSuccess"),
    SETTINGS_SETUP_CONTRACT_NOT_AVAILABLE_METRIC("SettingSetupFlowContractNotAvailable"),
    PREFERENCES_PRESENTER_NOT_AVAILABLE_FOR_CLEANUP("PreferencesPresenterNotAvailableForCleanup"),
    DELETE_LOCAL_VOICE_PROFILE_FROM_VOX_SUCCESS("DeleteLocalVoiceProfileFromVoxSuccess:%s"),
    HANDS_FREE_ENABLED("HandsFreeEnabled:%s"),
    HANDS_FREE_ENABLED_WITH_CALLER("HandsFreeEnabled:%s:%s"),
    HANDS_FREE_NOT_ENABLED("HandsFreeNotEnabled:%s"),
    HANDS_FREE_NOT_ENABLED_WITH_CALLER("HandsFreeNotEnabled:%s:%s");

    private String mValue;

    MetricType(String str) {
        this.mValue = str;
    }

    public String getValue() {
        return this.mValue;
    }
}
