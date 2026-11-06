package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Synchronized;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Synchronized$SynchronizedTable$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Synchronized.SynchronizedTable f$0;

    public /* synthetic */ Synchronized$SynchronizedTable$$ExternalSyntheticLambda0(Synchronized.SynchronizedTable synchronizedTable, int i) {
        this.$r8$classId = i;
        this.f$0 = synchronizedTable;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Map lambda$rowMap$0;
        Map lambda$columnMap$0;
        int i = this.$r8$classId;
        Synchronized.SynchronizedTable synchronizedTable = this.f$0;
        Map map = (Map) obj;
        switch (i) {
            case 0:
                lambda$rowMap$0 = synchronizedTable.lambda$rowMap$0(map);
                return lambda$rowMap$0;
            default:
                lambda$columnMap$0 = synchronizedTable.lambda$columnMap$0(map);
                return lambda$columnMap$0;
        }
    }
}
