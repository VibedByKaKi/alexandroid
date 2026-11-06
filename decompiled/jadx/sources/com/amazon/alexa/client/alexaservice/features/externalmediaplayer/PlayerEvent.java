package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum PlayerEvent {
    PLAY_MODE_CHANGED("PlayModeChanged"),
    TRACK_CHANGED("TrackChanged"),
    PLAYBACK_SESSION_STARTED("PlaybackSessionStarted"),
    PLAYBACK_SESSION_ENDED("PlaybackSessionEnded"),
    PLAYBACK_STARTED("PlaybackStarted"),
    PLAYBACK_STOPPED("PlaybackStopped"),
    PLAYBACK_PREVIOUS("PlaybackPrevious"),
    PLAYBACK_NEXT("PlaybackNext"),
    DISCONNECTED("Disconnected");

    private final String eventName;

    PlayerEvent(String str) {
        this.eventName = str;
    }

    public String getEventName() {
        return this.eventName;
    }

    public boolean isActivePlayback() {
        return (this.eventName.equals(PLAYBACK_SESSION_ENDED.getEventName()) || this.eventName.equals(PLAYBACK_STOPPED.getEventName())) ? false : true;
    }
}
