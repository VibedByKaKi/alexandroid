package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.AlexaLatencyMetadata;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.FirstFrameLatencyMetadata;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FirstFrameRenderedPayload implements Serializable {

    @NonNull
    @SerializedName("alexaLatencyMetadata")
    private final AlexaLatencyMetadata alexaLatencyMetadata;

    @NonNull
    @SerializedName("firstFrameLatencyMetadata")
    private final FirstFrameLatencyMetadata firstFrameLatencyMetadata;

    @NonNull
    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private final String sessionId;

    public FirstFrameRenderedPayload(@NonNull String str, @NonNull AlexaLatencyMetadata alexaLatencyMetadata, @NonNull FirstFrameLatencyMetadata firstFrameLatencyMetadata) {
        this.sessionId = str;
        this.alexaLatencyMetadata = alexaLatencyMetadata;
        this.firstFrameLatencyMetadata = firstFrameLatencyMetadata;
    }

    @NonNull
    public AlexaLatencyMetadata getAlexaLatencyMetadata() {
        return this.alexaLatencyMetadata;
    }

    @NonNull
    public FirstFrameLatencyMetadata getFirstFrameLatencyMetadata() {
        return this.firstFrameLatencyMetadata;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }
}
