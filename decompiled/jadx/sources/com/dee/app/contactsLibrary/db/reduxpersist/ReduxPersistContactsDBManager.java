package com.dee.app.contactsLibrary.db.reduxpersist;

import androidx.annotation.NonNull;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.GetContactsRequest;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.GetContactsResponse;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesRequest;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesResponse;
import com.dee.app.contactsLibrary.db.IContactsDBManager;
import com.dee.app.contactsLibrary.db.reduxpersist.contacts.GetContactsDBHandler;
import com.dee.app.contactsLibrary.db.reduxpersist.contacts.QueryContactAttributesDBHandler;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ReduxPersistContactsDBManager implements IContactsDBManager {
    private final AbstractReduxPersistDBAction<QueryContactsWithAttributesRequest, QueryContactsWithAttributesResponse> mContactAttributesDBHandler;
    private final AbstractReduxPersistDBAction<GetContactsRequest, GetContactsResponse> mGetContactsDBHandler;

    @Inject
    public ReduxPersistContactsDBManager(@NonNull GetContactsDBHandler getContactsDBHandler, @NonNull QueryContactAttributesDBHandler queryContactAttributesDBHandler) {
        this.mGetContactsDBHandler = getContactsDBHandler;
        this.mContactAttributesDBHandler = queryContactAttributesDBHandler;
    }

    @Override // com.dee.app.contactsLibrary.db.IContactsDBManager
    public Observable<QueryContactsWithAttributesResponse> queryContactsWithAttributes(QueryContactsWithAttributesRequest queryContactsWithAttributesRequest) {
        return this.mContactAttributesDBHandler.performAction(queryContactsWithAttributesRequest);
    }
}
