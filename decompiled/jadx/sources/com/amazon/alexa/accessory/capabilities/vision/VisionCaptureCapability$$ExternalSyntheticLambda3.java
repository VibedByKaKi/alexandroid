package com.amazon.alexa.accessory.capabilities.vision;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VisionCaptureCapability$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VisionCaptureCapability f$0;

    public /* synthetic */ VisionCaptureCapability$$ExternalSyntheticLambda3(VisionCaptureCapability visionCaptureCapability, int i) {
        this.$r8$classId = i;
        this.f$0 = visionCaptureCapability;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$hasFeatureAccess$1;
        CompletableSource lambda$requestAndProvideVisionConfigurations$6;
        int i = this.$r8$classId;
        VisionCaptureCapability visionCaptureCapability = this.f$0;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                lambda$hasFeatureAccess$1 = visionCaptureCapability.lambda$hasFeatureAccess$1(bool);
                return lambda$hasFeatureAccess$1;
            default:
                lambda$requestAndProvideVisionConfigurations$6 = visionCaptureCapability.lambda$requestAndProvideVisionConfigurations$6(bool);
                return lambda$requestAndProvideVisionConfigurations$6;
        }
    }
}
