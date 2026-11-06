package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.custom.PlaceholderHintTransition;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/unified/HintCycleStep;", "", "delayMs", "", "hint", "", "transition", "Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;", "<init>", "(JLjava/lang/String;Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;)V", "getDelayMs", "()J", "getHint", "()Ljava/lang/String;", "getTransition", "()Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class HintCycleStep {
    public static final int $stable = 0;
    private final long delayMs;

    @Nullable
    private final String hint;

    @NotNull
    private final PlaceholderHintTransition transition;

    public HintCycleStep(long j, @Nullable String str, @NotNull PlaceholderHintTransition placeholderHintTransition) {
        placeholderHintTransition.getClass();
        this.delayMs = j;
        this.hint = str;
        this.transition = placeholderHintTransition;
    }

    public static /* synthetic */ HintCycleStep copy$default(HintCycleStep hintCycleStep, long j, String str, PlaceholderHintTransition placeholderHintTransition, int i, Object obj) {
        if ((i & 1) != 0) {
            j = hintCycleStep.delayMs;
        }
        if ((i & 2) != 0) {
            str = hintCycleStep.hint;
        }
        if ((i & 4) != 0) {
            placeholderHintTransition = hintCycleStep.transition;
        }
        return hintCycleStep.copy(j, str, placeholderHintTransition);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDelayMs() {
        return this.delayMs;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PlaceholderHintTransition getTransition() {
        return this.transition;
    }

    @NotNull
    public final HintCycleStep copy(long delayMs, @Nullable String hint, @NotNull PlaceholderHintTransition transition) {
        transition.getClass();
        return new HintCycleStep(delayMs, hint, transition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintCycleStep)) {
            return false;
        }
        HintCycleStep hintCycleStep = (HintCycleStep) other;
        return this.delayMs == hintCycleStep.delayMs && Intrinsics.areEqual(this.hint, hintCycleStep.hint) && this.transition == hintCycleStep.transition;
    }

    public final long getDelayMs() {
        return this.delayMs;
    }

    @Nullable
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final PlaceholderHintTransition getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.delayMs) * 31;
        String str = this.hint;
        return this.transition.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.delayMs;
        String str = this.hint;
        PlaceholderHintTransition placeholderHintTransition = this.transition;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("HintCycleStep(delayMs=", j, ", hint=", str);
        m.append(", transition=");
        m.append(placeholderHintTransition);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
