package com.amazon.alexa.voiceui.notifications;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class SmartLockNotificationView {

    @VisibleForTesting
    static final String NOTIFICATION_ACTION = "amazon.alexa.voice.handsfree.REPORT_UTTERANCE_ON_LOCK_SCREEN";
    private final Context context;

    @Inject
    public SmartLockNotificationView(Context context) {
        this.context = context;
    }

    public void showNotification() {
        Intent intent = new Intent(NOTIFICATION_ACTION);
        intent.setPackage(this.context.getPackageName());
        this.context.sendBroadcast(intent);
    }
}
