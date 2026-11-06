package com.amazon.alexa.client.alexaservice.base.attentionsystem;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AttentionSystemAuthority_Factory implements Factory<AttentionSystemAuthority> {
    private final Provider<AttentionSystemSettingsStore> attentionSystemSettingsStoreProvider;

    public AttentionSystemAuthority_Factory(Provider<AttentionSystemSettingsStore> provider) {
        this.attentionSystemSettingsStoreProvider = provider;
    }

    public static AttentionSystemAuthority_Factory create(Provider<AttentionSystemSettingsStore> provider) {
        return new AttentionSystemAuthority_Factory(provider);
    }

    public static AttentionSystemAuthority newInstance(AttentionSystemSettingsStore attentionSystemSettingsStore) {
        return new AttentionSystemAuthority(attentionSystemSettingsStore);
    }

    @Override // javax.inject.Provider
    public AttentionSystemAuthority get() {
        return newInstance(this.attentionSystemSettingsStoreProvider.get());
    }
}
