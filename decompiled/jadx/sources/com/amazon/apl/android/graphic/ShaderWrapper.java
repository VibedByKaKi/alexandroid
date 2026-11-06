package com.amazon.apl.android.graphic;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import com.amazon.apl.android.primitive.Gradient;
import com.amazon.apl.enums.GradientSpreadMethod;
import com.amazon.apl.enums.GradientUnits;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ShaderWrapper {
    private final int[] mColorRange;
    private final GradientUnits mGradientUnits;
    private final float[] mInputRange;
    private final Shader.TileMode mTileMode;
    private final Matrix mTransform;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.graphic.ShaderWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$GradientSpreadMethod;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$GradientUnits;

        static {
            int[] iArr = new int[GradientUnits.values().length];
            $SwitchMap$com$amazon$apl$enums$GradientUnits = iArr;
            try {
                iArr[GradientUnits.kGradientUnitsUserSpace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$GradientUnits[GradientUnits.kGradientUnitsBoundingBox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[GradientSpreadMethod.values().length];
            $SwitchMap$com$amazon$apl$enums$GradientSpreadMethod = iArr2;
            try {
                iArr2[GradientSpreadMethod.PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$GradientSpreadMethod[GradientSpreadMethod.REFLECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$GradientSpreadMethod[GradientSpreadMethod.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ShaderWrapper(Gradient gradient, Matrix matrix) {
        this.mColorRange = gradient.getColorRange();
        this.mGradientUnits = gradient.getUnits();
        this.mInputRange = gradient.getInputRange();
        this.mTileMode = getTileMode(gradient.getSpreadMethod());
        this.mTransform = matrix;
    }

    public float getAbsoluteCoordinate(float f, float f2) {
        return AnonymousClass1.$SwitchMap$com$amazon$apl$enums$GradientUnits[this.mGradientUnits.ordinal()] != 1 ? f * f2 : f2;
    }

    public float getAbsoluteXCoordinate(Rect rect, float f) {
        return getAbsoluteCoordinate(rect.width(), f) + rect.left;
    }

    public float getAbsoluteYCoordinate(Rect rect, float f) {
        return getAbsoluteCoordinate(rect.height(), f) + rect.top;
    }

    public int[] getColorRange() {
        return this.mColorRange;
    }

    public float[] getInputRange() {
        return this.mInputRange;
    }

    public abstract Shader getShader();

    public Shader.TileMode getTileMode(GradientSpreadMethod gradientSpreadMethod) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$GradientSpreadMethod[gradientSpreadMethod.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? tileMode : Shader.TileMode.REPEAT : Shader.TileMode.MIRROR : tileMode;
    }

    public Matrix getTransform() {
        return this.mTransform;
    }

    public Shader.TileMode getTileMode() {
        return this.mTileMode;
    }
}
