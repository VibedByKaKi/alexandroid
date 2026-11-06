package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.directives;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.AlexaLatencyMetadata;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.Participants;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.ViewerExperience;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.LiveViewSessionType;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.Role;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class StartLiveViewDirectivePayload implements Serializable {

    @SerializedName("alexaLatencyMetadata")
    private final AlexaLatencyMetadata alexaLatencyMetadata;

    @NonNull
    @SerializedName("participants")
    private final Participants participants;

    @SerializedName("requestId")
    private final String requestId;

    @NonNull
    @SerializedName("role")
    private final Role role;

    @NonNull
    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    private final String sessionId;

    @NonNull
    @SerializedName(BizMetricsConstants.SESSION_TYPE)
    private final LiveViewSessionType sessionType;

    @SerializedName("viewerExperience")
    private final ViewerExperience viewerExperience;

    public StartLiveViewDirectivePayload(@NonNull String str, @NonNull LiveViewSessionType liveViewSessionType, @NonNull Role role, @NonNull Participants participants, ViewerExperience viewerExperience, String str2, @Nullable AlexaLatencyMetadata alexaLatencyMetadata) {
        this.sessionId = str;
        this.sessionType = liveViewSessionType;
        this.role = role;
        this.participants = participants;
        this.viewerExperience = viewerExperience;
        this.requestId = str2;
        this.alexaLatencyMetadata = alexaLatencyMetadata;
    }

    @Nullable
    public AlexaLatencyMetadata getAlexaLatencyMetadata() {
        return this.alexaLatencyMetadata;
    }

    @NonNull
    public Participants getParticipants() {
        return this.participants;
    }

    public String getRequestId() {
        return this.requestId;
    }

    @NonNull
    public Role getRole() {
        return this.role;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    @NonNull
    public LiveViewSessionType getSessionType() {
        return this.sessionType;
    }

    public ViewerExperience getViewerExperience() {
        return this.viewerExperience;
    }

    public StartLiveViewDirectivePayload(@NonNull String str, @NonNull LiveViewSessionType liveViewSessionType, @NonNull Role role, @NonNull Participants participants, ViewerExperience viewerExperience, String str2) {
        this(str, liveViewSessionType, role, participants, viewerExperience, str2, null);
    }
}
