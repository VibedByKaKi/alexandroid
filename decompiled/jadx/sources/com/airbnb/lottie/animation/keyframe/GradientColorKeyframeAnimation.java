package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {
    private final GradientColor gradientColor;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            GradientColor gradientColor = list.get(i2).startValue;
            if (gradientColor != null) {
                i = Math.max(i, gradientColor.getSize());
            }
        }
        this.gradientColor = new GradientColor(new float[i], new int[i]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public GradientColor getValue(Keyframe<GradientColor> keyframe, float f) {
        this.gradientColor.lerp(keyframe.startValue, keyframe.endValue, f);
        return this.gradientColor;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<GradientColor>) keyframe, f);
    }
}
