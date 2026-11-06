package com.dee.app.contacts.core;

import com.dee.app.contacts.api.ContactsPermissionApiHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactsPermissionManager_MembersInjector implements MembersInjector<ContactsPermissionManager> {
    private final Provider<ContactsPermissionApiHandler> contactsPermissionApiHandlerProvider;

    public ContactsPermissionManager_MembersInjector(Provider<ContactsPermissionApiHandler> provider) {
        this.contactsPermissionApiHandlerProvider = provider;
    }

    public static MembersInjector<ContactsPermissionManager> create(Provider<ContactsPermissionApiHandler> provider) {
        return new ContactsPermissionManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.dee.app.contacts.core.ContactsPermissionManager.contactsPermissionApiHandler")
    public static void injectContactsPermissionApiHandler(ContactsPermissionManager contactsPermissionManager, ContactsPermissionApiHandler contactsPermissionApiHandler) {
        contactsPermissionManager.contactsPermissionApiHandler = contactsPermissionApiHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContactsPermissionManager contactsPermissionManager) {
        injectContactsPermissionApiHandler(contactsPermissionManager, this.contactsPermissionApiHandlerProvider.get());
    }
}
