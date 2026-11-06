package com.amazon.alexa.handsfree.storage.metrics.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.storage.metrics.database.MetricsCacheDatabaseContract;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class MetricsCacheDatabaseHelper extends SQLiteOpenHelper {
    private static final String CREATE_QUERY = "CREATE TABLE  %s ( %s  INTEGER PRIMARY KEY AUTOINCREMENT , %s TEXT NOT NULL )";

    @VisibleForTesting
    static final String DATABASE_NAME = "metricsCache.db";
    private static final int DATABASE_VERSION = 2;
    private static final int MAX_DB_SIZE = 5242880;
    private static final String SQL_CREATE_TABLE_CACHED_METRICS = "CREATE TABLE  cached_metrics ( _id  INTEGER PRIMARY KEY AUTOINCREMENT , metric_list_json TEXT NOT NULL )";
    private static final String TAG = "MetricsCacheDBHlpr";
    private final Context mContext;

    @Inject
    public MetricsCacheDatabaseHelper(@NonNull Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
        this.mContext = context;
    }

    private ContentValues getContentValuesFromMetricList(@NonNull String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MetricsCacheDatabaseContract.CachedMetricsTable.COLUMN_METRIC_LIST_JSON, str);
        return contentValues;
    }

    @WorkerThread
    public synchronized void clearDatabase() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                clearDatabase(writableDatabase);
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
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
        } catch (SQLException e) {
            Log.e(TAG, "Error while getting writable database: " + e.getMessage());
        }
    }

    @NonNull
    @WorkerThread
    public synchronized List<String> getCachedMetricGroups() {
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            try {
                Cursor query = readableDatabase.query(MetricsCacheDatabaseContract.CachedMetricsTable.TABLE_NAME, null, null, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.getCount() > 0) {
                            ArrayList arrayList = new ArrayList();
                            while (query.moveToNext()) {
                                arrayList.add(query.getString(query.getColumnIndex(MetricsCacheDatabaseContract.CachedMetricsTable.COLUMN_METRIC_LIST_JSON)));
                            }
                            query.close();
                            readableDatabase.close();
                            return arrayList;
                        }
                    } finally {
                    }
                }
                List<String> list = Collections.EMPTY_LIST;
                if (query != null) {
                    query.close();
                }
                readableDatabase.close();
                return list;
            } finally {
            }
        } catch (SQLException e) {
            Log.e(TAG, "Error while getting readable database: " + e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "onConfigure(...)");
        sQLiteDatabase.setMaximumSize(5242880L);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "onCreate(...)");
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_TABLE_CACHED_METRICS);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NonNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.d(TAG, "onUpgrade(...)");
        File databasePath = this.mContext.getDatabasePath(DATABASE_NAME);
        if (i != 1 || databasePath.length() <= 5242880) {
            return;
        }
        clearDatabase(sQLiteDatabase);
    }

    @WorkerThread
    public synchronized void putMetricGroupIntoCache(@NonNull String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                Log.d(TAG, "insertMetricGroup(...)");
                writableDatabase.insert(MetricsCacheDatabaseContract.CachedMetricsTable.TABLE_NAME, null, getContentValuesFromMetricList(str));
                writableDatabase.close();
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
        } catch (SQLException e) {
            Log.e(TAG, "Error while getting writable database: " + e.getMessage());
        }
    }

    private synchronized void clearDatabase(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "clearDatabase(...)");
        sQLiteDatabase.delete(MetricsCacheDatabaseContract.CachedMetricsTable.TABLE_NAME, null, null);
    }
}
