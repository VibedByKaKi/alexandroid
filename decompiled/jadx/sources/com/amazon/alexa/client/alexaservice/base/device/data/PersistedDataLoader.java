package com.amazon.alexa.client.alexaservice.base.device.data;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import com.google.gson.Gson;
import dagger.Lazy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersistedDataLoader {
    private static final long LONG_TIMEOUT_SECONDS = 10;
    private static final String SUFFIX_EXECUTOR_NAME = "_data_loader";
    private static final String TAG = "PersistedDataLoader";

    @VisibleForTesting
    static final String TIMESTAMP_KEY = "timestamp";
    private final ExecutorService executorService;
    private final long expirationTimeMs;
    private final Gson gson;
    private Future<?> loadAsyncFuture;
    private final String loaderType;
    private final boolean shouldExpire;
    private final Lazy<PersistentStorage> storage;
    private final TimeProvider timeProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LoadCallback {
        void onLoadData(PersistentStorage persistentStorage, Gson gson);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SaveCallback {
        void onSaveData(PersistentStorage.Transaction transaction, Gson gson);
    }

    public PersistedDataLoader(String str, long j, Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        this(str, j, true, lazy, ManagedExecutorFactory.newSingleThreadCachedThreadPool(str + SUFFIX_EXECUTOR_NAME), timeProvider, gson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSync(LoadCallback loadCallback) {
        long j = this.storage.get().getLong("timestamp", 0L);
        if (!this.shouldExpire || this.timeProvider.currentTimeMillis() - j < this.expirationTimeMs) {
            loadCallback.onLoadData(this.storage.get(), this.gson);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveSync(SaveCallback saveCallback) {
        PersistentStorage.Transaction edit = this.storage.get().edit();
        saveCallback.onSaveData(edit, this.gson);
        edit.set("timestamp", this.timeProvider.currentTimeMillis());
        edit.commitAsynchronously();
    }

    public void clear(String str) {
        this.storage.get().edit().remove(str).commitSynchronously();
    }

    public void clearData() {
        this.storage.get().edit().clear().commitSynchronously();
    }

    public void load(LoadCallback loadCallback) {
        loadSync(loadCallback);
    }

    public void loadAsync(final LoadCallback loadCallback) {
        this.loadAsyncFuture = this.executorService.submit(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader.1
            @Override // java.lang.Runnable
            public void run() {
                PersistedDataLoader.this.loadSync(loadCallback);
            }
        });
    }

    public void save(SaveCallback saveCallback) {
        saveSync(saveCallback);
    }

    public void saveAsync(final SaveCallback saveCallback) {
        this.executorService.submit(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader.2
            @Override // java.lang.Runnable
            public void run() {
                PersistedDataLoader.this.saveSync(saveCallback);
            }
        });
    }

    public void waitForDataToLoad() {
        Future<?> future = this.loadAsyncFuture;
        if (future != null) {
            try {
                future.get(10L, TimeUnit.SECONDS);
            } catch (Exception e) {
                Log.e(TAG, "Waiting for data failed", e);
            }
        }
    }

    public PersistedDataLoader(String str, Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        this(str, 0L, false, lazy, ManagedExecutorFactory.newSingleThreadCachedThreadPool(str + SUFFIX_EXECUTOR_NAME), timeProvider, gson);
    }

    @VisibleForTesting
    public PersistedDataLoader(String str, long j, boolean z, Lazy<PersistentStorage> lazy, ExecutorService executorService, TimeProvider timeProvider, Gson gson) {
        this.loaderType = str;
        this.expirationTimeMs = j;
        this.shouldExpire = z;
        this.storage = lazy;
        this.executorService = executorService;
        this.timeProvider = timeProvider;
        this.gson = gson;
    }
}
