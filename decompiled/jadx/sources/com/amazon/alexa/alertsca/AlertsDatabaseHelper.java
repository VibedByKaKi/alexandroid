package com.amazon.alexa.alertsca;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlertsDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "AlertRecords.db";
    public static final int DATABASE_VERSION = 4;
    private static final String SQL_ALTER_ALERT_TABLE = "ALTER TABLE alertsTable ADD COLUMN assetInfoExists TEXT;";
    private static final String SQL_ALTER_ASSET_INFO_TABLE_TO_V2 = "ALTER TABLE assetInfoTable ADD COLUMN label TEXT;";

    @VisibleForTesting
    static final String SQL_CREATE_ALERTS_TABLE = "CREATE TABLE alertsTable (token TEXT PRIMARY KEY,type TEXT,scheduledTime TEXT,assetInfoExists TEXT)";

    @VisibleForTesting
    static final String SQL_CREATE_ASSET_INFO_TABLE_V1 = "CREATE TABLE assetInfoTable (token TEXT PRIMARY KEY,backgroundAlertAsset TEXT,loopCount TEXT,loopPauseInMilliseconds TEXT,foregroundAlertAsset TEXT)";

    @VisibleForTesting
    static final String SQL_CREATE_ASSET_INFO_TABLE_V2 = "CREATE TABLE assetInfoTable (token TEXT PRIMARY KEY,backgroundAlertAsset TEXT,loopCount TEXT,loopPauseInMilliseconds TEXT,label TEXT,foregroundAlertAsset TEXT)";

    @VisibleForTesting
    static final String SQL_DELETE_ALERTS_TABLE = "DROP TABLE IF EXISTS alertsTable";

    @VisibleForTesting
    static final String SQL_DELETE_ASSET_INFO_TABLE = "DROP TABLE IF EXISTS assetInfoTable";
    private static final String TAG = "AlertsDatabaseHelper";

    @Inject
    public AlertsDatabaseHelper(Context context) {
        super(context.getApplicationContext(), DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 4);
    }

    @VisibleForTesting
    public boolean isColumnPresent(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            Cursor query = sQLiteDatabase.query(str, new String[]{str2}, null, null, null, null, null);
            try {
                boolean z = query.getColumnIndex(str2) != -1;
                query.close();
                return z;
            } finally {
            }
        } catch (SQLException unused) {
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_ALERTS_TABLE);
            sQLiteDatabase.execSQL(SQL_CREATE_ASSET_INFO_TABLE_V2);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x000e, B:9:0x0032, B:14:0x0025, B:16:0x002f, B:17:0x0022, B:18:0x0018), top: B:2:0x0006 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
        /*
            r1 = this;
            r2.beginTransaction()
            r4 = 1
            java.lang.String r0 = "ALTER TABLE assetInfoTable ADD COLUMN label TEXT;"
            if (r3 == r4) goto L18
            r4 = 2
            if (r3 == r4) goto L22
            r4 = 3
            if (r3 == r4) goto L25
            java.lang.String r1 = com.amazon.alexa.alertsca.AlertsDatabaseHelper.TAG     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "Not a proper version"
            android.util.Log.w(r1, r3)     // Catch: java.lang.Throwable -> L16
            goto L32
        L16:
            r1 = move-exception
            goto L39
        L18:
            java.lang.String r3 = "ALTER TABLE alertsTable ADD COLUMN assetInfoExists TEXT;"
            r2.execSQL(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "CREATE TABLE assetInfoTable (token TEXT PRIMARY KEY,backgroundAlertAsset TEXT,loopCount TEXT,loopPauseInMilliseconds TEXT,foregroundAlertAsset TEXT)"
            r2.execSQL(r3)     // Catch: java.lang.Throwable -> L16
        L22:
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L16
        L25:
            java.lang.String r3 = "assetInfoTable"
            java.lang.String r4 = "label"
            boolean r1 = r1.isColumnPresent(r2, r3, r4)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L32
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L16
        L32:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L16
            r2.endTransaction()
            return
        L39:
            r2.endTransaction()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.alertsca.AlertsDatabaseHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
