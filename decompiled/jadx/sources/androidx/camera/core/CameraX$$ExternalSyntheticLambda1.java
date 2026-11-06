package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ CameraX f$0;
    public final /* synthetic */ Executor f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Context f$4;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$5;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda1(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter.Completer completer, long j) {
        this.f$0 = cameraX;
        this.f$4 = context;
        this.f$1 = executor;
        this.f$3 = i;
        this.f$5 = completer;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Context context = this.f$4;
                CallbackToFutureAdapter.Completer completer = this.f$5;
                this.f$0.lambda$initAndRetryRecursively$1(this.f$1, this.f$2, this.f$3, context, completer);
                break;
            default:
                this.f$0.lambda$initAndRetryRecursively$2(this.f$4, this.f$1, this.f$3, this.f$5, this.f$2);
                break;
        }
    }

    public /* synthetic */ CameraX$$ExternalSyntheticLambda1(CameraX cameraX, Executor executor, long j, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        this.f$0 = cameraX;
        this.f$1 = executor;
        this.f$2 = j;
        this.f$3 = i;
        this.f$4 = context;
        this.f$5 = completer;
    }
}
