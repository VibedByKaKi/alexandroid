package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.core.PlayItem;
import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_PlayFailedEvent extends AudioPlayerPlaybackEvent.PlayFailedEvent {
    private final boolean connectivityFailure;
    private final PlayItem playItem;

    public AutoValue_AudioPlayerPlaybackEvent_PlayFailedEvent(PlayItem playItem, boolean z) {
        if (playItem == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playItem");
            throw null;
        }
        this.playItem = playItem;
        this.connectivityFailure = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioPlayerPlaybackEvent.PlayFailedEvent) {
            AudioPlayerPlaybackEvent.PlayFailedEvent playFailedEvent = (AudioPlayerPlaybackEvent.PlayFailedEvent) obj;
            if (this.playItem.equals(playFailedEvent.getPlayItem()) && this.connectivityFailure == playFailedEvent.isConnectivityFailure()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.PlayFailedEvent
    public PlayItem getPlayItem() {
        return this.playItem;
    }

    public int hashCode() {
        return (this.connectivityFailure ? 1231 : 1237) ^ ((this.playItem.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.PlayFailedEvent
    public boolean isConnectivityFailure() {
        return this.connectivityFailure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayFailedEvent{playItem=");
        sb.append(this.playItem);
        sb.append(", connectivityFailure=");
        return a$$ExternalSyntheticOutline0.m(sb, this.connectivityFailure, StringSubstitutor.DEFAULT_VAR_END);
    }
}
