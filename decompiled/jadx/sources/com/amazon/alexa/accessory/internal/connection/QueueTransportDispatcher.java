package com.amazon.alexa.accessory.internal.connection;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.transport.TransportDispatcher;
import com.amazon.alexa.accessory.transport.TransportTransaction;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class QueueTransportDispatcher implements TransportDispatcher {
    private TransportDispatcher dispatcher;
    private final Set<DrainCondition> drainConditions;
    private final Object monitor = new Object();
    private final Deque<TransportTransaction> queue = new ArrayDeque();
    private volatile boolean suspended;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DrainCondition {
        boolean canDrain();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DrainablePredicate<T> {
        boolean canDrain(T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IsDrainableCallback {
        void onNowDrainable();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StatefulDrainCondition<T> implements DrainCondition {
        private final IsDrainableCallback drainableCallback;
        private final DrainablePredicate<T> drainablePredicate;
        private final Object monitor;
        private T state;

        private StatefulDrainCondition(Object obj, IsDrainableCallback isDrainableCallback, DrainablePredicate<T> drainablePredicate, T t) {
            Preconditions.notNull(obj, "monitor");
            Preconditions.notNull(isDrainableCallback, "callback");
            Preconditions.notNull(drainablePredicate, "drainablePredicate");
            this.monitor = obj;
            this.drainablePredicate = drainablePredicate;
            this.drainableCallback = isDrainableCallback;
            this.state = t;
        }

        @Override // com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher.DrainCondition
        public boolean canDrain() {
            return this.drainablePredicate.canDrain(this.state);
        }

        public void setState(T t) {
            synchronized (this.monitor) {
                try {
                    this.state = t;
                    if (canDrain()) {
                        this.drainableCallback.onNowDrainable();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public QueueTransportDispatcher() {
        HashSet hashSet = new HashSet();
        this.drainConditions = hashSet;
        int i = 0;
        hashSet.add(new DispatcherDrainCondition(this, i));
        hashSet.add(new SuspendedDrainCondition(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drain() {
        synchronized (this.monitor) {
            try {
                Iterator<DrainCondition> it2 = this.drainConditions.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().canDrain()) {
                        return;
                    }
                }
                while (!this.queue.isEmpty()) {
                    this.dispatcher.dispatch(this.queue.poll());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.accessory.transport.TransportDispatcher
    public void abort(TransportTransaction transportTransaction) {
        Preconditions.notNull(transportTransaction, "transaction");
        synchronized (this.monitor) {
            try {
                this.queue.remove(transportTransaction);
                TransportDispatcher transportDispatcher = this.dispatcher;
                if (transportDispatcher != null) {
                    transportDispatcher.abort(transportTransaction);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher$$ExternalSyntheticLambda0] */
    public <T> StatefulDrainCondition<T> addDrainCondition(T t, DrainablePredicate<T> drainablePredicate) {
        StatefulDrainCondition<T> statefulDrainCondition;
        Preconditions.notNull(drainablePredicate, "canDrainPredicate");
        synchronized (this.monitor) {
            statefulDrainCondition = new StatefulDrainCondition<>(this.monitor, (QueueTransportDispatcher$$ExternalSyntheticLambda0) new IsDrainableCallback() { // from class: com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher$$ExternalSyntheticLambda0
                @Override // com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher.IsDrainableCallback
                public final void onNowDrainable() {
                    QueueTransportDispatcher.this.drain();
                }
            }, (DrainablePredicate) drainablePredicate, (Object) t);
            this.drainConditions.add(statefulDrainCondition);
        }
        return statefulDrainCondition;
    }

    @Override // com.amazon.alexa.accessory.transport.TransportDispatcher
    public void dispatch(TransportTransaction transportTransaction) {
        Preconditions.notNull(transportTransaction, "transaction");
        synchronized (this.monitor) {
            this.queue.add(transportTransaction);
            drain();
        }
    }

    public void resume() {
        synchronized (this.monitor) {
            this.suspended = false;
            drain();
        }
    }

    public void setDispatcher(TransportDispatcher transportDispatcher) {
        synchronized (this.monitor) {
            this.dispatcher = transportDispatcher;
            drain();
        }
    }

    public void suspend() {
        synchronized (this.monitor) {
            this.suspended = true;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class DispatcherDrainCondition implements DrainCondition {
        private DispatcherDrainCondition() {
        }

        @Override // com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher.DrainCondition
        public boolean canDrain() {
            return QueueTransportDispatcher.this.dispatcher != null;
        }

        public /* synthetic */ DispatcherDrainCondition(QueueTransportDispatcher queueTransportDispatcher, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SuspendedDrainCondition implements DrainCondition {
        private SuspendedDrainCondition() {
        }

        @Override // com.amazon.alexa.accessory.internal.connection.QueueTransportDispatcher.DrainCondition
        public boolean canDrain() {
            return !QueueTransportDispatcher.this.suspended;
        }

        public /* synthetic */ SuspendedDrainCondition(QueueTransportDispatcher queueTransportDispatcher, int i) {
            this();
        }
    }
}
