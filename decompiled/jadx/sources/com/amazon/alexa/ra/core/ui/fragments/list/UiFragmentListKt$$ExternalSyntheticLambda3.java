package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit DeepThinkingIndicatorPill$lambda$165$lambda$164;
        Unit DeepThinkingContainer$lambda$126$lambda$125;
        Unit DeepThinkingLatencyIndicator$lambda$150$lambda$149;
        int i = this.$r8$classId;
        String str = this.f$0;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                DeepThinkingIndicatorPill$lambda$165$lambda$164 = UiFragmentListKt.DeepThinkingIndicatorPill$lambda$165$lambda$164(str, semanticsPropertyReceiver);
                return DeepThinkingIndicatorPill$lambda$165$lambda$164;
            case 1:
                DeepThinkingContainer$lambda$126$lambda$125 = AlexaResponseFragmentKt.DeepThinkingContainer$lambda$126$lambda$125(str, semanticsPropertyReceiver);
                return DeepThinkingContainer$lambda$126$lambda$125;
            default:
                DeepThinkingLatencyIndicator$lambda$150$lambda$149 = UiFragmentListKt.DeepThinkingLatencyIndicator$lambda$150$lambda$149(str, semanticsPropertyReceiver);
                return DeepThinkingLatencyIndicator$lambda$150$lambda$149;
        }
    }
}
