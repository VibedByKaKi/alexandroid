package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.device.DeviceType;
import com.amazon.alexa.client.alexaservice.base.device.FirmwareVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MetroIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @VisibleForTesting
    static final String METRO_PACKAGE_NAME = "com.amazon.dee.app";
    private static final String TAG = "MetroIOComponentsStateProvider";
    private final PackageManager packageManager;

    public MetroIOComponentsStateProvider(String str, PackageManager packageManager, DeviceType deviceType) {
        super(str, deviceType, "com.amazon.dee.app");
        this.packageManager = packageManager;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.DeviceIOComponentsStateProvider
    public FirmwareVersion getFirmwareVersion() {
        try {
            return FirmwareVersion.create(this.packageManager.getPackageInfo("com.amazon.dee.app", 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find package: com.amazon.dee.app", e);
            return FirmwareVersion.UNKNOWN;
        }
    }
}
