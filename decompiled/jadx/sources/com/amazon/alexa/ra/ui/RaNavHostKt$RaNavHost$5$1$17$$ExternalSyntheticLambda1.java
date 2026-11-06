package com.amazon.alexa.ra.ui;

import androidx.compose.runtime.MutableState;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class RaNavHostKt$RaNavHost$5$1$17$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ RaNavHostKt$RaNavHost$5$1$17$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invoke$lambda$7$lambda$6;
        Unit invoke$lambda$10$lambda$9$lambda$8;
        Set create$lambda$13;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                invoke$lambda$7$lambda$6 = RaNavHostKt$RaNavHost$5$1$17.invoke$lambda$7$lambda$6(mutableState);
                return invoke$lambda$7$lambda$6;
            case 1:
                invoke$lambda$10$lambda$9$lambda$8 = RaNavHostKt$dialogWithCustomAnimations$1.invoke$lambda$10$lambda$9$lambda$8(mutableState);
                return invoke$lambda$10$lambda$9$lambda$8;
            default:
                create$lambda$13 = VoxRaConversationViewModelFactory.create$lambda$13(mutableState);
                return create$lambda$13;
        }
    }
}
