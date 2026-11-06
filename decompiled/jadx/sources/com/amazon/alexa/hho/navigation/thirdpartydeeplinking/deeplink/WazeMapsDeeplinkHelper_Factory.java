package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class WazeMapsDeeplinkHelper_Factory implements Factory<WazeMapsDeeplinkHelper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final WazeMapsDeeplinkHelper_Factory INSTANCE = new WazeMapsDeeplinkHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static WazeMapsDeeplinkHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WazeMapsDeeplinkHelper newInstance() {
        return new WazeMapsDeeplinkHelper();
    }

    @Override // javax.inject.Provider
    public WazeMapsDeeplinkHelper get() {
        return newInstance();
    }
}
