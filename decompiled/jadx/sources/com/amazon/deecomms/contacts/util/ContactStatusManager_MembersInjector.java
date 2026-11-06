package com.amazon.deecomms.contacts.util;

import android.content.Context;
import com.amazon.deecomms.api.CommsIdentityManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ContactStatusManager_MembersInjector implements MembersInjector<ContactStatusManager> {
    private final Provider<CommsIdentityManager> commsIdentityManagerProvider;
    private final Provider<Context> contextProvider;

    public ContactStatusManager_MembersInjector(Provider<Context> provider, Provider<CommsIdentityManager> provider2) {
        this.contextProvider = provider;
        this.commsIdentityManagerProvider = provider2;
    }

    public static MembersInjector<ContactStatusManager> create(Provider<Context> provider, Provider<CommsIdentityManager> provider2) {
        return new ContactStatusManager_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.contacts.util.ContactStatusManager.commsIdentityManager")
    public static void injectCommsIdentityManager(ContactStatusManager contactStatusManager, CommsIdentityManager commsIdentityManager) {
        contactStatusManager.commsIdentityManager = commsIdentityManager;
    }

    @InjectedFieldSignature("com.amazon.deecomms.contacts.util.ContactStatusManager.context")
    public static void injectContext(ContactStatusManager contactStatusManager, Context context) {
        contactStatusManager.context = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContactStatusManager contactStatusManager) {
        injectContext(contactStatusManager, this.contextProvider.get());
        injectCommsIdentityManager(contactStatusManager, this.commsIdentityManagerProvider.get());
    }
}
