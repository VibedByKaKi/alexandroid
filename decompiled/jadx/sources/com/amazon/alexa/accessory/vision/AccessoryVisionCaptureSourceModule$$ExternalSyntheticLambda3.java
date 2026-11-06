package com.amazon.alexa.accessory.vision;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$stopCapture$17(str, th);
                break;
            case 1:
                AccessoryVisionCaptureSourceModule.lambda$resumeCapture$25(str, th);
                break;
            case 2:
                AccessoryVisionCaptureSourceModule.lambda$startCapture$7(str, th);
                break;
            case 3:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureResumed$39(str, th);
                break;
            case 4:
                AccessoryVisionCaptureSourceModule.lambda$pauseCapture$21(str, th);
                break;
            default:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCapturePaused$36(str, th);
                break;
        }
    }
}
