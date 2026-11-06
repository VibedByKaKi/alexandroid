package com.amazon.clouddrive.cdasdk.dagger.module;

import com.amazon.clouddrive.cdasdk.cdp.CDPUtil;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvideCDPUtilFactory implements Factory<CDPUtil> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCDPUtilFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCDPUtilFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCDPUtilFactory(applicationModule);
    }

    public static CDPUtil provideCDPUtil(ApplicationModule applicationModule) {
        return (CDPUtil) Preconditions.checkNotNullFromProvides(applicationModule.provideCDPUtil());
    }

    @Override // javax.inject.Provider
    public CDPUtil get() {
        return provideCDPUtil(this.module);
    }
}
