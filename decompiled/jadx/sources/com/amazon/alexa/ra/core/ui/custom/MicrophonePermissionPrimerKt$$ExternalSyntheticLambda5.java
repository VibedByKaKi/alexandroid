package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class MicrophonePermissionPrimerKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ MicrophonePermissionPrimerKt$$ExternalSyntheticLambda5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit MicrophonePermissionPrimer$lambda$16$lambda$15;
        MutableState invoke$lambda$28$lambda$27$lambda$2$lambda$1;
        MutableState invoke$lambda$1$lambda$0;
        MutableState invoke$lambda$28$lambda$27$lambda$2$lambda$12;
        MutableState invoke$lambda$28$lambda$27$lambda$2$lambda$13;
        Unit invoke$lambda$10$lambda$9;
        MutableState invoke$lambda$2$lambda$1;
        boolean invokeSuspend$lambda$0;
        Unit invoke$lambda$96$lambda$95$lambda$94;
        MutableState invoke$lambda$17$lambda$6$lambda$3$lambda$2;
        Unit invoke$lambda$17$lambda$16$lambda$15;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                MicrophonePermissionPrimer$lambda$16$lambda$15 = MicrophonePermissionPrimerKt.MicrophonePermissionPrimer$lambda$16$lambda$15(mutableState);
                return MicrophonePermissionPrimer$lambda$16$lambda$15;
            case 1:
                invoke$lambda$28$lambda$27$lambda$2$lambda$1 = AlexaInputFragmentKt$InputSectionAgentForwardLightPlaceHolder$1.invoke$lambda$28$lambda$27$lambda$2$lambda$1(mutableState);
                return invoke$lambda$28$lambda$27$lambda$2$lambda$1;
            case 2:
                invoke$lambda$1$lambda$0 = AlexaInputFragmentKt$InputSectionPreviewDark$1.invoke$lambda$1$lambda$0(mutableState);
                return invoke$lambda$1$lambda$0;
            case 3:
                invoke$lambda$28$lambda$27$lambda$2$lambda$12 = AlexaInputFragmentKt$InputSectionPreviewDarkPlaceHolder$1.invoke$lambda$28$lambda$27$lambda$2$lambda$1(mutableState);
                return invoke$lambda$28$lambda$27$lambda$2$lambda$12;
            case 4:
                invoke$lambda$28$lambda$27$lambda$2$lambda$13 = AlexaInputFragmentKt$InputSectionPreviewLightPlaceHolder$1.invoke$lambda$28$lambda$27$lambda$2$lambda$1(mutableState);
                return invoke$lambda$28$lambda$27$lambda$2$lambda$13;
            case 5:
                invoke$lambda$10$lambda$9 = AlexaInputFragmentKt$TypeModalityTextField$textField$1.invoke$lambda$10$lambda$9(mutableState);
                return invoke$lambda$10$lambda$9;
            case 6:
                invoke$lambda$2$lambda$1 = ComposableSingletons$AlexaInputFragmentKt$lambda2$1.invoke$lambda$2$lambda$1(mutableState);
                return invoke$lambda$2$lambda$1;
            case 7:
                invokeSuspend$lambda$0 = ConversationScreenKt$ConversationScreen$14$1.invokeSuspend$lambda$0(mutableState);
                return Boolean.valueOf(invokeSuspend$lambda$0);
            case 8:
                invoke$lambda$96$lambda$95$lambda$94 = ConversationScreenKt$ConversationScreen$23.invoke$lambda$96$lambda$95$lambda$94(mutableState);
                return invoke$lambda$96$lambda$95$lambda$94;
            case 9:
                invoke$lambda$17$lambda$6$lambda$3$lambda$2 = ConversationScreenKt$ConversationScreen$23$4$4$13$5.invoke$lambda$17$lambda$6$lambda$3$lambda$2(mutableState);
                return invoke$lambda$17$lambda$6$lambda$3$lambda$2;
            default:
                invoke$lambda$17$lambda$16$lambda$15 = ConversationScreenKt$ConversationScreen$23$4$4$13$5.invoke$lambda$17$lambda$16$lambda$15(mutableState);
                return invoke$lambda$17$lambda$16$lambda$15;
        }
    }
}
