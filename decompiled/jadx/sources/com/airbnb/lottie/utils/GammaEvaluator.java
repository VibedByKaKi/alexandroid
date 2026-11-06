package com.airbnb.lottie.utils;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GammaEvaluator {
    private static float EOCF_sRGB(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float EOCF_sRGB = EOCF_sRGB(((i >> 16) & 255) / 255.0f);
        float EOCF_sRGB2 = EOCF_sRGB(((i >> 8) & 255) / 255.0f);
        float EOCF_sRGB3 = EOCF_sRGB((i & 255) / 255.0f);
        float EOCF_sRGB4 = EOCF_sRGB(((i2 >> 16) & 255) / 255.0f);
        float EOCF_sRGB5 = EOCF_sRGB(((i2 >> 8) & 255) / 255.0f);
        float EOCF_sRGB6 = EOCF_sRGB((i2 & 255) / 255.0f);
        float m = ErrorUtils$$ExternalSyntheticOutline0.m(f3, f2, f, f2);
        float m2 = ErrorUtils$$ExternalSyntheticOutline0.m(EOCF_sRGB4, EOCF_sRGB, f, EOCF_sRGB);
        float m3 = ErrorUtils$$ExternalSyntheticOutline0.m(EOCF_sRGB5, EOCF_sRGB2, f, EOCF_sRGB2);
        float m4 = ErrorUtils$$ExternalSyntheticOutline0.m(EOCF_sRGB6, EOCF_sRGB3, f, EOCF_sRGB3);
        float OECF_sRGB = OECF_sRGB(m2) * 255.0f;
        float OECF_sRGB2 = OECF_sRGB(m3) * 255.0f;
        return Math.round(OECF_sRGB(m4) * 255.0f) | (Math.round(OECF_sRGB) << 16) | (Math.round(m * 255.0f) << 24) | (Math.round(OECF_sRGB2) << 8);
    }
}
