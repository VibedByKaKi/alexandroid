package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/AudioInstructionEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "playbackPoint", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/PlaybackPoint;", "success", "", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/session/metrics/PlaybackPoint;Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "", "getPlaybackPoint", "()Ljava/lang/String;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AudioInstructionEvent extends SessionMetric {

    @SerializedName("playback_point")
    @NotNull
    private final String playbackPoint;

    @SerializedName("success")
    @Nullable
    private final Boolean success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioInstructionEvent(@NotNull PlaybackPoint playbackPoint, @Nullable Boolean bool) {
        super(SessionMetricType.AUDIO_INSTRUCTION);
        playbackPoint.getClass();
        this.success = bool;
        this.playbackPoint = playbackPoint.name();
    }

    @NotNull
    public final String getPlaybackPoint() {
        return this.playbackPoint;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ AudioInstructionEvent(PlaybackPoint playbackPoint, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(playbackPoint, (i & 2) != 0 ? null : bool);
    }
}
