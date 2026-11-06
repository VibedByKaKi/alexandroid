package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DetailCardKt$DetailCardContent$1$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ DetailCardKt$DetailCardContent$1$1$$ExternalSyntheticLambda0(Function0 function0, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        switch (this.$r8$classId) {
            case 0:
                invokeSuspend$lambda$0 = DetailCardKt$DetailCardContent$1$1.invokeSuspend$lambda$0(this.f$0, this.f$1, (Offset) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = FullImageCardKt$FullImageCardContent$1$1.invokeSuspend$lambda$0(this.f$0, this.f$1, (Offset) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
