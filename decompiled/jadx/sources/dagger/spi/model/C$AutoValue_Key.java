package dagger.spi.model;

import dagger.spi.model.Key;
import java.util.Optional;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: dagger.spi.model.$AutoValue_Key, reason: invalid class name */
/* loaded from: classes9.dex */
abstract class C$AutoValue_Key extends Key {
    private final Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier;
    private final Optional<DaggerAnnotation> qualifier;
    private final DaggerType type;

    public C$AutoValue_Key(Optional<DaggerAnnotation> optional, DaggerType daggerType, Optional<Key.MultibindingContributionIdentifier> optional2) {
        if (optional == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null qualifier");
            throw null;
        }
        this.qualifier = optional;
        if (daggerType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            throw null;
        }
        this.type = daggerType;
        if (optional2 != null) {
            this.multibindingContributionIdentifier = optional2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null multibindingContributionIdentifier");
            throw null;
        }
    }

    @Override // dagger.spi.model.Key
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Key) {
            Key key = (Key) obj;
            if (this.qualifier.equals(key.qualifier()) && this.type.equals(key.type()) && this.multibindingContributionIdentifier.equals(key.multibindingContributionIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // dagger.spi.model.Key
    public int hashCode() {
        return this.multibindingContributionIdentifier.hashCode() ^ ((((this.qualifier.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003);
    }

    @Override // dagger.spi.model.Key
    public Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier() {
        return this.multibindingContributionIdentifier;
    }

    @Override // dagger.spi.model.Key
    public Optional<DaggerAnnotation> qualifier() {
        return this.qualifier;
    }

    @Override // dagger.spi.model.Key
    public Key.Builder toBuilder() {
        return new Builder(this);
    }

    @Override // dagger.spi.model.Key
    public DaggerType type() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.spi.model.$AutoValue_Key$Builder */
    public static class Builder extends Key.Builder {
        private Optional<Key.MultibindingContributionIdentifier> multibindingContributionIdentifier;
        private Optional<DaggerAnnotation> qualifier;
        private DaggerType type;

        private Builder(Key key) {
            this.qualifier = Optional.empty();
            this.multibindingContributionIdentifier = Optional.empty();
            this.qualifier = key.qualifier();
            this.type = key.type();
            this.multibindingContributionIdentifier = key.multibindingContributionIdentifier();
        }

        @Override // dagger.spi.model.Key.Builder
        public Key build() {
            DaggerType daggerType = this.type;
            if (daggerType != null) {
                return new AutoValue_Key(this.qualifier, daggerType, this.multibindingContributionIdentifier);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: type");
            return null;
        }

        @Override // dagger.spi.model.Key.Builder
        public Key.Builder multibindingContributionIdentifier(Optional<Key.MultibindingContributionIdentifier> optional) {
            if (optional != null) {
                this.multibindingContributionIdentifier = optional;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null multibindingContributionIdentifier");
            return null;
        }

        @Override // dagger.spi.model.Key.Builder
        public Key.Builder qualifier(Optional<DaggerAnnotation> optional) {
            if (optional != null) {
                this.qualifier = optional;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null qualifier");
            return null;
        }

        @Override // dagger.spi.model.Key.Builder
        public Key.Builder type(DaggerType daggerType) {
            if (daggerType != null) {
                this.type = daggerType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }

        @Override // dagger.spi.model.Key.Builder
        public Key.Builder qualifier(DaggerAnnotation daggerAnnotation) {
            this.qualifier = Optional.of(daggerAnnotation);
            return this;
        }

        public Builder() {
            this.qualifier = Optional.empty();
            this.multibindingContributionIdentifier = Optional.empty();
        }
    }
}
