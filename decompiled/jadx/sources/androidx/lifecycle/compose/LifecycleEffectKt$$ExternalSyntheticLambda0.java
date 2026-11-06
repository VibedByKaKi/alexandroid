package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LifecycleEffectKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ LifecycleOwner f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda0(Object obj, LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = lifecycleOwner;
        this.f$2 = function1;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit LifecycleStartEffect$lambda$1;
        Unit LifecycleResumeEffect$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$1 = LifecycleEffectKt.LifecycleStartEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return LifecycleStartEffect$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$1 = LifecycleEffectKt.LifecycleResumeEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return LifecycleResumeEffect$lambda$1;
        }
    }
}
