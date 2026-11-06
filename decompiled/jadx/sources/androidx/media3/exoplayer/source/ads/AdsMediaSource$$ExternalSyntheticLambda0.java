package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class AdsMediaSource$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AdsMediaSource f$0;
    public final /* synthetic */ AdsMediaSource.ComponentListener f$1;

    public /* synthetic */ AdsMediaSource$$ExternalSyntheticLambda0(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i) {
        this.$r8$classId = i;
        this.f$0 = adsMediaSource;
        this.f$1 = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$prepareSourceInternal$0(this.f$1);
                break;
            default:
                this.f$0.lambda$releaseSourceInternal$1(this.f$1);
                break;
        }
    }
}
