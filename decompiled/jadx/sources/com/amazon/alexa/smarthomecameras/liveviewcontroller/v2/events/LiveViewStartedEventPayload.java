package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.LiveViewLayout;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewStartedEventPayload implements Serializable {

    @SerializedName("layout")
    private final LiveViewLayout layout;

    @NonNull
    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private final String sessionId;

    public LiveViewStartedEventPayload(@NonNull String str, LiveViewLayout liveViewLayout) {
        this.sessionId = str;
        this.layout = liveViewLayout;
    }

    public LiveViewLayout getLayout() {
        return this.layout;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }
}
