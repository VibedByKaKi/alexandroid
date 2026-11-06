package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Transformations$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediatorLiveData f$0;

    public /* synthetic */ Transformations$$ExternalSyntheticLambda2(MediatorLiveData mediatorLiveData, int i) {
        this.$r8$classId = i;
        this.f$0 = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit switchMap$lambda$0$0;
        Unit invokeSuspend$lambda$0;
        Unit onChanged$lambda$0;
        int i = this.$r8$classId;
        MediatorLiveData mediatorLiveData = this.f$0;
        switch (i) {
            case 0:
                switchMap$lambda$0$0 = Transformations.switchMap$lambda$0$0(mediatorLiveData, obj);
                return switchMap$lambda$0$0;
            case 1:
                invokeSuspend$lambda$0 = CoroutineLiveDataKt$addDisposableSource$2.invokeSuspend$lambda$0(mediatorLiveData, obj);
                return invokeSuspend$lambda$0;
            default:
                onChanged$lambda$0 = Transformations$switchMap$2.onChanged$lambda$0(mediatorLiveData, obj);
                return onChanged$lambda$0;
        }
    }
}
