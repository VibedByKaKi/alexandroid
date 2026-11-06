package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class SchedulerPoolFactory {
    static final String PURGE_ENABLED_KEY = "rx3.purge-enabled";
    public static final boolean PURGE_ENABLED = getBooleanProperty(true, PURGE_ENABLED_KEY, true, true, new SystemPropertyAccessor());

    private SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(PURGE_ENABLED);
        return scheduledThreadPoolExecutor;
    }

    public static boolean getBooleanProperty(boolean z, String str, boolean z2, boolean z3, Function<String, String> function) {
        if (!z) {
            return z3;
        }
        try {
            String apply = function.apply(str);
            return apply == null ? z2 : "true".equals(apply);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return z2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SystemPropertyAccessor implements Function<String, String> {
        @Override // io.reactivex.rxjava3.functions.Function
        public String apply(String str) {
            return System.getProperty(str);
        }
    }
}
