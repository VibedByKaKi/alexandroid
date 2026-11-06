package androidx.media3.exoplayer.source;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ProgressiveMediaPeriod$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProgressiveMediaPeriod f$0;

    public /* synthetic */ ProgressiveMediaPeriod$$ExternalSyntheticLambda0(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.$r8$classId = i;
        this.f$0 = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.f$0;
        switch (i) {
            case 0:
                progressiveMediaPeriod.lambda$onLengthKnown$2();
                break;
            case 1:
                progressiveMediaPeriod.maybeFinishPrepare();
                break;
            default:
                progressiveMediaPeriod.lambda$new$0();
                break;
        }
    }
}
