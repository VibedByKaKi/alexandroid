package com.amazon.alexa.ra.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DeepBrowseComponentKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeepBrowseComponentKt$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState DeepBrowseContent$lambda$16$lambda$13$lambda$12;
        MutableState invoke$lambda$7$lambda$6;
        MutableState invoke$lambda$6$lambda$5;
        Unit invoke$lambda$2;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                DeepBrowseContent$lambda$16$lambda$13$lambda$12 = DeepBrowseComponentKt.DeepBrowseContent$lambda$16$lambda$13$lambda$12((MutableState) obj);
                return DeepBrowseContent$lambda$16$lambda$13$lambda$12;
            case 1:
                invoke$lambda$7$lambda$6 = APLFullScreenFragmentScreenKt$APLFullScreenFragmentScreen$3.invoke$lambda$7$lambda$6((MutableState) obj);
                return invoke$lambda$7$lambda$6;
            case 2:
                invoke$lambda$6$lambda$5 = APLLightBoxScreenKt$APLLightBoxScreen$2.invoke$lambda$6$lambda$5((MutableState) obj);
                return invoke$lambda$6$lambda$5;
            default:
                invoke$lambda$2 = DeepBrowseComponentKt$DeepBrowseDialog$1$1.invoke$lambda$2((Ref.FloatRef) obj);
                return invoke$lambda$2;
        }
    }
}
