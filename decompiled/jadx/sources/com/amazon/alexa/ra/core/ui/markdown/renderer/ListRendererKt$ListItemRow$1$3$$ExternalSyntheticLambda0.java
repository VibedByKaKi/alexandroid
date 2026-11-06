package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.ui.geometry.Offset;
import com.amazon.alexa.ra.core.ui.markdown.renderer.ListRendererKt$SequentialAnimatedListItemRow$2$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ListRendererKt$ListItemRow$1$3$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ ListRendererKt$ListItemRow$1$3$$ExternalSyntheticLambda0(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        Unit invokeSuspend$lambda$03;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        Offset offset = (Offset) obj;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = ListRendererKt$ListItemRow$1$3.invokeSuspend$lambda$0(function0, offset);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = ListRendererKt$SequentialAnimatedListItemRow$2$3.AnonymousClass2.invokeSuspend$lambda$0(function0, offset);
                return invokeSuspend$lambda$02;
            default:
                invokeSuspend$lambda$03 = TableRendererKt$TableCellCompose$2$2$1.invokeSuspend$lambda$0(function0, offset);
                return invokeSuspend$lambda$03;
        }
    }
}
