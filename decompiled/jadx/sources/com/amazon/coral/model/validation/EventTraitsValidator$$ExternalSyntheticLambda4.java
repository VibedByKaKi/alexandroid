package com.amazon.coral.model.validation;

import com.amazon.coral.model.Model;
import com.amazon.coral.model.ReferenceModel;
import com.amazon.coral.model.ServiceOptionsTraits;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class EventTraitsValidator$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EventTraitsValidator$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$getMemberNames$5;
        switch (this.$r8$classId) {
            case 0:
                return ((ReferenceModel) obj).getId();
            case 1:
                return ((Model.Id) obj).getName();
            case 2:
                lambda$getMemberNames$5 = EventTraitsValidator.lambda$getMemberNames$5((String) obj);
                return lambda$getMemberNames$5;
            case 3:
                return Objects.toString((ServiceOptionsTraits.DisableSpecificityRoutingMode) obj);
            default:
                return Objects.toString((ServiceOptionsTraits.RoutingMode) obj);
        }
    }
}
