package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda0(EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.$r8$classId = 1;
        this.f$0 = mediaCodecCallback;
        this.f$2 = bufferInfo;
        this.f$3 = mediaCodec;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                EncoderImpl.lambda$notifyError$11((EncoderCallback) this.f$0, this.f$1, (String) this.f$2, (Throwable) this.f$3);
                break;
            case 1:
                ((EncoderImpl.MediaCodecCallback) this.f$0).lambda$onOutputBufferAvailable$1((MediaCodec.BufferInfo) this.f$2, (MediaCodec) this.f$3, this.f$1);
                break;
            default:
                ((EncoderImpl) this.f$0).lambda$handleEncodeError$10(this.f$1, (String) this.f$2, (Throwable) this.f$3);
                break;
        }
    }

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda0(Object obj, int i, String str, Throwable th, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = th;
    }
}
