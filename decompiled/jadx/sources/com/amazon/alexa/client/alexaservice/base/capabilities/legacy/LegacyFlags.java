package com.amazon.alexa.client.alexaservice.base.capabilities.legacy;

import com.amazon.alexa.client.alexaservice.base.capabilities.legacy.AutoValue_LegacyFlags;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class LegacyFlags {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract LegacyFlags build();

        public abstract Builder setFriendlyNameTemplate(String str);

        public abstract Builder setScreenWidth(int i);

        public abstract Builder setSupportsArbitration(boolean z);

        public abstract Builder setSupportsAudioPlayerTtsUrls(boolean z);

        public abstract Builder setSupportsAxon(boolean z);

        public abstract Builder setSupportsComms(boolean z);

        public abstract Builder setSupportsDatamartNamespace(String str);

        public abstract Builder setSupportsDropinOutbound(boolean z);

        public abstract Builder setSupportsHomeAutomation(boolean z);

        public abstract Builder setSupportsKeysInHeader(boolean z);

        public abstract Builder setSupportsLyricsInCard(boolean z);

        public abstract Builder setSupportsMixingBehaviorForAudioPlayer(boolean z);

        public abstract Builder setSupportsPfmChanged(boolean z);

        public abstract Builder setSupportsScrubbing(boolean z);

        public abstract Builder setSupportsSecureLockscreen(boolean z);

        public abstract Builder setSupportsSipOutboundCalling(boolean z);

        public abstract Builder setSupportsSpeechSynthesizerTtsUrls(boolean z);

        public abstract Builder setSupportsTargetPlatform(String str);

        public abstract Builder setSupportsTtsSpeechmarks(boolean z);

        public abstract Builder setSupportsVideoCalling(boolean z);

        public abstract Builder setVoiceProfileSwitchingDisabled(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_LegacyFlags.Builder();
    }

    public abstract String getFriendlyNameTemplate();

    public abstract int getScreenWidth();

    public abstract boolean getSupportsArbitration();

    public abstract boolean getSupportsAudioPlayerTtsUrls();

    public abstract boolean getSupportsAxon();

    public abstract boolean getSupportsComms();

    public abstract String getSupportsDatamartNamespace();

    public abstract boolean getSupportsDropinOutbound();

    public abstract boolean getSupportsHomeAutomation();

    public abstract boolean getSupportsKeysInHeader();

    public abstract boolean getSupportsLyricsInCard();

    public abstract boolean getSupportsMixingBehaviorForAudioPlayer();

    public abstract boolean getSupportsPfmChanged();

    public abstract boolean getSupportsScrubbing();

    public abstract boolean getSupportsSecureLockscreen();

    public abstract boolean getSupportsSipOutboundCalling();

    public abstract boolean getSupportsSpeechSynthesizerTtsUrls();

    public abstract String getSupportsTargetPlatform();

    public abstract boolean getSupportsTtsSpeechmarks();

    public abstract boolean getSupportsVideoCalling();

    public abstract boolean getVoiceProfileSwitchingDisabled();
}
