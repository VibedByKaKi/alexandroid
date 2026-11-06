package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.vision.VisionCaptureSourceProviderManager;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda19 implements Action {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda19(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureStarted$28();
                break;
            case 1:
                VisionCaptureSourceProviderManager.AccessoryVisionCaptureConnectionListener.lambda$registerPendingProviders$4();
                break;
            case 2:
                AccessoryVisionCaptureSourceModule.lambda$notifyFrameMetadata$44();
                break;
            default:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureStopped$32();
                break;
        }
    }
}
