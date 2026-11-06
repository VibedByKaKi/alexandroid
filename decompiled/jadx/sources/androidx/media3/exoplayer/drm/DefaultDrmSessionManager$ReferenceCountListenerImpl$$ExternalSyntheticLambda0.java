package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((DefaultDrmSession) obj).release(null);
                break;
            default:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) obj).lambda$release$1();
                break;
        }
    }
}
