package com.facebook.react.uimanager;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J(\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\fH\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010/\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005J \u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J(\u00103\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0007J\u0018\u00105\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper;", "", "<init>", "()V", "EPSILON", "", "isZero", "", "d", "multiplyInto", "", "out", "", "a", "b", "decomposeMatrix", "transformMatrix", "ctx", "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "determinant", "matrix", "inverse", "transpose", "m", "multiplyVectorByMatrix", "v", "result", "v3Length", "v3Normalize", "vector", "norm", "v3Dot", "v3Combine", "aScale", "bScale", "v3Cross", "roundTo3Places", "n", "createIdentityMatrix", "degreesToRadians", "degrees", "resetIdentityMatrix", "applyPerspective", "perspective", "applyScaleX", "factor", "applyScaleY", "applyScaleZ", "applyTranslate2D", "x", "y", "applyTranslate3D", "z", "applySkewX", "radians", "applySkewY", "applyRotateX", "applyRotateY", "applyRotateZ", "MatrixDecompositionContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;

    @NotNull
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    private MatrixMathHelper() {
    }

    @JvmStatic
    public static final void applyPerspective(@NotNull double[] m, double perspective) {
        m.getClass();
        m[11] = (-1) / perspective;
    }

    @JvmStatic
    public static final void applyRotateX(@NotNull double[] m, double radians) {
        m.getClass();
        m[5] = Math.cos(radians);
        m[6] = Math.sin(radians);
        m[9] = -Math.sin(radians);
        m[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateY(@NotNull double[] m, double radians) {
        m.getClass();
        m[0] = Math.cos(radians);
        m[2] = -Math.sin(radians);
        m[8] = Math.sin(radians);
        m[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateZ(@NotNull double[] m, double radians) {
        m.getClass();
        m[0] = Math.cos(radians);
        m[1] = Math.sin(radians);
        m[4] = -Math.sin(radians);
        m[5] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyScaleX(@NotNull double[] m, double factor) {
        m.getClass();
        m[0] = factor;
    }

    @JvmStatic
    public static final void applyScaleY(@NotNull double[] m, double factor) {
        m.getClass();
        m[5] = factor;
    }

    @JvmStatic
    public static final void applySkewX(@NotNull double[] m, double radians) {
        m.getClass();
        m[4] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applySkewY(@NotNull double[] m, double radians) {
        m.getClass();
        m[1] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applyTranslate2D(@NotNull double[] m, double x, double y) {
        m.getClass();
        m[12] = x;
        m[13] = y;
    }

    @JvmStatic
    public static final void applyTranslate3D(@NotNull double[] m, double x, double y, double z) {
        m.getClass();
        m[12] = x;
        m[13] = y;
        m[14] = z;
    }

    @JvmStatic
    @NotNull
    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[LOOP:3: B:36:0x00c9->B:37:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[LOOP:4: B:40:0x00d8->B:41:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[LOOP:5: B:44:0x00e3->B:45:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void decomposeMatrix(@org.jetbrains.annotations.NotNull double[] r23, @org.jetbrains.annotations.NotNull com.facebook.react.uimanager.MatrixMathHelper.MatrixDecompositionContext r24) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.MatrixMathHelper.decomposeMatrix(double[], com.facebook.react.uimanager.MatrixMathHelper$MatrixDecompositionContext):void");
    }

    @JvmStatic
    public static final double degreesToRadians(double degrees) {
        return (degrees * 3.141592653589793d) / 180;
    }

    @JvmStatic
    public static final double determinant(@NotNull double[] matrix) {
        matrix.getClass();
        double d = matrix[0];
        double d2 = matrix[1];
        double d3 = matrix[2];
        double d4 = matrix[3];
        double d5 = matrix[4];
        double d6 = matrix[5];
        double d7 = matrix[6];
        double d8 = matrix[7];
        double d9 = matrix[8];
        double d10 = matrix[9];
        double d11 = matrix[10];
        double d12 = matrix[11];
        double d13 = matrix[12];
        double d14 = matrix[13];
        double d15 = matrix[14];
        double d16 = matrix[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double m$1 = AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d20, d11, d13, (((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13));
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double m$12 = AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d18, d9, d14, (AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d21, d12, d13, m$1) - ((d22 * d12) * d13)) - ((d17 * d9) * d14));
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d28, d11, d16, (AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d25, d10, d16, AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d22, d9, d16, (AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d27, d12, d15, AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d24, d10, d15, (AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d19, d9, d15, AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d26, d12, d14, (AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d23, d11, d14, m$12) - ((d24 * d11) * d14)) - ((d25 * d12) * d14))) - ((d20 * d9) * d15)) - ((d23 * d10) * d15))) - ((d28 * d12) * d15)) - ((d21 * d9) * d16))) - ((d26 * d10) * d16)) - ((d27 * d11) * d16));
    }

    @JvmStatic
    @NotNull
    public static final double[] inverse(@NotNull double[] matrix) {
        matrix.getClass();
        double determinant = determinant(matrix);
        if (INSTANCE.isZero(determinant)) {
            return matrix;
        }
        double d = matrix[0];
        double d2 = matrix[1];
        double d3 = matrix[2];
        double d4 = matrix[3];
        double d5 = matrix[4];
        double d6 = matrix[5];
        double d7 = matrix[6];
        double d8 = matrix[7];
        double d9 = matrix[8];
        double d10 = matrix[9];
        double d11 = matrix[10];
        double d12 = matrix[11];
        double d13 = matrix[12];
        double d14 = matrix[13];
        double d15 = matrix[14];
        double d16 = matrix[15];
        double d17 = d7 * d12;
        double d18 = d8 * d11;
        double d19 = d8 * d10;
        double d20 = d6 * d12;
        double d21 = d7 * d10;
        double d22 = d6 * d11;
        double m = AppLaunchChecker$$ExternalSyntheticOutline0.m(d22, d16, (((d19 * d15) + ((d17 * d14) - (d18 * d14))) - (d20 * d15)) - (d21 * d16), determinant);
        double d23 = d4 * d11;
        double d24 = d3 * d12;
        double d25 = d4 * d10;
        double d26 = d2 * d12;
        double d27 = d3 * d10;
        double d28 = d2 * d11;
        double d29 = (((d27 * d16) + ((d26 * d15) + (((d23 * d14) - (d24 * d14)) - (d25 * d15)))) - (d28 * d16)) / determinant;
        double d30 = d3 * d8;
        double d31 = d4 * d7;
        double d32 = d4 * d6;
        double d33 = d2 * d8;
        double d34 = d3 * d6;
        double d35 = d2 * d7;
        double m2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(d35, d16, (((d32 * d15) + ((d30 * d14) - (d31 * d14))) - (d33 * d15)) - (d34 * d16), determinant);
        double d36 = (((d34 * d12) + ((d33 * d11) + (((d31 * d10) - (d30 * d10)) - (d32 * d11)))) - (d35 * d12)) / determinant;
        double d37 = (d18 * d13) - (d17 * d13);
        double d38 = d8 * d9;
        double d39 = d5 * d12;
        double d40 = (d39 * d15) + (d37 - (d38 * d15));
        double d41 = d7 * d9;
        double d42 = d5 * d11;
        double d43 = (((d41 * d16) + d40) - (d42 * d16)) / determinant;
        double d44 = (d24 * d13) - (d23 * d13);
        double d45 = d4 * d9;
        double d46 = (d45 * d15) + d44;
        double d47 = d * d12;
        double d48 = d3 * d9;
        double d49 = (d46 - (d47 * d15)) - (d48 * d16);
        double d50 = d * d11;
        double m3 = AppLaunchChecker$$ExternalSyntheticOutline0.m(d50, d16, d49, determinant);
        double d51 = d4 * d5;
        double d52 = d8 * d;
        double d53 = d3 * d5;
        double d54 = d7 * d;
        double d55 = (((d53 * d16) + ((d52 * d15) + (((d31 * d13) - (d30 * d13)) - (d51 * d15)))) - (d54 * d16)) / determinant;
        double m4 = AppLaunchChecker$$ExternalSyntheticOutline0.m(d54, d12, (((d51 * d11) + ((d30 * d9) - (d31 * d9))) - (d52 * d11)) - (d53 * d12), determinant);
        double d56 = ((d38 * d14) + ((d20 * d13) - (d19 * d13))) - (d39 * d14);
        double d57 = d6 * d9;
        double d58 = d5 * d10;
        double m5 = AppLaunchChecker$$ExternalSyntheticOutline0.m(d58, d16, d56 - (d57 * d16), determinant);
        double d59 = (d47 * d14) + (((d25 * d13) - (d26 * d13)) - (d45 * d14));
        double d60 = d2 * d9;
        double d61 = (d60 * d16) + d59;
        double d62 = d * d10;
        double d63 = (d61 - (d62 * d16)) / determinant;
        double d64 = d2 * d5;
        double d65 = d * d6;
        double m6 = AppLaunchChecker$$ExternalSyntheticOutline0.m(d65, d16, (((d51 * d14) + ((d33 * d13) - (d32 * d13))) - (d52 * d14)) - (d64 * d16), determinant);
        double d66 = d64 * d12;
        return new double[]{m, d29, m2, d36, d43, m3, d55, m4, m5, d63, m6, ((d66 + ((d52 * d10) + (((d32 * d9) - (d33 * d9)) - (d51 * d10)))) - (d65 * d12)) / determinant, (((d57 * d15) + ((d42 * d14) + (((d21 * d13) - (d22 * d13)) - (d41 * d14)))) - (d58 * d15)) / determinant, AppLaunchChecker$$ExternalSyntheticOutline0.m(d62, d15, (((d48 * d14) + ((d28 * d13) - (d27 * d13))) - (d50 * d14)) - (d60 * d15), determinant), (((d64 * d15) + ((d54 * d14) + (((d34 * d13) - (d35 * d13)) - (d53 * d14)))) - (d65 * d15)) / determinant, AppLaunchChecker$$ExternalSyntheticOutline0.m(d65, d11, (((d53 * d10) + ((d35 * d9) - (d34 * d9))) - (d54 * d10)) - (d64 * d11), determinant)};
    }

    private final boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    @JvmStatic
    public static final void multiplyInto(@NotNull double[] out, @NotNull double[] a2, @NotNull double[] b) {
        out.getClass();
        a2.getClass();
        b.getClass();
        double d = a2[0];
        double d2 = a2[1];
        double d3 = a2[2];
        double d4 = a2[3];
        double d5 = a2[4];
        double d6 = a2[5];
        double d7 = a2[6];
        double d8 = a2[7];
        double d9 = a2[8];
        double d10 = a2[9];
        double d11 = a2[10];
        double d12 = a2[11];
        double d13 = a2[12];
        double d14 = a2[13];
        double d15 = a2[14];
        double d16 = a2[15];
        double d17 = b[0];
        double d18 = b[1];
        double d19 = b[2];
        double d20 = b[3];
        out[0] = (d20 * d13) + (d19 * d9) + (d18 * d5) + (d17 * d);
        out[1] = (d20 * d14) + (d19 * d10) + (d18 * d6) + (d17 * d2);
        out[2] = (d20 * d15) + (d19 * d11) + (d18 * d7) + (d17 * d3);
        double d21 = d19 * d12;
        double d22 = d20 * d16;
        out[3] = d22 + d21 + (d18 * d8) + (d17 * d4);
        double d23 = b[4];
        double d24 = b[5];
        double d25 = b[6];
        double d26 = b[7];
        out[4] = (d26 * d13) + (d25 * d9) + (d24 * d5) + (d23 * d);
        out[5] = (d26 * d14) + (d25 * d10) + (d24 * d6) + (d23 * d2);
        out[6] = (d26 * d15) + (d25 * d11) + (d24 * d7) + (d23 * d3);
        double d27 = d25 * d12;
        double d28 = d26 * d16;
        out[7] = d28 + d27 + (d24 * d8) + (d23 * d4);
        double d29 = b[8];
        double d30 = b[9];
        double d31 = b[10];
        double d32 = b[11];
        out[8] = (d32 * d13) + (d31 * d9) + (d30 * d5) + (d29 * d);
        out[9] = (d32 * d14) + (d31 * d10) + (d30 * d6) + (d29 * d2);
        out[10] = (d32 * d15) + (d31 * d11) + (d30 * d7) + (d29 * d3);
        double d33 = d31 * d12;
        double d34 = d32 * d16;
        out[11] = d34 + d33 + (d30 * d8) + (d29 * d4);
        double d35 = b[12];
        double d36 = b[13];
        double d37 = b[14];
        double d38 = b[15];
        double d39 = d9 * d37;
        double d40 = d13 * d38;
        out[12] = d40 + d39 + (d5 * d36) + (d * d35);
        double d41 = d10 * d37;
        double d42 = d14 * d38;
        out[13] = d42 + d41 + (d6 * d36) + (d2 * d35);
        double d43 = d11 * d37;
        double d44 = d15 * d38;
        out[14] = d44 + d43 + (d7 * d36) + (d3 * d35);
        double d45 = d37 * d12;
        double d46 = d38 * d16;
        out[15] = d46 + d45 + (d36 * d8) + (d35 * d4);
    }

    @JvmStatic
    public static final void multiplyVectorByMatrix(@NotNull double[] v, @NotNull double[] m, @NotNull double[] result) {
        v.getClass();
        m.getClass();
        result.getClass();
        double d = v[0];
        double d2 = v[1];
        double d3 = v[2];
        double d4 = v[3];
        result[0] = (m[12] * d4) + (m[8] * d3) + (m[4] * d2) + (m[0] * d);
        result[1] = (m[13] * d4) + (m[9] * d3) + (m[5] * d2) + (m[1] * d);
        result[2] = (m[14] * d4) + (m[10] * d3) + (m[6] * d2) + (m[2] * d);
        result[3] = (d4 * m[15]) + (d3 * m[11]) + (d2 * m[7]) + (d * m[3]);
    }

    @JvmStatic
    public static final void resetIdentityMatrix(@NotNull double[] matrix) {
        matrix.getClass();
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    @JvmStatic
    public static final double roundTo3Places(double n) {
        return Math.round(n * 1000.0d) * 0.001d;
    }

    @JvmStatic
    @NotNull
    public static final double[] transpose(@NotNull double[] m) {
        m.getClass();
        return new double[]{m[0], m[4], m[8], m[12], m[1], m[5], m[9], m[13], m[2], m[6], m[10], m[14], m[3], m[7], m[11], m[15]};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Combine(@NotNull double[] a2, @NotNull double[] b, double aScale, double bScale) {
        a2.getClass();
        b.getClass();
        return new double[]{(b[0] * bScale) + (a2[0] * aScale), (b[1] * bScale) + (a2[1] * aScale), (bScale * b[2]) + (aScale * a2[2])};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Cross(@NotNull double[] a2, @NotNull double[] b) {
        a2.getClass();
        b.getClass();
        double d = a2[1];
        double d2 = b[2];
        double d3 = a2[2];
        double d4 = b[1];
        double d5 = b[0];
        double d6 = a2[0];
        return new double[]{(d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5)};
    }

    @JvmStatic
    public static final double v3Dot(@NotNull double[] a2, @NotNull double[] b) {
        a2.getClass();
        b.getClass();
        return (a2[2] * b[2]) + (a2[1] * b[1]) + (a2[0] * b[0]);
    }

    @JvmStatic
    public static final double v3Length(@NotNull double[] a2) {
        a2.getClass();
        double d = a2[0];
        double d2 = a2[1];
        double d3 = (d2 * d2) + (d * d);
        double d4 = a2[2];
        return Math.sqrt((d4 * d4) + d3);
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Normalize(@NotNull double[] vector, double norm) {
        vector.getClass();
        double d = 1;
        if (INSTANCE.isZero(norm)) {
            norm = v3Length(vector);
        }
        double d2 = d / norm;
        return new double[]{vector[0] * d2, vector[1] * d2, vector[2] * d2};
    }

    public final void applyScaleZ(@NotNull double[] m, double factor) {
        m.getClass();
        m[10] = factor;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "", "<init>", "()V", "perspective", "", ModelTransformer.KEY_BATTERY_SCALE, "skew", "translation", "rotationDegrees", "reset", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MatrixDecompositionContext {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @JvmField
        @NotNull
        public double[] perspective = new double[4];

        @JvmField
        @NotNull
        public double[] scale = new double[3];

        @JvmField
        @NotNull
        public double[] skew = new double[3];

        @JvmField
        @NotNull
        public double[] translation = new double[3];

        @JvmField
        @NotNull
        public double[] rotationDegrees = new double[3];

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext$Companion;", "", "<init>", "()V", "resetArray", "", "arr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] arr) {
                int length = arr.length;
                for (int i = 0; i < length; i++) {
                    arr[i] = 0.0d;
                }
            }

            private Companion() {
            }
        }
    }
}
