package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.ui.geometry.Offset;
import com.amazon.alexa.ra.core.ui.markdown.renderer.CodeRendererKt$CodeRenderer$1;
import com.amazon.alexa.ra.core.ui.markdown.renderer.HeadingRendererKt$HeadingRenderer$3;
import com.amazon.alexa.ra.core.ui.markdown.renderer.QuoteRendererKt$QuoteRenderer$1;
import com.amazon.alexa.ra.core.ui.markdown.renderer.TextRendererKt$TextRenderer$3;
import com.amazon.alexa.ra.core.ui.markdown.renderer.model.RendererContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TextRendererKt$TextRenderer$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RendererContext f$0;

    public /* synthetic */ TextRendererKt$TextRenderer$1$$ExternalSyntheticLambda0(RendererContext rendererContext, int i) {
        this.$r8$classId = i;
        this.f$0 = rendererContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        Unit invokeSuspend$lambda$03;
        Unit invokeSuspend$lambda$04;
        Unit invokeSuspend$lambda$05;
        Unit invokeSuspend$lambda$06;
        Unit invokeSuspend$lambda$07;
        Unit invokeSuspend$lambda$08;
        int i = this.$r8$classId;
        RendererContext rendererContext = this.f$0;
        Offset offset = (Offset) obj;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = TextRendererKt$TextRenderer$1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = CodeRendererKt$CodeRenderer$1.AnonymousClass1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$02;
            case 2:
                invokeSuspend$lambda$03 = CodeRendererKt$CodeRenderer$1.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$03;
            case 3:
                invokeSuspend$lambda$04 = HeadingRendererKt$HeadingRenderer$1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$04;
            case 4:
                invokeSuspend$lambda$05 = HeadingRendererKt$HeadingRenderer$3.AnonymousClass1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$05;
            case 5:
                invokeSuspend$lambda$06 = QuoteRendererKt$QuoteRenderer$1.AnonymousClass1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$06;
            case 6:
                invokeSuspend$lambda$07 = QuoteRendererKt$QuoteRenderer$1.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$07;
            default:
                invokeSuspend$lambda$08 = TextRendererKt$TextRenderer$3.AnonymousClass2.invokeSuspend$lambda$0(rendererContext, offset);
                return invokeSuspend$lambda$08;
        }
    }
}
