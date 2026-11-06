package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.ui.unit.IntSize;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.VisibleScrollableInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda55 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda55(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit RenderFragment_GzQQks4$lambda$246$lambda$245$lambda$244;
        Unit invoke$lambda$1$lambda$0;
        Unit invoke$lambda$1$lambda$02;
        Unit AlexaResponseFragment_XDr8ryQ$lambda$22$lambda$21;
        Unit AstBasedMarkdownSections$lambda$121$lambda$105$lambda$104;
        List withDeepThinkingBodyTextHidden$lambda$3;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                RenderFragment_GzQQks4$lambda$246$lambda$245$lambda$244 = UiFragmentListKt.RenderFragment_GzQQks4$lambda$246$lambda$245$lambda$244(function1, (IntSize) obj);
                return RenderFragment_GzQQks4$lambda$246$lambda$245$lambda$244;
            case 1:
                invoke$lambda$1$lambda$0 = UiFragmentListKt$FragmentLists$24$5.invoke$lambda$1$lambda$0(function1, (VisibleScrollableInfo) obj);
                return invoke$lambda$1$lambda$0;
            case 2:
                invoke$lambda$1$lambda$02 = UiFragmentListKt$RenderFragment$12.invoke$lambda$1$lambda$0(function1, (IntSize) obj);
                return invoke$lambda$1$lambda$02;
            case 3:
                AlexaResponseFragment_XDr8ryQ$lambda$22$lambda$21 = AlexaResponseFragmentKt.AlexaResponseFragment_XDr8ryQ$lambda$22$lambda$21(function1, (FragmentData) obj);
                return AlexaResponseFragment_XDr8ryQ$lambda$22$lambda$21;
            case 4:
                AstBasedMarkdownSections$lambda$121$lambda$105$lambda$104 = AlexaResponseFragmentKt.AstBasedMarkdownSections$lambda$121$lambda$105$lambda$104(function1, (String) obj);
                return AstBasedMarkdownSections$lambda$121$lambda$105$lambda$104;
            default:
                withDeepThinkingBodyTextHidden$lambda$3 = DeepThinkingBodyTextKt.withDeepThinkingBodyTextHidden$lambda$3(function1, (FragmentData) obj);
                return withDeepThinkingBodyTextHidden$lambda$3;
        }
    }
}
