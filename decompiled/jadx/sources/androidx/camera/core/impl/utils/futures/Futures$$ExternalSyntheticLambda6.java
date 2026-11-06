package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScheduledFuture f$0;

    public /* synthetic */ Futures$$ExternalSyntheticLambda6(ScheduledFuture scheduledFuture, int i) {
        this.$r8$classId = i;
        this.f$0 = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ScheduledFuture scheduledFuture = this.f$0;
        switch (i) {
            case 0:
                scheduledFuture.cancel(true);
                break;
            default:
                scheduledFuture.cancel(true);
                break;
        }
    }
}
