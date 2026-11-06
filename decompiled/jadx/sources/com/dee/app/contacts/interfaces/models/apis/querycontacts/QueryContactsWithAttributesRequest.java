package com.dee.app.contacts.interfaces.models.apis.querycontacts;

import com.dee.app.contacts.interfaces.models.data.enums.ContactQueryFields;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class QueryContactsWithAttributesRequest {
    private List<ContactQueryFields> contactFieldsToInclude;
    private QueryContactsWithAttributesFilterConfig filterConfig;

    public List<ContactQueryFields> getContactFieldsToInclude() {
        return this.contactFieldsToInclude;
    }

    public QueryContactsWithAttributesFilterConfig getFilterConfig() {
        return this.filterConfig;
    }

    public void setContactFieldsToInclude(List<ContactQueryFields> list) {
        this.contactFieldsToInclude = list;
    }

    public void setFilterConfig(QueryContactsWithAttributesFilterConfig queryContactsWithAttributesFilterConfig) {
        this.filterConfig = queryContactsWithAttributesFilterConfig;
    }
}
