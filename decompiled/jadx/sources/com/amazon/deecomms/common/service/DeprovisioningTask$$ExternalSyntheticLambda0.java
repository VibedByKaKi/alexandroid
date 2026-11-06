package com.amazon.deecomms.common.service;

import com.amazon.deecomms.common.service.DeviceCallingAndroidService;
import com.amazon.deecomms.common.service.ProvisioningManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DeprovisioningTask$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeprovisioningTask$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((DeprovisioningTask) obj).lambda$handleProvisioningChange$0();
                break;
            case 1:
                ((ProvisioningManager.AnonymousClass1) obj).lambda$onPostExecute$0();
                break;
            case 2:
                ((DeviceCallingAndroidService) obj).lambda$postCallNotificationTimeoutRunnable$1();
                break;
            case 3:
                ((DeviceCallingAndroidService.PerformSIPRegistration) obj).releaseWakeLockIfNeeded();
                break;
            case 4:
                ((IncomingPushAndroidService) obj).lambda$startTimer$0();
                break;
            default:
                ((ProvisioningManager) obj).broadcastProvisionStatusCheckedEvent();
                break;
        }
    }
}
