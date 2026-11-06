package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda54 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda54(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit RenderFragment_GzQQks4$lambda$242$lambda$241;
        Unit AstBasedMarkdownSections$lambda$121$lambda$117$lambda$116;
        Unit RenderFragment_GzQQks4$lambda$249$lambda$248;
        Unit RenderFragment_GzQQks4$lambda$252$lambda$251;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                RenderFragment_GzQQks4$lambda$242$lambda$241 = UiFragmentListKt.RenderFragment_GzQQks4$lambda$242$lambda$241(mutableState, (LayoutCoordinates) obj);
                return RenderFragment_GzQQks4$lambda$242$lambda$241;
            case 1:
                AstBasedMarkdownSections$lambda$121$lambda$117$lambda$116 = AlexaResponseFragmentKt.AstBasedMarkdownSections$lambda$121$lambda$117$lambda$116(mutableState, (IntSize) obj);
                return AstBasedMarkdownSections$lambda$121$lambda$117$lambda$116;
            case 2:
                RenderFragment_GzQQks4$lambda$249$lambda$248 = UiFragmentListKt.RenderFragment_GzQQks4$lambda$249$lambda$248(mutableState, (LayoutCoordinates) obj);
                return RenderFragment_GzQQks4$lambda$249$lambda$248;
            default:
                RenderFragment_GzQQks4$lambda$252$lambda$251 = UiFragmentListKt.RenderFragment_GzQQks4$lambda$252$lambda$251(mutableState, (LayoutCoordinates) obj);
                return RenderFragment_GzQQks4$lambda$252$lambda$251;
        }
    }
}
