package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda16 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda16(TransportContext transportContext, long j) {
        this.f$0 = j;
        this.f$1 = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$recordNextCallTime$7;
        Integer lambda$cleanUp$12;
        switch (this.$r8$classId) {
            case 0:
                lambda$recordNextCallTime$7 = SQLiteEventStore.lambda$recordNextCallTime$7(this.f$0, (TransportContext) this.f$1, (SQLiteDatabase) obj);
                return lambda$recordNextCallTime$7;
            default:
                lambda$cleanUp$12 = ((SQLiteEventStore) this.f$1).lambda$cleanUp$12(this.f$0, (SQLiteDatabase) obj);
                return lambda$cleanUp$12;
        }
    }

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda16(SQLiteEventStore sQLiteEventStore, long j) {
        this.f$1 = sQLiteEventStore;
        this.f$0 = j;
    }
}
