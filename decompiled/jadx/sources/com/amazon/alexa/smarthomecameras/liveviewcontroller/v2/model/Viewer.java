package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.ConnectionState;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Viewer implements Serializable {

    @NonNull
    @SerializedName("endpointId")
    private final String endpointId;

    @NonNull
    @SerializedName("hasCameraControl")
    private final boolean hasCameraControl;

    @NonNull
    @SerializedName("name")
    private final String name;

    @SerializedName("state")
    private final ConnectionState state;

    public Viewer(String str, String str2, boolean z, ConnectionState connectionState) {
        this.endpointId = str;
        this.name = str2;
        this.hasCameraControl = z;
        this.state = connectionState;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public String getName() {
        return this.name;
    }

    public ConnectionState getState() {
        return this.state;
    }

    public boolean isHasCameraControl() {
        return this.hasCameraControl;
    }
}
