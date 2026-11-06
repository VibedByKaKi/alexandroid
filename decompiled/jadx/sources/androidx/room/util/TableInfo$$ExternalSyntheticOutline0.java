package androidx.room.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.TableInfo;
import androidx.savedstate.SavedStateReaderKt;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public abstract /* synthetic */ class TableInfo$$ExternalSyntheticOutline0 {
    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static String m$1(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static Intent m(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setAction(str);
        return intent;
    }

    public static IntentFilter m(String str, String str2) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        intentFilter.addAction(str2);
        return intentFilter;
    }

    public static Integer m(int i, Integer num) {
        return Integer.valueOf(num.intValue() + i);
    }

    public static Object m(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str2);
    }

    public static String m() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static String m(char c, String str, StringBuilder sb) {
        sb.append(c);
        sb.append(str);
        return sb.toString();
    }

    public static String m(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String m(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String m(String str, int i, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String m(String str, TableInfo tableInfo, String str2, TableInfo tableInfo2) {
        return str + tableInfo + str2 + tableInfo2;
    }

    public static String m(String str, String str2, String str3, String str4) {
        str.getClass();
        return str2 + str3 + str4;
    }

    public static String m(String str, UUID uuid) {
        return str + uuid;
    }

    public static String m(StringBuilder sb, String str, Object obj) {
        sb.append(obj.getClass().getName());
        sb.append(str);
        return sb.toString();
    }

    public static String m(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static StringBuilder m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static int m(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static UnsupportedOperationException m8108m(String str, String str2) {
        str.getClass();
        return new UnsupportedOperationException(str2);
    }

    public static HashSet m(HashMap hashMap, String str, TableInfo.Column column, int i) {
        hashMap.put(str, column);
        return new HashSet(i);
    }

    public static KotlinNothingValueException m(String str) {
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        return new KotlinNothingValueException();
    }

    public static void m(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m8109m(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void m(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void m(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }

    public static void m(String str, int i, int i2, StringBuilder sb, String str2) {
        sb.append(str.substring(i, i2));
        sb.append(str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m8110m(String str, String str2, String str3, String str4) {
        android.util.Log.i(str4, str + str2 + str3);
    }

    public static void m(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void m(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static boolean m(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.query(str).close();
        return supportSQLiteDatabase.inTransaction();
    }
}
