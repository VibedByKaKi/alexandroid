package com.amazon.alexa.ra.ui;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class RaNavHostKt$RaNavHost$5$1$17$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RaNavHostKt$RaNavHost$5$1$17$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState invoke$lambda$4$lambda$3;
        boolean create$lambda$22$lambda$20;
        switch (this.$r8$classId) {
            case 0:
                invoke$lambda$4$lambda$3 = RaNavHostKt$RaNavHost$5$1$17.invoke$lambda$4$lambda$3();
                return invoke$lambda$4$lambda$3;
            default:
                create$lambda$22$lambda$20 = VoxRaConversationViewModelFactory.create$lambda$22$lambda$20();
                return Boolean.valueOf(create$lambda$22$lambda$20);
        }
    }
}
