package com.amazon.alexa.voice.tta.cards;

import android.view.ViewGroup;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes19.dex */
public final class CardModule_ProvidesCardsContainerFactory implements Factory<ViewGroup> {
    private final CardModule module;

    public CardModule_ProvidesCardsContainerFactory(CardModule cardModule) {
        this.module = cardModule;
    }

    public static CardModule_ProvidesCardsContainerFactory create(CardModule cardModule) {
        return new CardModule_ProvidesCardsContainerFactory(cardModule);
    }

    public static ViewGroup providesCardsContainer(CardModule cardModule) {
        return (ViewGroup) Preconditions.checkNotNullFromProvides(cardModule.providesCardsContainer());
    }

    @Override // javax.inject.Provider
    public ViewGroup get() {
        return providesCardsContainer(this.module);
    }
}
