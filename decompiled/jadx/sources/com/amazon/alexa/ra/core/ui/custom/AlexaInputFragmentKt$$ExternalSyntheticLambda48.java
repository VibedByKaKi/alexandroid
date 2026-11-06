package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.alexa.ra.core.ui.fragments.list.AlexaResponseFragmentKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaInputFragmentKt$$ExternalSyntheticLambda48 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda48(float f, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean AlexaInputSection$lambda$32$lambda$31;
        int i = this.$r8$classId;
        float f = this.f$0;
        switch (i) {
            case 0:
                AlexaInputSection$lambda$32$lambda$31 = AlexaInputFragmentKt.AlexaInputSection$lambda$32$lambda$31(f);
                break;
            default:
                AlexaInputSection$lambda$32$lambda$31 = AlexaResponseFragmentKt.AlexaResponseFragment_XDr8ryQ$lambda$13$lambda$12(f);
                break;
        }
        return Boolean.valueOf(AlexaInputSection$lambda$32$lambda$31);
    }
}
