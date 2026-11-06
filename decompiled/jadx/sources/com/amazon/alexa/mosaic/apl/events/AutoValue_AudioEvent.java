package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.dependencies.tts.IPlayback;
import com.amazon.alexa.mosaic.apl.events.AudioEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_AudioEvent extends AudioEvent {
    private final IPlayback playback;
    private final AudioEvent.Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AudioEvent.Builder {
        private IPlayback playback;
        private AudioEvent.Type type;

        @Override // com.amazon.alexa.mosaic.apl.events.AudioEvent.Builder
        public AudioEvent build() {
            IPlayback iPlayback;
            AudioEvent.Type type = this.type;
            if (type != null && (iPlayback = this.playback) != null) {
                return new AutoValue_AudioEvent(type, iPlayback, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.playback == null) {
                sb.append(" playback");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.AudioEvent.Builder
        public AudioEvent.Builder playback(IPlayback iPlayback) {
            if (iPlayback != null) {
                this.playback = iPlayback;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null playback");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.AudioEvent.Builder
        public AudioEvent.Builder type(AudioEvent.Type type) {
            if (type != null) {
                this.type = type;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_AudioEvent(AudioEvent.Type type, IPlayback iPlayback) {
        this.type = type;
        this.playback = iPlayback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioEvent) {
            AudioEvent audioEvent = (AudioEvent) obj;
            if (this.type.equals(audioEvent.type()) && this.playback.equals(audioEvent.playback())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.playback.hashCode() ^ ((this.type.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.mosaic.apl.events.AudioEvent
    public IPlayback playback() {
        return this.playback;
    }

    public String toString() {
        return "AudioEvent{type=" + this.type + ", playback=" + this.playback + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.AudioEvent
    public AudioEvent.Type type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_AudioEvent(AudioEvent.Type type, IPlayback iPlayback, int i) {
        this(type, iPlayback);
    }
}
