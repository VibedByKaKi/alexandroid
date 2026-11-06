package com.amazon.scxml.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ConcreteSCXMLStateMachine$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConcreteSCXMLStateMachine f$0;

    public /* synthetic */ ConcreteSCXMLStateMachine$$ExternalSyntheticLambda1(ConcreteSCXMLStateMachine concreteSCXMLStateMachine, int i) {
        this.$r8$classId = i;
        this.f$0 = concreteSCXMLStateMachine;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit initialize$lambda$2;
        Unit execute$lambda$11;
        Unit start$lambda$4;
        int i = this.$r8$classId;
        ConcreteSCXMLStateMachine concreteSCXMLStateMachine = this.f$0;
        switch (i) {
            case 0:
                initialize$lambda$2 = ConcreteSCXMLStateMachine.initialize$lambda$2(concreteSCXMLStateMachine);
                return initialize$lambda$2;
            case 1:
                execute$lambda$11 = ConcreteSCXMLStateMachine.execute$lambda$11(concreteSCXMLStateMachine);
                return execute$lambda$11;
            default:
                start$lambda$4 = ConcreteSCXMLStateMachine.start$lambda$4(concreteSCXMLStateMachine);
                return start$lambda$4;
        }
    }
}
