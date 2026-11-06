package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12((SpecialEffectsController.Operation) this.f$0, (SpecialEffectsController.Operation) this.f$1, (DefaultSpecialEffectsController.TransitionEffect) this.f$2);
                break;
            case 1:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.f$0, (View) this.f$1, (DefaultSpecialEffectsController.AnimationEffect) this.f$2);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13((FragmentTransitionImpl) this.f$0, (View) this.f$1, (Rect) this.f$2);
                break;
        }
    }
}
