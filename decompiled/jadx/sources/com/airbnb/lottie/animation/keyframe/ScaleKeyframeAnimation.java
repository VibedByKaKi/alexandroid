package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {
    private final ScaleXY scaleXY;

    public ScaleKeyframeAnimation(List<Keyframe<ScaleXY>> list) {
        super(list);
        this.scaleXY = new ScaleXY();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public ScaleXY getValue(Keyframe<ScaleXY> keyframe, float f) {
        ScaleXY scaleXY;
        float f2;
        ScaleXY scaleXY2 = keyframe.startValue;
        if (scaleXY2 == null || (scaleXY = keyframe.endValue) == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Missing values for keyframe.");
            return null;
        }
        ScaleXY scaleXY3 = scaleXY2;
        ScaleXY scaleXY4 = scaleXY;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != 0) {
            f2 = f;
            ScaleXY scaleXY5 = (ScaleXY) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), scaleXY3, scaleXY4, f2, getLinearCurrentKeyframeProgress(), getProgress());
            if (scaleXY5 != null) {
                return scaleXY5;
            }
        } else {
            f2 = f;
        }
        this.scaleXY.set(MiscUtils.lerp(scaleXY3.getScaleX(), scaleXY4.getScaleX(), f2), MiscUtils.lerp(scaleXY3.getScaleY(), scaleXY4.getScaleY(), f2));
        return this.scaleXY;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<ScaleXY>) keyframe, f);
    }
}
