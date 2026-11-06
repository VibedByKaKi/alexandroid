package com.amazon.alexa.ra.cards.ui;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ListCardKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ListCardKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit ListCardItemRow_yrwZFoE$lambda$5$lambda$4;
        Unit CardGraphic_IkByU14$lambda$20$lambda$19;
        Unit DefaultUrlImageFallback_sW7UJKQ$lambda$13$lambda$12;
        int i = this.$r8$classId;
        String str = this.f$0;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                ListCardItemRow_yrwZFoE$lambda$5$lambda$4 = ListCardKt.ListCardItemRow_yrwZFoE$lambda$5$lambda$4(str, semanticsPropertyReceiver);
                return ListCardItemRow_yrwZFoE$lambda$5$lambda$4;
            case 1:
                CardGraphic_IkByU14$lambda$20$lambda$19 = UrlImageKt.CardGraphic_IkByU14$lambda$20$lambda$19(str, semanticsPropertyReceiver);
                return CardGraphic_IkByU14$lambda$20$lambda$19;
            default:
                DefaultUrlImageFallback_sW7UJKQ$lambda$13$lambda$12 = UrlImageKt.DefaultUrlImageFallback_sW7UJKQ$lambda$13$lambda$12(str, semanticsPropertyReceiver);
                return DefaultUrlImageFallback_sW7UJKQ$lambda$13$lambda$12;
        }
    }
}
