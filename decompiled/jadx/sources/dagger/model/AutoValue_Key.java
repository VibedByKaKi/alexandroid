package dagger.model;

import com.google.common.base.Equivalence;
import com.google.errorprone.annotations.concurrent.LazyInit;
import dagger.model.Key;
import java.util.Optional;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_Key extends C$AutoValue_Key {

    @LazyInit
    private volatile transient int hashCode;

    @LazyInit
    private volatile transient boolean hashCode$Memoized;

    public AutoValue_Key(Optional<Equivalence.Wrapper<AnnotationMirror>> optional, Equivalence.Wrapper<TypeMirror> wrapper, Optional<Key.MultibindingContributionIdentifier> optional2) {
        super(optional, wrapper, optional2);
    }

    @Override // dagger.model.C$AutoValue_Key, dagger.model.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_Key) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // dagger.model.C$AutoValue_Key, dagger.model.Key
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
