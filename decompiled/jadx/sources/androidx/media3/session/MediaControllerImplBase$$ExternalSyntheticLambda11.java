package androidx.media3.session;

import android.view.Surface;
import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda11 implements MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase f$0;
    public final /* synthetic */ Surface f$1;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda11(MediaControllerImplBase mediaControllerImplBase, Surface surface, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaControllerImplBase;
        this.f$1 = surface;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(IMediaSession iMediaSession, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setVideoSurface$70(this.f$1, iMediaSession, i);
                break;
            default:
                this.f$0.lambda$setVideoSurfaceHolder$71(this.f$1, iMediaSession, i);
                break;
        }
    }
}
