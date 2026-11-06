package com.amazon.alexa.featureservice.remote.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureIdentifierData {

    @NonNull
    @SerializedName("name")
    private String featureName;

    @Nullable
    @SerializedName("namespace")
    private String namespace;

    @NonNull
    public String getFeatureName() {
        return this.featureName;
    }

    @Nullable
    public String getNamespace() {
        return this.namespace;
    }

    public void setFeatureName(@NonNull String str) {
        this.featureName = str;
    }

    public void setNamespace(@Nullable String str) {
        this.namespace = str;
    }
}
