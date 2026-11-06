package com.amazon.rtcsc.capabilityagent.common.dependencies;

import com.amazon.rtcsc.capabilityagent.avs.RtcscContextProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ApplicationModule_ProvidesRtcscContextProviderFactory implements Factory<RtcscContextProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRtcscContextProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRtcscContextProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRtcscContextProviderFactory(applicationModule);
    }

    public static RtcscContextProvider providesRtcscContextProvider(ApplicationModule applicationModule) {
        return (RtcscContextProvider) Preconditions.checkNotNullFromProvides(applicationModule.providesRtcscContextProvider());
    }

    @Override // javax.inject.Provider
    public RtcscContextProvider get() {
        return providesRtcscContextProvider(this.module);
    }
}
