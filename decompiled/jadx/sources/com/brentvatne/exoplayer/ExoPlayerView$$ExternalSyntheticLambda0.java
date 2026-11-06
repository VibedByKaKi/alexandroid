package com.brentvatne.exoplayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ExoPlayerView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExoPlayerView f$0;

    public /* synthetic */ ExoPlayerView$$ExternalSyntheticLambda0(ExoPlayerView exoPlayerView, int i) {
        this.$r8$classId = i;
        this.f$0 = exoPlayerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ExoPlayerView exoPlayerView = this.f$0;
        switch (i) {
            case 0:
                ExoPlayerView.layoutRunnable$lambda$5(exoPlayerView);
                break;
            default:
                ExoPlayerView$playerListener$1.onTimelineChanged$lambda$1(exoPlayerView);
                break;
        }
    }
}
