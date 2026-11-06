package com.amazon.comms.calling.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallingEventDataSource_Factory implements Factory<CallingEventDataSource> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final CallingEventDataSource_Factory INSTANCE = new CallingEventDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static CallingEventDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallingEventDataSource newInstance() {
        return new CallingEventDataSource();
    }

    @Override // javax.inject.Provider
    public CallingEventDataSource get() {
        return newInstance();
    }
}
