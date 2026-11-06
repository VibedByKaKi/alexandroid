package com.amazon.alexa.ra.features.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.audio.Track;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/features/feedback/FeedbackActionSoundTrackConfig;", "", "likeFeedbackSoundTrack", "Lcom/amazon/alexa/ra/sdk/audio/Track;", "dislikeFeedbackSoundTrack", "<init>", "(Lcom/amazon/alexa/ra/sdk/audio/Track;Lcom/amazon/alexa/ra/sdk/audio/Track;)V", "getLikeFeedbackSoundTrack", "()Lcom/amazon/alexa/ra/sdk/audio/Track;", "getDislikeFeedbackSoundTrack", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FeedbackActionSoundTrackConfig {
    public static final int $stable = 8;

    @NotNull
    private final Track dislikeFeedbackSoundTrack;

    @NotNull
    private final Track likeFeedbackSoundTrack;

    public FeedbackActionSoundTrackConfig(@NotNull Track track, @NotNull Track track2) {
        track.getClass();
        track2.getClass();
        this.likeFeedbackSoundTrack = track;
        this.dislikeFeedbackSoundTrack = track2;
    }

    public static /* synthetic */ FeedbackActionSoundTrackConfig copy$default(FeedbackActionSoundTrackConfig feedbackActionSoundTrackConfig, Track track, Track track2, int i, Object obj) {
        if ((i & 1) != 0) {
            track = feedbackActionSoundTrackConfig.likeFeedbackSoundTrack;
        }
        if ((i & 2) != 0) {
            track2 = feedbackActionSoundTrackConfig.dislikeFeedbackSoundTrack;
        }
        return feedbackActionSoundTrackConfig.copy(track, track2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Track getLikeFeedbackSoundTrack() {
        return this.likeFeedbackSoundTrack;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Track getDislikeFeedbackSoundTrack() {
        return this.dislikeFeedbackSoundTrack;
    }

    @NotNull
    public final FeedbackActionSoundTrackConfig copy(@NotNull Track likeFeedbackSoundTrack, @NotNull Track dislikeFeedbackSoundTrack) {
        likeFeedbackSoundTrack.getClass();
        dislikeFeedbackSoundTrack.getClass();
        return new FeedbackActionSoundTrackConfig(likeFeedbackSoundTrack, dislikeFeedbackSoundTrack);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackActionSoundTrackConfig)) {
            return false;
        }
        FeedbackActionSoundTrackConfig feedbackActionSoundTrackConfig = (FeedbackActionSoundTrackConfig) other;
        return Intrinsics.areEqual(this.likeFeedbackSoundTrack, feedbackActionSoundTrackConfig.likeFeedbackSoundTrack) && Intrinsics.areEqual(this.dislikeFeedbackSoundTrack, feedbackActionSoundTrackConfig.dislikeFeedbackSoundTrack);
    }

    @NotNull
    public final Track getDislikeFeedbackSoundTrack() {
        return this.dislikeFeedbackSoundTrack;
    }

    @NotNull
    public final Track getLikeFeedbackSoundTrack() {
        return this.likeFeedbackSoundTrack;
    }

    public int hashCode() {
        return this.dislikeFeedbackSoundTrack.hashCode() + (this.likeFeedbackSoundTrack.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FeedbackActionSoundTrackConfig(likeFeedbackSoundTrack=" + this.likeFeedbackSoundTrack + ", dislikeFeedbackSoundTrack=" + this.dislikeFeedbackSoundTrack + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
