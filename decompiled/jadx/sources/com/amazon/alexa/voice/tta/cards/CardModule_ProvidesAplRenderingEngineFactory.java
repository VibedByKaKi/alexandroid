package com.amazon.alexa.voice.tta.cards;

import android.content.Context;
import com.amazon.alexa.apl.APLRenderingEngine;
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
/* loaded from: classes19.dex */
public final class CardModule_ProvidesAplRenderingEngineFactory implements Factory<APLRenderingEngine> {
    private final Provider<Context> contextProvider;
    private final CardModule module;

    public CardModule_ProvidesAplRenderingEngineFactory(CardModule cardModule, Provider<Context> provider) {
        this.module = cardModule;
        this.contextProvider = provider;
    }

    public static CardModule_ProvidesAplRenderingEngineFactory create(CardModule cardModule, Provider<Context> provider) {
        return new CardModule_ProvidesAplRenderingEngineFactory(cardModule, provider);
    }

    public static APLRenderingEngine providesAplRenderingEngine(CardModule cardModule, Context context) {
        return (APLRenderingEngine) Preconditions.checkNotNullFromProvides(cardModule.providesAplRenderingEngine(context));
    }

    @Override // javax.inject.Provider
    public APLRenderingEngine get() {
        return providesAplRenderingEngine(this.module, this.contextProvider.get());
    }
}
