package com.amazon.alexa.apl.dagger.module;

import com.amazon.alexaext.ExtensionRegistrar;
import com.amazon.alexaext.IExtensionProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ExtensionModule_ProvideExtensionRegistrarFactory implements Factory<ExtensionRegistrar> {
    private final Provider<IExtensionProvider> mIExtensionProvider;
    private final ExtensionModule module;

    public ExtensionModule_ProvideExtensionRegistrarFactory(ExtensionModule extensionModule, Provider<IExtensionProvider> provider) {
        this.module = extensionModule;
        this.mIExtensionProvider = provider;
    }

    public static ExtensionModule_ProvideExtensionRegistrarFactory create(ExtensionModule extensionModule, Provider<IExtensionProvider> provider) {
        return new ExtensionModule_ProvideExtensionRegistrarFactory(extensionModule, provider);
    }

    public static ExtensionRegistrar provideExtensionRegistrar(ExtensionModule extensionModule, IExtensionProvider iExtensionProvider) {
        return (ExtensionRegistrar) Preconditions.checkNotNullFromProvides(extensionModule.provideExtensionRegistrar(iExtensionProvider));
    }

    @Override // javax.inject.Provider
    public ExtensionRegistrar get() {
        return provideExtensionRegistrar(this.module, this.mIExtensionProvider.get());
    }
}
