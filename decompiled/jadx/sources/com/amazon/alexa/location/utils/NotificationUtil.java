package com.amazon.alexa.location.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazon.alexa.location.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class NotificationUtil {
    public static final String CHANNEL_ID = "GeofenceTriggerChannelId";
    public static final String CHANNEL_NAME = "Location Tasks";

    private NotificationUtil() {
    }

    public static Notification getNotificationForBackgroundTasks(Context context, String str) {
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, 0));
        return new Notification.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.app_icon).setContentTitle("Alexa Location").setContentText(str).build();
    }
}
