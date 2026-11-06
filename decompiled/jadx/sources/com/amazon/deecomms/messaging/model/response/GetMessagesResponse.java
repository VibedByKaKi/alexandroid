package com.amazon.deecomms.messaging.model.response;

import androidx.annotation.NonNull;
import com.amazon.deecomms.messaging.model.Message;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetMessagesResponse {

    @NonNull
    @JsonProperty("conversationId")
    public String conversationId;

    @NonNull
    @JsonProperty("messages")
    public List<Message> messages;
}
