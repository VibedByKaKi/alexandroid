package dagger.model;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.concurrent.LazyInit;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_ComponentPath extends C$AutoValue_ComponentPath {

    @LazyInit
    private volatile transient TypeElement currentComponent;

    @LazyInit
    private volatile transient int hashCode;

    @LazyInit
    private volatile transient boolean hashCode$Memoized;

    public AutoValue_ComponentPath(ImmutableList<TypeElement> immutableList) {
        super(immutableList);
    }

    @Override // dagger.model.ComponentPath
    public TypeElement currentComponent() {
        if (this.currentComponent == null) {
            synchronized (this) {
                try {
                    if (this.currentComponent == null) {
                        this.currentComponent = super.currentComponent();
                        if (this.currentComponent == null) {
                            throw new NullPointerException("currentComponent() cannot return null");
                        }
                    }
                } finally {
                }
            }
        }
        return this.currentComponent;
    }

    @Override // dagger.model.C$AutoValue_ComponentPath, dagger.model.ComponentPath
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_ComponentPath) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // dagger.model.C$AutoValue_ComponentPath, dagger.model.ComponentPath
    public int hashCode() {
        if (!this.hashCode$Memoized) {
            synchronized (this) {
                try {
                    if (!this.hashCode$Memoized) {
                        this.hashCode = super.hashCode();
                        this.hashCode$Memoized = true;
                    }
                } finally {
                }
            }
        }
        return this.hashCode;
    }
}
