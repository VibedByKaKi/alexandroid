package dagger.internal.codegen.binding;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import dagger.spi.model.BindingKind;
import dagger.spi.model.ComponentPath;
import dagger.spi.model.DaggerElement;
import dagger.spi.model.DaggerTypeElement;
import dagger.spi.model.DependencyRequest;
import dagger.spi.model.Key;
import dagger.spi.model.Scope;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class BindingNode implements dagger.spi.model.Binding {
    private BindingDeclarationFormatter bindingDeclarationFormatter;

    public static BindingNode create(ComponentPath componentPath, Binding binding, ImmutableSet<MultibindingDeclaration> immutableSet, ImmutableSet<OptionalBindingDeclaration> immutableSet2, ImmutableSet<SubcomponentDeclaration> immutableSet3, BindingDeclarationFormatter bindingDeclarationFormatter) {
        AutoValue_BindingNode autoValue_BindingNode = new AutoValue_BindingNode(componentPath, binding, immutableSet, immutableSet2, immutableSet3);
        ((BindingNode) autoValue_BindingNode).bindingDeclarationFormatter = (BindingDeclarationFormatter) Preconditions.checkNotNull(bindingDeclarationFormatter);
        return autoValue_BindingNode;
    }

    public final Iterable<BindingDeclaration> associatedDeclarations() {
        return Iterables.concat(multibindingDeclarations(), optionalBindingDeclarations(), subcomponentDeclarations());
    }

    @Override // dagger.spi.model.Binding
    public Optional<DaggerElement> bindingElement() {
        return delegate().bindingElement().map(new KeyFactory$$ExternalSyntheticLambda0(3));
    }

    @Override // dagger.spi.model.Binding
    public Optional<DaggerTypeElement> contributingModule() {
        return delegate().contributingModule().map(new BindingGraph$$ExternalSyntheticLambda1(27));
    }

    public abstract Binding delegate();

    @Override // dagger.spi.model.Binding
    public ImmutableSet<DependencyRequest> dependencies() {
        return delegate().dependencies();
    }

    @Override // dagger.spi.model.Binding
    public boolean isNullable() {
        return delegate().isNullable();
    }

    @Override // dagger.spi.model.Binding
    public boolean isProduction() {
        return delegate().bindingType().equals(BindingType.PRODUCTION);
    }

    @Override // dagger.spi.model.BindingGraph.MaybeBinding
    public Key key() {
        return delegate().key();
    }

    @Override // dagger.spi.model.Binding
    public BindingKind kind() {
        return delegate().kind();
    }

    public abstract ImmutableSet<MultibindingDeclaration> multibindingDeclarations();

    public abstract ImmutableSet<OptionalBindingDeclaration> optionalBindingDeclarations();

    @Override // dagger.spi.model.Binding
    public boolean requiresModuleInstance() {
        return delegate().requiresModuleInstance();
    }

    @Override // dagger.spi.model.Binding
    public Optional<Scope> scope() {
        return delegate().scope();
    }

    public abstract ImmutableSet<SubcomponentDeclaration> subcomponentDeclarations();

    public final String toString() {
        return this.bindingDeclarationFormatter.format((BindingDeclaration) delegate());
    }
}
