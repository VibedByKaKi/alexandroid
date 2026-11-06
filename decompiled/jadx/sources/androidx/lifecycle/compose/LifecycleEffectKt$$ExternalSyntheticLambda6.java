package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.alexa.ra.core.ui.screen.LiveModeFtueActiveHeartbeatKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LifecycleEffectKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LifecycleOwner f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda6(Function1 function1, LifecycleOwner lifecycleOwner, int i, int i2) {
        this.$r8$classId = 2;
        this.f$1 = function1;
        this.f$0 = lifecycleOwner;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit LifecycleResumeEffect$lambda$8;
        Unit LifecycleStartEffect$lambda$8;
        Unit LiveModeFtueActiveHeartbeat$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$8 = LifecycleEffectKt.LifecycleResumeEffect$lambda$8(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue);
                return LifecycleResumeEffect$lambda$8;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$8 = LifecycleEffectKt.LifecycleStartEffect$lambda$8(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue2);
                return LifecycleStartEffect$lambda$8;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                LifecycleOwner lifecycleOwner = this.f$0;
                LiveModeFtueActiveHeartbeat$lambda$5 = LiveModeFtueActiveHeartbeatKt.LiveModeFtueActiveHeartbeat$lambda$5(this.f$1, lifecycleOwner, this.f$2, this.f$3, (Composer) obj, intValue3);
                return LiveModeFtueActiveHeartbeat$lambda$5;
        }
    }

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda6(LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = lifecycleOwner;
        this.f$1 = function1;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
