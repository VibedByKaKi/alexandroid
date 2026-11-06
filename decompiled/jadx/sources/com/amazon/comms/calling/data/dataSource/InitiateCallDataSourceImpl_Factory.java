package com.amazon.comms.calling.data.dataSource;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class InitiateCallDataSourceImpl_Factory implements Factory<InitiateCallDataSourceImpl> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final InitiateCallDataSourceImpl_Factory INSTANCE = new InitiateCallDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static InitiateCallDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InitiateCallDataSourceImpl newInstance() {
        return new InitiateCallDataSourceImpl();
    }

    @Override // javax.inject.Provider
    public InitiateCallDataSourceImpl get() {
        return newInstance();
    }
}
