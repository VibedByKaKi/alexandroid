package org.webrtc;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class SurfaceTextureHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceTextureHelper f$0;

    public /* synthetic */ SurfaceTextureHelper$$ExternalSyntheticLambda0(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceTextureHelper surfaceTextureHelper = this.f$0;
        switch (i) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                break;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                break;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                break;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                break;
        }
    }
}
