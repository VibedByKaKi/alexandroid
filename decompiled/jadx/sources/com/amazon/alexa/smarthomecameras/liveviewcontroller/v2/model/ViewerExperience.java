package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.LiveViewTrigger;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.SessionProperty;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ViewerExperience implements Serializable {

    @SerializedName("hasAdditionalCameras")
    private final boolean hasAdditionalCameras;

    @NonNull
    @SerializedName("liveViewTrigger")
    private final LiveViewTrigger liveViewTrigger;

    @SerializedName("sessionProperties")
    private final List<SessionProperty> sessionProperties;

    @SerializedName("sessionTitle")
    private final String sessionTitle;

    @NonNull
    @SerializedName("suggestedDisplay")
    private final DisplayProperties suggestedDisplay;

    @NonNull
    @SerializedName("timeout")
    private final SessionTimeout timeout;

    @NonNull
    @SerializedName("viewerAudioProperties")
    private final ViewerAudioProperties viewerAudioProperties;

    public ViewerExperience(DisplayProperties displayProperties, ViewerAudioProperties viewerAudioProperties, LiveViewTrigger liveViewTrigger, SessionTimeout sessionTimeout, boolean z, String str, List<SessionProperty> list) {
        this.suggestedDisplay = displayProperties;
        this.viewerAudioProperties = viewerAudioProperties;
        this.liveViewTrigger = liveViewTrigger;
        this.timeout = sessionTimeout;
        this.hasAdditionalCameras = z;
        this.sessionTitle = str;
        this.sessionProperties = list;
    }

    @NonNull
    public LiveViewTrigger getLiveViewTrigger() {
        return this.liveViewTrigger;
    }

    public List<SessionProperty> getSessionProperties() {
        return this.sessionProperties;
    }

    public String getSessionTitle() {
        return this.sessionTitle;
    }

    @NonNull
    public DisplayProperties getSuggestedDisplay() {
        return this.suggestedDisplay;
    }

    @NonNull
    public SessionTimeout getTimeout() {
        return this.timeout;
    }

    @NonNull
    public ViewerAudioProperties getViewerAudioProperties() {
        return this.viewerAudioProperties;
    }

    public boolean isHasAdditionalCameras() {
        return this.hasAdditionalCameras;
    }
}
