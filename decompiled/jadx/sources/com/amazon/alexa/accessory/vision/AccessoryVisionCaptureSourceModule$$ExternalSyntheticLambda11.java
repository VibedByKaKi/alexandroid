package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureConfiguration;
import com.amazon.alexa.accessory.vision.utils.VisionFrameConverterUtils;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda11 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Vision.CaptureConfiguration captureConfiguration;
        Vision.CaptureConfiguration captureConfiguration2;
        byte[] lambda$copySourceToByteArray$50;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                captureConfiguration = VisionFrameConverterUtils.toCaptureConfiguration((VisionCaptureConfiguration) obj);
                return captureConfiguration;
            case 1:
                captureConfiguration2 = VisionFrameConverterUtils.toCaptureConfiguration((VisionCaptureConfiguration) obj);
                return captureConfiguration2;
            default:
                lambda$copySourceToByteArray$50 = AccessoryVisionCaptureSourceModule.lambda$copySourceToByteArray$50((Source) obj);
                return lambda$copySourceToByteArray$50;
        }
    }
}
