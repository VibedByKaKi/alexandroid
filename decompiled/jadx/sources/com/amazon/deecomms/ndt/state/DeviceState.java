package com.amazon.deecomms.ndt.state;

import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.enums.DropInAvailability;
import com.amazon.deecomms.ndt.model.DeviceModel;
import com.amazon.deecomms.ndt.model.DeviceStatusModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class DeviceState implements DeviceStateConditionsChecker {
    boolean canBeCalled;
    int deviceNameColor;
    int deviceStatusColor;
    String deviceStatusText;

    public final boolean isCanBeCalled() {
        return this.canBeCalled;
    }

    public final boolean isInThisState(@NonNull DeviceModel deviceModel) {
        return deviceModel.getDeviceStatus() != null && checkPreConditions(deviceModel) && checkMainCondition(deviceModel);
    }

    public boolean sanityCheckConditions(@NonNull DeviceModel deviceModel) {
        DeviceStatusModel deviceStatus = deviceModel.getDeviceStatus();
        return (!deviceStatus.isOnline() || deviceStatus.isInCall() || deviceStatus.isDnd() || deviceStatus.getDeviceDropInAvailability().equals(DropInAvailability.OFF) || !deviceStatus.isRegistered()) ? false : true;
    }

    public final void setTextAndColor(TextView textView, TextView textView2, DeviceModel deviceModel) {
        textView.setText(deviceModel.getDeviceName());
        textView2.setText(this.deviceStatusText);
        textView.setTextColor(this.deviceNameColor);
        textView2.setTextColor(this.deviceStatusColor);
    }
}
