package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.alexa.ra.core.data.model.ActionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RAConversationHeaderKt$HeaderActionItemView$2$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActionItem f$0;

    public /* synthetic */ RAConversationHeaderKt$HeaderActionItemView$2$$ExternalSyntheticLambda1(ActionItem actionItem, int i) {
        this.$r8$classId = i;
        this.f$0 = actionItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invoke$lambda$3$lambda$2;
        Unit invoke$lambda$7$lambda$6;
        boolean invoke$lambda$5$lambda$4$lambda$3$lambda$2;
        Unit invoke$lambda$1$lambda$0;
        int i = this.$r8$classId;
        ActionItem actionItem = this.f$0;
        switch (i) {
            case 0:
                invoke$lambda$3$lambda$2 = RAConversationHeaderKt$HeaderActionItemView$2.invoke$lambda$3$lambda$2(actionItem);
                return invoke$lambda$3$lambda$2;
            case 1:
                invoke$lambda$7$lambda$6 = RAConversationHeaderKt$HeaderActionItemView$1$1.invoke$lambda$7$lambda$6(actionItem);
                return invoke$lambda$7$lambda$6;
            case 2:
                invoke$lambda$5$lambda$4$lambda$3$lambda$2 = RAConversationHeaderKt$HeaderActionItemView$1$1.invoke$lambda$5$lambda$4$lambda$3$lambda$2(actionItem);
                return Boolean.valueOf(invoke$lambda$5$lambda$4$lambda$3$lambda$2);
            default:
                invoke$lambda$1$lambda$0 = RAConversationHeaderKt$HeaderActionItemView$3.invoke$lambda$1$lambda$0(actionItem);
                return invoke$lambda$1$lambda$0;
        }
    }
}
