package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_PlayDrmLicenseKeyLoadedEvent extends AudioPlayerPlaybackEvent.PlayDrmLicenseKeyLoadedEvent {
    private final boolean restoredFromCache;

    public AutoValue_AudioPlayerPlaybackEvent_PlayDrmLicenseKeyLoadedEvent(boolean z) {
        this.restoredFromCache = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AudioPlayerPlaybackEvent.PlayDrmLicenseKeyLoadedEvent) && this.restoredFromCache == ((AudioPlayerPlaybackEvent.PlayDrmLicenseKeyLoadedEvent) obj).isRestoredFromCache();
    }

    public int hashCode() {
        return (this.restoredFromCache ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.PlayDrmLicenseKeyLoadedEvent
    public boolean isRestoredFromCache() {
        return this.restoredFromCache;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PlayDrmLicenseKeyLoadedEvent{restoredFromCache="), this.restoredFromCache, StringSubstitutor.DEFAULT_VAR_END);
    }
}
