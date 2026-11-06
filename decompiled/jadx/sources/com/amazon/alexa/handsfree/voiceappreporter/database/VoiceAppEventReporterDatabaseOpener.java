package com.amazon.alexa.handsfree.voiceappreporter.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.voiceappreporter.VoiceAppEventReporterContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class VoiceAppEventReporterDatabaseOpener extends SQLiteOpenHelper {
    private static final String CREATE_DB_STRING = "CREATE TABLE %s (%s INTEGER PRIMARY KEY CHECK(TYPEOF(%s) = 'integer'),%s TEXT NOT NULL, %s BLOB, %s TEXT,%s INTEGER NOT NULL CHECK(TYPEOF(%s) = 'integer'));";
    private static final int DATABASE_VERSION = 1;
    private static VoiceAppEventReporterDatabaseOpener sInstance;

    private VoiceAppEventReporterDatabaseOpener(@NonNull Context context) {
        super(context, VoiceAppEventReporterContract.VoiceAppEventsTable.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private void createVoiceAppEventTable(@NonNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE eventReportTable (_id INTEGER PRIMARY KEY CHECK(TYPEOF(_id) = 'integer'),EVENT_TYPE TEXT NOT NULL, STACK_TRACE BLOB, THREAD_DUMP TEXT,EVENT_DATE INTEGER NOT NULL CHECK(TYPEOF(EVENT_DATE) = 'integer'));");
    }

    @NonNull
    public static synchronized VoiceAppEventReporterDatabaseOpener getInstance(@NonNull Context context) {
        VoiceAppEventReporterDatabaseOpener voiceAppEventReporterDatabaseOpener;
        synchronized (VoiceAppEventReporterDatabaseOpener.class) {
            try {
                if (sInstance == null) {
                    sInstance = new VoiceAppEventReporterDatabaseOpener(context);
                }
                voiceAppEventReporterDatabaseOpener = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return voiceAppEventReporterDatabaseOpener;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        createVoiceAppEventTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NonNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
