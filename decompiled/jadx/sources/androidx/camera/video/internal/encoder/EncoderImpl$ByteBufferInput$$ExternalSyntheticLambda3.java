package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl.ByteBufferInput f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;

    public /* synthetic */ EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda3(EncoderImpl.ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer, int i) {
        this.$r8$classId = i;
        this.f$0 = byteBufferInput;
        this.f$1 = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$acquireBuffer$4(this.f$1);
                break;
            default:
                this.f$0.lambda$fetchData$0(this.f$1);
                break;
        }
    }
}
