package com.amazon.alexa.voice.handsfree.mike.vesper.notifications.channels;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum NotificationChannelProperties {
    HANDS_FREE_SETUP("com.amazon.alexa.handsfree.notification.CHANNEL_ID", R.string.handsfree_notifications_channel, 3);

    private final String mChannelId;
    private final int mChannelNameStringRes;
    private final int mImportance;

    NotificationChannelProperties(@NonNull String str, int i, int i2) {
        this.mChannelId = str;
        this.mChannelNameStringRes = i;
        this.mImportance = i2;
    }

    public String getChannelId() {
        return this.mChannelId;
    }

    public int getChannelNameStringRes() {
        return this.mChannelNameStringRes;
    }

    public int getImportance() {
        return this.mImportance;
    }
}
