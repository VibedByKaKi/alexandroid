package com.amazon.coral.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Maps$KeySet$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ Maps$KeySet$$ExternalSyntheticLambda0(Consumer consumer, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Consumer consumer = this.f$0;
        switch (i) {
            case 0:
                consumer.accept(obj);
                break;
            case 1:
                consumer.accept(obj);
                break;
            case 2:
                consumer.accept(obj2);
                break;
            default:
                consumer.accept(obj2);
                break;
        }
    }
}
