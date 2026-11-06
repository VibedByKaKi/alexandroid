package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.CollectSpliterators;
import com.amazon.coral.google.common.collect.Multiset;
import com.amazon.coral.google.common.collect.Streams;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Streams.C1OptionalState) obj2).set(obj);
                break;
            case 1:
                ((CollectSpliterators.FlatMapSpliterator) obj2).lambda$tryAdvance$0(obj);
                break;
            case 2:
                ((CollectSpliterators.FlatMapSpliteratorOfPrimitive) obj2).lambda$tryAdvance$0(obj);
                break;
            default:
                Multiset.lambda$forEachEntry$0((ObjIntConsumer) obj2, (Multiset.Entry) obj);
                break;
        }
    }
}
