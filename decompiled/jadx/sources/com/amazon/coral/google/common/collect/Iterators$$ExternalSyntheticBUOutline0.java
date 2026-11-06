package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.CollectSpliterators;
import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Iterators$$ExternalSyntheticBUOutline0 implements CollectSpliterators.FlatMapSpliterator.Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Iterators$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, int i2, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.amazon.coral.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
    public Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, Function function, int i, long j) {
        switch (this.$r8$classId) {
            case 1:
                return new CollectSpliterators.FlatMapSpliteratorOfDouble((Spliterator.OfDouble) spliterator, spliterator2, function, i, j);
            case 2:
                return new CollectSpliterators.FlatMapSpliteratorOfInt((Spliterator.OfInt) spliterator, spliterator2, function, i, j);
            case 3:
                return new CollectSpliterators.FlatMapSpliteratorOfLong((Spliterator.OfLong) spliterator, spliterator2, function, i, j);
            default:
                return new CollectSpliterators.FlatMapSpliteratorOfObject(spliterator, spliterator2, function, i, j);
        }
    }
}
