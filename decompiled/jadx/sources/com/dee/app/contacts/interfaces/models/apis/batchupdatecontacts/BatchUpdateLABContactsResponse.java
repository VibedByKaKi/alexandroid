package com.dee.app.contacts.interfaces.models.apis.batchupdatecontacts;

import com.dee.app.contacts.interfaces.models.data.SyncedContact;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BatchUpdateLABContactsResponse {

    @JsonProperty("failureList")
    private List<SyncedContact> failureList;

    @JsonProperty("successList")
    private List<SyncedContact> successList;

    public BatchUpdateLABContactsResponse(List<SyncedContact> list, List<SyncedContact> list2) {
        this.successList = list;
        this.failureList = list2;
    }

    public List<SyncedContact> getFailureList() {
        return this.failureList;
    }

    public List<SyncedContact> getSuccessList() {
        return this.successList;
    }

    private BatchUpdateLABContactsResponse() {
    }
}
