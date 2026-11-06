package com.amazon.alexa.accessory.crypto.persistence;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import com.amazon.alexa.accessory.crypto.MemoryNegotiatedDataPersistenceLayer;
import com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor;
import com.amazon.alexa.accessory.crypto.persistence.NegotiatedDBEntry;
import com.amazon.alexa.accessory.crypto.persistence.NegotiatedDataSQLLiteContract;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.util.Collections;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class KeyStoreAndSQLiteBackedPersistenceLayer implements NegotiatedDataPersistor, Closeable {
    private static final int DEFAULT_PAGINATION_LIMIT = 100;
    private final MemoryNegotiatedDataPersistenceLayer cache;
    private final KeyStoreMediator keyStoreMediator;
    private final int maxPageSize;
    private final SQLiteOpenHelper sqliteHelper;

    public KeyStoreAndSQLiteBackedPersistenceLayer(Context context, int i, KeyStoreMediator keyStoreMediator) {
        Preconditions.notNull(context, "context");
        int i2 = 0;
        Preconditions.precondition(i > 0, "maxPageSize");
        Preconditions.notNull(keyStoreMediator, "keyStoreMediator");
        this.maxPageSize = i;
        this.keyStoreMediator = keyStoreMediator;
        this.cache = new MemoryNegotiatedDataPersistenceLayer();
        this.sqliteHelper = new NegotiatedDataDBHelper(context, i2);
    }

    private void deleteFromKeyStore(String[] strArr, Cursor cursor) throws CryptoKeyDataStore.CryptoKeyDataStoreIOException, CryptoKeyDataStore.InvalidStoreStateException {
        while (cursor.moveToNext()) {
            this.keyStoreMediator.deleteKeysAtCurrentCursorEntry(cursor);
        }
    }

    private static String generateWhereAccessoryIdInSelection(int i) {
        StringBuilder sb = new StringBuilder("accessory_id IN (");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append("?, ");
        }
        sb.append(i > 0 ? "?)" : MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    private NegotiatedDBEntry getEntryFromSQLite(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreIOException, CryptoKeyDataStore.InvalidStoreStateException {
        try {
            Cursor rawQuery = this.sqliteHelper.getReadableDatabase().rawQuery(NegotiatedDataSQLLiteContract.Queries.GET_DATA_QUERY, new String[]{str});
            try {
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return null;
                }
                if (rawQuery.getCount() > 1) {
                    Logger.e("CryptoKeyNegotiatedData.db has %d rows for accessory ID. Returning just the 1st row.", Integer.valueOf(rawQuery.getCount()));
                }
                NegotiatedDBEntry fromCurrentCursorEntry = NegotiatedDBEntry.fromCurrentCursorEntry(str, rawQuery);
                rawQuery.close();
                return fromCurrentCursorEntry;
            } finally {
            }
        } catch (SQLiteException e) {
            throw new CryptoKeyDataStore.CryptoKeyDataStoreIOException(str, "Error reading from SQLite DB CryptoKeyNegotiatedData.db", e);
        }
    }

    private CryptoKeyDataStore.ListResult getListResult(int i, Cursor cursor) throws SQLiteException, IllegalArgumentException {
        int i2 = i - 1;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i3 = 0;
        String str = "";
        while (cursor.moveToNext() && !cursor.isLast()) {
            str = cursor.getString(cursor.getColumnIndexOrThrow(NegotiatedDataSQLLiteContract.Columns.COLUMN_NAME_ACCESSORY_ID));
            builder.add((ImmutableList.Builder) str);
            i3++;
        }
        if (i3 >= i2) {
            return new CryptoKeyDataStore.ListResult(builder.build(), new CryptoKeyDataStore.PaginationToken(str));
        }
        if (cursor.moveToLast()) {
            builder.add((ImmutableList.Builder) cursor.getString(cursor.getColumnIndexOrThrow(NegotiatedDataSQLLiteContract.Columns.COLUMN_NAME_ACCESSORY_ID)));
        }
        return new CryptoKeyDataStore.ListResult(builder.build(), CryptoKeyDataStore.PaginationToken.EMPTY);
    }

    private void insertEntryIntoSQLite(String str, NegotiatedDBEntry negotiatedDBEntry) throws CryptoKeyDataStore.InvalidStoreStateException, CryptoKeyDataStore.CryptoKeyDataStoreIOException {
        try {
            long insertOrThrow = this.sqliteHelper.getWritableDatabase().insertOrThrow(NegotiatedDataSQLLiteContract.Tables.ACCESSORY_NEGOTIATED_CRYPTO_DATA, null, negotiatedDBEntry.asContentValues(str));
            if (insertOrThrow >= 0) {
                return;
            }
            throw new CryptoKeyDataStore.InvalidStoreStateException(str, "Failed to insert negotiated data into CryptoKeyNegotiatedData.db. Row ID Returned: " + insertOrThrow);
        } catch (SQLException e) {
            throw new CryptoKeyDataStore.CryptoKeyDataStoreIOException(str, "Error inserting negotiated data into CryptoKeyNegotiatedData.db", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$deleteData$0(String str) {
        return str != null;
    }

    private static String limitQuery(String str, int i) {
        return TableInfo$$ExternalSyntheticOutline0.m(i, str, " LIMIT ");
    }

    private Cursor queryForAccessoriesKeys(String[] strArr, String str) {
        return this.sqliteHelper.getReadableDatabase().query(NegotiatedDataSQLLiteContract.Tables.ACCESSORY_NEGOTIATED_CRYPTO_DATA, new String[]{NegotiatedDataSQLLiteContract.Columns.COLUMN_NAME_ACCESSORY_ID, NegotiatedDataSQLLiteContract.Columns.COLUMN_NAME_KEY_STORAGE_VERSION, NegotiatedDataSQLLiteContract.Columns.V1.COLUMN_NAME_WRAPPING_KEY_ALIAS, NegotiatedDataSQLLiteContract.Columns.V1.COLUMN_NAME_DECRYPTION_KEY_ALIAS, NegotiatedDataSQLLiteContract.Columns.V1.COLUMN_NAME_AUTHENTICATION_KEY_ALIAS, NegotiatedDataSQLLiteContract.Columns.V2.COLUMN_NAME_ROOT_KEY_WRAPPER_ALIAS, NegotiatedDataSQLLiteContract.Columns.V2.COLUMN_NAME_DECRYPTION_KEY_WRAPPER_ALIAS, NegotiatedDataSQLLiteContract.Columns.V2.COLUMN_NAME_AUTHENTICATION_KEY_WRAPPER_ALIAS}, str, strArr, null, null, null);
    }

    private void updateSQLiteEntry(String str, NegotiatedDBEntry negotiatedDBEntry) {
        long update = this.sqliteHelper.getWritableDatabase().update(NegotiatedDataSQLLiteContract.Tables.ACCESSORY_NEGOTIATED_CRYPTO_DATA, negotiatedDBEntry.asContentValues(str), "accessory_id = ?", new String[]{str});
        if (update != 1) {
            Logger.e("Single entry update for accessoryId unexpectedly updated %d rows instead of just 1.", Long.valueOf(update));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.sqliteHelper.close();
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public void deleteData(Iterable<String> iterable) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(null).accumulateField(iterable != null, "accessoryIds").throwIfInvalid("Cannot fetch negotiated data for a null list of accessories");
        this.cache.deleteData(iterable);
        String[] strArr = (String[]) Iterables.toArray(Iterables.filter(iterable, new KeyStoreAndSQLiteBackedPersistenceLayer$$ExternalSyntheticLambda0()), String.class);
        String generateWhereAccessoryIdInSelection = generateWhereAccessoryIdInSelection(strArr.length);
        try {
            Cursor queryForAccessoriesKeys = queryForAccessoriesKeys(strArr, generateWhereAccessoryIdInSelection);
            try {
                deleteFromKeyStore(strArr, queryForAccessoriesKeys);
                if (queryForAccessoriesKeys != null) {
                    queryForAccessoriesKeys.close();
                }
                int delete = this.sqliteHelper.getWritableDatabase().delete(NegotiatedDataSQLLiteContract.Tables.ACCESSORY_NEGOTIATED_CRYPTO_DATA, generateWhereAccessoryIdInSelection, strArr);
                if (delete != strArr.length) {
                    Logger.e("Could not delete all requested accessories from SQLite. Requested: %d items; Deleted: %d items.", Integer.valueOf(strArr.length), Integer.valueOf(delete));
                }
            } finally {
            }
        } catch (SQLiteException unused) {
            throw new CryptoKeyDataStore.CryptoKeyDataStoreIOException(Joiner.on(AbstractJsonLexerKt.COMMA).join(iterable), "Error querying accessory rows to delete from CryptoKeyNegotiatedData.db");
        }
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public CryptoKeyDataStore.NegotiatedData getData(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(str).accumulateField(str != null, "accessoryId").throwIfInvalid("Cannot fetch negotiated data for a null accessory");
        if (this.cache.hasData(str)) {
            return this.cache.getData(str);
        }
        NegotiatedDBEntry entryFromSQLite = getEntryFromSQLite(str);
        if (entryFromSQLite == null) {
            return null;
        }
        CryptoKeyDataStore.NegotiatedData negotiatedData = entryFromSQLite.toNegotiatedData(str, this.keyStoreMediator);
        if (negotiatedData != null) {
            this.cache.putData(str, negotiatedData);
        }
        return negotiatedData;
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public boolean hasData(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        return (str == null || getData(str) == null) ? false : true;
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public CryptoKeyDataStore.ListResult listData(int i, CryptoKeyDataStore.PaginationToken paginationToken) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        String[] strArr;
        String str;
        CryptoKeyDataStore.InvalidInputsException.accumulator(null).accumulateField(i > 0, "maxCount").accumulateField(paginationToken != null, "token").throwIfInvalid("Cannot list accessories in store because of invalid inputs");
        int min = Math.min(i, this.maxPageSize) + 1;
        if (CryptoKeyDataStore.PaginationToken.EMPTY == paginationToken) {
            str = limitQuery(NegotiatedDataSQLLiteContract.Queries.LIST_ACCESSORIES_FROM_START_QUERY, min);
            strArr = null;
        } else {
            String limitQuery = limitQuery(NegotiatedDataSQLLiteContract.Queries.LIST_ACCESSORIES_STARTING_FROM_QUERY, min);
            strArr = new String[]{paginationToken.value};
            str = limitQuery;
        }
        try {
            Cursor rawQuery = this.sqliteHelper.getReadableDatabase().rawQuery(str, strArr);
            try {
                CryptoKeyDataStore.ListResult listResult = getListResult(min, rawQuery);
                if (rawQuery == null) {
                    return listResult;
                }
                rawQuery.close();
                return listResult;
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e) {
            throw new CryptoKeyDataStore.CryptoKeyDataStoreIOException(null, "Error listing accessories from the SQLite DB CryptoKeyNegotiatedData.db", e);
        } catch (IllegalArgumentException e2) {
            throw new CryptoKeyDataStore.InvalidStoreStateException(null, "Required column, accessoryId, missing from SQLite DBCryptoKeyNegotiatedData.db", e2);
        }
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public void putData(String str, CryptoKeyDataStore.NegotiatedData negotiatedData) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(str).accumulateField(str != null, "accessoryId").accumulateField(negotiatedData != null, "toPersist").throwIfInvalid("Cannot write data to persistence for invalid input(s).");
        this.cache.deleteData(Collections.singleton(str));
        NegotiatedDBEntry entryFromSQLite = getEntryFromSQLite(str);
        NegotiatedDBEntry.V2 prepareKeysForStore = this.keyStoreMediator.prepareKeysForStore(str, negotiatedData, entryFromSQLite);
        if (entryFromSQLite == null) {
            insertEntryIntoSQLite(str, prepareKeysForStore);
        } else {
            updateSQLiteEntry(str, prepareKeysForStore);
            entryFromSQLite.performDelete(str, this.keyStoreMediator, false);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NegotiatedDataDBHelper extends SQLiteOpenHelper {
        private NegotiatedDataDBHelper(@Nullable Context context) {
            super(context, NegotiatedDataSQLLiteContract.SQLITE_DB_NAME, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(NegotiatedDataSQLLiteContract.Queries.CREATE_TABLE_QUERY);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i == 1 && i2 == 2) {
                sQLiteDatabase.beginTransaction();
                try {
                    Iterator<String> it2 = NegotiatedDataSQLLiteContract.Queries.V1_TO_V2_MIGRATE_STATEMENTS.iterator();
                    while (it2.hasNext()) {
                        sQLiteDatabase.execSQL(it2.next());
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
        }

        public /* synthetic */ NegotiatedDataDBHelper(Context context, int i) {
            this(context);
        }
    }

    public KeyStoreAndSQLiteBackedPersistenceLayer(Context context, KeyStoreMediator keyStoreMediator) {
        this(context, 100, keyStoreMediator);
    }

    public KeyStoreAndSQLiteBackedPersistenceLayer(Context context) {
        this(context, new KeyStoreMediator());
    }
}
