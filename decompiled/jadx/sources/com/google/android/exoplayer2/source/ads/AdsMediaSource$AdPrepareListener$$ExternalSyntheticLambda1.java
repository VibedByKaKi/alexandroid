package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f$0).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.f$1);
                break;
            default:
                ((AdsMediaSource.ComponentListener) this.f$0).lambda$onAdPlaybackState$0((AdPlaybackState) this.f$1);
                break;
        }
    }
}
