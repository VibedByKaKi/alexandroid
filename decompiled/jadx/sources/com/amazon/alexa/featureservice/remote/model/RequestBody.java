package com.amazon.alexa.featureservice.remote.model;

import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RequestBody {

    @SerializedName(CamerasRouteParameter.FEATURES)
    private List<FeatureIdentifierData> features;

    public void setFeatures(List<FeatureIdentifierData> list) {
        this.features = list;
    }
}
