package com.amazon.rtvi.capture.client;

import com.amazon.alexa.accessory.persistence.device.DeviceDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class CaptureSourceClient$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ CaptureSourceClient$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CompletableFuture lambda$connectWithRetry$4;
        Object lambda$removeDeviceGroup$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$connectWithRetry$4 = ((CaptureSourceClient) this.f$0).lambda$connectWithRetry$4(this.f$1);
                return lambda$connectWithRetry$4;
            default:
                lambda$removeDeviceGroup$1 = ((DeviceDatabase) this.f$0).lambda$removeDeviceGroup$1(this.f$1);
                return lambda$removeDeviceGroup$1;
        }
    }
}
