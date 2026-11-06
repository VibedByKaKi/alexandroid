package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.protocols.storage.PersistentStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class LastLaunchedNavigationAppStore {

    @VisibleForTesting
    static final String KEY_LAST_LAUNCHED_NAV_APP = "last_launched_nav_app";

    @VisibleForTesting
    static final String STORAGE_NAMESPACE = "navigation.transit.thirdpartydeeplinking";
    private static final String TAG = "LastLaunchedNavigationAppStore";
    private PersistentStorage storage;
    private final LazyComponent<PersistentStorage.Factory> storageFactoryLazyComponent;

    public LastLaunchedNavigationAppStore(LazyComponent<PersistentStorage.Factory> lazyComponent) {
        this.storageFactoryLazyComponent = lazyComponent;
    }

    @Nullable
    private PersistentStorage getStorage() {
        if (this.storage == null) {
            PersistentStorage.Factory factory = this.storageFactoryLazyComponent.get();
            if (factory == null) {
                Log.w(TAG, "PersistentStorage.Factory unavailable; last launched nav app will not be persisted");
                return null;
            }
            this.storage = factory.create(STORAGE_NAMESPACE);
        }
        return this.storage;
    }

    public void clear() {
        PersistentStorage storage = getStorage();
        if (storage == null) {
            return;
        }
        storage.edit().remove(KEY_LAST_LAUNCHED_NAV_APP).commit();
    }

    @Nullable
    public String getLastLaunchedApp() {
        PersistentStorage storage = getStorage();
        if (storage == null) {
            return null;
        }
        return storage.getString(KEY_LAST_LAUNCHED_NAV_APP);
    }

    public void setLastLaunchedApp(String str) {
        PersistentStorage storage = getStorage();
        if (storage == null) {
            return;
        }
        storage.edit().set(KEY_LAST_LAUNCHED_NAV_APP, str).commit();
    }
}
