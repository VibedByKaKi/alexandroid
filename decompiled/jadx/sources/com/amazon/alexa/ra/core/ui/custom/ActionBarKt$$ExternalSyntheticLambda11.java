package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ActionBarKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ActionBarKt$$ExternalSyntheticLambda11(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit LottieActionBarButton$lambda$38$lambda$37;
        Unit invoke$lambda$2$lambda$1$lambda$0;
        Unit invoke$lambda$2$lambda$1$lambda$02;
        Unit invoke$lambda$12$lambda$11$lambda$6$lambda$5;
        Unit invoke$lambda$12$lambda$11$lambda$10$lambda$9;
        Unit invoke$lambda$6$lambda$5$lambda$4;
        Unit invoke$lambda$5$lambda$4;
        Unit invoke$lambda$1$lambda$0;
        Unit ConversationFilterSwitch$lambda$10$lambda$8$lambda$7;
        Unit CustomModalBottomSheetLayout$lambda$13$lambda$12$lambda$11;
        Unit RAConversationHeader$lambda$12$lambda$11$lambda$10;
        boolean sharedHintPrefix$lambda$1;
        Unit VoiceStatusDisplayField$lambda$2$lambda$1$lambda$0;
        Unit VoiceStatusDisplayField$lambda$12$lambda$7$lambda$6$lambda$5;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                LottieActionBarButton$lambda$38$lambda$37 = ActionBarKt.LottieActionBarButton$lambda$38$lambda$37(str, (SemanticsPropertyReceiver) obj);
                return LottieActionBarButton$lambda$38$lambda$37;
            case 1:
                invoke$lambda$2$lambda$1$lambda$0 = AlexaInputFragmentKt$MicButton$1.invoke$lambda$2$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$2$lambda$1$lambda$0;
            case 2:
                invoke$lambda$2$lambda$1$lambda$02 = AlexaInputFragmentKt$TypeModalityAttachButton$1$1.invoke$lambda$2$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$2$lambda$1$lambda$02;
            case 3:
                invoke$lambda$12$lambda$11$lambda$6$lambda$5 = BackgroundConversationsPromptCardKt$BackgroundConversationsPromptCard$2$2$2.invoke$lambda$12$lambda$11$lambda$6$lambda$5(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$12$lambda$11$lambda$6$lambda$5;
            case 4:
                invoke$lambda$12$lambda$11$lambda$10$lambda$9 = BackgroundConversationsPromptCardKt$BackgroundConversationsPromptCard$2$2$2.invoke$lambda$12$lambda$11$lambda$10$lambda$9(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$12$lambda$11$lambda$10$lambda$9;
            case 5:
                invoke$lambda$6$lambda$5$lambda$4 = ConversationScreenKt$ConversationScreen$23.invoke$lambda$6$lambda$5$lambda$4(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$6$lambda$5$lambda$4;
            case 6:
                invoke$lambda$5$lambda$4 = CustomTextFieldKt$CustomTextField$4.invoke$lambda$5$lambda$4(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$5$lambda$4;
            case 7:
                invoke$lambda$1$lambda$0 = NowPlayingAnimationKt$NowPlayingAnimation$1.invoke$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$0;
            case 8:
                ConversationFilterSwitch$lambda$10$lambda$8$lambda$7 = ConversationsFilterKt.ConversationFilterSwitch$lambda$10$lambda$8$lambda$7(str, (SemanticsPropertyReceiver) obj);
                return ConversationFilterSwitch$lambda$10$lambda$8$lambda$7;
            case 9:
                CustomModalBottomSheetLayout$lambda$13$lambda$12$lambda$11 = CustomModalBottomSheetLayoutKt.CustomModalBottomSheetLayout$lambda$13$lambda$12$lambda$11(str, (SemanticsPropertyReceiver) obj);
                return CustomModalBottomSheetLayout$lambda$13$lambda$12$lambda$11;
            case 10:
                RAConversationHeader$lambda$12$lambda$11$lambda$10 = RAConversationHeaderKt.RAConversationHeader$lambda$12$lambda$11$lambda$10(str, (SemanticsPropertyReceiver) obj);
                return RAConversationHeader$lambda$12$lambda$11$lambda$10;
            case 11:
                sharedHintPrefix$lambda$1 = RollingPlaceholderKt.sharedHintPrefix$lambda$1(str, (String) obj);
                return Boolean.valueOf(sharedHintPrefix$lambda$1);
            case 12:
                VoiceStatusDisplayField$lambda$2$lambda$1$lambda$0 = VoiceStatusDisplayFieldKt.VoiceStatusDisplayField$lambda$2$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return VoiceStatusDisplayField$lambda$2$lambda$1$lambda$0;
            default:
                VoiceStatusDisplayField$lambda$12$lambda$7$lambda$6$lambda$5 = VoiceStatusDisplayFieldKt.VoiceStatusDisplayField$lambda$12$lambda$7$lambda$6$lambda$5(str, (SemanticsPropertyReceiver) obj);
                return VoiceStatusDisplayField$lambda$12$lambda$7$lambda$6$lambda$5;
        }
    }
}
