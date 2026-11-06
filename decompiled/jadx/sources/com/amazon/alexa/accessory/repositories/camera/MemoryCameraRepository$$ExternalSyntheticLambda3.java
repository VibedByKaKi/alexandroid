package com.amazon.alexa.accessory.repositories.camera;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.protocol.Camera;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryCameraRepository$$ExternalSyntheticLambda3 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryCameraRepository f$0;
    public final /* synthetic */ Camera.CameraActionInitiator f$1;

    public /* synthetic */ MemoryCameraRepository$$ExternalSyntheticLambda3(MemoryCameraRepository memoryCameraRepository, Camera.CameraActionInitiator cameraActionInitiator, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryCameraRepository;
        this.f$1 = cameraActionInitiator;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stopAutoCaptureSession$14(this.f$1, result);
                break;
            case 1:
                this.f$0.lambda$startVideoCapture$11(this.f$1, result);
                break;
            case 2:
                this.f$0.lambda$captureImage$10(this.f$1, result);
                break;
            default:
                this.f$0.lambda$startAutoCaptureSession$13(this.f$1, result);
                break;
        }
    }
}
