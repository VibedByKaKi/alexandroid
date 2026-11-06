package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.base.Function;
import autovalue.shaded.com.google.common.collect.Table;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FluentIterable$2$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FluentIterable$2$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // autovalue.shaded.com.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        Collection access$100;
        Table.Cell access$000;
        switch (this.$r8$classId) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                access$100 = Multimaps.access$100((Collection) obj);
                return access$100;
            case 2:
                access$000 = Tables.access$000((Table.Cell) obj);
                return access$000;
            case 3:
                return ((Range) obj).lowerBound();
            default:
                return ((Range) obj).upperBound();
        }
    }
}
