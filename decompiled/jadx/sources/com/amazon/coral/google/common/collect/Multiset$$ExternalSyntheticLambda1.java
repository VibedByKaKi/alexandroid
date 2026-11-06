package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.Multimaps;
import com.amazon.coral.google.common.collect.Multiset;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Multiset$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ Multiset$$ExternalSyntheticLambda1(Consumer consumer, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Consumer consumer = this.f$0;
        switch (i) {
            case 0:
                Multiset.lambda$forEach$1(consumer, (Multiset.Entry) obj);
                break;
            default:
                Multimaps.Keys.lambda$forEach$0(consumer, (Map.Entry) obj);
                break;
        }
    }
}
