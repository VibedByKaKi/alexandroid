package com.amazon.deecomms.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class BuildVersionProviderImpl_Factory implements Factory<BuildVersionProviderImpl> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final BuildVersionProviderImpl_Factory INSTANCE = new BuildVersionProviderImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static BuildVersionProviderImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BuildVersionProviderImpl newInstance() {
        return new BuildVersionProviderImpl();
    }

    @Override // javax.inject.Provider
    public BuildVersionProviderImpl get() {
        return newInstance();
    }
}
