package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda22 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda22(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$startObservingLeDevices$18;
        Boolean lambda$shouldRequestInquiryRecord$14;
        switch (this.$r8$classId) {
            case 0:
                lambda$startObservingLeDevices$18 = ((DefaultAccessoryExplorer) this.f$0).lambda$startObservingLeDevices$18((List) this.f$1, (Set) obj);
                return lambda$startObservingLeDevices$18;
            default:
                lambda$shouldRequestInquiryRecord$14 = ((DefaultAccessoryExplorer.DeviceConnectivityObserver) this.f$0).lambda$shouldRequestInquiryRecord$14((Accessory) this.f$1, (Boolean) obj);
                return lambda$shouldRequestInquiryRecord$14;
        }
    }
}
