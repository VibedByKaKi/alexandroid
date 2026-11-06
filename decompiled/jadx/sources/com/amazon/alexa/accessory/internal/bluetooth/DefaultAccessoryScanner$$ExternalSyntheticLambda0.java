package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryDataBeaconRecord;
import com.amazon.alexa.accessory.AccessoryScanRecord;
import com.amazon.alexa.accessory.AccessoryScannerListener;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryScanner$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ DefaultAccessoryScanner$$ExternalSyntheticLambda0(Accessory accessory, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = accessory;
        this.f$1 = obj;
        this.f$2 = i;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AccessoryScannerListener) obj).onBleDataBeaconFoundNearby(this.f$0, (AccessoryDataBeaconRecord) this.f$1, this.f$2);
                break;
            default:
                ((AccessoryScannerListener) obj).onBleAccessoryFoundNearby(this.f$0, (AccessoryScanRecord) this.f$1, this.f$2);
                break;
        }
    }
}
