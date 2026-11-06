package com.amazon.apl.android.sgcontent;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.amazon.apl.android.utils.ColorUtils;
import com.amazon.apl.enums.GradientSpreadMethod;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Paint {
    public long mAddress;

    public Paint(long j) {
        this.mAddress = j;
    }

    private static native int nGetColor(long j);

    private static native int nGetHashCode(long j);

    private static native float nGetOpacity(long j);

    private static native float[] nGetTransform(long j);

    private static native String nGetType(long j);

    private static native int[] nGradientGetColors(long j);

    private static native float[] nGradientGetPoints(long j);

    private static native int nGradientGetSpreadMethod(long j);

    private static native boolean nGradientGetUseBoundingBox(long j);

    private static native float[] nLinearGradientGetEnd(long j);

    private static native float[] nLinearGradientGetStart(long j);

    private static native long nPatternGetNode(long j);

    private static native float[] nPatternGetSize(long j);

    private static native float[] nRadialGradientGetCenter(long j);

    private static native float nRadialGradientGetRadius(long j);

    private float[] toMatrix(float[] fArr) {
        return new float[]{fArr[0], fArr[2], fArr[4], fArr[1], fArr[3], fArr[5], 0.0f, 0.0f, 1.0f};
    }

    public boolean equals(Object obj) {
        return (obj instanceof Paint) && hashCode() == obj.hashCode();
    }

    public int getColor() {
        return ColorUtils.toARGB(nGetColor(this.mAddress));
    }

    public int[] getColors() {
        int[] nGradientGetColors = nGradientGetColors(this.mAddress);
        int[] iArr = new int[nGradientGetColors.length];
        for (int i = 0; i < nGradientGetColors.length; i++) {
            iArr[i] = ColorUtils.toARGB(nGradientGetColors[i]);
        }
        return iArr;
    }

    public PointF getLinearGradientEnd() {
        float[] nLinearGradientGetEnd = nLinearGradientGetEnd(this.mAddress);
        return new PointF(nLinearGradientGetEnd[0], nLinearGradientGetEnd[1]);
    }

    public PointF getLinearGradientStart() {
        float[] nLinearGradientGetStart = nLinearGradientGetStart(this.mAddress);
        return new PointF(nLinearGradientGetStart[0], nLinearGradientGetStart[1]);
    }

    public Node getNode() {
        return Node.ensure(nPatternGetNode(this.mAddress));
    }

    public float getOpacity() {
        return nGetOpacity(this.mAddress);
    }

    public float[] getPoints() {
        return nGradientGetPoints(this.mAddress);
    }

    public PointF getRadialGradientCenter() {
        float[] nRadialGradientGetCenter = nRadialGradientGetCenter(this.mAddress);
        return new PointF(nRadialGradientGetCenter[0], nRadialGradientGetCenter[1]);
    }

    public float getRadialGradientRadius() {
        return nRadialGradientGetRadius(this.mAddress);
    }

    public float[] getSize() {
        return nPatternGetSize(this.mAddress);
    }

    public GradientSpreadMethod getSpreadMethod() {
        return GradientSpreadMethod.valueOf(nGradientGetSpreadMethod(this.mAddress));
    }

    public Matrix getTransform() {
        Matrix matrix = new Matrix();
        matrix.setValues(toMatrix(nGetTransform(this.mAddress)));
        return matrix;
    }

    public String getType() {
        return nGetType(this.mAddress);
    }

    public boolean getUseBoundingBox() {
        return nGradientGetUseBoundingBox(this.mAddress);
    }

    public int hashCode() {
        return nGetHashCode(this.mAddress);
    }
}
