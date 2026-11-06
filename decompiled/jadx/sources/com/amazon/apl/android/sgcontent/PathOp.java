package com.amazon.apl.android.sgcontent;

import com.amazon.apl.enums.GraphicLineCap;
import com.amazon.apl.enums.GraphicLineJoin;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PathOp {
    public long mAddress;

    public PathOp(long j) {
        this.mAddress = j;
    }

    private static native int nGetFillType(long j);

    private static native int nGetLineCap(long j);

    private static native int nGetLineJoin(long j);

    private static native float nGetMiterLimit(long j);

    private static native long nGetNextSibbling(long j);

    private static native long nGetPaint(long j);

    private static native float nGetPathLength(long j);

    private static native float nGetStokeWidth(long j);

    private static native float[] nGetStrokeDashArray(long j);

    private static native float nGetStrokeDashOffset(long j);

    private static native String nGetType(long j);

    public int getFillType() {
        return nGetFillType(this.mAddress);
    }

    public GraphicLineCap getLineCap() {
        return GraphicLineCap.valueOf(nGetLineCap(this.mAddress));
    }

    public GraphicLineJoin getLineJoin() {
        return GraphicLineJoin.valueOf(nGetLineJoin(this.mAddress));
    }

    public float getMiterLimit() {
        return nGetMiterLimit(this.mAddress);
    }

    public PathOp getNextSibbling() {
        long nGetNextSibbling = nGetNextSibbling(this.mAddress);
        if (nGetNextSibbling == 0) {
            return null;
        }
        return new PathOp(nGetNextSibbling);
    }

    public Paint getPaint() {
        return new Paint(nGetPaint(this.mAddress));
    }

    public float getPathLength() {
        return nGetPathLength(this.mAddress);
    }

    public float[] getStrokeDashArray() {
        return nGetStrokeDashArray(this.mAddress);
    }

    public float getStrokeDashOffset() {
        return nGetStrokeDashOffset(this.mAddress);
    }

    public float getStrokeWidth() {
        return nGetStokeWidth(this.mAddress);
    }

    public String getType() {
        return nGetType(this.mAddress);
    }
}
