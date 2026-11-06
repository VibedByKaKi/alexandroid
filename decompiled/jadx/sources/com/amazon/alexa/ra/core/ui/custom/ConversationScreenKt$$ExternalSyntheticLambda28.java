package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ConversationScreenKt$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ ConversationScreenKt$$ExternalSyntheticLambda28(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState ConversationScreen$lambda$103$lambda$87;
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$1;
        boolean thumbnailClickable$lambda$4$lambda$3$lambda$2;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                ConversationScreen$lambda$103$lambda$87 = ConversationScreenKt.ConversationScreen$lambda$103$lambda$87(state);
                return ConversationScreen$lambda$103$lambda$87;
            case 1:
                invokeSuspend$lambda$0 = DictationHoldToSendKt$dictationHoldToSend$1$1$1.invokeSuspend$lambda$0(state);
                return invokeSuspend$lambda$0;
            case 2:
                invokeSuspend$lambda$1 = DictationHoldToSendKt$dictationHoldToSend$1$1$1.invokeSuspend$lambda$1(state);
                return invokeSuspend$lambda$1;
            default:
                thumbnailClickable$lambda$4$lambda$3$lambda$2 = MediaThumbnailsForCamKt.thumbnailClickable$lambda$4$lambda$3$lambda$2(state);
                return Boolean.valueOf(thumbnailClickable$lambda$4$lambda$3$lambda$2);
        }
    }
}
