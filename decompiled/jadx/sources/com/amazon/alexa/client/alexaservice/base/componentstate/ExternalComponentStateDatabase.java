package com.amazon.alexa.client.alexaservice.base.componentstate;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ExternalComponentStateDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ExternalComponentState.db";
    private static final int DATABASE_VERSION = 2;

    @VisibleForTesting
    static final String SQL_CREATE_EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE = "CREATE TABLE externalComponentStateCachingPreference (namespace TEXT,isCachingEnabled TEXT,dateUpdated DATETIME DEFAULT CURRENT_TIMESTAMP,PRIMARY KEY(namespace))";

    @VisibleForTesting
    static final String SQL_CREATE_EXTERNAL_COMPONENT_STATE_TABLE = "CREATE TABLE externalComponentState (namespace TEXT,name TEXT,payload TEXT,packageName TEXT,packageVersionCode TEXT,dateUpdated DATETIME DEFAULT CURRENT_TIMESTAMP,PRIMARY KEY(namespace, name, packageName))";
    private static final String TAG = "ExternalComponentStateDatabase";

    @Inject
    public ExternalComponentStateDatabase(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL(SQL_CREATE_EXTERNAL_COMPONENT_STATE_TABLE);
        sQLiteDatabase.execSQL(SQL_CREATE_EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE);
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
