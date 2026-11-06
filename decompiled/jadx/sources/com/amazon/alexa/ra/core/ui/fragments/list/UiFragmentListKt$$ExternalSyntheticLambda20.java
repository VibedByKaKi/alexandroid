package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda20 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda20(int i, Function1 function1, Function1 function12) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult FragmentLists_S3D76Zc$lambda$80$lambda$79;
        Unit invoke$lambda$8$lambda$7$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                FragmentLists_S3D76Zc$lambda$80$lambda$79 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$80$lambda$79(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return FragmentLists_S3D76Zc$lambda$80$lambda$79;
            default:
                invoke$lambda$8$lambda$7$lambda$6 = UiFragmentListKt$RenderFragment$12.invoke$lambda$8$lambda$7$lambda$6(this.f$0, this.f$1, (FragmentData) obj);
                return invoke$lambda$8$lambda$7$lambda$6;
        }
    }
}
