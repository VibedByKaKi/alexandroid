package it.innove;

import android.bluetooth.BluetoothGattCharacteristic;
import com.facebook.react.bridge.Callback;
import com.mapbox.maps.renderer.MapboxRenderer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda12 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda12(Peripheral peripheral, boolean z, Callback callback, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        this.f$0 = peripheral;
        this.f$1 = z;
        this.f$2 = callback;
        this.f$3 = bluetoothGattCharacteristic;
        this.f$4 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Peripheral) this.f$0).lambda$enqueueWrite$17(this.f$1, (Callback) this.f$2, (BluetoothGattCharacteristic) this.f$3, (byte[]) this.f$4);
                break;
            default:
                MapboxRenderer.snapshot$lambda$3$lambda$2((ReentrantLock) this.f$0, (Ref.ObjectRef) this.f$2, (MapboxRenderer) this.f$3, this.f$1, (Condition) this.f$4);
                break;
        }
    }

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda12(ReentrantLock reentrantLock, Ref.ObjectRef objectRef, MapboxRenderer mapboxRenderer, boolean z, Condition condition) {
        this.f$0 = reentrantLock;
        this.f$2 = objectRef;
        this.f$3 = mapboxRenderer;
        this.f$1 = z;
        this.f$4 = condition;
    }
}
