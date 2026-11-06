package androidx.media3.session;

import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda27 implements MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda27(MediaControllerImplBase mediaControllerImplBase, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = mediaControllerImplBase;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(IMediaSession iMediaSession, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeMediaItems$35(this.f$1, this.f$2, iMediaSession, i);
                break;
            case 1:
                this.f$0.lambda$moveMediaItem$37(this.f$1, this.f$2, iMediaSession, i);
                break;
            default:
                this.f$0.lambda$setDeviceVolume$53(this.f$1, this.f$2, iMediaSession, i);
                break;
        }
    }
}
