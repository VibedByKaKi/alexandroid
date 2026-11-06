package com.amazon.alexa.accessorykit;

import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda46 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda46(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                booleanValue = bool.booleanValue();
                return booleanValue;
            default:
                booleanValue2 = bool.booleanValue();
                return booleanValue2;
        }
    }
}
