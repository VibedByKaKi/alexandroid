package com.amazon.alexa.accessory.vision;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda2 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$stopCapture$16(str);
                break;
            case 1:
                AccessoryVisionCaptureSourceModule.lambda$resumeCapture$24(str);
                break;
            case 2:
                AccessoryVisionCaptureSourceModule.lambda$startCapture$6(str);
                break;
            case 3:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureResumed$38(str);
                break;
            case 4:
                AccessoryVisionCaptureSourceModule.lambda$pauseCapture$20(str);
                break;
            default:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCapturePaused$35(str);
                break;
        }
    }
}
