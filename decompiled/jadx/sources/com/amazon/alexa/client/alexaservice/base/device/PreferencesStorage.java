package com.amazon.alexa.client.alexaservice.base.device;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.device.PersistentStorage;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PreferencesStorage implements PersistentStorage {
    private final boolean isUserSpecific;
    private final SharedPreferences preferences;

    public PreferencesStorage(SharedPreferences sharedPreferences, boolean z) {
        this.preferences = sharedPreferences;
        this.isUserSpecific = z;
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public boolean contains(@NonNull String str) {
        return this.preferences.contains(str);
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    @SuppressLint({"CommitPrefEdits"})
    public PersistentStorage.Transaction edit() {
        return new PreferencesTransaction(this.preferences.edit());
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public Map<String, ?> getAll() {
        return this.preferences.getAll();
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public boolean getBoolean(@NonNull String str) {
        return this.preferences.getBoolean(str, false);
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public Set<String> getKeys() {
        return getAll().keySet();
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public long getLong(@NonNull String str, long j) {
        return this.preferences.getLong(str, j);
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    @Nullable
    public String getString(@NonNull String str) {
        return this.preferences.getString(str, null);
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public boolean isUserSpecific() {
        return this.isUserSpecific;
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public boolean removeAll() {
        edit().clear().commitAsynchronously();
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PreferencesTransaction implements PersistentStorage.Transaction {
        private final SharedPreferences.Editor editor;

        public PreferencesTransaction(SharedPreferences.Editor editor) {
            this.editor = editor;
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public PersistentStorage.Transaction clear() {
            this.editor.clear();
            return this;
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public void commitAsynchronously() {
            this.editor.apply();
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public void commitSynchronously() {
            this.editor.commit();
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public PersistentStorage.Transaction remove(@NonNull String str) {
            this.editor.remove(str);
            return this;
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, @Nullable String str2) {
            this.editor.putString(str, str2);
            return this;
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, boolean z) {
            this.editor.putBoolean(str, z);
            return this;
        }

        @Override // com.amazon.alexa.client.core.device.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, long j) {
            this.editor.putLong(str, j);
            return this;
        }
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    public boolean getBoolean(@NonNull String str, boolean z) {
        return this.preferences.getBoolean(str, z);
    }

    @Override // com.amazon.alexa.client.core.device.PersistentStorage
    @Nullable
    public String getString(@NonNull String str, @Nullable String str2) {
        return this.preferences.getString(str, str2);
    }
}
