package com.amazon.matter.app;

import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;
import com.amazon.matter.commission.SystemCommissioningClient;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ActivityLifecycleObserver implements MainActivityLifecycleObserver {
    private final SystemCommissioningClient systemCommissioningClient;

    @Inject
    public ActivityLifecycleObserver(SystemCommissioningClient systemCommissioningClient) {
        this.systemCommissioningClient = systemCommissioningClient;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStart() {
        this.systemCommissioningClient.suppressSystemCommissioningOverlay();
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityCreated() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityDestroy() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityPause() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityResume() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStop() {
    }
}
