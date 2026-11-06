package com.amazon.alexa.ra.core.ui.custom;

import androidx.activity.result.ActivityResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeViewKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ LiveModeViewKt$$ExternalSyntheticLambda5(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit LiveModeShareButton$lambda$79$lambda$78;
        Unit invoke$lambda$1$lambda$0;
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        Unit invokeSuspend$lambda$03;
        Unit ConversationScreen$lambda$23$lambda$22;
        Unit ConversationScreen$lambda$25$lambda$24;
        switch (this.$r8$classId) {
            case 0:
                LiveModeShareButton$lambda$79$lambda$78 = LiveModeViewKt.LiveModeShareButton$lambda$79$lambda$78(this.f$0, ((Boolean) obj).booleanValue());
                return LiveModeShareButton$lambda$79$lambda$78;
            case 1:
                invoke$lambda$1$lambda$0 = AlexaInputFragmentKt$AlexaInputSection$9$2$1$1.invoke$lambda$1$lambda$0(this.f$0, (GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$0;
            case 2:
                invokeSuspend$lambda$0 = ConversationScreenKt$ConversationScreen$23$4$4$12$1.invokeSuspend$lambda$0(this.f$0, (Offset) obj);
                return invokeSuspend$lambda$0;
            case 3:
                invokeSuspend$lambda$02 = ConversationScreenKt$ConversationScreen$23$4$4$4$1.invokeSuspend$lambda$0(this.f$0, (Offset) obj);
                return invokeSuspend$lambda$02;
            case 4:
                invokeSuspend$lambda$03 = ConversationScreenKt$ConversationScreen$23$4$4$9$2$1.invokeSuspend$lambda$0(this.f$0, (Offset) obj);
                return invokeSuspend$lambda$03;
            case 5:
                ConversationScreen$lambda$23$lambda$22 = ConversationScreenKt.ConversationScreen$lambda$23$lambda$22(this.f$0, (ActivityResult) obj);
                return ConversationScreen$lambda$23$lambda$22;
            default:
                ConversationScreen$lambda$25$lambda$24 = ConversationScreenKt.ConversationScreen$lambda$25$lambda$24(this.f$0, ((Boolean) obj).booleanValue());
                return ConversationScreen$lambda$25$lambda$24;
        }
    }
}
