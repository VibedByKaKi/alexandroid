package rx.internal.schedulers;

import rx.Scheduler;
import rx.exceptions.Exceptions;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class SleepingAction implements Action0 {
    private final long execTime;
    private final Scheduler.Worker innerScheduler;
    private final Action0 underlying;

    public SleepingAction(Action0 action0, Scheduler.Worker worker, long j) {
        this.underlying = action0;
        this.innerScheduler = worker;
        this.execTime = j;
    }

    @Override // rx.functions.Action0
    public void call() {
        if (this.innerScheduler.isUnsubscribed()) {
            return;
        }
        long now = this.execTime - this.innerScheduler.now();
        if (now > 0) {
            try {
                Thread.sleep(now);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Exceptions.propagate(e);
            }
        }
        if (this.innerScheduler.isUnsubscribed()) {
            return;
        }
        this.underlying.call();
    }
}
