package com.amazon.alexa.client.alexaservice.base.interactions;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InteractionLifecycle {
    private static final String TAG = "InteractionLifecycle";
    private Interaction interaction;
    private final ExecutorService interactionExecutor;
    protected InteractionState interactionState = InteractionState.UNINITIALIZED;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InteractionState {
        UNINITIALIZED,
        FOREGROUND,
        BACKGROUND,
        SCHEDULED,
        PAUSED,
        STOPPED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StopTask implements Runnable {
        public StopTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionLifecycle.this.interaction.onStop();
        }
    }

    public InteractionLifecycle(Interaction interaction, ExecutorService executorService) {
        this.interaction = interaction;
        this.interactionExecutor = executorService;
    }

    public InteractionIdentifier getInteractionIdentifier() {
        return this.interaction.getInteractionIdentifier();
    }

    public InteractionInterfaceName getInteractionInterfaceName() {
        return this.interaction.getInterfaceName();
    }

    public boolean isStopped() {
        return this.interactionState == InteractionState.STOPPED;
    }

    public boolean isUninitialized() {
        return this.interactionState == InteractionState.UNINITIALIZED;
    }

    public void stop() {
        if (isStopped()) {
            return;
        }
        this.interactionState = InteractionState.STOPPED;
        submitLifecycleTask(new StopTask());
    }

    public void submitLifecycleTask(Runnable runnable) {
        ExecutorService executorService = this.interactionExecutor;
        if (executorService != null) {
            executorService.submit(runnable);
        } else {
            runnable.run();
        }
    }
}
