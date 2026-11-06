package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.deecomms.settings.IdentityPreferencesProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CommsModule_ProvideIdentityPreferencesProviderFactory implements Factory<IdentityPreferencesProvider> {
    private final Provider<Context> contextProvider;
    private final CommsModule module;

    public CommsModule_ProvideIdentityPreferencesProviderFactory(CommsModule commsModule, Provider<Context> provider) {
        this.module = commsModule;
        this.contextProvider = provider;
    }

    public static CommsModule_ProvideIdentityPreferencesProviderFactory create(CommsModule commsModule, Provider<Context> provider) {
        return new CommsModule_ProvideIdentityPreferencesProviderFactory(commsModule, provider);
    }

    public static IdentityPreferencesProvider provideIdentityPreferencesProvider(CommsModule commsModule, Context context) {
        return (IdentityPreferencesProvider) Preconditions.checkNotNullFromProvides(commsModule.provideIdentityPreferencesProvider(context));
    }

    @Override // javax.inject.Provider
    public IdentityPreferencesProvider get() {
        return provideIdentityPreferencesProvider(this.module, this.contextProvider.get());
    }
}
