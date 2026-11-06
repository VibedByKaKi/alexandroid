package com.amazon.coral.model.validation;

import com.amazon.coral.model.ReferenceModel;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class EventTraitsValidator$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EventTraitsValidator$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getPayloads$1;
        boolean lambda$getHeaders$2;
        boolean lambda$getUnmarkedMembers$3;
        boolean lambda$getUnmarkedMembers$4;
        ReferenceModel referenceModel = (ReferenceModel) obj;
        switch (this.$r8$classId) {
            case 0:
                lambda$getPayloads$1 = EventTraitsValidator.lambda$getPayloads$1(referenceModel);
                return lambda$getPayloads$1;
            case 1:
                lambda$getHeaders$2 = EventTraitsValidator.lambda$getHeaders$2(referenceModel);
                return lambda$getHeaders$2;
            case 2:
                lambda$getUnmarkedMembers$3 = EventTraitsValidator.lambda$getUnmarkedMembers$3(referenceModel);
                return lambda$getUnmarkedMembers$3;
            default:
                lambda$getUnmarkedMembers$4 = EventTraitsValidator.lambda$getUnmarkedMembers$4(referenceModel);
                return lambda$getUnmarkedMembers$4;
        }
    }
}
