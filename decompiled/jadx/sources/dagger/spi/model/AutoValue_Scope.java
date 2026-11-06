package dagger.spi.model;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_Scope extends Scope {
    private final DaggerAnnotation scopeAnnotation;

    public AutoValue_Scope(DaggerAnnotation daggerAnnotation) {
        if (daggerAnnotation != null) {
            this.scopeAnnotation = daggerAnnotation;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null scopeAnnotation");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.scopeAnnotation.equals(((Scope) obj).scopeAnnotation());
        }
        return false;
    }

    public int hashCode() {
        return this.scopeAnnotation.hashCode() ^ 1000003;
    }

    @Override // dagger.spi.model.Scope
    public DaggerAnnotation scopeAnnotation() {
        return this.scopeAnnotation;
    }
}
