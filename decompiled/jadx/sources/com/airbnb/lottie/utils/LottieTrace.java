package com.airbnb.lottie.utils;

import androidx.core.os.TraceCompat;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class LottieTrace {
    private static final int MAX_DEPTH = 5;
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];
    private int traceDepth = 0;
    private int depthPastMaxDepth = 0;

    public void beginSection(String str) {
        int i = this.traceDepth;
        if (i == 5) {
            this.depthPastMaxDepth++;
            return;
        }
        this.sections[i] = str;
        this.startTimeNs[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.traceDepth++;
    }

    public float endSection(String str) {
        int i = this.depthPastMaxDepth;
        if (i > 0) {
            this.depthPastMaxDepth = i - 1;
            return 0.0f;
        }
        int i2 = this.traceDepth - 1;
        this.traceDepth = i2;
        if (i2 == -1) {
            Single$$ExternalSyntheticBUOutline0.m$2("Can't end trace section. There are none.");
            return 0.0f;
        }
        if (str.equals(this.sections[i2])) {
            TraceCompat.endSection();
            return (System.nanoTime() - this.startTimeNs[this.traceDepth]) / 1000000.0f;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m2m("Unbalanced trace call ", str, ". Expected "), this.sections[this.traceDepth], "."));
        return 0.0f;
    }
}
