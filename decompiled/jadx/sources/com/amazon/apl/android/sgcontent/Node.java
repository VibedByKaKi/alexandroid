package com.amazon.apl.android.sgcontent;

import android.graphics.Matrix;
import com.amazon.apl.android.bitmap.BitmapKey;
import com.amazon.apl.android.primitive.SGRect;
import com.amazon.apl.android.scenegraph.text.APLTextLayout;
import com.amazon.apl.android.sgcontent.filters.Filter;
import com.amazon.apl.android.utils.ColorUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Node {
    final long mAddress;
    public BitmapKey mFilterKey;

    public Node(long j) {
        this.mAddress = j;
    }

    public static Node ensure(long j) {
        Node nGetNodeObject = nGetNodeObject(j);
        if (nGetNodeObject != null) {
            return nGetNodeObject;
        }
        Node node = new Node(j);
        node.nSetNodeObject(j);
        return node;
    }

    private static native long[] nGetChildren(long j);

    private static native long nGetClipPath(long j);

    private static native Node nGetNodeObject(long j);

    private static native long nGetOp(long j);

    private static native float nGetOpacity(long j);

    private static native long nGetPath(long j);

    private static native APLTextLayout nGetTextLayout(long j);

    private static native float[] nGetTransform(long j);

    private static native String nGetType(long j);

    private static native long nImageGetFilter(long j);

    private static native float[] nImageGetSourceRect(long j);

    private static native float[] nImageGetTargetRect(long j);

    private static native boolean nIsVisible(long j);

    private static native long nNext(long j);

    private native void nSetNodeObject(long j);

    private static native int nShadowGetColor(long j);

    private static native float[] nShadowGetOffset(long j);

    private static native float nShadowGetRadius(long j);

    private float[] toMatrix(float[] fArr) {
        return new float[]{fArr[0], fArr[2], fArr[4], fArr[1], fArr[3], fArr[5], 0.0f, 0.0f, 1.0f};
    }

    public APLTextLayout getAplTextLayout() {
        return nGetTextLayout(this.mAddress);
    }

    public List<Node> getChildren() {
        long[] nGetChildren = nGetChildren(this.mAddress);
        ArrayList arrayList = new ArrayList(nGetChildren.length);
        for (long j : nGetChildren) {
            arrayList.add(ensure(j));
        }
        return arrayList;
    }

    public Path getClipPath() {
        long nGetClipPath = nGetClipPath(this.mAddress);
        if (nGetClipPath == 0) {
            return null;
        }
        return new Path(nGetClipPath);
    }

    public Filter getFilter() {
        long nImageGetFilter = nImageGetFilter(this.mAddress);
        if (nImageGetFilter == 0) {
            return null;
        }
        return Filter.create(nImageGetFilter);
    }

    public PathOp getOp() {
        return new PathOp(nGetOp(this.mAddress));
    }

    public float getOpacity() {
        return nGetOpacity(this.mAddress);
    }

    public Path getPath() {
        long nGetPath = nGetPath(this.mAddress);
        if (nGetPath == 0) {
            return null;
        }
        return new Path(nGetPath);
    }

    public float getRadius() {
        return nShadowGetRadius(this.mAddress);
    }

    public int getShadowColor() {
        return ColorUtils.toARGB(nShadowGetColor(this.mAddress));
    }

    public float[] getShadowOffset() {
        return nShadowGetOffset(this.mAddress);
    }

    public SGRect getSourceRect() {
        return SGRect.create(nImageGetSourceRect(this.mAddress));
    }

    public SGRect getTargetRect() {
        return SGRect.create(nImageGetTargetRect(this.mAddress));
    }

    public Matrix getTransform() {
        Matrix matrix = new Matrix();
        matrix.setValues(toMatrix(nGetTransform(this.mAddress)));
        return matrix;
    }

    public String getType() {
        return nGetType(this.mAddress);
    }

    public boolean isVisible() {
        return nIsVisible(this.mAddress);
    }

    public Node next() {
        long nNext = nNext(this.mAddress);
        if (nNext != 0) {
            return ensure(nNext);
        }
        return null;
    }
}
