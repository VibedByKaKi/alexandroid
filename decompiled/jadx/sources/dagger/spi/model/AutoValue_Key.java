package dagger.spi.model;

import com.google.errorprone.annotations.concurrent.LazyInit;
import dagger.spi.model.Key;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_Key extends C$AutoValue_Key {

    @LazyInit
    private volatile transient int hashCode;

    @LazyInit
    private volatile transient boolean hashCode$Memoized;

    public AutoValue_Key(Optional<DaggerAnnotation> optional, DaggerType daggerType, Optional<Key.MultibindingContributionIdentifier> optional2) {
        super(optional, daggerType, optional2);
    }

    @Override // dagger.spi.model.C$AutoValue_Key, dagger.spi.model.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_Key) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // dagger.spi.model.C$AutoValue_Key, dagger.spi.model.Key
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
