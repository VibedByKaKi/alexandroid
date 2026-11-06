package androidx.camera.core;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraExecutor$$ExternalSyntheticLambda0 implements RejectedExecutionHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CameraExecutor$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.$r8$classId) {
            case 0:
                Logger.e(CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
                break;
            default:
                Log.w("PMI", "Dropping RUM span emission: bounded queue (capacity 8) is full");
                break;
        }
    }
}
