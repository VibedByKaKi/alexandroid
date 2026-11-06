package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CardRevealKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CardRevealKt$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit CardRevealBox_au3_HiA$lambda$9$lambda$8;
        int intValue;
        String buildResponseText;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                CardRevealBox_au3_HiA$lambda$9$lambda$8 = CardRevealKt.CardRevealBox_au3_HiA$lambda$9$lambda$8((CardReveal) obj);
                return CardRevealBox_au3_HiA$lambda$9$lambda$8;
            case 1:
                intValue = ((MutableIntState) obj).getIntValue();
                return Integer.valueOf(intValue);
            default:
                buildResponseText = ShareDelegationKt.buildResponseText((List) obj);
                return buildResponseText;
        }
    }
}
