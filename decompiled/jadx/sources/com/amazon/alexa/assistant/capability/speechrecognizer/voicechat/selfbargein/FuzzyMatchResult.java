package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatchResult;", "", "score", "", "totalMatchedWordCount", "", "contiguousMatchedWordCount", "<init>", "(DII)V", "getScore", "()D", "getTotalMatchedWordCount", "()I", "getContiguousMatchedWordCount", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FuzzyMatchResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FuzzyMatchResult EMPTY = new FuzzyMatchResult(0.0d, 0, 0);
    private final int contiguousMatchedWordCount;
    private final double score;
    private final int totalMatchedWordCount;

    public FuzzyMatchResult(double d, int i, int i2) {
        this.score = d;
        this.totalMatchedWordCount = i;
        this.contiguousMatchedWordCount = i2;
    }

    public static /* synthetic */ FuzzyMatchResult copy$default(FuzzyMatchResult fuzzyMatchResult, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = fuzzyMatchResult.score;
        }
        if ((i3 & 2) != 0) {
            i = fuzzyMatchResult.totalMatchedWordCount;
        }
        if ((i3 & 4) != 0) {
            i2 = fuzzyMatchResult.contiguousMatchedWordCount;
        }
        return fuzzyMatchResult.copy(d, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalMatchedWordCount() {
        return this.totalMatchedWordCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getContiguousMatchedWordCount() {
        return this.contiguousMatchedWordCount;
    }

    @NotNull
    public final FuzzyMatchResult copy(double score, int totalMatchedWordCount, int contiguousMatchedWordCount) {
        return new FuzzyMatchResult(score, totalMatchedWordCount, contiguousMatchedWordCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuzzyMatchResult)) {
            return false;
        }
        FuzzyMatchResult fuzzyMatchResult = (FuzzyMatchResult) other;
        return Double.compare(this.score, fuzzyMatchResult.score) == 0 && this.totalMatchedWordCount == fuzzyMatchResult.totalMatchedWordCount && this.contiguousMatchedWordCount == fuzzyMatchResult.contiguousMatchedWordCount;
    }

    public final int getContiguousMatchedWordCount() {
        return this.contiguousMatchedWordCount;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getTotalMatchedWordCount() {
        return this.totalMatchedWordCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.contiguousMatchedWordCount) + ArcMode$$ExternalSyntheticOutline0.m(this.totalMatchedWordCount, Double.hashCode(this.score) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FuzzyMatchResult(score=" + this.score + ", totalMatchedWordCount=" + this.totalMatchedWordCount + ", contiguousMatchedWordCount=" + this.contiguousMatchedWordCount + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatchResult$Companion;", "", "<init>", "()V", SimbaEventProcessor.SOURCE_EMPTY, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatchResult;", "getEMPTY", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatchResult;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FuzzyMatchResult getEMPTY() {
            return FuzzyMatchResult.EMPTY;
        }

        private Companion() {
        }
    }
}
