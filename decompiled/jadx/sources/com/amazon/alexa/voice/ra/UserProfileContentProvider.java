package com.amazon.alexa.voice.ra;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UserProfileContentProvider extends ContentProvider {
    public static final String AUTHORITY_SUFFIX = ".alexa.ra";
    public static final String COL_DISPLAY_NAME = "first_name";
    public static final String COL_PID = "pid";
    public static final String PATH = "profileInfo";
    private static final String PREFS_NAME = "com.amazon.alexa.voice.ra.prefs_store";
    private static final String TAG = "UserProfileContentProvider";
    public Uri contentUri;

    @Inject
    Context context;
    private SharedPreferences profileStore;

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int i = 0;
        for (String str2 : strArr) {
            if (this.profileStore.contains(str2)) {
                this.profileStore.edit().remove(str2).apply();
                i++;
            }
        }
        return i;
    }

    public Uri getContentUri() {
        return this.contentUri;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return "vnd.android.cursor.dir/vnd." + this.contentUri.getAuthority() + ".profileInfo";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String asString = contentValues.getAsString("pid");
        this.profileStore.edit().putString(asString, contentValues.getAsString("first_name")).apply();
        return Uri.withAppendedPath(this.contentUri, asString);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (this.context == null) {
            this.context = getContext();
        }
        this.contentUri = ErrorUtils$$ExternalSyntheticOutline0.m28m("content").authority(this.context.getPackageName() + AUTHORITY_SUFFIX).path(PATH).build();
        this.profileStore = this.context.getSharedPreferences(PREFS_NAME, 0);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        ArrayList arrayList = new ArrayList();
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (this.profileStore.contains(str3)) {
                    HashMap m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("pid", str3);
                    m.put("first_name", this.profileStore.getString(str3, ""));
                    arrayList.add(m);
                }
            }
        } else {
            for (Map.Entry<String, ?> entry : this.profileStore.getAll().entrySet()) {
                HashMap hashMap = new HashMap();
                hashMap.put("pid", entry.getKey());
                hashMap.put("first_name", entry.getValue().toString());
                arrayList.add(hashMap);
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"pid", "first_name"});
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            matrixCursor.addRow(new Object[]{map.get("pid"), map.get("first_name")});
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null || strArr == null) {
            return 0;
        }
        int i = 0;
        for (String str2 : strArr) {
            String asString = contentValues.getAsString("first_name");
            if (this.profileStore.contains(str2)) {
                this.profileStore.edit().putString(str2, asString).apply();
                i++;
            }
        }
        return i;
    }
}
