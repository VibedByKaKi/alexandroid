package com.amazon.alexa.assistant;

import com.amazon.alexa.assistant.capability.text.InputTextCapabilityAgent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AssistantBuilder$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InputTextCapabilityAgent f$0;

    public /* synthetic */ AssistantBuilder$$ExternalSyntheticLambda28(InputTextCapabilityAgent inputTextCapabilityAgent, int i) {
        this.$r8$classId = i;
        this.f$0 = inputTextCapabilityAgent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit build$lambda$55$lambda$54;
        Unit onStreamSubmitted$lambda$4;
        Unit onStreamSubmitted$lambda$5;
        Unit processInputText$lambda$2;
        Unit processInputText$lambda$3;
        int i = this.$r8$classId;
        InputTextCapabilityAgent inputTextCapabilityAgent = this.f$0;
        switch (i) {
            case 0:
                build$lambda$55$lambda$54 = AssistantBuilder.build$lambda$55$lambda$54(inputTextCapabilityAgent);
                return build$lambda$55$lambda$54;
            case 1:
                onStreamSubmitted$lambda$4 = InputTextCapabilityAgent.onStreamSubmitted$lambda$4(inputTextCapabilityAgent);
                return onStreamSubmitted$lambda$4;
            case 2:
                onStreamSubmitted$lambda$5 = InputTextCapabilityAgent.onStreamSubmitted$lambda$5(inputTextCapabilityAgent);
                return onStreamSubmitted$lambda$5;
            case 3:
                processInputText$lambda$2 = InputTextCapabilityAgent.processInputText$lambda$2(inputTextCapabilityAgent);
                return processInputText$lambda$2;
            default:
                processInputText$lambda$3 = InputTextCapabilityAgent.processInputText$lambda$3(inputTextCapabilityAgent);
                return processInputText$lambda$3;
        }
    }
}
