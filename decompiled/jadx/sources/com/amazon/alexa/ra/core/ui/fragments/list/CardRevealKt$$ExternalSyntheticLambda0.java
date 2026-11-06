package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CardRevealKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ State f$0;
    public final /* synthetic */ CardReveal f$1;

    public /* synthetic */ CardRevealKt$$ExternalSyntheticLambda0(State state, CardReveal cardReveal) {
        this.f$0 = state;
        this.f$1 = cardReveal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean scrollButtonVisibility$lambda$13;
        switch (this.$r8$classId) {
            case 0:
                scrollButtonVisibility$lambda$13 = CardRevealKt.scrollButtonVisibility$lambda$13(this.f$0, this.f$1);
                break;
            default:
                scrollButtonVisibility$lambda$13 = CardRevealKt.CardRevealBox_au3_HiA$lambda$6$lambda$5(this.f$1, this.f$0);
                break;
        }
        return Boolean.valueOf(scrollButtonVisibility$lambda$13);
    }

    public /* synthetic */ CardRevealKt$$ExternalSyntheticLambda0(CardReveal cardReveal, State state) {
        this.f$1 = cardReveal;
        this.f$0 = state;
    }
}
