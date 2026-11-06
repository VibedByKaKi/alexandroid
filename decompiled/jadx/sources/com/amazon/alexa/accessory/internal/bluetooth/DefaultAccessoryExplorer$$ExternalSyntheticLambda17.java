package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryExplorer;
import com.amazon.alexa.accessory.AccessoryInquiryRecord;
import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda17 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda17(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((DefaultAccessoryExplorer) this.f$0).lambda$observeAccessoriesPersistenceChanges$9((Accessory) this.f$1, (AccessoryExplorer.Observer) obj);
                break;
            case 1:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver) this.f$0).lambda$handleUnknownAccessoryConnectedViaSpp$25((Accessory) this.f$1, (AccessoryInquiryRecord) obj);
                break;
            case 2:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver.AnonymousClass1) this.f$0).lambda$onSuccess$4((Accessory) this.f$1, (AccessoryInquiryRecord) obj);
                break;
            case 3:
                ((DefaultAccessoryExplorer.GattDeviceMonitorObserver) this.f$0).lambda$onConnected$0((PeripheralDevice) this.f$1, (AccessoryExplorer.Observer) obj);
                break;
            default:
                ((DefaultAccessoryExplorer) this.f$0).lambda$observeAccessoriesPersistenceChanges$11((Map.Entry) this.f$1, (AccessoryExplorer.Observer) obj);
                break;
        }
    }
}
