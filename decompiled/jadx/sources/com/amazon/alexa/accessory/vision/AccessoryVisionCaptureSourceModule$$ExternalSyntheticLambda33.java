package com.amazon.alexa.accessory.vision;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda33 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryVisionCaptureSourceModule f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda33(AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryVisionCaptureSourceModule;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                accessoryVisionCaptureSourceModule.lambda$notifyFrameData$40(th);
                break;
            case 1:
                accessoryVisionCaptureSourceModule.lambda$notifyFrameData$42(th);
                break;
            default:
                accessoryVisionCaptureSourceModule.lambda$notifyFrameMetadata$43(th);
                break;
        }
    }
}
