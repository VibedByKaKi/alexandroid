package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.alexa.ra.core.data.model.HeaderActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeHeaderKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ HeaderActionType f$1;

    public /* synthetic */ LiveModeHeaderKt$$ExternalSyntheticLambda5(Function1 function1, HeaderActionType headerActionType, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = headerActionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LiveModeHeader$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8;
        Unit ConversationScreen$lambda$103$lambda$102$lambda$98;
        switch (this.$r8$classId) {
            case 0:
                LiveModeHeader$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8 = LiveModeHeaderKt.LiveModeHeader$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(this.f$0, this.f$1);
                return LiveModeHeader$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8;
            default:
                ConversationScreen$lambda$103$lambda$102$lambda$98 = ConversationScreenKt.ConversationScreen$lambda$103$lambda$102$lambda$98(this.f$0, this.f$1);
                return ConversationScreen$lambda$103$lambda$102$lambda$98;
        }
    }
}
