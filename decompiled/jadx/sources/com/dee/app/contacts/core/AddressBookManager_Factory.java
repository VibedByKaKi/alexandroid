package com.dee.app.contacts.core;

import com.dee.app.contacts.api.AddressBooksApiHandler;
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
public final class AddressBookManager_Factory implements Factory<AddressBookManager> {
    private final Provider<AddressBooksApiHandler> mAddressBooksApiHandlerProvider;

    public AddressBookManager_Factory(Provider<AddressBooksApiHandler> provider) {
        this.mAddressBooksApiHandlerProvider = provider;
    }

    public static AddressBookManager_Factory create(Provider<AddressBooksApiHandler> provider) {
        return new AddressBookManager_Factory(provider);
    }

    public static AddressBookManager newInstance() {
        return new AddressBookManager();
    }

    @Override // javax.inject.Provider
    public AddressBookManager get() {
        AddressBookManager newInstance = newInstance();
        AddressBookManager_MembersInjector.injectMAddressBooksApiHandler(newInstance, this.mAddressBooksApiHandlerProvider.get());
        return newInstance;
    }
}
