package com.amazon.alexa.ra.core.ui.custom;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CustomTextFieldKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View.OnClickListener f$0;

    public /* synthetic */ CustomTextFieldKt$$ExternalSyntheticLambda5(int i, View.OnClickListener onClickListener) {
        this.$r8$classId = i;
        this.f$0 = onClickListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit AlexaLogoEntryLottie$lambda$61$lambda$60;
        Unit AlexaLogoStaticLottie$lambda$49$lambda$48;
        int i = this.$r8$classId;
        View.OnClickListener onClickListener = this.f$0;
        FrameLayout frameLayout = (FrameLayout) obj;
        switch (i) {
            case 0:
                AlexaLogoEntryLottie$lambda$61$lambda$60 = CustomTextFieldKt.AlexaLogoEntryLottie$lambda$61$lambda$60(onClickListener, frameLayout);
                return AlexaLogoEntryLottie$lambda$61$lambda$60;
            default:
                AlexaLogoStaticLottie$lambda$49$lambda$48 = CustomTextFieldKt.AlexaLogoStaticLottie$lambda$49$lambda$48(onClickListener, frameLayout);
                return AlexaLogoStaticLottie$lambda$49$lambda$48;
        }
    }
}
