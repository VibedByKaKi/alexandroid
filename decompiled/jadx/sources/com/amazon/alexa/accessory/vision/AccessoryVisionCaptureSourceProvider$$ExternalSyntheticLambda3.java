package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureSourceProviderCallback;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceProvider$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VisionCaptureSourceProviderCallback f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceProvider$$ExternalSyntheticLambda3(VisionCaptureSourceProviderCallback visionCaptureSourceProviderCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = visionCaptureSourceProviderCallback;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        VisionCaptureSourceProviderCallback visionCaptureSourceProviderCallback = this.f$0;
        switch (i) {
            case 0:
                AccessoryVisionCaptureSourceProvider.lambda$getCaptureSourceCapabilities$5(visionCaptureSourceProviderCallback, (Throwable) obj);
                break;
            case 1:
                AccessoryVisionCaptureSourceProvider.lambda$getAvailableCaptureSources$1(visionCaptureSourceProviderCallback, (List) obj);
                break;
            default:
                AccessoryVisionCaptureSourceProvider.lambda$getAvailableCaptureSources$2(visionCaptureSourceProviderCallback, (Throwable) obj);
                break;
        }
    }
}
