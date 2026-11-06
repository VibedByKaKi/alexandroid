package com.amazon.alexa.voice.handsfree.features;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatus;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatusManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UvrEnrollmentStatusProvider extends ContentProvider {

    @VisibleForTesting
    static final String KEY_ENROLLED_STATUS = "enrollmentStatus";
    private static final int MATCH_CODE_UVR_ENROLLMENT_STATUS_FILE = 1;
    private static final String SHARED_PREF_NAME = "UVREnrollmentStatusProviderSharedPref";
    private static final String TAG = "UvrEnrollmentStatusProvider";
    private static final UriMatcher URI_MATCHER = new UriMatcher(-1);
    private SharedPreferences mSharedPreferences;

    @VisibleForTesting
    public UvrEnrollmentStatusProvider(SharedPreferences sharedPreferences, String str) {
        this.mSharedPreferences = sharedPreferences;
        URI_MATCHER.addURI(str, "file", 1);
    }

    private int readUvrEnrollmentStatus() {
        return this.mSharedPreferences.getInt(KEY_ENROLLED_STATUS, EnrollmentStatus.SETUP_NOT_SET.getValue());
    }

    @VisibleForTesting
    public MatrixCursor createNewMatrixCursor() {
        return new MatrixCursor(new String[]{EnrollmentStatusManager.COLUMN_ENROLLMENT_STATUS});
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        throw new RuntimeException("Not supported.");
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        throw new RuntimeException("Not supported.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        throw new RuntimeException("Not supported.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.mSharedPreferences = getContext().getSharedPreferences(SHARED_PREF_NAME, 0);
        URI_MATCHER.addURI(getContext().getString(EnrollmentStatusManager.AUTHORITY_RES_ID), "file", 1);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (URI_MATCHER.match(uri) == 1) {
            MatrixCursor createNewMatrixCursor = createNewMatrixCursor();
            createNewMatrixCursor.newRow().add(EnrollmentStatusManager.COLUMN_ENROLLMENT_STATUS, Integer.valueOf(readUvrEnrollmentStatus()));
            return createNewMatrixCursor;
        }
        Log.i(TAG, "URI doesn't match. Uri: " + uri.toString());
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (URI_MATCHER.match(uri) != 1) {
            Log.i(TAG, "URI doesn't match. Uri: " + uri.toString());
            return 0;
        }
        if (contentValues == null || !contentValues.containsKey(EnrollmentStatusManager.COLUMN_ENROLLMENT_STATUS)) {
            Log.w(TAG, "no expected values.");
            return 0;
        }
        this.mSharedPreferences.edit().putInt(KEY_ENROLLED_STATUS, contentValues.getAsInteger(EnrollmentStatusManager.COLUMN_ENROLLMENT_STATUS).intValue()).apply();
        return 1;
    }

    public UvrEnrollmentStatusProvider() {
    }
}
