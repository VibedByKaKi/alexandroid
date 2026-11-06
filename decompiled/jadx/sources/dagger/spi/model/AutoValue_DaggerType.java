package dagger.spi.model;

import com.google.common.base.Equivalence;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_DaggerType extends DaggerType {
    private final Equivalence.Wrapper<XType> equivalenceWrapper;

    public AutoValue_DaggerType(Equivalence.Wrapper<XType> wrapper) {
        if (wrapper != null) {
            this.equivalenceWrapper = wrapper;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null equivalenceWrapper");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DaggerType) {
            return this.equivalenceWrapper.equals(((DaggerType) obj).equivalenceWrapper());
        }
        return false;
    }

    @Override // dagger.spi.model.DaggerType
    public Equivalence.Wrapper<XType> equivalenceWrapper() {
        return this.equivalenceWrapper;
    }

    public int hashCode() {
        return this.equivalenceWrapper.hashCode() ^ 1000003;
    }
}
