package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Tables$TransformedTable$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Tables.TransformedTable f$0;

    public /* synthetic */ Tables$TransformedTable$$ExternalSyntheticLambda0(Tables.TransformedTable transformedTable, int i) {
        this.$r8$classId = i;
        this.f$0 = transformedTable;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Map lambda$rowMap$0;
        Map lambda$columnMap$0;
        int i = this.$r8$classId;
        Tables.TransformedTable transformedTable = this.f$0;
        switch (i) {
            case 0:
                return transformedTable.applyToValue((Table.Cell) obj);
            case 1:
                lambda$rowMap$0 = transformedTable.lambda$rowMap$0((Map) obj);
                return lambda$rowMap$0;
            default:
                lambda$columnMap$0 = transformedTable.lambda$columnMap$0((Map) obj);
                return lambda$columnMap$0;
        }
    }
}
