package dagger.spi;

import com.google.errorprone.annotations.FormatMethod;
import dagger.model.BindingGraph;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface DiagnosticReporter {
    void reportBinding(Diagnostic.Kind kind, BindingGraph.MaybeBinding maybeBinding, String str);

    @FormatMethod
    void reportBinding(Diagnostic.Kind kind, BindingGraph.MaybeBinding maybeBinding, String str, Object obj, Object... objArr);

    void reportComponent(Diagnostic.Kind kind, BindingGraph.ComponentNode componentNode, String str);

    @FormatMethod
    void reportComponent(Diagnostic.Kind kind, BindingGraph.ComponentNode componentNode, String str, Object obj, Object... objArr);

    void reportDependency(Diagnostic.Kind kind, BindingGraph.DependencyEdge dependencyEdge, String str);

    @FormatMethod
    void reportDependency(Diagnostic.Kind kind, BindingGraph.DependencyEdge dependencyEdge, String str, Object obj, Object... objArr);

    void reportSubcomponentFactoryMethod(Diagnostic.Kind kind, BindingGraph.ChildFactoryMethodEdge childFactoryMethodEdge, String str);

    @FormatMethod
    void reportSubcomponentFactoryMethod(Diagnostic.Kind kind, BindingGraph.ChildFactoryMethodEdge childFactoryMethodEdge, String str, Object obj, Object... objArr);
}
