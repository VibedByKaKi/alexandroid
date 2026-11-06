package com.amazon.dee.app.services.datastore;

import android.content.Context;
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
public final class DataStoreHelper_Factory implements Factory<DataStoreHelper> {
    private final Provider<Context> contextProvider;

    public DataStoreHelper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static DataStoreHelper_Factory create(Provider<Context> provider) {
        return new DataStoreHelper_Factory(provider);
    }

    public static DataStoreHelper newInstance(Context context) {
        return new DataStoreHelper(context);
    }

    @Override // javax.inject.Provider
    public DataStoreHelper get() {
        return newInstance(this.contextProvider.get());
    }
}
