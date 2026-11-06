package com.amazon.dee.app.ui.nowplaying;

import androidx.databinding.ObservableBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NowPlayingViewModel$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NowPlayingViewModel$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((NowPlayingViewModel) obj).lambda$removeNativeNowplayingCard$1();
                break;
            case 1:
                ((NowPlayingViewModel) obj).lambda$onActivityDestroy$3();
                break;
            default:
                ((ObservableBoolean) obj).set(false);
                break;
        }
    }
}
