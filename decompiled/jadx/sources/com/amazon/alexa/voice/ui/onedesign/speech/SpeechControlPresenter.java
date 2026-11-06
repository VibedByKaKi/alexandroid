package com.amazon.alexa.voice.ui.onedesign.speech;

import com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor;
import com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SpeechControlPresenter implements SpeechControlContract.Presenter {
    private final CardMetricsInteractor cardMetricsInteractor;
    private final SpeechControlContract.Interactor interactor;
    private final SpeechControlContract.View view;

    public SpeechControlPresenter(SpeechControlContract.View view, SpeechControlContract.Interactor interactor, CardMetricsInteractor cardMetricsInteractor) {
        this.view = view;
        this.interactor = interactor;
        this.cardMetricsInteractor = cardMetricsInteractor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Presenter
    public void buttonClicked() {
        this.cardMetricsInteractor.startTimerWhenTappingIngressButtonOnCard();
        this.interactor.cancel();
        this.interactor.recognizeSpeech();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Presenter
    public void start() {
        this.view.displayVoiceIngressButton(this.interactor.shouldEmbedVoiceIngress());
    }
}
