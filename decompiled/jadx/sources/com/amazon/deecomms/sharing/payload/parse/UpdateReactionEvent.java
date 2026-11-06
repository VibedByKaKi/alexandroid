package com.amazon.deecomms.sharing.payload.parse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UpdateReactionEvent {
    private String globalMessageId;
    private String name;
    private String parentGlobalMessageId;
    private String reactionType;

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
