package com.amazon.alexa.ra.features.visualshare;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class VisualShareSource$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VisualShareSource f$0;

    public /* synthetic */ VisualShareSource$$ExternalSyntheticLambda3(VisualShareSource visualShareSource, int i) {
        this.$r8$classId = i;
        this.f$0 = visualShareSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onScreenConsentResult$lambda$4;
        Unit restoreScreenShare$lambda$3;
        int i = this.$r8$classId;
        VisualShareSource visualShareSource = this.f$0;
        switch (i) {
            case 0:
                onScreenConsentResult$lambda$4 = VisualShareSource.onScreenConsentResult$lambda$4(visualShareSource);
                return onScreenConsentResult$lambda$4;
            default:
                restoreScreenShare$lambda$3 = VisualShareSource.restoreScreenShare$lambda$3(visualShareSource);
                return restoreScreenShare$lambda$3;
        }
    }
}
