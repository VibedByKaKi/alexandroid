package com.amazon.alexa.ra.rtvi;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClientCallback;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener;
import com.amazon.rtvi.device.camera.DeviceCameraModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ScreenCaptureModule$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Exception f$0;

    public /* synthetic */ ScreenCaptureModule$$ExternalSyntheticLambda2(Exception exc, int i) {
        this.$r8$classId = i;
        this.f$0 = exc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit captureFrame$lambda$22;
        Unit openSocket$lambda$5;
        Unit captureFrame$lambda$24;
        int i = this.$r8$classId;
        Exception exc = this.f$0;
        switch (i) {
            case 0:
                captureFrame$lambda$22 = ScreenCaptureModule.captureFrame$lambda$22(exc, (ICaptureSourceModuleListener) obj);
                return captureFrame$lambda$22;
            case 1:
                openSocket$lambda$5 = ClassifyIntentClient.openSocket$lambda$5(exc, (ClassifyIntentClientCallback) obj);
                return openSocket$lambda$5;
            default:
                captureFrame$lambda$24 = DeviceCameraModule.captureFrame$lambda$24(exc, (ICaptureSourceModuleListener) obj);
                return captureFrame$lambda$24;
        }
    }
}
