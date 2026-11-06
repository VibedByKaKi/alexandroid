package com.amazon.alexa.biloba.view.alertsv2.devices;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.model.Device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceConfigurationViewItemModel {
    private static final String TAG = "DeviceConfigurationViewItemModel";
    private final Device device;

    public DeviceConfigurationViewItemModel(@NonNull Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getDeviceName() {
        return this.device.getName();
    }
}
