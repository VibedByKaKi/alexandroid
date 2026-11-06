package dagger.internal.codegen.bindinggraphvalidation;

import com.google.common.base.Joiner;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import dagger.internal.codegen.validation.ValidationBindingGraphPlugin;
import dagger.spi.model.Binding;
import dagger.spi.model.BindingGraph;
import dagger.spi.model.BindingKind;
import dagger.spi.model.DependencyRequest;
import dagger.spi.model.DiagnosticReporter;
import dagger.spi.model.Key;
import java.util.Collection;
import javax.inject.Inject;
import javax.tools.Diagnostic;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class SetMultibindingValidator extends ValidationBindingGraphPlugin {
    @Inject
    public SetMultibindingValidator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkForDuplicateSetContributions, reason: merged with bridge method [inline-methods] */
    public void lambda$visitGraph$1(Binding binding, BindingGraph bindingGraph, DiagnosticReporter diagnosticReporter) {
        HashMultimap create = HashMultimap.create();
        UnmodifiableIterator<Binding> it2 = bindingGraph.requestedBindings(binding).iterator();
        while (it2.hasNext()) {
            Binding next = it2.next();
            if (next.kind().equals(BindingKind.DELEGATE)) {
                create.put(dereferenceDelegateBinding(next, bindingGraph), next);
            }
        }
        create.asMap().forEach(new SetMultibindingValidator$$ExternalSyntheticLambda2(binding, bindingGraph, diagnosticReporter));
    }

    private Key dereferenceDelegateBinding(Binding binding, BindingGraph bindingGraph) {
        ImmutableSet<Binding> requestedBindings = bindingGraph.requestedBindings(binding);
        if (requestedBindings.isEmpty()) {
            return ((DependencyRequest) Iterables.getOnlyElement(binding.dependencies())).key();
        }
        Binding binding2 = (Binding) Iterables.getOnlyElement(requestedBindings);
        return binding2.kind().equals(BindingKind.DELEGATE) ? dereferenceDelegateBinding(binding2, bindingGraph) : binding2.key();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkForDuplicateSetContributions$2(DiagnosticReporter diagnosticReporter, BindingGraph bindingGraph, Binding binding, Key key, Collection collection) {
        if (collection.size() > 1) {
            diagnosticReporter.reportComponent(Diagnostic.Kind.ERROR, bindingGraph.componentNode(binding.componentPath()).get(), "Multiple set contributions into %s for the same contribution key: %s.\n\n    %s\n", binding.key(), key, Joiner.on("\n    ").join(collection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$visitGraph$0(Binding binding) {
        return binding.kind().equals(BindingKind.MULTIBOUND_SET);
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public String pluginName() {
        return "Dagger/SetMultibinding";
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public void visitGraph(BindingGraph bindingGraph, DiagnosticReporter diagnosticReporter) {
        bindingGraph.bindings().stream().filter(new InjectBindingValidator$$ExternalSyntheticLambda0(12)).forEach(new DependencyCycleValidator$$ExternalSyntheticLambda2(this, bindingGraph, diagnosticReporter, 6));
    }
}
