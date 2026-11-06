package com.amazon.alexa.voice.locale;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UserLocalePreference implements LocalePreference {

    @VisibleForTesting
    static final String CURRENT_ALEXA_LOCALE_KEY = "current_alexa_locale";
    private static final String SEPARATOR = ",";
    private static final String TAG = "UserLocalePreference";

    @VisibleForTesting
    static final String USER_LOCALE_UPDATE_PREFS_FILE_NAME = "user_locale_prefs";

    @VisibleForTesting
    static final String USER_LOCALE_UPDATE_PREFS_KEY = "locale_updated_by_user";
    private final SharedPreferences sharedPreferences;

    public UserLocalePreference(@NotNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(USER_LOCALE_UPDATE_PREFS_FILE_NAME, 0);
    }

    private List<Locale> getLocaleFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] split = str.split(",");
            for (int i = 0; i < split.length; i++) {
                if (TextUtils.isEmpty(split[i])) {
                    Log.w(TAG, "getLocaleFromString: locale tag at index " + i + " in the list is null or empty!");
                } else {
                    arrayList.add(Locale.forLanguageTag(split[i]));
                }
            }
        }
        return arrayList;
    }

    private String getStringFromLocales(List<Locale> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                stringBuffer.append(list.get(i).toLanguageTag());
                if (i < list.size() - 1) {
                    stringBuffer.append(",");
                }
            } else {
                Log.w(TAG, "getStringFromLocales: locale at index " + i + " is null");
            }
        }
        return stringBuffer.toString();
    }

    @VisibleForTesting
    public void clearCurrentAlexaLocale() {
        this.sharedPreferences.edit().remove(CURRENT_ALEXA_LOCALE_KEY).apply();
    }

    @Override // com.amazon.alexa.voice.locale.LocalePreference
    public void clearData() {
        clearUpdatedByUserFlag();
        clearCurrentAlexaLocale();
    }

    @VisibleForTesting
    public void clearUpdatedByUserFlag() {
        this.sharedPreferences.edit().remove(USER_LOCALE_UPDATE_PREFS_KEY).apply();
    }

    @Override // com.amazon.alexa.voice.locale.LocalePreference
    public List<Locale> fetchCurrentLocale() {
        String string = this.sharedPreferences.getString(CURRENT_ALEXA_LOCALE_KEY, null);
        if (!TextUtils.isEmpty(string)) {
            return getLocaleFromString(string);
        }
        Log.w(TAG, "fetchCurrentLocale: locale tag not found in shared pref!");
        return new ArrayList();
    }

    @Override // com.amazon.alexa.voice.locale.LocalePreference
    public void settingUpdatedByUser(boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, USER_LOCALE_UPDATE_PREFS_KEY, z);
    }

    @Override // com.amazon.alexa.voice.locale.LocalePreference
    public void storeCurrentLocale(@NotNull List<Locale> list) {
        String stringFromLocales = getStringFromLocales(list);
        if (TextUtils.isEmpty(stringFromLocales)) {
            Log.w(TAG, "storeCurrentLocale: locale tag not stored in shared pref!");
        } else {
            this.sharedPreferences.edit().putString(CURRENT_ALEXA_LOCALE_KEY, stringFromLocales).apply();
        }
    }

    @Override // com.amazon.alexa.voice.locale.LocalePreference
    public boolean wasUpdatedByUser() {
        return this.sharedPreferences.getBoolean(USER_LOCALE_UPDATE_PREFS_KEY, false);
    }
}
