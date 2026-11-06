package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda2 implements SQLiteEventStore.Function, SQLiteEventStore.Producer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        Object lambda$loadMetadata$16;
        lambda$loadMetadata$16 = SQLiteEventStore.lambda$loadMetadata$16((HashMap) this.f$0, (Cursor) obj);
        return lambda$loadMetadata$16;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public Object produce() {
        Object lambda$ensureBeginTransaction$24;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$ensureBeginTransaction$24 = SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) obj);
                return lambda$ensureBeginTransaction$24;
            default:
                return ((SchemaManager) obj).getWritableDatabase();
        }
    }
}
