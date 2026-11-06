package com.dee.app.contacts.core;

import com.dee.app.contacts.api.ContactsPermissionApiHandler;
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
public final class ContactsPermissionManager_Factory implements Factory<ContactsPermissionManager> {
    private final Provider<ContactsPermissionApiHandler> contactsPermissionApiHandlerProvider;

    public ContactsPermissionManager_Factory(Provider<ContactsPermissionApiHandler> provider) {
        this.contactsPermissionApiHandlerProvider = provider;
    }

    public static ContactsPermissionManager_Factory create(Provider<ContactsPermissionApiHandler> provider) {
        return new ContactsPermissionManager_Factory(provider);
    }

    public static ContactsPermissionManager newInstance() {
        return new ContactsPermissionManager();
    }

    @Override // javax.inject.Provider
    public ContactsPermissionManager get() {
        ContactsPermissionManager newInstance = newInstance();
        ContactsPermissionManager_MembersInjector.injectContactsPermissionApiHandler(newInstance, this.contactsPermissionApiHandlerProvider.get());
        return newInstance;
    }
}
