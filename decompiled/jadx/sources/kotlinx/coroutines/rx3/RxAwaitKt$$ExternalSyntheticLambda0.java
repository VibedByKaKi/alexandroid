package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx3.DispatcherScheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class RxAwaitKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RxAwaitKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit disposeOnCancellation$lambda$3;
        Runnable scheduleDirect$lambda$1;
        Runnable schedule$lambda$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                disposeOnCancellation$lambda$3 = RxAwaitKt.disposeOnCancellation$lambda$3((Disposable) obj2, (Throwable) obj);
                return disposeOnCancellation$lambda$3;
            case 1:
                scheduleDirect$lambda$1 = DispatcherScheduler.scheduleDirect$lambda$1((DispatcherScheduler) obj2, (Function1) obj);
                return scheduleDirect$lambda$1;
            default:
                schedule$lambda$1 = DispatcherScheduler.DispatcherWorker.schedule$lambda$1((DispatcherScheduler.DispatcherWorker) obj2, (Function1) obj);
                return schedule$lambda$1;
        }
    }
}
