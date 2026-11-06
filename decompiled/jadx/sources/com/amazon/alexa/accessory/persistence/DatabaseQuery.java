package com.amazon.alexa.accessory.persistence;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DatabaseQuery implements Predicate<Set<String>>, Function<Set<String>, DatabaseQuery> {
    private final String[] columns;
    private final SQLiteDatabase database;
    private final SQLiteOpenHelper helper;
    private final String selection;
    private final String[] selectionArgs;
    private final String sql;
    private final String[] tables;

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String[] strArr, String[] strArr2, String str, String[] strArr3) {
        Preconditions.notNull(sQLiteOpenHelper, "helper");
        Preconditions.notNull(strArr, "tables");
        Preconditions.notNull(strArr2, "columns");
        this.helper = sQLiteOpenHelper;
        this.tables = strArr;
        this.columns = strArr2;
        this.selection = str;
        this.selectionArgs = strArr3;
        this.database = sQLiteOpenHelper.getReadableDatabase();
        this.sql = SQLiteQueryBuilder.buildQueryString(false, getTablesSql(), strArr2, str, null, null, null, null);
    }

    private String getTablesSql() {
        String[] strArr = this.tables;
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.tables) {
            if (sb.length() == 0) {
                sb.append(str);
            } else {
                sb.append(", ");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatabaseQuery.class != obj.getClass()) {
            return false;
        }
        DatabaseQuery databaseQuery = (DatabaseQuery) obj;
        if (!this.helper.equals(databaseQuery.helper) || !Arrays.equals(this.tables, databaseQuery.tables) || !Arrays.equals(this.columns, databaseQuery.columns)) {
            return false;
        }
        String str = this.selection;
        String str2 = databaseQuery.selection;
        if (str == null ? str2 == null : str.equals(str2)) {
            return Arrays.equals(this.selectionArgs, databaseQuery.selectionArgs);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.tables) * 31) + Arrays.hashCode(this.columns)) * 31;
        String str = this.selection;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.selectionArgs);
    }

    public Cursor run() {
        if (Logger.shouldLog(Logger.Level.VERBOSE)) {
            Logger.d("DatabaseQuery.run: query = [" + this.sql + "]  selectionArgs = [" + Arrays.toString(this.selectionArgs) + MarkdownConstants.RIGHT_BRACKET);
            Cursor rawQuery = this.database.rawQuery(this.sql, this.selectionArgs);
            try {
                if (rawQuery.getCount() == 0) {
                    Logger.v("DatabaseQuery.run: >>>>> No rows");
                } else {
                    Logger.v("DatabaseQuery.run: " + DatabaseUtils.dumpCursorToString(rawQuery));
                }
                rawQuery.close();
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
        }
        return this.database.rawQuery(this.sql, this.selectionArgs);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(@NonNull Set<String> set) throws Exception {
        for (String str : this.tables) {
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DatabaseQuery{tables=");
        sb.append(Arrays.toString(this.tables));
        sb.append(", columns=");
        sb.append(Arrays.toString(this.columns));
        sb.append(", selection='");
        sb.append(this.selection);
        sb.append("', selectionArgs=");
        sb.append(Arrays.toString(this.selectionArgs));
        sb.append(", sql='");
        return a$$ExternalSyntheticOutline0.m(sb, this.sql, "'}");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public DatabaseQuery apply(@NonNull Set<String> set) throws Exception {
        return this;
    }

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String str, String[] strArr, String str2, String[] strArr2) {
        this(sQLiteOpenHelper, new String[]{str}, strArr, str2, strArr2);
    }

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String[] strArr, String[] strArr2) {
        this(sQLiteOpenHelper, strArr, strArr2, (String) null, (String[]) null);
    }

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String str, String[] strArr) {
        this(sQLiteOpenHelper, new String[]{str}, strArr, (String) null, (String[]) null);
    }

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String str, List<String> list, String str2, String[] strArr) {
        this(sQLiteOpenHelper, new String[]{str}, (String[]) list.toArray(new String[0]), str2, strArr);
    }

    public DatabaseQuery(SQLiteOpenHelper sQLiteOpenHelper, String str, List<String> list) {
        this(sQLiteOpenHelper, new String[]{str}, (String[]) list.toArray(new String[0]), (String) null, (String[]) null);
    }
}
