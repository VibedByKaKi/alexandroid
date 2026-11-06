package com.amazon.alexa.redesign.compose.home;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeKt$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda17(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit HomeModeIndicator$lambda$229$lambda$228;
        Unit invokeSuspend$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                HomeModeIndicator$lambda$229$lambda$228 = HomeKt.HomeModeIndicator$lambda$229$lambda$228((Function0) obj);
                return HomeModeIndicator$lambda$229$lambda$228;
            default:
                invokeSuspend$lambda$0 = RaConversationCardContentKt$RaConversationCardContent$onDismissCallback$1$1$1.invokeSuspend$lambda$0((State) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
