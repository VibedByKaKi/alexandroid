package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SheetDelegate$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SheetDelegate f$0;

    public /* synthetic */ SheetDelegate$$ExternalSyntheticLambda2(SheetDelegate sheetDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = sheetDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        SheetDelegate sheetDelegate = this.f$0;
        switch (i) {
            case 0:
                SheetDelegate.createSheetSlideInAnimator$lambda$30$lambda$29(sheetDelegate, valueAnimator);
                break;
            default:
                SheetDelegate.createSheetSlideOutAnimator$lambda$32$lambda$31(sheetDelegate, valueAnimator);
                break;
        }
    }
}
