package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.io.Source;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda55 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryVisionCaptureSourceModule f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda55(AccessoryVisionCaptureSourceModule accessoryVisionCaptureSourceModule, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryVisionCaptureSourceModule;
        this.f$1 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource lambda$processVisionFrameFromSource$46;
        SingleSource lambda$processVisionFrameMetadataFromSource$54;
        CompletableSource lambda$startCapture$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$processVisionFrameFromSource$46 = this.f$0.lambda$processVisionFrameFromSource$46((Source) this.f$1);
                return lambda$processVisionFrameFromSource$46;
            case 1:
                lambda$processVisionFrameMetadataFromSource$54 = this.f$0.lambda$processVisionFrameMetadataFromSource$54((Source) this.f$1);
                return lambda$processVisionFrameMetadataFromSource$54;
            default:
                lambda$startCapture$3 = this.f$0.lambda$startCapture$3((String) this.f$1);
                return lambda$startCapture$3;
        }
    }
}
