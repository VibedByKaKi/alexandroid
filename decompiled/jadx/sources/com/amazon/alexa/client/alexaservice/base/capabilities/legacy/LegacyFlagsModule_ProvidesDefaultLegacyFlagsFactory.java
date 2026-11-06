package com.amazon.alexa.client.alexaservice.base.capabilities.legacy;

import android.view.WindowManager;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class LegacyFlagsModule_ProvidesDefaultLegacyFlagsFactory implements Factory<LegacyFlags> {
    private final Provider<ClientConfiguration> clientConfigurationProvider;
    private final LegacyFlagsModule module;
    private final Provider<WindowManager> windowManagerProvider;

    public LegacyFlagsModule_ProvidesDefaultLegacyFlagsFactory(LegacyFlagsModule legacyFlagsModule, Provider<WindowManager> provider, Provider<ClientConfiguration> provider2) {
        this.module = legacyFlagsModule;
        this.windowManagerProvider = provider;
        this.clientConfigurationProvider = provider2;
    }

    public static LegacyFlagsModule_ProvidesDefaultLegacyFlagsFactory create(LegacyFlagsModule legacyFlagsModule, Provider<WindowManager> provider, Provider<ClientConfiguration> provider2) {
        return new LegacyFlagsModule_ProvidesDefaultLegacyFlagsFactory(legacyFlagsModule, provider, provider2);
    }

    public static LegacyFlags providesDefaultLegacyFlags(LegacyFlagsModule legacyFlagsModule, WindowManager windowManager, Lazy<ClientConfiguration> lazy) {
        return (LegacyFlags) Preconditions.checkNotNullFromProvides(legacyFlagsModule.providesDefaultLegacyFlags(windowManager, lazy));
    }

    @Override // javax.inject.Provider
    public LegacyFlags get() {
        return providesDefaultLegacyFlags(this.module, this.windowManagerProvider.get(), DoubleCheck.lazy(this.clientConfigurationProvider));
    }
}
