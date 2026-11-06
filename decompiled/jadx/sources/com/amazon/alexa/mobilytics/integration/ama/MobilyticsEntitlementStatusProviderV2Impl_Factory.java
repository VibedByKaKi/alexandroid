package com.amazon.alexa.mobilytics.integration.ama;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MobilyticsEntitlementStatusProviderV2Impl_Factory implements Factory<MobilyticsEntitlementStatusProviderV2Impl> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MobilyticsEntitlementStatusProviderV2Impl_Factory INSTANCE = new MobilyticsEntitlementStatusProviderV2Impl_Factory();

        private InstanceHolder() {
        }
    }

    public static MobilyticsEntitlementStatusProviderV2Impl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MobilyticsEntitlementStatusProviderV2Impl newInstance() {
        return new MobilyticsEntitlementStatusProviderV2Impl();
    }

    @Override // javax.inject.Provider
    public MobilyticsEntitlementStatusProviderV2Impl get() {
        return newInstance();
    }
}
