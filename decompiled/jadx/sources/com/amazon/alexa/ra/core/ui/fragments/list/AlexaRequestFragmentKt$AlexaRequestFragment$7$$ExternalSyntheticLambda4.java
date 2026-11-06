package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaRequestFragmentKt$AlexaRequestFragment$7$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ AlexaRequestFragmentKt$AlexaRequestFragment$7$$ExternalSyntheticLambda4(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invoke$lambda$8$lambda$7;
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                invoke$lambda$8$lambda$7 = AlexaRequestFragmentKt$AlexaRequestFragment$7.invoke$lambda$8$lambda$7(function0, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$8$lambda$7;
            case 1:
                invokeSuspend$lambda$0 = AlexaRequestFragmentKt$AlexaRequestFragment$7$1$1.invokeSuspend$lambda$0(function0, (Offset) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = AlexaResponseFragmentKt$AlexaResponseFragment$10$1$1.invokeSuspend$lambda$0(function0, (Offset) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
