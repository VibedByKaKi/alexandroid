package com.amazon.alexa.featureservice.database.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index({"deprecated"})})
/* loaded from: classes17.dex */
public class Feature {

    @ColumnInfo(name = "allocation_id")
    public String allocationId;

    @ColumnInfo(name = "deprecated")
    public boolean deprecated;

    @NonNull
    @PrimaryKey
    public String featureName;

    @ColumnInfo(name = "should_record_trigger")
    public boolean shouldRecordTrigger;

    @ColumnInfo(name = FeatureConstants.Network.TREATMENT)
    public String treatment;

    @Ignore
    public Feature(@NonNull String str, String str2, boolean z, String str3) {
        this.featureName = str;
        this.treatment = str2;
        this.shouldRecordTrigger = z;
        this.allocationId = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (this.featureName.equals(feature.featureName) && this.treatment.equals(feature.treatment) && this.shouldRecordTrigger && feature.shouldRecordTrigger && this.allocationId.equals(feature.allocationId) && this.deprecated == feature.deprecated) {
                return true;
            }
        }
        return false;
    }

    public String getAllocationId() {
        return this.allocationId;
    }

    @NonNull
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

    public boolean isShouldRecordTrigger() {
        return this.shouldRecordTrigger;
    }

    public void setAllocationId(String str) {
        this.allocationId = str;
    }

    public void setDeprecated(boolean z) {
        this.deprecated = z;
    }

    public void setFeatureName(@NonNull String str) {
        this.featureName = str;
    }

    public void setShouldRecordTrigger(boolean z) {
        this.shouldRecordTrigger = z;
    }

    public void setTreatment(String str) {
        this.treatment = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.featureName);
        sb.append(", ");
        sb.append(this.treatment);
        sb.append(", ");
        sb.append(this.shouldRecordTrigger);
        sb.append(", ");
        sb.append(this.allocationId);
        sb.append(", ");
        return a$$ExternalSyntheticOutline0.m(sb, this.deprecated, StringSubstitutor.DEFAULT_VAR_END);
    }

    public Feature() {
    }
}
