package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.core.PlayItem;
import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_DrmCryptoPlayFailedEvent extends AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent {
    private final String errorCode;
    private final PlayItem playItem;

    public AutoValue_AudioPlayerPlaybackEvent_DrmCryptoPlayFailedEvent(PlayItem playItem, String str) {
        if (playItem == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playItem");
            throw null;
        }
        this.playItem = playItem;
        if (str != null) {
            this.errorCode = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null errorCode");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent) {
            AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent drmCryptoPlayFailedEvent = (AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent) obj;
            if (this.playItem.equals(drmCryptoPlayFailedEvent.getPlayItem()) && this.errorCode.equals(drmCryptoPlayFailedEvent.getErrorCode())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.DrmCryptoPlayFailedEvent
    public PlayItem getPlayItem() {
        return this.playItem;
    }

    public int hashCode() {
        return this.errorCode.hashCode() ^ ((this.playItem.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrmCryptoPlayFailedEvent{playItem=");
        sb.append(this.playItem);
        sb.append(", errorCode=");
        return a$$ExternalSyntheticOutline0.m(sb, this.errorCode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
