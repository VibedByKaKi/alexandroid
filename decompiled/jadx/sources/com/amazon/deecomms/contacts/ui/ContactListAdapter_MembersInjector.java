package com.amazon.deecomms.contacts.ui;

import com.amazon.deecomms.oobe.util.ThemingUpdateUtil;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ContactListAdapter_MembersInjector implements MembersInjector<ContactListAdapter> {
    private final Provider<ThemingUpdateUtil> themingUpdateUtilProvider;

    public ContactListAdapter_MembersInjector(Provider<ThemingUpdateUtil> provider) {
        this.themingUpdateUtilProvider = provider;
    }

    public static MembersInjector<ContactListAdapter> create(Provider<ThemingUpdateUtil> provider) {
        return new ContactListAdapter_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.contacts.ui.ContactListAdapter.themingUpdateUtil")
    public static void injectThemingUpdateUtil(ContactListAdapter contactListAdapter, ThemingUpdateUtil themingUpdateUtil) {
        contactListAdapter.themingUpdateUtil = themingUpdateUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContactListAdapter contactListAdapter) {
        injectThemingUpdateUtil(contactListAdapter, this.themingUpdateUtilProvider.get());
    }
}
