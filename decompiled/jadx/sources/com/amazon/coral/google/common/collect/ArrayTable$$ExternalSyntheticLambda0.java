package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.Table;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ArrayTable$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayTable f$0;

    public /* synthetic */ ArrayTable$$ExternalSyntheticLambda0(ArrayTable arrayTable, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayTable;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        Object value;
        Table.Cell cell;
        int i2 = this.$r8$classId;
        ArrayTable arrayTable = this.f$0;
        switch (i2) {
            case 0:
                value = arrayTable.getValue(i);
                return value;
            default:
                cell = arrayTable.getCell(i);
                return cell;
        }
    }
}
