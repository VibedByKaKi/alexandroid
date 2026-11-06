package com.amazon.alexa.ra.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class APLLightBoxScreenKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ APLLightBoxScreenKt$$ExternalSyntheticLambda2(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit APLLightBoxScreen$lambda$4$lambda$3;
        Unit APLFullScreenFragmentScreen$lambda$5$lambda$4;
        Unit APLFullScreenFragmentScreen$lambda$7$lambda$6;
        Unit DeepBrowseDialog$lambda$4$lambda$3;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                APLLightBoxScreen$lambda$4$lambda$3 = APLLightBoxScreenKt.APLLightBoxScreen$lambda$4$lambda$3(function0);
                return APLLightBoxScreen$lambda$4$lambda$3;
            case 1:
                APLFullScreenFragmentScreen$lambda$5$lambda$4 = APLFullScreenFragmentScreenKt.APLFullScreenFragmentScreen$lambda$5$lambda$4(function0);
                return APLFullScreenFragmentScreen$lambda$5$lambda$4;
            case 2:
                APLFullScreenFragmentScreen$lambda$7$lambda$6 = APLFullScreenFragmentScreenKt.APLFullScreenFragmentScreen$lambda$7$lambda$6(function0);
                return APLFullScreenFragmentScreen$lambda$7$lambda$6;
            default:
                DeepBrowseDialog$lambda$4$lambda$3 = DeepBrowseComponentKt.DeepBrowseDialog$lambda$4$lambda$3(function0);
                return DeepBrowseDialog$lambda$4$lambda$3;
        }
    }
}
