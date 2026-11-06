package dagger.model;

import com.google.common.collect.ImmutableList;
import javax.lang.model.element.TypeElement;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: dagger.model.$AutoValue_ComponentPath, reason: invalid class name */
/* loaded from: classes9.dex */
abstract class C$AutoValue_ComponentPath extends ComponentPath {
    private final ImmutableList<TypeElement> components;

    public C$AutoValue_ComponentPath(ImmutableList<TypeElement> immutableList) {
        if (immutableList != null) {
            this.components = immutableList;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null components");
            throw null;
        }
    }

    @Override // dagger.model.ComponentPath
    public ImmutableList<TypeElement> components() {
        return this.components;
    }

    @Override // dagger.model.ComponentPath
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComponentPath) {
            return this.components.equals(((ComponentPath) obj).components());
        }
        return false;
    }

    @Override // dagger.model.ComponentPath
    public int hashCode() {
        return this.components.hashCode() ^ 1000003;
    }
}
