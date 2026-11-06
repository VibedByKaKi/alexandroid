package com.amazon.apl.viewhost.message;

import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.primitives.Decodable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Message {
    private final DocumentHandle mDocumentHandle;
    private final Decodable mPayload;

    public Message(DocumentHandle documentHandle, Decodable decodable) {
        this.mDocumentHandle = documentHandle;
        this.mPayload = decodable;
    }

    public DocumentHandle getDocument() {
        return this.mDocumentHandle;
    }

    public Decodable getPayload() {
        return this.mPayload;
    }
}
