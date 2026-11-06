package com.brentvatne.exoplayer;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.ads.AdsLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactExoplayerView$$ExternalSyntheticLambda5 implements AdsLoader.Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactExoplayerView f$0;

    public /* synthetic */ ReactExoplayerView$$ExternalSyntheticLambda5(ReactExoplayerView reactExoplayerView, int i) {
        this.$r8$classId = i;
        this.f$0 = reactExoplayerView;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader.Provider
    public final AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration) {
        AdsLoader lambda$initializeAds$9;
        AdsLoader lambda$initializePlayerCore$8;
        int i = this.$r8$classId;
        ReactExoplayerView reactExoplayerView = this.f$0;
        switch (i) {
            case 0:
                lambda$initializeAds$9 = reactExoplayerView.lambda$initializeAds$9(adsConfiguration);
                return lambda$initializeAds$9;
            default:
                lambda$initializePlayerCore$8 = reactExoplayerView.lambda$initializePlayerCore$8(adsConfiguration);
                return lambda$initializePlayerCore$8;
        }
    }
}
