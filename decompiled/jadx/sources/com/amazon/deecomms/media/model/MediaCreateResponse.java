package com.amazon.deecomms.media.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaCreateResponse {

    @JsonProperty("id")
    private String arn;

    @JsonProperty(LivePreviewBundleKeys.TRANSCRIPT)
    private String transcript;

    @JsonProperty("transcriptStatus")
    private String transcriptStatus;

    public String getArn() {
        return this.arn;
    }

    public String getTranscript() {
        return this.transcript;
    }

    public String getTranscriptStatus() {
        return this.transcriptStatus;
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setTranscript(String str) {
        this.transcript = str;
    }

    public void setTranscriptStatus(String str) {
        this.transcriptStatus = str;
    }
}
