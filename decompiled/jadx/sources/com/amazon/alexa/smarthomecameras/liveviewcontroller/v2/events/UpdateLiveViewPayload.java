package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.LvcTimestamp;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums.UpdateLiveViewType;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UpdateLiveViewPayload implements Serializable {

    @SerializedName("deviceRequestStartTime")
    private final String deviceRequestStartTime;

    @NonNull
    @SerializedName("requestId")
    private final String requestId;

    @NonNull
    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private final String sessionId;

    @SerializedName("targets")
    private final List<String> targets;

    @NonNull
    @SerializedName("updateType")
    private final UpdateLiveViewType updateType;

    public UpdateLiveViewPayload(@NonNull String str, @NonNull String str2, @NonNull UpdateLiveViewType updateLiveViewType, @Nullable List<String> list, @Nullable String str3) {
        this.sessionId = str;
        this.requestId = str2;
        this.updateType = updateLiveViewType;
        this.targets = list;
        this.deviceRequestStartTime = str3;
    }

    @Nullable
    public String getDeviceRequestStartTime() {
        return this.deviceRequestStartTime;
    }

    @NonNull
    public String getRequestId() {
        return this.requestId;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    public List<String> getTargets() {
        return this.targets;
    }

    @NonNull
    public UpdateLiveViewType getUpdateType() {
        return this.updateType;
    }

    public UpdateLiveViewPayload(@NonNull String str, @NonNull String str2, @NonNull UpdateLiveViewType updateLiveViewType, @Nullable List<String> list) {
        this(str, str2, updateLiveViewType, list, LvcTimestamp.now());
    }

    public UpdateLiveViewPayload(@NonNull String str, @NonNull String str2, @NonNull UpdateLiveViewType updateLiveViewType) {
        this(str, str2, updateLiveViewType, null);
    }
}
