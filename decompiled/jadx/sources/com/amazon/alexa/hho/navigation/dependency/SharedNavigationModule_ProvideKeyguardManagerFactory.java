package com.amazon.alexa.hho.navigation.dependency;

import android.app.KeyguardManager;
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
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvideKeyguardManagerFactory implements Factory<KeyguardManager> {
    private final Provider<Context> contextProvider;
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvideKeyguardManagerFactory(SharedNavigationModule sharedNavigationModule, Provider<Context> provider) {
        this.module = sharedNavigationModule;
        this.contextProvider = provider;
    }

    public static SharedNavigationModule_ProvideKeyguardManagerFactory create(SharedNavigationModule sharedNavigationModule, Provider<Context> provider) {
        return new SharedNavigationModule_ProvideKeyguardManagerFactory(sharedNavigationModule, provider);
    }

    public static KeyguardManager provideKeyguardManager(SharedNavigationModule sharedNavigationModule, Context context) {
        return (KeyguardManager) Preconditions.checkNotNullFromProvides(sharedNavigationModule.provideKeyguardManager(context));
    }

    @Override // javax.inject.Provider
    public KeyguardManager get() {
        return provideKeyguardManager(this.module, this.contextProvider.get());
    }
}
