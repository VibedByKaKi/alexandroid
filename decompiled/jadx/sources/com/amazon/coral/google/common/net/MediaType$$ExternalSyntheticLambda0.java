package com.amazon.coral.google.common.net;

import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.common.collect.ImmutableMultiset;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class MediaType$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MediaType$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$computeToString$0;
        switch (this.$r8$classId) {
            case 0:
                return ImmutableMultiset.copyOf((Collection) obj);
            default:
                lambda$computeToString$0 = MediaType.lambda$computeToString$0((String) obj);
                return lambda$computeToString$0;
        }
    }
}
