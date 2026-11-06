package com.amazon.alexa.alertsca;

import android.util.Log;
import com.amazon.alexa.alertsca.events.Event;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertsEventBus {
    private static final String executorName = "alerts-event-bus";
    private static final String tag = "AlertsEventBus";
    protected final EventBus eventBus;
    private final ExecutorService executor = ManagedExecutorFactory.newSingleThreadExecutor(executorName, ManagedExecutorFactory.Group.EVENT_BUS);

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
            this.eventBus.postSticky(this.event);
        }
    }

    @Inject
    public AlertsEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void post(Event event) {
        if (event == null) {
            Log.w(tag, "Event to be posted is null");
        } else {
            event.toString();
            this.executor.submit(new PostAsyncRunnable(this.eventBus, event));
        }
    }

    public void postSticky(Event event) {
        if (event == null) {
            Log.w(tag, "Event to be posted is null");
        } else {
            event.toString();
            this.executor.submit(new PostStickyAsyncRunnable(this.eventBus, event));
        }
    }

    public void register(Object obj) {
        if (obj != null) {
            this.eventBus.register(obj);
        } else {
            Log.w(tag, "Can't register a null subscriber");
        }
    }

    public void unregister(Object obj) {
        if (obj != null) {
            this.eventBus.unregister(obj);
        } else {
            Log.w(tag, "Can't unregister a null subscriber");
        }
    }
}
