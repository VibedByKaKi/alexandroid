package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ConversationsHistoryScreenKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ConversationsHistoryScreenKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit GroupTitle$lambda$99$lambda$98;
        Unit ConversationsUi$lambda$51$lambda$50;
        int i = this.$r8$classId;
        String str = this.f$0;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                GroupTitle$lambda$99$lambda$98 = ConversationsHistoryScreenKt.GroupTitle$lambda$99$lambda$98(str, semanticsPropertyReceiver);
                return GroupTitle$lambda$99$lambda$98;
            default:
                ConversationsUi$lambda$51$lambda$50 = ConversationsHistoryScreenKt.ConversationsUi$lambda$51$lambda$50(str, semanticsPropertyReceiver);
                return ConversationsUi$lambda$51$lambda$50;
        }
    }
}
