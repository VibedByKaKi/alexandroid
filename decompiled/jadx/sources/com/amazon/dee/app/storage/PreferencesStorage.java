package com.amazon.dee.app.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0017J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H\u0016J4\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0016H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/dee/app/storage/PreferencesStorage;", "Lcom/amazon/alexa/protocols/storage/PersistentStorage;", "preferences", "Landroid/content/SharedPreferences;", "serializer", "Lcom/amazon/dee/app/storage/JsonConverter;", "<init>", "(Landroid/content/SharedPreferences;Lcom/amazon/dee/app/storage/JsonConverter;)V", "edit", "Lcom/amazon/alexa/protocols/storage/PersistentStorage$Transaction;", "contains", "", "name", "", "getString", "defaultValue", "getStringSet", "", "getStringMap", "", "getBoolean", "getLong", "", "PreferencesTransaction", "Factory", "storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PreferencesStorage implements PersistentStorage {

    @NotNull
    private final SharedPreferences preferences;

    @NotNull
    private final JsonConverter serializer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/storage/PreferencesStorage$Factory;", "Lcom/amazon/alexa/protocols/storage/PersistentStorage$Factory;", "context", "Landroid/content/Context;", "serializer", "Lcom/amazon/dee/app/storage/JsonConverter;", "<init>", "(Landroid/content/Context;Lcom/amazon/dee/app/storage/JsonConverter;)V", "create", "Lcom/amazon/alexa/protocols/storage/PersistentStorage;", "name", "", "storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Factory implements PersistentStorage.Factory {

        @NotNull
        private final Context context;

        @NotNull
        private final JsonConverter serializer;

        public Factory(@NotNull Context context, @NotNull JsonConverter jsonConverter) {
            context.getClass();
            jsonConverter.getClass();
            this.context = context;
            this.serializer = jsonConverter;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Factory
        @NotNull
        public PersistentStorage create(@NotNull String name) {
            name.getClass();
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(name, 0);
            sharedPreferences.getClass();
            return new PreferencesStorage(sharedPreferences, this.serializer);
        }
    }

    public PreferencesStorage(@NotNull SharedPreferences sharedPreferences, @NotNull JsonConverter jsonConverter) {
        sharedPreferences.getClass();
        jsonConverter.getClass();
        this.preferences = sharedPreferences;
        this.serializer = jsonConverter;
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    public boolean contains(@NotNull String name) {
        name.getClass();
        return this.preferences.contains(name);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    @SuppressLint({"CommitPrefEdits"})
    @NotNull
    public PersistentStorage.Transaction edit() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.getClass();
        return new PreferencesTransaction(edit, this.serializer);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    public boolean getBoolean(@NotNull String name) {
        name.getClass();
        return this.preferences.getBoolean(name, false);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    public long getLong(@NotNull String name, long defaultValue) {
        name.getClass();
        return this.preferences.getLong(name, defaultValue);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    @Nullable
    public String getString(@NotNull String name) {
        name.getClass();
        return this.preferences.getString(name, null);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    @Nullable
    public Map<String, String> getStringMap(@NotNull String name, @Nullable Map<String, String> defaultValue) {
        name.getClass();
        String string = this.preferences.getString(name, null);
        if (string == null || string.length() == 0) {
            return defaultValue;
        }
        Object fromJson = this.serializer.fromJson(string, Map.class);
        fromJson.getClass();
        return (Map) fromJson;
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    @Nullable
    public Set<String> getStringSet(@NotNull String name, @Nullable Set<String> defaultValue) {
        name.getClass();
        return this.preferences.getStringSet(name, defaultValue);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    public boolean getBoolean(@NotNull String name, boolean defaultValue) {
        name.getClass();
        return this.preferences.getBoolean(name, defaultValue);
    }

    @Override // com.amazon.alexa.protocols.storage.PersistentStorage
    @Nullable
    public String getString(@NotNull String name, @Nullable String defaultValue) {
        name.getClass();
        return this.preferences.getString(name, defaultValue);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J!\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0096\u0002J\u0019\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000fH\u0096\u0002J\u0019\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0010H\u0096\u0002J%\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0011H\u0096\u0002J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/dee/app/storage/PreferencesStorage$PreferencesTransaction;", "Lcom/amazon/alexa/protocols/storage/PersistentStorage$Transaction;", "editor", "Landroid/content/SharedPreferences$Editor;", "serializer", "Lcom/amazon/dee/app/storage/JsonConverter;", "<init>", "(Landroid/content/SharedPreferences$Editor;Lcom/amazon/dee/app/storage/JsonConverter;)V", "getEditor$storage", "()Landroid/content/SharedPreferences$Editor;", "set", "name", "", "value", "", "", "", "", BulkOperationType.remove, "commit", "", "storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreferencesTransaction implements PersistentStorage.Transaction {

        @NotNull
        private final SharedPreferences.Editor editor;

        @NotNull
        private final JsonConverter serializer;

        public PreferencesTransaction(@NotNull SharedPreferences.Editor editor, @NotNull JsonConverter jsonConverter) {
            editor.getClass();
            jsonConverter.getClass();
            this.editor = editor;
            this.serializer = jsonConverter;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        public void commit() {
            this.editor.apply();
        }

        @NotNull
        /* renamed from: getEditor$storage, reason: from getter */
        public final SharedPreferences.Editor getEditor() {
            return this.editor;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction remove(@NotNull String name) {
            name.getClass();
            this.editor.remove(name);
            return this;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction set(@NotNull String name, @NotNull Map<String, String> value) {
            name.getClass();
            value.getClass();
            this.editor.putString(name, this.serializer.toJson(value));
            return this;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction set(@NotNull String name, @Nullable Set<String> value) {
            name.getClass();
            this.editor.putStringSet(name, value);
            return this;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction set(@NotNull String name, boolean value) {
            name.getClass();
            this.editor.putBoolean(name, value);
            return this;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction set(@NotNull String name, long value) {
            name.getClass();
            this.editor.putLong(name, value);
            return this;
        }

        @Override // com.amazon.alexa.protocols.storage.PersistentStorage.Transaction
        @NotNull
        public PersistentStorage.Transaction set(@NotNull String name, @Nullable String value) {
            name.getClass();
            this.editor.putString(name, value);
            return this;
        }
    }
}
