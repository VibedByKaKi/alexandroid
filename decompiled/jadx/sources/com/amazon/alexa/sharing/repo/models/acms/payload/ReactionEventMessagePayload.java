package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReactionEventMessagePayload implements MessagePayload {
    public static final String TYPE = "event/reaction";

    @SerializedName("parentMessageId")
    private long parentMessageId;

    @SerializedName("reactionType")
    private String reactionType;

    @SerializedName("wasRemoved")
    private Boolean wasRemoved;

    public long getParentMessageId() {
        return this.parentMessageId;
    }

    public String getReactionType() {
        return this.reactionType;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "event/reaction";
    }

    public Boolean getWasRemoved() {
        return this.wasRemoved;
    }

    public void setParentMessageId(long j) {
        this.parentMessageId = j;
    }

    public void setReactionType(String str) {
        this.reactionType = str;
    }

    public void setWasRemoved(Boolean bool) {
        this.wasRemoved = bool;
    }
}
