package com.amazon.alexa.accessory.internal.bluetooth;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultBluetoothDeviceBonder;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultBluetoothDeviceBonder$BondingDevice$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultBluetoothDeviceBonder$BondingDevice$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((DefaultBluetoothDeviceBonder.BondingDevice) this.f$0).lambda$notifyCompleted$4((ArrayList) this.f$1);
                break;
            case 1:
                ((DefaultBluetoothDeviceBonder.BondingDevice) this.f$0).lambda$notifyFailed$3((ArrayList) this.f$1);
                break;
            default:
                DefaultBluetoothDeviceBonder.ActiveBondStateMonitor.lambda$new$0((BluetoothDevice) this.f$0, (DefaultBluetoothDeviceBonder.ActiveBondStateMonitor.Callback) this.f$1);
                break;
        }
    }
}
