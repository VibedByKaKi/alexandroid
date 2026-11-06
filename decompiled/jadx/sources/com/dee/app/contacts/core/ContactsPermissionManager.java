package com.dee.app.contacts.core;

import com.dee.app.contacts.api.ContactsPermissionApiHandler;
import com.dee.app.contacts.interfaces.core.IContactsPermissionManager;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusRequest;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusResponse;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionRequest;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsPermissionManager implements IContactsPermissionManager {

    @Inject
    ContactsPermissionApiHandler contactsPermissionApiHandler;

    @Inject
    public ContactsPermissionManager() {
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsPermissionManager
    public Observable<GetContactsAuthStatusResponse> getContactsAuthorisationStatus(GetContactsAuthStatusRequest getContactsAuthStatusRequest) {
        return this.contactsPermissionApiHandler.getContactsAuthStatus(getContactsAuthStatusRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsPermissionManager
    public Observable<RequestContactsPermissionResponse> requestContactsPermission(RequestContactsPermissionRequest requestContactsPermissionRequest) {
        return this.contactsPermissionApiHandler.requestContactsPermission(requestContactsPermissionRequest);
    }
}
