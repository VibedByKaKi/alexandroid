package com.amazon.alexa.voice.tta.cards;

import android.view.ViewGroup;
import com.amazon.regulator.Component;
import com.amazon.regulator.Router;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes19.dex */
public final class CardModule_ProvidesCardsRouterFactory implements Factory<Router> {
    private final Provider<ViewGroup> cardsContainerProvider;
    private final Provider<Component> componentProvider;
    private final CardModule module;

    public CardModule_ProvidesCardsRouterFactory(CardModule cardModule, Provider<ViewGroup> provider, Provider<Component> provider2) {
        this.module = cardModule;
        this.cardsContainerProvider = provider;
        this.componentProvider = provider2;
    }

    public static CardModule_ProvidesCardsRouterFactory create(CardModule cardModule, Provider<ViewGroup> provider, Provider<Component> provider2) {
        return new CardModule_ProvidesCardsRouterFactory(cardModule, provider, provider2);
    }

    public static Router providesCardsRouter(CardModule cardModule, ViewGroup viewGroup, Component component) {
        return (Router) Preconditions.checkNotNullFromProvides(cardModule.providesCardsRouter(viewGroup, component));
    }

    @Override // javax.inject.Provider
    public Router get() {
        return providesCardsRouter(this.module, this.cardsContainerProvider.get(), this.componentProvider.get());
    }
}
