package com.amazon.alexa.smarthomecameras.model;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewPayload implements Serializable {

    @SerializedName("description")
    private String description;

    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private String sessionId;

    @SerializedName("status")
    private StopLiveViewStatus status;

    @NonNull
    @SerializedName("target")
    private LiveViewTarget target;

    public LiveViewPayload(String str, LiveViewTarget liveViewTarget, StopLiveViewStatus stopLiveViewStatus, String str2) {
        this.sessionId = str;
        this.target = liveViewTarget;
        this.status = stopLiveViewStatus;
        this.description = str2;
    }

    @VisibleForTesting
    public String getDescription() {
        return this.description;
    }

    @VisibleForTesting
    public String getSessionId() {
        return this.sessionId;
    }

    @VisibleForTesting
    public StopLiveViewStatus getStatus() {
        return this.status;
    }

    @VisibleForTesting
    public LiveViewTarget getTarget() {
        return this.target;
    }

    public LiveViewPayload(String str, LiveViewTarget liveViewTarget) {
        this.sessionId = str;
        this.target = liveViewTarget;
    }

    public LiveViewPayload(LiveViewTarget liveViewTarget) {
        this.target = liveViewTarget;
    }
}
