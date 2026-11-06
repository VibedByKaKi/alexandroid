package com.amazon.alexa.voice.handsfree.mike.vesper.notifications.channels;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationChannelManager {
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    public NotificationChannelManager(@NonNull Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
    }

    public void createNotificationChannel() {
        NotificationChannelProperties notificationChannelProperties = NotificationChannelProperties.HANDS_FREE_SETUP;
        if (this.mNotificationManager.getNotificationChannel(notificationChannelProperties.getChannelId()) == null) {
            NotificationChannel notificationChannel = getNotificationChannel(notificationChannelProperties);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    @NonNull
    @VisibleForTesting
    public NotificationChannel getNotificationChannel(@NonNull NotificationChannelProperties notificationChannelProperties) {
        return new NotificationChannel(notificationChannelProperties.getChannelId(), this.mContext.getString(notificationChannelProperties.getChannelNameStringRes()), notificationChannelProperties.getImportance());
    }
}
