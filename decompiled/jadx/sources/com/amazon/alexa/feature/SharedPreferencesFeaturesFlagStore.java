package com.amazon.alexa.feature;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SharedPreferencesFeaturesFlagStore implements FeatureFlagStore {

    @VisibleForTesting
    static final String COLUMN_FEATURE = "feature";

    @VisibleForTesting
    static final String COLUMN_TREATMENT = "treatment";

    @VisibleForTesting
    static final String FEATURE_SELECTION = "feature = ?";
    private static final String TAG = "SharedPreferencesFeaturesFlagStore";
    private final SharedPreferences sharedPreferences;

    @VisibleForTesting
    static final String COLUMN_IS_ENABLED = "isEnabled";

    @VisibleForTesting
    static final String[] COLUMNS = {"feature", COLUMN_IS_ENABLED, "treatment"};

    public SharedPreferencesFeaturesFlagStore(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.amazon.alexa.feature.FeatureFlagStore
    public int bulkInsert(@NonNull Uri uri, @Nullable ContentValues[] contentValuesArr) {
        int i;
        String asString;
        if (contentValuesArr == null) {
            return 0;
        }
        synchronized (this.sharedPreferences) {
            try {
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                i = 0;
                for (ContentValues contentValues : contentValuesArr) {
                    if (contentValues.containsKey(COLUMN_IS_ENABLED) && contentValues.containsKey("feature")) {
                        String asString2 = contentValues.getAsString("feature");
                        edit.putBoolean(asString2, contentValues.getAsBoolean(COLUMN_IS_ENABLED).booleanValue());
                        if (contentValues.containsKey("treatment") && (asString = contentValues.getAsString("treatment")) != null) {
                            edit.putString(asString2 + "_treatment", asString);
                        }
                        i++;
                    } else {
                        Log.e(TAG, "Insertion failed due to wrong arguments: " + contentValues);
                    }
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // com.amazon.alexa.feature.FeatureFlagStore
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        int i;
        synchronized (this.sharedPreferences) {
            try {
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                if (str == null) {
                    i = this.sharedPreferences.getAll().size();
                    edit.clear();
                } else {
                    int i2 = 0;
                    if (FEATURE_SELECTION.equals(str) && strArr != null) {
                        for (String str2 : strArr) {
                            if (this.sharedPreferences.contains(str2)) {
                                edit.remove(str2);
                                edit.remove(str2 + "_treatment");
                                i2++;
                            }
                        }
                    }
                    i = i2;
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // com.amazon.alexa.feature.FeatureFlagStore
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        String asString;
        if (contentValues == null) {
            return null;
        }
        if (!contentValues.containsKey(COLUMN_IS_ENABLED) || !contentValues.containsKey("feature")) {
            Log.e(TAG, "Insertion failed due to wrong arguments.");
            return uri;
        }
        synchronized (this.sharedPreferences) {
            try {
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                String asString2 = contentValues.getAsString("feature");
                edit.putBoolean(asString2, contentValues.getAsBoolean(COLUMN_IS_ENABLED).booleanValue());
                if (contentValues.containsKey("treatment") && (asString = contentValues.getAsString("treatment")) != null) {
                    edit.putString(asString2 + "_treatment", asString);
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        return uri;
    }

    @Override // com.amazon.alexa.feature.FeatureFlagStore
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(COLUMNS);
        synchronized (this.sharedPreferences) {
            try {
                if (str == null) {
                    for (Map.Entry<String, ?> entry : this.sharedPreferences.getAll().entrySet()) {
                        String key = entry.getKey();
                        if (!key.endsWith("_treatment")) {
                            Boolean bool = (Boolean) entry.getValue();
                            bool.booleanValue();
                            matrixCursor.newRow().add("feature", key).add(COLUMN_IS_ENABLED, bool).add("treatment", this.sharedPreferences.getString(key + "_treatment", null));
                        }
                    }
                } else if (FEATURE_SELECTION.equals(str) && strArr2 != null) {
                    for (String str3 : strArr2) {
                        if (this.sharedPreferences.contains(str3)) {
                            matrixCursor.newRow().add("feature", str3).add(COLUMN_IS_ENABLED, Boolean.valueOf(this.sharedPreferences.getBoolean(str3, false))).add("treatment", this.sharedPreferences.getString(str3 + "_treatment", null));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return matrixCursor;
    }

    @Override // com.amazon.alexa.feature.FeatureFlagStore
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (strArr == null || strArr.length == 0 || contentValues == null || !contentValues.containsKey(COLUMN_IS_ENABLED) || !FEATURE_SELECTION.equals(str)) {
            return 0;
        }
        synchronized (this.sharedPreferences) {
            try {
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                for (String str2 : strArr) {
                    edit.putBoolean(str2, contentValues.getAsBoolean(COLUMN_IS_ENABLED).booleanValue());
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr.length;
    }
}
