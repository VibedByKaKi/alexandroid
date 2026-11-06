package com.amazon.alexa.client.alexaservice.base.metrics.client;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ClientMetricDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ClientMetrics.db";
    private static final int DATABASE_VERSION = 7;

    @VisibleForTesting
    static final String SQL_ALTER_DIALOG_TURN_ID;

    @VisibleForTesting
    static final String SQL_ALTER_GENERAL_EVENT_VALUE;

    @VisibleForTesting
    static final String SQL_ALTER_GENERIC_API_CALL_ID;

    @VisibleForTesting
    static final String SQL_ALTER_SOFTWARE_VERSION;

    @VisibleForTesting
    static final String SQL_ALTER_TEXT_INTERACTION_EVENT_VALUE;

    @VisibleForTesting
    static final String SQL_ALTER_VOICE_INTERACTION_API_CALL_ID;

    @VisibleForTesting
    static final String SQL_ALTER_VOICE_INTERACTION_EVENT_VALUE;

    @VisibleForTesting
    static final String SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE;

    @VisibleForTesting
    static final String SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE_V2;

    @VisibleForTesting
    static final String SQL_CREATE_TEXT_CLIENT_METRICS_TABLE;

    @VisibleForTesting
    static final String SQL_CREATE_TEXT_CLIENT_METRICS_TABLE_V2;

    @VisibleForTesting
    static final String SQL_CREATE_VOICE_CLIENT_METRICS_TABLE_V2;
    private static final String TAG = "ClientMetricDatabase";
    private static volatile ClientMetricDatabase instance;
    private final CrashReporter crashReporter;

    static {
        Locale locale = Locale.US;
        SQL_CREATE_TEXT_CLIENT_METRICS_TABLE = "CREATE TABLE IF NOT EXISTS textClientMetrics (eventId TEXT PRIMARY KEY,eventName TEXT,sourcePackageName TEXT,clientPackageName TEXT,invocationType TEXT,dialogTurnId TEXT,softwareVersion TEXT,apiCallId TEXT,eventTimestamp DATETIME)";
        SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE = "CREATE TABLE IF NOT EXISTS genericClientMetrics (eventId TEXT PRIMARY KEY,eventName TEXT,sourcePackageName TEXT,clientPackageName TEXT,softwareVersion TEXT,latency INT,eventTimestamp DATETIME)";
        SQL_CREATE_VOICE_CLIENT_METRICS_TABLE_V2 = "CREATE TABLE IF NOT EXISTS clientMetrics (eventId TEXT PRIMARY KEY,eventName TEXT,eventValue INT,sourcePackageName TEXT,clientPackageName TEXT,invocationType TEXT,dialogTurnId TEXT,softwareVersion TEXT,apiCallId TEXT,eventTimestamp DATETIME)";
        SQL_CREATE_TEXT_CLIENT_METRICS_TABLE_V2 = "CREATE TABLE IF NOT EXISTS textClientMetrics (eventId TEXT PRIMARY KEY,eventName TEXT,eventValue INT,sourcePackageName TEXT,clientPackageName TEXT,invocationType TEXT,dialogTurnId TEXT,softwareVersion TEXT,apiCallId TEXT,eventTimestamp DATETIME)";
        SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE_V2 = "CREATE TABLE IF NOT EXISTS genericClientMetrics (eventId TEXT PRIMARY KEY,eventName TEXT,eventValue INT,sourcePackageName TEXT,clientPackageName TEXT,softwareVersion TEXT,latency INT,eventTimestamp DATETIME)";
        SQL_ALTER_DIALOG_TURN_ID = "ALTER TABLE clientMetrics ADD dialogTurnId TEXT";
        SQL_ALTER_SOFTWARE_VERSION = "ALTER TABLE clientMetrics ADD softwareVersion TEXT";
        SQL_ALTER_GENERIC_API_CALL_ID = "ALTER TABLE genericClientMetrics ADD apiCallId TEXT";
        SQL_ALTER_VOICE_INTERACTION_API_CALL_ID = "ALTER TABLE clientMetrics ADD apiCallId TEXT";
        SQL_ALTER_GENERAL_EVENT_VALUE = "ALTER TABLE genericClientMetrics ADD eventValue INT";
        SQL_ALTER_VOICE_INTERACTION_EVENT_VALUE = "ALTER TABLE clientMetrics ADD eventValue INT";
        SQL_ALTER_TEXT_INTERACTION_EVENT_VALUE = "ALTER TABLE textClientMetrics ADD eventValue INT";
    }

    private ClientMetricDatabase(Context context, CrashReporter crashReporter) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 7);
        this.crashReporter = crashReporter;
    }

    public static ClientMetricDatabase getInstance(Context context, CrashReporter crashReporter) {
        if (instance == null) {
            synchronized (ClientMetricDatabase.class) {
                try {
                    if (instance == null) {
                        instance = new ClientMetricDatabase(context, crashReporter);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i(TAG, "OnCreate databaseVersion " + sQLiteDatabase.getVersion());
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_VOICE_CLIENT_METRICS_TABLE_V2);
            sQLiteDatabase.execSQL(SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE_V2);
            sQLiteDatabase.execSQL(SQL_CREATE_TEXT_CLIENT_METRICS_TABLE_V2);
            sQLiteDatabase.execSQL(SQL_ALTER_GENERIC_API_CALL_ID);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        String str = TAG;
        Log.i(str, "Upgrading from version " + i + " to version: " + i2);
        sQLiteDatabase.beginTransaction();
        switch (i) {
            case 1:
                try {
                    try {
                        sQLiteDatabase.execSQL(SQL_ALTER_DIALOG_TURN_ID);
                    } catch (SQLException e) {
                        Log.e(TAG, "onUpgrade failed!", e);
                        this.crashReporter.notifyHandledException(e);
                        throw e;
                    }
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            case 2:
                sQLiteDatabase.execSQL(SQL_ALTER_SOFTWARE_VERSION);
            case 3:
                sQLiteDatabase.execSQL(SQL_CREATE_GENERIC_CLIENT_METRICS_TABLE);
            case 4:
                sQLiteDatabase.execSQL(SQL_ALTER_GENERIC_API_CALL_ID);
                sQLiteDatabase.execSQL(SQL_ALTER_VOICE_INTERACTION_API_CALL_ID);
            case 5:
                sQLiteDatabase.execSQL(SQL_CREATE_TEXT_CLIENT_METRICS_TABLE);
            case 6:
                sQLiteDatabase.execSQL(SQL_ALTER_VOICE_INTERACTION_EVENT_VALUE);
                sQLiteDatabase.execSQL(SQL_ALTER_GENERAL_EVENT_VALUE);
                sQLiteDatabase.execSQL(SQL_ALTER_TEXT_INTERACTION_EVENT_VALUE);
            default:
                sQLiteDatabase.setTransactionSuccessful();
                Log.i(str, "DB upgraded successfully from version " + i + " to version: " + i2);
                break;
        }
    }
}
