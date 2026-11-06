package com.facebook.react.bridge;

import com.facebook.react.bridge.CatalystInstanceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class CatalystInstanceImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CatalystInstanceImpl f$0;

    public /* synthetic */ CatalystInstanceImpl$$ExternalSyntheticLambda0(CatalystInstanceImpl catalystInstanceImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CatalystInstanceImpl catalystInstanceImpl = this.f$0;
        switch (i) {
            case 0:
                catalystInstanceImpl.lambda$destroy$2();
                break;
            case 1:
                CatalystInstanceImpl.InstanceCallback.lambda$onBatchComplete$0(catalystInstanceImpl);
                break;
            case 2:
                catalystInstanceImpl.lambda$destroy$1();
                break;
            case 3:
                catalystInstanceImpl.lambda$onNativeException$6();
                break;
            case 4:
                catalystInstanceImpl.lambda$destroy$0();
                break;
            case 5:
                catalystInstanceImpl.lambda$incrementPendingJSCalls$4();
                break;
            case 6:
                catalystInstanceImpl.lambda$initialize$3();
                break;
            default:
                catalystInstanceImpl.lambda$decrementPendingJSCalls$5();
                break;
        }
    }
}
