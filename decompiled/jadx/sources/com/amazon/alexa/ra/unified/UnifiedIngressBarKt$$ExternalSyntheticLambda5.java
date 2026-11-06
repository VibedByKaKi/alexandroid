package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UnifiedIngressBarKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ UnifiedIngressBarKt$$ExternalSyntheticLambda5(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean UnifiedIngressBarScreen$lambda$59$lambda$58;
        SurfaceLook access$UnifiedIngressBarScreen$lambda$70;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                UnifiedIngressBarScreen$lambda$59$lambda$58 = UnifiedIngressBarKt.UnifiedIngressBarScreen$lambda$59$lambda$58(state);
                break;
            case 1:
                access$UnifiedIngressBarScreen$lambda$70 = UnifiedIngressBarKt.access$UnifiedIngressBarScreen$lambda$70(state);
                return access$UnifiedIngressBarScreen$lambda$70;
            default:
                UnifiedIngressBarScreen$lambda$59$lambda$58 = UnifiedIngressBarKt.UnifiedIngressBarScreen$lambda$62$lambda$61(state);
                break;
        }
        return Boolean.valueOf(UnifiedIngressBarScreen$lambda$59$lambda$58);
    }
}
