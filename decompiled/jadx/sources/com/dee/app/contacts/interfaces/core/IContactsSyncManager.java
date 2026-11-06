package com.dee.app.contacts.interfaces.core;

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
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface IContactsSyncManager {
    Observable<CanSyncContactsResponse> canSyncContacts(CanSyncContactsRequest canSyncContactsRequest);

    Observable<GetContactByContactIdResponse> getContactByContactId(GetContactByContactIdRequest getContactByContactIdRequest);

    Observable<GetMasterDeviceIdResponse> getMasterDeviceId(GetMasterDeviceIdRequest getMasterDeviceIdRequest);

    Observable<GetContactsV2Response> startContactsDownSync(GetContactsV2Request getContactsV2Request);

    Observable<ContactsUpSyncResponse> startContactsUpSync(ContactsUpSyncRequest contactsUpSyncRequest);
}
