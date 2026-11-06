package com.amazon.alexa.api;

import android.app.PendingIntent;
import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface MediaPlaybackControllerApi {
    void deregisterAlexaAudioPlaybackStatusListener(@NonNull AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener);

    void deregisterMediaPlaybackListener(@NonNull AlexaMediaPlaybackListener alexaMediaPlaybackListener);

    void next();

    void pause();

    void play();

    void previous();

    void registerAlexaAudioPlaybackStatusListener(@NonNull AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener);

    void registerMediaPlaybackListener(@NonNull AlexaMediaPlaybackListener alexaMediaPlaybackListener);

    void setMediaNotificationContentIntent(@NonNull PendingIntent pendingIntent);

    void stop();
}
