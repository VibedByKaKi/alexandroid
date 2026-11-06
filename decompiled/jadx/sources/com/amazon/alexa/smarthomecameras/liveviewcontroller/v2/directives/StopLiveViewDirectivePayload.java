package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.directives;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.Status;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class StopLiveViewDirectivePayload implements Serializable {

    @SerializedName("description")
    private final String description;

    @NonNull
    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private final String sessionId;

    @NonNull
    @SerializedName("status")
    private final Status status;

    public StopLiveViewDirectivePayload(@NonNull String str, @NonNull Status status, @Nullable String str2) {
        this.sessionId = str;
        this.status = status;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }
}
