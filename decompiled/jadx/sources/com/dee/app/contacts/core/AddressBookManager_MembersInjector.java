package com.dee.app.contacts.core;

import com.dee.app.contacts.api.AddressBooksApiHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AddressBookManager_MembersInjector implements MembersInjector<AddressBookManager> {
    private final Provider<AddressBooksApiHandler> mAddressBooksApiHandlerProvider;

    public AddressBookManager_MembersInjector(Provider<AddressBooksApiHandler> provider) {
        this.mAddressBooksApiHandlerProvider = provider;
    }

    public static MembersInjector<AddressBookManager> create(Provider<AddressBooksApiHandler> provider) {
        return new AddressBookManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.dee.app.contacts.core.AddressBookManager.mAddressBooksApiHandler")
    public static void injectMAddressBooksApiHandler(AddressBookManager addressBookManager, AddressBooksApiHandler addressBooksApiHandler) {
        addressBookManager.mAddressBooksApiHandler = addressBooksApiHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AddressBookManager addressBookManager) {
        injectMAddressBooksApiHandler(addressBookManager, this.mAddressBooksApiHandlerProvider.get());
    }
}
