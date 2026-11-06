package com.amazon.rtvi.mobile.orchestrator;

import com.amazon.rtvi.alexa.model.events.CaptureResumed;
import kotlin.Result;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Orchestrator$processDirective$5$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Orchestrator$processDirective$5$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Result invokeSuspend$lambda$1;
        Result invokeSuspend$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                invokeSuspend$lambda$1 = Orchestrator$processDirective$5.invokeSuspend$lambda$1((CaptureResumed) obj);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$0 = Orchestrator$completeCaptureStopped$1.invokeSuspend$lambda$0((String) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
