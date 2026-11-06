package com.amazon.alexa.accessory;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class AccessoryCapability {
    private final AtomicBoolean initialized = new AtomicBoolean();

    public final void dispose(AccessoryDescriptor accessoryDescriptor) {
        if (this.initialized.compareAndSet(true, false)) {
            onDispose(accessoryDescriptor);
        }
    }

    public final void initialize(AccessoryDescriptor accessoryDescriptor) {
        if (this.initialized.compareAndSet(false, true)) {
            onInitialize(accessoryDescriptor);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("A capability is already initialized!");
        }
    }

    public boolean isInitialized() {
        return this.initialized.get();
    }

    public void onDispose(AccessoryDescriptor accessoryDescriptor) {
    }

    public void onInitialize(AccessoryDescriptor accessoryDescriptor) {
    }
}
