package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class LiveViewControllerEventSenderContext extends EventSenderContext {
    protected static final String LVC_CAPABILITY_INTERFACE_NAME = "Alexa.Camera.LiveViewController";

    @Nullable
    protected final String manufacturerName;

    public LiveViewControllerEventSenderContext(@Nullable String str) {
        this.manufacturerName = str;
    }

    public String getManufacturerName() {
        return this.manufacturerName;
    }
}
