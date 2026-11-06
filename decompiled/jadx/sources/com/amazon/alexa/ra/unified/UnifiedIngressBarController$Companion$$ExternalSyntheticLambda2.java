package com.amazon.alexa.ra.unified;

import com.amazon.alexa.ra.sdk.utils.FireTabletUtils;
import com.amazon.alexa.ra.unified.UnifiedIngressBarKt$UnifiedIngressBarScreen$23;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UnifiedIngressBarController$Companion$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UnifiedIngressBarController$Companion$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isKHTablet;
        Unit invoke$lambda$82$lambda$81$lambda$60$lambda$59;
        switch (this.$r8$classId) {
            case 0:
                isKHTablet = FireTabletUtils.isKHTablet();
                break;
            case 1:
                invoke$lambda$82$lambda$81$lambda$60$lambda$59 = UnifiedIngressBarKt$UnifiedIngressBarScreen$23.AnonymousClass2.invoke$lambda$82$lambda$81$lambda$60$lambda$59();
                return invoke$lambda$82$lambda$81$lambda$60$lambda$59;
            case 2:
                isKHTablet = UnifiedIngressBarKt$UnifiedIngressBarScreen$9$1.invokeSuspend$lambda$0();
                break;
            default:
                isKHTablet = FireTabletUtils.isKHTablet();
                break;
        }
        return Boolean.valueOf(isKHTablet);
    }
}
