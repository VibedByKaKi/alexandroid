package com.amazon.alexa.visualid.util;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public Notification build(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 0);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.setLockscreenVisibility(0);
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
        return new NotificationCompat.Builder(context, str).setOngoing(true).setSmallIcon(R.drawable.ic_dialog_info).setPriority(1).setCategory("service").build();
    }
}
