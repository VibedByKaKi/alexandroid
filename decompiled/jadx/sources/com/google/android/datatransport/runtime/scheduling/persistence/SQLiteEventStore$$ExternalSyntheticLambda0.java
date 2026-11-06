package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SQLiteEventStore$$ExternalSyntheticLambda0 implements SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SQLiteEventStore f$0;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ SQLiteEventStore$$ExternalSyntheticLambda0(SQLiteEventStore sQLiteEventStore, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = sQLiteEventStore;
        this.f$2 = obj;
        this.f$3 = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        ClientMetrics lambda$loadClientMetrics$20;
        Object lambda$loadEvents$14;
        Long lambda$persist$1;
        ClientMetrics lambda$loadClientMetrics$19;
        switch (this.$r8$classId) {
            case 0:
                lambda$loadClientMetrics$20 = this.f$0.lambda$loadClientMetrics$20("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", (HashMap) this.f$2, (ClientMetrics.Builder) this.f$3, (SQLiteDatabase) obj);
                return lambda$loadClientMetrics$20;
            case 1:
                lambda$loadEvents$14 = this.f$0.lambda$loadEvents$14((ArrayList) this.f$2, (TransportContext) this.f$3, (Cursor) obj);
                return lambda$loadEvents$14;
            case 2:
                lambda$persist$1 = this.f$0.lambda$persist$1((EventInternal) this.f$2, (TransportContext) this.f$3, (SQLiteDatabase) obj);
                return lambda$persist$1;
            default:
                lambda$loadClientMetrics$19 = this.f$0.lambda$loadClientMetrics$19((Map) this.f$2, (ClientMetrics.Builder) this.f$3, (Cursor) obj);
                return lambda$loadClientMetrics$19;
        }
    }
}
