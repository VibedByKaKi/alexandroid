package com.amazon.alexa.handsfree.notification.views.base;

import android.app.Notification;
import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NotificationView {
    private final String mChannelId;
    private final int mNotificationId;
    private final NotificationViewPresenter mNotificationViewPresenter;

    public NotificationView(@NonNull String str, @NonNull NotificationViewPresenter notificationViewPresenter, int i) {
        this.mChannelId = str;
        this.mNotificationViewPresenter = notificationViewPresenter;
        this.mNotificationId = i;
    }

    public String getChannelId() {
        return this.mChannelId;
    }

    public abstract Notification getNotification(@NonNull Context context);

    public int getNotificationId() {
        return this.mNotificationId;
    }

    public NotificationViewPresenter getPresenter() {
        return this.mNotificationViewPresenter;
    }
}
