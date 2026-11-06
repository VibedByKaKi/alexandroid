package com.dee.app.contacts.interfaces.models.apis.synccontacts;

import com.dee.app.contacts.interfaces.models.data.ContactForSync;
import com.dee.app.contacts.interfaces.models.data.enums.ContactSourceType;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SplitBatchesResponse {
    private ContactSourceType contactSourceType;
    private List<List<ContactForSync>> initialBatches;
    private List<List<ContactForSync>> lastBatch;

    public SplitBatchesResponse(List<List<ContactForSync>> list, List<List<ContactForSync>> list2, ContactSourceType contactSourceType) {
        this.initialBatches = list;
        this.lastBatch = list2;
        this.contactSourceType = contactSourceType;
    }

    public ContactSourceType getContactSourceType() {
        return this.contactSourceType;
    }

    public List<List<ContactForSync>> getInitialBatches() {
        return this.initialBatches;
    }

    public List<List<ContactForSync>> getLastBatch() {
        return this.lastBatch;
    }

    public void setContactSourceType(ContactSourceType contactSourceType) {
        this.contactSourceType = contactSourceType;
    }

    public void setInitialBatches(List<List<ContactForSync>> list) {
        this.initialBatches = list;
    }

    public void setLastBatch(List<List<ContactForSync>> list) {
        this.lastBatch = list;
    }

    public SplitBatchesResponse(List<List<ContactForSync>> list, List<List<ContactForSync>> list2) {
        this.initialBatches = list;
        this.lastBatch = list2;
    }
}
