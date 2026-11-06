package com.amazon.alexa.voice.ui.onedesign.remarkable.feedback;

import com.amazon.alexa.voice.ui.onedesign.remarkable.feedback.RemarkableAlexaFeedbackContract;
import com.amazon.alexa.voice.ui.tta.TtaNavigator;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemarkableAlexaFeedbackPresenter implements RemarkableAlexaFeedbackContract.Presenter {
    private final TtaEventSender eventSender;
    private final RemarkableAlexaFeedbackContract.Interactor interactor;
    private final TtaNavigator navigator;
    private final RemarkableAlexaFeedbackContract.View view;

    public RemarkableAlexaFeedbackPresenter(RemarkableAlexaFeedbackContract.View view, RemarkableAlexaFeedbackContract.Interactor interactor, TtaEventSender ttaEventSender, TtaNavigator ttaNavigator) {
        this.view = view;
        this.interactor = interactor;
        this.eventSender = ttaEventSender;
        this.navigator = ttaNavigator;
    }

    public void close() {
        this.interactor.close();
    }

    public void openThankYouPage() {
        this.interactor.openThankYouPage();
    }
}
