package org.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ThreadCounterImpl11 implements ThreadCounter {
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Counter cached_counter;
    private Thread cached_thread;
    private Hashtable counters = new Hashtable();
    private int change_count = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Counter {
        protected int value = 0;
    }

    private synchronized Counter getThreadCounter() {
        try {
            if (Thread.currentThread() != this.cached_thread) {
                Thread currentThread = Thread.currentThread();
                this.cached_thread = currentThread;
                Counter counter = (Counter) this.counters.get(currentThread);
                this.cached_counter = counter;
                if (counter == null) {
                    Counter counter2 = new Counter();
                    this.cached_counter = counter2;
                    this.counters.put(this.cached_thread, counter2);
                }
                this.change_count++;
                if (this.change_count > Math.max(100, 20000 / Math.max(1, this.counters.size()))) {
                    ArrayList arrayList = new ArrayList();
                    Enumeration keys = this.counters.keys();
                    while (keys.hasMoreElements()) {
                        Thread thread = (Thread) keys.nextElement();
                        if (!thread.isAlive()) {
                            arrayList.add(thread);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.counters.remove((Thread) it2.next());
                    }
                    this.change_count = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cached_counter;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void dec() {
        Counter threadCounter = getThreadCounter();
        threadCounter.value--;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void inc() {
        getThreadCounter().value++;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public boolean isNotZero() {
        return getThreadCounter().value != 0;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void removeThreadCounter() {
    }
}
