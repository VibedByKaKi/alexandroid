package com.amazon.alexa.redesign.view.container;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStudioAgentSpaceBridge f$0;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda1(CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge, int i) {
        this.$r8$classId = i;
        this.f$0 = cardStudioAgentSpaceBridge;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit refresh$lambda$7$lambda$6;
        Unit refresh$lambda$4;
        Unit refresh$lambda$5;
        Unit refresh$lambda$7;
        Unit subscribePullToRefreshEvent$lambda$26$lambda$25;
        Unit refresh$lambda$4$lambda$3;
        int i = this.$r8$classId;
        CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge = this.f$0;
        switch (i) {
            case 0:
                refresh$lambda$7$lambda$6 = CardStudioAgentSpaceBridge.refresh$lambda$7$lambda$6(cardStudioAgentSpaceBridge);
                return refresh$lambda$7$lambda$6;
            case 1:
                refresh$lambda$4 = CardStudioAgentSpaceBridge.refresh$lambda$4(cardStudioAgentSpaceBridge);
                return refresh$lambda$4;
            case 2:
                refresh$lambda$5 = CardStudioAgentSpaceBridge.refresh$lambda$5(cardStudioAgentSpaceBridge);
                return refresh$lambda$5;
            case 3:
                refresh$lambda$7 = CardStudioAgentSpaceBridge.refresh$lambda$7(cardStudioAgentSpaceBridge);
                return refresh$lambda$7;
            case 4:
                subscribePullToRefreshEvent$lambda$26$lambda$25 = CardStudioAgentSpaceBridge.subscribePullToRefreshEvent$lambda$26$lambda$25(cardStudioAgentSpaceBridge);
                return subscribePullToRefreshEvent$lambda$26$lambda$25;
            default:
                refresh$lambda$4$lambda$3 = CardStudioAgentSpaceBridge.refresh$lambda$4$lambda$3(cardStudioAgentSpaceBridge);
                return refresh$lambda$4$lambda$3;
        }
    }
}
