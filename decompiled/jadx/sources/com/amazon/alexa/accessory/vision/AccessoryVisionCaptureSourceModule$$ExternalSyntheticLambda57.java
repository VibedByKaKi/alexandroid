package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda57 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryVisionCaptureSourceModule f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda57(AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryVisionCaptureSourceModule;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$processVisionFrameFromSource$48;
        CompletableSource lambda$processVisionFrameMetadataFromSource$56;
        int i = this.$r8$classId;
        AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule = this.f$0;
        switch (i) {
            case 0:
                lambda$processVisionFrameFromSource$48 = accessoryVisionCaptureSourceModule.lambda$processVisionFrameFromSource$48((Vision.VisionFrameData) obj);
                return lambda$processVisionFrameFromSource$48;
            default:
                lambda$processVisionFrameMetadataFromSource$56 = accessoryVisionCaptureSourceModule.lambda$processVisionFrameMetadataFromSource$56((Vision.VisionFrameMetadata) obj);
                return lambda$processVisionFrameMetadataFromSource$56;
        }
    }
}
