package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ActiveIndicator {

        @FloatRange(from = 0.0d, to = 1.0d)
        float amplitudeFraction = 1.0f;

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, to = 1.0d)
        float endFraction;

        @Px
        int gapSize;
        boolean isDeterminate;

        @FloatRange(from = 0.0d, to = 1.0d)
        float phaseFraction;
        float rotationDegree;

        @FloatRange(from = 0.0d, to = 1.0d)
        float startFraction;
    }

    public DrawingDelegate(S s) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s;
        this.transform = new Matrix();
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f, boolean z, boolean z2);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = 0, to = 255) int i2);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i, @IntRange(from = 0, to = 255) int i2, @Px int i3);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public abstract void invalidateCachedPaths();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f, boolean z, boolean z2) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z, z2);
    }

    public float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }

        public float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float f = pathPoint.posVec[0];
            float[] fArr = this.posVec;
            return (float) Math.hypot(f - fArr[0], r4[1] - fArr[1]);
        }

        public void moveAcross(float f) {
            float[] fArr = this.tanVec;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d = f;
            double d2 = atan2;
            this.posVec[0] = (float) ((Math.cos(d2) * d) + r2[0]);
            this.posVec[1] = (float) ErrorUtils$$ExternalSyntheticOutline0.m(d2, d, r13[1]);
        }

        public void moveAlong(float f) {
            float[] fArr = this.tanVec;
            float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d = f;
            double d2 = atan2;
            this.posVec[0] = (float) ((Math.cos(d2) * d) + r2[0]);
            this.posVec[1] = (float) ErrorUtils$$ExternalSyntheticOutline0.m(d2, d, r13[1]);
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f) {
            this.transform.reset();
            this.transform.setRotate(f);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        public void scale(float f, float f2) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f2;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f;
            fArr2[1] = fArr2[1] * f2;
        }

        public void translate(float f, float f2) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + f2;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.transform = new Matrix();
        }
    }
}
