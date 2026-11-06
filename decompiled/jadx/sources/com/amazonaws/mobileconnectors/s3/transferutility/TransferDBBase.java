package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class TransferDBBase {
    private static final String BASE_PATH = "transfers";
    private static final int TRANSFERS = 10;
    private static final int TRANSFER_ID = 20;
    private static final int TRANSFER_PART = 30;
    private static final int TRANSFER_STATE = 40;
    private final Uri contentUri;
    private final Context context;
    private SQLiteDatabase database;
    private final TransferDatabaseHelper databaseHelper;
    private final UriMatcher uriMatcher;
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferDBBase.class);
    private static final Object LOCK = new Object();

    public TransferDBBase(Context context) {
        this.context = context;
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.databaseHelper = transferDatabaseHelper;
        this.database = transferDatabaseHelper.getWritableDatabase();
        this.contentUri = Uri.parse(ReactNativeBlobUtilConst.FILE_PREFIX_CONTENT + packageName + "/transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(packageName, BASE_PATH, 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    private void ensureDatabaseOpen() {
        synchronized (LOCK) {
            try {
                if (!this.database.isOpen()) {
                    this.database = this.databaseHelper.getWritableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match != 10) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unknown URI: "));
            return 0;
        }
        int i = 0;
        try {
            try {
                this.database.beginTransaction();
                i = (int) this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[0]);
                for (int i2 = 1; i2 < contentValuesArr.length; i2++) {
                    contentValuesArr[i2].put(TransferTable.COLUMN_MAIN_UPLOAD_ID, Integer.valueOf(i));
                    this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[i2]);
                }
                this.database.setTransactionSuccessful();
            } catch (Exception e) {
                LOGGER.error("bulkInsert error : ", e);
            }
            this.database.endTransaction();
            return i;
        } catch (Throwable th) {
            this.database.endTransaction();
            throw th;
        }
    }

    public void closeDBHelper() {
        this.databaseHelper.close();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match == 10) {
            return this.database.delete(TransferTable.TABLE_TRANSFER, str, strArr);
        }
        if (match != 20) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unknown URI: "));
            return 0;
        }
        String lastPathSegment = uri.getLastPathSegment();
        boolean isEmpty = TextUtils.isEmpty(str);
        SQLiteDatabase sQLiteDatabase = this.database;
        if (!isEmpty) {
            return sQLiteDatabase.delete(TransferTable.TABLE_TRANSFER, a$$ExternalSyntheticOutline0.m("_id=", lastPathSegment, " and ", str), strArr);
        }
        return sQLiteDatabase.delete(TransferTable.TABLE_TRANSFER, "_id=" + lastPathSegment, null);
    }

    public Uri getContentUri() {
        return this.contentUri;
    }

    public SQLiteDatabase getDatabase() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            sQLiteDatabase = this.database;
        }
        return sQLiteDatabase;
    }

    public TransferDatabaseHelper getDatabaseHelper() {
        return this.databaseHelper;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match != 10) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unknown URI: "));
            return null;
        }
        return Uri.parse("transfers/" + this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValues));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(TransferTable.TABLE_TRANSFER);
        int match = this.uriMatcher.match(uri);
        if (match == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (match == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (match == 30) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else {
            if (match != 40) {
                Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unknown URI: "));
                return null;
            }
            sQLiteQueryBuilder.appendWhere("state=");
            sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
        }
        ensureDatabaseOpen();
        return sQLiteQueryBuilder.query(this.database, strArr, str, strArr2, null, null, str2);
    }

    public synchronized int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        try {
            int match = this.uriMatcher.match(uri);
            ensureDatabaseOpen();
            if (match == 10) {
                update = this.database.update(TransferTable.TABLE_TRANSFER, contentValues, str, strArr);
            } else {
                if (match != 20) {
                    throw new IllegalArgumentException("Unknown URI: " + uri);
                }
                String lastPathSegment = uri.getLastPathSegment();
                boolean isEmpty = TextUtils.isEmpty(str);
                SQLiteDatabase sQLiteDatabase = this.database;
                if (isEmpty) {
                    update = sQLiteDatabase.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment, null);
                } else {
                    update = sQLiteDatabase.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return update;
    }
}
