package com.amazon.alexa.apl.dagger.module;

import com.amazon.alexa.apl.extension.ExtensionProxyProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ExtensionModule_ProvideExtensionProxyProviderFactory implements Factory<ExtensionProxyProvider> {
    private final ExtensionModule module;

    public ExtensionModule_ProvideExtensionProxyProviderFactory(ExtensionModule extensionModule) {
        this.module = extensionModule;
    }

    public static ExtensionModule_ProvideExtensionProxyProviderFactory create(ExtensionModule extensionModule) {
        return new ExtensionModule_ProvideExtensionProxyProviderFactory(extensionModule);
    }

    public static ExtensionProxyProvider provideExtensionProxyProvider(ExtensionModule extensionModule) {
        return (ExtensionProxyProvider) Preconditions.checkNotNullFromProvides(extensionModule.provideExtensionProxyProvider());
    }

    @Override // javax.inject.Provider
    public ExtensionProxyProvider get() {
        return provideExtensionProxyProvider(this.module);
    }
}
