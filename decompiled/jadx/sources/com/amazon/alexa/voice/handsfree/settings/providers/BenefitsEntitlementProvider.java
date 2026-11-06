package com.amazon.alexa.voice.handsfree.settings.providers;

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
import com.amazon.alexa.voice.handsfree.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BenefitsEntitlementProvider extends ContentProvider {
    public static final int AUTHORITY_RES_ID = R.string.benefitsEntitlementProviderId;
    public static final String COLUMN_ENTITLEMENT_STATE = "entitlementState";
    public static final String COLUMN_ENTITLEMENT_STATUS = "entitlementStatus";
    public static final int ENTITLEMENT_STATE_ENTITLED = 1;
    public static final int ENTITLEMENT_STATE_NOT_ENTITLED = 0;
    public static final int ENTITLEMENT_STATE_UNKNOWN = -1;
    static final String KEY_ENTITLEMENT_STATUS = "bmcl_entitlement_status";
    static final String PREF_FILE = "voice";
    public static final String URI_PATH = "entitlement";

    private SharedPreferences getSharedPreferences() {
        return getContext().getSharedPreferences("voice", 0);
    }

    public static boolean readEntitled(@NonNull Context context) {
        return context.getSharedPreferences("voice", 0).getBoolean(KEY_ENTITLEMENT_STATUS, false);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("Delete is not supported for this provider");
    }

    public Uri getContentUri() {
        return ErrorUtils$$ExternalSyntheticOutline0.m28m("content").authority(getContext().getString(AUTHORITY_RES_ID)).path(URI_PATH).build();
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        throw new UnsupportedOperationException("getType is not supported");
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert is not supported. Use update instead.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        getContext().getContentResolver().notifyChange(getContentUri(), null);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        boolean z = sharedPreferences.getBoolean(KEY_ENTITLEMENT_STATUS, false);
        int i = sharedPreferences.contains(KEY_ENTITLEMENT_STATUS) ? z ? 1 : 0 : -1;
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"entitlementStatus", COLUMN_ENTITLEMENT_STATE});
        matrixCursor.addRow(new Object[]{Integer.valueOf(z ? 1 : 0), Integer.valueOf(i)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null || !contentValues.containsKey("entitlementStatus")) {
            return 0;
        }
        getSharedPreferences().edit().putBoolean(KEY_ENTITLEMENT_STATUS, contentValues.getAsBoolean("entitlementStatus").booleanValue()).apply();
        getContext().getContentResolver().notifyChange(uri, null);
        return 1;
    }
}
