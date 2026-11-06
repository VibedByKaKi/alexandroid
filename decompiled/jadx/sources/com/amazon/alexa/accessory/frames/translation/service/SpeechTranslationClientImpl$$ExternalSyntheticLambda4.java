package com.amazon.alexa.accessory.frames.translation.service;

import com.amazon.alexa.accessory.frames.translation.service.SpeechTranslationClientImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SpeechTranslationClientImpl$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SpeechTranslationClientImpl$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit handleTextMessage$lambda$5;
        Unit onClosing$lambda$0;
        String _init_$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                handleTextMessage$lambda$5 = SpeechTranslationClientImpl.handleTextMessage$lambda$5((SpeechTranslationClientImpl) obj);
                return handleTextMessage$lambda$5;
            case 1:
                onClosing$lambda$0 = SpeechTranslationClientImpl.TranslationWebSocketListener.onClosing$lambda$0((SpeechTranslationClientImpl) obj);
                return onClosing$lambda$0;
            default:
                _init_$lambda$0 = SpeechTranslationClientImpl._init_$lambda$0((String) obj);
                return _init_$lambda$0;
        }
    }
}
