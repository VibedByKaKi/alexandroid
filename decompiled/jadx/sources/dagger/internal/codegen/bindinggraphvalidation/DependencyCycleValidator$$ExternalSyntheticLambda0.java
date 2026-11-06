package dagger.internal.codegen.bindinggraphvalidation;

import dagger.spi.model.BindingGraph;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DependencyCycleValidator$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DependencyCycleValidator f$0;
    public final /* synthetic */ BindingGraph f$1;

    public /* synthetic */ DependencyCycleValidator$$ExternalSyntheticLambda0(DependencyCycleValidator dependencyCycleValidator, BindingGraph bindingGraph, int i) {
        this.$r8$classId = i;
        this.f$0 = dependencyCycleValidator;
        this.f$1 = bindingGraph;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$nonCycleBreakingDependencyGraph$3;
        boolean lambda$nonCycleBreakingEdge$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$nonCycleBreakingDependencyGraph$3 = this.f$0.lambda$nonCycleBreakingDependencyGraph$3(this.f$1, (BindingGraph.DependencyEdge) obj);
                return lambda$nonCycleBreakingDependencyGraph$3;
            default:
                lambda$nonCycleBreakingEdge$2 = this.f$0.lambda$nonCycleBreakingEdge$2(this.f$1, (BindingGraph.DependencyEdge) obj);
                return lambda$nonCycleBreakingEdge$2;
        }
    }
}
