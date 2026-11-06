package com.amazon.deecomms.contacts.ui;

import com.amazon.deecomms.common.ApplicationManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ManageContactsFragment_MembersInjector implements MembersInjector<ManageContactsFragment> {
    private final Provider<ApplicationManager> applicationManagerProvider;

    public ManageContactsFragment_MembersInjector(Provider<ApplicationManager> provider) {
        this.applicationManagerProvider = provider;
    }

    public static MembersInjector<ManageContactsFragment> create(Provider<ApplicationManager> provider) {
        return new ManageContactsFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.contacts.ui.ManageContactsFragment.applicationManager")
    public static void injectApplicationManager(ManageContactsFragment manageContactsFragment, ApplicationManager applicationManager) {
        manageContactsFragment.applicationManager = applicationManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ManageContactsFragment manageContactsFragment) {
        injectApplicationManager(manageContactsFragment, this.applicationManagerProvider.get());
    }
}
