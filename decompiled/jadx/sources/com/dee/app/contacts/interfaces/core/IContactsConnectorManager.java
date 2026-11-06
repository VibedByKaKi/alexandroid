package com.dee.app.contacts.interfaces.core;

import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesRequest;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesResponse;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface IContactsConnectorManager {
    Observable<QueryContactsWithAttributesResponse> queryContactsWithAttributes(QueryContactsWithAttributesRequest queryContactsWithAttributesRequest);
}
