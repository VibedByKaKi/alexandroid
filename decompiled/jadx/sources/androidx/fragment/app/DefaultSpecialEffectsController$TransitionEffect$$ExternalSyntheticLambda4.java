package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpecialEffectsController.Operation f$0;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f$1;

    public /* synthetic */ DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.$r8$classId = i;
        this.f$0 = operation;
        this.f$1 = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(this.f$0, this.f$1);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(this.f$0, this.f$1);
                break;
        }
    }
}
