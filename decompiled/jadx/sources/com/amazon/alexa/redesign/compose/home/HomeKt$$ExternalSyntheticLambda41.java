package com.amazon.alexa.redesign.compose.home;

import android.view.View;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.amazon.alexa.redesign.view.OrbitToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeKt$$ExternalSyntheticLambda41 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda41(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit ReactNativePremisesSelectionDropDown$lambda$171$lambda$170;
        Unit AgentSpaceCard$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17;
        Unit CardStudioLoadingSkeleton$lambda$1$lambda$0;
        Unit OrbitToastComposable_ziNgDLE$lambda$180$lambda$179;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                ReactNativePremisesSelectionDropDown$lambda$171$lambda$170 = HomeKt.ReactNativePremisesSelectionDropDown$lambda$171$lambda$170(str, (View) obj);
                return ReactNativePremisesSelectionDropDown$lambda$171$lambda$170;
            case 1:
                AgentSpaceCard$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17 = AgentSpaceCardKt.AgentSpaceCard$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(str, (SemanticsPropertyReceiver) obj);
                return AgentSpaceCard$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17;
            case 2:
                CardStudioLoadingSkeleton$lambda$1$lambda$0 = CardStudioLoadingSkeletonKt.CardStudioLoadingSkeleton$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return CardStudioLoadingSkeleton$lambda$1$lambda$0;
            default:
                OrbitToastComposable_ziNgDLE$lambda$180$lambda$179 = HomeKt.OrbitToastComposable_ziNgDLE$lambda$180$lambda$179(str, (OrbitToast) obj);
                return OrbitToastComposable_ziNgDLE$lambda$180$lambda$179;
        }
    }
}
