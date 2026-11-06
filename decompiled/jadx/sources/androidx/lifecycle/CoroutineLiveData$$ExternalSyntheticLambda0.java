package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class CoroutineLiveData$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CoroutineLiveData$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _init_$lambda$0;
        SavedStateHandlesVM savedStateHandlesVM;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                _init_$lambda$0 = CoroutineLiveData._init_$lambda$0((CoroutineLiveData) obj);
                return _init_$lambda$0;
            default:
                savedStateHandlesVM = SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) obj);
                return savedStateHandlesVM;
        }
    }
}
