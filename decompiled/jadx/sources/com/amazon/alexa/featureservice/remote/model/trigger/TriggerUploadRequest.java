package com.amazon.alexa.featureservice.remote.model.trigger;

import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TriggerUploadRequest {

    @SerializedName(FeatureConstants.Network.TREATMENTS)
    private List<TriggerData> treatments;

    public List<TriggerData> getTreatments() {
        return this.treatments;
    }

    public void setTreatments(List<TriggerData> list) {
        this.treatments = list;
    }
}
