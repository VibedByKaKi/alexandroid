package com.amazon.alexa.accessory.internal.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.util.Pair;
import com.amazon.alexa.accessory.AccessoryExplorer;
import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.bluetooth.BluetoothBondStateChangedReceiver;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda9 implements Consumer, Predicate, BluetoothBondStateChangedReceiver.Listener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public void accept(Object obj) {
        DefaultAccessoryExplorer.GattDeviceMonitorObserver.lambda$onDisconnected$1((PeripheralDevice) this.f$0, (AccessoryExplorer.Observer) obj);
    }

    @Override // com.amazon.alexa.accessory.internal.bluetooth.BluetoothBondStateChangedReceiver.Listener
    public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i, int i2) {
        ((DefaultBluetoothDeviceBonder) this.f$0).lambda$new$0(bluetoothDevice, i, i2);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$observeStandbyAccessories$4;
        boolean lambda$startObservingLeDevices$17;
        boolean lambda$requestCompanionDevice$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$observeStandbyAccessories$4 = ((DefaultAccessoryExplorer) obj2).lambda$observeStandbyAccessories$4((String) obj);
                return lambda$observeStandbyAccessories$4;
            case 1:
            default:
                lambda$requestCompanionDevice$1 = DefaultCompanionDeviceModule.lambda$requestCompanionDevice$1((String) obj2, (Pair) obj);
                return lambda$requestCompanionDevice$1;
            case 2:
                lambda$startObservingLeDevices$17 = DefaultAccessoryExplorer.lambda$startObservingLeDevices$17((Set) obj2, (DeviceGroup) obj);
                return lambda$startObservingLeDevices$17;
        }
    }
}
