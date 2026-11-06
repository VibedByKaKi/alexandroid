package com.amazon.rtcsc.capabilityagent.avs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class RtcscContextProvider_Factory implements Factory<RtcscContextProvider> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final RtcscContextProvider_Factory INSTANCE = new RtcscContextProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static RtcscContextProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RtcscContextProvider newInstance() {
        return new RtcscContextProvider();
    }

    @Override // javax.inject.Provider
    public RtcscContextProvider get() {
        return newInstance();
    }
}
