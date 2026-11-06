package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda6(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EncoderImpl) this.f$0).lambda$stopMediaCodec$12((ArrayList) this.f$1, (Runnable) this.f$2);
                break;
            case 1:
                ((EncoderImpl.ByteBufferInput) this.f$0).lambda$addObserver$7((Observable.Observer) this.f$1, (Executor) this.f$2);
                break;
            default:
                ((EncoderImpl.MediaCodecCallback) this.f$0).lambda$reachEndData$2((Executor) this.f$1, (EncoderCallback) this.f$2);
                break;
        }
    }
}
