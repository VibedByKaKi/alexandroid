package com.dee.app.contacts.core;

import com.dee.app.contacts.api.AddressBooksApiHandler;
import com.dee.app.contacts.interfaces.core.IAddressBookManager;
import com.dee.app.contacts.interfaces.models.apis.deleteaddressbooks.DeleteAddressBooksRequest;
import com.dee.app.contacts.interfaces.models.apis.deleteaddressbooks.DeleteAddressBooksResponse;
import com.dee.app.contacts.interfaces.models.apis.getaddressbooks.GetAddressBooksRequest;
import com.dee.app.contacts.interfaces.models.apis.getaddressbooks.GetAddressBooksResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddressBookManager implements IAddressBookManager {

    @Inject
    AddressBooksApiHandler mAddressBooksApiHandler;

    @Inject
    public AddressBookManager() {
    }

    @Override // com.dee.app.contacts.interfaces.core.IAddressBookManager
    public Observable<DeleteAddressBooksResponse> deleteAddressBooks(DeleteAddressBooksRequest deleteAddressBooksRequest) {
        return this.mAddressBooksApiHandler.deleteAddressBooks(deleteAddressBooksRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.IAddressBookManager
    public Observable<GetAddressBooksResponse> getAddressBooks(GetAddressBooksRequest getAddressBooksRequest) {
        return this.mAddressBooksApiHandler.getAddressBooks(getAddressBooksRequest);
    }
}
