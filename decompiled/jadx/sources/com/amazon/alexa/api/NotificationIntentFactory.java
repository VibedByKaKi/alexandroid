package com.amazon.alexa.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class NotificationIntentFactory {
    private static final String COMPONENT_CLASS = "com.amazon.alexa.handsfree.notification.receivers.UtteranceReceiver";
    private static final String NOTIFICATION_ACTION = "com.amazon.alexa.handsfree.notification.REPORT_ALEXA_CONNECTION_FAILURE";
    private static final String REASON_EXTRA_KEY = "CONNECTION_FAILURE_REASON";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AlexaConnectingFailedReason {
        ALEXA_LEADER_IS_MISSED,
        AUTHORIZATION_IS_MISSED,
        UNKNOWN
    }

    private NotificationIntentFactory() {
    }

    public static Intent createMissingAuthorizationIntent(Context context) {
        return createNotificationIntent(context, AlexaConnectingFailedReason.AUTHORIZATION_IS_MISSED);
    }

    public static Intent createMissingLeaderIntent(Context context) {
        return createNotificationIntent(context, AlexaConnectingFailedReason.ALEXA_LEADER_IS_MISSED);
    }

    private static Intent createNotificationIntent(Context context, AlexaConnectingFailedReason alexaConnectingFailedReason) {
        return new Intent().setComponent(new ComponentName(context.getApplicationContext(), COMPONENT_CLASS)).setAction(NOTIFICATION_ACTION).putExtra(REASON_EXTRA_KEY, alexaConnectingFailedReason.name());
    }

    public static Intent createUnknownReasonIntent(Context context) {
        return createNotificationIntent(context, AlexaConnectingFailedReason.UNKNOWN);
    }
}
