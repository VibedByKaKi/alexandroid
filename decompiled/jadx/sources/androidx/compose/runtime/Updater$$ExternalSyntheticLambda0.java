package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Updater$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ Updater$$ExternalSyntheticLambda0(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit init_impl$lambda$4;
        Unit reconcile_impl$lambda$5;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        Unit unit = (Unit) obj2;
        switch (i) {
            case 0:
                init_impl$lambda$4 = Updater.init_impl$lambda$4(function1, obj, unit);
                return init_impl$lambda$4;
            default:
                reconcile_impl$lambda$5 = Updater.reconcile_impl$lambda$5(function1, obj, unit);
                return reconcile_impl$lambda$5;
        }
    }
}
