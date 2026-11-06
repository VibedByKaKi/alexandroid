package androidx.core.view.insets;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Protection$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Protection f$0;

    public /* synthetic */ Protection$$ExternalSyntheticLambda0(Protection protection, int i) {
        this.$r8$classId = i;
        this.f$0 = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Protection protection = this.f$0;
        switch (i) {
            case 0:
                protection.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                protection.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
