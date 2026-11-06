package com.amazon.alexa.client.alexaservice.base.interactions;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannels;
import com.amazon.alexa.client.alexaservice.base.interactions.events.FinishVisualInteractionEvent;
import com.amazon.alexa.client.alexaservice.base.interactions.events.ScheduleVisualInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VisualInteractionScheduler {
    private static final String TAG = "VisualInteractionScheduler";
    private final VisualChannels channels;
    private final AlexaClientEventBus eventBus;
    private final ExecutorService executor;
    private final InteractionLifecycleFactory interactionLifecycleFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class FinishVisualInteractionTask implements Runnable {
        private final FinishVisualInteractionEvent event;

        public FinishVisualInteractionTask(FinishVisualInteractionEvent finishVisualInteractionEvent) {
            this.event = finishVisualInteractionEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionIdentifier interactionIdentifier = this.event.getInteractionIdentifier();
            Objects.toString(interactionIdentifier);
            VisualInteractionScheduler.this.removeInteraction(interactionIdentifier);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ScheduleVisualInteractionTask implements Runnable {
        private final ScheduleVisualInteractionEvent event;

        public ScheduleVisualInteractionTask(ScheduleVisualInteractionEvent scheduleVisualInteractionEvent) {
            this.event = scheduleVisualInteractionEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionIdentifier interactionIdentifier = this.event.getInteraction().getInteractionIdentifier();
            Objects.toString(interactionIdentifier);
            boolean contains = VisualInteractionScheduler.this.channels.contains(interactionIdentifier);
            ScheduleVisualInteractionEvent scheduleVisualInteractionEvent = this.event;
            if (contains) {
                Log.w(VisualInteractionScheduler.TAG, "Attempted to schedule an interaction which has already been scheduled: " + scheduleVisualInteractionEvent.getInteraction());
                return;
            }
            VisualChannelType channelType = scheduleVisualInteractionEvent.getChannelType();
            VisualInteractionLifecycle createVisualInteractionLifecycleWrapper = VisualInteractionScheduler.this.interactionLifecycleFactory.createVisualInteractionLifecycleWrapper(this.event.getInteraction());
            boolean isEmpty = VisualInteractionScheduler.this.channels.isEmpty();
            VisualInteractionScheduler visualInteractionScheduler = VisualInteractionScheduler.this;
            if (isEmpty) {
                visualInteractionScheduler.channels.add(channelType, createVisualInteractionLifecycleWrapper);
                return;
            }
            VisualInteractionLifecycle peek = visualInteractionScheduler.channels.peek();
            VisualInteractionScheduler.this.channels.add(channelType, createVisualInteractionLifecycleWrapper);
            if (peek.equals(VisualInteractionScheduler.this.channels.peek())) {
                return;
            }
            peek.stop();
        }
    }

    @Inject
    public VisualInteractionScheduler(VisualChannels visualChannels, AlexaClientEventBus alexaClientEventBus) {
        this(visualChannels, alexaClientEventBus, new InteractionLifecycleFactory(), ExecutorFactory.newSingleThreadExecutor("interaction-scheduler"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInteraction(InteractionIdentifier interactionIdentifier) {
        if (this.channels.contains(interactionIdentifier)) {
            this.channels.peek();
            this.channels.remove(interactionIdentifier);
        } else {
            Log.w(TAG, "Attempted to unschedule an interaction which has not been scheduled: " + interactionIdentifier);
        }
    }

    @Subscribe
    public void on(ScheduleVisualInteractionEvent scheduleVisualInteractionEvent) {
        this.executor.submit(new ScheduleVisualInteractionTask(scheduleVisualInteractionEvent));
    }

    public void onLogOut() {
        this.executor.submit(new LogOutTask(this, 0));
    }

    public void teardown() {
        this.executor.submit(new TeardownTask(this, 0));
        this.executor.shutdown();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogOutTask implements Runnable {
        private LogOutTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualInteractionScheduler.this.channels.clear();
        }

        public /* synthetic */ LogOutTask(VisualInteractionScheduler visualInteractionScheduler, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class TeardownTask implements Runnable {
        private TeardownTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualInteractionScheduler.this.channels.stopAllChannels();
            VisualInteractionScheduler.this.channels.clear();
        }

        public /* synthetic */ TeardownTask(VisualInteractionScheduler visualInteractionScheduler, int i) {
            this();
        }
    }

    @Subscribe
    public void on(FinishVisualInteractionEvent finishVisualInteractionEvent) {
        this.executor.submit(new FinishVisualInteractionTask(finishVisualInteractionEvent));
    }

    @VisibleForTesting
    public VisualInteractionScheduler(VisualChannels visualChannels, AlexaClientEventBus alexaClientEventBus, InteractionLifecycleFactory interactionLifecycleFactory, ExecutorService executorService) {
        this.channels = visualChannels;
        this.eventBus = alexaClientEventBus;
        this.interactionLifecycleFactory = interactionLifecycleFactory;
        this.executor = executorService;
        alexaClientEventBus.register(this);
    }
}
