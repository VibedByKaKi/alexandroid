package com.amazon.alexa.redesign.view.container;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit dispatchOnMain$lambda$1;
        Unit swipeUpAgentCard$lambda$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                dispatchOnMain$lambda$1 = CardStudioAgentSpaceBridge.dispatchOnMain$lambda$1((CardStudioAgentSpaceBridge) obj2, (Function0) obj);
                return dispatchOnMain$lambda$1;
            default:
                swipeUpAgentCard$lambda$1 = AgentForwardHomeViewController$onCreate$2.swipeUpAgentCard$lambda$1((Runnable) obj2, ((Integer) obj).intValue());
                return swipeUpAgentCard$lambda$1;
        }
    }
}
