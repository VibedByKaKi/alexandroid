package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureSourceModuleCallback;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda13 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ VisionCaptureSourceModuleCallback f$1;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda13(String str, VisionCaptureSourceModuleCallback visionCaptureSourceModuleCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = visionCaptureSourceModuleCallback;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$configureCapture$10(this.f$0, this.f$1, (Vision.UpdateVisionCaptureConfigResponse) obj);
                break;
            case 1:
                AccessoryVisionCaptureSourceModule.lambda$resumeCapture$22(this.f$0, this.f$1, (Vision.ResumeVisionCaptureResponse) obj);
                break;
            case 2:
                AccessoryVisionCaptureSourceModule.lambda$resumeCapture$23(this.f$0, this.f$1, (Throwable) obj);
                break;
            case 3:
                AccessoryVisionCaptureSourceModule.lambda$pauseCapture$18(this.f$0, this.f$1, (Vision.PauseVisionCaptureResponse) obj);
                break;
            default:
                AccessoryVisionCaptureSourceModule.lambda$pauseCapture$19(this.f$0, this.f$1, (Throwable) obj);
                break;
        }
    }
}
