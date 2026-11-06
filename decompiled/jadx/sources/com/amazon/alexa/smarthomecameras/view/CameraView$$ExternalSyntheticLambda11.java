package com.amazon.alexa.smarthomecameras.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CameraView$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraView f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ CameraView$$ExternalSyntheticLambda11(CameraView cameraView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraView;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setMicrophoneToggleState$11(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setLoadingVisible$15(this.f$1);
                break;
            case 2:
                this.f$0.lambda$setPlayButtonVisible$18(this.f$1);
                break;
            case 3:
                this.f$0.lambda$toggleButtons$17(this.f$1);
                break;
            default:
                this.f$0.lambda$setSpeakerToggleState$12(this.f$1);
                break;
        }
    }
}
