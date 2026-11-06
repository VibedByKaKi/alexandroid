package com.amazon.alexa.accessory.capabilities.vision;

import com.amazon.alexa.accessory.streams.control.ControlStream;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VisionCaptureCapability$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ControlStream f$0;

    public /* synthetic */ VisionCaptureCapability$$ExternalSyntheticLambda1(ControlStream controlStream, int i) {
        this.$r8$classId = i;
        this.f$0 = controlStream;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ControlStream controlStream = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                VisionCaptureCapability.lambda$getNotifyVisionCaptureStartedHandler$10(controlStream, th);
                break;
            case 1:
                VisionCaptureCapability.lambda$getNotifyVisionCapturePausedHandler$16(controlStream, th);
                break;
            case 2:
                VisionCaptureCapability.lambda$getNotifyVisionCaptureStoppedHandler$13(controlStream, th);
                break;
            default:
                VisionCaptureCapability.lambda$getNotifyVisionCaptureResumedHandler$19(controlStream, th);
                break;
        }
    }
}
