package com.facebook.react;

import com.facebook.react.ReactInstanceManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ReactDelegate$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ReactDelegate$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ReactDelegate.reload$lambda$0((ReactDelegate) obj);
                break;
            case 1:
                ((ReactInstanceManager.InspectorTargetDelegateImpl) obj).lambda$onReload$0();
                break;
            case 2:
                ((ReactActivityDelegate) obj).lambda$onCreate$0();
                break;
            default:
                ((ReactInstanceManager) obj).lambda$runCreateReactContextOnNewThread$0();
                break;
        }
    }
}
