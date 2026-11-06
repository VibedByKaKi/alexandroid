package com.amazon.alexa.featureservice.remote.model;

import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureServiceResponse {

    @SerializedName(FeatureConstants.Network.TREATMENTS)
    private List<FeatureResponseMetaData> featureMetaData;

    @Nullable
    public List<FeatureResponseMetaData> getFeatureMetaData() {
        return this.featureMetaData;
    }

    public void setFeatureMetaData(List<FeatureResponseMetaData> list) {
        this.featureMetaData = list;
    }

    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(new StringBuilder("FeatureServiceResponse{featureMetaData="), this.featureMetaData, AbstractJsonLexerKt.END_OBJ);
    }
}
