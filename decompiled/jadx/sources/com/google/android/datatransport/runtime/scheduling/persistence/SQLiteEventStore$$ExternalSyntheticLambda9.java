package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda9 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SQLiteEventStore f$0;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda9(SQLiteEventStore sQLiteEventStore, int i) {
        this.$r8$classId = i;
        this.f$0 = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$recordFailure$3;
        Object lambda$resetClientMetrics$23;
        Object lambda$cleanUp$11;
        int i = this.$r8$classId;
        SQLiteEventStore sQLiteEventStore = this.f$0;
        switch (i) {
            case 0:
                lambda$recordFailure$3 = sQLiteEventStore.lambda$recordFailure$3((Cursor) obj);
                return lambda$recordFailure$3;
            case 1:
                lambda$resetClientMetrics$23 = sQLiteEventStore.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
                return lambda$resetClientMetrics$23;
            default:
                lambda$cleanUp$11 = sQLiteEventStore.lambda$cleanUp$11((Cursor) obj);
                return lambda$cleanUp$11;
        }
    }
}
