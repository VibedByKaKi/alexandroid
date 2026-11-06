package com.amazon.alexa.handsfree.notification.channels;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum NotificationChannelProperties {
    HANDS_FREE_SETUP("com.amazon.alexa.handsfree.notification.CHANNEL_ID", "Alexa Hands-Free Setup", 3);

    private final String mChannelId;
    private final String mChannelName;
    private final int mImportance;

    NotificationChannelProperties(@NonNull String str, @NonNull String str2, int i) {
        this.mChannelId = str;
        this.mChannelName = str2;
        this.mImportance = i;
    }

    public String getChannelId() {
        return this.mChannelId;
    }

    public String getChannelName() {
        return this.mChannelName;
    }

    public int getImportance() {
        return this.mImportance;
    }
}
