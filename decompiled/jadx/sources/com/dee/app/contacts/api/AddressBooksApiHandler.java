package com.dee.app.contacts.api;

import com.dee.app.contacts.api.addressbook.DeleteAddressBooksApi;
import com.dee.app.contacts.api.addressbook.GetAddressBooksApi;
import com.dee.app.contacts.interfaces.models.apis.deleteaddressbooks.DeleteAddressBooksRequest;
import com.dee.app.contacts.interfaces.models.apis.deleteaddressbooks.DeleteAddressBooksResponse;
import com.dee.app.contacts.interfaces.models.apis.getaddressbooks.GetAddressBooksRequest;
import com.dee.app.contacts.interfaces.models.apis.getaddressbooks.GetAddressBooksResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddressBooksApiHandler {
    private final AbstractContactApiAction<DeleteAddressBooksRequest, DeleteAddressBooksResponse> mDeleteAddressBooksApi;
    private final AbstractContactApiAction<GetAddressBooksRequest, GetAddressBooksResponse> mGetAddressBooksApi;

    @Inject
    public AddressBooksApiHandler(GetAddressBooksApi getAddressBooksApi, DeleteAddressBooksApi deleteAddressBooksApi) {
        this.mGetAddressBooksApi = getAddressBooksApi;
        this.mDeleteAddressBooksApi = deleteAddressBooksApi;
    }

    public Observable<DeleteAddressBooksResponse> deleteAddressBooks(DeleteAddressBooksRequest deleteAddressBooksRequest) {
        return this.mDeleteAddressBooksApi.performAction(deleteAddressBooksRequest);
    }

    public Observable<GetAddressBooksResponse> getAddressBooks(GetAddressBooksRequest getAddressBooksRequest) {
        return this.mGetAddressBooksApi.performAction(getAddressBooksRequest);
    }
}
