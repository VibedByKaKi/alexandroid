package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Fragment$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Fragment$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Fragment) obj).lambda$performCreateView$0();
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14((ArrayList) obj);
                break;
            case 2:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4((Ref.ObjectRef) obj);
                break;
            case 3:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass2.invoke$lambda$4((DefaultSpecialEffectsController.TransitionEffect) obj);
                break;
            default:
                ((FragmentManager) obj).lambda$cancelBackStackTransition$4();
                break;
        }
    }
}
