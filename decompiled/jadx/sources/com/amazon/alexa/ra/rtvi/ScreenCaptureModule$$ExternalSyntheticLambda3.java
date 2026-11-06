package com.amazon.alexa.ra.rtvi;

import com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener;
import com.amazon.rtvi.capture.model.CaptureConfiguration;
import com.amazon.rtvi.device.camera.DeviceCameraModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ScreenCaptureModule$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ CaptureConfiguration f$1;

    public /* synthetic */ ScreenCaptureModule$$ExternalSyntheticLambda3(String str, CaptureConfiguration captureConfiguration, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = captureConfiguration;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit notifyCaptureStarted$lambda$25;
        Unit notifyCaptureStarted$lambda$30;
        switch (this.$r8$classId) {
            case 0:
                notifyCaptureStarted$lambda$25 = ScreenCaptureModule.notifyCaptureStarted$lambda$25(this.f$0, this.f$1, (ICaptureSourceModuleListener) obj);
                return notifyCaptureStarted$lambda$25;
            default:
                notifyCaptureStarted$lambda$30 = DeviceCameraModule.notifyCaptureStarted$lambda$30(this.f$0, this.f$1, (ICaptureSourceModuleListener) obj);
                return notifyCaptureStarted$lambda$30;
        }
    }
}
