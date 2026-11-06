package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.common.base.Joiner;
import com.imagepicker.Options$$ExternalSyntheticLambda0;
import dagger.internal.codegen.xprocessing.XElements;
import dagger.spi.model.C$AutoValue_Key;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class Key {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Key build();

        public final Builder multibindingContributionIdentifier(DaggerTypeElement daggerTypeElement, DaggerExecutableElement daggerExecutableElement) {
            return multibindingContributionIdentifier(Optional.of(MultibindingContributionIdentifier.create(daggerTypeElement, daggerExecutableElement)));
        }

        public abstract Builder multibindingContributionIdentifier(Optional<MultibindingContributionIdentifier> optional);

        public abstract Builder qualifier(DaggerAnnotation daggerAnnotation);

        public abstract Builder qualifier(Optional<DaggerAnnotation> optional);

        public abstract Builder type(DaggerType daggerType);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MultibindingContributionIdentifier {
        /* JADX INFO: Access modifiers changed from: private */
        public static MultibindingContributionIdentifier create(DaggerTypeElement daggerTypeElement, DaggerExecutableElement daggerExecutableElement) {
            return new AutoValue_Key_MultibindingContributionIdentifier(daggerTypeElement.xprocessing().getQualifiedName(), XElements.getSimpleName(daggerExecutableElement.xprocessing()));
        }

        public abstract String bindingMethod();

        public abstract String contributingModule();

        public String toString() {
            return a$$ExternalSyntheticOutline0.m$1(contributingModule(), "#", bindingMethod());
        }
    }

    public static Builder builder(DaggerType daggerType) {
        return new C$AutoValue_Key.Builder().type(daggerType);
    }

    public abstract boolean equals(Object obj);

    @Memoized
    public abstract int hashCode();

    public abstract Optional<MultibindingContributionIdentifier> multibindingContributionIdentifier();

    public abstract Optional<DaggerAnnotation> qualifier();

    public abstract Builder toBuilder();

    public final String toString() {
        return Joiner.on(' ').skipNulls().join(qualifier().map(new Options$$ExternalSyntheticLambda0(23)).map(new Key$$ExternalSyntheticLambda0(0)).orElse(null), type(), multibindingContributionIdentifier().orElse(null));
    }

    public abstract DaggerType type();

    public Key withMultibindingContributionIdentifier(DaggerTypeElement daggerTypeElement, DaggerExecutableElement daggerExecutableElement) {
        return toBuilder().multibindingContributionIdentifier(daggerTypeElement, daggerExecutableElement).build();
    }

    public Key withType(DaggerType daggerType) {
        return toBuilder().type(daggerType).build();
    }

    public Key withoutMultibindingContributionIdentifier() {
        return toBuilder().multibindingContributionIdentifier(Optional.empty()).build();
    }
}
