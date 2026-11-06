package com.amazon.deecomms.core;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class CapabilitiesManager_Factory implements Factory<CapabilitiesManager> {
    private final Provider<Context> contextProvider;
    private final Provider<FeatureFlagManager> ffManagerProvider;

    public CapabilitiesManager_Factory(Provider<FeatureFlagManager> provider, Provider<Context> provider2) {
        this.ffManagerProvider = provider;
        this.contextProvider = provider2;
    }

    public static CapabilitiesManager_Factory create(Provider<FeatureFlagManager> provider, Provider<Context> provider2) {
        return new CapabilitiesManager_Factory(provider, provider2);
    }

    public static CapabilitiesManager newInstance(FeatureFlagManager featureFlagManager, Context context) {
        return new CapabilitiesManager(featureFlagManager, context);
    }

    @Override // javax.inject.Provider
    public CapabilitiesManager get() {
        return newInstance(this.ffManagerProvider.get(), this.contextProvider.get());
    }
}
