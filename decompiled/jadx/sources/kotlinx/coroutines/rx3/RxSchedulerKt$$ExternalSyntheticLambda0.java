package kotlinx.coroutines.rx3;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class RxSchedulerKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RxSchedulerKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit scheduleTask$task$lambda$1;
        Unit invokeSuspend$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                scheduleTask$task$lambda$1 = RxSchedulerKt.scheduleTask$task$lambda$1((Runnable) obj);
                return scheduleTask$task$lambda$1;
            default:
                invokeSuspend$lambda$0 = RxConvertKt$asFlow$1.invokeSuspend$lambda$0((AtomicReference) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
