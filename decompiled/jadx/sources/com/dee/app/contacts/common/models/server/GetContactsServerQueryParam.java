package com.dee.app.contacts.common.models.server;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsServerQueryParam {
    private List<String> contactPreferencesToInclude;
    private String entityTag;
    private boolean includeMergedContacts;
    private String nextPaginationToken;
    private int paginationCount;
    private boolean paginationEnabled;

    public List<String> getContactPreferencesToInclude() {
        return this.contactPreferencesToInclude;
    }

    public String getEntityTag() {
        return this.entityTag;
    }

    public String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public int getPaginationCount() {
        return this.paginationCount;
    }

    public boolean isIncludeMergedContacts() {
        return this.includeMergedContacts;
    }

    public boolean isPaginationEnabled() {
        return this.paginationEnabled;
    }

    public void setContactPreferencesToInclude(List<String> list) {
        this.contactPreferencesToInclude = list;
    }

    public void setEntityTag(String str) {
        this.entityTag = str;
    }

    public void setIncludeMergedContacts(boolean z) {
        this.includeMergedContacts = z;
    }

    public void setNextPaginationToken(String str) {
        this.nextPaginationToken = str;
    }

    public void setPaginationCount(int i) {
        this.paginationCount = i;
    }

    public void setPaginationEnabled(boolean z) {
        this.paginationEnabled = z;
    }
}
