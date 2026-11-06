package com.amazon.alexa.accessorykit.internal.rxreactnative;

import com.amazon.alexa.accessorykit.internal.rxreactnative.RxRN;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class RxRN$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxRNEventId f$0;

    public /* synthetic */ RxRN$$ExternalSyntheticLambda4(RxRNEventId rxRNEventId, int i) {
        this.$r8$classId = i;
        this.f$0 = rxRNEventId;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        RxRN.RxRNEvent lambda$subscribe$0;
        RxRN.RxRNEvent lambda$subscribe$1;
        int i = this.$r8$classId;
        RxRNEventId rxRNEventId = this.f$0;
        switch (i) {
            case 0:
                lambda$subscribe$0 = RxRN.lambda$subscribe$0(rxRNEventId, (WritableArray) obj);
                return lambda$subscribe$0;
            default:
                lambda$subscribe$1 = RxRN.lambda$subscribe$1(rxRNEventId, (WritableMap) obj);
                return lambda$subscribe$1;
        }
    }
}
