package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class MediaBrowserPlayer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaBrowserPlayer f$0;

    public /* synthetic */ MediaBrowserPlayer$$ExternalSyntheticLambda0(MediaBrowserPlayer mediaBrowserPlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaBrowserPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaBrowserPlayer mediaBrowserPlayer = this.f$0;
        switch (i) {
            case 0:
                mediaBrowserPlayer.lambda$teardown$0();
                break;
            case 1:
                mediaBrowserPlayer.lambda$cleanupCurrentSession$1();
                break;
            case 2:
                mediaBrowserPlayer.lambda$connect$2();
                break;
            default:
                mediaBrowserPlayer.lambda$performNextConnectionAttempt$3();
                break;
        }
    }
}
