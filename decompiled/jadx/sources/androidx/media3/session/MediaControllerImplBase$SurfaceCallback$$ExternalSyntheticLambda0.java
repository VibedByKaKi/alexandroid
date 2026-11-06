package androidx.media3.session;

import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda0 implements MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase.SurfaceCallback f$0;

    public /* synthetic */ MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda0(MediaControllerImplBase.SurfaceCallback surfaceCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceCallback;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(IMediaSession iMediaSession, int i) {
        int i2 = this.$r8$classId;
        MediaControllerImplBase.SurfaceCallback surfaceCallback = this.f$0;
        switch (i2) {
            case 0:
                surfaceCallback.lambda$surfaceCreated$0(iMediaSession, i);
                break;
            case 1:
                surfaceCallback.lambda$surfaceDestroyed$1(iMediaSession, i);
                break;
            case 2:
                surfaceCallback.lambda$onSurfaceTextureAvailable$2(iMediaSession, i);
                break;
            default:
                surfaceCallback.lambda$onSurfaceTextureDestroyed$3(iMediaSession, i);
                break;
        }
    }
}
