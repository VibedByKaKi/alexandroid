package org.apache.http.impl.conn.tsccm;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class WaitingThread {
    private boolean aborted;
    private final Condition cond;
    private final RouteSpecificPool pool;
    private Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        Args.notNull(condition, JsonDocumentFields.CONDITION);
        this.cond = condition;
        this.pool = routeSpecificPool;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean z;
        if (this.waiter != null) {
            StringBuilder sb = new StringBuilder("A thread is already waiting on this object.\ncaller: ");
            sb.append(Thread.currentThread());
            OnnxMap$$ExternalSyntheticBUOutline0.m((Object) "\nwaiter: ", (Object) this.waiter, sb);
            return false;
        }
        if (this.aborted) {
            throw new InterruptedException("Operation interrupted");
        }
        this.waiter = Thread.currentThread();
        Condition condition = this.cond;
        try {
            if (date != null) {
                z = condition.awaitUntil(date);
            } else {
                condition.await();
                z = true;
            }
            if (this.aborted) {
                throw new InterruptedException("Operation interrupted");
            }
            this.waiter = null;
            return z;
        } catch (Throwable th) {
            this.waiter = null;
            throw th;
        }
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }

    public void wakeup() {
        if (this.waiter != null) {
            this.cond.signalAll();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Nobody waiting on this object.");
        }
    }
}
