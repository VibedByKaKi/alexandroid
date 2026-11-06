package com.amazon.alexa.client.alexaservice.base.interactions;

import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VisualInteractionLifecycle extends InteractionLifecycle {
    private static final String TAG = "VisualInteractionLifecycle";
    private final VisualInteraction interaction;

    public VisualInteractionLifecycle(VisualInteraction visualInteraction) {
        this(visualInteraction, ManagedExecutorFactory.newSingleThreadExecutor("interaction-" + visualInteraction.getInteractionIdentifier().value()));
    }

    public VisualInteractionLifecycle(VisualInteraction visualInteraction, ExecutorService executorService) {
        super(visualInteraction, executorService);
        this.interaction = visualInteraction;
    }
}
