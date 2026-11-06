package chip.platform;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class PreferencesConfigurationManager implements ConfigurationManager {
    private SharedPreferences preferences;
    private final String TAG = "KeyValueStoreManager";
    private final String PREFERENCE_FILE_KEY = "chip.platform.ConfigurationManager";

    public PreferencesConfigurationManager(Context context) {
        this.preferences = context.getSharedPreferences("chip.platform.ConfigurationManager", 0);
        try {
            String key = getKey(ConfigurationManager.kConfigNamespace_ChipFactory, ConfigurationManager.kConfigKey_UniqueId);
            if (this.preferences.contains(key)) {
                return;
            }
            this.preferences.edit().putString(key, UUID.randomUUID().toString().replaceAll("-", "")).apply();
        } catch (AndroidChipPlatformException e) {
            e.printStackTrace();
        }
    }

    private String getKey(String str, String str2) throws AndroidChipPlatformException {
        if (str != null && str2 != null) {
            return a$$ExternalSyntheticOutline0.m$1(str, ":", str2);
        }
        if (str == null || str2 != null) {
            throw new AndroidChipPlatformException();
        }
        return str.concat(":");
    }

    @Override // chip.platform.ConfigurationManager
    public void clearConfigValue(String str, String str2) throws AndroidChipPlatformException {
        if (str != null && str2 != null) {
            this.preferences.edit().remove(getKey(str, str2)).apply();
            return;
        }
        if (str == null || str2 != null) {
            if (str == null && str2 == null) {
                this.preferences.edit().clear().apply();
                return;
            }
            return;
        }
        String key = getKey(str, null);
        SharedPreferences.Editor edit = this.preferences.edit();
        Iterator<Map.Entry<String, ?>> it2 = this.preferences.getAll().entrySet().iterator();
        while (it2.hasNext()) {
            String key2 = it2.next().getKey();
            if (key2.startsWith(key)) {
                edit.remove(key2);
            }
        }
        edit.apply();
    }

    @Override // chip.platform.ConfigurationManager
    public boolean configValueExists(String str, String str2) throws AndroidChipPlatformException {
        return this.preferences.contains(getKey(str, str2));
    }

    @Override // chip.platform.ConfigurationManager
    public byte[] readConfigValueBin(String str, String str2) throws AndroidChipPlatformException {
        String key = getKey(str, str2);
        if (!this.preferences.contains(key)) {
            throw new AndroidChipPlatformException();
        }
        return Base64.getDecoder().decode(this.preferences.getString(key, null));
    }

    @Override // chip.platform.ConfigurationManager
    public long readConfigValueLong(String str, String str2) throws AndroidChipPlatformException {
        String key;
        key = getKey(str, str2);
        key.getClass();
        switch (key) {
            case "chip-factory:hardware-ver":
                return 1L;
            case "chip-factory:product-id":
                return 32771L;
            case "chip-factory:software-version":
                return 1L;
            default:
                if (this.preferences.contains(key)) {
                    return this.preferences.getLong(key, Long.MAX_VALUE);
                }
                throw new AndroidChipPlatformException();
        }
    }

    @Override // chip.platform.ConfigurationManager
    public String readConfigValueStr(String str, String str2) throws AndroidChipPlatformException {
        String key;
        key = getKey(str, str2);
        key.getClass();
        switch (key) {
            case "chip-factory:product-url":
                return "https://buildwithmatter.com/";
            case "chip-factory:mfg-date":
                return "2021-12-06";
            case "chip-factory:product-name":
                return "TEST_ANDROID_PRODUCT";
            case "chip-factory:part-number":
                return "TEST_ANDROID_PRODUCT_BLUE";
            case "chip-factory:hardware-ver-str":
                return "TEST_ANDROID_VERSION";
            case "chip-factory:serial-num":
                return "TEST_ANDROID_SN";
            case "chip-factory:product-label":
                return "X10";
            case "chip-factory:software-version-str":
                return "prerelease(android)";
            default:
                if (this.preferences.contains(key)) {
                    return this.preferences.getString(key, null);
                }
                throw new AndroidChipPlatformException();
        }
    }

    @Override // chip.platform.ConfigurationManager
    public void writeConfigValueBin(String str, String str2, byte[] bArr) throws AndroidChipPlatformException {
        String key = getKey(str, str2);
        if (bArr == null) {
            this.preferences.edit().remove(key).apply();
        } else {
            this.preferences.edit().putString(key, Base64.getEncoder().encodeToString(bArr)).apply();
        }
    }

    @Override // chip.platform.ConfigurationManager
    public void writeConfigValueLong(String str, String str2, long j) throws AndroidChipPlatformException {
        this.preferences.edit().putLong(getKey(str, str2), j).apply();
    }

    @Override // chip.platform.ConfigurationManager
    public void writeConfigValueStr(String str, String str2, String str3) throws AndroidChipPlatformException {
        this.preferences.edit().putString(getKey(str, str2), str3).apply();
    }
}
