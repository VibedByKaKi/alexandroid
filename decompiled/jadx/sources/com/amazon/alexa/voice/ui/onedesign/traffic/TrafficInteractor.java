package com.amazon.alexa.voice.ui.onedesign.traffic;

import com.amazon.alexa.voice.ui.onedesign.traffic.TrafficContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TrafficInteractor implements TrafficContract.Interactor {
    private final TrafficCardModel card;
    private final TrafficContract.Mediator mediator;

    public TrafficInteractor(TrafficCardModel trafficCardModel, TrafficContract.Mediator mediator) {
        this.card = trafficCardModel;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficContract.Interactor
    public TrafficCardModel getCard() {
        return this.card;
    }
}
