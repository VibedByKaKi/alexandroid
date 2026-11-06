package com.amazon.alexa.accessory.internal.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean containsTable(SQLiteDatabase sQLiteDatabase, String str) {
        Preconditions.notNull(str, "name");
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{str});
        try {
            boolean z = rawQuery.getCount() == 1;
            rawQuery.close();
            return z;
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

    public static String[] prependColumnsWithTable(String str, String[] strArr) {
        Preconditions.notNull(strArr, "columns");
        Preconditions.notNull(str, "table");
        Preconditions.precondition(!str.isEmpty(), "Table name is empty!");
        String[] strArr2 = new String[strArr.length];
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
            m1m.append(strArr[i]);
            strArr2[i] = m1m.toString();
        }
        return strArr2;
    }
}
