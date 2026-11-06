package com.amazon.alexa.assistant.ui.conversation;

import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConversationController$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConversationController f$0;

    public /* synthetic */ ConversationController$$ExternalSyntheticLambda0(ConversationController conversationController, int i) {
        this.$r8$classId = i;
        this.f$0 = conversationController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit buildConversationComposable$lambda$26$lambda$25;
        Unit buildConversationComposable$lambda$16$lambda$15;
        Unit buildConversationView$lambda$13;
        int i = this.$r8$classId;
        ConversationController conversationController = this.f$0;
        NavHostController navHostController = (NavHostController) obj;
        switch (i) {
            case 0:
                buildConversationComposable$lambda$26$lambda$25 = ConversationController.buildConversationComposable$lambda$26$lambda$25(conversationController, navHostController);
                return buildConversationComposable$lambda$26$lambda$25;
            case 1:
                buildConversationComposable$lambda$16$lambda$15 = ConversationController.buildConversationComposable$lambda$16$lambda$15(conversationController, navHostController);
                return buildConversationComposable$lambda$16$lambda$15;
            default:
                buildConversationView$lambda$13 = ConversationController.buildConversationView$lambda$13(conversationController, navHostController);
                return buildConversationView$lambda$13;
        }
    }
}
