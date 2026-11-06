package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DataSource$Factory$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ DataSource$Factory$$ExternalSyntheticLambda0(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List map$lambda$1;
        List map$lambda$7;
        List map$lambda$5;
        List map$lambda$4;
        int i = this.$r8$classId;
        Function function = this.f$0;
        List list = (List) obj;
        switch (i) {
            case 0:
                map$lambda$1 = DataSource.Factory.map$lambda$1(function, list);
                return map$lambda$1;
            case 1:
                map$lambda$7 = ItemKeyedDataSource.map$lambda$7(function, list);
                return map$lambda$7;
            case 2:
                map$lambda$5 = PageKeyedDataSource.map$lambda$5(function, list);
                return map$lambda$5;
            default:
                map$lambda$4 = PositionalDataSource.map$lambda$4(function, list);
                return map$lambda$4;
        }
    }
}
