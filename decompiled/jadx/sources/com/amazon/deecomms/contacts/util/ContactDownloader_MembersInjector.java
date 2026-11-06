package com.amazon.deecomms.contacts.util;

import com.amazon.deecomms.core.CapabilitiesManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ContactDownloader_MembersInjector implements MembersInjector<ContactDownloader> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;

    public ContactDownloader_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.capabilitiesManagerProvider = provider;
    }

    public static MembersInjector<ContactDownloader> create(Provider<CapabilitiesManager> provider) {
        return new ContactDownloader_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.contacts.util.ContactDownloader.capabilitiesManager")
    public static void injectCapabilitiesManager(ContactDownloader contactDownloader, CapabilitiesManager capabilitiesManager) {
        contactDownloader.capabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContactDownloader contactDownloader) {
        injectCapabilitiesManager(contactDownloader, this.capabilitiesManagerProvider.get());
    }
}
