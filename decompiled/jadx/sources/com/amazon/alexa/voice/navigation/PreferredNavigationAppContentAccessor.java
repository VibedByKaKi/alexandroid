package com.amazon.alexa.voice.navigation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.alexa.voice.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class PreferredNavigationAppContentAccessor {

    @VisibleForTesting
    static final String PREFERRED_NAVIGATION_APP_PREFERENCE_KEY = "preferred_nav_app";
    private static final String TAG = "PreferredNavigationAppContentAccessor";
    private final Context context;
    private final Uri preferredNavAppContentUri = getContentUri();

    public PreferredNavigationAppContentAccessor(Context context) {
        this.context = context;
    }

    @VisibleForTesting
    public Uri getContentUri() {
        return Uri.parse(ReactNativeBlobUtilConst.FILE_PREFIX_CONTENT + this.context.getString(R.string.preferredNavAppContentProviderAuthoritiesId) + "/preferredNavApp");
    }

    public String getPreferredNavigationApp() {
        String str = com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME;
        Cursor query = this.context.getContentResolver().query(this.preferredNavAppContentUri, null, null, null, null, null);
        if (query == null) {
            Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
            return null;
        }
        try {
            if (!query.moveToFirst()) {
                Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
                return null;
            }
            int columnIndex = query.getColumnIndex("preferred_nav_app");
            if (columnIndex == -1) {
                Log.e(TAG, "PreferredNavAppSettingContentProvider returns no preferred nav app data");
                return null;
            }
            if (!com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(query.getString(columnIndex))) {
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
        contentValues.put("preferred_nav_app", str);
        this.context.getContentResolver().insert(this.preferredNavAppContentUri, contentValues);
    }
}
