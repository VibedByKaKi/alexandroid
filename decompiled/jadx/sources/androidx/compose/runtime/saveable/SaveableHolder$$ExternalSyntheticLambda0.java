package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SaveableHolder$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SaveableHolder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object valueProvider$lambda$2;
        Object _init_$lambda$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                valueProvider$lambda$2 = SaveableHolder.valueProvider$lambda$2((SaveableHolder) obj);
                return valueProvider$lambda$2;
            default:
                _init_$lambda$1 = SaveableStateRegistryWrapper._init_$lambda$1((SaveableStateRegistryWrapper) obj);
                return _init_$lambda$1;
        }
    }
}
