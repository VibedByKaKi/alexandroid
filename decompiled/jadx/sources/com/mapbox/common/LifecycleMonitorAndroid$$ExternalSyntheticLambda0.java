package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class LifecycleMonitorAndroid$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ Expected f$1;

    public /* synthetic */ LifecycleMonitorAndroid$$ExternalSyntheticLambda0(Map.Entry entry, Expected expected, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = expected;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$19$lambda$17$lambda$16(this.f$0, this.f$1);
                break;
            default:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$13$lambda$11$lambda$10(this.f$0, this.f$1);
                break;
        }
    }
}
