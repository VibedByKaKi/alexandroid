package com.dee.app.contacts.common.models.server;

import com.dee.app.contacts.interfaces.models.data.server.ServerContact;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsV2ServerResponse {
    private List<ServerContact> contactList;
    private String entityTag;
    private String paginationToken;

    public List<ServerContact> getContactList() {
        return this.contactList;
    }

    public String getEntityTag() {
        return this.entityTag;
    }

    public String getPaginationToken() {
        return this.paginationToken;
    }

    public void setContactList(List<ServerContact> list) {
        this.contactList = list;
    }

    public void setEntityTag(String str) {
        this.entityTag = str;
    }

    public void setPaginationToken(String str) {
        this.paginationToken = str;
    }
}
