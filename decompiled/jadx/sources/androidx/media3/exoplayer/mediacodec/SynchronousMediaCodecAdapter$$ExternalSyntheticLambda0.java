package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaCodecAdapter f$0;
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f$1;

    public /* synthetic */ SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaCodecAdapter;
        this.f$1 = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.$r8$classId) {
            case 0:
                ((SynchronousMediaCodecAdapter) this.f$0).lambda$setOnFrameRenderedListener$0(this.f$1, mediaCodec, j, j2);
                break;
            default:
                ((AsynchronousMediaCodecAdapter) this.f$0).lambda$setOnFrameRenderedListener$0(this.f$1, mediaCodec, j, j2);
                break;
        }
    }
}
