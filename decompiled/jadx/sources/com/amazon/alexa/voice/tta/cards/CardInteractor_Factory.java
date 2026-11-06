package com.amazon.alexa.voice.tta.cards;

import com.amazon.alexa.voice.tta.features.FeatureChecker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class CardInteractor_Factory implements Factory<CardInteractor> {
    private final Provider<CardModel> cardModelProvider;
    private final Provider<FeatureChecker> featureCheckerProvider;

    public CardInteractor_Factory(Provider<FeatureChecker> provider, Provider<CardModel> provider2) {
        this.featureCheckerProvider = provider;
        this.cardModelProvider = provider2;
    }

    public static CardInteractor_Factory create(Provider<FeatureChecker> provider, Provider<CardModel> provider2) {
        return new CardInteractor_Factory(provider, provider2);
    }

    public static CardInteractor newInstance(FeatureChecker featureChecker, CardModel cardModel) {
        return new CardInteractor(featureChecker, cardModel);
    }

    @Override // javax.inject.Provider
    public CardInteractor get() {
        return newInstance(this.featureCheckerProvider.get(), this.cardModelProvider.get());
    }
}
