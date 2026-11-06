package com.amazon.comms.calling.data.dataSource.sepia;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class SepiaDataSourceImpl_Factory implements Factory<SepiaDataSourceImpl> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SepiaDataSourceImpl_Factory INSTANCE = new SepiaDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static SepiaDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SepiaDataSourceImpl newInstance() {
        return new SepiaDataSourceImpl();
    }

    @Override // javax.inject.Provider
    public SepiaDataSourceImpl get() {
        return newInstance();
    }
}
