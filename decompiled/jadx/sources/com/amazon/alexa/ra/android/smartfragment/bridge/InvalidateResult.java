package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InvalidateResult;", "", "snapshotHandle", "", "abandoned", "", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/PendingSurface;", "<init>", "(JLjava/util/List;)V", "getSnapshotHandle", "()J", "getAbandoned", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InvalidateResult {
    public static final int $stable = 8;

    @NotNull
    private final List<PendingSurface> abandoned;
    private final long snapshotHandle;

    public InvalidateResult(long j, @NotNull List<PendingSurface> list) {
        list.getClass();
        this.snapshotHandle = j;
        this.abandoned = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvalidateResult copy$default(InvalidateResult invalidateResult, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = invalidateResult.snapshotHandle;
        }
        if ((i & 2) != 0) {
            list = invalidateResult.abandoned;
        }
        return invalidateResult.copy(j, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSnapshotHandle() {
        return this.snapshotHandle;
    }

    @NotNull
    public final List<PendingSurface> component2() {
        return this.abandoned;
    }

    @NotNull
    public final InvalidateResult copy(long snapshotHandle, @NotNull List<PendingSurface> abandoned) {
        abandoned.getClass();
        return new InvalidateResult(snapshotHandle, abandoned);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvalidateResult)) {
            return false;
        }
        InvalidateResult invalidateResult = (InvalidateResult) other;
        return this.snapshotHandle == invalidateResult.snapshotHandle && Intrinsics.areEqual(this.abandoned, invalidateResult.abandoned);
    }

    @NotNull
    public final List<PendingSurface> getAbandoned() {
        return this.abandoned;
    }

    public final long getSnapshotHandle() {
        return this.snapshotHandle;
    }

    public int hashCode() {
        return this.abandoned.hashCode() + (Long.hashCode(this.snapshotHandle) * 31);
    }

    @NotNull
    public String toString() {
        return "InvalidateResult(snapshotHandle=" + this.snapshotHandle + ", abandoned=" + this.abandoned + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
