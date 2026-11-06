package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class PlayerStructurePersister_Factory implements Factory<PlayerStructurePersister> {
    private final Provider<PersistedDataLoader> storeProvider;

    public PlayerStructurePersister_Factory(Provider<PersistedDataLoader> provider) {
        this.storeProvider = provider;
    }

    public static PlayerStructurePersister_Factory create(Provider<PersistedDataLoader> provider) {
        return new PlayerStructurePersister_Factory(provider);
    }

    public static PlayerStructurePersister newInstance(Lazy<PersistedDataLoader> lazy) {
        return new PlayerStructurePersister(lazy);
    }

    @Override // javax.inject.Provider
    public PlayerStructurePersister get() {
        return newInstance(DoubleCheck.lazy(this.storeProvider));
    }
}
