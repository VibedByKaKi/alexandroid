package com.amazon.dee.app.dependencies;

import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;
import com.amazon.alexa.viewmanagement.impl.ViewManagerDelegate;
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
public final class ViewManagerModule_ProvideViewManagerEventNotifierFactory implements Factory<ViewManagerEventNotifier> {
    private final Provider<ViewManagerDelegate> delegateProvider;
    private final ViewManagerModule module;

    public ViewManagerModule_ProvideViewManagerEventNotifierFactory(ViewManagerModule viewManagerModule, Provider<ViewManagerDelegate> provider) {
        this.module = viewManagerModule;
        this.delegateProvider = provider;
    }

    public static ViewManagerModule_ProvideViewManagerEventNotifierFactory create(ViewManagerModule viewManagerModule, Provider<ViewManagerDelegate> provider) {
        return new ViewManagerModule_ProvideViewManagerEventNotifierFactory(viewManagerModule, provider);
    }

    public static ViewManagerEventNotifier provideViewManagerEventNotifier(ViewManagerModule viewManagerModule, ViewManagerDelegate viewManagerDelegate) {
        return (ViewManagerEventNotifier) Preconditions.checkNotNullFromProvides(viewManagerModule.provideViewManagerEventNotifier(viewManagerDelegate));
    }

    @Override // javax.inject.Provider
    public ViewManagerEventNotifier get() {
        return provideViewManagerEventNotifier(this.module, this.delegateProvider.get());
    }
}
