package com.amazon.alexa.accessory.capabilities.vision;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VisionCaptureCapability$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VisionCaptureCapability f$0;

    public /* synthetic */ VisionCaptureCapability$$ExternalSyntheticLambda7(VisionCaptureCapability visionCaptureCapability, int i) {
        this.$r8$classId = i;
        this.f$0 = visionCaptureCapability;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        VisionCaptureCapability visionCaptureCapability = this.f$0;
        switch (i) {
            case 0:
                visionCaptureCapability.lambda$fetchDeviceType$3((String) obj);
                break;
            case 1:
                visionCaptureCapability.lambda$requestAndProvideVisionConfigurations$5((List) obj);
                break;
            default:
                visionCaptureCapability.lambda$fetchDeviceType$4((Throwable) obj);
                break;
        }
    }
}
