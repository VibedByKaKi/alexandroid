package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryExplorer;
import com.amazon.alexa.accessory.AccessoryInquiryRecord;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;
    public final /* synthetic */ AccessoryInquiryRecord f$1;

    public /* synthetic */ DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda5(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord, int i) {
        this.$r8$classId = i;
        this.f$0 = accessory;
        this.f$1 = accessoryInquiryRecord;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryFound(this.f$0, this.f$1);
                break;
            case 1:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryFound(this.f$0, this.f$1);
                break;
            case 2:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryConnected(this.f$0, this.f$1);
                break;
            case 3:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryLost(this.f$0, this.f$1);
                break;
            case 4:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryFound(this.f$0, this.f$1);
                break;
            default:
                ((AccessoryExplorer.Observer) obj).onUnknownAccessoryConnected(this.f$0, this.f$1);
                break;
        }
    }
}
