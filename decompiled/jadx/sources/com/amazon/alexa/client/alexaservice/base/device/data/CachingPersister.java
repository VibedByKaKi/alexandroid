package com.amazon.alexa.client.alexaservice.base.device.data;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKey;
import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import dagger.Lazy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CachingPersister<Key extends PersisterKey, Value> {
    private static final String NULL_VALUE = "null";
    private static final String TAG = "CachingPersister";
    private final PersisterKeyFactory<Key> persisterKeyFactory;
    private final Lazy<PersistedDataLoader> store;
    private final Class<Value> type;
    private final Map<Key, Value> defaultValues = new HashMap();
    private final Map<Key, Value> cachedValues = new HashMap();
    private final Set<Key> disabledKeys = new HashSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LoadAllLoader implements PersistedDataLoader.LoadCallback {
        private static final long LOAD_TIMEOUT_MS = 100;
        private final ConditionVariable loadVariable = new ConditionVariable();
        private final Map<Key, Value> all = new HashMap();

        public LoadAllLoader() {
        }

        public Map<Key, Value> get() {
            if (!this.loadVariable.block(100L)) {
                Log.e(CachingPersister.TAG, "loading of all keys timed out");
            }
            return this.all;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader.LoadCallback
        public void onLoadData(PersistentStorage persistentStorage, Gson gson) {
            synchronized (CachingPersister.this) {
                try {
                    Set<String> keys = persistentStorage.getKeys();
                    keys.remove("timestamp");
                    Iterator<String> it2 = keys.iterator();
                    while (it2.hasNext()) {
                        PersisterKey persisterKey = (PersisterKey) CachingPersister.this.persisterKeyFactory.create(it2.next());
                        this.all.put(persisterKey, CachingPersister.this.load(persistentStorage, gson, persisterKey));
                    }
                    for (PersisterKey persisterKey2 : CachingPersister.this.cachedValues.keySet()) {
                        if (!this.all.containsKey(persisterKey2)) {
                            this.all.put(persisterKey2, CachingPersister.this.cachedValues.get(persisterKey2));
                        }
                    }
                    for (PersisterKey persisterKey3 : CachingPersister.this.defaultValues.keySet()) {
                        if (!this.all.containsKey(persisterKey3)) {
                            this.all.put(persisterKey3, CachingPersister.this.defaultValues.get(persisterKey3));
                        }
                    }
                    this.loadVariable.open();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Loader implements PersistedDataLoader.LoadCallback {
        private static final long LOAD_TIMEOUT_MS = 100;
        private final Key key;
        private final ConditionVariable loadVariable = new ConditionVariable();
        private Value value;

        public Loader(Key key) {
            this.key = key;
        }

        public Value get() {
            if (!this.loadVariable.block(100L)) {
                Log.e(CachingPersister.TAG, "loading of " + this.key.name() + " timed out");
            }
            return this.value;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader.LoadCallback
        public void onLoadData(PersistentStorage persistentStorage, Gson gson) {
            synchronized (CachingPersister.this) {
                this.value = (Value) CachingPersister.this.load(persistentStorage, gson, this.key);
                this.loadVariable.open();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PersisterKey {
        String name();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PersisterKeyFactory<Key> {
        Key create(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Saver implements PersistedDataLoader.SaveCallback {
        private final Key key;
        private final Value value;

        public Saver(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader.SaveCallback
        public void onSaveData(PersistentStorage.Transaction transaction, Gson gson) {
            synchronized (CachingPersister.this) {
                CachingPersister.this.save(transaction, gson, this.key, this.value);
            }
        }
    }

    @Inject
    public CachingPersister(Class<Value> cls, PersisterKeyFactory<Key> persisterKeyFactory, Lazy<PersistedDataLoader> lazy) {
        this.type = cls;
        this.persisterKeyFactory = persisterKeyFactory;
        this.store = lazy;
    }

    private boolean isLoadingRequired(Key key) {
        return !this.cachedValues.containsKey(key) || this.cachedValues.get(key) == null || this.cachedValues.get(key).equals(this.defaultValues.get(key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Value load(PersistentStorage persistentStorage, Gson gson, Key key) {
        if (isLoadingRequired(key)) {
            String string = persistentStorage.getString(key.name());
            if (string == null || "null".equals(string)) {
                this.cachedValues.put(key, this.defaultValues.get(key));
            } else {
                try {
                    this.cachedValues.put(key, gson.fromJson(string, (Class) this.type));
                } catch (JsonSyntaxException | NullPointerException e) {
                    Log.e(TAG, "Failed to restore state ", e);
                    persistentStorage.edit().remove(key.name()).commitAsynchronously();
                }
            }
        }
        return this.cachedValues.get(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save(PersistentStorage.Transaction transaction, Gson gson, Key key, Value value) {
        this.cachedValues.put(key, value);
        if (this.disabledKeys.contains(key)) {
            return;
        }
        transaction.set(key.name(), gson.toJson(value));
    }

    public synchronized void addDefault(Key key, Value value) {
        this.defaultValues.put(key, value);
    }

    public synchronized void cacheAllAsync() {
        this.store.get().loadAsync(new LoadAllLoader());
    }

    public synchronized void cacheAsync(Key key) {
        this.store.get().loadAsync(new Loader(key));
    }

    public void clear(Key key) {
        this.cachedValues.remove(key);
        this.defaultValues.remove(key);
        this.store.get().clear(key.name());
    }

    public void clearAll() {
        this.cachedValues.clear();
        this.defaultValues.clear();
        this.store.get().clearData();
    }

    public synchronized void disablePersistingFor(Key key) {
        this.disabledKeys.add(key);
    }

    public synchronized void enablePersistingFor(Key key) {
        this.disabledKeys.remove(key);
    }

    public synchronized Map<Key, Value> loadAll() {
        LoadAllLoader loadAllLoader;
        loadAllLoader = new LoadAllLoader();
        this.store.get().load(loadAllLoader);
        return loadAllLoader.get();
    }

    public synchronized void removeDefault(Key key) {
        this.defaultValues.remove(key);
    }

    public synchronized void saveAsync(Key key, Value value) {
        this.store.get().saveAsync(new Saver(key, value));
    }

    public synchronized void save(Key key, Value value) {
        this.store.get().save(new Saver(key, value));
    }

    @Nullable
    public synchronized Value load(Key key) {
        Loader loader;
        loader = new Loader(key);
        this.store.get().load(loader);
        return (Value) loader.get();
    }
}
