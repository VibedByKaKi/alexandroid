package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/unified/SurfaceLook;", "", "isConversationInput", "", "presentation", "Lcom/amazon/alexa/ra/unified/SurfacePresentation;", "restingHint", "", "<init>", "(ZLcom/amazon/alexa/ra/unified/SurfacePresentation;Ljava/lang/String;)V", "()Z", "getPresentation", "()Lcom/amazon/alexa/ra/unified/SurfacePresentation;", "getRestingHint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SurfaceLook {
    public static final int $stable = 0;
    private final boolean isConversationInput;

    @NotNull
    private final SurfacePresentation presentation;

    @Nullable
    private final String restingHint;

    public SurfaceLook(boolean z, @NotNull SurfacePresentation surfacePresentation, @Nullable String str) {
        surfacePresentation.getClass();
        this.isConversationInput = z;
        this.presentation = surfacePresentation;
        this.restingHint = str;
    }

    public static /* synthetic */ SurfaceLook copy$default(SurfaceLook surfaceLook, boolean z, SurfacePresentation surfacePresentation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = surfaceLook.isConversationInput;
        }
        if ((i & 2) != 0) {
            surfacePresentation = surfaceLook.presentation;
        }
        if ((i & 4) != 0) {
            str = surfaceLook.restingHint;
        }
        return surfaceLook.copy(z, surfacePresentation, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConversationInput() {
        return this.isConversationInput;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SurfacePresentation getPresentation() {
        return this.presentation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRestingHint() {
        return this.restingHint;
    }

    @NotNull
    public final SurfaceLook copy(boolean isConversationInput, @NotNull SurfacePresentation presentation, @Nullable String restingHint) {
        presentation.getClass();
        return new SurfaceLook(isConversationInput, presentation, restingHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceLook)) {
            return false;
        }
        SurfaceLook surfaceLook = (SurfaceLook) other;
        return this.isConversationInput == surfaceLook.isConversationInput && Intrinsics.areEqual(this.presentation, surfaceLook.presentation) && Intrinsics.areEqual(this.restingHint, surfaceLook.restingHint);
    }

    @NotNull
    public final SurfacePresentation getPresentation() {
        return this.presentation;
    }

    @Nullable
    public final String getRestingHint() {
        return this.restingHint;
    }

    public int hashCode() {
        int hashCode = (this.presentation.hashCode() + (Boolean.hashCode(this.isConversationInput) * 31)) * 31;
        String str = this.restingHint;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isConversationInput() {
        return this.isConversationInput;
    }

    @NotNull
    public String toString() {
        boolean z = this.isConversationInput;
        SurfacePresentation surfacePresentation = this.presentation;
        String str = this.restingHint;
        StringBuilder sb = new StringBuilder("SurfaceLook(isConversationInput=");
        sb.append(z);
        sb.append(", presentation=");
        sb.append(surfacePresentation);
        sb.append(", restingHint=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
