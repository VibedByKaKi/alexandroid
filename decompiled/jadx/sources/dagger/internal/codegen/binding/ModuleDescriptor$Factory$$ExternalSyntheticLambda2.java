package dagger.internal.codegen.binding;

import com.google.common.graph.SuccessorsFunction;
import dagger.internal.codegen.binding.BindingGraph;
import dagger.internal.codegen.binding.ModuleDescriptor;
import dagger.spi.model.BindingGraph;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ModuleDescriptor$Factory$$ExternalSyntheticLambda2 implements SuccessorsFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ModuleDescriptor$Factory$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final Iterable successors(Object obj) {
        Iterable lambda$transitiveModules$6;
        Iterable lambda$stronglyConnectedNodes$4;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$transitiveModules$6 = ((ModuleDescriptor.Factory) obj2).lambda$transitiveModules$6((ModuleDescriptor) obj);
                return lambda$transitiveModules$6;
            default:
                lambda$stronglyConnectedNodes$4 = ((BindingGraph.TopLevelBindingGraph) obj2).lambda$stronglyConnectedNodes$4((BindingGraph.Node) obj);
                return lambda$stronglyConnectedNodes$4;
        }
    }
}
