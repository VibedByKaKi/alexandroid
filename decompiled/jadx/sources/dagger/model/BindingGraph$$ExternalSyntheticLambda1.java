package dagger.model;

import dagger.model.BindingGraph;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindingGraph$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BindingGraph$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$rootComponentNode$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$rootComponentNode$3 = BindingGraph.lambda$rootComponentNode$3((BindingGraph.ComponentNode) obj);
                return lambda$rootComponentNode$3;
            default:
                return ((BindingGraph.DependencyEdge) obj).isEntryPoint();
        }
    }
}
