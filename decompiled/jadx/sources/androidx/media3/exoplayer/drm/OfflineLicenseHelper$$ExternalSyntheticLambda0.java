package androidx.media3.exoplayer.drm;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class OfflineLicenseHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OfflineLicenseHelper f$0;
    public final /* synthetic */ SettableFuture f$1;
    public final /* synthetic */ DrmSession f$2;

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda0(DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture) {
        this.$r8$classId = 1;
        this.f$0 = offlineLicenseHelper;
        this.f$2 = drmSession;
        this.f$1 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getLicenseDurationRemainingSec$0(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$acquireFirstSessionOnHandlerThread$3(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.f$1, this.f$2);
                break;
        }
    }

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda0(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession, int i) {
        this.$r8$classId = i;
        this.f$0 = offlineLicenseHelper;
        this.f$1 = settableFuture;
        this.f$2 = drmSession;
    }
}
