package com.amazon.deecomms.messaging.model.response;

import com.amazon.deecomms.messaging.model.Conversation;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConversationsResponse {

    @JsonProperty("conversations")
    private Conversation[] conversations;

    @JsonProperty("lastPage")
    private boolean lastPage;

    public Conversation[] getConversations() {
        return this.conversations;
    }

    public boolean getLastPage() {
        return this.lastPage;
    }

    public void setConversations(Conversation[] conversationArr) {
        this.conversations = conversationArr;
    }

    public void setLastPage(boolean z) {
        this.lastPage = z;
    }
}
