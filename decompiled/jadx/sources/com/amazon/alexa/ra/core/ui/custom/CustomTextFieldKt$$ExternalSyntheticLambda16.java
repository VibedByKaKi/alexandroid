package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CustomTextFieldKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CustomTextFieldKt$$ExternalSyntheticLambda16(boolean z, Function0 function0, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit AlexaLogoStaticLottie$lambda$50;
        Unit ImageThumbnailErrorStateWithRetry$lambda$23;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AlexaLogoStaticLottie$lambda$50 = CustomTextFieldKt.AlexaLogoStaticLottie$lambda$50(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue);
                return AlexaLogoStaticLottie$lambda$50;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ImageThumbnailErrorStateWithRetry$lambda$23 = MediaThumbnailsForCamKt.ImageThumbnailErrorStateWithRetry$lambda$23(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue2);
                return ImageThumbnailErrorStateWithRetry$lambda$23;
        }
    }
}
