package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Transformations$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediatorLiveData f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Transformations$$ExternalSyntheticLambda1(MediatorLiveData mediatorLiveData, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = mediatorLiveData;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit map$lambda$0;
        Unit distinctUntilChanged$lambda$0;
        Unit map$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                map$lambda$0 = Transformations.map$lambda$0(this.f$0, (Function1) this.f$1, obj);
                return map$lambda$0;
            case 1:
                distinctUntilChanged$lambda$0 = Transformations.distinctUntilChanged$lambda$0(this.f$0, (Ref.BooleanRef) this.f$1, obj);
                return distinctUntilChanged$lambda$0;
            default:
                map$lambda$1 = Transformations.map$lambda$1(this.f$0, (Function) this.f$1, obj);
                return map$lambda$1;
        }
    }
}
