package com.dee.app.contacts.interfaces.models.data;

import com.dee.app.contacts.interfaces.models.data.enums.SyncOperationType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactForSync {
    private ContactUploadInfo contact;
    private SyncOperationType syncOperationType;

    public ContactForSync(ContactUploadInfo contactUploadInfo, SyncOperationType syncOperationType) {
        this.contact = contactUploadInfo;
        this.syncOperationType = syncOperationType;
    }

    public ContactUploadInfo getContact() {
        return this.contact;
    }

    public SyncOperationType getSyncOperationType() {
        return this.syncOperationType;
    }
}
