package com.amazon.alexa.ra.sdk.audio;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;", "", "resId", "", "isLooping", "", "<init>", "(IZ)V", "getResId", "()I", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class TrackSpec {
    public static final int $stable = 0;
    private final boolean isLooping;
    private final int resId;

    public /* synthetic */ TrackSpec(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    public static /* synthetic */ TrackSpec copy$default(TrackSpec trackSpec, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trackSpec.resId;
        }
        if ((i2 & 2) != 0) {
            z = trackSpec.isLooping;
        }
        return trackSpec.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLooping() {
        return this.isLooping;
    }

    @NotNull
    public final TrackSpec copy(int resId, boolean isLooping) {
        return new TrackSpec(resId, isLooping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackSpec)) {
            return false;
        }
        TrackSpec trackSpec = (TrackSpec) other;
        return this.resId == trackSpec.resId && this.isLooping == trackSpec.isLooping;
    }

    public final int getResId() {
        return this.resId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLooping) + (Integer.hashCode(this.resId) * 31);
    }

    public final boolean isLooping() {
        return this.isLooping;
    }

    @NotNull
    public String toString() {
        return "TrackSpec(resId=" + this.resId + ", isLooping=" + this.isLooping + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public TrackSpec(int i, boolean z) {
        this.resId = i;
        this.isLooping = z;
    }
}
