package com.amazon.alexa.client.alexaservice.base.system;

import android.net.Uri;
import android.util.Log;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaServiceSettingsStore {
    private static final String EMPTY_STRING = "";
    private static final List<String> EMPTY_STRING_LIST = Collections.EMPTY_LIST;
    private static final String TAG = "AlexaServiceSettingsStore";
    private final Gson gson;
    private final Lazy<PersistentStorage> persistentStorage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AlexaServiceSettingsStoreKey {
        ENDPOINT(MetricKeys.META_ENDPOINT),
        TIMEZONE("timezone"),
        CAPABILITIES_ENDPOINT("capabilitiesEndpoint"),
        LAST_USER_ACTIVITY("lastUserActivity"),
        LOCALE("locale"),
        LOCALES("locales"),
        REQUESTED_LOCALES("requestedLocales"),
        IS_LOCALE_DEVICE_DEFAULT("isLocaleDeviceDefault"),
        SUPPORTS_MOBILE_DOWNCHANNEL("supportsMobileDownchannel"),
        VERSION_NAME(ModelTransformer.KEY_FIRMWARE_VERSION_NAME),
        REGION_NAME("regionName"),
        PERSON_ID("personId"),
        IS_CHILD_PROFILE("isChildProfile"),
        FIRST_NAME("firstName");

        private final String key;

        AlexaServiceSettingsStoreKey(String str) {
            this.key = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    @Inject
    public AlexaServiceSettingsStore(@Named("AlexaServiceSettings") Lazy<PersistentStorage> lazy, Gson gson) {
        this.persistentStorage = lazy;
        this.gson = gson;
    }

    private boolean contains(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey) {
        return this.persistentStorage.get().contains(alexaServiceSettingsStoreKey.toString());
    }

    private boolean getBoolean(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, boolean z) {
        return this.persistentStorage.get().getBoolean(alexaServiceSettingsStoreKey.toString(), z);
    }

    private long getLong(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, long j) {
        return this.persistentStorage.get().getLong(alexaServiceSettingsStoreKey.toString(), j);
    }

    private String getString(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, String str) {
        return this.persistentStorage.get().getString(alexaServiceSettingsStoreKey.toString(), str);
    }

    private void resetValue(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey) {
        this.persistentStorage.get().edit().remove(alexaServiceSettingsStoreKey.toString()).commitAsynchronously();
    }

    private void setBoolean(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, boolean z) {
        this.persistentStorage.get().edit().set(alexaServiceSettingsStoreKey.toString(), z).commitAsynchronously();
    }

    private void setValue(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, String str) {
        this.persistentStorage.get().edit().set(alexaServiceSettingsStoreKey.toString(), str).commitAsynchronously();
    }

    @Nullable
    public synchronized AlexaLocale getAlexaLocale() {
        try {
            boolean z = getBoolean(AlexaServiceSettingsStoreKey.IS_LOCALE_DEVICE_DEFAULT, false);
            AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey = AlexaServiceSettingsStoreKey.LOCALES;
            if (!contains(alexaServiceSettingsStoreKey)) {
                AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey2 = AlexaServiceSettingsStoreKey.LOCALE;
                if (!contains(alexaServiceSettingsStoreKey2)) {
                    return null;
                }
                String string = getString(alexaServiceSettingsStoreKey2, "");
                Log.i(TAG, "getAlexaLocale: " + string);
                return AlexaLocale.create(Collections.singletonList(Locale.forLanguageTag(string)), z);
            }
            List<String> stringList = getStringList(alexaServiceSettingsStoreKey, EMPTY_STRING_LIST);
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = stringList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Locale.forLanguageTag(it2.next()));
            }
            Log.i(TAG, "getAlexaLocale: " + arrayList.toString());
            return AlexaLocale.create(arrayList, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Uri getCapabilitiesEndpoint() {
        return Uri.parse(getString(AlexaServiceSettingsStoreKey.CAPABILITIES_ENDPOINT, ""));
    }

    public synchronized Uri getEndpoint() {
        return Uri.parse(getString(AlexaServiceSettingsStoreKey.ENDPOINT, ""));
    }

    public synchronized String getFirstName() {
        return getString(AlexaServiceSettingsStoreKey.FIRST_NAME, "");
    }

    public synchronized String getPersonId() {
        return getString(AlexaServiceSettingsStoreKey.PERSON_ID, "");
    }

    public synchronized String getRegionName() {
        return getString(AlexaServiceSettingsStoreKey.REGION_NAME, "");
    }

    @Nullable
    public synchronized List<Locale> getRequestedLocales() {
        try {
            AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey = AlexaServiceSettingsStoreKey.REQUESTED_LOCALES;
            if (!contains(alexaServiceSettingsStoreKey)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = getStringList(alexaServiceSettingsStoreKey, EMPTY_STRING_LIST).iterator();
            while (it2.hasNext()) {
                arrayList.add(Locale.forLanguageTag(it2.next()));
            }
            return arrayList.isEmpty() ? null : arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<String> getStringList(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, List<String> list) {
        try {
            List<String> list2 = (List) this.gson.fromJson(getString(alexaServiceSettingsStoreKey, list.toString()), new TypeToken<ArrayList<String>>() { // from class: com.amazon.alexa.client.alexaservice.base.system.AlexaServiceSettingsStore.1
            }.getType());
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    return list2;
                }
            }
            return list;
        } catch (JsonParseException e) {
            Log.e(TAG, "Parsing error encountered while deserializing " + alexaServiceSettingsStoreKey, e);
            return list;
        }
    }

    public synchronized TimeZone getTimeZone() {
        String string = getString(AlexaServiceSettingsStoreKey.TIMEZONE, "");
        if (string.isEmpty()) {
            return null;
        }
        return TimeZone.getTimeZone(string);
    }

    public synchronized String getVersionName() {
        return getString(AlexaServiceSettingsStoreKey.VERSION_NAME, "");
    }

    public synchronized boolean hasCapabilitiesEndpoint() {
        return contains(AlexaServiceSettingsStoreKey.CAPABILITIES_ENDPOINT);
    }

    public synchronized boolean hasEndpoint() {
        return contains(AlexaServiceSettingsStoreKey.ENDPOINT);
    }

    public synchronized boolean hasLocale() {
        boolean z;
        if (!contains(AlexaServiceSettingsStoreKey.LOCALES)) {
            z = contains(AlexaServiceSettingsStoreKey.LOCALE);
        }
        return z;
    }

    public synchronized boolean hasTimeZone() {
        return contains(AlexaServiceSettingsStoreKey.TIMEZONE);
    }

    public synchronized boolean isChildProfile() {
        return getBoolean(AlexaServiceSettingsStoreKey.IS_CHILD_PROFILE, false);
    }

    public synchronized void resetLocale() {
        resetValue(AlexaServiceSettingsStoreKey.LOCALE);
        resetValue(AlexaServiceSettingsStoreKey.LOCALES);
        resetValue(AlexaServiceSettingsStoreKey.IS_LOCALE_DEVICE_DEFAULT);
        resetRequestedLocales();
    }

    public synchronized void resetRequestedLocales() {
        resetValue(AlexaServiceSettingsStoreKey.REQUESTED_LOCALES);
    }

    public synchronized void resetTimeZone() {
        setValue(AlexaServiceSettingsStoreKey.TIMEZONE, "");
    }

    public synchronized void resetUserProfile() {
        resetValue(AlexaServiceSettingsStoreKey.PERSON_ID);
        resetValue(AlexaServiceSettingsStoreKey.IS_CHILD_PROFILE);
        resetValue(AlexaServiceSettingsStoreKey.FIRST_NAME);
    }

    public synchronized void setAlexaLocale(AlexaLocale alexaLocale) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            if (alexaLocale != null) {
                z = alexaLocale.isDeviceDefault();
                Iterator<Locale> it2 = alexaLocale.getLocales().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toLanguageTag());
                }
            } else {
                z = false;
            }
            Log.i(TAG, "setAlexaLocale to: " + arrayList.toString());
            setStringList(AlexaServiceSettingsStoreKey.LOCALES, arrayList);
            setBoolean(AlexaServiceSettingsStoreKey.IS_LOCALE_DEVICE_DEFAULT, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setCapabilitiesEndpoint(Uri uri) {
        setValue(AlexaServiceSettingsStoreKey.CAPABILITIES_ENDPOINT, uri.toString());
    }

    public synchronized void setEndpoint(Uri uri) {
        setValue(AlexaServiceSettingsStoreKey.ENDPOINT, uri.toString());
    }

    public synchronized void setFirstName(@Nullable String str) {
        if (str == null) {
            resetValue(AlexaServiceSettingsStoreKey.FIRST_NAME);
        } else {
            setValue(AlexaServiceSettingsStoreKey.FIRST_NAME, str);
        }
    }

    public synchronized void setIsChildProfile(boolean z) {
        setBoolean(AlexaServiceSettingsStoreKey.IS_CHILD_PROFILE, z);
    }

    public synchronized void setPersonId(String str) {
        setValue(AlexaServiceSettingsStoreKey.PERSON_ID, str);
    }

    public synchronized void setRegionName(String str) {
        setValue(AlexaServiceSettingsStoreKey.REGION_NAME, str);
    }

    public synchronized void setRequestedLocales(List<Locale> list) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<Locale> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toLanguageTag());
            }
            setStringList(AlexaServiceSettingsStoreKey.REQUESTED_LOCALES, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setStringList(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, List<String> list) {
        this.persistentStorage.get().edit().set(alexaServiceSettingsStoreKey.toString(), this.gson.toJson(list)).commitAsynchronously();
    }

    public synchronized void setTimeZone(TimeZone timeZone) {
        setValue(AlexaServiceSettingsStoreKey.TIMEZONE, timeZone.getID());
    }

    public synchronized void setVersionName(String str) {
        setValue(AlexaServiceSettingsStoreKey.VERSION_NAME, str);
    }

    private void setValue(AlexaServiceSettingsStoreKey alexaServiceSettingsStoreKey, long j) {
        this.persistentStorage.get().edit().set(alexaServiceSettingsStoreKey.toString(), j).commitAsynchronously();
    }
}
