package com.amazon.clouddrive.cdasdk.dagger.module;

import com.amazon.clouddrive.cdasdk.util.SystemUtil;
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
public final class ApplicationModule_ProvideSystemUtilFactory implements Factory<SystemUtil> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideSystemUtilFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideSystemUtilFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideSystemUtilFactory(applicationModule);
    }

    public static SystemUtil provideSystemUtil(ApplicationModule applicationModule) {
        return (SystemUtil) Preconditions.checkNotNullFromProvides(applicationModule.provideSystemUtil());
    }

    @Override // javax.inject.Provider
    public SystemUtil get() {
        return provideSystemUtil(this.module);
    }
}
