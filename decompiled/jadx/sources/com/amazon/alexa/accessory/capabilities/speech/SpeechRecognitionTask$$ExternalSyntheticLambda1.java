package com.amazon.alexa.accessory.capabilities.speech;

import com.amazon.alexa.accessory.capabilities.speech.SpeechRecognitionTask;
import com.amazon.alexa.accessory.capabilities.speech.SpeechSettings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SpeechRecognitionTask$$ExternalSyntheticLambda1 implements SpeechRecognitionTask.Recognizer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SpeechRecognitionTask$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.accessory.capabilities.speech.SpeechRecognitionTask.Recognizer
    public final SpeechSession recognize(SpeechSettings speechSettings) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ((SpeechRecognizer) obj).recognizeSpeech(speechSettings);
            default:
                return ((SpeechSettings.SpeechRequest) obj).proceed(speechSettings);
        }
    }
}
