package com.amazon.alexa.smarthomecameras.model.camerpreferences;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BooleanFeature {

    @SerializedName("properties")
    BooleanProperty properties;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class BooleanProperty {

        @SerializedName("enabled")
        Map<String, Object> enabled;

        public BooleanProperty() {
        }
    }
}
