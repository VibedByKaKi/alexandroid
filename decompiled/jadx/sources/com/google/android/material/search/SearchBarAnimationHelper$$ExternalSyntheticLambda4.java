package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SearchBarAnimationHelper$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SearchBarAnimationHelper$$ExternalSyntheticLambda4(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1((MaterialShapeDrawable) this.f$0, (View) this.f$1, valueAnimator);
                break;
            default:
                ((SearchViewAnimationHelper) this.f$0).lambda$addEditTextClipAnimator$6((Rect) this.f$1, valueAnimator);
                break;
        }
    }
}
