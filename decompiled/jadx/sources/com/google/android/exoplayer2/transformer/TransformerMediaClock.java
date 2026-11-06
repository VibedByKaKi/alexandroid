package com.google.android.exoplayer2.transformer;

import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.Util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(18)
/* loaded from: classes7.dex */
final class TransformerMediaClock implements MediaClock {
    private long minTrackTimeUs;
    private final SparseLongArray trackTypeToTimeUs = new SparseLongArray();

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return PlaybackParameters.DEFAULT;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        return this.minTrackTimeUs;
    }

    public void updateTimeForTrackType(int i, long j) {
        long j2 = this.trackTypeToTimeUs.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            this.trackTypeToTimeUs.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.minTrackTimeUs) {
                this.minTrackTimeUs = Util.minValue(this.trackTypeToTimeUs);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }
}
