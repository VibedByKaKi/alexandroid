package com.amazon.apl.android.image.filters.blender;

import android.graphics.Color;
import com.amazon.apl.enums.BlendMode;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NonSeparableBlender extends Blender {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.image.filters.blender.NonSeparableBlender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$BlendMode;

        static {
            int[] iArr = new int[BlendMode.values().length];
            $SwitchMap$com$amazon$apl$enums$BlendMode = iArr;
            try {
                iArr[BlendMode.kBlendModeHue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeSaturation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeColor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeLuminosity.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public NonSeparableBlender(BlendMode blendMode) {
        super(blendMode);
    }

    private float clip(float f, float f2, float f3, float f4, float f5) {
        if (f2 < 0.0f && f4 != f2) {
            f = (((f - f4) * f4) / (f4 - f2)) + f4;
        }
        if (f3 > f5 && f4 != f3) {
            f = (((f5 - f4) * (f - f4)) / (f3 - f4)) + f4;
        }
        return Math.max(f, 0.0f);
    }

    private void clipColor(float[] fArr, float f) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float min = Math.min(f2, Math.min(f3, f4));
        float max = Math.max(f2, Math.max(f3, f4));
        float lum = lum(f2, f3, f4);
        fArr[0] = clip(f2, min, max, lum, f);
        fArr[1] = clip(f3, min, max, lum, f);
        fArr[2] = clip(f4, min, max, lum, f);
    }

    private float inverse(float f) {
        return 1.0f - f;
    }

    private float lum(float f, float f2, float f3) {
        return (f3 * 0.11f) + (f2 * 0.59f) + (f * 0.3f);
    }

    private float sat(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3)) - Math.min(f, Math.min(f2, f3));
    }

    private float scale(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return ((f - f3) * f2) / f4;
    }

    private void setLum(float[] fArr, float f) {
        float lum = f - lum(fArr[0], fArr[1], fArr[2]);
        fArr[0] = fArr[0] + lum;
        fArr[1] = fArr[1] + lum;
        fArr[2] = fArr[2] + lum;
    }

    private void setSat(float[] fArr, float f) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float min = Math.min(f2, Math.min(f3, f4));
        float max = Math.max(f2, Math.max(f3, f4)) - min;
        fArr[0] = scale(f2, f, min, max);
        fArr[1] = scale(f3, f, min, max);
        fArr[2] = scale(f4, f, min, max);
    }

    @Override // com.amazon.apl.android.image.filters.blender.Blender
    public int blendPixels(int i, int i2) {
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float alpha = Color.alpha(i) / 255.0f;
        float red2 = Color.red(i2) / 255.0f;
        float green2 = Color.green(i2) / 255.0f;
        float blue2 = Color.blue(i2) / 255.0f;
        float alpha2 = Color.alpha(i2) / 255.0f;
        float[] fArr = new float[3];
        int i3 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$BlendMode[this.mBlendMode.ordinal()];
        if (i3 == 1) {
            fArr[0] = red * alpha;
            fArr[1] = green * alpha;
            fArr[2] = blue * alpha;
            setSat(fArr, sat(red2, green2, blue2) * alpha);
            setLum(fArr, lum(red2, green2, blue2) * alpha);
        } else if (i3 == 2) {
            fArr[0] = red2 * alpha;
            fArr[1] = green2 * alpha;
            fArr[2] = blue2 * alpha;
            setSat(fArr, sat(red, green, blue) * alpha2);
            setLum(fArr, lum(red2, green2, blue2) * alpha);
        } else if (i3 == 3) {
            fArr[0] = red * alpha2;
            fArr[1] = green * alpha2;
            fArr[2] = blue * alpha2;
            setLum(fArr, lum(red2, green2, blue2) * alpha);
        } else {
            if (i3 != 4) {
                Single$$ExternalSyntheticBUOutline0.m(this.mBlendMode, "Unexpected value: ");
                return 0;
            }
            fArr[0] = red2 * alpha;
            fArr[1] = green2 * alpha;
            fArr[2] = blue2 * alpha;
            setLum(fArr, lum(red, green, blue) * alpha2);
        }
        float f = alpha * alpha2;
        clipColor(fArr, f);
        return Color.argb(Math.round(((alpha + alpha2) - f) * 255.0f), Math.round(((red2 * inverse(alpha)) + (red * inverse(alpha2)) + fArr[0]) * 255.0f), Math.round(((green2 * inverse(alpha)) + (green * inverse(alpha2)) + fArr[1]) * 255.0f), Math.round(((blue2 * inverse(alpha)) + (blue * inverse(alpha2)) + fArr[2]) * 255.0f));
    }
}
