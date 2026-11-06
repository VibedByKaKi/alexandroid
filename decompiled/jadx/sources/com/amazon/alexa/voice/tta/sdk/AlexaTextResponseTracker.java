package com.amazon.alexa.voice.tta.sdk;

import com.amazon.alexa.api.AlexaTextResponseListener;
import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.voice.tta.typing.TextTtaResponseMessage;
import com.amazon.alexa.voice.tta.typing.TtaMessageSanitizer;
import com.amazon.alexa.voice.ui.tta.TtaResponseMessage;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaTextResponseTracker implements AlexaTextResponseListener {
    private final TtaMessageSanitizer messageSanitizer;
    private final PublishSubject<TtaResponseMessage> ttaResponse = PublishSubject.create();

    public AlexaTextResponseTracker(TtaMessageSanitizer ttaMessageSanitizer) {
        this.messageSanitizer = ttaMessageSanitizer;
    }

    public void onResponse(TtaResponseMessage ttaResponseMessage) {
        this.ttaResponse.onNext(ttaResponseMessage);
    }

    @Override // com.amazon.alexa.api.AlexaTextResponseListener
    public void onTextReceived(TextResponse textResponse) {
        if (textResponse == null || textResponse.getTitle().isEmpty()) {
            return;
        }
        TextTtaResponseMessage textTtaResponseMessage = new TextTtaResponseMessage(this.messageSanitizer.sanitizeResponse(textResponse.getTitle()));
        textTtaResponseMessage.setDialogRequestId(textResponse.getDialogRequestId());
        this.ttaResponse.onNext(textTtaResponseMessage);
    }

    public Observable<TtaResponseMessage> onResponse() {
        return this.ttaResponse;
    }
}
