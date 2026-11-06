package com.amazon.alexa.redesign.compose.home;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/redesign/compose/home/SwipeProgress;", "", "progressToFull", "", "isHeadingUp", "", "<init>", "(FZ)V", "getProgressToFull", "()F", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SwipeProgress {
    public static final int $stable = 0;
    private final boolean isHeadingUp;
    private final float progressToFull;

    public SwipeProgress(float f, boolean z) {
        this.progressToFull = f;
        this.isHeadingUp = z;
    }

    public static /* synthetic */ SwipeProgress copy$default(SwipeProgress swipeProgress, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = swipeProgress.progressToFull;
        }
        if ((i & 2) != 0) {
            z = swipeProgress.isHeadingUp;
        }
        return swipeProgress.copy(f, z);
    }

    /* renamed from: component1, reason: from getter */
    public final float getProgressToFull() {
        return this.progressToFull;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsHeadingUp() {
        return this.isHeadingUp;
    }

    @NotNull
    public final SwipeProgress copy(float progressToFull, boolean isHeadingUp) {
        return new SwipeProgress(progressToFull, isHeadingUp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) other;
        return Float.compare(this.progressToFull, swipeProgress.progressToFull) == 0 && this.isHeadingUp == swipeProgress.isHeadingUp;
    }

    public final float getProgressToFull() {
        return this.progressToFull;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isHeadingUp) + (Float.hashCode(this.progressToFull) * 31);
    }

    public final boolean isHeadingUp() {
        return this.isHeadingUp;
    }

    @NotNull
    public String toString() {
        return "SwipeProgress(progressToFull=" + this.progressToFull + ", isHeadingUp=" + this.isHeadingUp + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
