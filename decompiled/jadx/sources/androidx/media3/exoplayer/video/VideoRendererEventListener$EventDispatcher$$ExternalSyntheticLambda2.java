package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f$0 = eventDispatcher;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$droppedFrames$3(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$reportVideoFrameProcessingOffset$4(this.f$2, this.f$1);
                break;
        }
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f$0 = eventDispatcher;
        this.f$2 = j;
        this.f$1 = i;
    }
}
