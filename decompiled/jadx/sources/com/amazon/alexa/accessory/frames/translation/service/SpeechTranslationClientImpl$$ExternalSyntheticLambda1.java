package com.amazon.alexa.accessory.frames.translation.service;

import com.amazon.alexa.accessory.frames.translation.service.SpeechTranslationClientImpl;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SpeechTranslationClientImpl$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpeechTranslationClientImpl f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ SpeechTranslationClientImpl$$ExternalSyntheticLambda1(SpeechTranslationClientImpl speechTranslationClientImpl, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = speechTranslationClientImpl;
        this.f$1 = serializable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit handleTextMessage$lambda$2;
        Unit onFailure$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                handleTextMessage$lambda$2 = SpeechTranslationClientImpl.handleTextMessage$lambda$2(this.f$0, (String) this.f$1);
                return handleTextMessage$lambda$2;
            default:
                onFailure$lambda$1 = SpeechTranslationClientImpl.TranslationWebSocketListener.onFailure$lambda$1(this.f$0, (Throwable) this.f$1);
                return onFailure$lambda$1;
        }
    }
}
