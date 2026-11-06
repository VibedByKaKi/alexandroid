package com.amazon.dee.app.services.datastore;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class DefaultDataStoreService_Factory implements Factory<DefaultDataStoreService> {
    private final Provider<DataStoreHelper> dataStoreHelperProvider;

    public DefaultDataStoreService_Factory(Provider<DataStoreHelper> provider) {
        this.dataStoreHelperProvider = provider;
    }

    public static DefaultDataStoreService_Factory create(Provider<DataStoreHelper> provider) {
        return new DefaultDataStoreService_Factory(provider);
    }

    public static DefaultDataStoreService newInstance(DataStoreHelper dataStoreHelper) {
        return new DefaultDataStoreService(dataStoreHelper);
    }

    @Override // javax.inject.Provider
    public DefaultDataStoreService get() {
        return newInstance(this.dataStoreHelperProvider.get());
    }
}
