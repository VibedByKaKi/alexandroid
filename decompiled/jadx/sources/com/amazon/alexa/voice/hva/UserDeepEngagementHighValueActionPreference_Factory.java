package com.amazon.alexa.voice.hva;

import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class UserDeepEngagementHighValueActionPreference_Factory implements Factory<UserDeepEngagementHighValueActionPreference> {
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public UserDeepEngagementHighValueActionPreference_Factory(Provider<PersistentStorage.Factory> provider) {
        this.storageFactoryProvider = provider;
    }

    public static UserDeepEngagementHighValueActionPreference_Factory create(Provider<PersistentStorage.Factory> provider) {
        return new UserDeepEngagementHighValueActionPreference_Factory(provider);
    }

    public static UserDeepEngagementHighValueActionPreference newInstance(PersistentStorage.Factory factory) {
        return new UserDeepEngagementHighValueActionPreference(factory);
    }

    @Override // javax.inject.Provider
    public UserDeepEngagementHighValueActionPreference get() {
        return newInstance(this.storageFactoryProvider.get());
    }
}
