package com.amazon.alexa.app.notification.nc;

import com.amazon.alexa.app.notification.nc.server.ApplicationId;
import com.amazon.alexa.device.api.DeviceInformation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface PlatformSpecificProtocol {
    default ApplicationId getApplicationId(DeviceInformation deviceInformation) {
        return ApplicationId.fromPlatformType(deviceInformation.getPlatformType());
    }
}
