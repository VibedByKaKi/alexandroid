package com.amazon.alexa.client.alexaservice.base.device;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.utils.device.FireTabletUtils;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DeviceInformationProvider {
    public static final String VOX_ANDROID_DEVICE_TYPE = "A2TF17PFR55MTB";
    private final AuthorizationAuthority authorizationAuthority;
    private final Context context;

    @Inject
    public DeviceInformationProvider(Context context, AuthorizationAuthority authorizationAuthority) {
        this.context = context;
        this.authorizationAuthority = authorizationAuthority;
    }

    public static String getDeviceType(Context context) {
        DeviceInformation supportedDeviceInformation = DeviceTypeInformationProvider.getInstance(context).getSupportedDeviceInformation(context);
        return (supportedDeviceInformation == null || !AMPDInformationProvider.getInstance(context).isHandsFreeCapable()) ? "A2TF17PFR55MTB" : supportedDeviceInformation.getType();
    }

    public String getDeviceSerialNumber() {
        if (FireTabletUtils.isFireOS()) {
            return this.authorizationAuthority.getDeviceSerialNumber();
        }
        return null;
    }

    public String getDeviceType() {
        return getDeviceType(this.context);
    }
}
