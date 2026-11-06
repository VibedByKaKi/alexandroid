package com.amazon.deecomms.common.processor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Processor<S, T> {
    private List<Task<S, T>> mTaskList = new ArrayList();

    public Processor add(Task<S, T> task) {
        this.mTaskList.add(task);
        return this;
    }

    public Observable<S> deferredExecute(final T t) {
        return Observable.fromCallable(new Callable<S>() { // from class: com.amazon.deecomms.common.processor.Processor.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public S call() {
                return (S) Processor.this.execute(t);
            }
        });
    }

    public S execute(T t) {
        Iterator<Task<S, T>> it2 = this.mTaskList.iterator();
        S s = null;
        while (it2.hasNext()) {
            s = it2.next().execute(t);
            if (terminateEarly(s)) {
                break;
            }
        }
        return s;
    }

    public abstract boolean terminateEarly(S s);
}
