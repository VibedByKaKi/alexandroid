package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
public final class UncaughtExceptionHandlers {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class Exiter implements Thread.UncaughtExceptionHandler {
        private static final LazyLogger logger = new LazyLogger(Exiter.class);
        private final RuntimeWrapper runtime;

        public Exiter(RuntimeWrapper runtimeWrapper) {
            this.runtime = runtimeWrapper;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                logger.get().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface RuntimeWrapper {
        void exit(int i);
    }

    private UncaughtExceptionHandlers() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        Runtime runtime = Runtime.getRuntime();
        Objects.requireNonNull(runtime);
        return new Exiter(new ClosingFuture$$ExternalSyntheticLambda3(runtime));
    }
}
