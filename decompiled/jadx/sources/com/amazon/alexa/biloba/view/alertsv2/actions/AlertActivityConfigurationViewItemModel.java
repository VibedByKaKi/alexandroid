package com.amazon.alexa.biloba.view.alertsv2.actions;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.model.DeviceAction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertActivityConfigurationViewItemModel {
    private final DeviceAction deviceAction;

    public AlertActivityConfigurationViewItemModel(@NonNull DeviceAction deviceAction) {
        this.deviceAction = deviceAction;
    }

    public DeviceAction getAlertActivity() {
        return this.deviceAction;
    }

    public String getAlertActivityName() {
        return this.deviceAction.getDisplayName();
    }
}
