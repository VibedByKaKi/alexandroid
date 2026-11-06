package com.amazon.alexa.location;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultLocationService$$ExternalSyntheticLambda40 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultLocationService$$ExternalSyntheticLambda40(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        String lambda$reportStatusToALS$9;
        switch (this.$r8$classId) {
            case 0:
                lambda$reportStatusToALS$9 = DefaultLocationService.lambda$reportStatusToALS$9();
                return lambda$reportStatusToALS$9;
            default:
                return new ArrayList();
        }
    }
}
