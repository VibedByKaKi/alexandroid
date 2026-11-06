package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.protocols.utils.CrashReportRecorder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CrashReporterModule_ProvideCrashReportRecorderFactory implements Factory<CrashReportRecorder> {
    private final Provider<Context> contextProvider;
    private final CrashReporterModule module;

    public CrashReporterModule_ProvideCrashReportRecorderFactory(CrashReporterModule crashReporterModule, Provider<Context> provider) {
        this.module = crashReporterModule;
        this.contextProvider = provider;
    }

    public static CrashReporterModule_ProvideCrashReportRecorderFactory create(CrashReporterModule crashReporterModule, Provider<Context> provider) {
        return new CrashReporterModule_ProvideCrashReportRecorderFactory(crashReporterModule, provider);
    }

    public static CrashReportRecorder provideCrashReportRecorder(CrashReporterModule crashReporterModule, Context context) {
        return (CrashReportRecorder) Preconditions.checkNotNull(crashReporterModule.provideCrashReportRecorder(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CrashReportRecorder get() {
        return provideCrashReportRecorder(this.module, this.contextProvider.get());
    }
}
