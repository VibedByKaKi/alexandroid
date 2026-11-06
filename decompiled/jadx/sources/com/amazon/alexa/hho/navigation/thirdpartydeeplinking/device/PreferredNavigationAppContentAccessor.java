package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.alexa.hho.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class PreferredNavigationAppContentAccessor {
    public static final String GOOGLE_MAPS_PACKAGENAME = "com.google.android.apps.maps";
    private static final String PREFERRED_NAVIGATION_APP = "preferredNavApp";
    public static final String PREFERRED_NAVIGATION_APP_PREFERENCE_KEY = "preferred_nav_app";
    private static final String TAG = "PreferredNavigationAppContentAccessor";
    public static final String WAZE_PACKAGENAME = "com.waze";
    private final Context context;
    private final Uri preferredNavigationAppContentUri = getContentUri();

    public PreferredNavigationAppContentAccessor(Context context) {
        this.context = context;
    }

    public Uri getContentUri() {
        return Uri.parse(ReactNativeBlobUtilConst.FILE_PREFIX_CONTENT + this.context.getString(R.string.preferredNavAppContentProviderAuthoritiesId) + "/preferredNavApp");
    }

    public String getPreferredNavigationApp() {
        String str = WAZE_PACKAGENAME;
        Cursor query = this.context.getContentResolver().query(this.preferredNavigationAppContentUri, null, null, null, null, null);
        if (query == null) {
            Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
            return null;
        }
        try {
            if (!query.moveToFirst()) {
                Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
                return null;
            }
            int columnIndex = query.getColumnIndex(PREFERRED_NAVIGATION_APP_PREFERENCE_KEY);
            if (columnIndex == -1) {
                Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
                return null;
            }
            if (!WAZE_PACKAGENAME.equals(query.getString(columnIndex))) {
                str = "com.google.android.apps.maps";
            }
            return str;
        } finally {
            query.close();
        }
    }

    public void setPreferredNavigationApp(String str) {
        if (str == null) {
            Log.e(TAG, "Cannot set preferred nav app to null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PREFERRED_NAVIGATION_APP_PREFERENCE_KEY, str);
        this.context.getContentResolver().insert(this.preferredNavigationAppContentUri, contentValues);
    }
}
