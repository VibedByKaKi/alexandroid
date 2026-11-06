package com.amazon.alexa.ra.core.ui.screen;

import android.app.Activity;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeOobeScreenKt$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LiveModeOobeScreenKt$$ExternalSyntheticLambda14(Activity activity, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = activity;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult LiveModeOobeScreen$lambda$26$lambda$25;
        DisposableEffectResult CameraShareConsentScreen$lambda$15$lambda$14;
        DisposableEffectResult ScreenShareConsentScreen$lambda$15$lambda$14;
        switch (this.$r8$classId) {
            case 0:
                LiveModeOobeScreen$lambda$26$lambda$25 = LiveModeOobeScreenKt.LiveModeOobeScreen$lambda$26$lambda$25(this.f$0, this.f$1, this.f$2, (DisposableEffectScope) obj);
                return LiveModeOobeScreen$lambda$26$lambda$25;
            case 1:
                CameraShareConsentScreen$lambda$15$lambda$14 = CameraShareConsentScreenKt.CameraShareConsentScreen$lambda$15$lambda$14(this.f$0, this.f$1, this.f$2, (DisposableEffectScope) obj);
                return CameraShareConsentScreen$lambda$15$lambda$14;
            default:
                ScreenShareConsentScreen$lambda$15$lambda$14 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$15$lambda$14(this.f$0, this.f$1, this.f$2, (DisposableEffectScope) obj);
                return ScreenShareConsentScreen$lambda$15$lambda$14;
        }
    }
}
