package chip.platform;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class PreferencesKeyValueStoreManager implements KeyValueStoreManager {
    private SharedPreferences preferences;
    private final String TAG = "KeyValueStoreManager";
    private final String PREFERENCE_FILE_KEY = "chip.platform.KeyValueStore";

    public PreferencesKeyValueStoreManager(Context context) {
        this.preferences = context.getSharedPreferences("chip.platform.KeyValueStore", 0);
    }

    @Override // chip.platform.KeyValueStoreManager
    public void delete(String str) {
        this.preferences.edit().remove(str).apply();
    }

    @Override // chip.platform.KeyValueStoreManager
    public String get(String str) {
        return this.preferences.getString(str, null);
    }

    @Override // chip.platform.KeyValueStoreManager
    public void set(String str, String str2) {
        this.preferences.edit().putString(str, str2).apply();
    }
}
