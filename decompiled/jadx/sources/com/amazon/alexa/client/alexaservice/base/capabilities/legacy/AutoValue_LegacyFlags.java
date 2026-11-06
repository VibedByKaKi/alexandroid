package com.amazon.alexa.client.alexaservice.base.capabilities.legacy;

import com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LegacyFlags extends LegacyFlags {
    private final String friendlyNameTemplate;
    private final int screenWidth;
    private final boolean supportsArbitration;
    private final boolean supportsAudioPlayerTtsUrls;
    private final boolean supportsAxon;
    private final boolean supportsComms;
    private final String supportsDatamartNamespace;
    private final boolean supportsDropinOutbound;
    private final boolean supportsHomeAutomation;
    private final boolean supportsKeysInHeader;
    private final boolean supportsLyricsInCard;
    private final boolean supportsMixingBehaviorForAudioPlayer;
    private final boolean supportsPfmChanged;
    private final boolean supportsScrubbing;
    private final boolean supportsSecureLockscreen;
    private final boolean supportsSipOutboundCalling;
    private final boolean supportsSpeechSynthesizerTtsUrls;
    private final String supportsTargetPlatform;
    private final boolean supportsTtsSpeechmarks;
    private final boolean supportsVideoCalling;
    private final boolean voiceProfileSwitchingDisabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends LegacyFlags.Builder {
        private String friendlyNameTemplate;
        private Integer screenWidth;
        private Boolean supportsArbitration;
        private Boolean supportsAudioPlayerTtsUrls;
        private Boolean supportsAxon;
        private Boolean supportsComms;
        private String supportsDatamartNamespace;
        private Boolean supportsDropinOutbound;
        private Boolean supportsHomeAutomation;
        private Boolean supportsKeysInHeader;
        private Boolean supportsLyricsInCard;
        private Boolean supportsMixingBehaviorForAudioPlayer;
        private Boolean supportsPfmChanged;
        private Boolean supportsScrubbing;
        private Boolean supportsSecureLockscreen;
        private Boolean supportsSipOutboundCalling;
        private Boolean supportsSpeechSynthesizerTtsUrls;
        private String supportsTargetPlatform;
        private Boolean supportsTtsSpeechmarks;
        private Boolean supportsVideoCalling;
        private Boolean voiceProfileSwitchingDisabled;

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags build() {
            String str = this.supportsTtsSpeechmarks == null ? " supportsTtsSpeechmarks" : "";
            if (this.supportsSpeechSynthesizerTtsUrls == null) {
                str = str.concat(" supportsSpeechSynthesizerTtsUrls");
            }
            if (this.supportsAudioPlayerTtsUrls == null) {
                str = str.concat(" supportsAudioPlayerTtsUrls");
            }
            if (this.supportsLyricsInCard == null) {
                str = str.concat(" supportsLyricsInCard");
            }
            if (this.supportsPfmChanged == null) {
                str = str.concat(" supportsPfmChanged");
            }
            if (this.supportsScrubbing == null) {
                str = str.concat(" supportsScrubbing");
            }
            if (this.supportsHomeAutomation == null) {
                str = str.concat(" supportsHomeAutomation");
            }
            if (this.supportsKeysInHeader == null) {
                str = str.concat(" supportsKeysInHeader");
            }
            if (this.supportsMixingBehaviorForAudioPlayer == null) {
                str = str.concat(" supportsMixingBehaviorForAudioPlayer");
            }
            if (this.supportsComms == null) {
                str = str.concat(" supportsComms");
            }
            if (this.supportsDropinOutbound == null) {
                str = str.concat(" supportsDropinOutbound");
            }
            if (this.supportsSipOutboundCalling == null) {
                str = str.concat(" supportsSipOutboundCalling");
            }
            if (this.supportsVideoCalling == null) {
                str = str.concat(" supportsVideoCalling");
            }
            if (this.voiceProfileSwitchingDisabled == null) {
                str = str.concat(" voiceProfileSwitchingDisabled");
            }
            if (this.supportsArbitration == null) {
                str = str.concat(" supportsArbitration");
            }
            if (this.supportsSecureLockscreen == null) {
                str = str.concat(" supportsSecureLockscreen");
            }
            if (this.supportsAxon == null) {
                str = str.concat(" supportsAxon");
            }
            if (this.screenWidth == null) {
                str = str.concat(" screenWidth");
            }
            if (this.friendlyNameTemplate == null) {
                str = str.concat(" friendlyNameTemplate");
            }
            if (this.supportsDatamartNamespace == null) {
                str = str.concat(" supportsDatamartNamespace");
            }
            if (this.supportsTargetPlatform == null) {
                str = str.concat(" supportsTargetPlatform");
            }
            if (str.isEmpty()) {
                return new AutoValue_LegacyFlags(this.supportsTtsSpeechmarks.booleanValue(), this.supportsSpeechSynthesizerTtsUrls.booleanValue(), this.supportsAudioPlayerTtsUrls.booleanValue(), this.supportsLyricsInCard.booleanValue(), this.supportsPfmChanged.booleanValue(), this.supportsScrubbing.booleanValue(), this.supportsHomeAutomation.booleanValue(), this.supportsKeysInHeader.booleanValue(), this.supportsMixingBehaviorForAudioPlayer.booleanValue(), this.supportsComms.booleanValue(), this.supportsDropinOutbound.booleanValue(), this.supportsSipOutboundCalling.booleanValue(), this.supportsVideoCalling.booleanValue(), this.voiceProfileSwitchingDisabled.booleanValue(), this.supportsArbitration.booleanValue(), this.supportsSecureLockscreen.booleanValue(), this.supportsAxon.booleanValue(), this.screenWidth.intValue(), this.friendlyNameTemplate, this.supportsDatamartNamespace, this.supportsTargetPlatform, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setFriendlyNameTemplate(String str) {
            if (str != null) {
                this.friendlyNameTemplate = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null friendlyNameTemplate");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setScreenWidth(int i) {
            this.screenWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsArbitration(boolean z) {
            this.supportsArbitration = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsAudioPlayerTtsUrls(boolean z) {
            this.supportsAudioPlayerTtsUrls = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsAxon(boolean z) {
            this.supportsAxon = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsComms(boolean z) {
            this.supportsComms = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsDatamartNamespace(String str) {
            if (str != null) {
                this.supportsDatamartNamespace = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null supportsDatamartNamespace");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsDropinOutbound(boolean z) {
            this.supportsDropinOutbound = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsHomeAutomation(boolean z) {
            this.supportsHomeAutomation = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsKeysInHeader(boolean z) {
            this.supportsKeysInHeader = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsLyricsInCard(boolean z) {
            this.supportsLyricsInCard = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsMixingBehaviorForAudioPlayer(boolean z) {
            this.supportsMixingBehaviorForAudioPlayer = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsPfmChanged(boolean z) {
            this.supportsPfmChanged = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsScrubbing(boolean z) {
            this.supportsScrubbing = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsSecureLockscreen(boolean z) {
            this.supportsSecureLockscreen = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsSipOutboundCalling(boolean z) {
            this.supportsSipOutboundCalling = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsSpeechSynthesizerTtsUrls(boolean z) {
            this.supportsSpeechSynthesizerTtsUrls = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsTargetPlatform(String str) {
            if (str != null) {
                this.supportsTargetPlatform = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null supportsTargetPlatform");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsTtsSpeechmarks(boolean z) {
            this.supportsTtsSpeechmarks = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setSupportsVideoCalling(boolean z) {
            this.supportsVideoCalling = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags.Builder
        public LegacyFlags.Builder setVoiceProfileSwitchingDisabled(boolean z) {
            this.voiceProfileSwitchingDisabled = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_LegacyFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i, String str, String str2, String str3) {
        this.supportsTtsSpeechmarks = z;
        this.supportsSpeechSynthesizerTtsUrls = z2;
        this.supportsAudioPlayerTtsUrls = z3;
        this.supportsLyricsInCard = z4;
        this.supportsPfmChanged = z5;
        this.supportsScrubbing = z6;
        this.supportsHomeAutomation = z7;
        this.supportsKeysInHeader = z8;
        this.supportsMixingBehaviorForAudioPlayer = z9;
        this.supportsComms = z10;
        this.supportsDropinOutbound = z11;
        this.supportsSipOutboundCalling = z12;
        this.supportsVideoCalling = z13;
        this.voiceProfileSwitchingDisabled = z14;
        this.supportsArbitration = z15;
        this.supportsSecureLockscreen = z16;
        this.supportsAxon = z17;
        this.screenWidth = i;
        this.friendlyNameTemplate = str;
        this.supportsDatamartNamespace = str2;
        this.supportsTargetPlatform = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LegacyFlags) {
            LegacyFlags legacyFlags = (LegacyFlags) obj;
            if (this.supportsTtsSpeechmarks == legacyFlags.getSupportsTtsSpeechmarks() && this.supportsSpeechSynthesizerTtsUrls == legacyFlags.getSupportsSpeechSynthesizerTtsUrls() && this.supportsAudioPlayerTtsUrls == legacyFlags.getSupportsAudioPlayerTtsUrls() && this.supportsLyricsInCard == legacyFlags.getSupportsLyricsInCard() && this.supportsPfmChanged == legacyFlags.getSupportsPfmChanged() && this.supportsScrubbing == legacyFlags.getSupportsScrubbing() && this.supportsHomeAutomation == legacyFlags.getSupportsHomeAutomation() && this.supportsKeysInHeader == legacyFlags.getSupportsKeysInHeader() && this.supportsMixingBehaviorForAudioPlayer == legacyFlags.getSupportsMixingBehaviorForAudioPlayer() && this.supportsComms == legacyFlags.getSupportsComms() && this.supportsDropinOutbound == legacyFlags.getSupportsDropinOutbound() && this.supportsSipOutboundCalling == legacyFlags.getSupportsSipOutboundCalling() && this.supportsVideoCalling == legacyFlags.getSupportsVideoCalling() && this.voiceProfileSwitchingDisabled == legacyFlags.getVoiceProfileSwitchingDisabled() && this.supportsArbitration == legacyFlags.getSupportsArbitration() && this.supportsSecureLockscreen == legacyFlags.getSupportsSecureLockscreen() && this.supportsAxon == legacyFlags.getSupportsAxon() && this.screenWidth == legacyFlags.getScreenWidth() && this.friendlyNameTemplate.equals(legacyFlags.getFriendlyNameTemplate()) && this.supportsDatamartNamespace.equals(legacyFlags.getSupportsDatamartNamespace()) && this.supportsTargetPlatform.equals(legacyFlags.getSupportsTargetPlatform())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public String getFriendlyNameTemplate() {
        return this.friendlyNameTemplate;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public int getScreenWidth() {
        return this.screenWidth;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsArbitration() {
        return this.supportsArbitration;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsAudioPlayerTtsUrls() {
        return this.supportsAudioPlayerTtsUrls;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsAxon() {
        return this.supportsAxon;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsComms() {
        return this.supportsComms;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public String getSupportsDatamartNamespace() {
        return this.supportsDatamartNamespace;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsDropinOutbound() {
        return this.supportsDropinOutbound;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsHomeAutomation() {
        return this.supportsHomeAutomation;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsKeysInHeader() {
        return this.supportsKeysInHeader;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsLyricsInCard() {
        return this.supportsLyricsInCard;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsMixingBehaviorForAudioPlayer() {
        return this.supportsMixingBehaviorForAudioPlayer;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsPfmChanged() {
        return this.supportsPfmChanged;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsScrubbing() {
        return this.supportsScrubbing;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsSecureLockscreen() {
        return this.supportsSecureLockscreen;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsSipOutboundCalling() {
        return this.supportsSipOutboundCalling;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsSpeechSynthesizerTtsUrls() {
        return this.supportsSpeechSynthesizerTtsUrls;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public String getSupportsTargetPlatform() {
        return this.supportsTargetPlatform;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsTtsSpeechmarks() {
        return this.supportsTtsSpeechmarks;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getSupportsVideoCalling() {
        return this.supportsVideoCalling;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags
    public boolean getVoiceProfileSwitchingDisabled() {
        return this.voiceProfileSwitchingDisabled;
    }

    public int hashCode() {
        return this.supportsTargetPlatform.hashCode() ^ (((((((((((((((((((((((((((((((((((((((((this.supportsTtsSpeechmarks ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.supportsSpeechSynthesizerTtsUrls ? 1231 : 1237)) * 1000003) ^ (this.supportsAudioPlayerTtsUrls ? 1231 : 1237)) * 1000003) ^ (this.supportsLyricsInCard ? 1231 : 1237)) * 1000003) ^ (this.supportsPfmChanged ? 1231 : 1237)) * 1000003) ^ (this.supportsScrubbing ? 1231 : 1237)) * 1000003) ^ (this.supportsHomeAutomation ? 1231 : 1237)) * 1000003) ^ (this.supportsKeysInHeader ? 1231 : 1237)) * 1000003) ^ (this.supportsMixingBehaviorForAudioPlayer ? 1231 : 1237)) * 1000003) ^ (this.supportsComms ? 1231 : 1237)) * 1000003) ^ (this.supportsDropinOutbound ? 1231 : 1237)) * 1000003) ^ (this.supportsSipOutboundCalling ? 1231 : 1237)) * 1000003) ^ (this.supportsVideoCalling ? 1231 : 1237)) * 1000003) ^ (this.voiceProfileSwitchingDisabled ? 1231 : 1237)) * 1000003) ^ (this.supportsArbitration ? 1231 : 1237)) * 1000003) ^ (this.supportsSecureLockscreen ? 1231 : 1237)) * 1000003) ^ (this.supportsAxon ? 1231 : 1237)) * 1000003) ^ this.screenWidth) * 1000003) ^ this.friendlyNameTemplate.hashCode()) * 1000003) ^ this.supportsDatamartNamespace.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LegacyFlags{supportsTtsSpeechmarks=");
        sb.append(this.supportsTtsSpeechmarks);
        sb.append(", supportsSpeechSynthesizerTtsUrls=");
        sb.append(this.supportsSpeechSynthesizerTtsUrls);
        sb.append(", supportsAudioPlayerTtsUrls=");
        sb.append(this.supportsAudioPlayerTtsUrls);
        sb.append(", supportsLyricsInCard=");
        sb.append(this.supportsLyricsInCard);
        sb.append(", supportsPfmChanged=");
        sb.append(this.supportsPfmChanged);
        sb.append(", supportsScrubbing=");
        sb.append(this.supportsScrubbing);
        sb.append(", supportsHomeAutomation=");
        sb.append(this.supportsHomeAutomation);
        sb.append(", supportsKeysInHeader=");
        sb.append(this.supportsKeysInHeader);
        sb.append(", supportsMixingBehaviorForAudioPlayer=");
        sb.append(this.supportsMixingBehaviorForAudioPlayer);
        sb.append(", supportsComms=");
        sb.append(this.supportsComms);
        sb.append(", supportsDropinOutbound=");
        sb.append(this.supportsDropinOutbound);
        sb.append(", supportsSipOutboundCalling=");
        sb.append(this.supportsSipOutboundCalling);
        sb.append(", supportsVideoCalling=");
        sb.append(this.supportsVideoCalling);
        sb.append(", voiceProfileSwitchingDisabled=");
        sb.append(this.voiceProfileSwitchingDisabled);
        sb.append(", supportsArbitration=");
        sb.append(this.supportsArbitration);
        sb.append(", supportsSecureLockscreen=");
        sb.append(this.supportsSecureLockscreen);
        sb.append(", supportsAxon=");
        sb.append(this.supportsAxon);
        sb.append(", screenWidth=");
        sb.append(this.screenWidth);
        sb.append(", friendlyNameTemplate=");
        sb.append(this.friendlyNameTemplate);
        sb.append(", supportsDatamartNamespace=");
        sb.append(this.supportsDatamartNamespace);
        sb.append(", supportsTargetPlatform=");
        return a$$ExternalSyntheticOutline0.m(sb, this.supportsTargetPlatform, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_LegacyFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i, String str, String str2, String str3, int i2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, i, str, str2, str3);
    }
}
