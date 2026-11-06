package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.concurrent.GuardedBy;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class ExecutionList {
    private static final Logger log = Logger.getLogger(ExecutionList.class.getName());

    @GuardedBy("this")
    private boolean executed;

    @CheckForNull
    @GuardedBy("this")
    private RunnableExecutorPair runnables;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RunnableExecutorPair {
        final Executor executor;

        @CheckForNull
        RunnableExecutorPair next;
        final Runnable runnable;

        public RunnableExecutorPair(Runnable runnable, Executor executor, @CheckForNull RunnableExecutorPair runnableExecutorPair) {
            this.runnable = runnable;
            this.executor = executor;
            this.next = runnableExecutorPair;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, CredentialConfig$$ExternalSyntheticOutline0.m(valueOf2.length() + valueOf.length() + 57, "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.executed) {
                    executeListener(runnable, executor);
                } else {
                    this.runnables = new RunnableExecutorPair(runnable, executor, this.runnables);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute() {
        synchronized (this) {
            try {
                if (this.executed) {
                    return;
                }
                this.executed = true;
                RunnableExecutorPair runnableExecutorPair = this.runnables;
                RunnableExecutorPair runnableExecutorPair2 = null;
                this.runnables = null;
                while (runnableExecutorPair != null) {
                    RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.next;
                    runnableExecutorPair.next = runnableExecutorPair2;
                    runnableExecutorPair2 = runnableExecutorPair;
                    runnableExecutorPair = runnableExecutorPair3;
                }
                while (runnableExecutorPair2 != null) {
                    executeListener(runnableExecutorPair2.runnable, runnableExecutorPair2.executor);
                    runnableExecutorPair2 = runnableExecutorPair2.next;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
