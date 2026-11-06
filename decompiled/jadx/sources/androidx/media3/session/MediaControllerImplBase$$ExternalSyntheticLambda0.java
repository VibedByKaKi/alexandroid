package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda0 implements MediaControllerImplBase.RemoteSessionTask, ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplBase f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda0(MediaControllerImplBase mediaControllerImplBase, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaControllerImplBase;
        this.f$1 = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.lambda$setDeviceVolume$52(this.f$1, (Player.Listener) obj);
                break;
            case 4:
                this.f$0.lambda$decreaseDeviceVolume$60(this.f$1, (Player.Listener) obj);
                break;
            case 5:
            case 8:
            default:
                this.f$0.lambda$increaseDeviceVolume$58(this.f$1, (Player.Listener) obj);
                break;
            case 6:
                this.f$0.lambda$decreaseDeviceVolume$62(this.f$1, (Player.Listener) obj);
                break;
            case 7:
                this.f$0.lambda$setDeviceVolume$54(this.f$1, (Player.Listener) obj);
                break;
            case 9:
                this.f$0.lambda$increaseDeviceVolume$56(this.f$1, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$seekToDefaultPosition$9(this.f$1, iMediaSession, i);
                break;
            case 1:
                this.f$0.lambda$setRepeatMode$45(this.f$1, iMediaSession, i);
                break;
            case 2:
                this.f$0.lambda$setDeviceVolume$51(this.f$1, iMediaSession, i);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                this.f$0.lambda$increaseDeviceVolume$57(this.f$1, iMediaSession, i);
                break;
            case 5:
                this.f$0.lambda$decreaseDeviceVolume$61(this.f$1, iMediaSession, i);
                break;
            case 8:
                this.f$0.lambda$removeMediaItem$34(this.f$1, iMediaSession, i);
                break;
        }
    }
}
