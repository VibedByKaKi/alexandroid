package androidx.media3.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultTimeBar$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((DefaultTimeBar) obj).lambda$new$1(valueAnimator);
                break;
            case 1:
                ((PlayerControlViewLayoutManager) obj).lambda$new$0(valueAnimator);
                break;
            case 2:
                ((PlayerControlViewLayoutManager) obj).lambda$new$1(valueAnimator);
                break;
            case 3:
                ((PlayerControlViewLayoutManager) obj).lambda$new$2(valueAnimator);
                break;
            default:
                ((PlayerControlViewLayoutManager) obj).lambda$new$3(valueAnimator);
                break;
        }
    }
}
