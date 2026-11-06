package dagger.spi.model;

import dagger.spi.model.Key;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_Key_MultibindingContributionIdentifier extends Key.MultibindingContributionIdentifier {
    private final String bindingMethod;
    private final String contributingModule;

    public AutoValue_Key_MultibindingContributionIdentifier(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null contributingModule");
            throw null;
        }
        this.contributingModule = str;
        if (str2 != null) {
            this.bindingMethod = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null bindingMethod");
            throw null;
        }
    }

    @Override // dagger.spi.model.Key.MultibindingContributionIdentifier
    public String bindingMethod() {
        return this.bindingMethod;
    }

    @Override // dagger.spi.model.Key.MultibindingContributionIdentifier
    public String contributingModule() {
        return this.contributingModule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Key.MultibindingContributionIdentifier) {
            Key.MultibindingContributionIdentifier multibindingContributionIdentifier = (Key.MultibindingContributionIdentifier) obj;
            if (this.contributingModule.equals(multibindingContributionIdentifier.contributingModule()) && this.bindingMethod.equals(multibindingContributionIdentifier.bindingMethod())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.bindingMethod.hashCode() ^ ((this.contributingModule.hashCode() ^ 1000003) * 1000003);
    }
}
