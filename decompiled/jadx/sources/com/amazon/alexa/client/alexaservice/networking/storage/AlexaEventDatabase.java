package com.amazon.alexa.client.alexaservice.networking.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaEventDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "AlexaEvents.db";
    private static final int DATABASE_VERSION = 1;

    @VisibleForTesting
    static final String SQL_CREATE_ALEXA_EVENT_TABLE;
    private static final String TAG = "AlexaEventDatabase";

    static {
        Locale locale = Locale.US;
        SQL_CREATE_ALEXA_EVENT_TABLE = "CREATE TABLE alexaEvents (requestId TEXT PRIMARY KEY,eventHeader TEXT,eventPayload TEXT)";
    }

    @Inject
    public AlexaEventDatabase(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_ALEXA_EVENT_TABLE);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
