package dagger.internal.codegen.bindinggraphvalidation;

import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import dagger.internal.codegen.base.RequestKinds;
import dagger.internal.codegen.extension.DaggerStreams;
import dagger.internal.codegen.validation.ValidationBindingGraphPlugin;
import dagger.spi.model.Binding;
import dagger.spi.model.BindingGraph;
import dagger.spi.model.DiagnosticReporter;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.tools.Diagnostic;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ProvisionDependencyOnProducerBindingValidator extends ValidationBindingGraphPlugin {
    @Inject
    public ProvisionDependencyOnProducerBindingValidator() {
    }

    private Binding bindingRequestingDependency(BindingGraph.DependencyEdge dependencyEdge, BindingGraph bindingGraph) {
        Preconditions.checkArgument(!dependencyEdge.isEntryPoint());
        BindingGraph.Node node = (BindingGraph.Node) bindingGraph.network().incidentNodes(dependencyEdge).source();
        Verify.verify(node instanceof Binding, "expected source of %s to be a binding, but was: %s", dependencyEdge, node);
        return (Binding) node;
    }

    private boolean dependencyCanUseProduction(BindingGraph.DependencyEdge dependencyEdge, BindingGraph bindingGraph) {
        return dependencyEdge.isEntryPoint() ? RequestKinds.canBeSatisfiedByProductionBinding(dependencyEdge.dependencyRequest().kind()) : bindingRequestingDependency(dependencyEdge, bindingGraph).isProduction();
    }

    private String dependencyErrorMessage(BindingGraph.DependencyEdge dependencyEdge, BindingGraph bindingGraph) {
        return String.format("%s is a provision, which cannot depend on a production.", bindingRequestingDependency(dependencyEdge, bindingGraph).key());
    }

    private String entryPointErrorMessage(BindingGraph.DependencyEdge dependencyEdge) {
        return String.format("%s is a provision entry-point, which cannot depend on a production.", dependencyEdge.dependencyRequest().key());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: incomingDependencies, reason: merged with bridge method [inline-methods] */
    public Stream<BindingGraph.DependencyEdge> lambda$provisionDependenciesOnProductionBindings$2(Binding binding, BindingGraph bindingGraph) {
        return bindingGraph.network().inEdges(binding).stream().flatMap(DaggerStreams.instancesOf(BindingGraph.DependencyEdge.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$provisionDependenciesOnProductionBindings$3(BindingGraph bindingGraph, BindingGraph.DependencyEdge dependencyEdge) {
        return !dependencyCanUseProduction(dependencyEdge, bindingGraph);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$visitGraph$0(DiagnosticReporter diagnosticReporter, BindingGraph bindingGraph, BindingGraph.DependencyEdge dependencyEdge) {
        diagnosticReporter.reportDependency(Diagnostic.Kind.ERROR, dependencyEdge, dependencyEdge.isEntryPoint() ? entryPointErrorMessage(dependencyEdge) : dependencyErrorMessage(dependencyEdge, bindingGraph));
    }

    private Stream<BindingGraph.DependencyEdge> provisionDependenciesOnProductionBindings(BindingGraph bindingGraph) {
        int i = 1;
        return bindingGraph.bindings().stream().filter(new InjectBindingValidator$$ExternalSyntheticLambda0(11)).flatMap(new DependencyCycleValidator$$ExternalSyntheticLambda4(this, bindingGraph, i)).filter(new MissingBindingValidator$$ExternalSyntheticLambda1(this, bindingGraph, i));
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public String pluginName() {
        return "Dagger/ProviderDependsOnProducer";
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public void visitGraph(BindingGraph bindingGraph, DiagnosticReporter diagnosticReporter) {
        provisionDependenciesOnProductionBindings(bindingGraph).forEach(new DependencyCycleValidator$$ExternalSyntheticLambda2(this, diagnosticReporter, bindingGraph, 5));
    }
}
