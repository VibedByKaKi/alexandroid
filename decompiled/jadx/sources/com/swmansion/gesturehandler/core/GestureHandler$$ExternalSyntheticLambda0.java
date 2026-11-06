package com.swmansion.gesturehandler.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class GestureHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GestureHandler f$0;

    public /* synthetic */ GestureHandler$$ExternalSyntheticLambda0(int i, GestureHandler gestureHandler) {
        this.$r8$classId = i;
        this.f$0 = gestureHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        GestureHandler gestureHandler = this.f$0;
        switch (i) {
            case 0:
                gestureHandler.cancel();
                break;
            default:
                gestureHandler.cancel();
                break;
        }
    }
}
