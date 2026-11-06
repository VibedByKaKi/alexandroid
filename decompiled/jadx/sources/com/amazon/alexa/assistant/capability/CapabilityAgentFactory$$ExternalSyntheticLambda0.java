package com.amazon.alexa.assistant.capability;

import com.amazon.alexa.assistant.ui.conversation.alexaserviceapis.AlexaServicesWrapper;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CapabilityAgentFactory$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StateFlow f$0;

    public /* synthetic */ CapabilityAgentFactory$$ExternalSyntheticLambda0(StateFlow stateFlow, int i) {
        this.$r8$classId = i;
        this.f$0 = stateFlow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String createSystemCapabilityAgents$lambda$4;
        boolean createTextStreamingController$lambda$5;
        int i = this.$r8$classId;
        StateFlow stateFlow = this.f$0;
        switch (i) {
            case 0:
                createSystemCapabilityAgents$lambda$4 = CapabilityAgentFactory.createSystemCapabilityAgents$lambda$4(stateFlow);
                return createSystemCapabilityAgents$lambda$4;
            default:
                createTextStreamingController$lambda$5 = AlexaServicesWrapper.createTextStreamingController$lambda$5(stateFlow);
                return Boolean.valueOf(createTextStreamingController$lambda$5);
        }
    }
}
