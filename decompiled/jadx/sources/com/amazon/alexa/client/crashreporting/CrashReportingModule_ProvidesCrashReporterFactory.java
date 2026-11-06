package com.amazon.alexa.client.crashreporting;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class CrashReportingModule_ProvidesCrashReporterFactory implements Factory<CrashReporter> {
    private final CrashReportingModule module;

    public CrashReportingModule_ProvidesCrashReporterFactory(CrashReportingModule crashReportingModule) {
        this.module = crashReportingModule;
    }

    public static CrashReportingModule_ProvidesCrashReporterFactory create(CrashReportingModule crashReportingModule) {
        return new CrashReportingModule_ProvidesCrashReporterFactory(crashReportingModule);
    }

    public static CrashReporter providesCrashReporter(CrashReportingModule crashReportingModule) {
        return (CrashReporter) Preconditions.checkNotNullFromProvides(crashReportingModule.providesCrashReporter());
    }

    @Override // javax.inject.Provider
    public CrashReporter get() {
        return providesCrashReporter(this.module);
    }
}
