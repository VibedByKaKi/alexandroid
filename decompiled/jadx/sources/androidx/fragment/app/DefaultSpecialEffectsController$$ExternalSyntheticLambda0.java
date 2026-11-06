package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultSpecialEffectsController$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultSpecialEffectsController$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.f$0, (SpecialEffectsController.Operation) this.f$1);
                break;
            default:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass2.invoke$lambda$2((DefaultSpecialEffectsController.TransitionEffect) this.f$0, (ViewGroup) this.f$1);
                break;
        }
    }
}
