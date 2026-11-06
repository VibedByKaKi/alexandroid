package rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class ProducerObserverArbiter<T> implements Producer, Observer<T> {
    static final Producer NULL_PRODUCER = new Producer() { // from class: rx.internal.producers.ProducerObserverArbiter.1
        @Override // rx.Producer
        public void request(long j) {
        }
    };
    final Subscriber<? super T> child;
    Producer currentProducer;
    boolean emitting;
    volatile boolean hasError;
    Producer missedProducer;
    long missedRequested;
    Object missedTerminal;
    List<T> queue;
    long requested;

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.child = subscriber;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void emitLoop() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.ProducerObserverArbiter.emitLoop():void");
    }

    @Override // rx.Observer
    public void onCompleted() {
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedTerminal = Boolean.TRUE;
                } else {
                    this.emitting = true;
                    this.child.onCompleted();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        boolean z;
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedTerminal = th;
                    z = false;
                } else {
                    this.emitting = true;
                    z = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            this.child.onError(th);
        } else {
            this.hasError = true;
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        synchronized (this) {
            try {
                if (this.emitting) {
                    List list = this.queue;
                    if (list == null) {
                        list = new ArrayList(4);
                        this.queue = list;
                    }
                    list.add(t);
                    return;
                }
                this.emitting = true;
                try {
                    this.child.onNext(t);
                    long j = this.requested;
                    if (j != Long.MAX_VALUE) {
                        this.requested = j - 1;
                    }
                    emitLoop();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.emitting = false;
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedRequested += j;
                    return;
                }
                this.emitting = true;
                Producer producer = this.currentProducer;
                try {
                    long j2 = this.requested + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.requested = j2;
                    emitLoop();
                    if (producer != null) {
                        producer.request(j);
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.emitting = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            try {
                if (this.emitting) {
                    if (producer == null) {
                        producer = NULL_PRODUCER;
                    }
                    this.missedProducer = producer;
                    return;
                }
                this.emitting = true;
                this.currentProducer = producer;
                long j = this.requested;
                try {
                    emitLoop();
                    if (producer == null || j == 0) {
                        return;
                    }
                    producer.request(j);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.emitting = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
