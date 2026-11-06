package com.amazon.alexa.handsfree.notification.channels;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NotificationChannelManager {
    private final NotificationManager mNotificationManager;

    public NotificationChannelManager(@NonNull Context context) {
        this.mNotificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
    }

    @VisibleForTesting
    public void createNotificationChannel(@NonNull NotificationChannelProperties notificationChannelProperties) {
        if (this.mNotificationManager.getNotificationChannel(notificationChannelProperties.getChannelId()) == null) {
            NotificationChannel notificationChannel = getNotificationChannel(notificationChannelProperties);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannels() {
        createNotificationChannel(NotificationChannelProperties.HANDS_FREE_SETUP);
    }

    @NonNull
    @VisibleForTesting
    public NotificationChannel getNotificationChannel(@NonNull NotificationChannelProperties notificationChannelProperties) {
        return new NotificationChannel(notificationChannelProperties.getChannelId(), notificationChannelProperties.getChannelName(), notificationChannelProperties.getImportance());
    }
}
