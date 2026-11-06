package com.amazon.alexa.handsfree.voiceappreporter.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.voiceappreporter.VoiceAppEventReporterContract;
import com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEvent;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
@WorkerThread
/* loaded from: classes17.dex */
public class VoiceAppEventReporterDatabaseHelper {
    private static final String LIMIT_QUERY_EVENTS = "1";
    private static final Object LOCK = new Object();
    private static final String TAG = "VoiceAppEventReporterDatabaseHelper";
    private boolean hasCursorErrorOccurred;
    private final VoiceAppEventReporterDatabaseOpener mVoiceAppEventReporterDatabaseOpener;

    @Inject
    public VoiceAppEventReporterDatabaseHelper(@NonNull Context context) {
        this(VoiceAppEventReporterDatabaseOpener.getInstance(context));
    }

    private void deleteVoiceEvent(@NonNull SQLiteDatabase sQLiteDatabase, long j) {
        sQLiteDatabase.delete(VoiceAppEventReporterContract.VoiceAppEventsTable.TABLE_NAME, "_id = ?", new String[]{Long.toString(j)});
    }

    @NonNull
    private VoiceAppEvent getVoiceAppEventFromCursor(@NonNull Cursor cursor) {
        return new VoiceAppEvent(cursor.getString(cursor.getColumnIndex(VoiceAppEventReporterContract.VoiceAppEventsTable.COLUMN_EVENT_TYPE)), cursor.getInt(cursor.getColumnIndex(VoiceAppEventReporterContract.VoiceAppEventsTable.COLUMN_EVENT_DATE)));
    }

    private boolean isValidEventType(@Nullable String str) {
        if (str != null) {
            return str.equals(VoiceAppEventReporterContract.VoiceAppEventsTable.EVENT_TYPE_APP_CRASH) || str.equals(VoiceAppEventReporterContract.VoiceAppEventsTable.EVENT_TYPE_APP_START);
        }
        return false;
    }

    private boolean isValidVoiceEvent(@NonNull ContentValues contentValues) {
        String asString = contentValues.getAsString(VoiceAppEventReporterContract.VoiceAppEventsTable.COLUMN_EVENT_TYPE);
        Long asLong = contentValues.getAsLong(VoiceAppEventReporterContract.VoiceAppEventsTable.COLUMN_EVENT_DATE);
        if (!isValidEventType(asString) || asLong == null) {
            Log.e(TAG, "Voice App Events require a valid EVENT_TYPE and EVENT_DATE");
            return false;
        }
        if (!asString.equals(VoiceAppEventReporterContract.VoiceAppEventsTable.EVENT_TYPE_APP_CRASH) || contentValues.getAsByteArray(VoiceAppEventReporterContract.VoiceAppEventsTable.COLUMN_STACK_TRACE) != null) {
            return true;
        }
        Log.e(TAG, "Voice app crashes require STACK_TRACE");
        return false;
    }

    @NonNull
    private Cursor queryVoiceEvent(@NonNull SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query(VoiceAppEventReporterContract.VoiceAppEventsTable.TABLE_NAME, null, null, null, null, null, null, "1");
    }

    public boolean getHasCursorErrorOccurred() {
        return this.hasCursorErrorOccurred;
    }

    public long insertVoiceEvent(@NonNull ContentValues contentValues) {
        if (!isValidVoiceEvent(contentValues)) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = this.mVoiceAppEventReporterDatabaseOpener.getWritableDatabase();
        try {
            long insert = writableDatabase.insert(VoiceAppEventReporterContract.VoiceAppEventsTable.TABLE_NAME, null, contentValues);
            writableDatabase.close();
            return insert;
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0023, code lost:
    
        if (r2 != null) goto L14;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEvent popVoiceEvent() {
        /*
            r9 = this;
            r0 = 0
            r9.hasCursorErrorOccurred = r0
            java.lang.Object r1 = com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper.LOCK
            monitor-enter(r1)
            com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseOpener r2 = r9.mVoiceAppEventReporterDatabaseOpener     // Catch: java.lang.Throwable -> L29
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r4 = 0
            android.database.Cursor r5 = r9.queryVoiceEvent(r2)     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
            if (r5 == 0) goto L51
            boolean r6 = r5.isClosed()     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L51
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L31
            r5.close()     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
            if (r2 == 0) goto L2b
        L25:
            r2.close()     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r9 = move-exception
            goto L8a
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r4
        L2d:
            r9 = move-exception
            goto L7f
        L2f:
            r5 = move-exception
            goto L6d
        L31:
            r5.moveToFirst()     // Catch: java.lang.Throwable -> L4f
            com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEvent r6 = r9.getVoiceAppEventFromCursor(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "_id"
            int r7 = r5.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L4f
            long r7 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L4f
            r9.deleteVoiceEvent(r2, r7)     // Catch: java.lang.Throwable -> L4f
            r5.close()     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.lang.Throwable -> L29
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r6
        L4f:
            r6 = move-exception
            goto L62
        L51:
            java.lang.String r6 = com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper.TAG     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "Cursor was null or closed, returning null"
            com.amazon.alexa.handsfree.protocols.utils.Log.d(r6, r7)     // Catch: java.lang.Throwable -> L4f
            r9.hasCursorErrorOccurred = r3     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L5f
            r5.close()     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
        L5f:
            if (r2 == 0) goto L2b
            goto L25
        L62:
            if (r5 == 0) goto L6c
            r5.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
        L6c:
            throw r6     // Catch: java.lang.Throwable -> L2d java.lang.IllegalStateException -> L2f
        L6d:
            java.lang.String r6 = com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper.TAG     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = "Error when accessing cursor"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2d
            com.amazon.alexa.handsfree.protocols.utils.Log.e(r6, r7, r5, r0)     // Catch: java.lang.Throwable -> L2d
            r9.hasCursorErrorOccurred = r3     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.lang.Throwable -> L29
        L7d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r4
        L7f:
            if (r2 == 0) goto L89
            r2.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L29
        L89:
            throw r9     // Catch: java.lang.Throwable -> L29
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper.popVoiceEvent():com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEvent");
    }

    @VisibleForTesting
    public VoiceAppEventReporterDatabaseHelper(@NonNull VoiceAppEventReporterDatabaseOpener voiceAppEventReporterDatabaseOpener) {
        this.mVoiceAppEventReporterDatabaseOpener = voiceAppEventReporterDatabaseOpener;
    }
}
