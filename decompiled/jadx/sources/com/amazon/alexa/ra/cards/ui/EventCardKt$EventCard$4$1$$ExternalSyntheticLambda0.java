package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class EventCardKt$EventCard$4$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EventCardKt$EventCard$4$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        Unit invokeSuspend$lambda$03;
        Unit invokeSuspend$lambda$04;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = EventCardKt$EventCard$4$1.invokeSuspend$lambda$0((Function0) obj2, (Offset) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = ContactCardKt$ContactCard$4$1.invokeSuspend$lambda$0((Function0) obj2, (Offset) obj);
                return invokeSuspend$lambda$02;
            case 2:
                invokeSuspend$lambda$03 = NavigationCardKt$NavigationCard$4$1.invokeSuspend$lambda$0((Function0) obj2, (Offset) obj);
                return invokeSuspend$lambda$03;
            default:
                invokeSuspend$lambda$04 = TableCardKt$TableCard$4$1.invokeSuspend$lambda$0((State) obj2, (Offset) obj);
                return invokeSuspend$lambda$04;
        }
    }
}
