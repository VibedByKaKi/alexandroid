package com.amazon.comms.calling.data.network.interceptors;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class SiegeEncryptionInterceptor_Factory implements Factory<SiegeEncryptionInterceptor> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SiegeEncryptionInterceptor_Factory INSTANCE = new SiegeEncryptionInterceptor_Factory();

        private InstanceHolder() {
        }
    }

    public static SiegeEncryptionInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SiegeEncryptionInterceptor newInstance() {
        return new SiegeEncryptionInterceptor();
    }

    @Override // javax.inject.Provider
    public SiegeEncryptionInterceptor get() {
        return newInstance();
    }
}
