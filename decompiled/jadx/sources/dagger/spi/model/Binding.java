package dagger.spi.model;

import com.google.common.collect.ImmutableSet;
import dagger.spi.model.BindingGraph;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface Binding extends BindingGraph.MaybeBinding {
    @Override // dagger.spi.model.BindingGraph.MaybeBinding
    @Deprecated
    default Optional<Binding> binding() {
        return Optional.of(this);
    }

    Optional<DaggerElement> bindingElement();

    @Override // dagger.spi.model.BindingGraph.MaybeBinding, dagger.spi.model.BindingGraph.Node
    ComponentPath componentPath();

    Optional<DaggerTypeElement> contributingModule();

    ImmutableSet<DependencyRequest> dependencies();

    boolean isNullable();

    boolean isProduction();

    BindingKind kind();

    boolean requiresModuleInstance();

    Optional<Scope> scope();
}
