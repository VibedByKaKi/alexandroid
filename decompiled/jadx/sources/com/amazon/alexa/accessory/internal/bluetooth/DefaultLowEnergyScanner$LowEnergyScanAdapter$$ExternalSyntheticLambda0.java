package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.bluetooth.DefaultLowEnergyScanner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultLowEnergyScanner$LowEnergyScanAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultLowEnergyScanner.LowEnergyScanAdapter f$0;

    public /* synthetic */ DefaultLowEnergyScanner$LowEnergyScanAdapter$$ExternalSyntheticLambda0(DefaultLowEnergyScanner.LowEnergyScanAdapter lowEnergyScanAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = lowEnergyScanAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DefaultLowEnergyScanner.LowEnergyScanAdapter lowEnergyScanAdapter = this.f$0;
        switch (i) {
            case 0:
                lowEnergyScanAdapter.lambda$notifyStarted$1();
                break;
            case 1:
                lowEnergyScanAdapter.lambda$notifyCompleted$2();
                break;
            default:
                lowEnergyScanAdapter.lambda$notifyCancelled$0();
                break;
        }
    }
}
