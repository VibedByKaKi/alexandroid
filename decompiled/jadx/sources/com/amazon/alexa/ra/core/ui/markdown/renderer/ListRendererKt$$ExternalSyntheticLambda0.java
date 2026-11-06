package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ListRendererKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ ListRendererKt$$ExternalSyntheticLambda0(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit AnimatedNestedListContent$lambda$17$lambda$16$lambda$11$lambda$10;
        Unit AnimatedNestedListContent$lambda$17$lambda$16$lambda$15$lambda$14;
        Unit TableCellCompose_N3_OwHU$lambda$32$lambda$31$lambda$30;
        switch (this.$r8$classId) {
            case 0:
                AnimatedNestedListContent$lambda$17$lambda$16$lambda$11$lambda$10 = ListRendererKt.AnimatedNestedListContent$lambda$17$lambda$16$lambda$11$lambda$10(this.f$0, ((Integer) obj).intValue());
                return AnimatedNestedListContent$lambda$17$lambda$16$lambda$11$lambda$10;
            case 1:
                AnimatedNestedListContent$lambda$17$lambda$16$lambda$15$lambda$14 = ListRendererKt.AnimatedNestedListContent$lambda$17$lambda$16$lambda$15$lambda$14(this.f$0, ((Integer) obj).intValue());
                return AnimatedNestedListContent$lambda$17$lambda$16$lambda$15$lambda$14;
            default:
                TableCellCompose_N3_OwHU$lambda$32$lambda$31$lambda$30 = TableRendererKt.TableCellCompose_N3_OwHU$lambda$32$lambda$31$lambda$30(this.f$0, (TextLayoutResult) obj);
                return TableCellCompose_N3_OwHU$lambda$32$lambda$31$lambda$30;
        }
    }
}
