package com.amazon.alexa.client.alexaservice.eventing;

import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import javax.inject.Inject;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AsynchronousAlexaClientEventBus extends AlexaClientEventBus {
    private static final String EXECUTOR_NAME = "event-bus";
    private static final String TAG = "AsynchronousAlexaClientEventBus";
    private final ExecutorService executor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EventWaiter<T extends Event> {
        private final Predicate<T> condition;
        private final Class<T> eventType;
        private final CountDownLatch latch = new CountDownLatch(1);
        private T receivedEvent;

        public EventWaiter(Class<T> cls, Predicate<T> predicate) {
            this.eventType = cls;
            this.condition = predicate;
        }

        @Subscribe
        public void onEvent(Event event) {
            if (this.eventType.isInstance(event)) {
                T cast = this.eventType.cast(event);
                if (this.condition.test(cast)) {
                    this.receivedEvent = cast;
                    this.latch.countDown();
                }
            }
        }

        public T waitForEvent(long j) throws InterruptedException {
            if (this.latch.await(j, TimeUnit.MILLISECONDS)) {
                return this.receivedEvent;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PostAsyncRunnable implements Runnable {
        private final Object event;
        private final EventBus eventBus;

        public PostAsyncRunnable(EventBus eventBus, Event event) {
            this.eventBus = eventBus;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.toString(this.event);
            this.eventBus.post(this.event);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PostStickyAsyncRunnable implements Runnable {
        private final Object event;
        private final EventBus eventBus;

        public PostStickyAsyncRunnable(EventBus eventBus, Event event) {
            this.eventBus = eventBus;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.toString(this.event);
            this.eventBus.postSticky(this.event);
        }
    }

    @Inject
    public AsynchronousAlexaClientEventBus(EventBus eventBus, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        super(eventBus, featureFlagConfigurationAuthority);
        this.executor = ManagedExecutorFactory.newSingleThreadExecutor(EXECUTOR_NAME, ManagedExecutorFactory.Group.EVENT_BUS);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus
    public void doPost(Event event) {
        this.executor.submit(new PostAsyncRunnable(this.eventBus, event));
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus
    public void doPostSticky(Event event) {
        this.executor.submit(new PostStickyAsyncRunnable(this.eventBus, event));
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus
    public <T extends Event> T waitForEvent(Class<T> cls, Predicate<T> predicate, long j, boolean z) throws InterruptedException {
        EventWaiter eventWaiter = new EventWaiter(cls, predicate);
        register(eventWaiter);
        if (z) {
            try {
                T t = (T) this.eventBus.getStickyEvent(cls);
                if (t != null && predicate.test(t)) {
                    return t;
                }
            } finally {
                unregister(eventWaiter);
            }
        }
        return (T) eventWaiter.waitForEvent(j);
    }
}
