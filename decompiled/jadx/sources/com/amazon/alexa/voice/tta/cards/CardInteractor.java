package com.amazon.alexa.voice.tta.cards;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaAplCommand;
import com.amazon.alexa.voice.tta.features.FeatureChecker;
import com.amazon.alexa.voice.tta.features.Features;
import io.reactivex.rxjava3.core.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class CardInteractor {
    private static final String TAG = "CardInteractor";
    private final CardModel cardModel;
    private final FeatureChecker featureChecker;

    @Inject
    public CardInteractor(FeatureChecker featureChecker, CardModel cardModel) {
        this.featureChecker = featureChecker;
        this.cardModel = cardModel;
    }

    public void initialize() {
        this.cardModel.initialize(isAplEnabled());
    }

    public boolean isAplEnabled() {
        boolean isFeatureEnabled = this.featureChecker.isFeatureEnabled(Features.APL);
        Automotive$$ExternalSyntheticOutline0.m8396m("isAplEnabled: ", TAG, isFeatureEnabled);
        return isFeatureEnabled;
    }

    public Observable<AlexaAplCommand> onInteractiveAlexaCard() {
        return this.cardModel.onInteractiveAlexaCard();
    }

    public void release() {
        this.cardModel.release();
    }
}
