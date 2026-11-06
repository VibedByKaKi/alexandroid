package com.facebook.react;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ReactInstanceManager$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactInstanceManager f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ReactInstanceManager$$ExternalSyntheticLambda1(ReactInstanceManager reactInstanceManager, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = reactInstanceManager;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$runCreateReactContextOnNewThread$2((ReactInstanceManager.ReactContextInitParams) this.f$1);
                break;
            default:
                this.f$0.lambda$runCreateReactContextOnNewThread$1((ReactApplicationContext) this.f$1);
                break;
        }
    }
}
