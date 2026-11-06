package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureSource;
import com.amazon.alexa.accessory.vision.VisionCaptureSourceProviderManager;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceProvider$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryVisionCaptureSourceProvider$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        VisionCaptureSource lambda$getAvailableCaptureSources$0;
        CompletableSource lambda$registerPendingProviders$2;
        VisionCaptureSource lambda$observeCaptureSourceAvailability$6;
        switch (this.$r8$classId) {
            case 0:
                lambda$getAvailableCaptureSources$0 = AccessoryVisionCaptureSourceProvider.lambda$getAvailableCaptureSources$0((Vision.VisionCaptureConfigurations) obj);
                return lambda$getAvailableCaptureSources$0;
            case 1:
                lambda$registerPendingProviders$2 = VisionCaptureSourceProviderManager.AccessoryVisionCaptureConnectionListener.lambda$registerPendingProviders$2((Throwable) obj);
                return lambda$registerPendingProviders$2;
            default:
                lambda$observeCaptureSourceAvailability$6 = AccessoryVisionCaptureSourceProvider.lambda$observeCaptureSourceAvailability$6((Vision.VisionCaptureConfigurations) obj);
                return lambda$observeCaptureSourceAvailability$6;
        }
    }
}
