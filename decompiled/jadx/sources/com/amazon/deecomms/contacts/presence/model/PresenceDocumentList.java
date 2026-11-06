package com.amazon.deecomms.contacts.presence.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PresenceDocumentList {

    @JsonProperty("contactsPresenceCount")
    private Integer documentCount;

    @JsonProperty("contactsPresences")
    private PresenceDocument[] documents;

    public Integer getDocumentCount() {
        return this.documentCount;
    }

    public PresenceDocument[] getDocuments() {
        return this.documents;
    }

    public void setDocumentCount(Integer num) {
        this.documentCount = num;
    }

    public void setDocuments(PresenceDocument[] presenceDocumentArr) {
        this.documents = presenceDocumentArr;
    }
}
