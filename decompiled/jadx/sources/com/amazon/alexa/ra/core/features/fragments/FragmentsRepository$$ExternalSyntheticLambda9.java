package com.amazon.alexa.ra.core.features.fragments;

import com.amazon.alexa.ra.core.features.fragments.FragmentsRepository;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FragmentsRepository$$ExternalSyntheticLambda9 implements UnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FragmentsRepository$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        FragmentsRepository.PendingCardRead dropRefreshChunk$lambda$82;
        FragmentsRepository.PendingCardRead clearPendingCardRead$lambda$33;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                dropRefreshChunk$lambda$82 = FragmentsRepository.dropRefreshChunk$lambda$82((FragmentsRepository.PendingCardRead) obj2, (FragmentsRepository.PendingCardRead) obj);
                return dropRefreshChunk$lambda$82;
            default:
                clearPendingCardRead$lambda$33 = FragmentsRepository.clearPendingCardRead$lambda$33((String) obj2, (FragmentsRepository.PendingCardRead) obj);
                return clearPendingCardRead$lambda$33;
        }
    }
}
