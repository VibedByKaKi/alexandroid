package com.amazon.alexa.ra.core.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaConversationViewModel$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RaConversationViewModel$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isAppVisible$lambda$5;
        Unit unit;
        Unit unit2;
        switch (this.$r8$classId) {
            case 0:
                isAppVisible$lambda$5 = RaConversationViewModel.isAppVisible$lambda$5();
                break;
            case 1:
                unit = Unit.INSTANCE;
                return unit;
            case 2:
                isAppVisible$lambda$5 = RaConversationViewModel._init_$lambda$0();
                break;
            default:
                unit2 = Unit.INSTANCE;
                return unit2;
        }
        return Boolean.valueOf(isAppVisible$lambda$5);
    }
}
