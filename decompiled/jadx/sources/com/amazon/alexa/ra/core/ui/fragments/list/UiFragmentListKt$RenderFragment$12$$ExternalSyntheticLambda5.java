package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$RenderFragment$12$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ UiFragmentListKt$RenderFragment$12$$ExternalSyntheticLambda5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invoke$lambda$11$lambda$10;
        Unit invoke$lambda$9$lambda$8;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                invoke$lambda$11$lambda$10 = UiFragmentListKt$RenderFragment$12.invoke$lambda$11$lambda$10(mutableState);
                return invoke$lambda$11$lambda$10;
            default:
                invoke$lambda$9$lambda$8 = UiFragmentListKt$RenderFragment$14.invoke$lambda$9$lambda$8(mutableState);
                return invoke$lambda$9$lambda$8;
        }
    }
}
