package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DetailCardKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ DetailCardKt$$ExternalSyntheticLambda10(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit DetailCard_UjHskOo$lambda$16$lambda$15;
        Unit invoke$lambda$4$lambda$1$lambda$0;
        Unit invoke$lambda$4$lambda$3$lambda$2;
        Unit invoke$lambda$4$lambda$1$lambda$02;
        Unit invoke$lambda$4$lambda$3$lambda$22;
        Unit DetailCard_UjHskOo$lambda$18$lambda$17;
        Unit FullImageCard_KPZsxXI$lambda$16$lambda$15;
        Unit FullImageCard_KPZsxXI$lambda$18$lambda$17;
        int i = this.$r8$classId;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                DetailCard_UjHskOo$lambda$16$lambda$15 = DetailCardKt.DetailCard_UjHskOo$lambda$16$lambda$15(mutableState, booleanValue);
                return DetailCard_UjHskOo$lambda$16$lambda$15;
            case 1:
                invoke$lambda$4$lambda$1$lambda$0 = DetailCardKt$DetailCard$4.invoke$lambda$4$lambda$1$lambda$0(mutableState, booleanValue);
                return invoke$lambda$4$lambda$1$lambda$0;
            case 2:
                invoke$lambda$4$lambda$3$lambda$2 = DetailCardKt$DetailCard$4.invoke$lambda$4$lambda$3$lambda$2(mutableState, booleanValue);
                return invoke$lambda$4$lambda$3$lambda$2;
            case 3:
                invoke$lambda$4$lambda$1$lambda$02 = FullImageCardKt$FullImageCard$4.invoke$lambda$4$lambda$1$lambda$0(mutableState, booleanValue);
                return invoke$lambda$4$lambda$1$lambda$02;
            case 4:
                invoke$lambda$4$lambda$3$lambda$22 = FullImageCardKt$FullImageCard$4.invoke$lambda$4$lambda$3$lambda$2(mutableState, booleanValue);
                return invoke$lambda$4$lambda$3$lambda$22;
            case 5:
                DetailCard_UjHskOo$lambda$18$lambda$17 = DetailCardKt.DetailCard_UjHskOo$lambda$18$lambda$17(mutableState, booleanValue);
                return DetailCard_UjHskOo$lambda$18$lambda$17;
            case 6:
                FullImageCard_KPZsxXI$lambda$16$lambda$15 = FullImageCardKt.FullImageCard_KPZsxXI$lambda$16$lambda$15(mutableState, booleanValue);
                return FullImageCard_KPZsxXI$lambda$16$lambda$15;
            default:
                FullImageCard_KPZsxXI$lambda$18$lambda$17 = FullImageCardKt.FullImageCard_KPZsxXI$lambda$18$lambda$17(mutableState, booleanValue);
                return FullImageCard_KPZsxXI$lambda$18$lambda$17;
        }
    }
}
