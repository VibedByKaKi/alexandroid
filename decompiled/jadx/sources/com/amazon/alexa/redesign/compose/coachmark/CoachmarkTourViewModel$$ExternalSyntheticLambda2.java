package com.amazon.alexa.redesign.compose.coachmark;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CoachmarkTourViewModel$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CoachmarkTourViewModel$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit createBridge$lambda$8;
        Unit invokeSuspend$lambda$1;
        Unit invokeSuspend$lambda$2;
        Unit createBridge$lambda$9;
        Unit invoke$lambda$2$lambda$1$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                createBridge$lambda$8 = CoachmarkTourViewModel.createBridge$lambda$8((CoachmarkTourViewModel) obj);
                return createBridge$lambda$8;
            case 1:
                invokeSuspend$lambda$1 = CoachmarkTourViewModel$initialize$1.invokeSuspend$lambda$1((CoachmarkTourViewModel) obj);
                return invokeSuspend$lambda$1;
            case 2:
                invokeSuspend$lambda$2 = CoachmarkTourViewModel$initialize$1.invokeSuspend$lambda$2((CoachmarkTourViewModel) obj);
                return invokeSuspend$lambda$2;
            case 3:
                createBridge$lambda$9 = CoachmarkTourViewModel.createBridge$lambda$9((CoachmarkTourViewModel) obj);
                return createBridge$lambda$9;
            default:
                invoke$lambda$2$lambda$1$lambda$0 = ExploreCoachmarkTourToastKt$ExploreCoachmarkTourToast$2$1.invoke$lambda$2$lambda$1$lambda$0((Function0) obj);
                return invoke$lambda$2$lambda$1$lambda$0;
        }
    }
}
