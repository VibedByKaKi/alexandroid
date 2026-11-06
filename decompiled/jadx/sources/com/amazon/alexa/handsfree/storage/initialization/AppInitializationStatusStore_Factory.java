package com.amazon.alexa.handsfree.storage.initialization;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AppInitializationStatusStore_Factory implements Factory<AppInitializationStatusStore> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AppInitializationStatusStore_Factory INSTANCE = new AppInitializationStatusStore_Factory();

        private InstanceHolder() {
        }
    }

    public static AppInitializationStatusStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppInitializationStatusStore newInstance() {
        return new AppInitializationStatusStore();
    }

    @Override // javax.inject.Provider
    public AppInitializationStatusStore get() {
        return newInstance();
    }
}
