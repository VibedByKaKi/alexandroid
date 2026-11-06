package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CardRevealKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ CardRevealKt$$ExternalSyntheticLambda4(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit cardRevealList$lambda$15;
        Unit invokeSuspend$lambda$1;
        Unit invokeSuspend$lambda$0;
        Unit CardRevealSkeleton__jt2gSs$lambda$20$lambda$19;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                cardRevealList$lambda$15 = CardRevealKt.cardRevealList$lambda$15(state, (GraphicsLayerScope) obj);
                return cardRevealList$lambda$15;
            case 1:
                invokeSuspend$lambda$1 = AlexaRequestFragmentKt$AlexaRequestFragment$7$1$1.invokeSuspend$lambda$1(state, (Offset) obj);
                return invokeSuspend$lambda$1;
            case 2:
                invokeSuspend$lambda$0 = AlexaResponseFragmentKt$AstBasedMarkdownSections$2$7$1.invokeSuspend$lambda$0(state, (Offset) obj);
                return invokeSuspend$lambda$0;
            default:
                CardRevealSkeleton__jt2gSs$lambda$20$lambda$19 = CardRevealKt.CardRevealSkeleton__jt2gSs$lambda$20$lambda$19(state, (GraphicsLayerScope) obj);
                return CardRevealSkeleton__jt2gSs$lambda$20$lambda$19;
        }
    }
}
