package com.amazon.dee.app.framework.startup.implementation;

import com.amazon.alexa.protocols.storage.PersistentStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StartupDataStore {
    private static final String TAG = "StartupDataStore";
    private PersistentStorage storage;

    public StartupDataStore(PersistentStorage persistentStorage) {
        this.storage = persistentStorage;
    }

    public synchronized String getFeature(String str) {
        return this.storage.getString(str);
    }

    public synchronized void removeFeature(String str) {
        this.storage.edit().remove(str).commit();
    }

    public synchronized void setFeature(String str, String str2) {
        this.storage.edit().set(str, str2).commit();
    }
}
