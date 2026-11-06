package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class HlsSampleStreamWrapper$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HlsSampleStreamWrapper$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((HlsSampleStreamWrapper) obj).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) obj).onTracksEnded();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) obj).onPrepared();
                break;
        }
    }
}
