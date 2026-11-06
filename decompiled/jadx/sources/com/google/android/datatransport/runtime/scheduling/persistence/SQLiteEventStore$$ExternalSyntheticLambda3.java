package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda3 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$ensureBeginTransaction$25;
        Long lambda$getTransportContextId$2;
        Boolean lambda$recordLogEventDropped$17;
        List lambda$loadActiveContexts$9;
        byte[] lambda$readPayload$15;
        List lambda$loadActiveContexts$10;
        Long lambda$getNextCallTime$5;
        Object lambda$clearDb$13;
        SQLiteDatabase lambda$getDb$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$ensureBeginTransaction$25 = SQLiteEventStore.lambda$ensureBeginTransaction$25((Throwable) obj);
                return lambda$ensureBeginTransaction$25;
            case 1:
                lambda$getTransportContextId$2 = SQLiteEventStore.lambda$getTransportContextId$2((Cursor) obj);
                return lambda$getTransportContextId$2;
            case 2:
                lambda$recordLogEventDropped$17 = SQLiteEventStore.lambda$recordLogEventDropped$17((Cursor) obj);
                return lambda$recordLogEventDropped$17;
            case 3:
                lambda$loadActiveContexts$9 = SQLiteEventStore.lambda$loadActiveContexts$9((Cursor) obj);
                return lambda$loadActiveContexts$9;
            case 4:
                lambda$readPayload$15 = SQLiteEventStore.lambda$readPayload$15((Cursor) obj);
                return lambda$readPayload$15;
            case 5:
                lambda$loadActiveContexts$10 = SQLiteEventStore.lambda$loadActiveContexts$10((SQLiteDatabase) obj);
                return lambda$loadActiveContexts$10;
            case 6:
                lambda$getNextCallTime$5 = SQLiteEventStore.lambda$getNextCallTime$5((Cursor) obj);
                return lambda$getNextCallTime$5;
            case 7:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 8:
                lambda$clearDb$13 = SQLiteEventStore.lambda$clearDb$13((SQLiteDatabase) obj);
                return lambda$clearDb$13;
            default:
                lambda$getDb$0 = SQLiteEventStore.lambda$getDb$0((Throwable) obj);
                return lambda$getDb$0;
        }
    }
}
