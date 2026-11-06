package com.amazon.leaderselection;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.leaderselection.PersistentStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class SharedPreferencePersistentStorage implements PersistentStorage {
    private final Context context;
    private SharedPreferences preferences;
    private final String sharedPreferenceName;

    public SharedPreferencePersistentStorage(Context context, String str) {
        this.context = context;
        this.sharedPreferenceName = str;
    }

    private SharedPreferences getPreferences() {
        if (this.preferences == null) {
            this.preferences = this.context.getSharedPreferences(this.sharedPreferenceName, 0);
        }
        return this.preferences;
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    public boolean contains(@NonNull String str) {
        return getPreferences().contains(str);
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    @SuppressLint({"CommitPrefEdits"})
    public PersistentStorage.Transaction edit() {
        return new PreferencesTransaction(getPreferences().edit());
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    public boolean getBoolean(@NonNull String str) {
        return getPreferences().getBoolean(str, false);
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    public long getLong(@NonNull String str, long j) {
        return getPreferences().getLong(str, j);
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    @Nullable
    public String getString(@NonNull String str) {
        return getPreferences().getString(str, null);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PreferencesTransaction implements PersistentStorage.Transaction {
        private final SharedPreferences.Editor editor;

        public PreferencesTransaction(SharedPreferences.Editor editor) {
            this.editor = editor;
        }

        @Override // com.amazon.leaderselection.PersistentStorage.Transaction
        public void commit() {
            this.editor.apply();
        }

        @Override // com.amazon.leaderselection.PersistentStorage.Transaction
        public PersistentStorage.Transaction remove(@NonNull String str) {
            this.editor.remove(str);
            return this;
        }

        @Override // com.amazon.leaderselection.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, @Nullable String str2) {
            this.editor.putString(str, str2);
            return this;
        }

        @Override // com.amazon.leaderselection.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, boolean z) {
            this.editor.putBoolean(str, z);
            return this;
        }

        @Override // com.amazon.leaderselection.PersistentStorage.Transaction
        public PersistentStorage.Transaction set(@NonNull String str, long j) {
            this.editor.putLong(str, j);
            return this;
        }
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    public boolean getBoolean(@NonNull String str, boolean z) {
        return getPreferences().getBoolean(str, z);
    }

    @Override // com.amazon.leaderselection.PersistentStorage
    @Nullable
    public String getString(@NonNull String str, @Nullable String str2) {
        return getPreferences().getString(str, str2);
    }
}
