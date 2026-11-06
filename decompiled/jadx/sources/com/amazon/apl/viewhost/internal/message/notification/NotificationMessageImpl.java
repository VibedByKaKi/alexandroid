package com.amazon.apl.viewhost.internal.message.notification;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.message.notification.NotificationMessage;
import com.amazon.apl.viewhost.primitives.Decodable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationMessageImpl extends NotificationMessage {

    @NonNull
    private final DocumentHandle mDocument;
    private final int mId;

    @NonNull
    private final Decodable mPayload;
    private final String mType;

    public NotificationMessageImpl(int i, DocumentHandle documentHandle, String str, Decodable decodable) {
        this.mId = i;
        this.mDocument = documentHandle;
        this.mType = str;
        this.mPayload = decodable;
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public DocumentHandle getDocument() {
        return this.mDocument;
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public int getId() {
        return this.mId;
    }

    @Override // com.amazon.apl.viewhost.message.GenericMessage
    public Decodable getPayload() {
        return this.mPayload;
    }

    @Override // com.amazon.apl.viewhost.message.GenericMessage
    public String getType() {
        return this.mType;
    }
}
