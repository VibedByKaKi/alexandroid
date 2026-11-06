package com.amazon.alexa.utils.concurrent;

import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class TaskExceptionLogger {
    private static final String taskExceptionLoggerAcronym = "TEL";
    private Throwable lastThrowable;

    private static String getTag() {
        return "TEL:" + Thread.currentThread().getName();
    }

    @Nullable
    public Throwable getLastThrowable() {
        return this.lastThrowable;
    }

    public void logExceptions(Runnable runnable, @Nullable Throwable th) {
        if (th == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone()) {
                    future.get(1L, TimeUnit.MINUTES);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
                getTag();
            } catch (RuntimeException | TimeoutException e) {
                th = e;
            } catch (ExecutionException e2) {
                th = e2.getCause();
            }
        }
        if (th != null) {
            Log.e(getTag(), th.getMessage(), th);
        }
        this.lastThrowable = th;
    }
}
