package com.amazon.alexa.client.alexaservice.base.interactions;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioMetadata extends AudioMetadata {
    private final boolean alexaAudio;
    private final AudioMetadata.AudioContentType audioContentType;
    private final AudioMetadata.AudioUsage audioUsage;
    private final AudioMetadata.AudioFocusDuration duration;
    private final AudioMetadata.AudioFocusStream stream;

    public AutoValue_AudioMetadata(AudioMetadata.AudioFocusStream audioFocusStream, AudioMetadata.AudioFocusDuration audioFocusDuration, AudioMetadata.AudioUsage audioUsage, AudioMetadata.AudioContentType audioContentType, boolean z) {
        if (audioFocusStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null stream");
            throw null;
        }
        this.stream = audioFocusStream;
        if (audioFocusDuration == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null duration");
            throw null;
        }
        this.duration = audioFocusDuration;
        if (audioUsage == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioUsage");
            throw null;
        }
        this.audioUsage = audioUsage;
        if (audioContentType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioContentType");
            throw null;
        }
        this.audioContentType = audioContentType;
        this.alexaAudio = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioMetadata) {
            AudioMetadata audioMetadata = (AudioMetadata) obj;
            if (this.stream.equals(audioMetadata.getStream()) && this.duration.equals(audioMetadata.getDuration()) && this.audioUsage.equals(audioMetadata.getAudioUsage()) && this.audioContentType.equals(audioMetadata.getAudioContentType()) && this.alexaAudio == audioMetadata.isAlexaAudio()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata
    public AudioMetadata.AudioContentType getAudioContentType() {
        return this.audioContentType;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata
    public AudioMetadata.AudioUsage getAudioUsage() {
        return this.audioUsage;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata
    public AudioMetadata.AudioFocusDuration getDuration() {
        return this.duration;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata
    public AudioMetadata.AudioFocusStream getStream() {
        return this.stream;
    }

    public int hashCode() {
        return (this.alexaAudio ? 1231 : 1237) ^ ((((((((this.stream.hashCode() ^ 1000003) * 1000003) ^ this.duration.hashCode()) * 1000003) ^ this.audioUsage.hashCode()) * 1000003) ^ this.audioContentType.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata
    public boolean isAlexaAudio() {
        return this.alexaAudio;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioMetadata{stream=");
        sb.append(this.stream);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", audioUsage=");
        sb.append(this.audioUsage);
        sb.append(", audioContentType=");
        sb.append(this.audioContentType);
        sb.append(", alexaAudio=");
        return a$$ExternalSyntheticOutline0.m(sb, this.alexaAudio, StringSubstitutor.DEFAULT_VAR_END);
    }
}
