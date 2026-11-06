package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voice.ui.provider.CardFactoryWithMode;
import com.amazon.alexa.voice.ui.window.WindowInteractor;
import com.amazon.alexa.voiceui.RouterDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class DefaultCardView_Factory implements Factory<DefaultCardView> {
    private final Provider<CardFactoryWithMode> cardFactoryProvider;
    private final Provider<RouterDelegate> cardRouterProvider;
    private final Provider<WindowInteractor> windowInteractorProvider;

    public DefaultCardView_Factory(Provider<RouterDelegate> provider, Provider<CardFactoryWithMode> provider2, Provider<WindowInteractor> provider3) {
        this.cardRouterProvider = provider;
        this.cardFactoryProvider = provider2;
        this.windowInteractorProvider = provider3;
    }

    public static DefaultCardView_Factory create(Provider<RouterDelegate> provider, Provider<CardFactoryWithMode> provider2, Provider<WindowInteractor> provider3) {
        return new DefaultCardView_Factory(provider, provider2, provider3);
    }

    public static DefaultCardView newInstance(RouterDelegate routerDelegate, CardFactoryWithMode cardFactoryWithMode, WindowInteractor windowInteractor) {
        return new DefaultCardView(routerDelegate, cardFactoryWithMode, windowInteractor);
    }

    @Override // javax.inject.Provider
    public DefaultCardView get() {
        return newInstance(this.cardRouterProvider.get(), this.cardFactoryProvider.get(), this.windowInteractorProvider.get());
    }
}
