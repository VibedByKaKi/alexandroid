package com.dee.app.contacts.interfaces.models.apis.getaddressbooks;

import com.dee.app.contacts.interfaces.models.apis.ApiConstants;
import com.dee.app.contacts.interfaces.models.data.enums.OwnerIdType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetAddressBooksQueryConfig {
    private OwnerIdType ownerIdType = OwnerIdType.COMMS_ID;
    private String addressBookType = ApiConstants.DEFAULT_ADDRESS_BOOK_TYPE;

    public String getAddressBookType() {
        return this.addressBookType;
    }

    public OwnerIdType getOwnerIdType() {
        return this.ownerIdType;
    }

    public void setAddressBookType(String str) {
        this.addressBookType = str;
    }

    public void setOwnerIdType(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }
}
