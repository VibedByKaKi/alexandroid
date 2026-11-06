package com.brentvatne.exoplayer;

import android.app.Activity;
import com.brentvatne.common.api.Source;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactExoplayerView$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ReactExoplayerView f$0;
    public final /* synthetic */ Source f$1;
    public final /* synthetic */ Activity f$2;
    public final /* synthetic */ ReactExoplayerView f$3;

    public /* synthetic */ ReactExoplayerView$$ExternalSyntheticLambda6(ReactExoplayerView reactExoplayerView, Source source, Activity activity, ReactExoplayerView reactExoplayerView2) {
        this.f$0 = reactExoplayerView;
        this.f$1 = source;
        this.f$2 = activity;
        this.f$3 = reactExoplayerView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$initializePlayer$6(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$initializePlayer$7(this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public /* synthetic */ ReactExoplayerView$$ExternalSyntheticLambda6(ReactExoplayerView reactExoplayerView, Source source, ReactExoplayerView reactExoplayerView2, Activity activity) {
        this.f$0 = reactExoplayerView;
        this.f$1 = source;
        this.f$3 = reactExoplayerView2;
        this.f$2 = activity;
    }
}
