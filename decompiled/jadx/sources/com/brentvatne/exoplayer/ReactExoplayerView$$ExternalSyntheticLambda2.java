package com.brentvatne.exoplayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactExoplayerView$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactExoplayerView f$0;

    public /* synthetic */ ReactExoplayerView$$ExternalSyntheticLambda2(ReactExoplayerView reactExoplayerView, int i) {
        this.$r8$classId = i;
        this.f$0 = reactExoplayerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ReactExoplayerView reactExoplayerView = this.f$0;
        switch (i) {
            case 0:
                reactExoplayerView.lambda$selectTextTrackInternal$12();
                break;
            case 1:
                PictureInPictureUtil.addLifecycleEventListener$lambda$1(reactExoplayerView);
                break;
            case 2:
                reactExoplayerView.lambda$setFullscreen$13();
                break;
            case 3:
                reactExoplayerView.lambda$setFullscreen$14();
                break;
            default:
                reactExoplayerView.pausePlayback();
                break;
        }
    }
}
