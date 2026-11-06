package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.custom.PlaceholderHintTransition;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/unified/HintCycleFrame;", "", "look", "Lcom/amazon/alexa/ra/unified/SurfaceLook;", "hint", "", "transition", "Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;", "finalHint", "<init>", "(Lcom/amazon/alexa/ra/unified/SurfaceLook;Ljava/lang/String;Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;Ljava/lang/String;)V", "getLook", "()Lcom/amazon/alexa/ra/unified/SurfaceLook;", "getHint", "()Ljava/lang/String;", "getTransition", "()Lcom/amazon/alexa/ra/core/ui/custom/PlaceholderHintTransition;", "getFinalHint", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class HintCycleFrame {
    public static final int $stable = 0;

    @Nullable
    private final String finalHint;

    @Nullable
    private final String hint;

    @NotNull
    private final SurfaceLook look;

    @NotNull
    private final PlaceholderHintTransition transition;

    public HintCycleFrame(@NotNull SurfaceLook surfaceLook, @Nullable String str, @NotNull PlaceholderHintTransition placeholderHintTransition, @Nullable String str2) {
        surfaceLook.getClass();
        placeholderHintTransition.getClass();
        this.look = surfaceLook;
        this.hint = str;
        this.transition = placeholderHintTransition;
        this.finalHint = str2;
    }

    public static /* synthetic */ HintCycleFrame copy$default(HintCycleFrame hintCycleFrame, SurfaceLook surfaceLook, String str, PlaceholderHintTransition placeholderHintTransition, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            surfaceLook = hintCycleFrame.look;
        }
        if ((i & 2) != 0) {
            str = hintCycleFrame.hint;
        }
        if ((i & 4) != 0) {
            placeholderHintTransition = hintCycleFrame.transition;
        }
        if ((i & 8) != 0) {
            str2 = hintCycleFrame.finalHint;
        }
        return hintCycleFrame.copy(surfaceLook, str, placeholderHintTransition, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SurfaceLook getLook() {
        return this.look;
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

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFinalHint() {
        return this.finalHint;
    }

    @NotNull
    public final HintCycleFrame copy(@NotNull SurfaceLook look, @Nullable String hint, @NotNull PlaceholderHintTransition transition, @Nullable String finalHint) {
        look.getClass();
        transition.getClass();
        return new HintCycleFrame(look, hint, transition, finalHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintCycleFrame)) {
            return false;
        }
        HintCycleFrame hintCycleFrame = (HintCycleFrame) other;
        return Intrinsics.areEqual(this.look, hintCycleFrame.look) && Intrinsics.areEqual(this.hint, hintCycleFrame.hint) && this.transition == hintCycleFrame.transition && Intrinsics.areEqual(this.finalHint, hintCycleFrame.finalHint);
    }

    @Nullable
    public final String getFinalHint() {
        return this.finalHint;
    }

    @Nullable
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final SurfaceLook getLook() {
        return this.look;
    }

    @NotNull
    public final PlaceholderHintTransition getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int hashCode = this.look.hashCode() * 31;
        String str = this.hint;
        int hashCode2 = (this.transition.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.finalHint;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HintCycleFrame(look=" + this.look + ", hint=" + this.hint + ", transition=" + this.transition + ", finalHint=" + this.finalHint + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
