package com.google.android.exoplayer2;

import com.google.android.exoplayer2.MediaItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j, long j2);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j);
}
