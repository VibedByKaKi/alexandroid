package com.amazon.alexa.accessorykit.interprocess;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterprocessUserSupplier$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ InterprocessUserSupplier$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource lambda$getUser$5;
        ObservableSource lambda$queryUser$0;
        SingleSource lambda$fetchLocation$2;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$getUser$5 = ((InterprocessUserSupplier) obj).lambda$getUser$5();
                return lambda$getUser$5;
            case 1:
                lambda$queryUser$0 = ((InterprocessUserSupplier) obj).lambda$queryUser$0();
                return lambda$queryUser$0;
            default:
                lambda$fetchLocation$2 = ((InterprocessLocationSensorAccessProvider) obj).lambda$fetchLocation$2();
                return lambda$fetchLocation$2;
        }
    }
}
