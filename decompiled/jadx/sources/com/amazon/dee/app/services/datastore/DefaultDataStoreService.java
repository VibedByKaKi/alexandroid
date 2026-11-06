package com.amazon.dee.app.services.datastore;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.logging.Log;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/dee/app/services/datastore/DefaultDataStoreService;", "Lcom/amazon/dee/app/services/datastore/DataStoreService;", "Lcom/amazon/alexa/protocols/datastore/DataStoreService;", "dataStoreHelper", "Lcom/amazon/dee/app/services/datastore/DataStoreHelper;", "<init>", "(Lcom/amazon/dee/app/services/datastore/DataStoreHelper;)V", "sqLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "retrieveValue", "", "key", "storeValue", "", "value", MetricsConstants.Method.CACHE_CLEAR, "updateDataItem", "", "insertDataItem", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes4.dex */
public final class DefaultDataStoreService implements DataStoreService, com.amazon.alexa.protocols.datastore.DataStoreService {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DefaultDataStoreService";

    @NotNull
    private final SQLiteDatabase sqLiteDatabase;

    @Inject
    public DefaultDataStoreService(@NotNull DataStoreHelper dataStoreHelper) {
        dataStoreHelper.getClass();
        SQLiteDatabase writableDatabase = dataStoreHelper.getWritableDatabase();
        writableDatabase.getClass();
        this.sqLiteDatabase = writableDatabase;
    }

    private final void insertDataItem(String key, String value) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", key);
        contentValues.put("value", value);
        this.sqLiteDatabase.insert("DataItem", null, contentValues);
    }

    private final int updateDataItem(String key, String value) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", value);
        return this.sqLiteDatabase.update("DataItem", contentValues, "key = ?", new String[]{key});
    }

    @Override // com.amazon.dee.app.services.datastore.DataStoreService, com.amazon.alexa.protocols.datastore.DataStoreService
    public void clear() {
        if (this.sqLiteDatabase.isOpen()) {
            this.sqLiteDatabase.delete("DataItem", null, null);
        }
    }

    @Override // com.amazon.dee.app.services.datastore.DataStoreService, com.amazon.alexa.protocols.datastore.DataStoreService
    @Nullable
    public String retrieveValue(@NotNull String key) {
        key.getClass();
        if (!this.sqLiteDatabase.isOpen()) {
            Log.e(TAG, "Attempted to get " + key + " after the database was closed.");
            return null;
        }
        Cursor query = this.sqLiteDatabase.query("DataItem", new String[]{"key", "value"}, "key = ?", new String[]{key}, null, null, null);
        try {
            if (query.getCount() == 0) {
                CloseableKt.closeFinally(query, null);
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndexOrThrow("value"));
            CloseableKt.closeFinally(query, null);
            return string;
        } finally {
        }
    }

    @Override // com.amazon.dee.app.services.datastore.DataStoreService, com.amazon.alexa.protocols.datastore.DataStoreService
    public void storeValue(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        if (this.sqLiteDatabase.isOpen()) {
            if (updateDataItem(key, value) == 0) {
                insertDataItem(key, value);
            }
        } else {
            Log.e(TAG, "Could not store key=" + key + " because app is shutting down.");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/datastore/DefaultDataStoreService$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
