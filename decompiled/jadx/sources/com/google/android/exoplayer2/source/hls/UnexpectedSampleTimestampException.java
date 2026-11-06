package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.MediaChunk;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnexpectedSampleTimestampException(com.google.android.exoplayer2.source.chunk.MediaChunk r5, long r6, long r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected sample timestamp: "
            r0.<init>(r1)
            long r1 = com.google.android.exoplayer2.C.usToMs(r8)
            r0.append(r1)
            java.lang.String r1 = " in chunk ["
            r0.append(r1)
            long r1 = r5.startTimeUs
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r5.endTimeUs
            java.lang.String r3 = "]"
            java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m(r1, r3, r0)
            r4.<init>(r0)
            r4.mediaChunk = r5
            r4.lastAcceptedSampleTimeUs = r6
            r4.rejectedSampleTimeUs = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.UnexpectedSampleTimestampException.<init>(com.google.android.exoplayer2.source.chunk.MediaChunk, long, long):void");
    }
}
