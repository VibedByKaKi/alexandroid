package com.amazon.alexa.alertsca;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.alertsca.AlertRecord;
import com.amazon.alexa.alertsca.AlertsContract;
import com.amazon.alexa.api.compat.model.AlertType;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlertsStore {
    private static final String[] ALERT_PROJECTION = {"token", "type", AlertsContract.AlertRecordEntry.COLUMN_NAME_SCHEDULED_TIME, AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS};
    private static final String[] ASSET_INFO_PROJECTION = {"token", AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_BACKGROUND_ALERT_ASSET, AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_COUNT, AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_PAUSE, AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_FOREGROUND_ALERT_ASSET, "label"};
    private static final String ISO_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final String TAG = "AlertsStore";
    private static final String TIME_ZONE = "UTC";
    private final AlertsDatabaseHelper alertsDatabaseHelper;
    private final AssetDownloader assetDownloader;

    @Inject
    public AlertsStore(AlertsDatabaseHelper alertsDatabaseHelper, AssetDownloader assetDownloader) {
        this.alertsDatabaseHelper = alertsDatabaseHelper;
        this.assetDownloader = assetDownloader;
    }

    private ContentValues createAlertContentValues(AlertRecord alertRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("token", alertRecord.getToken().getValue());
        contentValues.put("type", alertRecord.getType().toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_TIME_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        contentValues.put(AlertsContract.AlertRecordEntry.COLUMN_NAME_SCHEDULED_TIME, simpleDateFormat.format(alertRecord.getScheduledTime()));
        contentValues.put(AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS, Boolean.valueOf(alertRecord.hasAssets()).toString());
        return contentValues;
    }

    private ContentValues createAssetInfoContentValues(AlertRecord alertRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("token", alertRecord.getToken().getValue());
        HashMap hashMap = new HashMap();
        for (Asset asset : alertRecord.getAssets()) {
            hashMap.put(asset.getAssetId(), Uri.parse(asset.getUrl()));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Uri) hashMap.get(alertRecord.getAssetPlayOrder().get((alertRecord.getAssetPlayOrder() != null ? alertRecord.getAssetPlayOrder().size() : 1) - 1)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Uri) hashMap.get(alertRecord.getBackgroundAlertAsset()));
        Uri download = this.assetDownloader.download(arrayList, alertRecord.getToken());
        contentValues.put(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_BACKGROUND_ALERT_ASSET, this.assetDownloader.download(arrayList2, alertRecord.getToken()).toString());
        contentValues.put(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_COUNT, alertRecord.getLoopCount());
        contentValues.put(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_PAUSE, alertRecord.getLoopPauseInMilliseconds());
        AlertLabel alertLabel = AlertLabel.NONE;
        contentValues.put("label", !alertLabel.equals(alertRecord.getLabel()) ? alertRecord.getLabel().getValue() : alertLabel.getValue());
        contentValues.put(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_FOREGROUND_ALERT_ASSET, download.toString());
        return contentValues;
    }

    private void deleteAssetFiles(AlertsToken alertsToken) {
        String path = getAsset(alertsToken, true).getPath();
        String path2 = getAsset(alertsToken, false).getPath();
        File file = new File(path);
        File file2 = new File(path2);
        file.delete();
        file2.delete();
    }

    private AlertRecord getAlertRecordFromCursor(Cursor cursor) {
        AlertsToken create = AlertsToken.create(cursor.getString(cursor.getColumnIndex("token")));
        AlertType valueOf = AlertType.valueOf(cursor.getString(cursor.getColumnIndex("type")));
        String string = cursor.getString(cursor.getColumnIndex(AlertsContract.AlertRecordEntry.COLUMN_NAME_SCHEDULED_TIME));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_TIME_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat.parse(string);
            boolean parseBoolean = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS)));
            AlertRecord.Builder scheduledTime = AlertRecord.builder().setToken(create).setType(valueOf).setScheduledTime(parse);
            return parseBoolean ? getAssetAlertRecord(create, scheduledTime) : scheduledTime.build();
        } catch (ParseException e) {
            Log.e(TAG, "Error occurred while parsing the Date " + e);
            return null;
        }
    }

    @VisibleForTesting
    private AlertsDatabaseHelper getAlertsDatabaseHelper() {
        return this.alertsDatabaseHelper;
    }

    private Uri getAsset(AlertsToken alertsToken, boolean z) {
        SQLiteDatabase readableDatabase = getAlertsDatabaseHelper().getReadableDatabase();
        String[] strArr = {alertsToken.getValue()};
        String str = z ? AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_FOREGROUND_ALERT_ASSET : AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_BACKGROUND_ALERT_ASSET;
        Cursor query = readableDatabase.query(AlertsContract.AlertAssetInfoEntry.TABLE_NAME, new String[]{str}, "token = ? ", strArr, null, null, null);
        try {
            if (!query.moveToFirst()) {
                query.close();
                return Uri.EMPTY;
            }
            Uri parse = Uri.parse(query.getString(query.getColumnIndex(str)));
            query.close();
            return parse;
        } finally {
        }
    }

    private AlertRecord getAssetAlertRecord(AlertsToken alertsToken, AlertRecord.Builder builder) {
        Cursor assetInfoDataFromDatabase = getAssetInfoDataFromDatabase(alertsToken);
        try {
            if (!assetInfoDataFromDatabase.moveToFirst()) {
                assetInfoDataFromDatabase.close();
                return null;
            }
            AlertRecord build = builder.setLoopCount(Long.valueOf(assetInfoDataFromDatabase.getLong(assetInfoDataFromDatabase.getColumnIndex(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_COUNT)))).setLoopPauseInMilliseconds(Long.valueOf(assetInfoDataFromDatabase.getLong(assetInfoDataFromDatabase.getColumnIndex(AlertsContract.AlertAssetInfoEntry.COLUMN_NAME_LOOP_PAUSE)))).setLabel(AlertLabel.create(assetInfoDataFromDatabase.getString(assetInfoDataFromDatabase.getColumnIndex("label")))).build();
            assetInfoDataFromDatabase.close();
            return build;
        } catch (Throwable th) {
            if (assetInfoDataFromDatabase != null) {
                try {
                    assetInfoDataFromDatabase.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Cursor getAssetInfoDataFromDatabase(AlertsToken alertsToken) {
        return getAlertsDatabaseHelper().getReadableDatabase().query(AlertsContract.AlertAssetInfoEntry.TABLE_NAME, ASSET_INFO_PROJECTION, "token = ? ", new String[]{alertsToken.getValue()}, null, null, null);
    }

    private Cursor getDataFromDatabase() {
        return getAlertsDatabaseHelper().getReadableDatabase().query(AlertsContract.AlertRecordEntry.TABLE_NAME, ALERT_PROJECTION, null, null, null, null, null);
    }

    public synchronized void add(AlertRecord alertRecord) {
        SQLiteDatabase writableDatabase = getAlertsDatabaseHelper().getWritableDatabase();
        ContentValues createAlertContentValues = createAlertContentValues(alertRecord);
        writableDatabase.beginTransaction();
        try {
            writableDatabase.insertWithOnConflict(AlertsContract.AlertRecordEntry.TABLE_NAME, null, createAlertContentValues, 5);
            if (alertRecord.hasAssets()) {
                writableDatabase.insertWithOnConflict(AlertsContract.AlertAssetInfoEntry.TABLE_NAME, null, createAssetInfoContentValues(alertRecord), 5);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    public synchronized boolean contains(AlertsToken alertsToken) {
        Iterator<AlertRecord> it2 = getAll().iterator();
        while (it2.hasNext()) {
            if (it2.next().getToken().equals(alertsToken)) {
                return true;
            }
        }
        return false;
    }

    public synchronized AlertRecord get(AlertsToken alertsToken) {
        for (AlertRecord alertRecord : getAll()) {
            if (alertRecord.getToken().equals(alertsToken)) {
                return alertRecord;
            }
        }
        return null;
    }

    public synchronized Set<AlertRecord> getAll() {
        HashSet hashSet;
        hashSet = new HashSet();
        Cursor dataFromDatabase = getDataFromDatabase();
        while (dataFromDatabase.moveToNext()) {
            try {
                AlertRecord alertRecordFromCursor = getAlertRecordFromCursor(dataFromDatabase);
                if (alertRecordFromCursor != null) {
                    hashSet.add(alertRecordFromCursor);
                }
            } finally {
            }
        }
        dataFromDatabase.close();
        return hashSet;
    }

    public Uri getBackgroundAsset(AlertsToken alertsToken) {
        return getAsset(alertsToken, false);
    }

    public Uri getForegroundAsset(AlertsToken alertsToken) {
        return getAsset(alertsToken, true);
    }

    public boolean hasAssets(AlertsToken alertsToken) {
        if (!contains(alertsToken)) {
            return false;
        }
        Cursor query = getAlertsDatabaseHelper().getReadableDatabase().query(AlertsContract.AlertRecordEntry.TABLE_NAME, new String[]{AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS}, "token = ? ", new String[]{alertsToken.getValue()}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                query.close();
                return false;
            }
            boolean parseBoolean = Boolean.parseBoolean(query.getString(query.getColumnIndex(AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS)));
            query.close();
            return parseBoolean;
        } finally {
        }
    }

    public synchronized void remove(AlertsToken alertsToken) {
        SQLiteDatabase writableDatabase = getAlertsDatabaseHelper().getWritableDatabase();
        String[] strArr = {alertsToken.getValue()};
        Cursor query = writableDatabase.query(AlertsContract.AlertRecordEntry.TABLE_NAME, new String[]{AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS}, "token = ? ", strArr, null, null, null);
        try {
            if (query.moveToFirst()) {
                if (Boolean.parseBoolean(query.getString(query.getColumnIndex(AlertsContract.AlertRecordEntry.COLUMN_NAME_ASSET_INFO_EXISTS)))) {
                    deleteAssetFiles(alertsToken);
                    writableDatabase.delete(AlertsContract.AlertAssetInfoEntry.TABLE_NAME, "token = ? ", strArr);
                }
                writableDatabase.delete(AlertsContract.AlertRecordEntry.TABLE_NAME, "token = ? ", strArr);
            }
            query.close();
        } finally {
        }
    }

    public synchronized void teardown() {
        getAlertsDatabaseHelper().close();
    }
}
