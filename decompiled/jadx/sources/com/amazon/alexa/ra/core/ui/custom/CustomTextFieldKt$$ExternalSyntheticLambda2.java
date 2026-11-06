package com.amazon.alexa.ra.core.ui.custom;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CustomTextFieldKt$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ CustomTextFieldKt$$ExternalSyntheticLambda2(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                NowPlayingAnimationKt$NowPlayingAnimation$1.invoke$lambda$8$lambda$5$lambda$4$lambda$3$lambda$2(function0, view);
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
