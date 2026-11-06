package com.amazon.rtvi.mobile.orchestrator;

import com.amazon.rtvi.mobile.orchestrator.Orchestrator;
import kotlin.Result;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Orchestrator$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Orchestrator$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean _init_$lambda$0;
        Result invokeSuspend$lambda$0;
        long _init_$lambda$1;
        boolean _init_$lambda$2;
        boolean factory$lambda$0;
        long factory$lambda$1;
        boolean factory$lambda$2;
        boolean factory$lambda$3;
        long factory$lambda$4;
        boolean factory$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                _init_$lambda$0 = Orchestrator._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$0);
            case 1:
                invokeSuspend$lambda$0 = Orchestrator$processDirective$3.invokeSuspend$lambda$0();
                return invokeSuspend$lambda$0;
            case 2:
                _init_$lambda$1 = Orchestrator._init_$lambda$1();
                return Long.valueOf(_init_$lambda$1);
            case 3:
                _init_$lambda$2 = Orchestrator._init_$lambda$2();
                return Boolean.valueOf(_init_$lambda$2);
            case 4:
                factory$lambda$0 = Orchestrator.Companion.factory$lambda$0();
                return Boolean.valueOf(factory$lambda$0);
            case 5:
                factory$lambda$1 = Orchestrator.Companion.factory$lambda$1();
                return Long.valueOf(factory$lambda$1);
            case 6:
                factory$lambda$2 = Orchestrator.Companion.factory$lambda$2();
                return Boolean.valueOf(factory$lambda$2);
            case 7:
                factory$lambda$3 = Orchestrator.Companion.factory$lambda$3();
                return Boolean.valueOf(factory$lambda$3);
            case 8:
                factory$lambda$4 = Orchestrator.Companion.factory$lambda$4();
                return Long.valueOf(factory$lambda$4);
            default:
                factory$lambda$5 = Orchestrator.Companion.factory$lambda$5();
                return Boolean.valueOf(factory$lambda$5);
        }
    }
}
