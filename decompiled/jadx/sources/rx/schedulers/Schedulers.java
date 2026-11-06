package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.annotations.Experimental;
import rx.internal.schedulers.ExecutorScheduler;
import rx.internal.schedulers.GenericScheduledExecutorService;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.internal.util.RxRingBuffer;
import rx.plugins.RxJavaHooks;
import rx.plugins.RxJavaPlugins;
import rx.plugins.RxJavaSchedulersHook;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> INSTANCE = new AtomicReference<>();
    private final Scheduler computationScheduler;
    private final Scheduler ioScheduler;
    private final Scheduler newThreadScheduler;

    private Schedulers() {
        RxJavaSchedulersHook schedulersHook = RxJavaPlugins.getInstance().getSchedulersHook();
        Scheduler computationScheduler = schedulersHook.getComputationScheduler();
        if (computationScheduler != null) {
            this.computationScheduler = computationScheduler;
        } else {
            this.computationScheduler = RxJavaSchedulersHook.createComputationScheduler();
        }
        Scheduler iOScheduler = schedulersHook.getIOScheduler();
        if (iOScheduler != null) {
            this.ioScheduler = iOScheduler;
        } else {
            this.ioScheduler = RxJavaSchedulersHook.createIoScheduler();
        }
        Scheduler newThreadScheduler = schedulersHook.getNewThreadScheduler();
        if (newThreadScheduler != null) {
            this.newThreadScheduler = newThreadScheduler;
        } else {
            this.newThreadScheduler = RxJavaSchedulersHook.createNewThreadScheduler();
        }
    }

    public static Scheduler computation() {
        return RxJavaHooks.onComputationScheduler(getInstance().computationScheduler);
    }

    public static Scheduler from(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    private static Schedulers getInstance() {
        Schedulers schedulers;
        while (true) {
            AtomicReference<Schedulers> atomicReference = INSTANCE;
            Schedulers schedulers2 = atomicReference.get();
            if (schedulers2 != null) {
                return schedulers2;
            }
            schedulers = new Schedulers();
            while (!atomicReference.compareAndSet(null, schedulers)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return schedulers;
            schedulers.shutdownInstance();
        }
    }

    public static Scheduler immediate() {
        return rx.internal.schedulers.ImmediateScheduler.INSTANCE;
    }

    public static Scheduler io() {
        return RxJavaHooks.onIOScheduler(getInstance().ioScheduler);
    }

    public static Scheduler newThread() {
        return RxJavaHooks.onNewThreadScheduler(getInstance().newThreadScheduler);
    }

    @Experimental
    public static void reset() {
        Schedulers andSet = INSTANCE.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownInstance();
        }
    }

    public static void shutdown() {
        Schedulers schedulers = getInstance();
        schedulers.shutdownInstance();
        synchronized (schedulers) {
            GenericScheduledExecutorService.INSTANCE.shutdown();
            RxRingBuffer.SPSC_POOL.shutdown();
            RxRingBuffer.SPMC_POOL.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulers = getInstance();
        schedulers.startInstance();
        synchronized (schedulers) {
            GenericScheduledExecutorService.INSTANCE.start();
            RxRingBuffer.SPSC_POOL.start();
            RxRingBuffer.SPMC_POOL.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static Scheduler trampoline() {
        return rx.internal.schedulers.TrampolineScheduler.INSTANCE;
    }

    public synchronized void shutdownInstance() {
        try {
            Object obj = this.computationScheduler;
            if (obj instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj).shutdown();
            }
            Object obj2 = this.ioScheduler;
            if (obj2 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj2).shutdown();
            }
            Object obj3 = this.newThreadScheduler;
            if (obj3 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj3).shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startInstance() {
        try {
            Object obj = this.computationScheduler;
            if (obj instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj).start();
            }
            Object obj2 = this.ioScheduler;
            if (obj2 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj2).start();
            }
            Object obj3 = this.newThreadScheduler;
            if (obj3 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) obj3).start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
