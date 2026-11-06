package com.amazon.alexa.accessorykit;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AlexaUserSupplier$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AlexaUserSupplier$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource lambda$getIsChildProfile$5;
        SingleSource lambda$getDirectedIdWithTimeout$4;
        SingleSource lambda$getAccessTokenWithTimeout$6;
        ObservableSource lambda$getObserveSessionCountObservable$10;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$getIsChildProfile$5 = ((AlexaUserSupplier) obj).lambda$getIsChildProfile$5();
                return lambda$getIsChildProfile$5;
            case 1:
                lambda$getDirectedIdWithTimeout$4 = ((AlexaUserSupplier) obj).lambda$getDirectedIdWithTimeout$4();
                return lambda$getDirectedIdWithTimeout$4;
            case 2:
                lambda$getAccessTokenWithTimeout$6 = ((AlexaUserSupplier) obj).lambda$getAccessTokenWithTimeout$6();
                return lambda$getAccessTokenWithTimeout$6;
            default:
                lambda$getObserveSessionCountObservable$10 = AccessoriesFactory.lambda$getObserveSessionCountObservable$10((androidx.core.util.Supplier) obj);
                return lambda$getObserveSessionCountObservable$10;
        }
    }
}
