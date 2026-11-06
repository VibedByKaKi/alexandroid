package androidx.media3.session;

import android.os.Handler;
import androidx.media3.common.util.Util;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSessionImpl$$ExternalSyntheticLambda34 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MediaSessionImpl$$ExternalSyntheticLambda34(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((MediaSessionImpl) obj).postOrRunOnApplicationHandler(runnable);
                break;
            case 1:
                ((MediaControllerHolder) obj).lambda$setController$1(runnable);
                break;
            case 2:
                ((MediaLibrarySessionImpl) obj).postOrRunOnApplicationHandler(runnable);
                break;
            default:
                Util.postOrRun((Handler) obj, runnable);
                break;
        }
    }
}
