package dagger.model;

import com.google.common.base.Equivalence;
import dagger.model.Key;
import java.util.Optional;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeMirror;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: dagger.model.$AutoValue_Key, reason: invalid class name */
/* loaded from: classes9.dex */
abstract class C$AutoValue_Key extends Key {
    private final Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier;
    private final Optional<Equivalence.Wrapper<AnnotationMirror>> wrappedQualifier;
    private final Equivalence.Wrapper<TypeMirror> wrappedType;

    public C$AutoValue_Key(Optional<Equivalence.Wrapper<AnnotationMirror>> optional, Equivalence.Wrapper<TypeMirror> wrapper, Optional<Key.MultibindingContributionIdentifier> optional2) {
        if (optional == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null wrappedQualifier");
            throw null;
        }
        this.wrappedQualifier = optional;
        if (wrapper == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null wrappedType");
            throw null;
        }
        this.wrappedType = wrapper;
        if (optional2 != null) {
            this.multibindingContributionIdentifier = optional2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null multibindingContributionIdentifier");
            throw null;
        }
    }

    @Override // dagger.model.Key
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Key) {
            Key key = (Key) obj;
            if (this.wrappedQualifier.equals(key.wrappedQualifier()) && this.wrappedType.equals(key.wrappedType()) && this.multibindingContributionIdentifier.equals(key.multibindingContributionIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // dagger.model.Key
    public int hashCode() {
        return this.multibindingContributionIdentifier.hashCode() ^ ((((this.wrappedQualifier.hashCode() ^ 1000003) * 1000003) ^ this.wrappedType.hashCode()) * 1000003);
    }

    @Override // dagger.model.Key
    public Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier() {
        return this.multibindingContributionIdentifier;
    }

    @Override // dagger.model.Key
    public Key.Builder toBuilder() {
        return new Builder(this);
    }

    @Override // dagger.model.Key
    public Optional<Equivalence.Wrapper<AnnotationMirror>> wrappedQualifier() {
        return this.wrappedQualifier;
    }

    @Override // dagger.model.Key
    public Equivalence.Wrapper<TypeMirror> wrappedType() {
        return this.wrappedType;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.model.$AutoValue_Key$Builder */
    public static class Builder extends Key.Builder {
        private Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier;
        private Optional<Equivalence.Wrapper<AnnotationMirror>> wrappedQualifier;
        private Equivalence.Wrapper<TypeMirror> wrappedType;

        private Builder(Key key) {
            this.wrappedQualifier = Optional.empty();
            this.multibindingContributionIdentifier = Optional.empty();
            this.wrappedQualifier = key.wrappedQualifier();
            this.wrappedType = key.wrappedType();
            this.multibindingContributionIdentifier = key.multibindingContributionIdentifier();
        }

        @Override // dagger.model.Key.Builder
        public Key build() {
            Equivalence.Wrapper<TypeMirror> wrapper = this.wrappedType;
            if (wrapper != null) {
                return new AutoValue_Key(this.wrappedQualifier, wrapper, this.multibindingContributionIdentifier);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: wrappedType");
            return null;
        }

        @Override // dagger.model.Key.Builder
        public Key.Builder multibindingContributionIdentifier(Optional<Key.MultibindingContributionIdentifier> optional) {
            if (optional != null) {
                this.multibindingContributionIdentifier = optional;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null multibindingContributionIdentifier");
            return null;
        }

        @Override // dagger.model.Key.Builder
        public Key.Builder wrappedQualifier(Optional<Equivalence.Wrapper<AnnotationMirror>> optional) {
            if (optional != null) {
                this.wrappedQualifier = optional;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null wrappedQualifier");
            return null;
        }

        @Override // dagger.model.Key.Builder
        public Key.Builder wrappedType(Equivalence.Wrapper<TypeMirror> wrapper) {
            if (wrapper != null) {
                this.wrappedType = wrapper;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null wrappedType");
            return null;
        }

        @Override // dagger.model.Key.Builder
        public Key.Builder multibindingContributionIdentifier(Key.MultibindingContributionIdentifier multibindingContributionIdentifier) {
            this.multibindingContributionIdentifier = Optional.of(multibindingContributionIdentifier);
            return this;
        }

        @Override // dagger.model.Key.Builder
        public Key.Builder wrappedQualifier(Equivalence.Wrapper<AnnotationMirror> wrapper) {
            this.wrappedQualifier = Optional.of(wrapper);
            return this;
        }

        public Builder() {
            this.wrappedQualifier = Optional.empty();
            this.multibindingContributionIdentifier = Optional.empty();
        }
    }
}
