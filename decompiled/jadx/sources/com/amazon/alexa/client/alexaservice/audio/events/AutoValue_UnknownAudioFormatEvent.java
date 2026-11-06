package com.amazon.alexa.client.alexaservice.audio.events;

import android.net.Uri;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UnknownAudioFormatEvent extends UnknownAudioFormatEvent {
    private final Uri mediaUri;

    public AutoValue_UnknownAudioFormatEvent(Uri uri) {
        if (uri != null) {
            this.mediaUri = uri;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null mediaUri");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UnknownAudioFormatEvent) {
            return this.mediaUri.equals(((UnknownAudioFormatEvent) obj).getMediaUri());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.UnknownAudioFormatEvent
    public Uri getMediaUri() {
        return this.mediaUri;
    }

    public int hashCode() {
        return this.mediaUri.hashCode() ^ 1000003;
    }

    public String toString() {
        return "UnknownAudioFormatEvent{mediaUri=" + this.mediaUri + StringSubstitutor.DEFAULT_VAR_END;
    }
}
