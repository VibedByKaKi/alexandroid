package com.dee.app.contacts.interfaces.models.apis.getcontacts;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsResponse<T> {
    private List<T> contacts;
    private List<String> failedIds;
    private String paginationToken;

    public List<T> getContacts() {
        return this.contacts;
    }

    public List<String> getFailedIds() {
        return this.failedIds;
    }

    public String getPaginationToken() {
        return this.paginationToken;
    }

    public void setContacts(List<T> list) {
        this.contacts = list;
    }

    public void setFailedIds(List<String> list) {
        this.failedIds = list;
    }

    public void setPaginationToken(String str) {
        this.paginationToken = str;
    }
}
