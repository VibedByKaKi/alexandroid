package com.amazon.alexa.accessorykit;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AlexaUserSupplier$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaUserSupplier f$0;

    public /* synthetic */ AlexaUserSupplier$$ExternalSyntheticLambda2(AlexaUserSupplier alexaUserSupplier, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaUserSupplier;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$queryUser$0;
        SingleSource lambda$getUserRx2$3;
        int i = this.$r8$classId;
        AlexaUserSupplier alexaUserSupplier = this.f$0;
        switch (i) {
            case 0:
                lambda$queryUser$0 = alexaUserSupplier.lambda$queryUser$0(obj);
                return lambda$queryUser$0;
            default:
                lambda$getUserRx2$3 = alexaUserSupplier.lambda$getUserRx2$3((String) obj);
                return lambda$getUserRx2$3;
        }
    }
}
