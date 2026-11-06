package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class EglRenderer$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EglRenderer$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((EglRenderer) obj).renderFrameOnRenderThread();
                break;
            case 1:
                ((VideoFrame.I420Buffer) obj).release();
                break;
            case 2:
                ((ScreenCapturerAndroidV2) obj).updateVirtualDisplay();
                break;
            case 3:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((VideoFileRenderer) obj).lambda$release$3();
                break;
        }
    }
}
