package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda19 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda19(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ExoPlayerImpl) this.f$0).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f$1);
                break;
            default:
                ((ExoPlayerImplInternal) this.f$0).lambda$sendMessageToTargetThread$2((PlayerMessage) this.f$1);
                break;
        }
    }
}
