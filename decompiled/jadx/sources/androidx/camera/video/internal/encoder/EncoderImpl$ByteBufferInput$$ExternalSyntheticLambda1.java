package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver, OutputConfig {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$fetchData$1;
        Object lambda$acquireBuffer$5;
        int i = this.$r8$classId;
        EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) this.f$0;
        switch (i) {
            case 0:
                lambda$fetchData$1 = byteBufferInput.lambda$fetchData$1(completer);
                return lambda$fetchData$1;
            default:
                lambda$acquireBuffer$5 = byteBufferInput.lambda$acquireBuffer$5(completer);
                return lambda$acquireBuffer$5;
        }
    }

    @Override // androidx.camera.video.internal.encoder.OutputConfig
    public MediaFormat getMediaFormat() {
        MediaFormat lambda$onOutputFormatChanged$5;
        lambda$onOutputFormatChanged$5 = EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$5((MediaFormat) this.f$0);
        return lambda$onOutputFormatChanged$5;
    }
}
