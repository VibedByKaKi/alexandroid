package com.amazon.deecomms.notifications.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.database.CommsDatabaseHelper;
import com.amazon.deecomms.messaging.database.MessagingTableConstants;
import java.util.ArrayList;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class OfflinePushNotificationRepository {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, OfflinePushNotificationRepository.class);
    private static final Object lockObject = new Object();

    public void addNotification(@NonNull Context context, @NonNull String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("payload", str);
        SQLiteDatabase writableDatabase = CommsDatabaseHelper.getInstance(context).getWritableDatabase();
        if (writableDatabase == null) {
            LOG.w("Database is null. Cannot save notification.");
            return;
        }
        synchronized (lockObject) {
            try {
                if (writableDatabase.insert(MessagingTableConstants.OfflinePushNotificationCache.TABLE_NAME, (String) null, contentValues) < 0) {
                    LOG.e("Saving notification failed.");
                }
            } catch (SQLiteException e) {
                LOG.e("Error saving notification", e);
            }
        }
    }

    public Iterable<String> getAndDeleteNotifications(@NonNull Context context) {
        SQLiteDatabase writableDatabase = CommsDatabaseHelper.getInstance(context).getWritableDatabase();
        if (writableDatabase == null) {
            LOG.w("Database is null. Returning empty notifications list.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (lockObject) {
            try {
                Cursor query = writableDatabase.query(MessagingTableConstants.OfflinePushNotificationCache.TABLE_NAME, new String[]{"payload"}, null, null, null, null, null, null);
                try {
                    if (query == null) {
                        LOG.e("Reading notifications failed.");
                        if (query != null) {
                            query.close();
                        }
                        return arrayList;
                    }
                    int columnIndex = query.getColumnIndex("payload");
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(columnIndex));
                    }
                    query.close();
                    writableDatabase.delete(MessagingTableConstants.OfflinePushNotificationCache.TABLE_NAME, (String) null, (String[]) null);
                    return arrayList;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
