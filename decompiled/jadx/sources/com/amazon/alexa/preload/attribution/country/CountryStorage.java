package com.amazon.alexa.preload.attribution.country;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.preload.attribution.country.providers.CountryProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
class CountryStorage {

    @VisibleForTesting
    static final String SHARED_PREFS_COUNTRY_KEY = "Country";

    @VisibleForTesting
    static final String SHARED_PREFS_SOURCE_ID = "SourceId";
    private final SharedPreferences mSharedPreferences;

    public CountryStorage(@NonNull SharedPreferences sharedPreferences) {
        this.mSharedPreferences = sharedPreferences;
    }

    public String getCountry() {
        return this.mSharedPreferences.getString(SHARED_PREFS_COUNTRY_KEY, "");
    }

    public String getSourceId() {
        return this.mSharedPreferences.getString(SHARED_PREFS_SOURCE_ID, "");
    }

    public void saveCountry(@NonNull CountryProvider countryProvider) {
        this.mSharedPreferences.edit().putString(SHARED_PREFS_COUNTRY_KEY, countryProvider.getCountryCode()).putString(SHARED_PREFS_SOURCE_ID, countryProvider.getSourceId()).apply();
    }
}
