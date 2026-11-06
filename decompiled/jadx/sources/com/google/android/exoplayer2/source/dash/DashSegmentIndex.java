package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    int getAvailableSegmentCount(long j, long j2);

    long getDurationUs(long j, long j2);

    long getFirstAvailableSegmentNum(long j, long j2);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j, long j2);

    int getSegmentCount(long j);

    long getSegmentNum(long j, long j2);

    RangedUri getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
