package com.dee.app.sync.core;

import com.dee.app.contacts.interfaces.core.IContactsSyncManager;
import com.dee.app.contacts.interfaces.models.apis.cansync.CanSyncContactsRequest;
import com.dee.app.contacts.interfaces.models.apis.cansync.CanSyncContactsResponse;
import com.dee.app.contacts.interfaces.models.apis.getcontactbycontactid.GetContactByContactIdRequest;
import com.dee.app.contacts.interfaces.models.apis.getcontactbycontactid.GetContactByContactIdResponse;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2.GetContactsV2Request;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2.GetContactsV2Response;
import com.dee.app.contacts.interfaces.models.apis.getmasterdeviceid.GetMasterDeviceIdRequest;
import com.dee.app.contacts.interfaces.models.apis.getmasterdeviceid.GetMasterDeviceIdResponse;
import com.dee.app.contacts.interfaces.models.apis.synccontacts.ContactsUpSyncRequest;
import com.dee.app.contacts.interfaces.models.apis.synccontacts.ContactsUpSyncResponse;
import com.dee.app.sync.api.ContactsSyncApiHandler;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsSyncManager implements IContactsSyncManager {

    @Inject
    ContactsSyncApiHandler contactsSyncApiHandler;

    @Inject
    public ContactsSyncManager() {
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsSyncManager
    public Observable<CanSyncContactsResponse> canSyncContacts(CanSyncContactsRequest canSyncContactsRequest) {
        return this.contactsSyncApiHandler.canSyncContacts(canSyncContactsRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsSyncManager
    public Observable<GetContactByContactIdResponse> getContactByContactId(GetContactByContactIdRequest getContactByContactIdRequest) {
        return this.contactsSyncApiHandler.getContactByContactId(getContactByContactIdRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsSyncManager
    public Observable<GetMasterDeviceIdResponse> getMasterDeviceId(GetMasterDeviceIdRequest getMasterDeviceIdRequest) {
        return this.contactsSyncApiHandler.getMasterDeviceId(getMasterDeviceIdRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsSyncManager
    public Observable<GetContactsV2Response> startContactsDownSync(GetContactsV2Request getContactsV2Request) {
        return this.contactsSyncApiHandler.getContactsV2(getContactsV2Request);
    }

    @Override // com.dee.app.contacts.interfaces.core.IContactsSyncManager
    public Observable<ContactsUpSyncResponse> startContactsUpSync(ContactsUpSyncRequest contactsUpSyncRequest) {
        return this.contactsSyncApiHandler.uploadContacts(contactsUpSyncRequest);
    }
}
