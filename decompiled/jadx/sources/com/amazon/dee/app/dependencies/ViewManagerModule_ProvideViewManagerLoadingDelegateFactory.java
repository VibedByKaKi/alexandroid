package com.amazon.dee.app.dependencies;

import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;
import com.amazon.alexa.viewmanagement.api.ViewManagerLoadingDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ViewManagerModule_ProvideViewManagerLoadingDelegateFactory implements Factory<ViewManagerLoadingDelegate> {
    private final Provider<ViewManagerEventNotifier> eventNotifierProvider;
    private final ViewManagerModule module;

    public ViewManagerModule_ProvideViewManagerLoadingDelegateFactory(ViewManagerModule viewManagerModule, Provider<ViewManagerEventNotifier> provider) {
        this.module = viewManagerModule;
        this.eventNotifierProvider = provider;
    }

    public static ViewManagerModule_ProvideViewManagerLoadingDelegateFactory create(ViewManagerModule viewManagerModule, Provider<ViewManagerEventNotifier> provider) {
        return new ViewManagerModule_ProvideViewManagerLoadingDelegateFactory(viewManagerModule, provider);
    }

    public static ViewManagerLoadingDelegate provideViewManagerLoadingDelegate(ViewManagerModule viewManagerModule, ViewManagerEventNotifier viewManagerEventNotifier) {
        return (ViewManagerLoadingDelegate) Preconditions.checkNotNullFromProvides(viewManagerModule.provideViewManagerLoadingDelegate(viewManagerEventNotifier));
    }

    @Override // javax.inject.Provider
    public ViewManagerLoadingDelegate get() {
        return provideViewManagerLoadingDelegate(this.module, this.eventNotifierProvider.get());
    }
}
