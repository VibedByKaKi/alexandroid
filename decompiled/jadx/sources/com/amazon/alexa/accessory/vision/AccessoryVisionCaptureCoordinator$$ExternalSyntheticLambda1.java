package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.io.Source;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureCoordinator$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VisionCaptureSourceSupplier f$0;
    public final /* synthetic */ Source f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ AccessoryVisionCaptureCoordinator$$ExternalSyntheticLambda1(VisionCaptureSourceSupplier visionCaptureSourceSupplier, Source source, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = visionCaptureSourceSupplier;
        this.f$1 = source;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.notifyFrameData(this.f$1, this.f$2);
                break;
            default:
                this.f$0.notifyFrameMetadata(this.f$1, this.f$2);
                break;
        }
    }
}
