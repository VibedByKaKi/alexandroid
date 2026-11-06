package com.amazon.identity.auth.device;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.deecomms.common.Constants;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class je extends SQLiteOpenHelper {
    public je(Context context) {
        super(context, "map_data_storage_v3.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i(yf.a("LocalDataStorageV3"), "Creating Local DataStore V3");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("_id");
        arrayList2.add("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        arrayList.add("directed_id");
        arrayList2.add("directed_id TEXT UNIQUE NOT NULL");
        arrayList.add("display_name");
        arrayList2.add("display_name TEXT NOT NULL");
        sQLiteDatabase.execSQL("CREATE TABLE accounts (" + TextUtils.join(", ", arrayList2) + ");");
        in a2 = new in("account_data").a("_id", "INTEGER PRIMARY KEY AUTOINCREMENT").a("account_data_directed_id", "TEXT NOT NULL").a("account_data_key", "TEXT NOT NULL").a("account_data_value", Constants.Calling.MEDIA_STREAM_TYPE_TEXT);
        a2.c.add("UNIQUE(account_data_directed_id,account_data_key)");
        sQLiteDatabase.execSQL(a2.toString());
        in a3 = new in("device_data").a("_id", "INTEGER PRIMARY KEY AUTOINCREMENT").a("device_data_namespace", "TEXT NOT NULL").a("device_data_key", "TEXT NOT NULL").a("device_data_value", Constants.Calling.MEDIA_STREAM_TYPE_TEXT);
        a3.c.add("UNIQUE(device_data_namespace,device_data_key)");
        sQLiteDatabase.execSQL(a3.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e(yf.a("LocalDataStorageV3"), "onDowngrade workflow in LocalDataStorageV3 should not be triggered");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e(yf.a("LocalDataStorageV3"), "onUpgrade workflow in LocalDataStorageV3 should not be triggered");
    }
}
