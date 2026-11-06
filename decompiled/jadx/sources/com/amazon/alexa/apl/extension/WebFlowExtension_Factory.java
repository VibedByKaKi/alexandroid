package com.amazon.alexa.apl.extension;

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
/* loaded from: classes16.dex */
public final class WebFlowExtension_Factory implements Factory<WebFlowExtension> {
    private final Provider<Context> mContextProvider;
    private final Provider<IExtensionEventHandler> mExtensionEventHandlerProvider;

    public WebFlowExtension_Factory(Provider<IExtensionEventHandler> provider, Provider<Context> provider2) {
        this.mExtensionEventHandlerProvider = provider;
        this.mContextProvider = provider2;
    }

    public static WebFlowExtension_Factory create(Provider<IExtensionEventHandler> provider, Provider<Context> provider2) {
        return new WebFlowExtension_Factory(provider, provider2);
    }

    public static WebFlowExtension newInstance(IExtensionEventHandler iExtensionEventHandler, Context context) {
        return new WebFlowExtension(iExtensionEventHandler, context);
    }

    @Override // javax.inject.Provider
    public WebFlowExtension get() {
        return newInstance(this.mExtensionEventHandlerProvider.get(), this.mContextProvider.get());
    }
}
