package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class LottieInterpolatedFloatValue extends LottieInterpolatedValue<Float> {
    public LottieInterpolatedFloatValue(Float f, Float f2) {
        super(f, f2);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    public Float interpolateValue(Float f, Float f2, float f3) {
        return Float.valueOf(MiscUtils.lerp(f.floatValue(), f2.floatValue(), f3));
    }

    public LottieInterpolatedFloatValue(Float f, Float f2, Interpolator interpolator) {
        super(f, f2, interpolator);
    }
}
