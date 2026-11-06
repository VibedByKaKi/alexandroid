package dagger.internal.codegen.binding;

import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindingGraph$$ExternalSyntheticLambda4 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BindingGraph f$0;

    public /* synthetic */ BindingGraph$$ExternalSyntheticLambda4(BindingGraph bindingGraph, int i) {
        this.$r8$classId = i;
        this.f$0 = bindingGraph;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$localContributionBinding$2;
        boolean lambda$localMembersInjectionBinding$3;
        int i = this.$r8$classId;
        BindingGraph bindingGraph = this.f$0;
        BindingNode bindingNode = (BindingNode) obj;
        switch (i) {
            case 0:
                lambda$localContributionBinding$2 = bindingGraph.lambda$localContributionBinding$2(bindingNode);
                return lambda$localContributionBinding$2;
            default:
                lambda$localMembersInjectionBinding$3 = bindingGraph.lambda$localMembersInjectionBinding$3(bindingNode);
                return lambda$localMembersInjectionBinding$3;
        }
    }
}
