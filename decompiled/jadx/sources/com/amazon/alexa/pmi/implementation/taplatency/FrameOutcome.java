package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/FrameOutcome;", "", "qualifies", "", "ttfrMs", "", "<init>", "(ZD)V", "getQualifies", "()Z", "getTtfrMs", "()D", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FrameOutcome {
    private final boolean qualifies;
    private final double ttfrMs;

    public FrameOutcome(boolean z, double d) {
        this.qualifies = z;
        this.ttfrMs = d;
    }

    public static /* synthetic */ FrameOutcome copy$default(FrameOutcome frameOutcome, boolean z, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = frameOutcome.qualifies;
        }
        if ((i & 2) != 0) {
            d = frameOutcome.ttfrMs;
        }
        return frameOutcome.copy(z, d);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getQualifies() {
        return this.qualifies;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTtfrMs() {
        return this.ttfrMs;
    }

    @NotNull
    public final FrameOutcome copy(boolean qualifies, double ttfrMs) {
        return new FrameOutcome(qualifies, ttfrMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameOutcome)) {
            return false;
        }
        FrameOutcome frameOutcome = (FrameOutcome) other;
        return this.qualifies == frameOutcome.qualifies && Double.compare(this.ttfrMs, frameOutcome.ttfrMs) == 0;
    }

    public final boolean getQualifies() {
        return this.qualifies;
    }

    public final double getTtfrMs() {
        return this.ttfrMs;
    }

    public int hashCode() {
        return Double.hashCode(this.ttfrMs) + (Boolean.hashCode(this.qualifies) * 31);
    }

    @NotNull
    public String toString() {
        return "FrameOutcome(qualifies=" + this.qualifies + ", ttfrMs=" + this.ttfrMs + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
