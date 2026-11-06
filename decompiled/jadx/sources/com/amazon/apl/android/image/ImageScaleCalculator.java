package com.amazon.apl.android.image;

import com.amazon.apl.enums.ImageScale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ImageScaleCalculator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.image.ImageScaleCalculator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$ImageScale;

        static {
            int[] iArr = new int[ImageScale.values().length];
            $SwitchMap$com$amazon$apl$enums$ImageScale = iArr;
            try {
                iArr[ImageScale.kImageScaleNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageScale[ImageScale.kImageScaleFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageScale[ImageScale.kImageScaleBestFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageScale[ImageScale.kImageScaleBestFit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageScale[ImageScale.kImageScaleBestFitDown.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static float[] getScale(ImageScale imageScale, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$ImageScale[imageScale.ordinal()];
        if (i5 != 2) {
            if (i5 != 3) {
                f = i5 != 4 ? (i5 == 5 && (i3 >= i || i4 >= i2)) ? Math.min(i / i3, i2 / i4) : 1.0f : Math.min(i / i3, i2 / i4);
            } else {
                if (i3 * i2 > i * i4) {
                    f3 = i2;
                    f4 = i4;
                } else {
                    f3 = i;
                    f4 = i3;
                }
                f = f3 / f4;
            }
            f2 = f;
        } else {
            f = i / i3;
            f2 = i2 / i4;
        }
        return new float[]{f, f2};
    }
}
