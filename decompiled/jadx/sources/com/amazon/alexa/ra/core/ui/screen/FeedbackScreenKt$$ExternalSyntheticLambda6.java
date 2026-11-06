package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import com.amazon.alexa.accessory.frames.translation.service.SpeechTranslationClientImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FeedbackScreenKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ FeedbackScreenKt$$ExternalSyntheticLambda6(SpeechTranslationClientImpl speechTranslationClientImpl, String str, String str2, boolean z) {
        this.f$0 = speechTranslationClientImpl;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit FeedbackScreen$lambda$22$lambda$21$lambda$20;
        Unit handleTextMessage$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                FeedbackScreen$lambda$22$lambda$21$lambda$20 = FeedbackScreenKt.FeedbackScreen$lambda$22$lambda$21$lambda$20((Function3) this.f$0, this.f$1, (MutableState) this.f$2, (MutableState) this.f$3);
                return FeedbackScreen$lambda$22$lambda$21$lambda$20;
            default:
                handleTextMessage$lambda$6 = SpeechTranslationClientImpl.handleTextMessage$lambda$6((SpeechTranslationClientImpl) this.f$0, (String) this.f$2, (String) this.f$3, this.f$1);
                return handleTextMessage$lambda$6;
        }
    }

    public /* synthetic */ FeedbackScreenKt$$ExternalSyntheticLambda6(Function3 function3, boolean z, MutableState mutableState, MutableState mutableState2) {
        this.f$0 = function3;
        this.f$1 = z;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
    }
}
