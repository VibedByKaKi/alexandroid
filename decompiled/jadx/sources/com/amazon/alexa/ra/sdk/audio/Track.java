package com.amazon.alexa.ra.sdk.audio;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/sdk/audio/Track;", "", "soundId", "", "trackSpec", "Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;", "streamId", "<init>", "(ILcom/amazon/alexa/ra/sdk/audio/TrackSpec;I)V", "getSoundId", "()I", "getTrackSpec", "()Lcom/amazon/alexa/ra/sdk/audio/TrackSpec;", "getStreamId", "setStreamId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class Track {
    public static final int $stable = 8;
    private final int soundId;
    private int streamId;

    @NotNull
    private final TrackSpec trackSpec;

    public Track(int i, @NotNull TrackSpec trackSpec, int i2) {
        trackSpec.getClass();
        this.soundId = i;
        this.trackSpec = trackSpec;
        this.streamId = i2;
    }

    public static /* synthetic */ Track copy$default(Track track, int i, TrackSpec trackSpec, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = track.soundId;
        }
        if ((i3 & 2) != 0) {
            trackSpec = track.trackSpec;
        }
        if ((i3 & 4) != 0) {
            i2 = track.streamId;
        }
        return track.copy(i, trackSpec, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSoundId() {
        return this.soundId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TrackSpec getTrackSpec() {
        return this.trackSpec;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStreamId() {
        return this.streamId;
    }

    @NotNull
    public final Track copy(int soundId, @NotNull TrackSpec trackSpec, int streamId) {
        trackSpec.getClass();
        return new Track(soundId, trackSpec, streamId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Track)) {
            return false;
        }
        Track track = (Track) other;
        return this.soundId == track.soundId && Intrinsics.areEqual(this.trackSpec, track.trackSpec) && this.streamId == track.streamId;
    }

    public final int getSoundId() {
        return this.soundId;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    @NotNull
    public final TrackSpec getTrackSpec() {
        return this.trackSpec;
    }

    public int hashCode() {
        return Integer.hashCode(this.streamId) + ((this.trackSpec.hashCode() + (Integer.hashCode(this.soundId) * 31)) * 31);
    }

    public final void setStreamId(int i) {
        this.streamId = i;
    }

    @NotNull
    public String toString() {
        int i = this.soundId;
        TrackSpec trackSpec = this.trackSpec;
        int i2 = this.streamId;
        StringBuilder sb = new StringBuilder("Track(soundId=");
        sb.append(i);
        sb.append(", trackSpec=");
        sb.append(trackSpec);
        sb.append(", streamId=");
        return a$$ExternalSyntheticOutline0.m(sb, i2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ Track(int i, TrackSpec trackSpec, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, trackSpec, (i3 & 4) != 0 ? 0 : i2);
    }
}
