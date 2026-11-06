package com.amazon.deecomms.calling.incallexperiences.actions.runnables;

import com.amazon.deecomms.calling.incallexperiences.model.ApplicationAction;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class ApplicationActionsRunnable implements Runnable {
    protected List<ApplicationAction> applicationActions;

    public void run(List<ApplicationAction> list) {
        this.applicationActions = list;
        run();
    }
}
