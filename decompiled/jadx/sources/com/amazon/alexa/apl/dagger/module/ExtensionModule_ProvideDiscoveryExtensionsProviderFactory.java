package com.amazon.alexa.apl.dagger.module;

import android.content.Context;
import com.amazon.alexaext.IExtensionProvider;
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
/* loaded from: classes16.dex */
public final class ExtensionModule_ProvideDiscoveryExtensionsProviderFactory implements Factory<IExtensionProvider> {
    private final Provider<Context> mContextProvider;
    private final ExtensionModule module;

    public ExtensionModule_ProvideDiscoveryExtensionsProviderFactory(ExtensionModule extensionModule, Provider<Context> provider) {
        this.module = extensionModule;
        this.mContextProvider = provider;
    }

    public static ExtensionModule_ProvideDiscoveryExtensionsProviderFactory create(ExtensionModule extensionModule, Provider<Context> provider) {
        return new ExtensionModule_ProvideDiscoveryExtensionsProviderFactory(extensionModule, provider);
    }

    public static IExtensionProvider provideDiscoveryExtensionsProvider(ExtensionModule extensionModule, Context context) {
        return (IExtensionProvider) Preconditions.checkNotNullFromProvides(extensionModule.provideDiscoveryExtensionsProvider(context));
    }

    @Override // javax.inject.Provider
    public IExtensionProvider get() {
        return provideDiscoveryExtensionsProvider(this.module, this.mContextProvider.get());
    }
}
