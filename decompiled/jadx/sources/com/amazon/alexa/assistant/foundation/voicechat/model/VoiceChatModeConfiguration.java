package com.amazon.alexa.assistant.foundation.voicechat.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeConfiguration;", "", "prerollDurationMs", "", "aecEnabled", "", "noiseSuppressionEnabled", "pauseResumeEnabled", "<init>", "(IZZZ)V", "getPrerollDurationMs", "()I", "getAecEnabled", "()Z", "getNoiseSuppressionEnabled", "getPauseResumeEnabled", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VoiceChatModeConfiguration {
    private final boolean aecEnabled;
    private final boolean noiseSuppressionEnabled;
    private final boolean pauseResumeEnabled;
    private final int prerollDurationMs;

    public /* synthetic */ VoiceChatModeConfiguration(int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 512 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3);
    }

    public static /* synthetic */ VoiceChatModeConfiguration copy$default(VoiceChatModeConfiguration voiceChatModeConfiguration, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = voiceChatModeConfiguration.prerollDurationMs;
        }
        if ((i2 & 2) != 0) {
            z = voiceChatModeConfiguration.aecEnabled;
        }
        if ((i2 & 4) != 0) {
            z2 = voiceChatModeConfiguration.noiseSuppressionEnabled;
        }
        if ((i2 & 8) != 0) {
            z3 = voiceChatModeConfiguration.pauseResumeEnabled;
        }
        return voiceChatModeConfiguration.copy(i, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPrerollDurationMs() {
        return this.prerollDurationMs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAecEnabled() {
        return this.aecEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNoiseSuppressionEnabled() {
        return this.noiseSuppressionEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPauseResumeEnabled() {
        return this.pauseResumeEnabled;
    }

    @NotNull
    public final VoiceChatModeConfiguration copy(int prerollDurationMs, boolean aecEnabled, boolean noiseSuppressionEnabled, boolean pauseResumeEnabled) {
        return new VoiceChatModeConfiguration(prerollDurationMs, aecEnabled, noiseSuppressionEnabled, pauseResumeEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceChatModeConfiguration)) {
            return false;
        }
        VoiceChatModeConfiguration voiceChatModeConfiguration = (VoiceChatModeConfiguration) other;
        return this.prerollDurationMs == voiceChatModeConfiguration.prerollDurationMs && this.aecEnabled == voiceChatModeConfiguration.aecEnabled && this.noiseSuppressionEnabled == voiceChatModeConfiguration.noiseSuppressionEnabled && this.pauseResumeEnabled == voiceChatModeConfiguration.pauseResumeEnabled;
    }

    public final boolean getAecEnabled() {
        return this.aecEnabled;
    }

    public final boolean getNoiseSuppressionEnabled() {
        return this.noiseSuppressionEnabled;
    }

    public final boolean getPauseResumeEnabled() {
        return this.pauseResumeEnabled;
    }

    public final int getPrerollDurationMs() {
        return this.prerollDurationMs;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pauseResumeEnabled) + DoubleList$$ExternalSyntheticOutline0.m(this.noiseSuppressionEnabled, DoubleList$$ExternalSyntheticOutline0.m(this.aecEnabled, Integer.hashCode(this.prerollDurationMs) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.prerollDurationMs;
        boolean z = this.aecEnabled;
        boolean z2 = this.noiseSuppressionEnabled;
        boolean z3 = this.pauseResumeEnabled;
        StringBuilder sb = new StringBuilder("VoiceChatModeConfiguration(prerollDurationMs=");
        sb.append(i);
        sb.append(", aecEnabled=");
        sb.append(z);
        sb.append(", noiseSuppressionEnabled=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(sb, z2, ", pauseResumeEnabled=", z3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public VoiceChatModeConfiguration(int i, boolean z, boolean z2, boolean z3) {
        this.prerollDurationMs = i;
        this.aecEnabled = z;
        this.noiseSuppressionEnabled = z2;
        this.pauseResumeEnabled = z3;
    }

    public VoiceChatModeConfiguration() {
        this(0, false, false, false, 15, null);
    }
}
