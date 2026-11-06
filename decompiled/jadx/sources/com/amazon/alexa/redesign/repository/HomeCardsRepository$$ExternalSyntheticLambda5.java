package com.amazon.alexa.redesign.repository;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeCardsRepository$$ExternalSyntheticLambda5 implements ObservableOnSubscribe, CompletableOnSubscribe, SingleOnSubscribe {
    public final /* synthetic */ HomeCardsRepository f$0;

    public /* synthetic */ HomeCardsRepository$$ExternalSyntheticLambda5(HomeCardsRepository homeCardsRepository) {
        this.f$0 = homeCardsRepository;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        HomeCardsRepository.clearHomeCardsFromCache$lambda$7(this.f$0, completableEmitter);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        HomeCardsRepository._get_rawHomeCardsFromCache_$lambda$0(this.f$0, observableEmitter);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        HomeCardsRepository._get_cardsFromMockedData_$lambda$8(this.f$0, singleEmitter);
    }
}
