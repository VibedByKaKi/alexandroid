package com.dee.app.contactsLibrary.core;

import com.dee.app.contactsLibrary.db.reduxpersist.ReduxPersistContactsDBManager;
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
public final class ContactsConnectorManager_Factory implements Factory<ContactsConnectorManager> {
    private final Provider<ReduxPersistContactsDBManager> reduxPersistContactsDBManagerProvider;

    public ContactsConnectorManager_Factory(Provider<ReduxPersistContactsDBManager> provider) {
        this.reduxPersistContactsDBManagerProvider = provider;
    }

    public static ContactsConnectorManager_Factory create(Provider<ReduxPersistContactsDBManager> provider) {
        return new ContactsConnectorManager_Factory(provider);
    }

    public static ContactsConnectorManager newInstance(ReduxPersistContactsDBManager reduxPersistContactsDBManager) {
        return new ContactsConnectorManager(reduxPersistContactsDBManager);
    }

    @Override // javax.inject.Provider
    public ContactsConnectorManager get() {
        return newInstance(this.reduxPersistContactsDBManagerProvider.get());
    }
}
