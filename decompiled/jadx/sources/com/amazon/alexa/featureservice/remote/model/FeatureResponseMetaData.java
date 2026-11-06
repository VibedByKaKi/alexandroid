package com.amazon.alexa.featureservice.remote.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureResponseMetaData {

    @Nullable
    @SerializedName(FeatureConstants.Network.ALLOCATION_ID)
    private String allocationId;

    @NonNull
    @SerializedName("name")
    private String featureName;

    @Nullable
    @SerializedName("namespace")
    private String namespace;

    @NonNull
    @SerializedName(FeatureConstants.Network.TREATMENT)
    private String treatment;

    @SerializedName(FeatureConstants.Network.TRIGGER_ON_USE)
    private boolean triggerOnUse;

    @Nullable
    public String getAllocationId() {
        return this.allocationId;
    }

    @NonNull
    public String getFeatureName() {
        return this.featureName;
    }

    @Nullable
    public String getNamespace() {
        return this.namespace;
    }

    @NonNull
    public String getTreatment() {
        return this.treatment;
    }

    @NonNull
    public boolean isTriggerOnUse() {
        return this.triggerOnUse;
    }

    public void setAllocationId(@Nullable String str) {
        this.allocationId = str;
    }

    public void setFeatureName(@NonNull String str) {
        this.featureName = str;
    }

    public void setNamespace(@Nullable String str) {
        this.namespace = str;
    }

    public void setTreatment(@NonNull String str) {
        this.treatment = str;
    }

    public void setTriggerOnUse(boolean z) {
        this.triggerOnUse = z;
    }
}
