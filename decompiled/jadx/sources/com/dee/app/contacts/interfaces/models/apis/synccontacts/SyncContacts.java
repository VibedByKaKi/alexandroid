package com.dee.app.contacts.interfaces.models.apis.synccontacts;

import com.dee.app.contacts.interfaces.models.data.ContactForSync;
import com.dee.app.contacts.interfaces.models.data.SyncedContact;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SyncContacts {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Request {

        @JsonProperty("contactsForSyncList")
        private List<ContactForSync> contactsForSyncList;

        public Request(List<ContactForSync> list) {
            this.contactsForSyncList = list;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Response {

        @JsonProperty("failureList")
        private List<SyncedContact> failureList;

        @JsonProperty("successList")
        private List<SyncedContact> successList;

        public List<SyncedContact> getFailureList() {
            return this.failureList;
        }

        public List<SyncedContact> getSuccessList() {
            return this.successList;
        }

        public void setFailureList(List<SyncedContact> list) {
            this.failureList = list;
        }

        public void setSuccessList(List<SyncedContact> list) {
            this.successList = list;
        }
    }
}
