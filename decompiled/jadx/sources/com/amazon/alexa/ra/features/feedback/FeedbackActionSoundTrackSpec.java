package com.amazon.alexa.ra.features.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.R;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.audio.TrackSpec;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/features/feedback/FeedbackActionSoundTrackSpec;", "", "likeFeedbackSoundTrackSpec", "Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;", "dislikeFeedbackSoundTrackSpec", "<init>", "(Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;)V", "getLikeFeedbackSoundTrackSpec", "()Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;", "getDislikeFeedbackSoundTrackSpec", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FeedbackActionSoundTrackSpec {
    public static final int $stable = 0;

    @NotNull
    private final TrackSpec dislikeFeedbackSoundTrackSpec;

    @NotNull
    private final TrackSpec likeFeedbackSoundTrackSpec;

    public /* synthetic */ FeedbackActionSoundTrackSpec(TrackSpec trackSpec, TrackSpec trackSpec2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TrackSpec(R.raw.ban_ui_global_action_like, false, 2, null) : trackSpec, (i & 2) != 0 ? new TrackSpec(R.raw.ban_ui_global_action_dislike, false, 2, null) : trackSpec2);
    }

    public static /* synthetic */ FeedbackActionSoundTrackSpec copy$default(FeedbackActionSoundTrackSpec feedbackActionSoundTrackSpec, TrackSpec trackSpec, TrackSpec trackSpec2, int i, Object obj) {
        if ((i & 1) != 0) {
            trackSpec = feedbackActionSoundTrackSpec.likeFeedbackSoundTrackSpec;
        }
        if ((i & 2) != 0) {
            trackSpec2 = feedbackActionSoundTrackSpec.dislikeFeedbackSoundTrackSpec;
        }
        return feedbackActionSoundTrackSpec.copy(trackSpec, trackSpec2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TrackSpec getLikeFeedbackSoundTrackSpec() {
        return this.likeFeedbackSoundTrackSpec;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TrackSpec getDislikeFeedbackSoundTrackSpec() {
        return this.dislikeFeedbackSoundTrackSpec;
    }

    @NotNull
    public final FeedbackActionSoundTrackSpec copy(@NotNull TrackSpec likeFeedbackSoundTrackSpec, @NotNull TrackSpec dislikeFeedbackSoundTrackSpec) {
        likeFeedbackSoundTrackSpec.getClass();
        dislikeFeedbackSoundTrackSpec.getClass();
        return new FeedbackActionSoundTrackSpec(likeFeedbackSoundTrackSpec, dislikeFeedbackSoundTrackSpec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackActionSoundTrackSpec)) {
            return false;
        }
        FeedbackActionSoundTrackSpec feedbackActionSoundTrackSpec = (FeedbackActionSoundTrackSpec) other;
        return Intrinsics.areEqual(this.likeFeedbackSoundTrackSpec, feedbackActionSoundTrackSpec.likeFeedbackSoundTrackSpec) && Intrinsics.areEqual(this.dislikeFeedbackSoundTrackSpec, feedbackActionSoundTrackSpec.dislikeFeedbackSoundTrackSpec);
    }

    @NotNull
    public final TrackSpec getDislikeFeedbackSoundTrackSpec() {
        return this.dislikeFeedbackSoundTrackSpec;
    }

    @NotNull
    public final TrackSpec getLikeFeedbackSoundTrackSpec() {
        return this.likeFeedbackSoundTrackSpec;
    }

    public int hashCode() {
        return this.dislikeFeedbackSoundTrackSpec.hashCode() + (this.likeFeedbackSoundTrackSpec.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FeedbackActionSoundTrackSpec(likeFeedbackSoundTrackSpec=" + this.likeFeedbackSoundTrackSpec + ", dislikeFeedbackSoundTrackSpec=" + this.dislikeFeedbackSoundTrackSpec + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public FeedbackActionSoundTrackSpec(@NotNull TrackSpec trackSpec, @NotNull TrackSpec trackSpec2) {
        trackSpec.getClass();
        trackSpec2.getClass();
        this.likeFeedbackSoundTrackSpec = trackSpec;
        this.dislikeFeedbackSoundTrackSpec = trackSpec2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackActionSoundTrackSpec() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
