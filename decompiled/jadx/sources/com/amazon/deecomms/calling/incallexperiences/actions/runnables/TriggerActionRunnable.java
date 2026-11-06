package com.amazon.deecomms.calling.incallexperiences.actions.runnables;

import com.amazon.deecomms.calling.incallexperiences.model.TriggerActionResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class TriggerActionRunnable implements Runnable {
    protected TriggerActionResponse.TriggerStatusCode statusCode;

    public void run(TriggerActionResponse.TriggerStatusCode triggerStatusCode) {
        this.statusCode = triggerStatusCode;
        run();
    }
}
