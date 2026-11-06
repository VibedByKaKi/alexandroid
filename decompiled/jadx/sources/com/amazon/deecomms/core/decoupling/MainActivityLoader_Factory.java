package com.amazon.deecomms.core.decoupling;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class MainActivityLoader_Factory implements Factory<MainActivityLoader> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MainActivityLoader_Factory INSTANCE = new MainActivityLoader_Factory();

        private InstanceHolder() {
        }
    }

    public static MainActivityLoader_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainActivityLoader newInstance() {
        return new MainActivityLoader();
    }

    @Override // javax.inject.Provider
    public MainActivityLoader get() {
        return newInstance();
    }
}
