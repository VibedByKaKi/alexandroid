package com.amazon.alexa.client.alexaservice.features.camera;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CameraCapabilityAgent$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraCapabilityAgent f$0;

    public /* synthetic */ CameraCapabilityAgent$$ExternalSyntheticLambda0(CameraCapabilityAgent cameraCapabilityAgent, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraCapabilityAgent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CameraCapabilityAgent cameraCapabilityAgent = this.f$0;
        switch (i) {
            case 0:
                cameraCapabilityAgent.lambda$onAutoCaptureStarted$1();
                break;
            default:
                cameraCapabilityAgent.lambda$onVideoCaptureStarted$0();
                break;
        }
    }
}
