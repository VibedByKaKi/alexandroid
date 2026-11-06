package com.amazon.commscore.commsidentity.common;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class TimeUtil_Factory implements Factory<TimeUtil> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final TimeUtil_Factory INSTANCE = new TimeUtil_Factory();

        private InstanceHolder() {
        }
    }

    public static TimeUtil_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TimeUtil newInstance() {
        return new TimeUtil();
    }

    @Override // javax.inject.Provider
    public TimeUtil get() {
        return newInstance();
    }
}
