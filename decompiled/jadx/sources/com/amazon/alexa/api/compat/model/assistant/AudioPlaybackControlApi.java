package com.amazon.alexa.api.compat.model.assistant;

import android.app.PendingIntent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class AudioPlaybackControlApi {
    public abstract void next();

    public abstract void pause();

    public abstract void play();

    public abstract void previous();

    public abstract void setMediaNotificationContentIntent(PendingIntent pendingIntent);

    public abstract void stop();
}
