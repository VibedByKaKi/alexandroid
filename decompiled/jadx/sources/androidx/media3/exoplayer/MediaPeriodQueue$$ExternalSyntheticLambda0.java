package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaPeriodQueue$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MediaPeriodQueue$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaPeriodQueue) this.f$0).lambda$notifyQueueUpdate$0((ImmutableList.Builder) this.f$1, (MediaSource.MediaPeriodId) this.f$2);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f$0).lambda$onDrmSessionManagerError$8((Pair) this.f$1, (Exception) this.f$2);
                break;
        }
    }
}
