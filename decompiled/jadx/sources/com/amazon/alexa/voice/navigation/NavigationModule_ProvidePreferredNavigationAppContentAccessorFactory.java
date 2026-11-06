package com.amazon.alexa.voice.navigation;

import android.content.Context;
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
/* loaded from: classes19.dex */
public final class NavigationModule_ProvidePreferredNavigationAppContentAccessorFactory implements Factory<PreferredNavigationAppContentAccessor> {
    private final Provider<Context> contextProvider;

    public NavigationModule_ProvidePreferredNavigationAppContentAccessorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static NavigationModule_ProvidePreferredNavigationAppContentAccessorFactory create(Provider<Context> provider) {
        return new NavigationModule_ProvidePreferredNavigationAppContentAccessorFactory(provider);
    }

    public static PreferredNavigationAppContentAccessor providePreferredNavigationAppContentAccessor(Context context) {
        return (PreferredNavigationAppContentAccessor) Preconditions.checkNotNullFromProvides(NavigationModule.providePreferredNavigationAppContentAccessor(context));
    }

    @Override // javax.inject.Provider
    public PreferredNavigationAppContentAccessor get() {
        return providePreferredNavigationAppContentAccessor(this.contextProvider.get());
    }
}
