package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import dagger.internal.codegen.binding.KeyFactory$$ExternalSyntheticLambda2;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class ComponentPath {
    public static ComponentPath create(Iterable<DaggerTypeElement> iterable) {
        return new AutoValue_ComponentPath(ImmutableList.copyOf(iterable));
    }

    public final boolean atRoot() {
        return components().size() == 1;
    }

    public final ComponentPath childPath(DaggerTypeElement daggerTypeElement) {
        return create(ImmutableList.builder().addAll((Iterable) components()).add((ImmutableList.Builder) daggerTypeElement).build());
    }

    public abstract ImmutableList<DaggerTypeElement> components();

    @Memoized
    public DaggerTypeElement currentComponent() {
        return (DaggerTypeElement) Iterables.getLast(components());
    }

    public abstract boolean equals(Object obj);

    @Memoized
    public abstract int hashCode();

    public final ComponentPath parent() {
        Preconditions.checkState(!atRoot());
        return create(components().subList(0, components().size() - 1));
    }

    public final DaggerTypeElement parentComponent() {
        Preconditions.checkState(!atRoot());
        return components().reverse().get(1);
    }

    public final DaggerTypeElement rootComponent() {
        return components().get(0);
    }

    public final String toString() {
        return (String) components().stream().map(new KeyFactory$$ExternalSyntheticLambda2(6)).map(new KeyFactory$$ExternalSyntheticLambda2(7)).collect(Collectors.joining(" → "));
    }
}
