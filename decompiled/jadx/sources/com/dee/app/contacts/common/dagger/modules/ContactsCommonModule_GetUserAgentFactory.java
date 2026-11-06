package com.dee.app.contacts.common.dagger.modules;

import com.dee.app.contacts.common.utils.UserAgent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class ContactsCommonModule_GetUserAgentFactory implements Factory<UserAgent> {
    private final Provider<String> appNameProvider;
    private final ContactsCommonModule module;

    public ContactsCommonModule_GetUserAgentFactory(ContactsCommonModule contactsCommonModule, Provider<String> provider) {
        this.module = contactsCommonModule;
        this.appNameProvider = provider;
    }

    public static ContactsCommonModule_GetUserAgentFactory create(ContactsCommonModule contactsCommonModule, Provider<String> provider) {
        return new ContactsCommonModule_GetUserAgentFactory(contactsCommonModule, provider);
    }

    public static UserAgent getUserAgent(ContactsCommonModule contactsCommonModule, String str) {
        return (UserAgent) Preconditions.checkNotNullFromProvides(contactsCommonModule.getUserAgent(str));
    }

    @Override // javax.inject.Provider
    public UserAgent get() {
        return getUserAgent(this.module, this.appNameProvider.get());
    }
}
