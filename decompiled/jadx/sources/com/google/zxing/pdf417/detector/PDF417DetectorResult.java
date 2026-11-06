package com.google.zxing.pdf417.detector;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PDF417DetectorResult {
    private final BitMatrix bits;
    private final List<ResultPoint[]> points;
    private final int rotation;

    public PDF417DetectorResult(BitMatrix bitMatrix, List<ResultPoint[]> list, int i) {
        this.bits = bitMatrix;
        this.points = list;
        this.rotation = i;
    }

    public BitMatrix getBits() {
        return this.bits;
    }

    public List<ResultPoint[]> getPoints() {
        return this.points;
    }

    public int getRotation() {
        return this.rotation;
    }

    public PDF417DetectorResult(BitMatrix bitMatrix, List<ResultPoint[]> list) {
        this(bitMatrix, list, 0);
    }
}
