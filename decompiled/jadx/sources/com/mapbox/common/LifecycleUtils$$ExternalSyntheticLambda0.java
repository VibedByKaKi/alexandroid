package com.mapbox.common;

import android.content.Context;
import android.os.Looper;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ Looper f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda0(Context context, Looper looper, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = looper;
        this.f$2 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15(this.f$0, this.f$1, this.f$2);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
