package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/unified/SurfaceInputs;", "", "variant", "Lcom/amazon/alexa/ra/unified/UnifiedIngressBarSurfaceVariant;", "restingHint", "", "<init>", "(Lcom/amazon/alexa/ra/unified/UnifiedIngressBarSurfaceVariant;Ljava/lang/String;)V", "getVariant", "()Lcom/amazon/alexa/ra/unified/UnifiedIngressBarSurfaceVariant;", "getRestingHint", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SurfaceInputs {
    public static final int $stable = 0;

    @Nullable
    private final String restingHint;

    @NotNull
    private final UnifiedIngressBarSurfaceVariant variant;

    public SurfaceInputs(@NotNull UnifiedIngressBarSurfaceVariant unifiedIngressBarSurfaceVariant, @Nullable String str) {
        unifiedIngressBarSurfaceVariant.getClass();
        this.variant = unifiedIngressBarSurfaceVariant;
        this.restingHint = str;
    }

    public static /* synthetic */ SurfaceInputs copy$default(SurfaceInputs surfaceInputs, UnifiedIngressBarSurfaceVariant unifiedIngressBarSurfaceVariant, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedIngressBarSurfaceVariant = surfaceInputs.variant;
        }
        if ((i & 2) != 0) {
            str = surfaceInputs.restingHint;
        }
        return surfaceInputs.copy(unifiedIngressBarSurfaceVariant, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UnifiedIngressBarSurfaceVariant getVariant() {
        return this.variant;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getRestingHint() {
        return this.restingHint;
    }

    @NotNull
    public final SurfaceInputs copy(@NotNull UnifiedIngressBarSurfaceVariant variant, @Nullable String restingHint) {
        variant.getClass();
        return new SurfaceInputs(variant, restingHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceInputs)) {
            return false;
        }
        SurfaceInputs surfaceInputs = (SurfaceInputs) other;
        return this.variant == surfaceInputs.variant && Intrinsics.areEqual(this.restingHint, surfaceInputs.restingHint);
    }

    @Nullable
    public final String getRestingHint() {
        return this.restingHint;
    }

    @NotNull
    public final UnifiedIngressBarSurfaceVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int hashCode = this.variant.hashCode() * 31;
        String str = this.restingHint;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SurfaceInputs(variant=" + this.variant + ", restingHint=" + this.restingHint + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
