package dagger.spi.model;

import com.google.common.base.Equivalence;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_DaggerAnnotation extends DaggerAnnotation {
    private final Equivalence.Wrapper<XAnnotation> equivalenceWrapper;

    public AutoValue_DaggerAnnotation(Equivalence.Wrapper<XAnnotation> wrapper) {
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
        if (obj instanceof DaggerAnnotation) {
            return this.equivalenceWrapper.equals(((DaggerAnnotation) obj).equivalenceWrapper());
        }
        return false;
    }

    @Override // dagger.spi.model.DaggerAnnotation
    public Equivalence.Wrapper<XAnnotation> equivalenceWrapper() {
        return this.equivalenceWrapper;
    }

    public int hashCode() {
        return this.equivalenceWrapper.hashCode() ^ 1000003;
    }
}
