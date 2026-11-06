package com.amazon.deecomms.notifications.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.deecomms.messaging.model.status.TranscriptStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TranscriptUpdatePush {
    public static final String TYPE = "transcript-update";

    @JsonProperty("conversationId")
    private String conversationId;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("messageId")
    private long messageId;

    @JsonProperty("sequenceId")
    private long sequenceId;

    @JsonProperty(LivePreviewBundleKeys.TRANSCRIPT)
    private String transcript;

    @JsonProperty("transcriptStatus")
    private String transcriptStatus;

    public String getConversationId() {
        return this.conversationId;
    }

    public String getEventType() {
        return this.eventType;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public long getSequenceId() {
        return this.sequenceId;
    }

    public String getTranscript() {
        return this.transcript;
    }

    public TranscriptStatus getTranscriptStatus() {
        return TranscriptStatus.fromString(this.transcriptStatus);
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setMessageId(long j) {
        this.messageId = j;
    }

    public void setSequenceId(long j) {
        this.sequenceId = j;
    }

    public void setTranscript(String str) {
        this.transcript = str;
    }

    @JsonIgnore
    public void setTranscriptStatus(TranscriptStatus transcriptStatus) {
        if (transcriptStatus == null) {
            this.transcriptStatus = null;
        } else {
            this.transcriptStatus = transcriptStatus.toString();
        }
    }

    public void setTranscriptStatus(String str) {
        this.transcriptStatus = str;
    }
}
