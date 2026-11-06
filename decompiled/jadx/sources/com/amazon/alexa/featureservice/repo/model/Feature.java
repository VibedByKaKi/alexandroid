package com.amazon.alexa.featureservice.repo.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Feature {
    private String allocationId;
    private boolean deprecated;
    private String featureName;
    private String treatment;

    @SerializedName(FeatureConstants.Network.SHOULD_RECORD_TRIGGER)
    private boolean triggerOnUse;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Feature)) {
            Feature feature = (Feature) obj;
            if (this.featureName.equals(feature.featureName) && this.treatment.equals(feature.treatment) && this.triggerOnUse == feature.triggerOnUse && this.allocationId.equals(feature.allocationId) && this.deprecated == feature.deprecated) {
                return true;
            }
        }
        return false;
    }

    public String getAllocationId() {
        return this.allocationId;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isTriggerOnUse() {
        return this.triggerOnUse;
    }

    public void setAllocationId(String str) {
        this.allocationId = str;
    }

    public void setDeprecated(boolean z) {
        this.deprecated = z;
    }

    public void setFeatureName(String str) {
        this.featureName = str;
    }

    public void setTreatment(String str) {
        this.treatment = str;
    }

    public void setTriggerOnUse(boolean z) {
        this.triggerOnUse = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Feature{featureName='");
        sb.append(this.featureName);
        sb.append("', treatment='");
        sb.append(this.treatment);
        sb.append("', triggerOnUse=");
        sb.append(this.triggerOnUse);
        sb.append(", allocationId='");
        sb.append(this.allocationId);
        sb.append("', deprecated=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.deprecated, AbstractJsonLexerKt.END_OBJ);
    }
}
