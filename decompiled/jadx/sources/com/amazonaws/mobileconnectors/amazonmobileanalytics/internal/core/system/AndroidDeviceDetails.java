package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class AndroidDeviceDetails implements DeviceDetails {
    private final String carrier;

    public AndroidDeviceDetails(String str) {
        this.carrier = str;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public String carrier() {
        return this.carrier;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public Locale locale() {
        return Locale.getDefault();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public String manufacturer() {
        return Build.MANUFACTURER;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public String model() {
        return Build.MODEL;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public String platform() {
        return "ANDROID";
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails
    public String platformVersion() {
        return Build.VERSION.RELEASE;
    }
}
