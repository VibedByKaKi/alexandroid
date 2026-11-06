package com.dee.app.contacts.core;

import com.dee.app.contacts.api.CustomerIdentityApiHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CustomerIdentityManager_Factory implements Factory<CustomerIdentityManager> {
    private final Provider<CustomerIdentityApiHandler> mCustomerIdentityApiHandlerProvider;

    public CustomerIdentityManager_Factory(Provider<CustomerIdentityApiHandler> provider) {
        this.mCustomerIdentityApiHandlerProvider = provider;
    }

    public static CustomerIdentityManager_Factory create(Provider<CustomerIdentityApiHandler> provider) {
        return new CustomerIdentityManager_Factory(provider);
    }

    public static CustomerIdentityManager newInstance() {
        return new CustomerIdentityManager();
    }

    @Override // javax.inject.Provider
    public CustomerIdentityManager get() {
        CustomerIdentityManager newInstance = newInstance();
        CustomerIdentityManager_MembersInjector.injectMCustomerIdentityApiHandler(newInstance, this.mCustomerIdentityApiHandlerProvider.get());
        return newInstance;
    }
}
