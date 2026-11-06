package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.Streams;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda10 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda10(BiConsumer biConsumer, int i) {
        this.$r8$classId = i;
        this.f$0 = biConsumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        BiConsumer biConsumer = this.f$0;
        switch (i) {
            case 0:
                Streams.lambda$forEachPair$8(biConsumer, (Streams.TemporaryPair) obj);
                break;
            case 1:
                JdkBackedImmutableMap.lambda$forEach$0(biConsumer, (Map.Entry) obj);
                break;
            default:
                Multimap.lambda$forEach$0(biConsumer, (Map.Entry) obj);
                break;
        }
    }
}
