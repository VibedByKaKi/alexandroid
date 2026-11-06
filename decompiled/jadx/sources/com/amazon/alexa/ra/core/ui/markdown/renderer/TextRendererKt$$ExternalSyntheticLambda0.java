package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TextRendererKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TextRendererKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit TextRenderer$lambda$1$lambda$0;
        Unit invoke$lambda$1$lambda$0;
        Unit HeadingRenderer$lambda$1$lambda$0;
        Unit TableCellCompose_N3_OwHU$lambda$26$lambda$25;
        int TableRenderer_jIwJxvA$lambda$14$lambda$13$lambda$12$lambda$11;
        switch (this.$r8$classId) {
            case 0:
                TextRenderer$lambda$1$lambda$0 = TextRendererKt.TextRenderer$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                return TextRenderer$lambda$1$lambda$0;
            case 1:
                invoke$lambda$1$lambda$0 = TextRendererKt$TextRenderer$3.invoke$lambda$1$lambda$0((GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$0;
            case 2:
                HeadingRenderer$lambda$1$lambda$0 = HeadingRendererKt.HeadingRenderer$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                return HeadingRenderer$lambda$1$lambda$0;
            case 3:
                TableCellCompose_N3_OwHU$lambda$26$lambda$25 = TableRendererKt.TableCellCompose_N3_OwHU$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
                return TableCellCompose_N3_OwHU$lambda$26$lambda$25;
            default:
                TableRenderer_jIwJxvA$lambda$14$lambda$13$lambda$12$lambda$11 = TableRendererKt.TableRenderer_jIwJxvA$lambda$14$lambda$13$lambda$12$lambda$11(((Integer) obj).intValue());
                return Integer.valueOf(TableRenderer_jIwJxvA$lambda$14$lambda$13$lambda$12$lambda$11);
        }
    }
}
