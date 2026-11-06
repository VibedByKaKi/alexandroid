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
public final class SyncUtils_Factory implements Factory<SyncUtils> {
    private final Provider<String> appNameProvider;

    public SyncUtils_Factory(Provider<String> provider) {
        this.appNameProvider = provider;
    }

    public static SyncUtils_Factory create(Provider<String> provider) {
        return new SyncUtils_Factory(provider);
    }

    public static SyncUtils newInstance(String str) {
        return new SyncUtils(str);
    }

    @Override // javax.inject.Provider
    public SyncUtils get() {
        return newInstance(this.appNameProvider.get());
    }
}
