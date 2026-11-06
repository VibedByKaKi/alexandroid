package dagger.model;

import com.google.common.base.Equivalence;
import javax.lang.model.element.AnnotationMirror;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_Scope extends Scope {
    private final Equivalence.Wrapper<AnnotationMirror> wrappedScopeAnnotation;

    public AutoValue_Scope(Equivalence.Wrapper<AnnotationMirror> wrapper) {
        if (wrapper != null) {
            this.wrappedScopeAnnotation = wrapper;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null wrappedScopeAnnotation");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.wrappedScopeAnnotation.equals(((Scope) obj).wrappedScopeAnnotation());
        }
        return false;
    }

    public int hashCode() {
        return this.wrappedScopeAnnotation.hashCode() ^ 1000003;
    }

    @Override // dagger.model.Scope
    public Equivalence.Wrapper<AnnotationMirror> wrappedScopeAnnotation() {
        return this.wrappedScopeAnnotation;
    }
}
