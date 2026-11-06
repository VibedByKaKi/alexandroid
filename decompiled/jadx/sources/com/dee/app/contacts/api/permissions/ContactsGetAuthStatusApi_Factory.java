package com.dee.app.contacts.api.permissions;

import android.content.SharedPreferences;
import com.dee.app.contacts.common.utils.PermissionsUtils;
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
public final class ContactsGetAuthStatusApi_Factory implements Factory<ContactsGetAuthStatusApi> {
    private final Provider<PermissionsUtils> permissionsUtilsProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ContactsGetAuthStatusApi_Factory(Provider<SharedPreferences> provider, Provider<PermissionsUtils> provider2) {
        this.sharedPreferencesProvider = provider;
        this.permissionsUtilsProvider = provider2;
    }

    public static ContactsGetAuthStatusApi_Factory create(Provider<SharedPreferences> provider, Provider<PermissionsUtils> provider2) {
        return new ContactsGetAuthStatusApi_Factory(provider, provider2);
    }

    public static ContactsGetAuthStatusApi newInstance(SharedPreferences sharedPreferences, PermissionsUtils permissionsUtils) {
        return new ContactsGetAuthStatusApi(sharedPreferences, permissionsUtils);
    }

    @Override // javax.inject.Provider
    public ContactsGetAuthStatusApi get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.permissionsUtilsProvider.get());
    }
}
