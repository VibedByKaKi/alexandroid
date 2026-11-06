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
public final class GoogleMapsDeeplinkHelper_Factory implements Factory<GoogleMapsDeeplinkHelper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final GoogleMapsDeeplinkHelper_Factory INSTANCE = new GoogleMapsDeeplinkHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static GoogleMapsDeeplinkHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GoogleMapsDeeplinkHelper newInstance() {
        return new GoogleMapsDeeplinkHelper();
    }

    @Override // javax.inject.Provider
    public GoogleMapsDeeplinkHelper get() {
        return newInstance();
    }
}
