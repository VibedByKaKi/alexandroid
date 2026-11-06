package com.amazon.alexa.voice.tta.cards;

import com.amazon.alexa.voice.tta.RouterDelegate;
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
public final class CardModule_ProvidesCardsRouterDelegateFactory implements Factory<RouterDelegate> {
    private final Provider<Router> cardsRouterProvider;
    private final CardModule module;

    public CardModule_ProvidesCardsRouterDelegateFactory(CardModule cardModule, Provider<Router> provider) {
        this.module = cardModule;
        this.cardsRouterProvider = provider;
    }

    public static CardModule_ProvidesCardsRouterDelegateFactory create(CardModule cardModule, Provider<Router> provider) {
        return new CardModule_ProvidesCardsRouterDelegateFactory(cardModule, provider);
    }

    public static RouterDelegate providesCardsRouterDelegate(CardModule cardModule, Router router) {
        return (RouterDelegate) Preconditions.checkNotNullFromProvides(cardModule.providesCardsRouterDelegate(router));
    }

    @Override // javax.inject.Provider
    public RouterDelegate get() {
        return providesCardsRouterDelegate(this.module, this.cardsRouterProvider.get());
    }
}
