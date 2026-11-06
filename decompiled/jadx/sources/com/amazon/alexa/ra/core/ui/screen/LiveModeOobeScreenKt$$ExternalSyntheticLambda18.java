package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeOobeScreenKt$$ExternalSyntheticLambda18 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ LiveModeOobeScreenKt$$ExternalSyntheticLambda18(Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LiveModeOobeScreen$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36;
        Unit CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
        Unit ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
        Unit SmartActionsFeedbackScreen$lambda$16$lambda$15$lambda$14;
        switch (this.$r8$classId) {
            case 0:
                LiveModeOobeScreen$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36 = LiveModeOobeScreenKt.LiveModeOobeScreen$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(this.f$0, this.f$1);
                return LiveModeOobeScreen$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36;
            case 1:
                CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24 = CameraShareConsentScreenKt.CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(this.f$0, this.f$1);
                return CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
            case 2:
                ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(this.f$0, this.f$1);
                return ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
            default:
                SmartActionsFeedbackScreen$lambda$16$lambda$15$lambda$14 = SmartActionsFeedbackScreenKt.SmartActionsFeedbackScreen$lambda$16$lambda$15$lambda$14(this.f$0, this.f$1);
                return SmartActionsFeedbackScreen$lambda$16$lambda$15$lambda$14;
        }
    }
}
