package com.amazon.alexa.photos.uploadV2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.photos.PhotosSource;
import com.amazon.photos.autosave.model.MediaType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PhotosAutosavePrefs {
    static final String KEY_AUTOSAVE_SETTING = "KEY_AUTOSAVE_SETTING";
    static final String KEY_AUTOSAVE_SETTING_V3 = "KEY_AUTOSAVE_SETTING_V3";

    @NonNull
    private final Context context;
    private SharedPreferences sharedPreferences;
    private static final String TAG = "PhotosAutosavePrefs";
    static final String AUTOSAVE_PREFS_ENDPOINT = BitVector$$ExternalSyntheticOutline0.m(TAG, "_autosavePrefsEndpoint");

    public PhotosAutosavePrefs(@NonNull Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.context.getApplicationContext().getSharedPreferences(AUTOSAVE_PREFS_ENDPOINT, 0);
        this.sharedPreferences = sharedPreferences2;
        return sharedPreferences2;
    }

    public void clear() {
        getSharedPreferences().edit().clear().apply();
    }

    public boolean containsV2(PhotosSource photosSource, MediaType mediaType) {
        return getSharedPreferences().contains("KEY_AUTOSAVE_SETTING_" + photosSource.name() + "_" + mediaType.name());
    }

    public boolean containsV3(PhotosSource photosSource) {
        return getSharedPreferences().contains("KEY_AUTOSAVE_SETTING_V3_" + photosSource.name());
    }

    public boolean getPhotosAutosaveV2(PhotosSource photosSource, MediaType mediaType) {
        return getSharedPreferences().getBoolean("KEY_AUTOSAVE_SETTING_" + photosSource.name() + "_" + mediaType.name(), false);
    }

    public boolean getPhotosSourceAutosaveV3(PhotosSource photosSource) {
        return getSharedPreferences().getBoolean("KEY_AUTOSAVE_SETTING_V3_" + photosSource.name(), false);
    }

    public void setPhotosSourceAutosaveV3(PhotosSource photosSource, boolean z) {
        getSharedPreferences().edit().putBoolean("KEY_AUTOSAVE_SETTING_V3_" + photosSource.name(), z).apply();
    }
}
