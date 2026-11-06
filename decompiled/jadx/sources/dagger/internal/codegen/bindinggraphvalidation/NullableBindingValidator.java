package dagger.internal.codegen.bindinggraphvalidation;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import dagger.internal.codegen.compileroption.CompilerOptions;
import dagger.internal.codegen.extension.DaggerStreams;
import dagger.internal.codegen.validation.ValidationBindingGraphPlugin;
import dagger.spi.model.Binding;
import dagger.spi.model.BindingGraph;
import dagger.spi.model.DiagnosticReporter;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class NullableBindingValidator extends ValidationBindingGraphPlugin {
    private final CompilerOptions compilerOptions;

    @Inject
    public NullableBindingValidator(CompilerOptions compilerOptions) {
        this.compilerOptions = compilerOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$nonNullableDependencies$1(BindingGraph.DependencyEdge dependencyEdge) {
        return !dependencyEdge.dependencyRequest().isNullable();
    }

    private ImmutableSet<BindingGraph.DependencyEdge> nonNullableDependencies(BindingGraph bindingGraph, Binding binding) {
        return (ImmutableSet) bindingGraph.network().inEdges(binding).stream().flatMap(DaggerStreams.instancesOf(BindingGraph.DependencyEdge.class)).filter(new InjectBindingValidator$$ExternalSyntheticLambda0(9)).collect(DaggerStreams.toImmutableSet());
    }

    private ImmutableList<Binding> nullableBindings(BindingGraph bindingGraph) {
        return (ImmutableList) bindingGraph.bindings().stream().filter(new InjectBindingValidator$$ExternalSyntheticLambda0(10)).collect(DaggerStreams.toImmutableList());
    }

    @VisibleForTesting
    public static String nullableToNonNullable(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m$1(str, " is not nullable, but is being provided by ", str2);
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public String pluginName() {
        return "Dagger/Nullable";
    }

    @Override // dagger.spi.model.BindingGraphPlugin
    public void visitGraph(BindingGraph bindingGraph, DiagnosticReporter diagnosticReporter) {
        UnmodifiableIterator<Binding> it2 = nullableBindings(bindingGraph).iterator();
        while (it2.hasNext()) {
            Binding next = it2.next();
            UnmodifiableIterator<BindingGraph.DependencyEdge> it3 = nonNullableDependencies(bindingGraph, next).iterator();
            while (it3.hasNext()) {
                diagnosticReporter.reportDependency(this.compilerOptions.nullableValidationKind(), it3.next(), nullableToNonNullable(next.key().toString(), next.toString()));
            }
        }
    }
}
