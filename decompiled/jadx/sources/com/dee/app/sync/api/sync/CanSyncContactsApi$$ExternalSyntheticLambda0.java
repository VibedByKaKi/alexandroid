package com.dee.app.sync.api.sync;

import com.dee.app.contacts.api.contacts.UpdateContactApi;
import com.dee.app.contacts.api.customeridentity.GetAccountsApi;
import com.dee.app.contacts.api.customeridentity.GetPhoneNumberVerificationURLApi;
import com.dee.app.contacts.api.devices.GetDevicesApi;
import com.dee.app.contacts.api.preference.GetContactIdentityPreferenceApi;
import com.dee.app.contacts.api.preference.GetContactPreferenceApi;
import com.dee.app.contacts.api.preference.GetPreferenceForOwnerApi;
import com.dee.app.contacts.api.preference.SetContactIdentityPreferenceApi;
import com.dee.app.contacts.api.preference.SetContactPreferenceApi;
import com.dee.app.contacts.api.preference.SetPreferenceForOwnerApi;
import com.dee.app.contacts.common.models.server.CanSyncContactsServerResponse;
import com.dee.app.contacts.common.models.server.GetContactsV2ServerResponse;
import com.dee.app.contacts.interfaces.models.apis.cansync.CanSyncContactsResponse;
import com.dee.app.contacts.interfaces.models.apis.getaccounts.GetAccountsResponse;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.GetContactsResponse;
import com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2.GetContactsV2Response;
import com.dee.app.contacts.interfaces.models.apis.getdevices.GetDevicesResponse;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesResponse;
import com.dee.app.contacts.interfaces.models.apis.setcontactpreference.SetContactPreferenceResponse;
import com.dee.app.contacts.interfaces.models.apis.setpreferenceforowner.SetPreferenceForOwnerResponse;
import com.dee.app.contacts.interfaces.models.apis.setuserpreference.SetContactIdentityPreferenceResponse;
import com.dee.app.contacts.interfaces.models.data.server.ServerAccount;
import com.dee.app.contacts.interfaces.models.data.server.ServerGetDevicesResponse;
import com.dee.app.contactsLibrary.db.reduxpersist.contacts.GetContactsDBHandler;
import com.dee.app.contactsLibrary.db.reduxpersist.contacts.QueryContactAttributesDBHandler;
import com.dee.app.data.reactnative.bridges.ElementLocalStorageDelegate;
import java.util.List;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.FuncN;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class CanSyncContactsApi$$ExternalSyntheticLambda0 implements Action1, Func1, FuncN {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CanSyncContactsApi$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        CanSyncContactsResponse lambda$handleCanSyncContactsAction$0;
        GetAccountsResponse lambda$handleGetAccountsAction$0;
        GetDevicesResponse lambda$handleGetDevicesAction$0;
        SetContactIdentityPreferenceResponse lambda$handleSetContactAction$0;
        SetContactPreferenceResponse lambda$handleSetContactAction$02;
        SetPreferenceForOwnerResponse lambda$handleSetPreferenceForOwnerAction$0;
        GetContactsResponse lambda$handleAction$0;
        List lambda$handleGetAllContactsRequest$1;
        QueryContactsWithAttributesResponse lambda$handleQueryContactAttributesRequest$0;
        GetContactsV2Response lambda$handleDownSyncAction$0;
        Boolean lambda$splitAndPerformBatchUpdates$8;
        Boolean lambda$canSync$9;
        switch (this.$r8$classId) {
            case 0:
                lambda$handleCanSyncContactsAction$0 = CanSyncContactsApi.lambda$handleCanSyncContactsAction$0((CanSyncContactsServerResponse) obj);
                return lambda$handleCanSyncContactsAction$0;
            case 2:
                lambda$handleGetAccountsAction$0 = GetAccountsApi.lambda$handleGetAccountsAction$0((ServerAccount[]) obj);
                return lambda$handleGetAccountsAction$0;
            case 5:
                lambda$handleGetDevicesAction$0 = GetDevicesApi.lambda$handleGetDevicesAction$0((ServerGetDevicesResponse) obj);
                return lambda$handleGetDevicesAction$0;
            case 10:
                lambda$handleSetContactAction$0 = SetContactIdentityPreferenceApi.lambda$handleSetContactAction$0((String) obj);
                return lambda$handleSetContactAction$0;
            case 12:
                lambda$handleSetContactAction$02 = SetContactPreferenceApi.lambda$handleSetContactAction$0((String) obj);
                return lambda$handleSetContactAction$02;
            case 14:
                lambda$handleSetPreferenceForOwnerAction$0 = SetPreferenceForOwnerApi.lambda$handleSetPreferenceForOwnerAction$0((String) obj);
                return lambda$handleSetPreferenceForOwnerAction$0;
            case 16:
                lambda$handleAction$0 = GetContactsDBHandler.lambda$handleAction$0((List) obj);
                return lambda$handleAction$0;
            case 17:
                lambda$handleGetAllContactsRequest$1 = GetContactsDBHandler.lambda$handleGetAllContactsRequest$1((QueryContactsWithAttributesResponse) obj);
                return lambda$handleGetAllContactsRequest$1;
            case 18:
                lambda$handleQueryContactAttributesRequest$0 = QueryContactAttributesDBHandler.lambda$handleQueryContactAttributesRequest$0((String) obj);
                return lambda$handleQueryContactAttributesRequest$0;
            case 21:
                lambda$handleDownSyncAction$0 = ContactsDownSyncApi.lambda$handleDownSyncAction$0((GetContactsV2ServerResponse) obj);
                return lambda$handleDownSyncAction$0;
            case 25:
                lambda$splitAndPerformBatchUpdates$8 = ContactsUpSyncApi.lambda$splitAndPerformBatchUpdates$8((Boolean) obj);
                return lambda$splitAndPerformBatchUpdates$8;
            default:
                lambda$canSync$9 = ContactsUpSyncApi.lambda$canSync$9((CanSyncContactsServerResponse) obj);
                return lambda$canSync$9;
        }
    }

    @Override // rx.functions.FuncN
    public Object call(Object[] objArr) {
        Boolean lambda$performBatchUpdateContacts$16;
        lambda$performBatchUpdateContacts$16 = ContactsUpSyncApi.lambda$performBatchUpdateContacts$16(objArr);
        return lambda$performBatchUpdateContacts$16;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 1:
                UpdateContactApi.lambda$handleUpdateContactAction$1(th);
                break;
            case 2:
            case 5:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 18:
            case 21:
            case 25:
            case 26:
            default:
                ContactsUpSyncApi.lambda$performBatchUpdateContacts$17(th);
                break;
            case 3:
                GetAccountsApi.lambda$handleGetAccountsAction$1(th);
                break;
            case 4:
                GetPhoneNumberVerificationURLApi.lambda$handleGetPhoneNumberVerificationURLAction$0(th);
                break;
            case 6:
                GetDevicesApi.lambda$handleGetDevicesAction$1(th);
                break;
            case 7:
                GetContactIdentityPreferenceApi.lambda$handleGetIdentityPreferenceAction$1(th);
                break;
            case 8:
                GetContactPreferenceApi.lambda$handleGetContactPreferenceAction$1(th);
                break;
            case 9:
                GetPreferenceForOwnerApi.lambda$handleGetPreferenceForOwnerAction$1(th);
                break;
            case 11:
                SetContactIdentityPreferenceApi.lambda$handleSetContactAction$1(th);
                break;
            case 13:
                SetContactPreferenceApi.lambda$handleSetContactAction$1(th);
                break;
            case 15:
                SetPreferenceForOwnerApi.lambda$handleSetPreferenceForOwnerAction$1(th);
                break;
            case 19:
                ElementLocalStorageDelegate.lambda$clear$3(th);
                break;
            case 20:
                CanSyncContactsApi.lambda$handleCanSyncContactsAction$1(th);
                break;
            case 22:
                ContactsDownSyncApi.lambda$handleDownSyncAction$1(th);
                break;
            case 23:
                ContactsUpSyncApi.lambda$getBatchUpdateLABContactsObservable$20(th);
                break;
            case 24:
                ContactsUpSyncApi.lambda$onSyncAllowed$12(th);
                break;
            case 27:
                ContactsUpSyncApi.lambda$canSync$10(th);
                break;
        }
    }
}
