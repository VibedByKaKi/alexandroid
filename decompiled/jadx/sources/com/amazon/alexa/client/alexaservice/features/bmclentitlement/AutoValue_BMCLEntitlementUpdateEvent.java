package com.amazon.alexa.client.alexaservice.features.bmclentitlement;

import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_BMCLEntitlementUpdateEvent extends BMCLEntitlementUpdateEvent {
    private final boolean BMCLEntitled;
    private final String entitledBenefit;
    private final List<String> premiumBenefitLabels;

    public AutoValue_BMCLEntitlementUpdateEvent(boolean z, @Nullable String str, @Nullable List<String> list) {
        this.BMCLEntitled = z;
        this.entitledBenefit = str;
        this.premiumBenefitLabels = list;
    }

    public boolean equals(Object obj) {
        String str;
        List<String> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BMCLEntitlementUpdateEvent) {
            BMCLEntitlementUpdateEvent bMCLEntitlementUpdateEvent = (BMCLEntitlementUpdateEvent) obj;
            if (this.BMCLEntitled == bMCLEntitlementUpdateEvent.isBMCLEntitled() && ((str = this.entitledBenefit) != null ? str.equals(bMCLEntitlementUpdateEvent.getEntitledBenefit()) : bMCLEntitlementUpdateEvent.getEntitledBenefit() == null) && ((list = this.premiumBenefitLabels) != null ? list.equals(bMCLEntitlementUpdateEvent.getPremiumBenefitLabels()) : bMCLEntitlementUpdateEvent.getPremiumBenefitLabels() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementUpdateEvent
    @Nullable
    public String getEntitledBenefit() {
        return this.entitledBenefit;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementUpdateEvent
    @Nullable
    public List<String> getPremiumBenefitLabels() {
        return this.premiumBenefitLabels;
    }

    public int hashCode() {
        int i = ((this.BMCLEntitled ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.entitledBenefit;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<String> list = this.premiumBenefitLabels;
        return hashCode ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementUpdateEvent
    public boolean isBMCLEntitled() {
        return this.BMCLEntitled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BMCLEntitlementUpdateEvent{BMCLEntitled=");
        sb.append(this.BMCLEntitled);
        sb.append(", entitledBenefit=");
        sb.append(this.entitledBenefit);
        sb.append(", premiumBenefitLabels=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.premiumBenefitLabels, sb);
    }
}
