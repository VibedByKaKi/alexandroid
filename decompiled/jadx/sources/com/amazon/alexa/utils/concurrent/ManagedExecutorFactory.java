package com.amazon.alexa.utils.concurrent;

import android.os.SystemClock;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ManagedExecutorFactory {
    private static final String TAG = "ManagedExecutorFactory";
    static Map<Group, Map<String, ManagedExecutorService>> executorServiceMapBuckets = new HashMap();
    private static Map<String, Group> executorNameToGroupMap = new HashMap();
    private static Map<String, ExecutorServiceType> executorNameToServiceTypeMap = new HashMap();
    private static final Object LOCK = new Object();
    private static final Map<Group, Long> TIMEOUT_BY_GROUP_MAP = Collections.unmodifiableMap(new HashMap<Group, Long>() { // from class: com.amazon.alexa.utils.concurrent.ManagedExecutorFactory.1
        {
            put(Group.INITIALIZATION, 1L);
            put(Group.BACKGROUND_TASK, 2L);
            put(Group.SERVICE_CONNECTION, 3L);
            put(Group.EVENT_BUS, 3L);
        }
    });

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ExecutorServiceType {
        SINGLE_THREAD_SCHEDULED,
        SCHEDULED,
        SINGLE_THREAD,
        SINGLE_THREAD_CACHED_THREAD_POOL,
        CACHED_THREAD_POOL,
        FIXED_SIZE_THREAD_POOL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Group {
        INITIALIZATION,
        BACKGROUND_TASK,
        SERVICE_CONNECTION,
        EVENT_BUS
    }

    public static void clear() {
        synchronized (LOCK) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (Group group : Group.values()) {
                Map<String, ManagedExecutorService> map = executorServiceMapBuckets.get(group);
                if (map != null) {
                    Iterator it2 = new ArrayList(map.values()).iterator();
                    while (it2.hasNext()) {
                        ExecutorService executorService = (ExecutorService) it2.next();
                        if (!executorService.isShutdown()) {
                            executorService.shutdown();
                            try {
                                executorService.awaitTermination(TIMEOUT_BY_GROUP_MAP.get(group).longValue(), TimeUnit.SECONDS);
                            } catch (InterruptedException e) {
                                Log.e(TAG, "Termination failed for " + executorService.toString() + " in " + group.name(), e);
                            } catch (NullPointerException e2) {
                                Log.e(TAG, group.name() + " does not exist", e2);
                            }
                        }
                    }
                    map.clear();
                }
            }
            executorServiceMapBuckets.clear();
            executorNameToGroupMap.clear();
            executorNameToServiceTypeMap.clear();
            Log.i(TAG, "Time to clear ManageExecutorFactory: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, ManagedExecutorService> getExecutorServiceMap(Group group) {
        if (!executorServiceMapBuckets.containsKey(group)) {
            executorServiceMapBuckets.put(group, new HashMap());
        }
        return executorServiceMapBuckets.get(group);
    }

    private static void isNameAndExecutorServiceTypeOneToOne(String str, ExecutorServiceType executorServiceType) {
        if (!executorNameToServiceTypeMap.containsKey(str) || executorServiceType.equals(executorNameToServiceTypeMap.get(str))) {
            return;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Name: ", str, " name must be 1 to 1 matching with ExecutorServiceType ");
        m2m.append(executorNameToServiceTypeMap.get(str));
        m2m.append("instead of ");
        PathKt$$ExternalSyntheticBUOutline0.m(executorServiceType.name(), m2m);
    }

    private static void isNameAndGroupOneToOne(String str, Group group) {
        if (!executorNameToGroupMap.containsKey(str) || group.equals(executorNameToGroupMap.get(str))) {
            return;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Name: ", str, " name must be 1 to 1 matching with Group ");
        m2m.append(executorNameToGroupMap.get(str));
        m2m.append("instead of ");
        PathKt$$ExternalSyntheticBUOutline0.m(group.name(), m2m);
    }

    public static ExecutorService newCachedThreadPool(String str, int i, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.CACHED_THREAD_POOL;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown()) {
                    return managedExecutorService;
                }
                ManagedExecutorService managedExecutorService2 = new ManagedExecutorService(ExecutorFactory.newCachedThreadPool(str, i), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedExecutorService2);
                return managedExecutorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ExecutorService newFixedSizeThreadPool(String str, int i, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.FIXED_SIZE_THREAD_POOL;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown()) {
                    return managedExecutorService;
                }
                ManagedExecutorService managedExecutorService2 = new ManagedExecutorService(ExecutorFactory.newFixedSizeThreadPool(str, i), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedExecutorService2);
                return managedExecutorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ScheduledExecutorService newScheduledExecutor(int i, String str, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.SCHEDULED;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown() && (managedExecutorService instanceof ScheduledExecutorService)) {
                    return (ScheduledExecutorService) managedExecutorService;
                }
                ManagedScheduledExecutorService managedScheduledExecutorService = new ManagedScheduledExecutorService(ExecutorFactory.newScheduledExecutor(i, str), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedScheduledExecutorService);
                return managedScheduledExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ExecutorService newSingleThreadCachedThreadPool(String str, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.SINGLE_THREAD_CACHED_THREAD_POOL;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown()) {
                    return managedExecutorService;
                }
                ManagedExecutorService managedExecutorService2 = new ManagedExecutorService(ExecutorFactory.newSingleThreadCachedThreadPool(str), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedExecutorService2);
                return managedExecutorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ExecutorService newSingleThreadExecutor(String str, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.SINGLE_THREAD;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown()) {
                    return managedExecutorService;
                }
                ManagedExecutorService managedExecutorService2 = new ManagedExecutorService(ExecutorFactory.newSingleThreadExecutor(str), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedExecutorService2);
                return managedExecutorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str, Group group) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                ExecutorServiceType executorServiceType = ExecutorServiceType.SINGLE_THREAD_SCHEDULED;
                preconditionCheck(str, group, executorServiceType);
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap.containsKey(str) && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown() && (managedExecutorService instanceof ScheduledExecutorService)) {
                    return (ScheduledExecutorService) managedExecutorService;
                }
                ManagedScheduledExecutorService managedScheduledExecutorService = new ManagedScheduledExecutorService(ExecutorFactory.newSingleThreadScheduledExecutor(str), str);
                executorNameToGroupMap.put(str, group);
                executorNameToServiceTypeMap.put(str, executorServiceType);
                executorServiceMap.put(str, managedScheduledExecutorService);
                return managedScheduledExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void preconditionCheck(String str, Group group, ExecutorServiceType executorServiceType) {
        isNameAndGroupOneToOne(str, group);
        isNameAndExecutorServiceTypeOneToOne(str, executorServiceType);
    }

    public static void shutdown(String str) {
        ManagedExecutorService managedExecutorService;
        synchronized (LOCK) {
            try {
                Group group = executorNameToGroupMap.get(str);
                if (group == null) {
                    Log.e(TAG, "There is no matching group for given executor service name: " + str);
                    return;
                }
                Map<String, ManagedExecutorService> executorServiceMap = getExecutorServiceMap(group);
                if (executorServiceMap != null && (managedExecutorService = executorServiceMap.get(str)) != null && !managedExecutorService.isShutdown()) {
                    managedExecutorService.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ManagedExecutorService implements ExecutorService, AutoCloseable {
        private final ExecutorService executorService;
        private final String name;

        public ManagedExecutorService(ExecutorService executorService, String str) {
            this.executorService = executorService;
            this.name = str;
        }

        private void cleanup() {
            Group group = (Group) ManagedExecutorFactory.executorNameToGroupMap.get(this.name);
            if (group == null) {
                Log.e(ManagedExecutorFactory.TAG, "There is no matching group for given executor service name: " + this.name);
                return;
            }
            Map executorServiceMap = ManagedExecutorFactory.getExecutorServiceMap(group);
            if (executorServiceMap != null) {
                executorServiceMap.remove(this.name);
            }
            ManagedExecutorFactory.executorNameToGroupMap.remove(this.name);
            ManagedExecutorFactory.executorNameToServiceTypeMap.remove(this.name);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.executorService.awaitTermination(j, timeUnit);
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            boolean isTerminated;
            if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.executorService.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.executorService.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.executorService.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.executorService.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.executorService.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
            }
            cleanup();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            List<Runnable> arrayList = new ArrayList<>(0);
            if (!this.executorService.isShutdown()) {
                arrayList = this.executorService.shutdownNow();
            }
            cleanup();
            return arrayList;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.executorService.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.executorService.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.executorService.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.executorService.submit(runnable, t);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.executorService.submit(runnable);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ManagedScheduledExecutorService extends ManagedExecutorService implements ScheduledExecutorService, AutoCloseable {
        private final ScheduledExecutorService scheduledExecutorService;

        public ManagedScheduledExecutorService(ScheduledExecutorService scheduledExecutorService, String str) {
            super(scheduledExecutorService, str);
            this.scheduledExecutorService = scheduledExecutorService;
        }

        @Override // com.amazon.alexa.utils.concurrent.ManagedExecutorFactory.ManagedExecutorService, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            boolean isTerminated;
            if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.scheduledExecutorService.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.scheduledExecutorService.schedule(callable, j, timeUnit);
        }
    }

    public static ExecutorService newCachedThreadPool(String str, int i) {
        return newCachedThreadPool(str, i, Group.BACKGROUND_TASK);
    }

    public static ExecutorService newFixedSizeThreadPool(String str, int i) {
        return newFixedSizeThreadPool(str, i, Group.BACKGROUND_TASK);
    }

    public static ExecutorService newSingleThreadCachedThreadPool(String str) {
        return newSingleThreadCachedThreadPool(str, Group.BACKGROUND_TASK);
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return newSingleThreadExecutor(str, Group.BACKGROUND_TASK);
    }

    public static ScheduledExecutorService newScheduledExecutor(int i, String str) {
        return newScheduledExecutor(i, str, Group.BACKGROUND_TASK);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str) {
        return newSingleThreadScheduledExecutor(str, Group.BACKGROUND_TASK);
    }
}
