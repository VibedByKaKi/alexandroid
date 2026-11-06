package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FirstFrameLatencyMetadata implements Serializable {

    @NonNull
    @SerializedName("firstFrameRenderedTime")
    private final String firstFrameRenderedTime;

    @NonNull
    @SerializedName("startLiveViewReceivedTime")
    private final String startLiveViewReceivedTime;

    public FirstFrameLatencyMetadata(@NonNull String str, @NonNull String str2) {
        this.startLiveViewReceivedTime = str;
        this.firstFrameRenderedTime = str2;
    }

    @NonNull
    public String getFirstFrameRenderedTime() {
        return this.firstFrameRenderedTime;
    }

    @NonNull
    public String getStartLiveViewReceivedTime() {
        return this.startLiveViewReceivedTime;
    }
}
