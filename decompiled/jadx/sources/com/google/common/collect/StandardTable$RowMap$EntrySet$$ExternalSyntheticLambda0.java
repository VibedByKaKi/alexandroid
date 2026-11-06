package com.google.common.collect;

import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class StandardTable$RowMap$EntrySet$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StandardTable f$0;

    public /* synthetic */ StandardTable$RowMap$EntrySet$$ExternalSyntheticLambda0(StandardTable standardTable, int i) {
        this.$r8$classId = i;
        this.f$0 = standardTable;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i = this.$r8$classId;
        StandardTable standardTable = this.f$0;
        switch (i) {
            case 0:
                return standardTable.row(obj);
            default:
                return standardTable.column(obj);
        }
    }
}
