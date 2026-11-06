package androidx.paging;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "generationId", "", "hint", "Landroidx/paging/ViewportHint;", "(ILandroidx/paging/ViewportHint;)V", "getGenerationId", "()I", "getHint", "()Landroidx/paging/ViewportHint;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes14.dex */
public final /* data */ class GenerationalViewportHint {
    private final int generationId;

    @NotNull
    private final ViewportHint hint;

    public GenerationalViewportHint(int i, @NotNull ViewportHint viewportHint) {
        viewportHint.getClass();
        this.generationId = i;
        this.hint = viewportHint;
    }

    public static /* synthetic */ GenerationalViewportHint copy$default(GenerationalViewportHint generationalViewportHint, int i, ViewportHint viewportHint, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = generationalViewportHint.generationId;
        }
        if ((i2 & 2) != 0) {
            viewportHint = generationalViewportHint.hint;
        }
        return generationalViewportHint.copy(i, viewportHint);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGenerationId() {
        return this.generationId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ViewportHint getHint() {
        return this.hint;
    }

    @NotNull
    public final GenerationalViewportHint copy(int generationId, @NotNull ViewportHint hint) {
        hint.getClass();
        return new GenerationalViewportHint(generationId, hint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) other;
        return this.generationId == generationalViewportHint.generationId && Intrinsics.areEqual(this.hint, generationalViewportHint.hint);
    }

    public final int getGenerationId() {
        return this.generationId;
    }

    @NotNull
    public final ViewportHint getHint() {
        return this.hint;
    }

    public int hashCode() {
        return this.hint.hashCode() + (Integer.hashCode(this.generationId) * 31);
    }

    @NotNull
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ')';
    }
}
