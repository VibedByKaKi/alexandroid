package com.amazon.apl.android.sgcontent;

import android.graphics.RectF;
import com.amazon.apl.android.primitive.SGRRect;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Path {
    public static final String PATH_TYPE_FRAME = "Frame";
    public static final String PATH_TYPE_GENERAL = "General";
    public static final String PATH_TYPE_RECT = "Rect";
    public static final String PATH_TYPE_RRECT = "RRect";
    public long mAddress;

    public Path(long j) {
        this.mAddress = j;
    }

    private static native float[] nFramePathGetInset(long j);

    private static native float[] nFramePathGetRRect(long j);

    private static native float[] nGetPoints(long j);

    private static native String nGetType(long j);

    private static native String nGetValue(long j);

    private static native float[] nRRectPathGetRRect(long j);

    private static native float[] nRectPathGetRect(long j);

    public SGRRect getFramePathInset() {
        float[] nFramePathGetInset = nFramePathGetInset(this.mAddress);
        return SGRRect.builder().left(nFramePathGetInset[0]).top(nFramePathGetInset[1]).right(nFramePathGetInset[2]).bottom(nFramePathGetInset[3]).radii(new float[]{nFramePathGetInset[4], nFramePathGetInset[5], nFramePathGetInset[6], nFramePathGetInset[7]}).build();
    }

    public SGRRect getFramePathRRect() {
        float[] nFramePathGetRRect = nFramePathGetRRect(this.mAddress);
        return SGRRect.builder().left(nFramePathGetRRect[0]).top(nFramePathGetRRect[1]).right(nFramePathGetRRect[2]).bottom(nFramePathGetRRect[3]).radii(new float[]{nFramePathGetRRect[4], nFramePathGetRRect[5], nFramePathGetRRect[6], nFramePathGetRRect[7]}).build();
    }

    public float[] getPoints() {
        return nGetPoints(this.mAddress);
    }

    public SGRRect getRRectPathRRect() {
        float[] nRRectPathGetRRect = nRRectPathGetRRect(this.mAddress);
        return SGRRect.builder().left(nRRectPathGetRRect[0]).top(nRRectPathGetRRect[1]).right(nRRectPathGetRRect[2]).bottom(nRRectPathGetRRect[3]).radii(new float[]{nRRectPathGetRRect[4], nRRectPathGetRRect[5], nRRectPathGetRRect[6], nRRectPathGetRRect[7]}).build();
    }

    public RectF getRectPathRect() {
        float[] nRectPathGetRect = nRectPathGetRect(this.mAddress);
        return new RectF(nRectPathGetRect[0], nRectPathGetRect[1], nRectPathGetRect[2], nRectPathGetRect[3]);
    }

    public String getType() {
        return nGetType(this.mAddress);
    }

    public String getValue() {
        return nGetValue(this.mAddress);
    }
}
