package com.amazon.alexa.hho.navigation.dependency;

import android.content.Context;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvidePreferredNavigationAppContentAccessorFactory implements Factory<PreferredNavigationAppContentAccessor> {
    private final Provider<Context> contextProvider;

    public SharedNavigationModule_ProvidePreferredNavigationAppContentAccessorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static SharedNavigationModule_ProvidePreferredNavigationAppContentAccessorFactory create(Provider<Context> provider) {
        return new SharedNavigationModule_ProvidePreferredNavigationAppContentAccessorFactory(provider);
    }

    public static PreferredNavigationAppContentAccessor providePreferredNavigationAppContentAccessor(Context context) {
        return (PreferredNavigationAppContentAccessor) Preconditions.checkNotNullFromProvides(SharedNavigationModule.providePreferredNavigationAppContentAccessor(context));
    }

    @Override // javax.inject.Provider
    public PreferredNavigationAppContentAccessor get() {
        return providePreferredNavigationAppContentAccessor(this.contextProvider.get());
    }
}
