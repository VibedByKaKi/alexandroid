package com.amazon.alexa.handsfree.notification.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum MetricType {
    HANDSFREE_NOT_ACTIVE("HandsFreeNotActive:%s"),
    NOTIFICATION_NOT_ACTIVE("NotificationNotActive:%s"),
    NOTIFICATION_CONTRACT_NULL_TIME_BASED("NotificationContractNullTimeBased:%s"),
    NOTIFICATION_CONTRACT_NULL_UTTERANCE("NotificationContractNullUtterance:%s"),
    NOTIFICATION_CONTRACT_NULL_QUICK_SETTINGS("NotificationContractNullQuickSettings:%s"),
    NOTIFICATION_CONTRACT_NULL_ENABLE_HANDSFREE("NotificationContractNullEnableHandsFree:%s"),
    NOTIFICATION_DELAY("NotificationDelay"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_TIME_BASED_RECEIVER("NotificationModuleNotInitializedTimeBasedReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_UTTERANCE_RECEIVER("NotificationModuleNotInitializedUtteranceReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_KILL_SWITCH_RECEIVER("NotificationModuleNotInitializedKillSwitchReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_TERMS_CHECKER_RECEIVER("NotificationModuleNotInitializedTermsCheckerReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_QUICK_SETTINGS_RECEIVER("NotificationModuleNotInitializedQuickSettingsReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_STATE_CHANGE_RECEIVER("NotificationModuleNotInitializedStateChangeReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_PERMISSION_RECEIVER("NotificationModuleNotInitializedPermissionReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_LANGUAGE_SWITCHING_RECEIVER("NotificationModuleNotInitializedLanguageSwitchingReceiver:%s"),
    NOTIFICATION_MODULE_NOT_INITIALIZED_ENABLE_HANDS_FREE_RECEIVER("NotificationModuleNotInitializedEnableHandsFreeReceiver:%s");

    private String mValue;

    MetricType(String str) {
        this.mValue = str;
    }

    public String getValue() {
        return this.mValue;
    }
}
