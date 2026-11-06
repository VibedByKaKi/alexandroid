package androidx.media3.exoplayer.scheduler;

import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f$0;

    public /* synthetic */ RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0(RequirementsWatcher.NetworkCallback networkCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RequirementsWatcher.NetworkCallback networkCallback = this.f$0;
        switch (i) {
            case 0:
                networkCallback.lambda$postCheckRequirements$0();
                break;
            default:
                networkCallback.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
