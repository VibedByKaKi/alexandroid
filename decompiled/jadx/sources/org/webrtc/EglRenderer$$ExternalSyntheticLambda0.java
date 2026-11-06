package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.TextureBufferImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class EglRenderer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ EglRenderer$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) this.f$0).lambda$releaseEglSurface$5((Runnable) this.f$1);
                break;
            case 1:
                ((TextureBufferImpl) this.f$0).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f$1);
                break;
            case 2:
                ((EglRenderer) this.f$0).lambda$release$1((CountDownLatch) this.f$1);
                break;
            case 3:
                ((EglRenderer) this.f$0).lambda$release$2((Looper) this.f$1);
                break;
            case 4:
                ((VideoFileRenderer) this.f$0).lambda$onFrame$0((VideoFrame) this.f$1);
                break;
            case 5:
                ((VideoFileRenderer) this.f$0).lambda$release$2((CountDownLatch) this.f$1);
                break;
            default:
                ((VideoSource) this.f$0).lambda$setVideoProcessor$0((VideoFrame) this.f$1);
                break;
        }
    }
}
