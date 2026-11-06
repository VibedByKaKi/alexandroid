package com.amazon.alexa.presence.library;

import android.content.Context;
import com.amazon.alexa.presence.library.storage.PersistentLocalStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ContextHelper_Factory implements Factory<ContextHelper> {
    private final Provider<Context> contextProvider;
    private final Provider<PersistentLocalStorage.PresenceDataStore> dataStoreProvider;

    public ContextHelper_Factory(Provider<Context> provider, Provider<PersistentLocalStorage.PresenceDataStore> provider2) {
        this.contextProvider = provider;
        this.dataStoreProvider = provider2;
    }

    public static ContextHelper_Factory create(Provider<Context> provider, Provider<PersistentLocalStorage.PresenceDataStore> provider2) {
        return new ContextHelper_Factory(provider, provider2);
    }

    public static ContextHelper newInstance(Context context, PersistentLocalStorage.PresenceDataStore presenceDataStore) {
        return new ContextHelper(context, presenceDataStore);
    }

    @Override // javax.inject.Provider
    public ContextHelper get() {
        return newInstance(this.contextProvider.get(), this.dataStoreProvider.get());
    }
}
