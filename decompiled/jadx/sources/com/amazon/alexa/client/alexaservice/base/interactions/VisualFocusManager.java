package com.amazon.alexa.client.alexaservice.base.interactions;

import android.util.Log;
import com.amazon.alexa.api.AlexaVisualTask;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import com.amazon.alexa.client.alexaservice.base.interactions.events.FinishVisualInteractionEvent;
import com.amazon.alexa.client.alexaservice.base.interactions.events.ScheduleVisualInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VisualFocusManager {
    private static final String TAG = "VisualFocusManager";
    private VisualTaskInteraction currentVisualTaskInteraction;
    private final AlexaClientEventBus eventBus;

    @Inject
    public VisualFocusManager(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onInteractionStopped(VisualTaskInteraction visualTaskInteraction) {
        if (this.currentVisualTaskInteraction == visualTaskInteraction) {
            this.currentVisualTaskInteraction = null;
        }
    }

    @Subscribe
    public synchronized void schedule(ApiCallEvent.VisualTask.ScheduleVisualTaskEvent scheduleVisualTaskEvent) {
        String str = TAG;
        AlexaVisualTask alexaVisualTask = scheduleVisualTaskEvent.getAlexaVisualTask();
        String taskComponentName = alexaVisualTask.getTaskComponentName();
        if (taskComponentName == null || taskComponentName.isEmpty()) {
            Log.w(str, "Unable to schedule visual task with empty task component name");
        } else {
            VisualTaskInteraction visualTaskInteraction = this.currentVisualTaskInteraction;
            if (visualTaskInteraction != null && visualTaskInteraction.isFor(taskComponentName)) {
                return;
            }
            VisualTaskInteraction visualTaskInteraction2 = new VisualTaskInteraction(this, taskComponentName, alexaVisualTask, 0);
            this.currentVisualTaskInteraction = visualTaskInteraction2;
            this.eventBus.post(ScheduleVisualInteractionEvent.create(VisualChannelType.DIALOG_UI, visualTaskInteraction2));
        }
    }

    @Subscribe
    public synchronized void unschedule(ApiCallEvent.VisualTask.UnscheduleVisualTaskEvent unscheduleVisualTaskEvent) {
        try {
            String str = TAG;
            String taskComponentName = unscheduleVisualTaskEvent.getAlexaVisualTask().getTaskComponentName();
            VisualTaskInteraction visualTaskInteraction = this.currentVisualTaskInteraction;
            if (visualTaskInteraction == null || !visualTaskInteraction.isFor(taskComponentName)) {
                Log.w(str, "Unable to unschedule visual task as it does not hold visual focus, task component name " + taskComponentName);
            } else {
                Objects.toString(this.currentVisualTaskInteraction.interactionInterfaceName);
                this.eventBus.post(FinishVisualInteractionEvent.create(this.currentVisualTaskInteraction.getInteractionIdentifier()));
                this.currentVisualTaskInteraction = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class VisualTaskInteraction extends VisualInteraction {
        private final AlexaVisualTask alexaVisualTask;
        private final InteractionInterfaceName interactionInterfaceName;

        private VisualTaskInteraction(String str, AlexaVisualTask alexaVisualTask) {
            this.interactionInterfaceName = InteractionInterfaceName.create(str);
            this.alexaVisualTask = alexaVisualTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isFor(String str) {
            return this.interactionInterfaceName.getValue().equals(str);
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
        public InteractionInterfaceName getInterfaceName() {
            return this.interactionInterfaceName;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
        public void onStop() {
            Objects.toString(this.interactionInterfaceName);
            VisualFocusManager.this.onInteractionStopped(this);
            this.alexaVisualTask.onStop();
        }

        public /* synthetic */ VisualTaskInteraction(VisualFocusManager visualFocusManager, String str, AlexaVisualTask alexaVisualTask, int i) {
            this(str, alexaVisualTask);
        }
    }
}
