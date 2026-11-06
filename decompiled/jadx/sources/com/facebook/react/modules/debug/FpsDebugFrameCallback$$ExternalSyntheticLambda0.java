package com.facebook.react.modules.debug;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class FpsDebugFrameCallback$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FpsDebugFrameCallback f$0;

    public /* synthetic */ FpsDebugFrameCallback$$ExternalSyntheticLambda0(FpsDebugFrameCallback fpsDebugFrameCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = fpsDebugFrameCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        FpsDebugFrameCallback fpsDebugFrameCallback = this.f$0;
        switch (i) {
            case 0:
                FpsDebugFrameCallback.start$lambda$0(fpsDebugFrameCallback);
                break;
            default:
                FpsDebugFrameCallback.stop$lambda$1(fpsDebugFrameCallback);
                break;
        }
    }
}
