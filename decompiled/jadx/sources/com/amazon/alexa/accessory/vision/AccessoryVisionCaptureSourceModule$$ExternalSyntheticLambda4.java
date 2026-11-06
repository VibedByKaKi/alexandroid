package com.amazon.alexa.accessory.vision;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda4 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryVisionCaptureSourceModule f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda4(AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryVisionCaptureSourceModule;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule = this.f$0;
        switch (i) {
            case 0:
                accessoryVisionCaptureSourceModule.lambda$notifyVisionCapturePaused$34();
                break;
            case 1:
                accessoryVisionCaptureSourceModule.lambda$notifyFrameData$41();
                break;
            default:
                accessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureResumed$37();
                break;
        }
    }
}
