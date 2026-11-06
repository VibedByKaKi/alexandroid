package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.AccessoryExplorer;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda18 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda18(Map.Entry entry, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Map.Entry entry = this.f$0;
        AccessoryExplorer.Observer observer = (AccessoryExplorer.Observer) obj;
        switch (i) {
            case 0:
                DefaultAccessoryExplorer.lambda$observeAccessoriesPersistenceChanges$10(entry, observer);
                break;
            case 1:
                DefaultAccessoryExplorer.lambda$observeAccessoriesPersistenceChanges$12(entry, observer);
                break;
            case 2:
                DefaultAccessoryExplorer.lambda$observeAccessoriesPersistenceChanges$13(entry, observer);
                break;
            default:
                DefaultAccessoryExplorer.lambda$stopObservingConnectedBluetoothDevices$1(entry, observer);
                break;
        }
    }
}
