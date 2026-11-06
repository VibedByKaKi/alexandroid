package com.dee.app.contacts.api;

import com.dee.app.contacts.api.customeridentity.GetAccountsApi;
import com.dee.app.contacts.api.customeridentity.GetPhoneNumberVerificationURLApi;
import com.dee.app.contacts.interfaces.models.apis.getaccounts.GetAccountsRequest;
import com.dee.app.contacts.interfaces.models.apis.getaccounts.GetAccountsResponse;
import com.dee.app.contacts.interfaces.models.apis.getpnvurl.GetPhoneNumberVerificationURLRequest;
import com.dee.app.contacts.interfaces.models.apis.getpnvurl.GetPhoneNumberVerificationURLResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CustomerIdentityApiHandler {
    private final AbstractContactApiAction<GetAccountsRequest, GetAccountsResponse> mGetAccountsApi;
    private final AbstractContactApiAction<GetPhoneNumberVerificationURLRequest, GetPhoneNumberVerificationURLResponse> mGetPhoneNumberVerificationURLApi;

    @Inject
    public CustomerIdentityApiHandler(GetPhoneNumberVerificationURLApi getPhoneNumberVerificationURLApi, GetAccountsApi getAccountsApi) {
        this.mGetPhoneNumberVerificationURLApi = getPhoneNumberVerificationURLApi;
        this.mGetAccountsApi = getAccountsApi;
    }

    public Observable<GetAccountsResponse> getAccounts(GetAccountsRequest getAccountsRequest) {
        return this.mGetAccountsApi.performAction(getAccountsRequest);
    }

    public Observable<GetPhoneNumberVerificationURLResponse> getPhoneNumberVerificationURL(GetPhoneNumberVerificationURLRequest getPhoneNumberVerificationURLRequest) {
        return this.mGetPhoneNumberVerificationURLApi.performAction(getPhoneNumberVerificationURLRequest);
    }
}
