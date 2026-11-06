package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f$0).lambda$onVideoSizeChanged$2((VideoSink.Listener) this.f$1, (VideoSize) this.f$2);
                break;
            case 1:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f$0).lambda$onError$3((VideoSink.Listener) this.f$1, (VideoFrameProcessingException) this.f$2);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f$0).lambda$inputFormatChanged$2((Format) this.f$1, (DecoderReuseEvaluation) this.f$2);
                break;
        }
    }
}
