package com.amazon.apl.android.primitive;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.primitive.AutoValue_Gradient;
import com.amazon.apl.android.utils.ColorUtils;
import com.amazon.apl.enums.APLEnum;
import com.amazon.apl.enums.GradientProperty;
import com.amazon.apl.enums.GradientSpreadMethod;
import com.amazon.apl.enums.GradientType;
import com.amazon.apl.enums.GradientUnits;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Gradient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.primitive.Gradient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$GradientType;

        static {
            int[] iArr = new int[GradientType.values().length];
            $SwitchMap$com$amazon$apl$enums$GradientType = iArr;
            try {
                iArr[GradientType.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$GradientType[GradientType.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder angle(float f);

        public abstract Gradient build();

        public abstract Builder centerX(float f);

        public abstract Builder centerY(float f);

        public abstract Builder colorRange(int[] iArr);

        public abstract Builder inputRange(float[] fArr);

        public abstract Builder radius(float f);

        public abstract Builder spreadMethod(GradientSpreadMethod gradientSpreadMethod);

        public abstract Builder type(GradientType gradientType);

        public abstract Builder units(GradientUnits gradientUnits);

        public abstract Builder x1(float f);

        public abstract Builder x2(float f);

        public abstract Builder y1(float f);

        public abstract Builder y2(float f);
    }

    public static Builder builder() {
        return new AutoValue_Gradient.Builder().x1(-1.0f).y1(-1.0f).x2(-1.0f).y2(-1.0f).centerX(-1.0f).centerY(-1.0f).radius(-1.0f);
    }

    public static int[] convertColorRange(long[] jArr) {
        int[] iArr = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            iArr[i] = ColorUtils.toARGB(jArr[i]);
        }
        return iArr;
    }

    public static Gradient create(BoundObject boundObject, APLEnum aPLEnum) {
        GradientType valueOf = GradientType.valueOf(getInt(boundObject, aPLEnum, GradientProperty.kGradientPropertyType));
        Builder units = builder().type(valueOf).angle(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyAngle)).spreadMethod(GradientSpreadMethod.valueOf(getInt(boundObject, aPLEnum, GradientProperty.kGradientPropertySpreadMethod))).inputRange(getFloatArray(boundObject, aPLEnum, GradientProperty.kGradientPropertyInputRange)).colorRange(convertColorRange(getColorArray(boundObject, aPLEnum, GradientProperty.kGradientPropertyColorRange))).units(GradientUnits.valueOf(getInt(boundObject, aPLEnum, GradientProperty.kGradientPropertyUnits)));
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$GradientType[valueOf.ordinal()];
        if (i == 1) {
            units.x1(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyX1)).y1(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyY1)).x2(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyX2)).y2(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyY2));
        } else if (i == 2) {
            units.centerX(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyCenterX)).centerY(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyCenterY)).radius(getFloat(boundObject, aPLEnum, GradientProperty.kGradientPropertyRadius));
        }
        return units.build();
    }

    public static Shader createGradientShader(int[] iArr, float[] fArr, GradientType gradientType, float f, int i, int i2) {
        int i3 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$GradientType[gradientType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            return new RadialGradient(i2 / 2.0f, i / 2.0f, ((float) Math.sqrt((i * i) + (i2 * i2))) / 2.0f, iArr, fArr, Shader.TileMode.CLAMP);
        }
        double radians = Math.toRadians(f);
        float f2 = i;
        float abs = (((float) ((Math.abs(Math.cos(radians)) * i) + (Math.abs(Math.sin(radians)) * i2))) - f2) / 2.0f;
        LinearGradient linearGradient = new LinearGradient(0.0f, f2 + abs, 0.0f, 0.0f - abs, iArr, fArr, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setRotate(f, i2 / 2, i / 2);
        linearGradient.setLocalMatrix(matrix);
        return linearGradient;
    }

    private static long[] getColorArray(BoundObject boundObject, APLEnum aPLEnum, GradientProperty gradientProperty) {
        return nGetColorArray(boundObject.getNativeHandle(), aPLEnum.getIndex(), gradientProperty.getIndex());
    }

    private static float getFloat(BoundObject boundObject, APLEnum aPLEnum, GradientProperty gradientProperty) {
        return nGetFloat(boundObject.getNativeHandle(), aPLEnum.getIndex(), gradientProperty.getIndex());
    }

    private static float[] getFloatArray(BoundObject boundObject, APLEnum aPLEnum, GradientProperty gradientProperty) {
        return nGetFloatArray(boundObject.getNativeHandle(), aPLEnum.getIndex(), gradientProperty.getIndex());
    }

    private static int getInt(BoundObject boundObject, APLEnum aPLEnum, GradientProperty gradientProperty) {
        return nGetInt(boundObject.getNativeHandle(), aPLEnum.getIndex(), gradientProperty.getIndex());
    }

    private static native long[] nGetColorArray(long j, int i, int i2);

    private static native float nGetFloat(long j, int i, int i2);

    private static native float[] nGetFloatArray(long j, int i, int i2);

    private static native int nGetInt(long j, int i, int i2);

    public abstract float getAngle();

    public abstract float getCenterX();

    public abstract float getCenterY();

    @NonNull
    public abstract int[] getColorRange();

    @NonNull
    public abstract float[] getInputRange();

    public abstract float getRadius();

    public Shader getShader(int i, int i2) {
        return createGradientShader(getColorRange(), getInputRange(), getType(), getAngle(), i2, i);
    }

    @Nullable
    public abstract GradientSpreadMethod getSpreadMethod();

    @NonNull
    public abstract GradientType getType();

    @Nullable
    public abstract GradientUnits getUnits();

    public abstract float getX1();

    public abstract float getX2();

    public abstract float getY1();

    public abstract float getY2();
}
