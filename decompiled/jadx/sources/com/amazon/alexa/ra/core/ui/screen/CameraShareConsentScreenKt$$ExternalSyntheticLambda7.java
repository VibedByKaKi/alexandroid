package com.amazon.alexa.ra.core.ui.screen;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CameraShareConsentScreenKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ CameraShareConsentScreenKt$$ExternalSyntheticLambda7(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21;
        Unit invoke$lambda$6$lambda$5$lambda$4;
        Unit invoke$lambda$1$lambda$0;
        Unit ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21;
        switch (this.$r8$classId) {
            case 0:
                CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21 = CameraShareConsentScreenKt.CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21(this.f$0, ((Boolean) obj).booleanValue());
                return CameraShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21;
            case 1:
                invoke$lambda$6$lambda$5$lambda$4 = ConsentOnboardingLayoutKt$CappedTopSpacingScrollColumn$1.invoke$lambda$6$lambda$5$lambda$4(this.f$0, (IntSize) obj);
                return invoke$lambda$6$lambda$5$lambda$4;
            case 2:
                invoke$lambda$1$lambda$0 = WebViewBottomSheetScreenKt$WebViewBottomSheetScreen$4.invoke$lambda$1$lambda$0(this.f$0, (WebView) obj);
                return invoke$lambda$1$lambda$0;
            default:
                ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21(this.f$0, ((Boolean) obj).booleanValue());
                return ScreenShareConsentScreen$lambda$29$lambda$28$lambda$27$lambda$23$lambda$22$lambda$21;
        }
    }
}
