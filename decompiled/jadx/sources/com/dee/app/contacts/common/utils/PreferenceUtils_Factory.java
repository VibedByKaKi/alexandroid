package com.dee.app.contacts.common.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class PreferenceUtils_Factory implements Factory<PreferenceUtils> {
    private final Provider<String> appNameProvider;

    public PreferenceUtils_Factory(Provider<String> provider) {
        this.appNameProvider = provider;
    }

    public static PreferenceUtils_Factory create(Provider<String> provider) {
        return new PreferenceUtils_Factory(provider);
    }

    public static PreferenceUtils newInstance(String str) {
        return new PreferenceUtils(str);
    }

    @Override // javax.inject.Provider
    public PreferenceUtils get() {
        return newInstance(this.appNameProvider.get());
    }
}
