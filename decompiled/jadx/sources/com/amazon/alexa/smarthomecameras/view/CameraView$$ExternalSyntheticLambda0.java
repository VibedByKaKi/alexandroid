package com.amazon.alexa.smarthomecameras.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CameraView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraView f$0;

    public /* synthetic */ CameraView$$ExternalSyntheticLambda0(CameraView cameraView, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CameraView cameraView = this.f$0;
        switch (i) {
            case 0:
                cameraView.lambda$new$5();
                break;
            case 1:
                cameraView.lambda$showPermissionSettingsHint$9();
                break;
            case 2:
                cameraView.lambda$releaseCameraView$14();
                break;
            case 3:
                cameraView.showMicPermissionPrimer();
                break;
            case 4:
                cameraView.lambda$showCoachMarks$19();
                break;
            default:
                cameraView.lambda$showPausedForPermission$10();
                break;
        }
    }
}
