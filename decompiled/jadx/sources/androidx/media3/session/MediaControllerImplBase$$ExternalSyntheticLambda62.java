package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda62 implements MediaControllerImplBase.RemoteSessionTask, ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda62(MediaControllerImplBase mediaControllerImplBase, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaControllerImplBase;
        this.f$1 = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setDeviceMuted$66(this.f$1, (Player.Listener) obj);
                break;
            default:
                this.f$0.lambda$setDeviceMuted$64(this.f$1, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$setPlayWhenReady$14(this.f$1, iMediaSession, i);
                break;
            case 2:
                this.f$0.lambda$setShuffleModeEnabled$47(this.f$1, iMediaSession, i);
                break;
            default:
                this.f$0.lambda$setDeviceMuted$63(this.f$1, iMediaSession, i);
                break;
        }
    }
}
