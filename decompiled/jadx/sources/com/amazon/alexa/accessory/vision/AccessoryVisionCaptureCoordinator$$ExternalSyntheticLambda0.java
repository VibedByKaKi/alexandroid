package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.vision.VisionCaptureSourceProviderManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureCoordinator$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryVisionCaptureCoordinator$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((VisionCaptureSourceProviderManager) obj).activate();
                break;
            default:
                ((VisionCaptureSourceProviderManager.AccessoryVisionCaptureConnectionListener) obj).registerPendingProviders();
                break;
        }
    }
}
