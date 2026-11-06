package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda24 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda24(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        TimeWindow lambda$getTimeWindow$22;
        TimeWindow lambda$getTimeWindow$21;
        switch (this.$r8$classId) {
            case 0:
                lambda$getTimeWindow$22 = SQLiteEventStore.lambda$getTimeWindow$22(this.f$0, (SQLiteDatabase) obj);
                return lambda$getTimeWindow$22;
            default:
                lambda$getTimeWindow$21 = SQLiteEventStore.lambda$getTimeWindow$21(this.f$0, (Cursor) obj);
                return lambda$getTimeWindow$21;
        }
    }
}
