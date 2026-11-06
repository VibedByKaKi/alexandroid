package com.amazon.alexa.accessory.camera;

import android.util.Pair;
import com.amazon.alexa.accessory.protocol.Camera;
import com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryCameraProvider$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryCameraProvider f$0;
    public final /* synthetic */ VideoCaptureSession f$1;

    public /* synthetic */ AccessoryCameraProvider$$ExternalSyntheticLambda1(AccessoryCameraProvider accessoryCameraProvider, VideoCaptureSession videoCaptureSession, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryCameraProvider;
        this.f$1 = videoCaptureSession;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleStopCapture$4(this.f$1, (Pair) obj);
                break;
            case 1:
                this.f$0.lambda$handleStopCapture$5(this.f$1, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$handleStartCapture$2(this.f$1, (Camera.CameraActionResponse) obj);
                break;
            default:
                this.f$0.lambda$handleStartCapture$3(this.f$1, (Throwable) obj);
                break;
        }
    }
}
