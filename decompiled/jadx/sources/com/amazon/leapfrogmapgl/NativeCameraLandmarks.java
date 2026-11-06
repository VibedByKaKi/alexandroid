package com.amazon.leapfrogmapgl;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeCameraLandmarks;", "", "far", "Lcom/amazon/leapfrogmapgl/NativeCameraFit;", "fit", "near", "<init>", "(Lcom/amazon/leapfrogmapgl/NativeCameraFit;Lcom/amazon/leapfrogmapgl/NativeCameraFit;Lcom/amazon/leapfrogmapgl/NativeCameraFit;)V", "getFar", "()Lcom/amazon/leapfrogmapgl/NativeCameraFit;", "getFit", "getNear", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeCameraLandmarks {

    @NotNull
    private final NativeCameraFit far;

    @NotNull
    private final NativeCameraFit fit;

    @NotNull
    private final NativeCameraFit near;

    public NativeCameraLandmarks(@NotNull NativeCameraFit nativeCameraFit, @NotNull NativeCameraFit nativeCameraFit2, @NotNull NativeCameraFit nativeCameraFit3) {
        nativeCameraFit.getClass();
        nativeCameraFit2.getClass();
        nativeCameraFit3.getClass();
        this.far = nativeCameraFit;
        this.fit = nativeCameraFit2;
        this.near = nativeCameraFit3;
    }

    public static /* synthetic */ NativeCameraLandmarks copy$default(NativeCameraLandmarks nativeCameraLandmarks, NativeCameraFit nativeCameraFit, NativeCameraFit nativeCameraFit2, NativeCameraFit nativeCameraFit3, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeCameraFit = nativeCameraLandmarks.far;
        }
        if ((i & 2) != 0) {
            nativeCameraFit2 = nativeCameraLandmarks.fit;
        }
        if ((i & 4) != 0) {
            nativeCameraFit3 = nativeCameraLandmarks.near;
        }
        return nativeCameraLandmarks.copy(nativeCameraFit, nativeCameraFit2, nativeCameraFit3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NativeCameraFit getFar() {
        return this.far;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NativeCameraFit getFit() {
        return this.fit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NativeCameraFit getNear() {
        return this.near;
    }

    @NotNull
    public final NativeCameraLandmarks copy(@NotNull NativeCameraFit far, @NotNull NativeCameraFit fit, @NotNull NativeCameraFit near) {
        far.getClass();
        fit.getClass();
        near.getClass();
        return new NativeCameraLandmarks(far, fit, near);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeCameraLandmarks)) {
            return false;
        }
        NativeCameraLandmarks nativeCameraLandmarks = (NativeCameraLandmarks) other;
        return Intrinsics.areEqual(this.far, nativeCameraLandmarks.far) && Intrinsics.areEqual(this.fit, nativeCameraLandmarks.fit) && Intrinsics.areEqual(this.near, nativeCameraLandmarks.near);
    }

    @NotNull
    public final NativeCameraFit getFar() {
        return this.far;
    }

    @NotNull
    public final NativeCameraFit getFit() {
        return this.fit;
    }

    @NotNull
    public final NativeCameraFit getNear() {
        return this.near;
    }

    public int hashCode() {
        return this.near.hashCode() + ((this.fit.hashCode() + (this.far.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "NativeCameraLandmarks(far=" + this.far + ", fit=" + this.fit + ", near=" + this.near + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
