package com.amazon.alexa.voice.sdk;

import com.amazon.alexa.api.compat.model.AlexaStateV2;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AlexaStateTracker$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AlexaStateTracker$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        boolean isProcessing;
        Boolean lambda$onSpeaking$1;
        AlexaStateV2 alexaStateV2 = (AlexaStateV2) obj;
        switch (this.$r8$classId) {
            case 0:
                isProcessing = AlexaStateTracker.isProcessing(alexaStateV2);
                break;
            case 1:
                isProcessing = AlexaStateTracker.isListeningOrProcessing(alexaStateV2);
                break;
            case 2:
                isProcessing = AlexaStateTracker.isNotRunning(alexaStateV2);
                break;
            case 3:
                lambda$onSpeaking$1 = AlexaStateTracker.lambda$onSpeaking$1(alexaStateV2);
                return lambda$onSpeaking$1;
            default:
                isProcessing = AlexaStateTracker.isListening(alexaStateV2);
                break;
        }
        return Boolean.valueOf(isProcessing);
    }
}
