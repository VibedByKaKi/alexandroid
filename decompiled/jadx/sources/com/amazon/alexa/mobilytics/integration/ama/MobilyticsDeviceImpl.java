package com.amazon.alexa.mobilytics.integration.ama;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.device.api.DeviceInformationException;
import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsDeviceImpl implements MobilyticsDevice {
    private final DeviceInformation deviceInformation;

    public MobilyticsDeviceImpl(@NonNull DeviceInformation deviceInformation) {
        this.deviceInformation = deviceInformation;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    @NonNull
    public String deviceSerialNumber() {
        try {
            DeviceInformation deviceInformation = this.deviceInformation;
            if (deviceInformation != null && deviceInformation.getDeviceSerialNumber() != null && !this.deviceInformation.getDeviceSerialNumber().isEmpty()) {
                return this.deviceInformation.getDeviceSerialNumber();
            }
        } catch (DeviceInformationException unused) {
        }
        return "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    @NonNull
    public String deviceType() {
        try {
            DeviceInformation deviceInformation = this.deviceInformation;
            if (deviceInformation != null && !TextUtils.isEmpty(deviceInformation.getDeviceType())) {
                return this.deviceInformation.getDeviceType();
            }
        } catch (DeviceInformationException unused) {
        }
        return "Unknown";
    }
}
