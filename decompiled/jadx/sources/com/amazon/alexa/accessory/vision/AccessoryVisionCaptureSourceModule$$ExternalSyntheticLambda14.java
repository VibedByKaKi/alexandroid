package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.speechapi.vision.VisionCaptureSourceModuleCallback;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda14 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryVisionCaptureSourceModule$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AccessoryVisionCaptureSourceModule.lambda$configureCapture$11((VisionCaptureSourceModuleCallback) obj2, (Throwable) obj);
                break;
            case 1:
                ((AccessoryVisionCaptureSourceProvider) obj2).lambda$observeCaptureSourceAvailability$7((List) obj);
                break;
            default:
                ((AccessoryVisionCaptureSourceProvider) obj2).lambda$observeCaptureSourceAvailability$8((Throwable) obj);
                break;
        }
    }
}
