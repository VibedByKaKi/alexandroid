package com.mapbox.common;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda3(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(function1);
                break;
            case 1:
                LifecycleManager.getLifecycleState$lambda$10$lambda$9(function1);
                break;
            case 2:
                LifecycleManager.getLifecycleState$lambda$14$lambda$13$lambda$12(function1);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(function1);
                break;
        }
    }
}
