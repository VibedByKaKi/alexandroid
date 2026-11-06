package com.amazon.apl.android.image.filters.blender;

import android.graphics.Color;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.enums.BlendMode;
import java.security.InvalidParameterException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SeparableBlender extends Blender {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.image.filters.blender.SeparableBlender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$BlendMode;

        static {
            int[] iArr = new int[BlendMode.values().length];
            $SwitchMap$com$amazon$apl$enums$BlendMode = iArr;
            try {
                iArr[BlendMode.kBlendModeScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeOverlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeDarken.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeLighten.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeColorDodge.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeColorBurn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeHardLight.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeSoftLight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeDifference.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeExclusion.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public SeparableBlender(BlendMode blendMode) {
        super(blendMode);
    }

    private float blendColor(float f, float f2, float f3, float f4) {
        switch (AnonymousClass1.$SwitchMap$com$amazon$apl$enums$BlendMode[this.mBlendMode.ordinal()]) {
            case 1:
                return blendScreen(f, f2, f3, f4);
            case 2:
                return blendOverlay(f, f2, f3, f4);
            case 3:
                return blendDarken(f, f2, f3, f4);
            case 4:
                return blendLighten(f, f2, f3, f4);
            case 5:
                return blendColorDodge(f, f2, f3, f4);
            case 6:
                return blendColorBurn(f, f2, f3, f4);
            case 7:
                return blendHardLight(f, f2, f3, f4);
            case 8:
                return blendSoftLight(f, f2, f3, f4);
            case 9:
                return blendDifference(f, f2, f3, f4);
            case 10:
                return blendExclusion(f, f2, f3, f4);
            default:
                throw new InvalidParameterException();
        }
    }

    private float blendColorBurn(float f, float f2, float f3, float f4) {
        if (f2 == f4) {
            return (f * inverse(f4)) + f2;
        }
        if (f == 0.0f) {
            return f2 * inverse(f3);
        }
        return (f2 * inverse(f3)) + (f * inverse(f4)) + ((f4 - Math.min(f4, ((f4 - f2) * f3) * rcp(f))) * f3);
    }

    private float blendColorDodge(float f, float f2, float f3, float f4) {
        float inverse;
        if (f2 == 0.0f) {
            return f * inverse(f4);
        }
        if (f == f3) {
            inverse = inverse(f3);
        } else {
            f = (f * inverse(f4)) + (Math.min(f4, f2 * f3 * rcp(f3 - f)) * f3);
            inverse = inverse(f3);
        }
        return (f2 * inverse) + f;
    }

    private float blendDarken(float f, float f2, float f3, float f4) {
        return (f + f2) - Math.max(f * f4, f2 * f3);
    }

    private float blendDifference(float f, float f2, float f3, float f4) {
        return (f + f2) - two(Math.min(f * f4, f2 * f3));
    }

    private float blendExclusion(float f, float f2, float f3, float f4) {
        return (f + f2) - two(f * f2);
    }

    private float blendHardLight(float f, float f2, float f3, float f4) {
        if (two(f) <= f3) {
            return (inverse(f3) * f2) + (inverse(f4) * f) + two(f * f2);
        }
        return ((f3 * f4) + ((inverse(f3) * f2) + (inverse(f4) * f))) - two((f3 - f) * (f4 - f2));
    }

    private float blendLighten(float f, float f2, float f3, float f4) {
        return (f + f2) - Math.min(f * f4, f2 * f3);
    }

    private float blendOverlay(float f, float f2, float f3, float f4) {
        if (two(f2) <= f4) {
            return (inverse(f3) * f2) + (inverse(f4) * f) + two(f * f2);
        }
        return ((f3 * f4) + ((inverse(f3) * f2) + (inverse(f4) * f))) - two((f3 - f) * (f4 - f2));
    }

    private float blendScreen(float f, float f2, float f3, float f4) {
        return (f + f2) - (f * f2);
    }

    private float blendSoftLight(float f, float f2, float f3, float f4) {
        float f5 = f4 > 0.0f ? f2 / f4 : 0.0f;
        float two = two(f);
        float two2 = two(two(f5));
        if (two <= f3) {
            return ((((1.0f - f5) * (two - f3)) + f3) * f2) + (inverse(f3) * f2) + (f * inverse(f4));
        }
        if (two(two(f2)) > f4) {
            return ErrorUtils$$ExternalSyntheticOutline0.m((float) Math.sqrt(f5), f5, (two - f3) * f4, (f2 * f3) + (inverse(f3) * f2) + (f * inverse(f4)));
        }
        return (((f5 * 7.0f) + ((f5 - 1.0f) * ((two2 * two2) + two2))) * (two - f3) * f4) + (f2 * f3) + (inverse(f3) * f2) + (f * inverse(f4));
    }

    private float inverse(float f) {
        return 1.0f - f;
    }

    private float mad(float f, float f2, float f3) {
        return (f * f2) + f3;
    }

    private float rcp(float f) {
        return 1.0f / f;
    }

    private float two(float f) {
        return f + f;
    }

    @Override // com.amazon.apl.android.image.filters.blender.Blender
    public int blendPixels(int i, int i2) {
        float alpha = Color.alpha(i) / 255.0f;
        float alpha2 = Color.alpha(i2) / 255.0f;
        return Color.argb(Math.round((this.mBlendMode == BlendMode.kBlendModeScreen ? blendColor(alpha, alpha2, alpha, alpha2) : mad(alpha2, inverse(alpha), alpha)) * 255.0f), Math.round(blendColor(Color.red(i) / 255.0f, Color.red(i2) / 255.0f, alpha, alpha2) * 255.0f), Math.round(blendColor(Color.green(i) / 255.0f, Color.green(i2) / 255.0f, alpha, alpha2) * 255.0f), Math.round(blendColor(Color.blue(i) / 255.0f, Color.blue(i2) / 255.0f, alpha, alpha2) * 255.0f));
    }
}
