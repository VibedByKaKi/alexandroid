package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class BasePreloadManager$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BasePreloadManager f$0;
    public final /* synthetic */ MediaSource f$1;

    public /* synthetic */ BasePreloadManager$$ExternalSyntheticLambda2(BasePreloadManager basePreloadManager, MediaSource mediaSource, int i) {
        this.$r8$classId = i;
        this.f$0 = basePreloadManager;
        this.f$1 = mediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPreloadCompleted$2(this.f$1);
                break;
            default:
                this.f$0.lambda$onPreloadSkipped$5(this.f$1);
                break;
        }
    }
}
