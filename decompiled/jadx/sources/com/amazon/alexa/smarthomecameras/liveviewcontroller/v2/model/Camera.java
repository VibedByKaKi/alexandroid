package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Camera implements Serializable {

    @NonNull
    @SerializedName("endpointId")
    private final String endpointId;

    @NonNull
    @SerializedName("make")
    private final String make;

    @SerializedName("model")
    private final String model;

    @NonNull
    @SerializedName("name")
    private final String name;

    public Camera(String str, String str2, String str3, String str4) {
        this.endpointId = str;
        this.name = str2;
        this.make = str3;
        this.model = str4;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }
}
