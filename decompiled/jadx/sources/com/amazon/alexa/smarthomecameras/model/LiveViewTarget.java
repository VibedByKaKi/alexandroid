package com.amazon.alexa.smarthomecameras.model;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewTarget implements Serializable {

    @NonNull
    @SerializedName("endpointId")
    private String endpointId;

    @NonNull
    @SerializedName("type")
    private String type;

    public LiveViewTarget(String str, String str2) {
        this.type = str;
        this.endpointId = str2;
    }

    @VisibleForTesting
    public String getEndpointId() {
        return this.endpointId;
    }

    @VisibleForTesting
    public String getType() {
        return this.type;
    }
}
