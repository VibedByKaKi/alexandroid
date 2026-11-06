package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryInquiryRecord;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import com.amazon.alexa.accessory.internal.session.AccessoryInquirySession;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda5(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DefaultAccessoryExplorer.lambda$recordAccessoryExplorerMetrics$22((String) this.f$0, (String) this.f$1, (String) this.f$2, (Throwable) obj);
                break;
            case 1:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver) this.f$0).lambda$queryAccessoryInquiryRecord$20((Accessory) this.f$1, (AccessoryInquirySession) this.f$2, (Throwable) obj);
                break;
            default:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver) this.f$0).lambda$queryAccessoryInquiryRecord$21((Accessory) this.f$1, (com.amazon.alexa.accessory.internal.util.functions.Consumer) this.f$2, (AccessoryInquiryRecord) obj);
                break;
        }
    }
}
