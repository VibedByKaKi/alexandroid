package com.amazon.alexa.accessory.camera;

import com.amazon.alexa.accessory.camera.AccessoryCameraProvider;
import com.amazon.alexa.accessory.protocol.Camera;
import com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryCameraProvider$AccessoryAutoCaptureCallback$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryCameraProvider.AccessoryAutoCaptureCallback f$0;
    public final /* synthetic */ AutoCaptureSession f$1;

    public /* synthetic */ AccessoryCameraProvider$AccessoryAutoCaptureCallback$$ExternalSyntheticLambda0(AccessoryCameraProvider.AccessoryAutoCaptureCallback accessoryAutoCaptureCallback, AutoCaptureSession autoCaptureSession, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryAutoCaptureCallback;
        this.f$1 = autoCaptureSession;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startAutoCaptureSession$0(this.f$1, (Camera.CameraActionResponse) obj);
                break;
            case 1:
                this.f$0.lambda$startAutoCaptureSession$1(this.f$1, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$stopAutoCaptureSession$2(this.f$1, (Camera.CameraActionResponse) obj);
                break;
            default:
                this.f$0.lambda$stopAutoCaptureSession$3(this.f$1, (Throwable) obj);
                break;
        }
    }
}
