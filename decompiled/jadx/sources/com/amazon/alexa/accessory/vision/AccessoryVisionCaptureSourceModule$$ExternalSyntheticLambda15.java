package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.vision.VisionCaptureSourceProviderManager;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda15 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda15(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$configureCapture$12((Vision.UpdateVisionCaptureConfigResponse) obj);
                break;
            case 1:
                VisionCaptureSourceProviderManager.AccessoryVisionCaptureConnectionListener.lambda$registerPendingProviders$5((Throwable) obj);
                break;
            case 2:
                VisionCaptureSourceProviderManager.VisionCaptureAccessorySessionListener.lambda$onAccessorySessionConnected$2((Throwable) obj);
                break;
            case 3:
                AccessoryVisionCaptureSourceModule.lambda$configureCapture$13((Throwable) obj);
                break;
            case 4:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureStarted$29((Throwable) obj);
                break;
            case 5:
                AccessoryVisionCaptureSourceModule.lambda$notifyFrameMetadata$45((Throwable) obj);
                break;
            default:
                AccessoryVisionCaptureSourceModule.lambda$notifyVisionCaptureStopped$33((Throwable) obj);
                break;
        }
    }
}
