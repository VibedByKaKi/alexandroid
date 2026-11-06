package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.ui.text.TextLayoutResult;
import com.amazon.alexa.ra.core.ui.markdown.renderer.CodeRendererKt$CodeRenderer$1;
import com.amazon.alexa.ra.core.ui.markdown.renderer.QuoteRendererKt$QuoteRenderer$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TextRendererKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref.ObjectRef f$0;

    public /* synthetic */ TextRendererKt$$ExternalSyntheticLambda1(Ref.ObjectRef objectRef, int i) {
        this.$r8$classId = i;
        this.f$0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit TextRenderer$lambda$5;
        Unit invoke$lambda$0;
        Unit invoke$lambda$02;
        Unit invoke$lambda$03;
        Unit invoke$lambda$1;
        Unit invoke$lambda$04;
        Unit invoke$lambda$05;
        Unit invoke$lambda$2;
        Unit HeadingRenderer$lambda$8;
        Unit ListItemRow$lambda$30$lambda$29;
        int i = this.$r8$classId;
        Ref.ObjectRef objectRef = this.f$0;
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        switch (i) {
            case 0:
                TextRenderer$lambda$5 = TextRendererKt.TextRenderer$lambda$5(objectRef, textLayoutResult);
                return TextRenderer$lambda$5;
            case 1:
                invoke$lambda$0 = CodeRendererKt$CodeRenderer$1.invoke$lambda$0(objectRef, textLayoutResult);
                return invoke$lambda$0;
            case 2:
                invoke$lambda$02 = CodeRendererKt$CodeRenderer$1.AnonymousClass3.invoke$lambda$0(objectRef, textLayoutResult);
                return invoke$lambda$02;
            case 3:
                invoke$lambda$03 = HeadingRendererKt$HeadingRenderer$3.invoke$lambda$0(objectRef, textLayoutResult);
                return invoke$lambda$03;
            case 4:
                invoke$lambda$1 = ListRendererKt$SequentialAnimatedListItemRow$2$3.invoke$lambda$1(objectRef, textLayoutResult);
                return invoke$lambda$1;
            case 5:
                invoke$lambda$04 = QuoteRendererKt$QuoteRenderer$1.invoke$lambda$0(objectRef, textLayoutResult);
                return invoke$lambda$04;
            case 6:
                invoke$lambda$05 = QuoteRendererKt$QuoteRenderer$1.AnonymousClass3.invoke$lambda$0(objectRef, textLayoutResult);
                return invoke$lambda$05;
            case 7:
                invoke$lambda$2 = TextRendererKt$TextRenderer$3.invoke$lambda$2(objectRef, textLayoutResult);
                return invoke$lambda$2;
            case 8:
                HeadingRenderer$lambda$8 = HeadingRendererKt.HeadingRenderer$lambda$8(objectRef, textLayoutResult);
                return HeadingRenderer$lambda$8;
            default:
                ListItemRow$lambda$30$lambda$29 = ListRendererKt.ListItemRow$lambda$30$lambda$29(objectRef, textLayoutResult);
                return ListItemRow$lambda$30$lambda$29;
        }
    }
}
