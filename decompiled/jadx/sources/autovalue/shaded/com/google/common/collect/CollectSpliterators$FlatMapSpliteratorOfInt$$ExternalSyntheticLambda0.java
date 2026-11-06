package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.CollectSpliterators;
import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CollectSpliterators$FlatMapSpliteratorOfInt$$ExternalSyntheticLambda0 implements CollectSpliterators.FlatMapSpliterator.Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CollectSpliterators$FlatMapSpliteratorOfInt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // autovalue.shaded.com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
    public final Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, Function function, int i, long j) {
        switch (this.$r8$classId) {
            case 0:
                return new CollectSpliterators.FlatMapSpliteratorOfInt((Spliterator.OfInt) spliterator, spliterator2, function, i, j);
            case 1:
                return new CollectSpliterators.FlatMapSpliteratorOfDouble((Spliterator.OfDouble) spliterator, spliterator2, function, i, j);
            case 2:
                return new CollectSpliterators.FlatMapSpliteratorOfLong((Spliterator.OfLong) spliterator, spliterator2, function, i, j);
            default:
                return new CollectSpliterators.FlatMapSpliteratorOfObject(spliterator, spliterator2, function, i, j);
        }
    }
}
