package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CameraShareConsentScreenKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ CameraShareConsentScreenKt$$ExternalSyntheticLambda9(Function0 function0, Function1 function1, Function1 function12, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = function0;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit CameraShareConsentScreen$lambda$30;
        Unit ScreenShareConsentScreen$lambda$30;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CameraShareConsentScreen$lambda$30 = CameraShareConsentScreenKt.CameraShareConsentScreen$lambda$30(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return CameraShareConsentScreen$lambda$30;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ScreenShareConsentScreen$lambda$30 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$30(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return ScreenShareConsentScreen$lambda$30;
        }
    }
}
