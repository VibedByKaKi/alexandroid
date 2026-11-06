package com.amazon.alexa.smarthomecameras.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class RtcscCameraSessionManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RtcscCameraSessionManager f$0;

    public /* synthetic */ RtcscCameraSessionManager$$ExternalSyntheticLambda0(RtcscCameraSessionManager rtcscCameraSessionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = rtcscCameraSessionManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RtcscCameraSessionManager rtcscCameraSessionManager = this.f$0;
        switch (i) {
            case 0:
                rtcscCameraSessionManager.onSessionCreationTimeout();
                break;
            case 1:
                rtcscCameraSessionManager.lambda$onSessionRemoved$4();
                break;
            case 2:
                rtcscCameraSessionManager.lambda$disconnectSession$2();
                break;
            case 3:
                rtcscCameraSessionManager.lambda$requestSessionForDevice$0();
                break;
            default:
                rtcscCameraSessionManager.onFirstFrameTimeout();
                break;
        }
    }
}
