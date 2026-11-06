package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaLatencyMetadata implements Serializable {

    @SerializedName("alexaProcessingTimeOffset")
    private final Integer alexaProcessingTimeOffset;

    @SerializedName("deviceRequestStartTime")
    private final String deviceRequestStartTime;

    public AlexaLatencyMetadata(@Nullable String str, @Nullable Integer num) {
        this.deviceRequestStartTime = str;
        this.alexaProcessingTimeOffset = num;
    }

    @Nullable
    public Integer getAlexaProcessingTimeOffset() {
        return this.alexaProcessingTimeOffset;
    }

    @Nullable
    public String getDeviceRequestStartTime() {
        return this.deviceRequestStartTime;
    }
}
