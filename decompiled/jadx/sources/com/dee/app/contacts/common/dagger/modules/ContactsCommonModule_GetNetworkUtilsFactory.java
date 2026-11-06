package com.dee.app.contacts.common.dagger.modules;

import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.dee.app.contacts.common.utils.NetworkUtils;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactsCommonModule_GetNetworkUtilsFactory implements Factory<NetworkUtils> {
    private final Provider<AlexaCommsCoreIdentityService> commsIdentityMangerProvider;
    private final ContactsCommonModule module;

    public ContactsCommonModule_GetNetworkUtilsFactory(ContactsCommonModule contactsCommonModule, Provider<AlexaCommsCoreIdentityService> provider) {
        this.module = contactsCommonModule;
        this.commsIdentityMangerProvider = provider;
    }

    public static ContactsCommonModule_GetNetworkUtilsFactory create(ContactsCommonModule contactsCommonModule, Provider<AlexaCommsCoreIdentityService> provider) {
        return new ContactsCommonModule_GetNetworkUtilsFactory(contactsCommonModule, provider);
    }

    public static NetworkUtils getNetworkUtils(ContactsCommonModule contactsCommonModule, AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        return (NetworkUtils) Preconditions.checkNotNullFromProvides(contactsCommonModule.getNetworkUtils(alexaCommsCoreIdentityService));
    }

    @Override // javax.inject.Provider
    public NetworkUtils get() {
        return getNetworkUtils(this.module, this.commsIdentityMangerProvider.get());
    }
}
