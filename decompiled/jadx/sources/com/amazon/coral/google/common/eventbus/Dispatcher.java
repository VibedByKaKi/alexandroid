package com.amazon.coral.google.common.eventbus;

import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class Dispatcher {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImmediateDispatcher extends Dispatcher {
        private static final ImmediateDispatcher INSTANCE = new ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        @Override // com.amazon.coral.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it2) {
            Preconditions.checkNotNull(obj);
            while (it2.hasNext()) {
                it2.next().dispatchEvent(obj);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LegacyAsyncDispatcher extends Dispatcher {
        private final ConcurrentLinkedQueue<EventWithSubscriber> queue;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class EventWithSubscriber {
            private final Object event;
            private final Subscriber subscriber;

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
                this.event = obj;
                this.subscriber = subscriber;
            }
        }

        private LegacyAsyncDispatcher() {
            this.queue = Queues.newConcurrentLinkedQueue();
        }

        @Override // com.amazon.coral.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it2) {
            Preconditions.checkNotNull(obj);
            while (it2.hasNext()) {
                this.queue.add(new EventWithSubscriber(obj, it2.next()));
            }
            while (true) {
                EventWithSubscriber poll = this.queue.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.subscriber.dispatchEvent(poll.event);
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PerThreadQueuedDispatcher extends Dispatcher {
        private final ThreadLocal<Boolean> dispatching;
        private final ThreadLocal<Queue<Event>> queue;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Event {
            private final Object event;
            private final Iterator<Subscriber> subscribers;

            private Event(Object obj, Iterator<Subscriber> it2) {
                this.event = obj;
                this.subscribers = it2;
            }
        }

        private PerThreadQueuedDispatcher() {
            this.queue = new ThreadLocal<Queue<Event>>(this) { // from class: com.amazon.coral.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                @Override // java.lang.ThreadLocal
                public Queue<Event> initialValue() {
                    return Queues.newArrayDeque();
                }
            };
            this.dispatching = new ThreadLocal<Boolean>(this) { // from class: com.amazon.coral.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }

        @Override // com.amazon.coral.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it2) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(it2);
            Queue<Event> queue = this.queue.get();
            queue.offer(new Event(obj, it2));
            if (this.dispatching.get().booleanValue()) {
                return;
            }
            this.dispatching.set(Boolean.TRUE);
            while (true) {
                try {
                    Event poll = queue.poll();
                    if (poll == null) {
                        return;
                    }
                    while (poll.subscribers.hasNext()) {
                        ((Subscriber) poll.subscribers.next()).dispatchEvent(poll.event);
                    }
                } finally {
                    this.dispatching.remove();
                    this.queue.remove();
                }
            }
        }
    }

    public static Dispatcher immediate() {
        return ImmediateDispatcher.INSTANCE;
    }

    public static Dispatcher legacyAsync() {
        return new LegacyAsyncDispatcher();
    }

    public static Dispatcher perThreadDispatchQueue() {
        return new PerThreadQueuedDispatcher();
    }

    public abstract void dispatch(Object obj, Iterator<Subscriber> it2);
}
