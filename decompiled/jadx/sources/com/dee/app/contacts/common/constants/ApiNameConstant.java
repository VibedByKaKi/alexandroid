package com.dee.app.contacts.common.constants;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ApiNameConstant {
    GET_ACTIVE_CONTACTS_API("GetActiveContactsApi"),
    GET_CONTACT_API("GetContactApi"),
    GET_CONTACTS_API("GetContactsApi"),
    GET_CONTACTS_V2_API("GetContactsV2Api"),
    SYNC_CONTACTS_API("SyncContactsApi"),
    CAN_SYNC_CONTACTS_API("CanSyncContactsApi"),
    GET_CONTACT_BY_CONTACT_ID_API("GetContactByContactIdApi"),
    GET_DEVICES_API("GetDevicesApi"),
    GET_MASTER_DEVICE_ID("GetMasterDeviceIdApi"),
    GET_PREFERENCE_API("GetContactPreferenceApi"),
    SET_PREFERENCE_API("SetContactPreferenceApi"),
    GET_IDENTITY_PREFERENCE_API("GetIdentityPreferenceApi"),
    SET_IDENTITY_PREFERENCE_API("SetIdentityPreferenceApi"),
    GET_OWNER_PREFERENCE_API("GetOwnerPreferenceApi"),
    SET_OWNER_PREFERENCE_API("SetOwnerPreferenceApi"),
    GET_ADDRESS_BOOKS_API("GetAddressBooksApi"),
    DELETE_ADDRESS_BOOKS_API("DeleteAddressBooksApi"),
    GET_PNV_URL_API("GetPhoneNumberVerificationURLApi"),
    GET_ACCOUNTS_API("GetAccountsApi");

    private final String mApiName;

    ApiNameConstant(String str) {
        this.mApiName = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mApiName;
    }
}
