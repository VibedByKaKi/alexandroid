package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UpdateReactionEvent {
    private final String globalMessageId;
    private final String name;
    private final String parentGlobalMessageId;
    private final String reactionType;

    public UpdateReactionEvent(String str, String str2, String str3, String str4) {
        this.name = str;
        this.reactionType = str2;
        this.globalMessageId = str3;
        this.parentGlobalMessageId = str4;
    }

    public String getGlobalMessageId() {
        return this.globalMessageId;
    }

    public String getName() {
        return this.name;
    }

    public String getParentGlobalMessageId() {
        return this.parentGlobalMessageId;
    }

    public String getReactionType() {
        return this.reactionType;
    }
}
