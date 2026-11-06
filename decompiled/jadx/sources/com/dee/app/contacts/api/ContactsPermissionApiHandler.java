package com.dee.app.contacts.api;

import com.dee.app.contacts.api.permissions.ContactsGetAuthStatusApi;
import com.dee.app.contacts.api.permissions.ContactsRequestPermissionApi;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusRequest;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusResponse;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionRequest;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsPermissionApiHandler {
    private AbstractContactApiAction<GetContactsAuthStatusRequest, GetContactsAuthStatusResponse> mContactsGetAuthStatusApi;
    private AbstractContactApiAction<RequestContactsPermissionRequest, RequestContactsPermissionResponse> mContactsRequestPermissionApi;

    @Inject
    public ContactsPermissionApiHandler(ContactsGetAuthStatusApi contactsGetAuthStatusApi, ContactsRequestPermissionApi contactsRequestPermissionApi) {
        this.mContactsGetAuthStatusApi = contactsGetAuthStatusApi;
        this.mContactsRequestPermissionApi = contactsRequestPermissionApi;
    }

    public Observable<GetContactsAuthStatusResponse> getContactsAuthStatus(GetContactsAuthStatusRequest getContactsAuthStatusRequest) {
        return this.mContactsGetAuthStatusApi.performAction(getContactsAuthStatusRequest);
    }

    public Observable<RequestContactsPermissionResponse> requestContactsPermission(RequestContactsPermissionRequest requestContactsPermissionRequest) {
        return this.mContactsRequestPermissionApi.performAction(requestContactsPermissionRequest);
    }
}
