package dagger.internal.codegen.binding;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DependencyEdgeImpl$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DependencyEdgeImpl$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String lambda$toString$0;
        IllegalStateException lambda$getQualifiersForKotlinProperty$13;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$toString$0 = ((DependencyEdgeImpl) obj).lambda$toString$0();
                return lambda$toString$0;
            default:
                lambda$getQualifiersForKotlinProperty$13 = InjectionAnnotations.lambda$getQualifiersForKotlinProperty$13((String) obj);
                return lambda$getQualifiersForKotlinProperty$13;
        }
    }
}
