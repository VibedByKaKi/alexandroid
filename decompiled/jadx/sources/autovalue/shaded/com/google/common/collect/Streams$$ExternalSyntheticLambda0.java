package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.ImmutableTable;
import autovalue.shaded.com.google.common.collect.Multiset;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Streams$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Spliterator.OfLong lambda$concat$4;
        Spliterator lambda$spliteratorImpl$0;
        Spliterator.OfDouble lambda$concat$6;
        Spliterator.OfInt lambda$concat$2;
        Spliterator lambda$concat$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$concat$4 = Streams.lambda$concat$4((Spliterator.OfLong) obj);
                return lambda$concat$4;
            case 1:
                lambda$spliteratorImpl$0 = Multisets.lambda$spliteratorImpl$0((Multiset.Entry) obj);
                return lambda$spliteratorImpl$0;
            case 2:
                lambda$concat$6 = Streams.lambda$concat$6((Spliterator.OfDouble) obj);
                return lambda$concat$6;
            case 3:
                return OptionalInt.of(((Integer) obj).intValue());
            case 4:
                return OptionalDouble.of(((Double) obj).doubleValue());
            case 5:
                lambda$concat$2 = Streams.lambda$concat$2((Spliterator.OfInt) obj);
                return lambda$concat$2;
            case 6:
                return OptionalLong.of(((Long) obj).longValue());
            case 7:
                lambda$concat$0 = Streams.lambda$concat$0((Spliterator) obj);
                return lambda$concat$0;
            default:
                return ((ImmutableTable.Builder) obj).build();
        }
    }
}
