package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlaybackVideoGraphWrapper.InputVideoSink f$0;
    public final /* synthetic */ VideoSink.Listener f$1;

    public /* synthetic */ PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda2(PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink, VideoSink.Listener listener, int i) {
        this.$r8$classId = i;
        this.f$0 = inputVideoSink;
        this.f$1 = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFirstFrameRendered$0(this.f$1);
                break;
            default:
                this.f$0.lambda$onFrameDropped$1(this.f$1);
                break;
        }
    }
}
