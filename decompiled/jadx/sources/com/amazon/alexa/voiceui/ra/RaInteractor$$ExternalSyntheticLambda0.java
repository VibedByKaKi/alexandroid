package com.amazon.alexa.voiceui.ra;

import com.amazon.alexa.voice.tta.typing.TypingPresenter;
import com.amazon.alexa.voice.ui.tta.TtaRequestMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RaInteractor$$ExternalSyntheticLambda0 implements TtaRequestMessage {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CharSequence f$0;

    public /* synthetic */ RaInteractor$$ExternalSyntheticLambda0(CharSequence charSequence, int i) {
        this.$r8$classId = i;
        this.f$0 = charSequence;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaRequestMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public final String getMessage() {
        String lambda$onResultsSelected$0;
        String lambda$new$0;
        String lambda$new$3;
        int i = this.$r8$classId;
        CharSequence charSequence = this.f$0;
        switch (i) {
            case 0:
                lambda$onResultsSelected$0 = RaInteractor.lambda$onResultsSelected$0((String) charSequence);
                return lambda$onResultsSelected$0;
            case 1:
                lambda$new$0 = TypingPresenter.lambda$new$0((String) charSequence);
                return lambda$new$0;
            case 2:
                lambda$new$3 = TypingPresenter.lambda$new$3((String) charSequence);
                return lambda$new$3;
            case 3:
                return ((String) charSequence).toString();
            default:
                return charSequence.toString();
        }
    }
}
