package com.amazon.alexa.client.alexaservice.base.application.ipc;

import com.amazon.alexa.client.crashreporting.CrashReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ErrorReporter_Factory implements Factory<ErrorReporter> {
    private final Provider<CrashReporter> crashReporterProvider;

    public ErrorReporter_Factory(Provider<CrashReporter> provider) {
        this.crashReporterProvider = provider;
    }

    public static ErrorReporter_Factory create(Provider<CrashReporter> provider) {
        return new ErrorReporter_Factory(provider);
    }

    public static ErrorReporter newInstance(CrashReporter crashReporter) {
        return new ErrorReporter(crashReporter);
    }

    @Override // javax.inject.Provider
    public ErrorReporter get() {
        return newInstance(this.crashReporterProvider.get());
    }
}
