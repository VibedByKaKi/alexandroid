package com.amazon.alexa.growthcore.util;

import android.animation.ValueAnimator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class UIUtil$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ UIUtil$$ExternalSyntheticLambda0(Consumer consumer, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Consumer consumer = this.f$0;
        switch (i) {
            case 0:
                UIUtil.lambda$createColorAnimator$2(consumer, valueAnimator);
                break;
            case 1:
                UIUtil.lambda$createFloatAnimator$1(consumer, valueAnimator);
                break;
            default:
                UIUtil.lambda$createIntAnimator$0(consumer, valueAnimator);
                break;
        }
    }
}
