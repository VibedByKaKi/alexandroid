package dagger.model;

import dagger.model.BindingGraph;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindingGraph$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BindingGraph$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class lambda$nodesByClass$9;
        BindingGraph.DependencyEdge lambda$dependencyEdges$4;
        BindingGraph.Node lambda$nodesByClass$10;
        switch (this.$r8$classId) {
            case 0:
                lambda$nodesByClass$9 = BindingGraph.lambda$nodesByClass$9((BindingGraph.Node) obj);
                return lambda$nodesByClass$9;
            case 1:
                return ((BindingGraph.DependencyEdge) obj).dependencyRequest();
            case 2:
                lambda$dependencyEdges$4 = BindingGraph.lambda$dependencyEdges$4((BindingGraph.DependencyEdge) obj);
                return lambda$dependencyEdges$4;
            default:
                lambda$nodesByClass$10 = BindingGraph.lambda$nodesByClass$10((BindingGraph.Node) obj);
                return lambda$nodesByClass$10;
        }
    }
}
