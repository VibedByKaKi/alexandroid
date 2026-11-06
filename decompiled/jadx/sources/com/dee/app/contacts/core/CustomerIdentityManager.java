package com.dee.app.contacts.core;

import com.dee.app.contacts.api.CustomerIdentityApiHandler;
import com.dee.app.contacts.interfaces.core.ICustomerIdentityManager;
import com.dee.app.contacts.interfaces.models.apis.getaccounts.GetAccountsRequest;
import com.dee.app.contacts.interfaces.models.apis.getaccounts.GetAccountsResponse;
import com.dee.app.contacts.interfaces.models.apis.getpnvurl.GetPhoneNumberVerificationURLRequest;
import com.dee.app.contacts.interfaces.models.apis.getpnvurl.GetPhoneNumberVerificationURLResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CustomerIdentityManager implements ICustomerIdentityManager {

    @Inject
    CustomerIdentityApiHandler mCustomerIdentityApiHandler;

    @Inject
    public CustomerIdentityManager() {
    }

    @Override // com.dee.app.contacts.interfaces.core.ICustomerIdentityManager
    public Observable<GetAccountsResponse> getAccounts(GetAccountsRequest getAccountsRequest) {
        return this.mCustomerIdentityApiHandler.getAccounts(getAccountsRequest);
    }

    @Override // com.dee.app.contacts.interfaces.core.ICustomerIdentityManager
    public Observable<GetPhoneNumberVerificationURLResponse> getPhoneNumberVerificationURL(GetPhoneNumberVerificationURLRequest getPhoneNumberVerificationURLRequest) {
        return this.mCustomerIdentityApiHandler.getPhoneNumberVerificationURL(getPhoneNumberVerificationURLRequest);
    }
}
