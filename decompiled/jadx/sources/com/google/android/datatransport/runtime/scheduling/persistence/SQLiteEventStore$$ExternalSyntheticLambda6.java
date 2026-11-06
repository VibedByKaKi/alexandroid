package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda6 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SQLiteEventStore f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda6(SQLiteEventStore sQLiteEventStore, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = sQLiteEventStore;
        this.f$1 = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        List lambda$loadBatch$8;
        Boolean lambda$hasPendingEventsFor$6;
        Object lambda$recordFailure$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$loadBatch$8 = this.f$0.lambda$loadBatch$8((TransportContext) this.f$1, (SQLiteDatabase) obj);
                return lambda$loadBatch$8;
            case 1:
                lambda$hasPendingEventsFor$6 = this.f$0.lambda$hasPendingEventsFor$6((TransportContext) this.f$1, (SQLiteDatabase) obj);
                return lambda$hasPendingEventsFor$6;
            default:
                lambda$recordFailure$4 = this.f$0.lambda$recordFailure$4((String) this.f$1, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (SQLiteDatabase) obj);
                return lambda$recordFailure$4;
        }
    }
}
