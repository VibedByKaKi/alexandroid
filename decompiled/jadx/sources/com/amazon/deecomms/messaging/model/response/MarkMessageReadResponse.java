package com.amazon.deecomms.messaging.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MarkMessageReadResponse {

    @JsonProperty("conversationId")
    private String conversationId;

    @JsonProperty("messageId")
    private long messageId;

    public String getConversationId() {
        return this.conversationId;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setMessageId(long j) {
        this.messageId = j;
    }
}
