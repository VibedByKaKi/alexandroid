package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SheetDelegate$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SheetDelegate$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                SheetDelegate.createDimmingViewAlphaAnimator$lambda$26$lambda$25((DimmingViewManager) obj, valueAnimator);
                break;
            default:
                DimmingViewManager.AnimateDimmingViewCallback.animator$lambda$1$lambda$0((DimmingViewManager.AnimateDimmingViewCallback) obj, valueAnimator);
                break;
        }
    }
}
