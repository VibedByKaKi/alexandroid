package androidx.media3.exoplayer.source.preload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PreloadMediaSource$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PreloadMediaSource f$0;

    public /* synthetic */ PreloadMediaSource$$ExternalSyntheticLambda0(PreloadMediaSource preloadMediaSource, int i) {
        this.$r8$classId = i;
        this.f$0 = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        PreloadMediaSource preloadMediaSource = this.f$0;
        switch (i) {
            case 0:
                preloadMediaSource.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                preloadMediaSource.lambda$clear$1();
                break;
            default:
                preloadMediaSource.checkForPreloadError();
                break;
        }
    }
}
