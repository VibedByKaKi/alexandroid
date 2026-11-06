package com.amazon.comms.ringservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.pjsip.pjsua2.LogWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PjsipModule_ProvideLogWriterFactory implements Factory<LogWriter> {
    private static final PjsipModule_ProvideLogWriterFactory INSTANCE = new PjsipModule_ProvideLogWriterFactory();

    public static PjsipModule_ProvideLogWriterFactory create() {
        return INSTANCE;
    }

    public static LogWriter provideLogWriter() {
        return (LogWriter) Preconditions.checkNotNull(PjsipModule.provideLogWriter(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public LogWriter get() {
        return provideLogWriter();
    }
}
