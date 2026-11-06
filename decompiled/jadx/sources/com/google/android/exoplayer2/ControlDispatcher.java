package com.google.android.exoplayer2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface ControlDispatcher {
    boolean dispatchFastForward(Player player);

    boolean dispatchNext(Player player);

    boolean dispatchPrepare(Player player);

    boolean dispatchPrevious(Player player);

    boolean dispatchRewind(Player player);

    boolean dispatchSeekTo(Player player, int i, long j);

    boolean dispatchSetPlayWhenReady(Player player, boolean z);

    boolean dispatchSetPlaybackParameters(Player player, PlaybackParameters playbackParameters);

    boolean dispatchSetRepeatMode(Player player, int i);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z);

    boolean dispatchStop(Player player, boolean z);

    boolean isFastForwardEnabled();

    boolean isRewindEnabled();
}
