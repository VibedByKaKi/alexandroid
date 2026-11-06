package com.amazon.alexa.assistant.opusencoder.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.opusencoder.model.OpusConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusCodecConfig;", "", "sampleRate", "Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$SampleRate;", "channels", "Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Channels;", "applicationType", "Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$ApplicationType;", "bitrate", "Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Bitrate;", "complexity", "", "useVbr", "", "<init>", "(Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$SampleRate;Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Channels;Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$ApplicationType;Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Bitrate;IZ)V", "getSampleRate", "()Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$SampleRate;", "getChannels", "()Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Channels;", "getApplicationType", "()Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$ApplicationType;", "getBitrate", "()Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Bitrate;", "getComplexity", "()I", "getUseVbr", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OpusCodecConfig {

    @NotNull
    private final OpusConstants.ApplicationType applicationType;

    @NotNull
    private final OpusConstants.Bitrate bitrate;

    @NotNull
    private final OpusConstants.Channels channels;
    private final int complexity;

    @NotNull
    private final OpusConstants.SampleRate sampleRate;
    private final boolean useVbr;

    public /* synthetic */ OpusCodecConfig(OpusConstants.SampleRate sampleRate, OpusConstants.Channels channels, OpusConstants.ApplicationType applicationType, OpusConstants.Bitrate bitrate, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OpusConstants.SampleRate.RATE_16000 : sampleRate, (i2 & 2) != 0 ? OpusConstants.Channels.MONO : channels, (i2 & 4) != 0 ? OpusConstants.ApplicationType.VOIP : applicationType, (i2 & 8) != 0 ? OpusConstants.Bitrate.BITRATE_32K : bitrate, (i2 & 16) != 0 ? 4 : i, (i2 & 32) != 0 ? false : z);
    }

    public static /* synthetic */ OpusCodecConfig copy$default(OpusCodecConfig opusCodecConfig, OpusConstants.SampleRate sampleRate, OpusConstants.Channels channels, OpusConstants.ApplicationType applicationType, OpusConstants.Bitrate bitrate, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sampleRate = opusCodecConfig.sampleRate;
        }
        if ((i2 & 2) != 0) {
            channels = opusCodecConfig.channels;
        }
        if ((i2 & 4) != 0) {
            applicationType = opusCodecConfig.applicationType;
        }
        if ((i2 & 8) != 0) {
            bitrate = opusCodecConfig.bitrate;
        }
        if ((i2 & 16) != 0) {
            i = opusCodecConfig.complexity;
        }
        if ((i2 & 32) != 0) {
            z = opusCodecConfig.useVbr;
        }
        int i3 = i;
        boolean z2 = z;
        return opusCodecConfig.copy(sampleRate, channels, applicationType, bitrate, i3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OpusConstants.SampleRate getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OpusConstants.Channels getChannels() {
        return this.channels;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OpusConstants.ApplicationType getApplicationType() {
        return this.applicationType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final OpusConstants.Bitrate getBitrate() {
        return this.bitrate;
    }

    /* renamed from: component5, reason: from getter */
    public final int getComplexity() {
        return this.complexity;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUseVbr() {
        return this.useVbr;
    }

    @NotNull
    public final OpusCodecConfig copy(@NotNull OpusConstants.SampleRate sampleRate, @NotNull OpusConstants.Channels channels, @NotNull OpusConstants.ApplicationType applicationType, @NotNull OpusConstants.Bitrate bitrate, int complexity, boolean useVbr) {
        sampleRate.getClass();
        channels.getClass();
        applicationType.getClass();
        bitrate.getClass();
        return new OpusCodecConfig(sampleRate, channels, applicationType, bitrate, complexity, useVbr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpusCodecConfig)) {
            return false;
        }
        OpusCodecConfig opusCodecConfig = (OpusCodecConfig) other;
        return this.sampleRate == opusCodecConfig.sampleRate && this.channels == opusCodecConfig.channels && this.applicationType == opusCodecConfig.applicationType && this.bitrate == opusCodecConfig.bitrate && this.complexity == opusCodecConfig.complexity && this.useVbr == opusCodecConfig.useVbr;
    }

    @NotNull
    public final OpusConstants.ApplicationType getApplicationType() {
        return this.applicationType;
    }

    @NotNull
    public final OpusConstants.Bitrate getBitrate() {
        return this.bitrate;
    }

    @NotNull
    public final OpusConstants.Channels getChannels() {
        return this.channels;
    }

    public final int getComplexity() {
        return this.complexity;
    }

    @NotNull
    public final OpusConstants.SampleRate getSampleRate() {
        return this.sampleRate;
    }

    public final boolean getUseVbr() {
        return this.useVbr;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useVbr) + ArcMode$$ExternalSyntheticOutline0.m(this.complexity, (this.bitrate.hashCode() + ((this.applicationType.hashCode() + ((this.channels.hashCode() + (this.sampleRate.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "OpusCodecConfig(sampleRate=" + this.sampleRate + ", channels=" + this.channels + ", applicationType=" + this.applicationType + ", bitrate=" + this.bitrate + ", complexity=" + this.complexity + ", useVbr=" + this.useVbr + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public OpusCodecConfig(@NotNull OpusConstants.SampleRate sampleRate, @NotNull OpusConstants.Channels channels, @NotNull OpusConstants.ApplicationType applicationType, @NotNull OpusConstants.Bitrate bitrate, int i, boolean z) {
        sampleRate.getClass();
        channels.getClass();
        applicationType.getClass();
        bitrate.getClass();
        this.sampleRate = sampleRate;
        this.channels = channels;
        this.applicationType = applicationType;
        this.bitrate = bitrate;
        this.complexity = i;
        this.useVbr = z;
    }

    public OpusCodecConfig() {
        this(null, null, null, null, 0, false, 63, null);
    }
}
