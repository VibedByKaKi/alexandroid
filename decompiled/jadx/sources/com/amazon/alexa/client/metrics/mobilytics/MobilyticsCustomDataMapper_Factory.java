package com.amazon.alexa.client.metrics.mobilytics;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MobilyticsCustomDataMapper_Factory implements Factory<MobilyticsCustomDataMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MobilyticsCustomDataMapper_Factory INSTANCE = new MobilyticsCustomDataMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static MobilyticsCustomDataMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MobilyticsCustomDataMapper newInstance() {
        return new MobilyticsCustomDataMapper();
    }

    @Override // javax.inject.Provider
    public MobilyticsCustomDataMapper get() {
        return newInstance();
    }
}
