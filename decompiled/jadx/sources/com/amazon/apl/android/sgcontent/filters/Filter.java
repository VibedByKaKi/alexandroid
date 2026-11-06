package com.amazon.apl.android.sgcontent.filters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Filter {
    protected long mNativeHandle;

    public static Filter create(long j) {
        if (j == 0) {
            return null;
        }
        switch (nGetType(j)) {
        }
        return null;
    }

    private static native long nBlendGetBack(long j);

    private static native int nBlendGetBlendMode(long j);

    private static native long nBlendGetFront(long j);

    private static native long nBlurGetFilter(long j);

    private static native float nBlurGetRadius(long j);

    private static native int nGetType(long j);

    private static native float nGrayscaleGetAmount(long j);

    private static native long nGrayscaleGetFilter(long j);

    private static native long nMediaObjectGetMediaObject(long j);

    private static native long nNoiseGetFilter(long j);

    private static native int nNoiseGetKind(long j);

    private static native float nNoiseGetSigma(long j);

    private static native boolean nNoiseUseColor(long j);

    private static native float nSaturateGetAmount(long j);

    private static native long nSaturateGetFilter(long j);

    private static native long nSolidGetPaint(long j);

    public String getType() {
        switch (nGetType(this.mNativeHandle)) {
            case 0:
                return "Blend";
            case 1:
                return "Blur";
            case 2:
                return "Grayscale";
            case 3:
                return "MediaObject";
            case 4:
                return "Noise";
            case 5:
                return "Saturate";
            case 6:
                return "Solid";
            default:
                return "Unknown";
        }
    }
}
