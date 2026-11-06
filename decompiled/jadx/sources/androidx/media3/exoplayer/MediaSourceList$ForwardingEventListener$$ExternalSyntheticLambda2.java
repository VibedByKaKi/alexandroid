package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f$0;
    public final /* synthetic */ Pair f$1;

    public /* synthetic */ MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.$r8$classId = i;
        this.f$0 = forwardingEventListener;
        this.f$1 = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDrmKeysRemoved$10(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onDrmKeysLoaded$7(this.f$1);
                break;
            case 2:
                this.f$0.lambda$onDrmKeysRestored$9(this.f$1);
                break;
            default:
                this.f$0.lambda$onDrmSessionReleased$11(this.f$1);
                break;
        }
    }
}
