package com.amazon.alexa.smarthomecameras.dependencies.components;

import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SmartAlertEventComponentProvider {
    private static SmartAlertEventComponent eventComponent;

    @Nullable
    public static synchronized SmartAlertEventComponent getSmartAlertEventComponent() {
        SmartAlertEventComponent smartAlertEventComponent;
        synchronized (SmartAlertEventComponentProvider.class) {
            smartAlertEventComponent = eventComponent;
        }
        return smartAlertEventComponent;
    }

    public static synchronized void reset() {
        synchronized (SmartAlertEventComponentProvider.class) {
            eventComponent = null;
        }
    }

    public static synchronized void setSmartAlertEventComponent(SmartAlertEventComponent smartAlertEventComponent) {
        synchronized (SmartAlertEventComponentProvider.class) {
            Preconditions.checkNotNull(smartAlertEventComponent, "SmartAlertEventComponent cannot be null");
            eventComponent = smartAlertEventComponent;
        }
    }
}
