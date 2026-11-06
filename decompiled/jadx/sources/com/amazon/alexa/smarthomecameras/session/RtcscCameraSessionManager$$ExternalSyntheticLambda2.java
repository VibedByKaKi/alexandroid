package com.amazon.alexa.smarthomecameras.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class RtcscCameraSessionManager$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RtcscCameraSessionManager f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ RtcscCameraSessionManager$$ExternalSyntheticLambda2(RtcscCameraSessionManager rtcscCameraSessionManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = rtcscCameraSessionManager;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$disconnectSession$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onSessionAvailable$3(this.f$1);
                break;
        }
    }
}
