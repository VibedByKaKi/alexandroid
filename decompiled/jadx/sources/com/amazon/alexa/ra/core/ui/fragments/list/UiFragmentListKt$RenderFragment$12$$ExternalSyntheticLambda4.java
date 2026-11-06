package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$RenderFragment$12$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ UiFragmentListKt$RenderFragment$12$$ExternalSyntheticLambda4(Ref.IntRef intRef, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = intRef;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invoke$lambda$9;
        Unit invoke$lambda$7;
        int i = this.$r8$classId;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                invoke$lambda$9 = UiFragmentListKt$RenderFragment$12.invoke$lambda$9(this.f$0, this.f$1, intValue);
                return invoke$lambda$9;
            default:
                invoke$lambda$7 = UiFragmentListKt$RenderFragment$14.invoke$lambda$7(this.f$0, this.f$1, intValue);
                return invoke$lambda$7;
        }
    }
}
