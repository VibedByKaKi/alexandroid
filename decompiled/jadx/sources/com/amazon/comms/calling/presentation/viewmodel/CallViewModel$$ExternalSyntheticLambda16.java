package com.amazon.comms.calling.presentation.viewmodel;

import com.amazon.comms.calling.presentation.viewmodel.CallViewModel$proceedWithAcceptCall$1;
import com.amazon.comms.calling.presentation.viewmodel.CallViewModel$processCallRequest$1;
import com.amazon.comms.calling.presentation.viewmodel.CallViewModel$processCallRequest$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class CallViewModel$$ExternalSyntheticLambda16 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallViewModel f$0;

    public /* synthetic */ CallViewModel$$ExternalSyntheticLambda16(CallViewModel callViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = callViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit acceptCall$lambda$17;
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        Unit invokeSuspend$lambda$1;
        Unit invokeSuspend$lambda$03;
        Unit invokeSuspend$lambda$12;
        int i = this.$r8$classId;
        CallViewModel callViewModel = this.f$0;
        switch (i) {
            case 0:
                acceptCall$lambda$17 = CallViewModel.acceptCall$lambda$17(callViewModel);
                return acceptCall$lambda$17;
            case 1:
                invokeSuspend$lambda$0 = CallViewModel$proceedWithAcceptCall$1.AnonymousClass2.invokeSuspend$lambda$0(callViewModel);
                return invokeSuspend$lambda$0;
            case 2:
                invokeSuspend$lambda$02 = CallViewModel$processCallRequest$1.AnonymousClass1.invokeSuspend$lambda$0(callViewModel);
                return invokeSuspend$lambda$02;
            case 3:
                invokeSuspend$lambda$1 = CallViewModel$processCallRequest$1.AnonymousClass1.invokeSuspend$lambda$1(callViewModel);
                return invokeSuspend$lambda$1;
            case 4:
                invokeSuspend$lambda$03 = CallViewModel$processCallRequest$2.AnonymousClass1.invokeSuspend$lambda$0(callViewModel);
                return invokeSuspend$lambda$03;
            default:
                invokeSuspend$lambda$12 = CallViewModel$processCallRequest$2.AnonymousClass1.invokeSuspend$lambda$1(callViewModel);
                return invokeSuspend$lambda$12;
        }
    }
}
