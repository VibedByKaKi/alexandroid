package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes20.dex */
public class MediaConfiguration {
    private AudioMediaConfiguration audio;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaConfigurationBuilder {
        private AudioMediaConfiguration audio;

        public MediaConfigurationBuilder audio(AudioMediaConfiguration audioMediaConfiguration) {
            this.audio = audioMediaConfiguration;
            return this;
        }

        public MediaConfiguration build() {
            return new MediaConfiguration(this.audio);
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MediaConfiguration.MediaConfigurationBuilder(audio=", String.valueOf(this.audio), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public MediaConfiguration(AudioMediaConfiguration audioMediaConfiguration) {
        this.audio = audioMediaConfiguration;
    }

    public static MediaConfigurationBuilder builder() {
        return new MediaConfigurationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MediaConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaConfiguration)) {
            return false;
        }
        MediaConfiguration mediaConfiguration = (MediaConfiguration) obj;
        if (!mediaConfiguration.canEqual(this)) {
            return false;
        }
        AudioMediaConfiguration audio = getAudio();
        AudioMediaConfiguration audio2 = mediaConfiguration.getAudio();
        return audio != null ? audio.equals(audio2) : audio2 == null;
    }

    public AudioMediaConfiguration getAudio() {
        return this.audio;
    }

    public int hashCode() {
        AudioMediaConfiguration audio = getAudio();
        return 59 + (audio == null ? 43 : audio.hashCode());
    }

    public void setAudio(AudioMediaConfiguration audioMediaConfiguration) {
        this.audio = audioMediaConfiguration;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("MediaConfiguration(audio=", String.valueOf(getAudio()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public MediaConfiguration() {
    }
}
