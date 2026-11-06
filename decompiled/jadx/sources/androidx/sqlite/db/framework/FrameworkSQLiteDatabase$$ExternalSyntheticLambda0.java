package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class FrameworkSQLiteDatabase$$ExternalSyntheticLambda0 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FrameworkSQLiteDatabase$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Cursor query$lambda$2;
        Cursor query$lambda$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                query$lambda$2 = FrameworkSQLiteDatabase.query$lambda$2((SupportSQLiteQuery) obj, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$2;
            default:
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1((FrameworkSQLiteDatabase$$ExternalSyntheticLambda1) obj, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
        }
    }
}
