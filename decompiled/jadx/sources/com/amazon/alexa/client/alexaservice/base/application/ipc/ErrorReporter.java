package com.amazon.alexa.client.alexaservice.base.application.ipc;

import com.amazon.alexa.api.messages.messagereceiver.ExceptionReporter;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ErrorReporter implements ExceptionReporter {
    private final CrashReporter crashReporter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UnhandledThrowableException extends Exception {
        public UnhandledThrowableException(Throwable th) {
            super(th);
        }
    }

    @Inject
    public ErrorReporter(CrashReporter crashReporter) {
        this.crashReporter = crashReporter;
    }

    @Override // com.amazon.alexa.api.messages.messagereceiver.ExceptionReporter
    public void onError(Throwable th) {
        this.crashReporter.notifyHandledException(new UnhandledThrowableException(th));
    }
}
