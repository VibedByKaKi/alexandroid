package com.amazon.identity.auth.device;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class l9 {
    public static MatrixCursor a(String[] strArr, Collection collection) {
        MatrixCursor matrixCursor = null;
        if (strArr != null && collection != null) {
            if (strArr.length >= 10000) {
                Locale locale = Locale.ENGLISH;
                Log.e(yf.a("DBHelpers"), a$$ExternalSyntheticOutline0.m(strArr.length, "The number of columns ", " is too large to be handled. Issue tracked in SSO-160."));
                return null;
            }
            matrixCursor = new MatrixCursor(strArr);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                String[] strArr2 = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    if (map.containsKey(str)) {
                        strArr2[i] = (String) map.get(str);
                    } else {
                        yf.a("DBHelpers");
                        "user".equalsIgnoreCase(Build.TYPE);
                    }
                }
                matrixCursor.addRow(strArr2);
            }
        }
        return matrixCursor;
    }

    public static boolean a(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str)) == 1;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            if (sQLiteDatabase.update(str, contentValues, str2, strArr) > 0) {
                return true;
            }
            return sQLiteDatabase.insertOrThrow(str, null, contentValues) >= 0;
        } catch (SQLException unused) {
            Log.w(yf.a("DBHelpers"), "Error inserting into database in ifCannotUpdateThenInsert");
            yf.a("DBHelpers");
            "user".equalsIgnoreCase(Build.TYPE);
            return false;
        }
    }
}
