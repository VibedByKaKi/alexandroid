package androidx.media3.exoplayer.drm;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class OfflineLicenseHelper$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda3(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((OfflineLicenseHelper) this.f$0).lambda$releaseManagerOnHandlerThread$4((SettableFuture) this.f$1);
                break;
            default:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f$0).lambda$acquire$0((Format) this.f$1);
                break;
        }
    }
}
