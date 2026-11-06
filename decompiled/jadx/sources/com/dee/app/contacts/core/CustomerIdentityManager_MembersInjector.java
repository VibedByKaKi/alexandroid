package com.dee.app.contacts.core;

import com.dee.app.contacts.api.CustomerIdentityApiHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CustomerIdentityManager_MembersInjector implements MembersInjector<CustomerIdentityManager> {
    private final Provider<CustomerIdentityApiHandler> mCustomerIdentityApiHandlerProvider;

    public CustomerIdentityManager_MembersInjector(Provider<CustomerIdentityApiHandler> provider) {
        this.mCustomerIdentityApiHandlerProvider = provider;
    }

    public static MembersInjector<CustomerIdentityManager> create(Provider<CustomerIdentityApiHandler> provider) {
        return new CustomerIdentityManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.dee.app.contacts.core.CustomerIdentityManager.mCustomerIdentityApiHandler")
    public static void injectMCustomerIdentityApiHandler(CustomerIdentityManager customerIdentityManager, CustomerIdentityApiHandler customerIdentityApiHandler) {
        customerIdentityManager.mCustomerIdentityApiHandler = customerIdentityApiHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CustomerIdentityManager customerIdentityManager) {
        injectMCustomerIdentityApiHandler(customerIdentityManager, this.mCustomerIdentityApiHandlerProvider.get());
    }
}
