package com.amazon.dee.app.services.language;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AppLanguageManager_Factory implements Factory<AppLanguageManager> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AppLanguageManager_Factory INSTANCE = new AppLanguageManager_Factory();

        private InstanceHolder() {
        }
    }

    public static AppLanguageManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppLanguageManager newInstance() {
        return new AppLanguageManager();
    }

    @Override // javax.inject.Provider
    public AppLanguageManager get() {
        return newInstance();
    }
}
