package com.amazon.alexa.client.alexaservice.base.attentionsystem;

import com.amazon.alexa.client.core.device.PersistentStorage;
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
public final class AttentionSystemSettingsStore_Factory implements Factory<AttentionSystemSettingsStore> {
    private final Provider<PersistentStorage> storageProvider;

    public AttentionSystemSettingsStore_Factory(Provider<PersistentStorage> provider) {
        this.storageProvider = provider;
    }

    public static AttentionSystemSettingsStore_Factory create(Provider<PersistentStorage> provider) {
        return new AttentionSystemSettingsStore_Factory(provider);
    }

    public static AttentionSystemSettingsStore newInstance(Lazy<PersistentStorage> lazy) {
        return new AttentionSystemSettingsStore(lazy);
    }

    @Override // javax.inject.Provider
    public AttentionSystemSettingsStore get() {
        return newInstance(DoubleCheck.lazy(this.storageProvider));
    }
}
