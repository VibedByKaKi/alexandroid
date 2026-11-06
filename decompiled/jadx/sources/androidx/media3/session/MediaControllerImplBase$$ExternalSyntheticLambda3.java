package androidx.media3.session;

import androidx.media3.common.MediaItem;
import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda3 implements MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase f$0;
    public final /* synthetic */ MediaItem f$1;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda3(MediaControllerImplBase mediaControllerImplBase, MediaItem mediaItem, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaControllerImplBase;
        this.f$1 = mediaItem;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(IMediaSession iMediaSession, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addMediaItem$30(this.f$1, iMediaSession, i);
                break;
            default:
                this.f$0.lambda$setMediaItem$22(this.f$1, iMediaSession, i);
                break;
        }
    }
}
