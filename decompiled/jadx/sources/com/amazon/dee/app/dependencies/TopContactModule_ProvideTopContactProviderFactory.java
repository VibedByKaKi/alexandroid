package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.accessory.frames.TopContactProvider;
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
public final class TopContactModule_ProvideTopContactProviderFactory implements Factory<TopContactProvider> {
    private final Provider<Context> contextProvider;
    private final TopContactModule module;

    public TopContactModule_ProvideTopContactProviderFactory(TopContactModule topContactModule, Provider<Context> provider) {
        this.module = topContactModule;
        this.contextProvider = provider;
    }

    public static TopContactModule_ProvideTopContactProviderFactory create(TopContactModule topContactModule, Provider<Context> provider) {
        return new TopContactModule_ProvideTopContactProviderFactory(topContactModule, provider);
    }

    public static TopContactProvider provideTopContactProvider(TopContactModule topContactModule, Context context) {
        return (TopContactProvider) Preconditions.checkNotNullFromProvides(topContactModule.provideTopContactProvider(context));
    }

    @Override // javax.inject.Provider
    public TopContactProvider get() {
        return provideTopContactProvider(this.module, this.contextProvider.get());
    }
}
