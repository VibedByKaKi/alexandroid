package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LifecycleEffectKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ LifecycleOwner f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = lifecycleOwner;
        this.f$4 = function1;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit LifecycleResumeEffect$lambda$5;
        Unit LifecycleStartEffect$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$5 = LifecycleEffectKt.LifecycleResumeEffect$lambda$5(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, intValue);
                return LifecycleResumeEffect$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$5 = LifecycleEffectKt.LifecycleStartEffect$lambda$5(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, intValue2);
                return LifecycleStartEffect$lambda$5;
        }
    }
}
