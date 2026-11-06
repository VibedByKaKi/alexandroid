package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureSourceModuleCallback;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryVisionCaptureSourceModule f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ VisionCaptureSourceModuleCallback f$2;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda0(AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule, String str, VisionCaptureSourceModuleCallback visionCaptureSourceModuleCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryVisionCaptureSourceModule;
        this.f$1 = str;
        this.f$2 = visionCaptureSourceModuleCallback;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stopCapture$14(this.f$1, this.f$2, (Vision.StopVisionCaptureResponse) obj);
                break;
            case 1:
                this.f$0.lambda$stopCapture$15(this.f$1, this.f$2, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$startCapture$2(this.f$1, this.f$2, (Vision.StartVisionCaptureResponse) obj);
                break;
            default:
                this.f$0.lambda$startCapture$4(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }
}
