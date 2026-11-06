package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.protocol.Vision;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda56 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda56(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Vision.VisionFrameData lambda$processVisionFrameFromSource$47;
        Vision.VisionFrameMetadata lambda$processVisionFrameMetadataFromSource$55;
        int i = this.$r8$classId;
        String str = this.f$0;
        byte[] bArr = (byte[]) obj;
        switch (i) {
            case 0:
                lambda$processVisionFrameFromSource$47 = AccessoryVisionCaptureSourceModule.lambda$processVisionFrameFromSource$47(str, bArr);
                return lambda$processVisionFrameFromSource$47;
            default:
                lambda$processVisionFrameMetadataFromSource$55 = AccessoryVisionCaptureSourceModule.lambda$processVisionFrameMetadataFromSource$55(str, bArr);
                return lambda$processVisionFrameMetadataFromSource$55;
        }
    }
}
